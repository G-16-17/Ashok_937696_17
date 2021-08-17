package learn_abstractfactory;

public abstract class Tire {
	protected final String model;
	
	public Tire(String tireModel)
	{
		model = tireModel;
	}
	
	public String getTireModel()
	{
		return model;
	}
}
