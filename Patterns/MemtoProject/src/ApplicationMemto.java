
import java.util.List;
import java.util.ArrayList;

public class ApplicationMemto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Time.Memento> savedTimes = new ArrayList<Time.Memento>();
		   
        Time time = new Time();
        time.set("1000 B.C.");
        
        savedTimes.add(time.saveToMemento());
        time.set("1000 A.D.");
        
        savedTimes.add(time.saveToMemento());
        time.set("2000 A.D.");
        
        savedTimes.add(time.saveToMemento());
        time.set("4000 A.D.");
   
        time.restoreFromMemento(savedTimes.get(0));   
   
    }
}
