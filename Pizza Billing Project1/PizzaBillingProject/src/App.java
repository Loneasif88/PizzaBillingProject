import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===========Welcome to Accio Pizza!=========");

        Boolean isVeg = false;
        Boolean isExtraTopings = false;
        Boolean isExtraCheese = false;
        Boolean isTakeAwayBag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want any order for Pizza \n Press 1 -> YES \n Press 0 -> NO");
        int you_want_order = sc.nextInt();

        if(you_want_order == 1){ //confriming that if you want order or not

            Methods pizza;

            System.out.println("We have Two types of Pizza Veg Pizza and Non-Veg Pizza ");
            System.out.println("Can you please tell which type you want \n Press 1: Veg \n Press 0: Non-Veg ");
            int PizzaType = sc.nextInt();
            String whichPizza = "";
            if(PizzaType ==1){
                whichPizza = "Veg Pizza";
            }
            else{
                whichPizza = "Non-Veg Pizza";
            }

            System.out.println("In "+whichPizza+" You have 3 Sizes  ==Small, Medium and Large size==");
            System.out.println("Confrim Your Pizza Size\n Press 0: Small Size \n Press 1: Medium Size \n Press 2: Large Size ");
            int s = sc.nextInt();

            if(PizzaType == 1){
                isVeg = true;
                pizza = new Methods(isVeg,s);
                //pizza.size = s;
                }
            else{
                pizza = new Methods(isVeg,s);
                //pizza.size = s;
            }

            System.out.println("Do you want ExtraTopings \n Press 1: YES \n Press 0: NO  ");
            int top = sc.nextInt();
            if(top == 1){
                isExtraTopings = true;
                pizza.extraTopings(isExtraTopings);
            }

            System.out.println("Do you want ExtraCheese \n Press 1: YES \n Press 0: NO  ");
            int cheese = sc.nextInt();
            if(cheese == 1){
                isExtraCheese = true;
                pizza.extraCheese(isExtraCheese);
            }

            System.out.println("Do you want A Carry Bag \n Press 1: YES \n Press 0: NO ");
            int bag = sc.nextInt();
            if(bag == 1){
                isTakeAwayBag = true;
                pizza.takeAwayBag(isTakeAwayBag);
            }

            System.out.println("=================================");
            System.out.println("============PIZZA BILL===========");
            pizza.totalBill();
        }
        else{
            System.out.println("Thank You for Visiting Accio Pizza");
        }
        
    }
}
