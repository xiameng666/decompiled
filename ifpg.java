final class ifpg extends ifpi {
    @Override  // ifpi
    public final ienr a(idzh idzh0) {
        try {
            byte[] arr_b = idqi.g(idzh0.a()).b;
            return new ifoi(ifpo.T(idzh0.a.a), iftq.q(arr_b, 4, arr_b.length));
        }
        catch(Exception unused_ex) {
            byte[] arr_b1 = idzh0.b.n();
            return new ifoi(ifpo.T(idzh0.a.a), arr_b1);
        }
    }
}

