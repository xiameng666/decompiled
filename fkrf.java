import java.util.Map.Entry;

public final class fkrf {
    private final fkpn a;
    private final gful_cronetEngineProvider b;
    private final fiyl c;
    private final gful_cronetEngineProvider d;
    private final cmcc e;

    public fkrf(fkpn fkpn0, cmcc cmcc0, gful_cronetEngineProvider gful0, fiyl fiyl0, gful_cronetEngineProvider gful1) {
        this.a = fkpn0;
        this.e = cmcc0;
        this.b = gfus.a(gful0);
        this.c = fiyl0;
        this.d = gful1;
    }

    public final void a(flag flag0, int v, int v1, hfub hfub0, fkrg fkrg0, boolean z) {
        int v12;
        int v7;
        int v2 = this.e.a();
        if(this.c.a(((long)v2))) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpx.a).v_newBuilder();
            long v3 = flag0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((fkpx)hftv0).b |= 2;
            ((fkpx)hftv0).d = v3;
            long v4 = flag0.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((fkpx)hftv1).b |= 8;
            ((fkpx)hftv1).f = v4;
            long v5 = flag0.c;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            int v6 = 4;
            ((fkpx)hftv2).b |= 4;
            ((fkpx)hftv2).e = v5;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((fkpx)hftv3).c = v - 1;
            ((fkpx)hftv3).b |= 1;
            switch(v1 - 1) {
                case 0: {
                    v7 = 2;
                    break;
                }
                case 1: {
                    v7 = 3;
                    break;
                }
                default: {
                    v7 = 4;
                }
            }
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fkpx)hftp0.b_message).k = v7 - 1;
            ((fkpx)hftp0.b_message).b |= 0x80;
            ggqj ggqj0 = flag0.a.v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fkpw.a).v_newBuilder();
                int v8 = ((hfub)(((Enum)((Map.Entry)object0).getKey()))).a();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fkpw fkpw0 = (fkpw)hftp1.b_message;
                fkpw0.b |= 1;
                fkpw0.c = v8;
                long v9 = (long)(((Long)((Map.Entry)object0).getValue()));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fkpw fkpw1 = (fkpw)hftp1.b_message;
                fkpw1.b |= 2;
                fkpw1.d = v9;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fkpx fkpx0 = (fkpx)hftp0.b_message;
                fkpw fkpw2 = (fkpw)hftp1.N_build();
                fkpw2.getClass();
                hfuo hfuo0 = fkpx0.j;
                if(!hfuo0.c()) {
                    fkpx0.j = ProtoLiteMessage.E(hfuo0);
                }
                fkpx0.j.add(fkpw2);
            }
            int v10 = hfub0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp0.b_message;
            ((fkpx)hftv4).b |= 0x100;
            ((fkpx)hftv4).l = v10;
            hfub hfub1 = fkrg0.a;
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpx fkpx1 = (fkpx)hftp0.b_message;
            fkpx1.b |= 16;
            fkpx1.g = ((hhgf)hfub1).l;
            Integer integer0 = fkrg0.b;
            if(integer0 != null) {
                int v11 = (int)integer0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fkpx fkpx2 = (fkpx)hftp0.b_message;
                fkpx2.b |= 0x20;
                fkpx2.h = v11;
            }
            if(z) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fkpx fkpx3 = (fkpx)hftp0.b_message;
                fkpx3.b |= 0x40;
                fkpx3.i = true;
            }
            gful_cronetEngineProvider gful0 = this.d;
            switch(((fkqp)gful0.mr()).a() - 1) {
                case 1: {
                    v12 = 2;
                    break;
                }
                case 2: {
                    v12 = 3;
                    break;
                }
                default: {
                    v12 = 1;
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fkpx)hftp0.b_message).m = v12 - 1;
            ((fkpx)hftp0.b_message).b |= 0x200;
            switch(((fkqp)gful0.mr()).b() - 1) {
                case 1: {
                    v6 = 2;
                    break;
                }
                case 2: {
                    v6 = 3;
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    v6 = 1;
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fkpx)hftp0.b_message).n = v6 - 1;
            ((fkpx)hftp0.b_message).b |= 0x400;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fkpy.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            fkpy fkpy0 = (fkpy)hftp2.b_message;
            fkpx fkpx4 = (fkpx)hftp0.N_build();
            fkpx4.getClass();
            fkpy0.c = fkpx4;
            fkpy0.b |= 1;
            fkpy fkpy1 = (fkpy)hftp2.N_build();
            fkpz fkpz0 = (fkpz)this.b.mr();
            fkpq fkpq0 = fkpq.r;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
            fkpn fkpn0 = this.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp3.b_message;
            fkpn0.getClass();
            ((fkpo)hftv5).f = fkpn0;
            ((fkpo)hftv5).b |= 2;
            if(!hftv5.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp3.b_message;
            ((fkpo)hftv6).b |= 1;
            ((fkpo)hftv6).e = v2;
            if(!hftv6.isImmutable()) {
                hftp3.ensureMutable();
            }
            fkpo fkpo0 = (fkpo)hftp3.b_message;
            fkpy1.getClass();
            fkpo0.d = fkpy1;
            fkpo0.c = 6;
            fkpz0.a(fkpq0, ((fkpo)hftp3.N_build()));
        }
    }
}

