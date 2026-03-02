import j..time.Duration;

public final class eyfi implements ibts {
    public final gzxs a;
    public final gzxx b;
    public final gzya c;
    public final Duration d;
    public final Duration e;
    public final Duration f;
    public final Duration g;
    public final Duration h;
    public final Duration i;
    public final Duration j;
    public final Duration k;

    public eyfi(gzxs gzxs0, gzxx gzxx0, gzya gzya0, Duration duration0, Duration duration1, Duration duration2, Duration duration3, Duration duration4, Duration duration5, Duration duration6, Duration duration7) {
        this.a = gzxs0;
        this.b = gzxx0;
        this.c = gzya0;
        this.d = duration0;
        this.e = duration1;
        this.f = duration2;
        this.g = duration3;
        this.h = duration4;
        this.i = duration5;
        this.j = duration6;
        this.k = duration7;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$log");
        ((gzxd)object0).b(gzxz.d);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzxt.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzxs gzxs0 = this.a;
        ibuq.f(gzxs0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzxx gzxx0 = this.b;
        gzxt gzxt0 = (gzxt)hftp0.b_message;
        gzxt0.c = gzxs0.a();
        ibuq.f(gzxx0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Duration duration0 = this.d;
        gzxt gzxt1 = (gzxt)hftp0.b_message;
        gzxt1.e = gzxx0.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzxr.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        if(duration0 != null) {
            hfst hfst0 = hfyo.a(duration0);
            ibuq.f(hfst0, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxr gzxr0 = (gzxr)hftp1.b_message;
            hfst0.getClass();
            gzxr0.i = hfst0;
            gzxr0.b |= 0x40;
        }
        Duration duration1 = this.e;
        if(duration1 != null) {
            hfst hfst1 = hfyo.a(duration1);
            ibuq.f(hfst1, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxr gzxr1 = (gzxr)hftp1.b_message;
            hfst1.getClass();
            gzxr1.c = hfst1;
            gzxr1.b |= 1;
        }
        Duration duration2 = this.f;
        if(duration2 != null) {
            hfst hfst2 = hfyo.a(duration2);
            ibuq.f(hfst2, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxr gzxr2 = (gzxr)hftp1.b_message;
            hfst2.getClass();
            gzxr2.d = hfst2;
            gzxr2.b |= 2;
        }
        Duration duration3 = this.g;
        if(duration3 != null) {
            hfst hfst3 = hfyo.a(duration3);
            ibuq.f(hfst3, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxr gzxr3 = (gzxr)hftp1.b_message;
            hfst3.getClass();
            gzxr3.e = hfst3;
            gzxr3.b |= 4;
        }
        Duration duration4 = this.h;
        if(duration4 != null) {
            hfst hfst4 = hfyo.a(duration4);
            ibuq.f(hfst4, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxr gzxr4 = (gzxr)hftp1.b_message;
            hfst4.getClass();
            gzxr4.f = hfst4;
            gzxr4.b |= 8;
        }
        Duration duration5 = this.i;
        if(duration5 != null) {
            hfst hfst5 = hfyo.a(duration5);
            ibuq.f(hfst5, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxr gzxr5 = (gzxr)hftp1.b_message;
            hfst5.getClass();
            gzxr5.g = hfst5;
            gzxr5.b |= 16;
        }
        Duration duration6 = this.j;
        if(duration6 != null) {
            hfst hfst6 = hfyo.a(duration6);
            ibuq.f(hfst6, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gzxr gzxr6 = (gzxr)hftp1.b_message;
            hfst6.getClass();
            gzxr6.j = hfst6;
            gzxr6.b |= 0x80;
        }
        hfst hfst7 = hfyo.a(this.k);
        ibuq.f(hfst7, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzxr gzxr7 = (gzxr)hftp1.b_message;
        hfst7.getClass();
        gzxr7.h = hfst7;
        gzxr7.b |= 0x20;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzxr)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzya gzya0 = this.c;
        gzxt gzxt2 = (gzxt)hftp0.b_message;
        ((gzxr)hftv0).getClass();
        gzxt2.d = (gzxr)hftv0;
        gzxt2.b |= 1;
        ibuq.f(gzya0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzxt gzxt3 = (gzxt)hftp0.b_message;
        gzxt3.f = gzya0.a();
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gzxt)hftv1), "value");
        ProtoLiteBuilder hftp2 = ((gzxd)object0).a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp2.b_message;
        ((gzxt)hftv1).getClass();
        gzzc0.d = (gzxt)hftv1;
        gzzc0.c = 4;
        return ibom.a;
    }
}

