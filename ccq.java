final class ccq extends ibur implements ibts {
    final hnl a;

    public ccq(hnl hnl0) {
        this.a = hnl0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        float f = ((chs)object0).b;
        float f1 = 0.0f;
        if((f < 0.0f)) {
            f = 0.0f;
        }
        float f2 = ((chs)object0).c;
        float f3 = -0.5f;
        if((f2 < -0.5f)) {
            f2 = -0.5f;
        }
        float f4 = ((chs)object0).d;
        if(f4 >= -0.5f) {
            f3 = f4;
        }
        float f5 = ((chs)object0).a;
        if(f5 >= 0.0f) {
            f1 = f5;
        }
        if((f > 1.0f)) {
            f = 1.0f;
        }
        if((f2 > 0.5f)) {
            f2 = 0.5f;
        }
        if((f3 > 0.5f)) {
            f3 = 0.5f;
        }
        if((f1 > 1.0f)) {
            f1 = 1.0f;
        }
        return new hll(hll.e(hln.e(f, f2, f3, f1, hnt.x), this.a));
    }
}

