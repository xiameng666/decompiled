public final class aalr implements zgz {
    public final aaln a;

    public aalr(aaln aaln0) {
        this.a = aaln0;
    }

    @Override  // zgz
    public final Object a(Object object0, Object object1) {
        grvg grvg0 = ((zho)object1).a().g;
        if(grvg0 == null) {
            grvg0 = grvg.a;
        }
        grxr grxr0 = ((zho)object0).a;
        String s = null;
        if((grvg0.b & 0x40000) != 0 && grxr0.c == 6 && (((grve)grxr0.d).b & 1) != 0) {
            grwb grwb0 = grvg0.m == null ? grwb.a : grvg0.m;
            grve grve0 = grxr0.c == 6 ? ((grve)grxr0.d) : grve.a;
            grwb grwb1 = grve0.d == null ? grwb.a : grve0.d;
            aatb aatb0 = (aatb)this.a.b.ij();
            if(aatb0 != null) {
                s = aatb0.b;
            }
            return new aamj(s, grwb0, grwb1);
        }
        return null;
    }
}

