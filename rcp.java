import android.content.Context;

final class rcp implements rck {
    public hgyh b;
    public final rcr c;

    public rcp(Context context0, hgyh hgyh0) {
        rcr rcr0 = new rcr(context0);
        super();
        this.c = rcr0;
        this.b = hgyh0;
    }

    @Override  // rck
    public final void a(hgxx hgxx0) {
        try {
            this.f(hgxx0, this.b);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingLogger", "Unable to log.", throwable0);
        }
    }

    @Override  // rck
    public final void b(hgxx hgxx0, long v, boolean z) {
        hgyh hgyh0;
        try {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hgxx0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hgxx0));
            hgyn hgyn0 = hgxx0.c == 7 ? ((hgyn)hgxx0.d) : hgyn.a;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyn0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)hgyn0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgyn hgyn1 = (hgyn)hftp1.b_message;
            hgyn1.b |= 2;
            hgyn1.e = z;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgxx hgxx1 = (hgxx)hftp0.b_message;
            hgyn hgyn2 = (hgyn)hftp1.N_build();
            hgyn2.getClass();
            hgxx1.d = hgyn2;
            hgxx1.c = 7;
            hgxx hgxx2 = (hgxx)hftp0.N_build();
            if(v == 0L) {
                hgyh0 = this.b;
            }
            else {
                hgyh hgyh1 = this.b;
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh1).jf(5, null);
                hftp2.X(((ProtoLiteMessage)hgyh1));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgyh hgyh2 = (hgyh)hftp2.b_message;
                hgyh2.b |= 0x20;
                hgyh2.g = v;
                hgyh0 = (hgyh)hftp2.N_build();
            }
            this.f(hgxx2, hgyh0);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingLogger", "Unable to log.", throwable0);
        }
    }

    @Override  // rck
    public final void c(hgxz hgxz0) {
        try {
            this.g(hgxz0, this.b);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingLogger", "Unable to log.", throwable0);
        }
    }

    @Override  // rck
    public final void d(hgxz hgxz0, long v, boolean z) {
        hgyh hgyh0;
        try {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hgxz0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hgxz0));
            hgyn hgyn0 = hgxz0.c == 4 ? ((hgyn)hgxz0.d) : hgyn.a;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyn0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)hgyn0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgyn hgyn1 = (hgyn)hftp1.b_message;
            hgyn1.b |= 2;
            hgyn1.e = z;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgxz hgxz1 = (hgxz)hftp0.b_message;
            hgyn hgyn2 = (hgyn)hftp1.N_build();
            hgyn2.getClass();
            hgxz1.d = hgyn2;
            hgxz1.c = 4;
            hgxz hgxz2 = (hgxz)hftp0.N_build();
            if(v == 0L) {
                hgyh0 = this.b;
            }
            else {
                hgyh hgyh1 = this.b;
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hgyh1).jf(5, null);
                hftp2.X(((ProtoLiteMessage)hgyh1));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hgyh hgyh2 = (hgyh)hftp2.b_message;
                hgyh2.b |= 0x20;
                hgyh2.g = v;
                hgyh0 = (hgyh)hftp2.N_build();
            }
            this.g(hgxz2, hgyh0);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingLogger", "Unable to log.", throwable0);
        }
    }

    @Override  // rck
    public final void e(hgyp hgyp0) {
        try {
            rcr rcr0 = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgyo.a).v_newBuilder();
            hgyh hgyh0 = this.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            hgyh0.getClass();
            ((hgyo)hftv0).e = hgyh0;
            ((hgyo)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgyo hgyo0 = (hgyo)hftp0.b_message;
            hgyp0.getClass();
            hgyo0.d = hgyp0;
            hgyo0.c = 8;
            rcr0.a(((hgyo)hftp0.N_build()));
        }
        catch(Throwable throwable0) {
            rdk.i("BillingLogger", "Unable to log.", throwable0);
        }
    }

    public final void f(hgxx hgxx0, hgyh hgyh0) {
        if(hgxx0 != null) {
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgyo.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                hgyh0.getClass();
                ((hgyo)hftv0).e = hgyh0;
                ((hgyo)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgyo)hftp0.b_message).d = hgxx0;
                ((hgyo)hftp0.b_message).c = 2;
                hgyo hgyo0 = (hgyo)hftp0.N_build();
                this.c.a(hgyo0);
            }
            catch(Throwable throwable0) {
                rdk.i("BillingLogger", "Unable to log.", throwable0);
            }
        }
    }

    private final void g(hgxz hgxz0, hgyh hgyh0) {
        if(hgxz0 != null) {
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgyo.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                hgyh0.getClass();
                ((hgyo)hftv0).e = hgyh0;
                ((hgyo)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgyo)hftp0.b_message).d = hgxz0;
                ((hgyo)hftp0.b_message).c = 3;
                hgyo hgyo0 = (hgyo)hftp0.N_build();
                this.c.a(hgyo0);
            }
            catch(Throwable throwable0) {
                rdk.i("BillingLogger", "Unable to log.", throwable0);
            }
        }
    }
}

