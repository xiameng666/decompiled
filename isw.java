final class isw extends ibsl implements ibtw {
    boolean a;
    int b;
    float c;
    final isx d;

    public isw(isx isx0, ibrl ibrl0) {
        this.d = isx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((isw)this.c(Float.valueOf(((Number)object0).floatValue()), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new isw(this.d, ibrl0);
        ibrl1.c = ((Number)object0).floatValue();
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        boolean z;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            z = this.a;
            ibnx.b(object0);
            goto label_18;
        }
        ibnx.b(object0);
        float f = this.c;
        iug iug0 = this.d.a;
        ibtw ibtw0 = iti.a(iug0);
        if(ibtw0 != null) {
            boolean z1 = ((itu)iug0.b.c(iuz.u)).c;
            if(z1) {
                f = -f;
            }
            this.a = z1;
            this.b = 1;
            object0 = ibtw0.a(new hjz(((long)Float.floatToRawIntBits(0.0f)) << 0x20 | ((long)Float.floatToRawIntBits(f)) & 0xFFFFFFFFL), this);
            if(object0 != object1) {
                z = z1;
            label_18:
                int v = (int)(((hjz)object0).a & 0xFFFFFFFFL);
                return z ? new Float(-Float.intBitsToFloat(v)) : new Float(Float.intBitsToFloat(v));
            }
            return object1;
        }
        hxt.b("Required value was null.");
        throw new ibnm();
    }
}

