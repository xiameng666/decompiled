import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class aiiq implements aztu, aztv {
    public static final bboh a;
    public final Context b;
    public final aztw c;
    fcfe d;
    fcfg e;
    public final String f;
    public final boolean g;
    public final byte[] h;
    public final fdjo i;
    public static final baun j;
    private final fdkg k;

    static {
        aiiq.j = new baun(new String[]{"aiiq"});
        aiiq.a = bboh.b("WearableMessageSender", bbcu.bi);
    }

    public aiiq(Context context0, aztw aztw0, fdjo fdjo0, fdkg fdkg0, String s, byte[] arr_b) {
        gftb.check(context0);
        this.b = context0;
        gftb.check(aztw0);
        this.c = aztw0;
        aztw0.j(this);
        aztw0.k(this);
        gftb.check(fdjo0);
        this.i = fdjo0;
        gftb.check(fdkg0);
        this.k = fdkg0;
        this.f = s;
        this.h = arr_b;
        this.g = true;
    }

    public final void a() {
        if(this.e == null) {
            this.e = fcfo.e(this.b);
        }
        evql evql0 = this.e.f();
        evql0.b(new aiij(this));
        evql0.A(new aiik());
    }

    @Override  // azvy
    public final void onConnected(Bundle bundle0) {
        this.k.a(this.c).e(new aiin(this));
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        aiiq.j.f("GoogleApiClient connection failed. Error code: %d", new Object[]{((int)connectionResult0.c)});
    }

    @Override  // azvy
    public final void onConnectionSuspended(int v) {
        aiiq.j.h("onConnectionSuspended with code: %d", new Object[]{v});
    }
}

