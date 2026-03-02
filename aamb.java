public final class aamb implements ibts {
    public final aaln a;

    public aamb(aaln aaln0) {
        this.a = aaln0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        grxw grxw0;
        grul grul0 = ((zho)object0).a();
        if(((grul0.g == null ? grvg.a : grul0.g).b & 0x40) == 0) {
            grxw0 = null;
        }
        else {
            grxw0 = (grul0.g == null ? grvg.a : grul0.g).f;
            if(grxw0 == null) {
                grxw0 = grxw.a;
            }
        }
        if(grxw0 == null) {
            grxw0 = zhp.a;
        }
        return this.a.a(grxw0);
    }
}

