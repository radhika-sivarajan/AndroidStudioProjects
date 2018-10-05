public class ConditionalStatements {
    public static void main(String[] args) {
    
        // If statemnet
        int age = 18;
        if (age == 18){
            System.out.println("User is 18");
        } else if (age >= 18){
            System.out.println("User is over 18");
        } else {
            System.out.println("User is under 18");
        }
        
        // Number checking
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
    }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  