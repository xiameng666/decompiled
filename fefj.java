import android.util.Log;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class fefj implements ffmj {
    final ggca a;
    public final Map b;
    int c;
    private final String d;

    public fefj(String s) {
        this.a = new ggca(20);
        this.b = new HashMap();
        this.c = 0;
        this.d = s;
    }

    public final void a() {
        synchronized(this) {
            int v1 = this.c + 1;
            this.c = v1;
            this.a.add(new fefi(v1, System.currentTimeMillis()));
            fefj.d(("[" + this.d + "] BluetoothGattHelper was incremented to " + this.c));
        }
    }

    public final void b(fefh fefh0) {
        synchronized(this) {
            this.c(fefh0).add(new fefi(this.c, System.currentTimeMillis()));
            fefj.d(("[" + this.d + "] SessionId for " + fefh0 + " was updated to " + this.c));
        }
    }

    private final ggca c(fefh fefh0) {
        ggca ggca0;
        synchronized(this) {
            Map map0 = this.b;
            ggca0 = (ggca)map0.get(fefh0);
            if(ggca0 == null) {
                ggca ggca1 = new ggca(20);
                map0.put(fefh0, ggca1);
                return ggca1;
            }
        }
        return ggca0;
    }

    private static void d(String s) {
        if(Log.isLoggable("SessionRecorder", 3)) {
            Log.d("SessionRecorder", s);
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.b();
        bbpd0.println("SessionRecorder [" + this.d + "] current sessionId is " + this.c);
        bbpd0.b();
        bbpd0.println("BluetoothGattHelper sessionIds changeLog:");
        bbpd0.b();
        for(Object object0: this.a) {
            bbpd0.println(((fefi)object0).toString());
        }
        bbpd0.a();
        for(Object object1: this.b.entrySet()) {
            bbpd0.println("Handler " + ((Map.Entry)object1).getKey() + " sessionIds changeLog:");
            bbpd0.b();
            for(Object object2: ((ggca)((Map.Entry)object1).getValue())) {
                bbpd0.println(((fefi)object2).toString());
            }
            bbpd0.a();
        }
        bbpd0.a();
        bbpd0.a();
    }
}

