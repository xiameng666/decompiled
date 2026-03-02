public final class cyrh implements gfsi {
    public final cyrp a;
    public final String b;

    public cyrh(cyrp cyrp0, String s) {
        this.a = cyrp0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s;
        cyjr cyjr0 = (cyjr)((ProtoLiteMessage)cyjs.a).w(((ProtoLiteMessage)(((cyjs)object0))));
        boolean z = false;
        int v;
        for(v = 0; true; ++v) {
            s = this.b;
            if(v >= ((cyjs)cyjr0.b_message).b.size()) {
                v = -1;
                break;
            }
            if(gfqz.e(cyjr0.a(v).c, s)) {
                break;
            }
        }
        if(v == -1) {
            cyjh.a.g().B("SassDeviceSettingDataStore: Delete a non-exist address %s!", fgjo.c(s));
        }
        else {
            if(!cyjr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)cyjr0).ensureMutable();
            }
            cyjs cyjs0 = (cyjs)cyjr0.b_message;
            cyjs0.b();
            cyjs0.b.remove(v);
            cyjh.a.g().B("SassDeviceSettingDataStore: SassDeviceSettings %s deleted!", fgjo.c(s));
        }
        cyrp cyrp0 = this.a;
        if(((cyjs)cyjr0.b_message).b.size() > 0) {
            z = true;
        }
        cyrp0.l(z);
        return (cyjs)((ProtoLiteBuilder)cyjr0).N_build();
    }
}

