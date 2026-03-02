public final class hflf {
    public static final hfnh a(hfnk hfnk0) {
        hhev hhev0 = (hhev)((ProtoLiteMessage)hhew.a).v_newBuilder();
        if(!hhev0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhev0).ensureMutable();
        }
        ((hhew)hhev0.b_message).e = 0x30;
        ((hhew)hhev0.b_message).b |= 0x4000;
        if((hfnk0.c & 1) != 0) {
            long v = hfnk0.d;
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            hhew hhew0 = (hhew)hhev0.b_message;
            hhew0.b |= 0x8000;
            hhew0.f = v;
        }
        if((hfnk0.c & 8) != 0) {
            int v1 = hfnk0.g;
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            ((hhew)hhev0.b_message).c |= 0x1000;
            ((hhew)hhev0.b_message).h = v1;
        }
        if(!hfnk0.h.isEmpty()) {
            hhev0.a(hfnk0.h);
        }
        hfug hfug0 = hfnk.a;
        if(!new hfuh(hfnk0.i, hfug0).isEmpty()) {
            hfuh hfuh0 = new hfuh(hfnk0.i, hfug0);
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            hhew hhew1 = (hhew)hhev0.b_message;
            hfuf hfuf0 = hhew1.j;
            if(!hfuf0.c()) {
                hhew1.j = ProtoLiteMessage.C(hfuf0);
            }
            for(Object object0: hfuh0) {
                hhew1.j.i(((hfjr)object0).a());
            }
        }
        if((hfnk0.c & 0x40) != 0) {
            boolean z = hfnk0.j;
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            ((hhew)hhev0.b_message).c |= 0x100000;
            ((hhew)hhev0.b_message).n = z;
        }
        if((hfnk0.c & 2) != 0) {
            long v2 = hfnk0.e;
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            hhew hhew2 = (hhew)hhev0.b_message;
            hhew2.b |= 0x10000;
            hhew2.g = v2;
        }
        if((hfnk0.c & 4) != 0) {
            String s = hfnk0.f;
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            hhew hhew3 = (hhew)hhev0.b_message;
            s.getClass();
            hhew3.b |= 0x100;
            hhew3.d = s;
        }
        if((hfnk0.c & 0x100) != 0) {
            boolean z1 = hfnk0.k;
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            ((hhew)hhev0.b_message).c |= 0x40000;
            ((hhew)hhev0.b_message).m = z1;
        }
        if((hfnk0.c & 0x200) != 0) {
            boolean z2 = hfnk0.l;
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            ((hhew)hhev0.b_message).c |= 0x10000;
            ((hhew)hhev0.b_message).k = z2;
        }
        if((hfnk0.c & 0x400) != 0) {
            int v3 = hfnf.a(hfnk0.m) == 0 ? 1 : hfnf.a(hfnk0.m);
            if(!hhev0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhev0).ensureMutable();
            }
            ((hhew)hhev0.b_message).l = v3 - 1;
            ((hhew)hhev0.b_message).c |= 0x20000;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfkw.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhex.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhex hhex0 = (hhex)hftp1.b_message;
        hhew hhew4 = (hhew)((ProtoLiteBuilder)hhev0).N_build();
        hhew4.getClass();
        hhex0.c = hhew4;
        hhex0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfkw hfkw0 = (hfkw)hftp0.b_message;
        hhex hhex1 = (hhex)hftp1.N_build();
        hhex1.getClass();
        hfkw0.c = hhex1;
        hfkw0.b |= 1;
        return hfkt.b(hftp0);
    }
}

