final class erwg extends ibsl implements ibtw {
    int a;
    final String b;
    final erwq c;

    public erwg(String s, erwq erwq0, ibrl ibrl0) {
        this.b = s;
        this.c = erwq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((erwg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new erwg(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                String s = this.b;
                if(s != null) {
                    this.a = 1;
                    if(this.c.n.b(s) != object1) {
                        break;
                    }
                    return object1;
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                return ibom.a;
            }
        }
        boolean z = ((Boolean)this.c.i.a()).booleanValue();
        String s1 = this.c.p.b(0x7F152F38);  // string:spatula_settings_switch_title "Warnings in Google Messages"
        ervx ervx0 = new ervx(this.c);
        erxm erxm0 = new erxm(z, new clzk(s1, new ervq(this.c), ervx0, new ervr(this.c)), new ervw(this.c), 60);
        this.c.r.g(erxm0);
        erwf erwf0 = new erwf(this.c);
        this.a = 2;
        return icod.g(((icod)this.c.l), erwf0, this) == object1 ? object1 : ibom.a;
    }
}

