package th.ac.utcc.cpe.sirawit;

public class generic<T>{
	private  Object[] element ;
	private  int eSize ;
	public generic(int size){
		if( size < 0 )
			this.element = new Object [size];
	else
		this.element = new Object [10];
		eSize = 0;
	}

	public <T> void insert(T i){
		this.element[eSize] = i ;
			eSize++ ;
	}

	public <T> void show(){
		for(int i = 0; i < eSize ; i++){
			System.out.print(this.element[i]+" // ");
		}
			System.out.println(" ");
	}

	public <T> void bubbleSort(){
		 int in , out ;
	for(out = (eSize-1); out> 0; out--){
		for(in  = 0 ; in< out; in++){
		  if(this.element[in]>element[out]){
				this.swap(in,in+1);
			}
		}
	}
}
	
	private <T> void swap(T left ,T right){
			T temp = null;
			 temp.equals(this.element[(int) right]);
			this.element[(int) right] = this.element[(int) left] ;
			this.element[(int) left] = temp ;

}

	public void main (String[] args){
		int max = 20 ;
		generic<T> bubble = new generic<T>(max);
				bubble.insert(878879879);
				bubble.insert(43);
				bubble.insert(true);
				bubble.insert('s');
				bubble.insert(91.00000);
				bubble.insert(78.13);
				bubble.insert(26.6844879546454);
				bubble.insert("Ssdasda");
	System.out.print("Original Order: ");
		bubble.show();
		bubble.bubbleSort();
	System.out.print("Sorted Order: ");
		bubble.show();
	}
}

