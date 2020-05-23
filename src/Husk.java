public class Husk implements Zombie {
    public int coordX;
    public int coordY;
    @Override
    public void spawn(int x, int y) {
        coordX = x;
        coordY = y;
    }

    @Override
    public String getType() {
        return "Husk";
    }

    @Override
    public int getX() {
        return coordX;
    }

    @Override
    public int getY() {
        return coordY;
    }

}
