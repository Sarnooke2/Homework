package LinkList;

	class Linklist{
		private Link first; // ref to first link on list
	//------------------------------------------------
		public Linklist()	//constructor
		{
			first = null ; 	// no links on list yet
		}
	//------------------------------------------------
		public void insertFirst(int id , double dd)
		{
			Link newLink = new Link(id,dd); //make new link
			newLink.next = first ;	// it points to old first link
			first = newLink	;// now first points to this
		}
	//------------------------------------------------
		public Link find(int key){		//find link with given key
		Link current = first ;				// (assumes non-empty list)
											//start at 'first'
		while(current.iData != key) {		//while no match,
			if(current.next == null)		//if end of list,
				return null ;				// didn't  find it
		
		else								//not end of list ,
			current = current.next ;		// go to next link
		}
		return current ;					// found it
		}
		public Link delete(int key)		//delete link with given key
		{			// (assumes non-empty list)
		Link current = first ;		// search for link
		Link previous = first ;
		while(current.iData != key)
		{
		if(current.next == null)
		return null ;			// go to next link
		else
		{
		previous = current ;		// go to next link
		current = current.next ;
		}
		}				 // found it
		if(current == first)			// if first link ,
		first = first.next ;			// chage first
		else 				// otherwise ,
		previous.next = current.next; 	// bypass it
		return current ;
		}
		//----------------------------------------------------------------------
		public void displayList() 	// display the list 
		{
			System.out.print("List (first --> last): ") ;
			Link current = first ; 	// start at begin of list
		while(current != null) 	// until end of list ,
		{
		current.displayLink(); 	// print data
		current = current.next ; 	// move to next link
		}
		System.out.println(" ");
		}
		//------------------------------------------------------------------------
		} // end class Linklist
