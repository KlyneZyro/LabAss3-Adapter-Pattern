package main;

public class DeviceManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop();
		Refrigerator refrigerator = new Refrigerator();
		SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
		
		PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
		PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
		PowerOutlet smartphoneChargerOutlet = new SmartphoneChargerAdapter(smartphoneCharger);
		
		laptopOutlet.plugIn();
		refrigeratorOutlet.plugIn();
		smartphoneChargerOutlet.plugIn();
		
		
	}

}
