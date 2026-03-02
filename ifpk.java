final class ifpk extends ifpi {
    @Override  // ifpi
    public final ienr a(idzh idzh0) {
        ifhw ifhw0 = ifhw.a(idzh0.a.b);
        if(ifhw0 != null) {
            idqg idqg0 = ifhw0.c.a;
            ifia ifia0 = ifia.a(idzh0.a());
            iecl iecl0 = ifpo.B(idqg0);
            ifqn ifqn0 = new ifqn(new ifqk(ifhw0.a, ifhw0.b, iecl0));
            ifqn0.c = ifqy.g(ifia0.b());
            ifqn0.b = ifqy.g(ifia0.c());
            return new ifqo(ifqn0);
        }
        byte[] arr_b = idqi.g(idzh0.a()).b;
        Integer integer0 = ifua.a(arr_b, 0);
        ifqn ifqn1 = new ifqn(((ifqk)ifqk.a.get(integer0)));
        ifqn1.d = ifqy.g(arr_b);
        return new ifqo(ifqn1);
    }
}

