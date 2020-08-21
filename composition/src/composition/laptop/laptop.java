package composition.laptop;

import composition.laptop.components.Processors;

public class laptop {
	private String screen;
	private Processors processor;
	private String ram;
	
	public laptop() {
		
		this.screen = "flat";
		this.processor = new Processors();
		this.ram = "15gb";
		
		
	}
	

	public laptop(String screen, Processors processor, String ram) {
		//super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + "]";
	}

	public Processors getProcessor() {
		return processor;
	}

	public String getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}
	
	

	
	
	
	
	
	

}
