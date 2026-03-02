import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class fwwp {
    public static final fwwp a;
    public final List b;
    public final Map c;
    public long d;

    static {
        fwwp.a = new fwwp();
    }

    private fwwp() {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = -1L;
    }

    public final void a(PrintWriter printWriter0, long v) {
        synchronized(this) {
            printWriter0.println("####NlpWakeLockStats (since last process restart)###");
            long v2 = this.d;
            if(v2 == -1L) {
                printWriter0.println("WakeLockTracker not initialized");
                return;
            }
            long v3 = v - v2 > 0L ? v - v2 : 1L;
            printWriter0.println("Time since first lock: " + fwwp.b(v3));
            printWriter0.println("--Locks currently held:");
            List list0 = this.b;
            for(Object object0: list0) {
                fwwo fwwo0 = (fwwo)object0;
                if(fwwo0.b()) {
                    long v4 = fwwo0.a(v);
                    boolean z = fwwo0.b();
                    printWriter0.println(fwwo0.c + " timeHeld= " + (fwwp.b(v4) + (((int)(((double)v4) / ((double)v3) * 100.0)) + "%")) + " isHeld=" + z);
                }
            }
            printWriter0.println("--Locks that timed out:");
            for(Object object1: list0) {
                fwwo fwwo1 = (fwwo)object1;
                if(!fwwo1.b()) {
                    boolean z1 = fwwo1.b();
                    printWriter0.println(fwwo1.c + " isHeld=" + z1);
                }
            }
            printWriter0.println("--Historical locks:");
            for(Object object2: this.c.entrySet()) {
                ((fvtp)((Map.Entry)object2).getValue()).b(((String)((Map.Entry)object2).getKey()), printWriter0, v3);
            }
            printWriter0.println();
        }
    }

    private static final String b(long v) {
        return v + "ms (" + v / 60000L + "min) ";
    }
}

