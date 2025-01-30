import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year to find out whether the year is leap year or not : ");
        int year = scanner.nextInt();

        if (isLeapyear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a not a Leap Year.");
        }
        scanner.close();
    }
        public static boolean isLeapyear(int year) {
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    else{
                        return false;
                    }
                    
                }
                return true;    
            }
            
      
    return false; 

        

}
}
    


