public final class atmi implements gfsi {
    public final atmk a;
    public final String b;
    public final Boolean c;
    public final Long d;
    public final Boolean e;
    public final Long f;

    public atmi(atmk atmk0, String s, Boolean boolean0, Long long0, Boolean boolean1, Long long1) {
        this.a = atmk0;
        this.b = s;
        this.c = boolean0;
        this.d = long0;
        this.e = boolean1;
        this.f = long1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = this.b;
        aqhy aqhy0 = aqhy.a;
        s.getClass();
        aqhy aqhy1 = (aqhy)((aqdu)object0).c.get(s);
        if(aqhy1 != null) {
            aqhy0 = aqhy1;
        }
        baun baun0 = this.a.b;
        baun0.j("Existing app record: %s", new Object[]{aqhy0});
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)aqhy0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)aqhy0));
        boolean z = this.c.booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Long long0 = this.d;
        aqhy aqhy2 = (aqhy)hftp0.b_message;
        aqhy2.b |= 1;
        aqhy2.c = z;
        if(long0 != null) {
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqhy aqhy3 = (aqhy)hftp0.b_message;
            aqhy3.b |= 2;
            aqhy3.d = v;
        }
        Boolean boolean0 = this.e;
        if(boolean0 != null) {
            boolean z1 = boolean0.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqhy aqhy4 = (aqhy)hftp0.b_message;
            aqhy4.b |= 4;
            aqhy4.e = z1;
        }
        Long long1 = this.f;
        if(long1 != null) {
            long v1 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqhy aqhy5 = (aqhy)hftp0.b_message;
            aqhy5.b |= 8;
            aqhy5.f = v1;
        }
        baun0.j("New app record: %s", new Object[]{hftp0.N_build()});
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((aqdu)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((aqdu)object0))));
        hftp1.cJ(s, ((aqhy)hftp0.N_build()));
        return (aqdu)hftp1.N_build();
    }
}

