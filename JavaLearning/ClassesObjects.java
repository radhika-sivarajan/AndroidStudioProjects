public class ClassesObjects {
    public static void main(String[] args) {
        class User{ // Class
            int score;
            public boolean hasWon(){ // Method
                if(score > 100){
                    return true;
                } else {
                    return false;
                }
            }
        } 
        
        User bob = new User(); //New instance
        bob.score = 1000;
        System.out.println("The user WON : " + bob.hasWon());
    }
  }