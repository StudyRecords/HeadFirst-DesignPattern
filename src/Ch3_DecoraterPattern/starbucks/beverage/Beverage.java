package Ch3_DecoraterPattern.starbucks.beverage;

public abstract class Beverage {

    public enum Size{
        TALL("TALL "),
        GRANDE("GRANDE "),
        VENTI("VENTI ");

        private final String message;

        Size(String message) {
            this.message = message;
        }

        public String getMessage(){
            return message;
        }
    }
    Size size = Size.TALL;

    String description = "음료 이름";

//    public Beverage(String description){
//        this.description = description;
//    }

    public abstract int cost();

    public String getDescription(){
        return size.getMessage() + description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }
}
