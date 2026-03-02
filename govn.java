import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import j..util.Objects;
import java.util.List;

final class govn implements goxl {
    final goxk a;
    final String b;
    final String c;
    final Boolean d;
    final DefaultOAuthCredential e;
    final goxa f;
    final GetTokenResponse g;

    public govn(gowy gowy0, goxk goxk0, String s, String s1, Boolean boolean0, DefaultOAuthCredential defaultOAuthCredential0, goxa goxa0, GetTokenResponse getTokenResponse0) {
        this.a = goxk0;
        this.b = s;
        this.c = s1;
        this.d = boolean0;
        this.e = defaultOAuthCredential0;
        this.f = goxa0;
        this.g = getTokenResponse0;
        Objects.requireNonNull(gowy0);
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        this.a.a(s);
    }

    @Override  // goxl
    public final void b(Object object0) {
        List list0 = ((GetAccountInfoResponse)object0).c();
        if(list0 != null && !list0.isEmpty()) {
            GetAccountInfoUser getAccountInfoUser0 = (GetAccountInfoUser)list0.get(0);
            List list1 = getAccountInfoUser0.f == null ? null : getAccountInfoUser0.f.a;
            if(list1 != null && !list1.isEmpty()) {
                String s = this.b;
                if(TextUtils.isEmpty(s)) {
                    ProviderUserInfo providerUserInfo1 = (ProviderUserInfo)list1.get(0);
                    providerUserInfo1.e = this.c;
                }
                else {
                    for(int v = 0; v < list1.size(); ++v) {
                        if(((ProviderUserInfo)list1.get(v)).d.equals(s)) {
                            ProviderUserInfo providerUserInfo0 = (ProviderUserInfo)list1.get(v);
                            providerUserInfo0.e = this.c;
                            break;
                        }
                    }
                }
            }
            getAccountInfoUser0.k = this.d.booleanValue();
            getAccountInfoUser0.l = this.e;
            this.f.d(this.g, getAccountInfoUser0);
            return;
        }
        this.a.a("No users.");
    }
}

