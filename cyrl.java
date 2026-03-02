public final class cyrl implements gfsi {
    public final cyrp a;
    public final cyjq b;

    public cyrl(cyrp cyrp0, cyjq cyjq0) {
        this.a = cyrp0;
        this.b = cyjq0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        cyjq cyjq0;
        cyjr cyjr0 = (cyjr)((ProtoLiteMessage)cyjs.a).w(((ProtoLiteMessage)(((cyjs)object0))));
        boolean z = false;
        int v;
        for(v = 0; true; ++v) {
            cyjq0 = this.b;
            if(v >= ((cyjs)cyjr0.b_message).b.size()) {
                v = -1;
                break;
            }
            if(gfqz.e(cyjr0.a(v).c, cyjq0.c)) {
                break;
            }
        }
        if(v == -1) {
            cyjh.a.g().B("SassDeviceSettingDataStore: Update a non-exist address %s!", fgjo.c(cyjq0.c));
        }
        else {
            if(!cyjr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)cyjr0).ensureMutable();
            }
            cyjs cyjs0 = (cyjs)cyjr0.b_message;
            cyjq0.getClass();
            cyjs0.b();
            cyjs0.b.set(v, cyjq0);
        }
        cyrp cyrp0 = this.a;
        if(((cyjs)cyjr0.b_message).b.size() > 0) {
            z = true;
        }
        cyrp0.l(z);
        return (cyjs)((ProtoLiteBuilder)cyjr0).N_build();
    }
}

