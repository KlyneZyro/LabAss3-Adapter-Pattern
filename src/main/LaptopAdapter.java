package main;

public class LaptopAdapter implements PowerOutlet {
	Laptop laptop;

	public LaptopAdapter(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public void plugIn() {
		laptop.charge();
	}

}
