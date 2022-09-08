
public class Time {
	private String time;
	   
    public void set(String time) 
    {
        System.out.println("Setting time to " + time  + "\r");
        this.time = time;
    }
   
    public Memento saveToMemento() 
    {
        System.out.println("Saving time to Memento"  + "\r");
    
        return new Memento(time );
    }
   
    public void restoreFromMemento(Memento memento) 
    {
        time = memento.getSavedTime();
        System.out.println("Time restored from Memento: " + time + "\r");
    
    }
   
    public static class Memento 
    {
        private final String time;
   
        public Memento(String timeToSave) 
        {
            time = timeToSave;
        }
   
        public String getSavedTime() 
        {
            return time;
        }
    }
}
