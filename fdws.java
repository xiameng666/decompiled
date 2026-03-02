import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

public final class fdws extends fdvx {
    public long a;
    public fdzl b;
    private final Object c;
    private Map d;
    private fdwq e;

    public fdws() {
        this.c = new Object();
        this.d = new HashMap();
        this.e = new fdwq();
        this.a = SystemClock.elapsedRealtime();
    }

    private fdws(fdws fdws0) {
        this.c = new Object();
        this.d = new HashMap();
        this.e = new fdwq();
        synchronized(fdws0.c) {
            this.d = fdws0.d;
            this.e = fdws0.e;
            this.a = fdws0.a;
        }
    }

    @Override  // fdvx
    public final void a(fdvw fdvw0, String s, int v) {
        super.a(fdvw0, s, v);
        synchronized(this.c) {
            fdws.b(this.e, s, ((long)v));
            String s1 = fdvw0.b;
            if(s1 != null) {
                ffaw ffaw0 = fdvw0.a;
                if(ffaw0 != null) {
                    fdwr fdwr0 = new fdwr(ffaw0, s1);
                    if(!this.d.containsKey(fdwr0)) {
                        this.d.put(fdwr0, new fdwq());
                    }
                    fdws.b(((fdwq)this.d.get(fdwr0)), s, ((long)v));
                }
            }
            fdzl fdzl0 = this.b;
            if(fdzl0 != null) {
                fdws fdws0 = fdzl0.a;
                if(SystemClock.elapsedRealtime() - fdws0.a > hzvp.a.b().a()) {
                    synchronized(fdws0.c) {
                        new fdws(fdws0);
                        fdws0.d = new HashMap();
                        fdws0.e = new fdwq();
                        fdws0.a = SystemClock.elapsedRealtime();
                    }
                    ffgp.i().d(new fdzk());
                }
            }
        }
    }

    private static final void b(fdwq fdwq0, String s, long v) {
        switch(s.hashCode()) {
            case 0x86C860F1: {
                if(s.equals("bytesRecv")) {
                    fdwq0.b += v;
                    return;
                }
                break;
            }
            case -2033658205: {
                if(s.equals("bytesSent")) {
                    fdwq0.a += v;
                    return;
                }
                break;
            }
            case -1265943016: {
                if(s.equals("msgsRecv")) {
                    fdwq0.d += v;
                    return;
                }
                break;
            }
            case 0xB48BB3CA: {
                if(s.equals("msgsSent")) {
                    fdwq0.c += v;
                    return;
                }
                break;
            }
        }
    }
}

