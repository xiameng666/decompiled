import android.content.Context;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

public final class bgor extends azts implements bgoi {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        bgor.c = azss0;
        bgoq bgoq0 = new bgoq();
        bgor.d = bgoq0;
        bgor.b = new azta_api("PasswordCheckup.ZERO_PARTY_API", bgoq0, azss0);
    }

    public bgor(Context context0) {
        super(context0, bgor.b, azsx.s, aztr_settings.a);
    }

    @Override  // bgoi
    public final evql a(CredentialManagerAccount credentialManagerAccount0) {
        azzc azzc0 = new azzc();
        azzc0.d = 26800;
        azzc0.a = new bgop(credentialManagerAccount0);
        return this.iG(azzc0.a());
    }
}

