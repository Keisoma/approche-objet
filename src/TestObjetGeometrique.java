public class TestObjetGeometrique {

    public static void main(String[] args) {


        ObjetGeometrique[] objets = new ObjetGeometrique[2];
        objets[0] = new Cercle(5);
        objets[1] = new Rectangle(5, 10);

        for (ObjetGeometrique i : objets
        ) {
            System.out.println(i.surface());
            System.out.println(i.perimetre());
        }
        {

        }


    }
}