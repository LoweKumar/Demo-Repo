package composition;

import composition.laptop.laptop;
import composition.laptop.components.Processors;

public class Hello {

	public static void main(String[] args) {
		//laptop lappy=new laptop();
		//System.out.println(lappy);
		//System.out.println(lappy.getProcessor().getBrands());
		
		Processors processor= new Processors("intel","10th Series");
		laptop gaminglaptop = new laptop("slim",processor,"16gb");
		System.out.println(gaminglaptop);
	}

}
