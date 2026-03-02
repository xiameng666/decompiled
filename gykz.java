import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class gykz extends gykk {
    public final gykt a;
    public final String b;
    public final gxuf c;
    final gykl d;
    final gxum e;
    public boolean f;
    public static final int g;
    private final Executor h;
    private final Callable i;
    private gyjk n;

    public gykz(gykt gykt0, gxuf gxuf0, Executor executor0) {
        this.e = new gykx(this);
        this.a = gykt0;
        String s = gykt0.getClass().getSimpleName();
        this.b = s;
        this.c = gxuf0;
        this.h = executor0;
        this.f = false;
        this.n = null;
        gyim gyim0 = this.f(gykt0.d().getClass());
        this.i = new gykv(gykt0, gyim0);
        this.d = new gykl(s, new gyky(this, gyim0, gykt0));
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
        gyhw gyhw0 = this.d.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyhu)hftp0.b_message).d = gyhw0.j;
        ((gyhu)hftp0.b_message).b |= 2;
        return (gyhu)hftp0.N_build();
    }

    @Override  // gykk
    public final void b() {
        this.c.b();
        gykl gykl0 = this.d;
        if(gykl0.f()) {
            if(gykl0.i()) {
                gykl0.b();
                gykl0.d();
                return;
            }
            if(this.n != null) {
                gykl0.b();
                try {
                    gyjk gyjk0 = this.n;
                    batl.s(gyjk0);
                    gyjk0.a();
                }
                catch(Exception exception0) {
                    ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(exception0)).ar(20330)).B("%s ERROR in canceling!", this.b);
                }
            }
        }
    }

    @Override  // gykk
    public final void c() {
        this.c.b();
        gykl gykl0 = this.d;
        if(gykl0.h()) {
            gykl0.e();
            try {
                batl.s(this.i);
                this.n = (gyjk)this.i.call();
            }
            catch(Exception exception0) {
                ((ggtj)((ggtj)((ggtj)gyke.a.i()).s(exception0)).ar(0x4F6E)).B("%s ERROR starting operation!", this.b);
                this.f = true;
                this.d.c();
                return;
            }
            this.d.a();
            gyjk gyjk0 = this.n;
            if(gyjk0 == null) {
                this.c.f(this.e);
                return;
            }
            gyku gyku0 = new gyku(this, gyjk0);
            this.h.execute(gyku0);
        }
    }

    @Override
    public final String toString() {
        return "SynchronousOperationTask{name=\'" + this.b + "\', state=" + this.d + ", operation=" + this.a + "}";
    }
}

