import android.os.SystemClock;
import j..util.Objects;
import java.util.Iterator;
import java.util.Map.Entry;

final class gyfv extends gxum {
    final gyga a;

    public gyfv(gyga gyga0) {
        Objects.requireNonNull(gyga0);
        this.a = gyga0;
        super("FastPairScanner_checkForLost");
    }

    @Override
    public final void run() {
        gyga gyga0 = this.a;
        Iterator iterator0 = gyga0.c.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Map.Entry map$Entry0 = (Map.Entry)object0;
            long v = SystemClock.elapsedRealtime() - ((long)(((Long)map$Entry0.getValue())));
            if(gyga0.a() <= v) {
                iterator0.remove();
                gyfy gyfy0 = gyga0.d;
                if(gyfy0 != null) {
                    gyfy0.b(((String)map$Entry0.getKey()));
                }
            }
        }
        gyga0.b();
    }
}

