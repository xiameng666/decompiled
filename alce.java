import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;

public final class alce {
    public static final baun a;
    public final Handler b;
    public long c;
    public int d;
    public alah e;
    public alai f;

    static {
        alce.a = new baun("ProximityAuth", new String[]{"ProximityPinger"});
    }

    public alce() {
        this.b = new clht(Looper.getMainLooper());
        this.d = 1;
    }

    final void a() {
        alce.a.h("Stopping proximity pinger", new Object[0]);
        this.b.removeCallbacksAndMessages(null);
        this.e = null;
        this.f = null;
        this.d = 1;
    }

    public final void b() {
        alai alai0 = this.f;
        if(alai0 != null) {
            String s = alai0.a.c;
            albe albe0 = alai0.a.b;
            if(albe0.r != null) {
                try {
                    alfw alfw0 = albe0.r;
                    Parcel parcel0 = alfw0.jo();
                    parcel0.writeString(s);
                    alfw0.jp(6, parcel0);
                }
                catch(RemoteException remoteException0) {
                    albe.a.g("Could not process stream termination warning", remoteException0, new Object[0]);
                }
                return;
            }
            albe.a.h("signalingService is not available to send stream termination warning", new Object[0]);
            return;
        }
        alce.a.f("No warning listener to notify", new Object[0]);
    }

    public final boolean c() {
        return this.e != null;
    }
}

