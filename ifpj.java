final class ifpj extends ifpi {
    @Override  // ifpi
    public final ienr a(idzh idzh0) {
        ifhv ifhv0 = ifhv.a(idzh0.a.b);
        if(ifhv0 != null) {
            idqg idqg0 = ifhv0.b.a;
            ifia ifia0 = ifia.a(idzh0.a());
            iecl iecl0 = ifpo.B(idqg0);
            ifqv ifqv0 = new ifqv(new ifqs(ifhv0.a, iecl0));
            ifqv0.c = ifqy.g(ifia0.b());
            ifqv0.b = ifqy.g(ifia0.c());
            return new ifqw(ifqv0);
        }
        byte[] arr_b = idqi.g(idzh0.a()).b;
        Integer integer0 = ifua.a(arr_b, 0);
        ifqv ifqv1 = new ifqv(((ifqs)ifqs.a.get(integer0)));
        ifqv1.d = ifqy.g(arr_b);
        return new ifqw(ifqv1);
    }
}

