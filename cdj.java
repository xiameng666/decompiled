final class cdj extends ibur implements ibts {
    final ceq a;
    final cer b;

    public cdj(ceq ceq0, cer cer0) {
        this.a = ceq0;
        this.b = cer0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        switch(((cde)object0).ordinal()) {
            case 0: {
                return this.a.b.a == null ? ((float)1.0f) : ((float)0.0f);
            }
            case 1: {
                return (float)1.0f;
            }
            case 2: {
                return this.b.b.a == null ? ((float)1.0f) : ((float)0.0f);
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

