import j..time.Duration;

public final class eyfh implements ibts {
    public final gzxv a;
    public final Duration b;
    public final eyfl c;

    public eyfh(gzxv gzxv0, Duration duration0, eyfl eyfl0) {
        this.a = gzxv0;
        this.b = duration0;
        this.c = eyfl0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gzxv gzxv0;
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ((gzxd)object0).b(gzxz.c);
        gzxf gzxf0 = gzxe.a(((ProtoLiteMessage)gzxw.a).v_newBuilder());
        gzxf0.b(this.a);
        Duration duration0 = this.b;
        if(duration0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzxu.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            hfst hfst0 = hfyo.a(duration0);
            ibuq.f(hfst0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzxu gzxu0 = (gzxu)hftp0.b_message;
            hfst0.getClass();
            gzxu0.c = hfst0;
            gzxu0.b |= 1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((gzxu)hftv0), "value");
            ProtoLiteBuilder hftp1 = gzxf0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxw gzxw0 = (gzxw)hftp1.b_message;
            ((gzxu)hftv0).getClass();
            gzxw0.d = (gzxu)hftv0;
            gzxw0.b |= 1;
        }
        switch(((gzxw)gzxf0.a.b_message).c) {
            case 0: {
                gzxv0 = gzxv.a;
                break;
            }
            case 1: {
                gzxv0 = gzxv.b;
                break;
            }
            case 2: {
                gzxv0 = gzxv.c;
                break;
            }
            case 3: {
                gzxv0 = gzxv.d;
                break;
            }
            case 4: {
                gzxv0 = gzxv.e;
                break;
            }
            case 5: {
                gzxv0 = gzxv.f;
                break;
            }
            case 6: {
                gzxv0 = gzxv.g;
                break;
            }
            case 7: {
                gzxv0 = gzxv.h;
                break;
            }
            case 8: {
                gzxv0 = gzxv.i;
                break;
            }
            case 9: {
                gzxv0 = gzxv.j;
                break;
            }
            case 10: {
                gzxv0 = gzxv.k;
                break;
            }
            case 11: {
                gzxv0 = gzxv.l;
                break;
            }
            case 12: {
                gzxv0 = gzxv.m;
                break;
            }
            case 13: {
                gzxv0 = gzxv.n;
                break;
            }
            case 14: {
                gzxv0 = gzxv.o;
                break;
            }
            case 15: {
                gzxv0 = gzxv.p;
                break;
            }
            case 16: {
                gzxv0 = gzxv.q;
                break;
            }
            case 17: {
                gzxv0 = gzxv.r;
                break;
            }
            case 18: {
                gzxv0 = gzxv.s;
                break;
            }
            case 19: {
                gzxv0 = gzxv.t;
                break;
            }
            case 20: {
                gzxv0 = gzxv.u;
                break;
            }
            case 21: {
                gzxv0 = gzxv.v;
                break;
            }
            case 22: {
                gzxv0 = gzxv.w;
                break;
            }
            case 23: {
                gzxv0 = gzxv.x;
                break;
            }
            case 24: {
                gzxv0 = gzxv.y;
                break;
            }
            case 25: {
                gzxv0 = gzxv.z;
                break;
            }
            case 26: {
                gzxv0 = gzxv.A;
                break;
            }
            case 27: {
                gzxv0 = gzxv.B;
                break;
            }
            case 28: {
                gzxv0 = gzxv.C;
                break;
            }
            case 29: {
                gzxv0 = gzxv.D;
                break;
            }
            case 30: {
                gzxv0 = gzxv.E;
                break;
            }
            case 0x1F: {
                gzxv0 = gzxv.F;
                break;
            }
            case 0x20: {
                gzxv0 = gzxv.G;
                break;
            }
            default: {
                gzxv0 = null;
            }
        }
        if(gzxv0 == null) {
            gzxv0 = gzxv.H;
        }
        ibuq.e(gzxv0, "getEnrollmentResultEventType(...)");
        if(gzxv0 == gzxv.c) {
            this.c.c(bbdg.up);
        }
        gzxw gzxw1 = gzxf0.a();
        ibuq.f(gzxw1, "value");
        ProtoLiteBuilder hftp2 = ((gzxd)object0).a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp2.b_message;
        gzxw1.getClass();
        gzzc0.d = gzxw1;
        gzzc0.c = 3;
        return ibom.a;
    }
}

