final class cdm extends ibur implements ibts {
    final ceq a;
    final cer b;

    public cdm(ceq ceq0, cer cer0) {
        this.a = ceq0;
        this.b = cer0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cez cez0;
        float f = 1.0f;
        switch(((cde)object0).ordinal()) {
            case 0: {
                cez0 = this.a.b.d;
                return cez0 == null ? ((float)1.0f) : ((float)cez0.a);
            }
            case 1: {
                break;
            }
            case 2: {
                cez0 = this.b.b.d;
                if(cez0 != null) {
                    f = cez0.a;
                }
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        return f;
    }
}

