import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;


public class Channel implements Subject {
	private Observer[] observers;
	private String channelName;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void registerObservers(Observer fan) {
		// TODO Auto-generated method stub
		int lastI = this.observers.length;
		this.observers = Arrays.copyOf(observers, this.observers.length +1);
		this.observers[lastI] = fan;
	}

	@Override
	public void removeObservers(Observer fan) {
		// TODO Auto-generated method stub
		List list = Arrays.asList(this.observers);
		list.remove(fan);
		this.observers = (Observer[]) list.toArray();
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.length;i++) {
			observers[i].update(this.status);
		}
	}
  
  
  
  
  
  
}


