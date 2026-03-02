final class devg extends ibsl implements ibtw {
    int a;
    final fzp b;
    final String c;
    final String d;
    final ibth e;
    final ibth f;

    public devg(fzp fzp0, String s, String s1, ibth ibth0, ibth ibth1, ibrl ibrl0) {
        this.b = fzp0;
        this.c = s;
        this.d = s1;
        this.e = ibth0;
        this.f = ibth1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((devg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new devg(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        devg devg0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            devg0 = this;
            object0 = fzp.d(this.b, this.c, this.d, 1, devg0, 4);
            if(object0 == object1) {
                return object1;
            }
        }
        else {
            devg0 = this;
        }
        switch(((gai)object0).ordinal()) {
            case 0: {
                break;
            }
            case 1: {
                devg0.e.a();
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        devg0.f.a();
        return ibom.a;
    }
}

