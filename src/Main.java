public class Main {
    public static void main(String[] args) {
        MueblesFactory factory = new MueblesModernosFactory();
        Silla silla = factory.crearSilla();
        Sofa sofa = factory.crearSofa();

        silla.sentarse();
        sofa.recostarse();
    }
}