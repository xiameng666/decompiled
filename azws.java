import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

public final class azws implements azwx {
    private final azxa a;

    public azws(azxa azxa0) {
        this.a = azxa0;
    }

    @Override  // azwx
    public final azvc a(azvc azvc0) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override  // azwx
    public final void b() {
        azxa azxa0 = this.a;
        for(Object object0: azxa0.f.values()) {
            ((azsz)object0).m();
        }
        azxa0.l.j = Collections.EMPTY_SET;
    }

    @Override  // azwx
    public final void c() {
        this.a.a.lock();
        try {
            this.a.j = new azwr(this.a, this.a.h, this.a.i, this.a.d, this.a.n, this.a.a, this.a.c);
            this.a.j.b();
            this.a.b.signalAll();
        }
        finally {
            this.a.a.unlock();
        }
    }

    @Override  // azwx
    public final void d(Bundle bundle0) {
    }

    @Override  // azwx
    public final void e(ConnectionResult connectionResult0, azta_api azta0, boolean z) {
    }

    @Override  // azwx
    public final void f(int v) {
    }

    @Override  // azwx
    public final void g(azvc azvc0) {
        this.a.l.g.add(azvc0);
    }

    @Override  // azwx
    public final void h() {
    }
}

