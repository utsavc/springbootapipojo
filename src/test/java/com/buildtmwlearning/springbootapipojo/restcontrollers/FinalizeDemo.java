class FinalizeDemo{
	protected void finalize(){
		FinalizeDemo f=new FinalizeDemo();
	}
	public static void main(String[] args) {
		FinalizeDemo f= new FinalizeDemo();
		f=null;
	}
}