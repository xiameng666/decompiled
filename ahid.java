import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

public final class ahid implements glzm {
    public static final bxrs a;
    private final CredentialRequest b;
    private final String c;
    private final bxod d;
    private final String e;

    static {
        ahid.a = new bxrs(((gful_cronetEngineProvider)new ahib()));
    }

    public ahid(CredentialRequest credentialRequest0, String s, bxod bxod0, String s1) {
        this.b = credentialRequest0;
        this.c = s;
        this.d = bxod0;
        this.e = s1;
    }

    @Override  // glzm
    public final gmcd a() {
        BeginSignInRequest.GoogleIdTokenRequestOptions beginSignInRequest$GoogleIdTokenRequestOptions0 = ahpk.a(false, null, null, true, null, null, false, null);
        BeginSignInRequest.PasskeysRequestOptions beginSignInRequest$PasskeysRequestOptions0 = new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
        BeginSignInRequest.PasskeyJsonRequestOptions beginSignInRequest$PasskeyJsonRequestOptions0 = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
        BeginSignInRequest beginSignInRequest0 = ahpj.a(new BeginSignInRequest.PasswordRequestOptions(true), beginSignInRequest$GoogleIdTokenRequestOptions0, beginSignInRequest$PasskeysRequestOptions0, beginSignInRequest$PasskeyJsonRequestOptions0, this.e, true, 0, false);
        return ((ahfp)((bxrz)adxm.a.mr()).B(new adxm(axzh.b(this.c), this.e, beginSignInRequest0, this.d, this.b))).c().k(new ahic());
    }
}

