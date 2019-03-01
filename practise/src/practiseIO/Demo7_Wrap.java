package practiseIO;

public class Demo7_Wrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superman sm = new Superman(new Man());
		sm.skill();
	}
}	
    interface Skills{
		public void skill();
	}
	class Man implements Skills {

		@Override
		public void skill() {
			// TODO Auto-generated method stub
			System.out.println("i can walk");
		}
		
	}
	class Superman implements Skills{
		//��ȡ��װ���������
		private Man m;
		//�ڹ��췽���д��뱻װ����Ķ���
		public Superman(Man m) {
			this.m = m;
		}
		//��ԭ�й��ܽ�������
		@Override
		public void skill() {
			// TODO Auto-generated method stub
			m.skill();
			System.out.println("i can fly");
		}
		
	}

