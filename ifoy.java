final class ifoy extends ifpi {
    @Override  // ifpi
    public final ienr a(idzh idzh0) {
        byte[] arr_b = idzh0.b.n();
        idqi idqi0 = ifpo.v(arr_b);
        return idqi0 == null ? ifoy.b(idzh0, arr_b) : ifoy.b(idzh0, idqi0.b);
    }

    private static final iflu b(idzh idzh0, byte[] arr_b) {
        return new iflu(ifpo.L(idzh0.a.a), arr_b);
    }
}

