public final class bwvm {
    public static bwwk a(bwnr bwnr0) {
        int v7;
        bwnq bwnq0 = bwnr0.c == null ? bwnq.a : bwnr0.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwwk.a).v_newBuilder();
        int v = bwnq0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bwwk)hftp0.b_message).d = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwwi.a).v_newBuilder();
        String s = bwnq0.f;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((bwwi)hftv0).c = s;
        String s1 = bwnq0.d;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwwi bwwi0 = (bwwi)hftp1.b_message;
        s1.getClass();
        bwwi0.b = s1;
        bwwi bwwi1 = (bwwi)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        bwwi1.getClass();
        ((bwwk)hftv1).c = bwwi1;
        ((bwwk)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        int v1 = 3;
        ((bwwk)hftv2).f = 1;
        String s2 = bwnq0.r;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        s2.getClass();
        ((bwwk)hftv3).g = s2;
        String s3 = bwnq0.e;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        s3.getClass();
        ((bwwk)hftv4).h = s3;
        long v2 = bwnq0.j;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((bwwk)hftv5).e = v2;
        int v3 = bwnq0.s;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bwwk)hftp0.b_message).j = v3;
        for(int v4 = 0; true; ++v4) {
            int v5 = 4;
            if(v4 >= bwnq0.k.size()) {
                break;
            }
            bwlo bwlo0 = (bwlo)bwnq0.k.get(v4);
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)bwwm.a).v_newBuilder();
            boolean z = bwlo0.r;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((bwwm)hftp2.b_message).b = z;
            bwwm bwwm0 = (bwwm)hftp2.N_build();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)bwwl.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp3.b_message;
            ((bwwl)hftv6).d = v4;
            String s4 = bwlo0.d;
            if(!hftv6.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp3.b_message;
            s4.getClass();
            ((bwwl)hftv7).c = s4;
            String s5 = bwlo0.n;
            if(!hftv7.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp3.b_message;
            s5.getClass();
            ((bwwl)hftv8).e = s5;
            if((bwll.b(bwlo0.f) == null ? bwll.a : bwll.b(bwlo0.f)) == bwll.e) {
                int v6 = bwlo0.q;
                if(bwlj.a(v6) == 2) {
                    v7 = 6;
                }
                else if(bwlj.a(v6) == 3) {
                    v7 = 7;
                }
                else {
                    v7 = 8;
                }
            }
            else {
                v7 = 3;
            }
            if(!hftv8.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((bwwl)hftp3.b_message).f = v7 - 2;
            int v8 = bwlo0.i.isEmpty() ^ 1;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv9 = hftp3.b_message;
            ((bwwl)hftv9).g = v8;
            boolean z1 = bwlo0.e;
            if(!hftv9.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv10 = hftp3.b_message;
            ((bwwl)hftv10).h = z1;
            boolean z2 = bwlo0.h;
            if(!hftv10.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv11 = hftp3.b_message;
            ((bwwl)hftv11).i = z2;
            int v9 = bwlo0.g;
            if(!hftv11.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv12 = hftp3.b_message;
            ((bwwl)hftv12).j = v9;
            if(!hftv12.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv13 = hftp3.b_message;
            bwwm0.getClass();
            ((bwwl)hftv13).k = bwwm0;
            ((bwwl)hftv13).b |= 1;
            hfuo hfuo0 = bwlo0.k;
            if(!hftv13.isImmutable()) {
                hftp3.ensureMutable();
            }
            bwwl bwwl0 = (bwwl)hftp3.b_message;
            hfuo hfuo1 = bwwl0.m;
            if(!hfuo1.c()) {
                bwwl0.m = ProtoLiteMessage.E(hfuo1);
            }
            hfrj.E(hfuo0, bwwl0.m);
            switch((bwll.b(bwlo0.f) == null ? bwll.a : bwll.b(bwlo0.f)).ordinal()) {
                case 0: {
                    v5 = 3;
                    break;
                }
                case 1: {
                    break;
                }
                case 2: {
                    v5 = 5;
                    break;
                }
                case 3: {
                    v5 = 6;
                    break;
                }
                case 4: {
                    v5 = 7;
                    break;
                }
                case 5: {
                    v5 = 8;
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((bwwl)hftp3.b_message).l = v5 - 2;
            bwwl bwwl1 = (bwwl)hftp3.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bwwk bwwk0 = (bwwk)hftp0.b_message;
            bwwl1.getClass();
            hfuo hfuo2 = bwwk0.i;
            if(!hfuo2.c()) {
                bwwk0.i = ProtoLiteMessage.E(hfuo2);
            }
            bwwk0.i.add(bwwl1);
        }
        bwwk bwwk1 = (bwwk)hftp0.N_build();
        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)bwwk1).jf(5, null);
        hftp4.X(((ProtoLiteMessage)bwwk1));
        bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
        switch((bwnx.a(bwny0.d) == 0 ? 1 : bwnx.a(bwny0.d)) - 1) {
            case 0: {
                break;
            }
            case 1: {
                v1 = 4;
                break;
            }
            default: {
                v1 = 5;
            }
        }
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((bwwk)hftp4.b_message).f = v1 - 2;
        return (bwwk)hftp4.N_build();
    }
}

