package com.decorator.examples.eg3;

import java.util.Random;

public class TransactionChain {

	static public interface Transaction {
		void setNextTransaction(Transaction nextTxn);

		void setPreviousTransaction(Transaction prevTxn);

		void commit();

		void rollback();
	}

	static public class TransactionHandler implements Transaction {
		private String txnName;

		public TransactionHandler(String txnName) {
			this.txnName = txnName;
		}

		private Transaction next;
		private Transaction prev;

		@Override
		public void setNextTransaction(Transaction nextTxn) {
			this.next = nextTxn;
			nextTxn.setPreviousTransaction(this);
		}

		@Override
		public void setPreviousTransaction(Transaction prevTxn) {
			this.prev = prevTxn;

		}

		@Override
		public void commit() {
			try {
				System.out.println(txnName + " has committed");
				if (new Random().nextLong(5) > 3) {
					throw new RuntimeException("sql error");
				}
				if (this.next != null) {
					this.next.commit();
				}
			} catch (Exception e) {
				e.printStackTrace();
				rollback();
			}
		}

		@Override
		public void rollback() {
			System.err.println(txnName + " has rolledBack");
			if (this.prev != null) {
				this.prev.rollback();
			}
		}

	}

	public static void main(String[] args) {
		// initialize the chain
		TransactionHandler c1 = new TransactionHandler("C1");
		TransactionHandler c2 = new TransactionHandler("C2");
		TransactionHandler c3 = new TransactionHandler("C3");
		TransactionHandler c4 = new TransactionHandler("C4");
		TransactionHandler c5 = new TransactionHandler("C5");

		// set the chain of responsibility
		c1.setNextTransaction(c2);
		c2.setNextTransaction(c3);
		c3.setNextTransaction(c4);
		c4.setNextTransaction(c5);

		c1.commit();

	}

//	static public class ServiceA {
//		public void sayHello() {
//			System.out.println("Hello ServiceA");
//		};
//	}
//
//	static public class ServiceB {
//		public void sayHello() {
//			System.out.println("Hello ServiceB");
//		};
//	}
//
//	static public class ServiceC {
//		ServiceA a = new ServiceA();
//		ServiceB b = new ServiceB();
//
//		public void sayHello() {
//			a.sayHello();
//			b.sayHello();
//			System.out.println("Hello ServiceC");
//		};
//	}

}