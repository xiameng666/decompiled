import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.Feature;

public final class alez extends azts {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        alez.c = azss0;
        alev alev0 = new alev();
        alez.d = alev0;
        alez.b = new azta_api("ProximityAuth.DeviceSyncApi", alev0, azss0);
    }

    public alez(Context context0) {
        super(context0, alez.b, null, aztr_settings.a);
    }

    public final evql b(gqus gqus0, Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ales(this, gqus0, account0);
        azzc0.d = 0x63E;
        return this.iG(azzc0.a());
    }

    public final evql c() {
        azzc azzc0 = new azzc();
        azzc0.d = 1590;
        azzc0.a = new alep(this);
        return this.iG(azzc0.a());
    }

    public final evql e(gqus gqus0, boolean z, Account account0) {
        azzc azzc0 = new azzc();
        azzc0.d = 0x639;
        azzc0.a = new aleu(gqus0, z, account0);
        return this.jn(azzc0.a());
    }

    public final void f(Account account0) {
        azzc azzc0 = new azzc();
        azzc0.a = new aleq(account0);
        azzc0.c = new Feature[]{amkb.a};
        azzc0.d = 0x63F;
        this.jn(azzc0.a());
    }
}

