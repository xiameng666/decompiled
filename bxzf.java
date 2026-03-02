import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest;
import com.google.android.gms.identitycredentials.RegistrationRequest;

public final class bxzf extends azts implements bxuv {
    public static final int a;
    private static final bxyy b;
    private static final azta_api c;
    private static final azss d;

    static {
        azss azss0 = new azss();
        bxzf.d = azss0;
        bxyy bxyy0 = new bxyy();
        bxzf.b = bxyy0;
        bxzf.c = new azta_api("IdentityCredentials.API", bxyy0, azss0);
    }

    public bxzf(Context context0) {
        ibuq.f(context0, "context");
        super(context0, bxzf.c, azsx.s, aztr_settings.a);
    }

    @Override  // bxuv
    public final evql a(ClearRegistryRequest clearRegistryRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{bxtr.c};
        azzc0.a = new bxyw(clearRegistryRequest0);
        azzc0.d = 0x7FBF;
        return this.jn(azzc0.a());
    }

    @Override  // bxuv
    public final evql b(CreateCredentialRequest createCredentialRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{bxtr.g};
        azzc0.a = new bxyv(createCredentialRequest0);
        azzc0.d = 0x7FC0;
        return this.jn(azzc0.a());
    }

    @Override  // bxuv
    public final evql c(GetCredentialRequest getCredentialRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{bxtr.a};
        azzc0.a = new bxys(getCredentialRequest0);
        azzc0.d = 0x7FBD;
        return this.iG(azzc0.a());
    }

    @Override  // bxuv
    public final evql d(RegisterCreationOptionsRequest registerCreationOptionsRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{bxtr.b};
        azzc0.a = new bxyx(registerCreationOptionsRequest0);
        azzc0.d = 0x7FC3;
        return this.jn(azzc0.a());
    }

    @Override  // bxuv
    public final evql e(RegistrationRequest registrationRequest0) {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{bxtr.b};
        azzc0.a = new bxyu(registrationRequest0);
        azzc0.d = 0x7FBE;
        return this.jn(azzc0.a());
    }
}

