package practise2;

public class Chain {
public void fast() throws FastException{
	throw new FastException("̫����");
}
public void broken() {
	try {
		fast();
	} catch (FastException e) {
		// TODO Auto-generated catch block
		RuntimeException newExc = new RuntimeException("ײ����");
		newExc.initCause(e);
		throw newExc;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain a = new Chain();
		try {
			a.broken();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
