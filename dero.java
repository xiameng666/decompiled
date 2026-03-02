public final class dero implements ibts {
    public final ibts a;
    public final ibth b;
    public final ibth c;
    public final ibth d;
    public final ibts e;

    public dero(ibts ibts0, ibth ibth0, ibth ibth1, ibth ibth2, ibts ibts1) {
        this.a = ibts0;
        this.b = ibth0;
        this.c = ibth1;
        this.d = ibth2;
        this.e = ibts1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((cusz)object0), "radio");
        switch(((cusz)object0).ordinal()) {
            case 0: {
                this.c.a();
                break;
            }
            case 1: {
                this.a.a(dexj.a);
                break;
            }
            case 2: {
                this.b.a();
                break;
            }
            case 3: {
                this.d.a();
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        this.e.a(((cusz)object0));
        return ibom.a;
    }
}

