public class ConditionalStatements {
    public static void main(String[] args) {
        
        // If statemnet, Number checking
        int[] num = {8,5}; 
        
        if (num[0] == num[1]){
            System.out.println("Numbers are equal");
        } else if (num[0] > num[1]){
            System.out.println("First number is big");
        } else {
            System.out.println("Second number is big");
        }	

        // While loop, even numbers
        int x = 1;
		System.out.println("The even number between 1 to 10");
		while(x <= 5){
			System.out.println(2 * x);
			x++;
        }

        // For loop, Triangular number
        System.out.println("Triangular number upto 5");
		for(int i=1; i<=5; i++){
			int n = i*(i+1)/2;		
			System.out.println( n );
        }
        
        // While loop, Triangular number
        int j = 1;
		int triangularNumber = 1;
		while(j<=5){
			System.out.println(triangularNumber);
			j++;
			triangularNumber = triangularNumber + j;
        }
        
        // For loop, List array
        List<String> familyMembers = new ArrayList<String>();
		familyMembers.add("Albert");
		familyMembers.add("John");
		familyMembers.add("Sandy");
		familyMembers.add("Anna");
		for(String name:familyMembers){
			System.out.println(name);
		}
    }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  