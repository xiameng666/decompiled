import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.UUID;

public final class bmfn extends azts {
    public final UUID a;
    public static final int b;
    private static final azta_api c;
    private static final azss d;

    static {
        azss azss0 = new azss();
        bmfn.d = azss0;
        bmfn.c = new azta_api("Fido.FIDO2_ZERO_PARTY_API", new bmnt(), azss0);
    }

    public bmfn(Context context0) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        super(context0, bmfn.c, azsx.s, aztr0);
        this.a = UUID.randomUUID();
    }

    public final evql e(BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmfa(this, browserPublicKeyCredentialCreationOptions0);
        azzc0.d = 5443;
        azzc0.c = new Feature[]{blfo.u};
        return this.iG(azzc0.a());
    }

    public final evql f(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmet(this, publicKeyCredentialCreationOptions0, s, z);
        azzc0.d = 5452;
        azzc0.c = new Feature[]{blfo.A};
        return this.iG(azzc0.a());
    }

    public final evql g(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmey(this, publicKeyCredentialRequestOptions0, s, z);
        azzc0.d = 5451;
        azzc0.c = new Feature[]{blfo.z};
        return this.iG(azzc0.a());
    }

    public final evql h(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0, String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmeu(this, publicKeyCredentialCreationOptions0, s);
        azzc0.d = 5440;
        azzc0.c = new Feature[]{blfo.r};
        return this.iG(azzc0.a());
    }

    public final evql i(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0, String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmer(this, publicKeyCredentialRequestOptions0, s);
        azzc0.d = 5441;
        azzc0.c = new Feature[]{blfo.s};
        return this.iG(azzc0.a());
    }

    public final evql j(BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions0, String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmeq(this, browserPublicKeyCredentialCreationOptions0, s, z);
        azzc0.d = 5454;
        azzc0.c = new Feature[]{blfo.C};
        return this.iG(azzc0.a());
    }

    public final evql k(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0, String s, boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmes(this, browserPublicKeyCredentialRequestOptions0, s, z);
        azzc0.d = 5453;
        azzc0.c = new Feature[]{blfo.B};
        return this.iG(azzc0.a());
    }

    public final evql l(BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmep(this, browserPublicKeyCredentialRequestOptions0);
        azzc0.d = 5448;
        azzc0.c = new Feature[]{blfo.y};
        return this.iG(azzc0.a());
    }

    @Deprecated
    public final evql m(StateUpdate stateUpdate0) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmeo(this, stateUpdate0);
        azzc0.c = new Feature[]{blfo.l, blfo.m};
        azzc0.d = 5419;
        return this.iG(azzc0.a());
    }
}

