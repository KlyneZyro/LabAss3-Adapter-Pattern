package main;

public class SmartphoneChargerAdapter implements PowerOutlet{
	SmartphoneCharger smartphoneCharger;
	
	public  SmartphoneChargerAdapter(SmartphoneCharger smartphoneCharger) {
		this.smartphoneCharger = smartphoneCharger;
	}
	@Override
	public void plugIn() {
		smartphoneCharger.chargePhone();	
	}

}
