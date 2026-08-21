public class Turtle extends SeaCreature {

    private String symbol;

    public Turtle(String name, int position, int speed, int direction, String symbol) {
        super(name, position, speed, direction);
        this.symbol = symbol;
    }

    @Override
    public void move(int tankWidth) {
        int rand = (int) (Math.random() * 4);
        if(rand == 0){
            //does nothing, turtle stays in place
        }
        else{
            position += speed * direction;
        }
        keepInsideTank(tankWidth);
    }


    @Override
    public String getSymbol() {
        return direction >= 0 ? symbol : reverseSymbol(symbol);
    }

    private String reverseSymbol(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    
}
