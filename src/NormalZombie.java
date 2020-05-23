public class NormalZombie implements Zombie {
    public int coordX;
    public int coordY;
    @Override
    public void spawn(int x, int y) {
        coordX = x;
        coordY = y;
    }

    @Override
    public String getType() {
        return "Normal";
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
