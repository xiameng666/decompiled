final class cdk extends ibur implements ibts {
    final gui a;
    final gui b;
    final gui c;

    public cdk(gui gui0, gui gui1, gui gui2) {
        this.a = gui0;
        this.b = gui1;
        this.c = gui2;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        float f = 1.0f;
        ((hmr)object0).o((this.a == null ? 1.0f : ((Number)this.a.a()).floatValue()));
        gui gui0 = this.b;
        ((hmr)object0).v((gui0 == null ? 1.0f : ((Number)gui0.a()).floatValue()));
        if(gui0 != null) {
            f = ((Number)gui0.a()).floatValue();
        }
        ((hmr)object0).w(f);
        ((hmr)object0).A((this.c == null ? hnd.a : ((hnd)this.c.a()).b));
        return ibom.a;
    }
}

