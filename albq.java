import j..time.Instant;

public final class albq implements gful_cronetEngineProvider {
    public final gful_cronetEngineProvider a;

    public albq(gful_cronetEngineProvider gful0) {
        this.a = gful0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Object object0 = ((ProtoLiteMessage)hfja.a).v_newBuilder();
        long v = Instant.now().toEpochMilli();
        if(!object0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hfja hfja0 = (hfja)object0.b_message;
        hfja0.b |= 1;
        hfja0.c = v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfjd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfjd)hftp0.b_message).c = 5;
        ((hfjd)hftp0.b_message).b |= 1;
        Object object1 = this.a.mr();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfjd hfjd0 = (hfjd)hftp0.b_message;
        hfji hfji0 = (hfji)((ProtoLiteBuilder)object1).N_build();
        hfji0.getClass();
        hfjd0.d = hfji0;
        hfjd0.b |= 0x40;
        if(!object0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hfja hfja1 = (hfja)object0.b_message;
        hfjd hfjd1 = (hfjd)hftp0.N_build();
        hfjd1.getClass();
        hfja1.d = hfjd1;
        hfja1.b |= 16;
        return object0;
    }
}

