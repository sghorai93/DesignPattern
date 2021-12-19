package com.design.pattern.factory;

public class OperatingSystemFactory {

	public OperatingSystem getInstance(OSType osType) {
		switch (osType) {
		case WINDOWS:
			return new Windows();
		case MAC:
			return new Mac();
		case LINUX:
			return new Linux();
		default:
            throw new RuntimeException("Specify Object Type");
        }
	}

}
