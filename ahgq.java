import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

public final class ahgq extends du {
    public Account a;
    public final gmcg ag;
    public ajnv ah;
    public ahgr ai;
    public String aj;
    public bxmu ak;
    private final gful_cronetEngineProvider al;
    public gqvm b;
    public String c;
    public Context d;

    public ahgq() {
        this.ag = bxrz.C();
        this.al = new ahgf(this);
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        gfsx gfsx0;
        Integer integer0 = (int)1;
        switch(v) {
            case 102: {
                switch(v1) {
                    case 3: {
                        gfsx0 = gfsx.m(new Status(7, "Network error"));
                        break;
                    }
                    case 4: {
                        gfsx0 = gfsx.m(new Status(8, "App installation failure"));
                        break;
                    }
                    case 2: 
                    case 7: 
                    case 8: {
                        gfsx0 = gfsx.m(new Status(8, "Unexpected server error"));
                        break;
                    }
                    case 5: 
                    case 9: {
                        gfsx0 = gfsx.m(new Status(8, "Device management not supported"));
                        break;
                    }
                    case 6: 
                    case 10: {
                        gfsx0 = gfsx.m(new Status(16, "User canceled"));
                        break;
                    }
                    default: {
                        gfsx0 = gfqx.a;
                    }
                }
                if(gfsx0.i()) {
                    this.ak.k(((Status)gfsx0.d()).i, ((Status)gfsx0.d()).j);
                    return;
                }
                this.ak.f(integer0);
                return;
            }
            case 101: 
            case 103: {
                switch(v1) {
                    case -1: {
                        this.ak.f(integer0);
                        return;
                    }
                    case 0: {
                        this.ak.k(16, "Reauth activity canceled, aborting flow");
                        return;
                    }
                    default: {
                        this.ak.k(8, "Internal reauth error, aborting flow");
                    }
                }
            }
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
        Bundle bundle1 = this.getArguments();
        gftb.check(bundle1);
        Account account0 = (Account)bundle1.getParcelable("account");
        gftb.check(account0);
        this.a = account0;
        this.b = aeng.a(bundle1.getInt("api_surface"));
        String s = bundle1.getString("calling_package");
        gftb.check(s);
        this.c = s;
        this.d = this.getContext().getApplicationContext();
        this.ai = (ahgr)new lso(((xob)this.requireContext())).a(ahgr.class);
        this.ah = (ajnv)this.al.mr();
        bxmt bxmt0 = new bxmt();
        Integer integer0 = (int)1;
        bxmt0.a = integer0;
        bxmt0.c(integer0, new ahgg(this));
        bxmt0.c(Integer.valueOf(2), new ahgh(this));
        bxmt0.c(Integer.valueOf(4), new ahgi(this));
        bxmt0.c(Integer.valueOf(3), new ahgj(this));
        bxmt0.e(new ahgk(this));
        bxmt0.f(new ahgl(this));
        bxmt0.b(new bxmh(aggi.a("AccountReauth_flowRunner")));
        this.ak = bxmt0.a();
    }

    public static ahgq y(Account account0, int v, String s, String s1) {
        gftb.check(account0);
        gftb.check(s);
        gftb.check(s1);
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("account", account0);
        bundle0.putInt("api_surface", v);
        bundle0.putString("calling_package", s);
        bundle0.putString("session_id", s1);
        ahgq ahgq0 = new ahgq();
        ahgq0.setArguments(bundle0);
        return ahgq0;
    }

    public final void z() {
        this.ak.i();
    }
}

