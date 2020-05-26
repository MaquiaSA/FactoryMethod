public class PlainBiome extends Biome {

    @Override
    public Zombie spawnZombie() {
        Zombie normal = new NormalZombie();
        normal.spawn(randInt(biomeSizeX), randInt(biomeSizeY));
        System.out.println(normal.getType() + " Zombie is spawned in Plain Biome at (" + normal.getX() + "," + normal.getY() + ")");
        return normal;
    }

    public int randInt(int i) {
        return random.nextInt(i);
    }
}
