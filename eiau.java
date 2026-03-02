public final class eiau implements ibtw {
    public final hfc a;
    public final gui b;
    public final eiam c;
    public final int d;

    public eiau(hfc hfc0, gui gui0, eiam eiam0, int v) {
        this.a = hfc0;
        this.b = gui0;
        this.c = eiam0;
        this.d = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        eiav.c(this.a, this.b, this.c, ((goz)object0), gsc.a(this.d | 1));
        return ibom.a;
    }
}

