public final class eyax extends ibvt {
    final eyaz a;

    public eyax(Object object0, eyaz eyaz0) {
        this.a = eyaz0;
        super(object0);
    }

    @Override  // ibvt
    protected final void b(ibxd ibxd0, Object object0, Object object1) {
        ibuq.f(ibxd0, "property");
        boolean z = ((Boolean)object1).booleanValue();
        if(((Boolean)object0).booleanValue() != z) {
            for(Object object2: this.a.k) {
                ((eyig)object2).a(z);
            }
        }
    }
}

