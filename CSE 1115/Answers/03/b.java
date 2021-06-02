try{
	riskyMethod();
}catch(ArrayIndexOutOfBoundsException e){
	System.out.println(e);
}catch(Exception e){
	System.out.println(e);
}

// All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.
// Exception is the most general catch block, so it should have been placed at the last.