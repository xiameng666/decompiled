import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public final class aiez extends aiey {
    public static final int d;
    private static final bboh f;
    private final bbey g;

    static {
        aiez.f = bboh.b("Auth.Api.SignIn", bbcu.dn);
    }

    public aiez(aier aier0, GoogleSignInOptions googleSignInOptions0, String s, bbey bbey0) {
        super(aier0, googleSignInOptions0, s, "GoogleRevokeAccess");
        this.g = bbey0;
    }

    private final void b() {
        Status status0 = new Status(4);
        this.c.a(status0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        baqr baqr0;
        Account account0;
        String s;
        GoogleSignInOptions googleSignInOptions0;
        int v;
        try {
            v = bbsr.b(context0).e(this.a, 0).applicationInfo.uid;
            googleSignInOptions0 = this.b;
            s = this.a;
            account0 = googleSignInOptions0.j;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ((ggtj)aiez.f.j()).x("[BaseGoogleSignInOperation] consumerPackageName from ServiceBroker not recognized by BrokerService");
            this.j(Status.d);
            return;
        }
        if(account0 == null) {
            account0 = bbmn.c(context0, s);
        }
        if(account0 == null) {
            baqr0 = null;
        }
        else {
            baqr0 = new baqr(v, account0, account0, s, s);
            Set set0 = new HashSet(googleSignInOptions0.a());
            if(set0.size() == 0) {
                baqr0 = null;
            }
            else {
                if(aifp.b(googleSignInOptions0)) {
                    set0 = aifp.a(set0);
                }
                baqr0.n(bbql.c(set0));
            }
        }
        if(baqr0 == null) {
            this.b();
            return;
        }
        baqr0.f(context0);
        String s1 = new bbfz(baqr0).a(context0);
        if(s1 == null) {
            this.b();
            return;
        }
        try {
            this.g.o(baqr0, 0, "/revoke?token=" + s1, null);
        }
        catch(acse | VolleyError exception0) {
            ((ggtj)((ggtj)aiez.f.j()).s(exception0)).B("[BaseGoogleSignInOperation] Revoke access request failed when calling LSO: %s", exception0);
        }
        try {
            acso.j(context0, s1);
        }
        catch(IOException | acse exception1) {
            ((ggtj)((ggtj)aiez.f.j()).s(exception1)).B("[BaseGoogleSignInOperation] Error clearing the tokens locally: %s", exception1);
        }
        new aifa(new aifg(), this.a).f(context0);
        this.c.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0);
    }
}

