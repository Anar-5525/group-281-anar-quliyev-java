package Homework_6;

public class Plane extends Vehicle implements IFlyable, Idrivable, IStopable {
	
    public Plane(String name) {
        super(name);
    }

    @Override
    public void fly() {}
    
    @Override
	public void stop() {}

	@Override
	public void drive() {}
    
}

