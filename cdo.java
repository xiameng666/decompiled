final class cdo extends ibur implements ibts {
    final hnd a;
    final ceq b;
    final cer c;

    public cdo(hnd hnd0, ceq ceq0, cer cer0) {
        this.a = hnd0;
        this.b = ceq0;
        this.c = cer0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hnd hnd0;
        switch(((cde)object0).ordinal()) {
            case 0: {
                cez cez0 = this.b.b.d;
                if(cez0 != null) {
                    hnd0 = new hnd(cez0.b);
                    return hnd0 == null ? new hnd(hnd.a) : new hnd(hnd0.b);
                }
                cez cez1 = this.c.b.d;
                if(cez1 != null) {
                    hnd0 = new hnd(cez1.b);
                    return hnd0 == null ? new hnd(hnd.a) : new hnd(hnd0.b);
                }
                break;
            }
            case 1: {
                return this.a == null ? new hnd(hnd.a) : new hnd(this.a.b);
            }
            case 2: {
                cez cez2 = this.c.b.d;
                if(cez2 != null) {
                    hnd0 = new hnd(cez2.b);
                    return hnd0 == null ? new hnd(hnd.a) : new hnd(hnd0.b);
                }
                cez cez3 = this.b.b.d;
                if(cez3 != null) {
                    hnd0 = new hnd(cez3.b);
                    return hnd0 == null ? new hnd(hnd.a) : new hnd(hnd0.b);
                }
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        return new hnd(hnd.a);
    }
}

