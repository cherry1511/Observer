
public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		new PlusTenObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setstate(15);
	}

}
