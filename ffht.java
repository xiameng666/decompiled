import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffht extends ffee {
    final String c;
    final String d;
    final int e;
    final fdiy f;
    final fflv g;

    public ffht(fflv fflv0, String s, String s1, int v, fdiy fdiy0) {
        this.c = s;
        this.d = s1;
        this.e = v;
        this.f = fdiy0;
        Objects.requireNonNull(fflv0);
        this.g = fflv0;
        super("updateConnectionStrategy");
    }

    @Override  // ffee
    public final void a() {
        try {
            felm felm0 = this.g.k;
            String s = this.d;
            int v = this.e;
            fczq fczq0 = felm0.c.c(this.c);
            if(fczq0 == null) {
                if(Log.isLoggable("Wear_ConnectionMgr", 3)) {
                    Log.d("Wear_ConnectionMgr", "updateConnectionStrategy did not find a config to update.");
                }
                throw new IllegalArgumentException("the config with the given name doesn\'t exist");
            }
            if(felm0.o(s, "updateConnectionStrategy()", fczq0, true) && felm.p(fczq0)) {
                fekq fekq0 = new fekq(felm0, fczq0, v);
                felm0.h.post(fekq0);
            }
            Status status0 = new Status(0);
            this.f.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "updateConnectionStrategy: exception during processing", exception0);
            Status status1 = new Status(8);
            this.f.a(status1);
        }
    }
}

