import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class gyjj extends gykk {
    public final gyjd a;
    public final String b;
    public final gykl c;
    public final AtomicInteger d;
    public final gxuf e;
    final gykr f;
    final gykr g;
    public final gxum h;
    public static final int i;
    private final Callable n;

    public gyjj(gyjd gyjd0, gxuf gxuf0) {
        this.d = new AtomicInteger(0);
        this.f = new gyjg(this);
        this.g = new gyjh(this);
        this.h = new gyji(this);
        this.a = gyjd0;
        String s = gyjd0.getClass().getSimpleName();
        this.b = s;
        gyim gyim0 = this.f(gyjd0.a().getClass());
        this.e = gxuf0;
        this.n = new gyje(this, gxuf0, gyjd0, gyim0);
        this.c = new gykl(s, new gyjf(gyim0, gyjd0));
    }

    @Override  // gykk
    public final gyhu a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyhu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = this.l;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gyhu)hftv0).b |= 1;
        ((gyhu)hftv0).c = s;
        gyhw gyhw0 = this.c.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyhu)hftp0.b_message).d = gyhw0.j;
        ((gyhu)hftp0.b_message).b |= 2;
        return (gyhu)hftp0.N_build();
    }

    @Override  // gykk
    public final void b() {
        gxuf gxuf0 = this.e;
        gxuf0.b();
        gykl gykl0 = this.c;
        if(gykl0.f()) {
            if(gykl0.i()) {
                gykl0.b();
                gykl0.d();
                return;
            }
            if(this.d.get() == 0) {
                ((ggtj)((ggtj)gyke.a.j()).ar(0x4F45)).B("%s hasn\'t been active yet", this.b);
                this.d();
                return;
            }
            gxuf0.f(this.h);
        }
    }

    @Override  // gykk
    public final void c() {
        this.e.b();
        gykl gykl0 = this.c;
        if(gykl0.h()) {
            gykl0.e();
            try {
                this.n.call();
            }
            catch(Exception exception0) {
                ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(exception0)).ar(0x4F47)).B("%s ERROR starting operation!", this.b);
                this.c.c();
            }
        }
    }

    public final void d() {
        this.e.b();
        this.c.b();
        try {
            this.a.c(this.g);
        }
        catch(Exception exception0) {
            ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(exception0)).ar(0x4F48)).B("%s ERROR in canceling!", this.b);
            this.c.c();
        }
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.c);
        switch(this.d.get()) {
            case 0: {
                return "AsynchronousOperationTask{name=\'" + this.b + "\', state=" + s + ", hasStarted=" + "START_NOT_CALLED" + ", operation=" + this.a + "}";
            }
            case 1: {
                return "AsynchronousOperationTask{name=\'" + this.b + "\', state=" + s + ", hasStarted=" + "START_CALLED" + ", operation=" + this.a + "}";
            }
            case 2: {
                return "AsynchronousOperationTask{name=\'" + this.b + "\', state=" + s + ", hasStarted=" + "START_COMPLETE" + ", operation=" + this.a + "}";
            }
            default: {
                return "AsynchronousOperationTask{name=\'" + this.b + "\', state=" + s + ", hasStarted=" + "START_STATE_UNKNOWN" + ", operation=" + this.a + "}";
            }
        }
    }
}

