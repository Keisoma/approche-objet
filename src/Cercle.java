public class Cercle implements ObjetGeometrique{

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
       return 2*3.14*rayon;
    }

    @Override
    public double surface() {
        return 3.14*rayon*rayon;
    }
}
