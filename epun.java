import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public final class epun extends bxoi {
    private static final baun a;
    private static final ggfp b;
    private final epvh c;
    private final epvc d;
    private final AuthAccountRequest f;
    private final epub g;
    private final epvg h;

    static {
        epun.a = epul.b("AuthAccountOperation");
        epun.b = ggfp.K(Integer.valueOf(8), Integer.valueOf(7));
    }

    public epun(epvc epvc0, AuthAccountRequest authAccountRequest0, epub epub0) {
        super(44, "AuthAccount");
        this.c = new epvh(epvc0.b);
        this.d = epvc0;
        this.f = authAccountRequest0;
        this.g = epub0;
        this.h = hyex.h() ? epvg.a : null;
    }

    private final baqr b() {
        Account account0 = this.d.m();
        Account account1 = this.d.m();
        return new baqr(this.d.d, account0, account1, this.d.c, this.d.c);
    }

    private final epvi c() {
        epvc epvc0 = this.d;
        Set set0 = epvc0.p();
        epvg epvg0 = this.h;
        if(epvg0 != null) {
            String s = epvc0.c;
            if(epvg0.b(s, epvc0.m())) {
                Set set1 = epvg0.a(s, epvc0.m());
                gftb.check(set1);
                set0 = new HashSet(set1);
                set0.retainAll(epvc0.p());
            }
        }
        bxke bxke0 = bxke.b(epvc0.m(), set0);
        bxke0.e(gqvm.d);
        bxke0.i(epvc0.c, epvc0.d);
        bxke0.p(epvc0.l);
        AuthAccountRequest authAccountRequest0 = this.f;
        if(authAccountRequest0 != null) {
            Integer integer0 = authAccountRequest0.d;
            Integer integer1 = authAccountRequest0.e;
            if(integer0 != null && integer1 != null) {
                bxke0.m(integer0.intValue(), integer1.intValue());
            }
        }
        TokenRequest tokenRequest0 = bxke0.a();
        epvi epvi0 = this.c.a(tokenRequest0);
        Integer integer2 = (int)epvi0.a;
        epun.a.j("Access token request result: %d.", new Object[]{integer2});
        if(epvi0.b()) {
            gfsx gfsx0 = epvi0.c;
            if(((TokenData)gfsx0.d()).e) {
                baqr baqr0 = this.b();
                if(gfsx0.i()) {
                    List list0 = ((TokenData)gfsx0.d()).f;
                    gftb.check(list0);
                    baqr0.n(((String[])list0.toArray(new String[0])));
                }
                baqr0.g(epvc0.b);
                return epvi0;
            }
        }
        else if(!epun.b.contains(integer2)) {
            this.b().f(epvc0.b);
        }
        return epvi0;
    }

    private final void d(int v, gfsx gfsx0) {
        epvc epvc0 = this.d;
        Scope[] arr_scope = (Scope[])epvc0.p().toArray(new Scope[0]);
        Intent intent0 = (Intent)gfsx0.g();
        Bundle bundle0 = epvc0.m.a();
        String s = epvc0.c;
        if(intent0 != null) {
            intent0.putExtra("SIGN_IN_PACKAGE_NAME", s);
            intent0.putExtra("SIGN_IN_SCOPE_ARRAY", arr_scope);
            intent0.putExtra("sign_in_options", bundle0);
        }
        cjtg cjtg0 = epvc0.b;
        Intent intent1 = new Intent();
        intent1.setClassName(cjtg0, "com.google.android.gms.signin.activity.SignInActivity");
        intent1.putExtra("SIGN_IN_PACKAGE_NAME", s);
        intent1.putExtra("start_step", 5);
        intent1.putExtra("SIGN_IN_SCOPE_ARRAY", arr_scope);
        intent1.putExtra("consent_intent", intent0);
        intent1.putExtra("sign_in_options", bundle0);
        if(hoxf.k()) {
            intent1.addCategory("categoryhack:timestamp=" + System.currentTimeMillis());
        }
        else {
            intent1.addCategory("categoryhack:" + UUID.randomUUID());
        }
        PendingIntent pendingIntent0 = cjok.a(cjtg0, 0, intent1, 0x4000000);
        if(!gfsx0.i()) {
            pendingIntent0 = null;
        }
        ConnectionResult connectionResult0 = new ConnectionResult(v, pendingIntent0);
        AuthAccountResult authAccountResult0 = new AuthAccountResult(v, ((Intent)gfsx0.g()));
        this.g.f(connectionResult0, authAccountResult0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        epvc epvc0 = this.d;
        boolean z = true;
        if(epvc0.f) {
            Set set0 = epvc0.n();
            epvg epvg0 = this.h;
            if(epvg0 != null) {
                String s = epvc0.c;
                if(epvg0.b(s, epvc0.m())) {
                    Set set1 = epvg0.a(s, epvc0.m());
                    gftb.check(set1);
                    set0 = new HashSet(set1);
                    set0.retainAll(epvc0.n());
                }
            }
            String s1 = epvc0.t() ? "auto" : "consent";
            Account account0 = epvc0.m();
            gftb.check(epvc0.h);
            bxke bxke0 = bxke.d(account0, epvc0.h, set0);
            bxke0.e(gqvm.d);
            bxke0.i(epvc0.c, epvc0.d);
            bxke0.j(epvc0.r());
            bxke0.l(epvc0.s());
            bxke0.n(s1);
            bxke0.p(epvc0.l);
            AuthAccountRequest authAccountRequest0 = this.f;
            if(authAccountRequest0 != null) {
                bxke0.k(authAccountRequest0.g);
                Integer integer0 = authAccountRequest0.d;
                Integer integer1 = authAccountRequest0.e;
                if(integer0 != null && integer1 != null) {
                    bxke0.m(integer0.intValue(), integer1.intValue());
                }
            }
            TokenRequest tokenRequest0 = bxke0.a();
            epvi epvi0 = this.c.a(tokenRequest0);
            int v = epvi0.a;
            epun.a.j("Server auth code request (prompt=%s) result: %d.", new Object[]{s1, v});
            if(!epvi0.b()) {
                this.d(v, epvi0.b);
                return;
            }
        }
        if(epvc0.p().isEmpty()) {
            epun.a.m("No scopes specified, skipping fetching access token.", new Object[0]);
            goto label_49;
        }
        Account account1 = epvc0.m();
        baqr baqr0 = baqr.b(epvc0.b, epvc0.d, account1, epvc0.c);
        if(baqr0 != null) {
            List list0 = baqr0.f;
            Set set2 = epvc0.n();
            if(bbql.b(((String[])list0.toArray(new String[list0.size()]))).containsAll(set2) && !epvc0.k) {
                z = false;
                goto label_49;
            }
        }
        epvi epvi1 = this.c();
        if(epvi1.b()) {
        label_49:
            if(epvc0.g) {
                Account account2 = epvc0.m();
                gftb.check(epvc0.h);
                bxke bxke1 = bxke.c(account2, epvc0.h);
                bxke1.e(gqvm.d);
                bxke1.i(epvc0.c, epvc0.d);
                bxke1.p(epvc0.l);
                if(epvc0.e == null || !epvc0.m().equals(epvc0.e)) {
                    bxke1.j(epvc0.r());
                    bxke1.l(epvc0.s());
                }
                TokenRequest tokenRequest1 = bxke1.a();
                epvi epvi2 = this.c.a(tokenRequest1);
                int v1 = epvi2.a;
                epun.a.j("ID token request result: %d.", new Object[]{v1});
                if(!epvi2.b()) {
                    this.d(v1, epvi2.b);
                    return;
                }
            }
            this.d(0, gfqx.a);
            if(!z) {
                this.c();
            }
            return;
        }
        this.d(epvi1.a, epvi1.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d(8, gfqx.a);
    }
}

