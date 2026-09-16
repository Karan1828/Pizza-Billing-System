package projects;

public class DeluxaPizza extends Pizza {
	
	public DeluxaPizza(Boolean veg) {
		
		super(veg);
		super.addExtracheese();
		super.addExtraToppings();
		
		
	}
	
	@Override
	
	public void addExtracheese() {}
	
	
	@Override
	public void addExtraToppings() {}

	
	
	

}
