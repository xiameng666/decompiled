import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.FidoFirstPartyApiOptions;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.common.Feature;

public final class ahow extends azts implements ahmb {
    private static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        ahow.b = azss0;
        ahor ahor0 = new ahor();
        ahow.c = ahor0;
        ahow.a = new azta_api("Auth.Api.Fido.FirstParty.API", ahor0, azss0);
    }

    public ahow(Context context0, FidoFirstPartyApiOptions fidoFirstPartyApiOptions0) {
        super(context0, ahow.a, fidoFirstPartyApiOptions0, aztr_settings.a);
    }

    @Override  // ahmb
    public final evql b(String s, ByteString hfsf0, int v, String s1) {
        azzc azzc0 = new azzc();
        azzc0.a = new ahog(this, s, hfsf0, v, s1);
        azzc0.d = 0x6A3;
        azzc0.c = new Feature[]{amju.r};
        return this.iG(azzc0.a());
    }

    @Override  // ahmb
    public final evql c(AuthenticationOptions authenticationOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ahoh(this, authenticationOptions0);
        azzc0.d = 0x6A1;
        azzc0.c = new Feature[]{amju.p};
        return this.iG(azzc0.a());
    }

    @Override  // ahmb
    public final evql d(RegistrationOptions registrationOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ahom(this, registrationOptions0);
        azzc0.d = 0x6A0;
        azzc0.c = new Feature[]{amju.q};
        return this.iG(azzc0.a());
    }

    @Override  // ahmb
    public final evql e(String s, Account account0) {
        gftb.z(s, "Null sessionId passed in");
        azzc azzc0 = new azzc();
        azzc0.a = new ahoo(this, s, account0);
        azzc0.d = 0x6BB;
        azzc0.c = new Feature[]{amju.n};
        return this.iG(azzc0.a());
    }

    @Override  // ahmb
    public final evql f(String s, String s1) {
        azzc azzc0 = new azzc();
        azzc0.a = new ahoj(this, s, s1);
        azzc0.d = 0x6B2;
        azzc0.c = new Feature[]{amju.u};
        return this.iG(azzc0.a());
    }
}

