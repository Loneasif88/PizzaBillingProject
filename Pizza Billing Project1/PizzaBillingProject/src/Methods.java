public class Methods {
    public int BasePrice;
    public int ExtraTopings;
    public int ExtraCheese;
    public int TakeAwayBag;
    public int size;
    String bill;
    int Total = 0;

    // constructor
    public Methods(Boolean isVeg, int size){
        bill = "";
        if(isVeg){
            // if its veg Pizza then we have to choose size of the pizza
            this.size=size;
            bill += "====Your Order for Veg Pizza ====\n";
            switch (size) {
                case 0: this.BasePrice = 150;  
                    bill += "Price for Small size         : "+this.BasePrice+"\n";
                    
                    break;
                case 1: this.BasePrice = 200;
                    bill += "Price for Medium size        : "+this.BasePrice+"\n";
                    
                    break;
                case 2: this.BasePrice = 300;
                    bill += "Price for Large size         : "+this.BasePrice+"\n";
                    
                    break;
                default: System.out.println("Sorry this size is not a valid size we have only Small, Medium and Large size Pizza avialable");
                    break;
            }
        }
        else{
            bill += "***Your Order for Non-Veg Pizza***\n";
            
            switch (size) {
                case 0: this.BasePrice = 200;  
                    bill += "Price for Small size         : "+this.BasePrice+"\n";
                    
                    break;
                case 1: this.BasePrice = 300;
                    bill += "Price for Medium size        : "+this.BasePrice+"\n";
                    
                    break;
                case 2: this.BasePrice = 400;
                    bill += "Price for Large size         : "+this.BasePrice+"\n";
                    
                    break;
                default: System.out.println("Sorry this size is not a valid size we have only Small, Medium and Large size Pizza avialable");
                    break;
            }
        }
        Total += this.BasePrice;
        // this.ExtraTopings = 0;
        // this.ExtraCheese = 0;
        // this.TakeAwayBag = 0;

        //Total = this.BasePrice+this.ExtraTopings+this.ExtraCheese+this.TakeAwayBag;
        //bill += "Your Total Price is : "+Total+ "\n";
    }
       
    //boolean isExtraTopings;
    public void extraTopings(boolean isExtraTopings){
        if(isExtraTopings){
            this.ExtraTopings = 50;
            bill += "Price for Extra Topings      : "+ExtraTopings+"\n";
            //      "Price for Extra Topings      : "+ExtraTopings+"\n";
            Total += ExtraTopings;
        }
    }
    //boolean isExtraCheese;
    public void extraCheese(boolean isExtraCheese){
        if(isExtraCheese){
            this.ExtraCheese = 30;
            bill += "Price for Extra Cheese       : "+ExtraCheese+"\n";
            //      "Price for Extra Topings      : "+ExtraTopings+"\n";
            Total += ExtraCheese;
        }
    }
    public void takeAwayBag(boolean isTakeAwayBag){
        if(isTakeAwayBag){
            this.TakeAwayBag = 15;
            bill += "Price for The Carry Bag      : "+this.TakeAwayBag+"\n";
            //      "Price for Extra Topings      : "+ExtraTopings+"\n";
            Total += TakeAwayBag;
        }
    }
    public void totalBill(){
        System.out.print(this.bill);
        System.out.println("__________________________________");
        System.out.print("Your Total Price is          : "+this.Total+"\n\n");
        //               "Price for Extra Topings      : "+ExtraTopings+"\n";
    }
}
