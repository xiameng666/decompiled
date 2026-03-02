import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import j..util.Objects;
import java.text.SimpleDateFormat;
import java.util.Locale;

final class gxuj extends clht {
    final gxuk a;

    public gxuj(gxuk gxuk0, Looper looper0) {
        Objects.requireNonNull(gxuk0);
        this.a = gxuk0;
        super(looper0);
    }

    public final boolean b(gxum gxum0, long v, boolean z) {
        gxuk gxuk0 = this.a;
        if(gxuk0.e) {
            ((ggtj)gxuk0.d.j()).B("%s not posted since EventLoop is destroyed", gxum0);
            return false;
        }
        long v1 = SystemClock.elapsedRealtime() + v;
        Message message0 = this.obtainMessage(0, ((int)(v1 >> 0x20)), ((int)v1), gxum0);
        boolean z1 = z ? this.sendMessageAtFrontOfQueue(message0) : this.sendMessageDelayed(message0, v);
        if(!z1) {
            ((ggtj)gxuk0.d.j()).B("%s not posted since looper is exiting", gxum0);
        }
        return z1;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        gxum gxum0 = (gxum)message0.obj;
        gxuk gxuk0 = this.a;
        if(gxuk0.e) {
            ((ggtj)gxuk0.d.j()).B("Runnable %s attempted to run after the EventLoop was destroyed. Ignoring.", gxum0);
            return;
        }
        bboh bboh0 = gxuk0.d;
        if(((ggtj)bboh0.j()).ag()) {
            long v = (long)message0.arg1;
            long v1 = (long)message0.arg2;
            long v2 = SystemClock.elapsedRealtime() - (v << 0x20 | v1 & 0xFFFFFFFFL);
            if(v2 > gxuk.b) {
                String s = new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(v2));
                ((ggtj)bboh0.j()).R("%s was delayed for %s", gxum0, s);
            }
        }
        long v3 = SystemClock.elapsedRealtime();
        try {
            gxum0.run();
        }
        catch(Exception exception0) {
            a.e(this.a.d.i(), "%s crashed.", gxum0, exception0);
            throw exception0;
        }
        finally {
            bboh bboh1 = this.a.d;
            if(((ggtj)bboh1.j()).ag()) {
                long v5 = SystemClock.elapsedRealtime() - v3;
                if(v5 > gxuk.a) {
                    String s1 = new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(v5));
                    ((ggtj)bboh1.j()).R("%s ran for %s", gxum0, s1);
                }
            }
        }
    }
}

