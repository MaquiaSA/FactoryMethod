import java.util.Random;

public abstract class Biome {
    protected int biomeSizeX = 500;
    protected int biomeSizeY = 500;
    protected int time = 0;
    protected Random random = new Random();

    public Zombie createMob(){
        if ((time % 24000) > 13188){
            return spawnZombie();
        }
        return null;
    }
    public void setTime(int t){
        time = t;
    }

    public abstract Zombie spawnZombie();
}
