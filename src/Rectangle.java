public class Rectangle implements ObjetGeometrique{

    private double largeur;
    private double longueur;

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    @Override
    public double perimetre() {
        return 2*longueur + 2*largeur;
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }
}
