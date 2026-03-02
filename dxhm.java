public final class dxhm implements lsk {
    @Override  // lsk
    public final lsb a(Class class0) {
        return lsi.b(class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        ibuq.f(class0, "modelClass");
        if(class0.isAssignableFrom(dxht.class)) {
            return new dxht();
        }
        throw new IllegalArgumentException(class0.getCanonicalName() + " is not assignable from PixGboardPayFlowViewModel");
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

