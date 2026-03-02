import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class bmei extends azts {
    private static final azta_api a;
    private static final azss b;

    static {
        azss azss0 = new azss();
        bmei.b = azss0;
        bmei.a = new azta_api("Fido.FIDO2_API", new bmnl(), azss0);
    }

    @Deprecated
    public bmei(Context context0) {
        aztq aztq0 = new aztq();
        aztq0.a = new azuw();
        aztr_settings aztr0 = aztq0.a();
        super(context0, bmei.a, azsx.s, aztr0);
    }

    public final evql e(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmea(this, publicKeyCredentialCreationOptions0);
        azzc0.d = 5407;
        return this.iG(azzc0.a());
    }

    public final evql f(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmeb(this, publicKeyCredentialRequestOptions0);
        azzc0.d = 5408;
        return this.iG(azzc0.a());
    }

    public final evql g() {
        azzc azzc0 = new azzc();
        azzc0.a = new bmec(this);
        azzc0.c = new Feature[]{blfo.h};
        azzc0.d = 5411;
        return this.iG(azzc0.a());
    }

    public final evql h(String s, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new bmed(this, s, arr_b);
        azzc0.c = new Feature[]{blfo.g};
        azzc0.d = 5411;
        return this.iG(azzc0.a());
    }
}

