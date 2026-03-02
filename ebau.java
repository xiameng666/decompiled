import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.GetSeMfiPrepaidCardsRequest;
import com.google.android.gms.pay.GetSePrepaidCardRequest;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.SeServiceProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class ebau implements dnqb {
    public static final bboh a;
    final gmcg b;
    dmgi c;
    cqxc d;
    final gfsx e;

    static {
        ebau.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebau() {
        this.b = new bblp(0x7FFFFFFF, 10);
        this.e = gfqx.a;
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        if(cllr0.a.equals("pass.periodic.logging")) {
            azts azts0 = new azts(context0.getApplicationContext(), null);
            gfsx gfsx0 = dlmj.a(context0);
            if(gfsx0.i()) {
                String s = ((AccountInfo)gfsx0.d()).b;
                String s1 = ((AccountInfo)gfsx0.d()).a;
                dola dola0 = dlmg.a(AppContextProvider.a(), s, s1);
                eaxf eaxf0 = new eaxf(dola0, dpst.a(dola0));
                this.e.f(eaxf0);
                eaxf0.inject(this);
                Account account0 = new Account(s, "com.google");
                GetValuablesRequest getValuablesRequest0 = new GetValuablesRequest();
                getValuablesRequest0.a = account0;
                PassFilter passFilter0 = new PassFilter();
                passFilter0.h = 1;
                getValuablesRequest0.b = passFilter0;
                gmcd gmcd0 = edph.b(azts0.aR(getValuablesRequest0));
                eban eban0 = new eban();
                gmcg gmcg0 = this.b;
                gmcd gmcd1 = glzd.f(gmcd0, eban0, gmcg0);
                gmcd gmcd2 = glzd.f(edph.b(azts0.aw(account0)), new ebao(), gmcg0);
                gmcd gmcd3 = glzd.f(edph.b(azts0.ay(account0)), new ebap(), gmcg0);
                gmcd gmcd4 = edph.b(this.d.l());
                ggdy ggdy0 = new ggdy();
                gged_interceptors gged0 = gged_interceptors.m(Integer.valueOf(4), Integer.valueOf(8));
                int v = ((ggna)gged0).c;
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = (int)(((Integer)gged0.get(v1)));
                    GetSeMfiPrepaidCardsRequest getSeMfiPrepaidCardsRequest0 = new GetSeMfiPrepaidCardsRequest();
                    getSeMfiPrepaidCardsRequest0.a = account0;
                    SeServiceProvider seServiceProvider0 = new SeServiceProvider();
                    seServiceProvider0.a = v2;
                    getSeMfiPrepaidCardsRequest0.c = seServiceProvider0;
                    getSeMfiPrepaidCardsRequest0.b = 1;
                    ggdy0.i(glzd.f(edph.b(azts0.aM(getSeMfiPrepaidCardsRequest0)), new ebaq(), gmcg0));
                }
                gged_interceptors gged1 = ggdy0.h();
                ggdy ggdy1 = new ggdy();
                gged_interceptors gged2 = gged_interceptors.n(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
                int v3 = ((ggna)gged2).c;
                for(int v4 = 0; v4 < v3; ++v4) {
                    int v5 = (int)(((Integer)gged2.get(v4)));
                    GetSePrepaidCardRequest getSePrepaidCardRequest0 = new GetSePrepaidCardRequest();
                    getSePrepaidCardRequest0.a = account0;
                    SeServiceProvider seServiceProvider1 = new SeServiceProvider();
                    seServiceProvider1.a = v5;
                    getSePrepaidCardRequest0.b = seServiceProvider1;
                    getSePrepaidCardRequest0.d = 1;
                    ggdy1.i(glzd.f(edph.b(azts0.aN(getSePrepaidCardRequest0)), new ebar(), gmcg0));
                }
                gged_interceptors gged3 = ggdy1.h();
                gmbu.t(gmbu.a(ggch.g(gged1, gged3, gged_interceptors.o(gmcd1, gmcd2, gmcd3, gmcd4))).a(new ebas(gmcd1, gmcd2, gmcd3, gmcd4, gged1, gged3), gmcg0), new ebat(this), gmcg0);
                return 0;
            }
        }
        return 2;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        if(hrwa.g()) {
            clks clks0 = new clks();
            clks0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
            clks0.q("pass.periodic.logging");
            clks0.a = clkz.j;
            clks0.l(true);
            clks0.v(2);
            clks0.e();
            clks0.j();
            clla clla0 = clks0.a();
            cljp.a(context0).f(clla0);
            return;
        }
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkq0.q("pass.periodic.logging");
        clkq0.j(clkm.h);
        clkq0.g(0);
        clkq0.i(true);
        clkq0.r(true);
        clkr clkr0 = clkq0.a();
        cljp.a(context0).f(clkr0);
    }

    static int c(int v) {
        return v - 2 == 0 || v - 2 == 1 ? 3 : 4;
    }
}

