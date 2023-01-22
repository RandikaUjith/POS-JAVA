public class Action{
    
    private String bcDisplay;

    public Action(){
    }

    public void getResponse(String s){
        if(s == "1" || s == "2" || s == "3" || s == "4" || s == "5" || s == "6" || s == "7" || s == "8" || s == "9" || s == "0" || s == "00" || s == "000"){
            bcDisplay = s;
        } else if(s == "Slush" || s == "Milk Shake" || s == "Snow Shock" || s == "HotChocolate" || s == "Ice Cream" || s == "Grocery" || s == "Alcohol" || s == "Lottery" || s == "PayPoint" || s == "VAPE" || s == "NEWS" || s == "Fruit/Veg"){
            bcDisplay = null;
        }
    }

    public String bcDisplay(){
        return bcDisplay;
    }
    
}
