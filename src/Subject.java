import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> obs = new ArrayList <>();
	private int state;
	
	public int getstate(){
		return state;
	}
	public void setstate (int state){
		this.state = state;
		notifAllObserver();
	}
	public void attach (Observer observer){
		obs.add(observer);
	}
	private void notifAllObserver() {
		for (Observer observer : obs){
			observer.update(); 
		}
	}
}
