package Homework_6;

public class Jet extends Vehicle implements IFlyable, Idrivable, IStopable {
	
    public Jet(String name) {
        super(name);
    }

    @Override
    public void fly() {}

	@Override
	public void stop() {}

	@Override
	public void drive() {}
    
}*
