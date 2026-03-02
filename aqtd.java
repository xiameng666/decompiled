public final class aqtd implements gful_cronetEngineProvider {
    public final aqtf a;

    public aqtd(aqtf aqtf0) {
        this.a = aqtf0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        aqtf aqtf0 = this.a;
        if(((Boolean)aqtf0.b.mr()).booleanValue()) {
            gful_cronetEngineProvider gful0 = aqtf0.a;
            if(((Boolean)gful0.mr()).booleanValue() && aqtf0.c.f() && aqtf.d(((aqvg)aqtf0.f.mr()))) {
                return (aqtz)aqtf0.i.mr();
            }
            return !((Boolean)gful0.mr()).booleanValue() || !aqtf0.d.f() || !aqtf.d(((aqvg)aqtf0.g.mr())) ? ((aqtz)aqtf0.h.mr()) : ((aqtz)aqtf0.j.mr());
        }
        gful_cronetEngineProvider gful1 = aqtf0.a;
        if(((Boolean)gful1.mr()).booleanValue() && aqtf0.d.f() && aqtf.d(((aqvg)aqtf0.g.mr()))) {
            return (aqtz)aqtf0.j.mr();
        }
        return !((Boolean)gful1.mr()).booleanValue() || !aqtf0.c.f() || !aqtf.d(((aqvg)aqtf0.f.mr())) ? ((aqtz)aqtf0.h.mr()) : ((aqtz)aqtf0.i.mr());
    }
}

