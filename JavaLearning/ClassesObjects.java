public class ClassesObjects {
    public static void main(String[] args) {
        class User{
            int score;
            public boolean hasWon(){
                if(score > 100){
                    return true;
                } else {
                    return false;
                }
            }
        }
        
        User bob = new User();
        bob.score = 1000;
        System.out.println("The user WON : " + bob.hasWon());
    }
  }