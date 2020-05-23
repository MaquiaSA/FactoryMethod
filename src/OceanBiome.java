public class OceanBiome extends BiomeFactory {
    @Override
    public Zombie spawnZombie() {
        Zombie drown = new Drown();
        drown.spawn(randInt(biomeSizeX), randInt(biomeSizeY));
        System.out.println(drown.getType() + " Zombie is spawned in Ocean Biome at (" + drown.getX() + "," + drown.getY() + ")");
        return drown;
    }

    public int randInt(int i) {
        return random.nextInt(i);
    }
}
