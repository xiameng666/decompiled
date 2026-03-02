public final class aqtc implements gful_cronetEngineProvider {
    public final aqtf a;

    public aqtc(aqtf aqtf0) {
        this.a = aqtf0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        aqtf aqtf0 = this.a;
        gful_cronetEngineProvider gful0 = aqtf0.a;
        if(((Boolean)gful0.mr()).booleanValue() && aqtf0.d.f()) {
            gful_cronetEngineProvider gful1 = aqtf0.g;
            if(aqtf.d(((aqvg)gful1.mr()))) {
                return (aqvg)gful1.mr();
            }
        }
        if(((Boolean)gful0.mr()).booleanValue() && aqtf0.c.f()) {
            return aqtf.d(((aqvg)aqtf0.f.mr())) ? ((aqvg)aqtf0.f.mr()) : ((aqvg)aqtf0.e.mr());
        }
        return (aqvg)aqtf0.e.mr();
    }
}

