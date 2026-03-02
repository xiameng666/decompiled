import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedIdpSignInAidlResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;

public final class gowy {
    public static final baun a;
    public final goxm b;
    public final gowz c;

    static {
        gowy.a = new baun("FBAuthApiDispatcher", new String[0]);
    }

    public gowy(goxm goxm0, gowz gowz0) {
        this.b = goxm0;
        this.c = gowz0;
    }

    public final void a(String s, goxl goxl0) {
        batl.q(s);
        GetTokenResponse getTokenResponse0 = GetTokenResponse.c(s);
        if(System.currentTimeMillis() + 300000L < ((long)getTokenResponse0.e) + ((long)getTokenResponse0.c) * 1000L) {
            goxl0.b(getTokenResponse0);
            return;
        }
        goxz goxz0 = new goxz(getTokenResponse0.a);
        gowx gowx0 = new gowx(this, goxl0);
        this.b.f(goxz0, gowx0);
    }

    public final void b(goxs goxs0, goxa goxa0) {
        govk govk0 = new govk(this, goxa0);
        goxt goxt0 = new goxt();
        String s = hsyg.c();
        this.b.b(goxs0, goxt0, s, "emailLinkSignin").z(new gotg(this.b, govk0));
    }

    public final void c(goye goye0, goxa goxa0) {
        gowq gowq0 = new gowq(this, goxa0);
        this.b.h(goye0, gowq0);
    }

    public final void d(goyz goyz0, goxa goxa0, goxk goxk0) {
        if(!goyz0.a && TextUtils.isEmpty(goyz0.i)) {
            this.h(new GetTokenResponse(goyz0.c, goyz0.b, ((long)goyz0.d), "Bearer"), goyz0.g, goyz0.f, Boolean.valueOf(goyz0.h), goyz0.c(), goxa0, goxk0);
            return;
        }
        DefaultOAuthCredential defaultOAuthCredential0 = goyz0.c();
        String s = goyz0.e;
        String s1 = goyz0.j;
        Status status0 = goyz0.a ? new Status(17012) : gozl.a(goyz0.i);
        if(this.c.a()) {
            OnFailedIdpSignInAidlResponse onFailedIdpSignInAidlResponse0 = new OnFailedIdpSignInAidlResponse(status0, defaultOAuthCredential0, s, s1);
            try {
                Parcel parcel0 = goxa0.c.jo();
                wbz.f(parcel0, onFailedIdpSignInAidlResponse0);
                goxa0.c.jq(14, parcel0);
            }
            catch(RemoteException remoteException0) {
                goxa0.b.g("RemoteException when sending failure result with credential", remoteException0, new Object[0]);
            }
            return;
        }
        goxa0.b(status0);
    }

    public final void e(goxa goxa0, GetTokenResponse getTokenResponse0, goyp goyp0, goxk goxk0) {
        batl.s(getTokenResponse0);
        goya goya0 = new goya(getTokenResponse0.b);
        govl govl0 = new govl(this, goxk0, goxa0, getTokenResponse0, goyp0);
        this.b.g(goya0, govl0);
    }

    public final void f(goxa goxa0, GetTokenResponse getTokenResponse0, GetAccountInfoUser getAccountInfoUser0, goyp goyp0, goxk goxk0) {
        batl.s(getTokenResponse0);
        batl.s(getAccountInfoUser0);
        govm govm0 = new govm(this, goyp0, getAccountInfoUser0, goxa0, getTokenResponse0, goxk0);
        this.b.j(goyp0, govm0);
    }

    static void g(gowy gowy0, GetTokenResponse getTokenResponse0, String s, Boolean boolean0, goxa goxa0, goxk goxk0) {
        gowy0.h(getTokenResponse0, null, s, boolean0, null, goxa0, goxk0);
    }

    private final void h(GetTokenResponse getTokenResponse0, String s, String s1, Boolean boolean0, DefaultOAuthCredential defaultOAuthCredential0, goxa goxa0, goxk goxk0) {
        goya goya0 = new goya(getTokenResponse0.b);
        govn govn0 = new govn(this, goxk0, s1, s, boolean0, defaultOAuthCredential0, goxa0, getTokenResponse0);
        this.b.g(goya0, govn0);
    }
}

