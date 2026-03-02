public final class bnuc implements gfsi {
    public final bnvf a;
    public final boolean b;

    public bnuc(bnvf bnvf0, boolean z) {
        this.a = bnvf0;
        this.b = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        boolean z = this.b;
        if(z) {
            bprs.j(cljp.a(this.a.j), this.a.h);
        }
        return Boolean.valueOf(z);
    }
}

