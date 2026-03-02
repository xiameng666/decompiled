import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class aikr implements aztu, aztv {
    public int a;
    private final String b;
    private final aztw c;
    private azuk d;
    private static final baun e;

    static {
        aikr.e = new baun(new String[]{"ProfilePictureFetcher"});
    }

    public aikr(Context context0, String s, xob xob0) {
        this.a = 1;
        this.b = s;
        efol efol0 = new efol();
        efol0.a = 0x9F;
        efom efom0 = efol0.a();
        aztt aztt0 = new aztt(context0);
        aztt0.d(efon.a, efom0);
        if(xob0 != null) {
            aztt0.g(xob0, 0x9F, this);
        }
        aztw aztw0 = aztt0.a();
        this.c = aztw0;
        aztw0.j(this);
        aztw0.k(this);
    }

    public final void a(azuk azuk0) {
        gftb.check(azuk0);
        this.d = azuk0;
        this.c.f();
    }

    @Override  // azvy
    public final void onConnected(Bundle bundle0) {
        efon.c.a(this.c, this.b, this.a, 0).e(this.d);
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        aikr.e.m("Failed to load Image due to connection failure : " + connectionResult0.c, new Object[0]);
    }

    @Override  // azvy
    public final void onConnectionSuspended(int v) {
        this.c.f();
    }
}

