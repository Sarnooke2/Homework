package LinkList;

public class LinkCir {
	  public long data;
	  public Link next;

	  public LinkCir(long val) {
	    data = val;
	    next = null;
	  }

	  public void displayLink() {
	    System.out.print(data + " ");
	  }

	}  // end class