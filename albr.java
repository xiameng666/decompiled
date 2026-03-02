public final class albr implements gful_cronetEngineProvider {
    public final gful_cronetEngineProvider a;

    public albr(gful_cronetEngineProvider gful0) {
        this.a = gful0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0 = ((ProtoLiteMessage)gzzp.a).v_newBuilder();
        Object object1 = this.a.mr();
        if(!object0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzzp gzzp0 = (gzzp)object0.b_message;
        hfja hfja0 = (hfja)((ProtoLiteBuilder)object1).N_build();
        hfja0.getClass();
        gzzp0.d = hfja0;
        gzzp0.c = 1;
        return object0;
    }
}

