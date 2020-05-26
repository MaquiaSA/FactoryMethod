public class DesertBiome extends Biome{
    @Override
    public Zombie spawnZombie() {
        Zombie husk = new Husk();
        husk.spawn(randInt(biomeSizeX), randInt(biomeSizeY));
        System.out.println(husk.getType() + " Zombie is spawned in Desert Biome at (" + husk.getX() + "," + husk.getY() + ")");
        return husk;
    }

    public int randInt(int i) {
        return random.nextInt(i);
    }
}
