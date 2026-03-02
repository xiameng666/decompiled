public final class cyun implements gfsi {
    public final long a;
    public final kar b;

    public cyun(long v, kar kar0) {
        this.a = v;
        this.b = kar0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        long v1;
        ProtoLiteBuilder hftp1;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyez)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyez)object0))));
        for(int v = 0; true; ++v) {
            hftp1 = null;
            v1 = this.a;
            if(v >= ((cyez)((cyey)hftp0).b_message).b.size()) {
                break;
            }
            if(v1 == ((cyey)hftp0).a(v).c) {
                cyex cyex0 = ((cyey)hftp0).a(v);
                hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)cyex0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)cyex0));
                ((cyey)hftp0).m(v);
                break;
            }
        }
        if(hftp1 == null) {
            ((ggtj)cyjh.a.g().ar(0x2047)).A("ActiveMonitorDataStore updateTriangleMonitor: can\'t find monitor id %s", v1);
            return (cyez)((ProtoLiteBuilder)(((cyey)hftp0))).N_build();
        }
        cyex cyex1 = (cyex)hftp1.b_message;
        if((cyex1.b & 16) != 0) {
            cygo cygo0 = cyex1.g == null ? cygo.a : cyex1.g;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)cygo0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)cygo0));
            this.b.accept(hftp2);
            cygo cygo1 = (cygo)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            cyex cyex2 = (cyex)hftp1.b_message;
            cygo1.getClass();
            cyex2.g = cygo1;
            cyex2.b |= 16;
            ((cyey)hftp0).k(((cyex)hftp1.N_build()));
            return (cyez)((ProtoLiteBuilder)(((cyey)hftp0))).N_build();
        }
        ggtj ggtj0 = (ggtj)cyjh.a.g().ar(0x2046);
        int v2 = cygh.b(((cyex)hftp1.b_message).f);
        if(v2 == 0) {
            v2 = 1;
        }
        ggtj0.L("ActiveMonitorDataStore updateTriangleMonitor: can\'t find private triangle log, id %s, type %s", v1, cygh.a(v2));
        if(!((cyey)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cyey)hftp0))).ensureMutable();
        }
        cyez cyez0 = (cyez)((cyey)hftp0).b_message;
        cyex cyex3 = (cyex)hftp1.N_build();
        cyex3.getClass();
        cyez0.b();
        cyez0.b.add(cyex3);
        return (cyez)((ProtoLiteBuilder)(((cyey)hftp0))).N_build();
    }
}

