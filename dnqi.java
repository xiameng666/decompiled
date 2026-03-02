import android.accounts.Account;
import android.content.Context;
import android.content.Intent;

public final class dnqi implements ccrn {
    public final Context a;
    public final edse b;
    public final Account c;
    public final ibrt d;
    public final dqew f;
    private static final bboh g;

    static {
        dnqi.g = bboh.b("Pay", bbcu.cZ);
    }

    public dnqi(Context context0, edse edse0, Account account0, ibrt ibrt0, dqew dqew0) {
        ibuq.f(edse0, "walletInstallManager");
        ibuq.f(ibrt0, "defaultContext");
        super();
        this.a = context0;
        this.b = edse0;
        this.c = account0;
        this.d = ibrt0;
        this.f = dqew0;
    }

    public final ccnh b(int v, int v1, Intent intent0, cmeu cmeu0, ccow ccow0) {
        ccmw ccmw0 = new ccmw(intent0, cmeu0);
        ibuq.e("@com.google.android.gms:string/pay_wallet_google_wallet", "getString(...)");
        String s = this.a.getString(v);
        ibuq.e(s, "getString(...)");
        String s1 = this.a.getString(v1);
        ibuq.e(s1, "getString(...)");
        return new ccnh("@com.google.android.gms:string/pay_wallet_google_wallet", s, ccow0, ccmw0, new ccne(new ccnb(s1, ccmw0)), null, 0x60);
    }

    @Override  // ccrn
    public final Object g(ibrl ibrl0) {
        if(!dnqe.a(this.a)) {
            ((ggtj)dnqi.g.h()).x("Pay settings are not available");
            return null;
        }
        dnqg dnqg0 = new dnqg(this, null);
        return icbd.a(this.d, dnqg0, ibrl0);
    }
}

