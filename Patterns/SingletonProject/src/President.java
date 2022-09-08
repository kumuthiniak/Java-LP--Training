
public class President {
	
	    private static volatile President president;
	    private President() {

	        if (president != null) {
	            throw new RuntimeException("New President ");
	        }
	    }

	    public static President getPresident() {
	        if (president == null) {
	           
	            synchronized (President.class) {
	            	president = new President();
	            }
	        }
	        return president;
	    }


}
