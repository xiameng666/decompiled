import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gydy implements gykt {
    public final CountDownLatch a;
    public final gyea b;
    public final gyjo c;
    public final gyey d;
    public final gyhf e;
    public final AtomicBoolean f;
    public gydz g;
    public gyjp h;
    public int i;

    public gydy(Context context0, gyhf gyhf0) {
        this.c = (gyjo)cusq.c(context0, gyjo.class);
        this.b = (gyea)cusq.c(context0, gyea.class);
        this.d = (gyey)cusq.c(context0, gyey.class);
        this.e = gyhf0;
        this.f = new AtomicBoolean(false);
        this.i = gyhm.a(gyhf0.e) == 0 ? 1 : gyhm.a(gyhf0.e);
        this.a = new CountDownLatch(1);
    }

    public final gyhg a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyhg.a).v_newBuilder();
        if(this.h != null && this.h.f()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gyhg)hftp0.b_message).d = 2;
            ((gyhg)hftp0.b_message).b |= 2;
            gyhi gyhi0 = this.h.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyhg gyhg0 = (gyhg)hftp0.b_message;
            gyhi0.getClass();
            gyhg0.e = gyhi0;
            gyhg0.b |= 4;
            return (gyhg)hftp0.N_build();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyhg)hftp0.b_message).d = 1;
        ((gyhg)hftp0.b_message).b |= 2;
        return (gyhg)hftp0.N_build();
    }

    @Override  // gykt
    public final gyjk b(gyim gyim0) {
        return new gydx(this, gyim0);
    }

    public static void c(Context context0, gyhf gyhf0) {
        if(gyhm.a(gyhf0.e) == 2 && ((gyhf0.b & 2) == 0 || gyhf0.d.size() == 0)) {
            throw new gyla("Secret key not set for SPAKE connection");
        }
        gyey gyey0 = (gyey)cusq.e(context0, gyey.class);
        if(gyey0 != null && gyey0.o()) {
            return;
        }
        throw new gylc(gyey.class, gydy.class);
    }

    @Override  // gykt
    public final MessageLite d() {
        return this.a();
    }

    @Override  // gykt
    public final void e(gykr gykr0) {
        this.f();
        this.d.e(gykr0);
    }

    public final void f() {
        this.c.b(this.h);
        if(this.f.compareAndSet(false, true)) {
            this.a.countDown();
            gydz gydz0 = this.g;
            if(gydz0 != null) {
                this.b.e(gydz0);
            }
        }
    }
}

