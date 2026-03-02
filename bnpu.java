public final class bnpu implements gfsi {
    public final gsyz a;
    public final long b;

    public bnpu(gsyz gsyz0, long v) {
        this.a = gsyz0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gsyz gsyz0 = this.a;
        boolean z = false;
        if(!((fqyf)object0).d(gsyz0.b)) {
            return Boolean.valueOf(false);
        }
        String s = gsyz0.b;
        s.getClass();
        hfwn hfwn0 = (hfwn)((fqyf)object0).c.get(s);
        if(hfwn0 == null) {
            throw new IllegalArgumentException();
        }
        if(hfyn.b(hfwn0) < this.b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

