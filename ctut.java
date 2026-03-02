final class ctut implements icih {
    final ctuy a;

    public ctut(ctuy ctuy0) {
        this.a = ctuy0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        String s = (String)((ibns)object0).a;
        byte[] arr_b = (byte[])((ibns)object0).b;
        ctuy ctuy0 = this.a;
        if(ctuy0.e.containsKey(s)) {
            cuwu cuwu0 = cuwu.b(arr_b);
            evql evql0 = ctuy0.a.k(s, cuwu0);
            evql0.b(new ctur(new ctuq()));
            evql0.A(new ctus(ctuy0, s));
        }
        return ibom.a;
    }
}

