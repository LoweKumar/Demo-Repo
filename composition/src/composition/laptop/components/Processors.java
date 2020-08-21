package composition.laptop.components;

public class Processors {
	
	private String brands;
	private String series;
	
	public Processors() {
		this.brands="HP";
		this.series="7th series";
		
		
	}

	public Processors(String brands, String series) {
		//super();
		this.brands = brands;
		this.series = series;
	}
	@Override
	public String toString() {
		return "Processors [brands=" + brands + ", series=" + series + "]";
	}

	public String getBrands() {
		return brands;
	}

	public String getSeries() {
		return series;
	}
}
