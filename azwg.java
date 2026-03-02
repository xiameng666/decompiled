import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public final class azwg implements azwx {
    public final azxa a;

    public azwg(azxa azxa0) {
        this.a = azxa0;
    }

    @Override  // azwx
    public final azvc a(azvc azvc0) {
        try {
            this.a.l.m.a(azvc0);
            azsz azsz0 = (azsz)this.a.l.i.get(azvc0.b);
            batl.t(azsz0, "Appropriate Api was not requested.");
            if(!azsz0.A() && this.a.g.containsKey(azvc0.b)) {
                azvc0.a(new Status(17));
                return azvc0;
            }
            azvc0.i(azsz0);
        }
        catch(DeadObjectException unused_ex) {
            azwf azwf0 = new azwf(this, this);
            this.a.g(azwf0);
        }
        return azvc0;
    }

    @Override  // azwx
    public final void b() {
    }

    @Override  // azwx
    public final void c() {
    }

    @Override  // azwx
    public final void d(Bundle bundle0) {
    }

    @Override  // azwx
    public final void e(ConnectionResult connectionResult0, azta_api azta0, boolean z) {
    }

    @Override  // azwx
    public final void f(int v) {
        this.a.j();
        this.a.m.x(v);
    }

    @Override  // azwx
    public final void g(azvc azvc0) {
        this.a(azvc0);
    }

    @Override  // azwx
    public final void h() {
        this.a.j();
    }
}

