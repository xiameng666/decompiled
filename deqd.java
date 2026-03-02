public final class deqd implements ibts {
    public final ibts a;
    public final ibth b;
    public final ibth c;
    public final ibts d;

    public deqd(ibts ibts0, ibth ibth0, ibth ibth1, ibts ibts1) {
        this.a = ibts0;
        this.b = ibth0;
        this.c = ibth1;
        this.d = ibts1;
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
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        this.d.a(((cusz)object0));
        return ibom.a;
    }
}

