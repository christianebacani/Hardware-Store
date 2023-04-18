import java.util.Scanner;
public class HardwareStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {50,55,60,65,70,75,80,85};
        boolean sell = true;
        int total = 0;
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        while(sell){
        
        System.out.print("\n\t    AVAILABLE TOOLS\n\n");
        System.out.print("TOOLS\t\t\t\tPRICE\n\n");
        System.out.print("1.) Screw drivers\t\tP 50\n\n");
        System.out.print("2.) Sledgehammers\t\tP 55\n\n");
        System.out.print("3.) Snips & Shears\t\tP 60\n\n");
        System.out.print("4.) Sockets       \t\tP 65\n\n");
        System.out.print("5.) Staple guns   \t\tP 70\n\n");
        System.out.print("6.) Stud Finders  \t\tP 75\n\n");
        System.out.print("7.) Vises         \t\tP 80\n\n");
        System.out.print("8.) Wrenches      \t\tP 85\n\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        
        total += price[choice - 1] * quantity;
        
        System.out.print("Do you want to buy more ? (y/n): ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            sell = false;
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change : P " + change + "\n");
            System.out.print("\n\nTHANK YOU,PLEASE COME AGAIN!");
            
        }
        
        }
        
        
    }
}
