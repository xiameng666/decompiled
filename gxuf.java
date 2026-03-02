import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public final class gxuf {
    public final gxue a;

    public gxuf(gxue gxue0) {
        this.a = gxue0;
    }

    public gxuf(String s) {
        HandlerThread handlerThread0 = new HandlerThread(s, 10);
        handlerThread0.start();
        this(new gxuk(s, handlerThread0.getLooper()));
    }

    public final Handler a() {
        return ((gxuk)this.a).c;
    }

    public final void b() {
        if(hvqf.a.n().J()) {
            Thread thread0 = Thread.currentThread();
            Thread thread1 = ((gxuk)this.a).c.getLooper().getThread();
            if(thread0.getId() != thread1.getId()) {
                throw new IllegalStateException(String.format("This method must run in the EventLoop thread \'%s (id: %s)\'. Was called from thread \'%s (id: %s)\'.", thread1.getName(), thread1.getId(), thread0.getName(), thread0.getId()));
            }
        }
    }

    public final void c() {
        gxuk gxuk0 = (gxuk)this.a;
        Looper looper0 = gxuk0.c.getLooper();
        looper0.getThread();
        looper0.getThread();
        looper0.quitSafely();
        gxuk0.e = true;
    }

    public final void d(gxum gxum0) {
        ((gxuk)this.a).a(gxum0, false);
    }

    public final void e(gxum gxum0) {
        gxuk gxuk0 = (gxuk)this.a;
        gxuh gxuh0 = new gxuh(gxuk0, gxum0);
        gxuk0.c.post(gxuh0);
    }

    public final void f(gxum gxum0) {
        ((gxuk)this.a).c.b(gxum0, 0L, false);
    }

    public final void g(gxum gxum0, long v) {
        ((gxuk)this.a).c.b(gxum0, v, false);
    }

    public final void h(gxum gxum0) {
        if(gxum0 != null) {
            ((gxuk)this.a).c.removeMessages(0, gxum0);
        }
    }

    public final boolean i(gxum gxum0) {
        return ((gxuk)this.a).c.hasMessages(0, gxum0);
    }
}

