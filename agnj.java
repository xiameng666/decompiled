import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.LinkedHashMap;

public final class agnj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: ((Iterable)object0)) {
            gfsx gfsx0 = (gfsx)object1;
            if(gfsx0.i()) {
                InternalSignInCredentialWrapper internalSignInCredentialWrapper0 = (InternalSignInCredentialWrapper)gfsx0.d();
                String s = internalSignInCredentialWrapper0.g.a;
                if(!internalSignInCredentialWrapper0.f.name.equals(s)) {
                    linkedHashMap0.put(s, internalSignInCredentialWrapper0);
                }
            }
        }
        return gged_interceptors.i(linkedHashMap0.values());
    }
}

