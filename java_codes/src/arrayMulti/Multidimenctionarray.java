package arrayMulti;

public class Multidimenctionarray {

	public static void main(String[] args) {
		
		int myarray[][]  = new int[3][3];
		
		//adding rendom values to the array 
		for(int i = 0;i<3;i++){
			for(int j = 0; j<3;j++) {
				myarray[i][j]= (int)(Math.random()*10);
				System.out.print(myarray[i][j]);
			}
			System.out.println("");
		}
	}

}
