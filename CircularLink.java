
/**
/* @author Mukya_Wongdaraphanich 5907101012  ยังไม่เสร็จดี ต้องแก้ตรงdisplay
*/
import java.util.*;
public class CircularLink {
	 protected Node start ;
	 protected Node end ;
	 public int size ;
	 
	 public CircularLink(){
		 start = null;
		 end = null;
		 size =0;
	 }
	public boolean isEmthy(){
		return start ==null;
	}
	 public int getSize(){
	        return size;
	    }
	    public void insertAtStart(int val){ //ก๊อปมาแต่เข้าใจนะ!!
	    	
	        Node nptr = new Node(val,null);    
	        nptr.setLink(start);
	        
	        if(start == null){            
	         start = nptr;
	         nptr.setLink(start);
	         end = start;            
	        }
	        else{
	            end.setLink(nptr);
	            start = nptr;        
	        }
	        size++ ;
	    }
	    public void deleteAtPos(int pos){    //นี่ก๊อปมาจริงจัง แต่เข้าใจวิธีการทำงาน
	    	
	        if (size == 1 && pos == 1){
	            start = null;
	            end = null;
	            size = 0;
	            return ;
	        }        
	        
	        if (pos == 1){
	            start = start.getLink();
	            end.setLink(start);
	            size--; 
	            return ;
	        }
	        
	        if (pos == size){
	            Node s = start;
	            Node t = start;
	            while (s != end)
	            {
	                t = s;
	                s = s.getLink();
	            }
	            end = t;
	            end.setLink(start);
	            size --;
	            return;
	        }
	        
	        Node ptr = start;
	        pos = pos - 1 ;
	        for (int i = 1; i < size - 1; i++) 
	        {
	            if (i == pos){
	            	
	                Node tmp = ptr.getLink();
	                tmp = tmp.getLink();
	                ptr.setLink(tmp);
	                break;
	                
	            }
	            ptr = ptr.getLink();
	        }
	        size-- ;
	    }
	    public void display() //ยังไม่เสร็จดีเพราะdisplayมั่ว
	    {
	        System.out.print("Data in this Circular Linklist is = ");
	        Node ptr = start;
	        if (size == 0){
	            System.out.print("empty\n");
	            return;
	        }
	        
	        if (start.getLink() == start) {
	            System.out.print(start.getData());
	            return;
	        }
	        
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != start) {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "->");
	        ptr = ptr.getLink();
	        System.out.print(ptr.getData()+ "\n");
	    }
	    
	    public static void main(String[]args){
	    	CircularLink list = new CircularLink();
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("please enter how many node you want");
	    	int n = input.nextInt();
	    	System.out.println("please enter how many time you want to jump before delete");
	    	int m = input.nextInt();
	    	
	    	for(int i =0;i<n;i++){
	    		list.insertAtStart(i);
	    	}
	    	
	    	for(int i =0;i<n;i++){
	    		if(list.getSize()!=1){
	    		list.deleteAtPos(m);
	    		}
	    	}
	    	System.out.println(list.isEmthy());
	    	System.out.println(list.getSize());
	    	list.display();
	    }
	}
