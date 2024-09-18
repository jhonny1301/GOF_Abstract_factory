class MueblesModernosFactory implements MueblesFactory {
    public Silla crearSilla() {
        return new SillaModerna();
    }

    public Sofa crearSofa() {
        return new SofaModerno();
    }
}