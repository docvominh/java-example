package com.vominh.design.pattern.oop;

public class Enum {

	public static void main(String[] args) {
		System.out.println(Status.PENDING.getStatusCode());
		System.out.println(Status.ACTIVE.getStatusCode());
		System.out.println(Status.INACTIVE.getStatusCode());
		System.out.println(Status.DELETED.getStatusCode());

		System.out.println(StatusInt.PENDING.getStatusCode() * 10);
		System.out.println(StatusInt.ACTIVE.getStatusCode() * 10);
		System.out.println(StatusInt.INACTIVE.getStatusCode() * 10);
		System.out.println(StatusInt.DELETED.getStatusCode() * 10);

		System.out.println(twoValue.ONE.getStatusCodeInt() * 10);
		System.out.println(twoValue.ONE.getStatusCodeString());
		
		
		System.out.println(twoValue2.ONE.getStatusCodeInt() * 10);
		System.out.println(twoValue2.ONE.getStatusCodeString());

	}

	enum Status {
		PENDING("1"), ACTIVE("2"), INACTIVE("3"), DELETED("4");

		private String statusCode;

		private Status(String str) {
			statusCode = str;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

	enum StatusInt {
		PENDING(1), ACTIVE(2), INACTIVE(3), DELETED(4);

		private int statusCode;

		private StatusInt(int i) {
			statusCode = i;
		}

		public int getStatusCode() {
			return statusCode;
		}

	}

	enum twoValue {
		ONE(1, "1"), TWO(2, "2"), THREE(3, "3"), FOUR(4, "4");

		private int statusInt;
		private String statusString;

		private twoValue(int i, String str) {
			statusInt = i;
			statusString = str;
		}

		public int getStatusCodeInt() {
			return statusInt;
		}

		public String getStatusCodeString() {
			return statusString;
		}

	}

	enum twoValue2 {
		ONE("1", 1), TWO("2", 2), THREE("3", 3), FOUR("4", 4);

		private String statusString;
		private int statusInt;

		private twoValue2(String str, int i) {
			statusString = str;
			statusInt = i;

		}

		public String getStatusCodeString() {
			return statusString;
		}

		public int getStatusCodeInt() {
			return statusInt;
		}

	}

}
