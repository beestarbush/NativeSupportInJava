class NativeClass {

	public native void printText();
	
	static {
		System.loadLibrary("nativeclass");
	}

	public static void main(String[] args) {
		NativeClass nClass = new NativeClass();
		nClass.printText();
	}
}