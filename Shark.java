public class Shark extends SeaCreature {

    private String symbol;

    public Shark(String name, int position, int speed, int direction, String symbol) {
        super(name, position, speed * 2, direction);
        this.symbol = symbol;
    }

    @Override
    public void move(int tankWidth) {
        int rand = (int) (Math.random() * 5);
        if(rand == 0){
            dart();
            position += 2 * speed * direction;
        }
        else{
            position += speed * direction;
        }
        
        keepInsideTank(tankWidth);
    }

    private void dart(){
        direction *= -1;
    }

    @Override
    public String getSymbol() {
        return direction >= 0 ? symbol : reverseSymbol(symbol);
    }

    private String reverseSymbol(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}