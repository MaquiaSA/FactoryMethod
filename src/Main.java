import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Biome> world = new ArrayList<Biome>();
        Biome plain = new PlainBiome();
        world.add(plain);
        Biome desert = new DesertBiome();
        world.add(desert);
        Biome ocean = new OceanBiome();
        world.add(ocean);

        for (Biome biome : world) {
            biome.setTime(15000);
            Zombie z = biome.createMob();
            if (z != null) System.out.println(z);
        }
    }
}
