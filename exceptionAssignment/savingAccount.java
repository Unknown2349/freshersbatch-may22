package com.exceptionAssignment;

@SuppressWarnings("serial")
class savingAccount extends Exception{
		String message;
		public savingAccount(String message) {
			this.message=message;
		}
		@Override
		public String toString() {
			return message;
		}
	}
	
