
class vehicle {
	public void honk(){System.out.println("Honk!!!!!!!!!!!!!");}
	public void startEngine(){System.out.println("BRuum BRuum.....");}
	public void stopEngine(){System.out.println("Engine Dead......");}

	
}
class fortuner extends vehicle{
	public void carName(){System.out.println("Fortuner");}
	public void carNumber(){System.out.println("KB64XE8528");}
	public void carBrand(){System.out.println("Toyota");}
}
class maruti extends vehicle{
	public void carName(){System.out.println("Maruti");}
	public void carNumber(){ String carNum = "LK47BC7852"; System.out.println(carNum); }
	public void carBrand(){String carLog = "Suzuki"; System.out.println(carLog);}
}


class object {
	public static void main(String[] args){
		System.out.println("Main class!");
		
		maruti ms = new maruti();
		fortuner ft = new fortuner();

		ft.carName();
		ms.carName();

		ft.carBrand();
		ms.carBrand();

		ft.carNumber();
		ms.carNumber();

		ft.honk();
		ms.honk();

		ft.startEngine();
		ms.startEngine();

		ft.stopEngine();
		ms.stopEngine();
		


	}
}




