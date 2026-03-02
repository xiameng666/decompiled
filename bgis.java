public final class bgis implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = bgiv.c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        heps heps0 = (heps)hftp0.b_message;
        heps0.b |= 4;
        heps0.e = true;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hept hept0 = (hept)((ProtoLiteBuilder)object0).b_message;
        heps heps1 = (heps)hftp0.N_build();
        heps1.getClass();
        hept0.c = heps1;
        hept0.b |= 1;
        return (ProtoLiteBuilder)object0;
    }
}

