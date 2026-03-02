import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

public final class bech extends azts implements aztx, becb {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        bech.c = azss0;
        becg becg0 = new becg();
        bech.d = becg0;
        bech.b = new azta_api("CredentialManager.API", becg0, azss0);
    }

    public bech(Context context0) {
        super(context0, bech.b, azsx.s, aztr_settings.a);
    }

    @Override  // becb
    public final evql b(CredentialManagerAccount credentialManagerAccount0, CallerInfo callerInfo0) {
        azzc azzc0 = new azzc();
        azzc0.d = 26701;
        azzc0.c = new Feature[]{bgot.a};
        azzc0.a = new bece(credentialManagerAccount0, callerInfo0);
        return this.iG(azzc0.a());
    }

    @Override  // becb
    public final evql c(bdhr bdhr0) {
        azzc azzc0 = new azzc();
        azzc0.d = 26702;
        azzc0.c = new Feature[]{bgot.a};
        azzc0.a = new becf(bdhr0);
        return this.iG(azzc0.a());
    }

    @Override  // becb
    public final evql d() {
        azzc azzc0 = new azzc();
        azzc0.d = 26705;
        azzc0.c = new Feature[]{bgot.b};
        azzc0.a = new becc();
        return this.iG(azzc0.a());
    }

    @Override  // becb
    public final evql e(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.d = 26706;
        azzc0.c = new Feature[]{bgot.c};
        azzc0.a = new becd(z);
        return this.iG(azzc0.a());
    }
}

