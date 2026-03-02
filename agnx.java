import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;

public final class agnx implements bxto {
    @Override  // bxto
    public final Object a(Object object0) {
        if(!((gged_interceptors)object0).isEmpty()) {
            ggdy ggdy0 = new ggdy();
            ggef ggef0 = ggma.a(((gged_interceptors)object0), new agod());
            ggqj ggqj0 = ggef0.r().om();
            while(ggqj0.hasNext()) {
                Object object1 = ggqj0.next();
                gged_interceptors gged0 = ggef0.b(((String)object1));
                InternalSignInCredentialWrapper internalSignInCredentialWrapper0 = (InternalSignInCredentialWrapper)ggmi.a.h(gged0);
                SignInCredential signInCredential0 = internalSignInCredentialWrapper0.g;
                if(TextUtils.isEmpty(signInCredential0.f) && ggef0.b(((String)object1)).size() > 1 && !internalSignInCredentialWrapper0.j) {
                    ahqh ahqh0 = new ahqh(internalSignInCredentialWrapper0.f, signInCredential0, null);
                    ahqh0.b(internalSignInCredentialWrapper0.a());
                    ahqh0.d = true;
                    ggdy0.i(ahqh0.a());
                }
                else {
                    ggdy0.i(internalSignInCredentialWrapper0);
                }
            }
            return ggdy0.h();
        }
        return (gged_interceptors)object0;
    }
}

