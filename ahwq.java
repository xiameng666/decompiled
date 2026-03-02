import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;

public final class ahwq extends azts implements ahqs {
    public final String a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        ahwq.c = azss0;
        ahwo ahwo0 = new ahwo();
        ahwq.d = ahwo0;
        ahwq.b = new azta_api("Auth.Api.Identity.SignIn.API", ahwo0, azss0);
    }

    public ahwq(Context context0, ahqu ahqu0) {
        super(context0, ahwq.b, ahqu0, aztr_settings.a);
        this.a = bxol.a();
    }

    @Override  // ahqs
    public final SignInCredential b(Intent intent0) {
        if(intent0 == null) {
            throw new aztb(Status.d);
        }
        Status status0 = (Status)bauc.b(intent0, "status", Status.CREATOR);
        if(status0 == null) {
            throw new aztb(Status.f);
        }
        if(!status0.e()) {
            throw new aztb(status0);
        }
        SignInCredential signInCredential0 = (SignInCredential)bauc.b(intent0, "sign_in_credential", SignInCredential.CREATOR);
        if(signInCredential0 != null) {
            return signInCredential0;
        }
        throw new aztb(Status.d);
    }
}

