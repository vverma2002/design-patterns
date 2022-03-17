package com.decorator.examples.eg2;

import java.util.Scanner;

public class CurrencyChain {

	static public class Currency {

		private int amount;

		public Currency(int amt) {
			this.amount = amt;
		}

		public int getAmount() {
			return this.amount;
		}
	}

	static public interface DispenseChain {

		void setNextChain(DispenseChain nextChain);

		void dispense(Currency cur);
	}

	static public class Dollar50Dispenser implements DispenseChain {

		private DispenseChain chain;

		@Override
		public void setNextChain(DispenseChain nextChain) {
			this.chain = nextChain;
		}

		@Override
		public void dispense(Currency cur) {
			if (cur.getAmount() >= 50) {
				int num = cur.getAmount() / 50;
				int remainder = cur.getAmount() % 50;
				System.out.println("Dispensing " + num + " 50$ note");
				if (remainder != 0)
					this.chain.dispense(new Currency(remainder));
			} else {
				this.chain.dispense(cur);
			}
		}

	}

	static class Dollar20Dispenser implements DispenseChain {

		private DispenseChain chain;

		@Override
		public void setNextChain(DispenseChain nextChain) {
			this.chain = nextChain;
		}

		@Override
		public void dispense(Currency cur) {
			if (cur.getAmount() >= 20) {
				int num = cur.getAmount() / 20;
				int remainder = cur.getAmount() % 20;
				System.out.println("Dispensing " + num + " 20$ note");
				if (remainder != 0)
					this.chain.dispense(new Currency(remainder));
			} else {
				this.chain.dispense(cur);
			}
		}

	}

	static public class Dollar10Dispenser implements DispenseChain {

		private DispenseChain chain;

		@Override
		public void setNextChain(DispenseChain nextChain) {
			this.chain = nextChain;
		}

		@Override
		public void dispense(Currency cur) {
			if (cur.getAmount() >= 10) {
				int num = cur.getAmount() / 10;
				int remainder = cur.getAmount() % 10;
				System.out.println("Dispensing " + num + " 10$ note");
				if (remainder != 0)
					this.chain.dispense(new Currency(remainder));
			} else {
				this.chain.dispense(cur);
			}
		}

	}

	public static void main(String[] args) {

		// initialize the chain
		DispenseChain c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);

		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");

				return;
			}
			// process the request
			c1.dispense(new Currency(amount));
		}

	}

}