import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BiomeFactory> world = new ArrayList<BiomeFactory>();
        BiomeFactory plain = new PlainBiome();
        world.add(plain);
        BiomeFactory desert = new DesertBiome();
        world.add(desert);
        BiomeFactory ocean = new OceanBiome();
        world.add(ocean);

        for (BiomeFactory biome : world) {
            biome.setTime(15000);
            Zombie z = biome.createMob();
            if (z != null) System.out.println(z);
        }
    }
}
