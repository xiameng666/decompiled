public final class aakk extends fnjf {
    final aakt a;

    public aakk(aakt aakt0) {
        this.a = aakt0;
        super();
    }

    @Override  // fnjf
    public final void a(gged_interceptors gged0) {
        Object object0;
        if(gged0 != null) {
            fnlf fnlf0 = this.a.A().b;
            String s = this.a.z().b.d().b;
            ggqk ggqk0 = gged0.E();
            while(ggqk0.hasNext()) {
                object0 = ggqk0.next();
                if(!((fntm)object0).c.equals(s)) {
                    continue;
                }
                goto label_9;
            }
            object0 = null;
        label_9:
            fnlf0.i(((fntm)object0));
        }
    }

    @Override  // fnjf
    public final void b(Object object0) {
        if(((fntm)object0) != null) {
            this.a.z().c(((fntm)object0).c);
        }
    }
}

