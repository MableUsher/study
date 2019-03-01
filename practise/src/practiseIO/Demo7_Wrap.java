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
		//获取被装饰类的引用
		private Man m;
		//在构造方法中传入被装饰类的对象
		public Superman(Man m) {
			this.m = m;
		}
		//对原有功能进行升级
		@Override
		public void skill() {
			// TODO Auto-generated method stub
			m.skill();
			System.out.println("i can fly");
		}
		
	}

