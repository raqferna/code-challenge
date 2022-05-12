package com.seatchallenge.mower.domain;

public enum MowerCommand {
	
	L {
		@Override
		public void executeCommand(Mower mower) {
		mower.rotateLeft();
			
		}
	}, R {
		@Override
		public void executeCommand(Mower mower) {
			mower.rotateRigth();
			
		}
	} , M {
		@Override
		public void executeCommand(Mower mower) {
			mower.forward();
			
		}
	};

	public abstract void executeCommand(Mower mower);

	public static MowerCommand commandOf(String command) {
		 for (MowerCommand e : values()) {
		        if (e.name().equals(command)) {
		            return e;
		        }
		    }
		 throw new IllegalArgumentException("Invalid Value.");
	}

}
