import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.miphone.aiai.walletsuggestions.schema.WalletLocationsDocument;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dvhw implements dnqb {
    public static final bboh a;
    public static final Long b;
    dvjf c;
    gmcg d;
    fjcv e;
    frbx f;
    final gfsx g;
    dvhn h;
    private AndroidInjector i;

    static {
        dvhw.a = bboh.b("IssuerLocationsTask", bbcu.cZ);
        dvhw.b = (long)1L;
    }

    public dvhw() {
        this.g = gfqx.a;
    }

    @Override  // dnqb
    public final int a(cllr cllr0, Context context0) {
        gmcd gmcd1;
        agc agc0;
        if(dvhw.c()) {
            Bundle bundle0 = cllr0.b;
            if(bundle0 != null) {
                ggfp ggfp0 = bundle0.containsKey("ADDED_VALUABLE_IDS") ? ggfp.G(bundle0.getStringArrayList("ADDED_VALUABLE_IDS")) : ggnj.a;
                ggfp ggfp1 = bundle0.containsKey("DELETED_VALUABLE_IDS") ? ggfp.G(bundle0.getStringArrayList("DELETED_VALUABLE_IDS")) : ggnj.a;
                boolean z = bundle0.getBoolean("PERFORM_FULL_REFRESH", false);
                if(ggfp0.isEmpty() && ggfp1.isEmpty() && !z) {
                    return 0;
                }
                gfsx gfsx0 = dlmj.a(context0);
                if(!gfsx0.i()) {
                    return 2;
                }
                this.d(((AccountInfo)gfsx0.d()), context0);
                dvhn dvhn0 = this.h;
                gmcd gmcd0 = agy.a(new agw(dvhn0.a, "com.google.android.gms").a());
                try {
                    agb agb0 = new agb();
                    agb0.i(new Class[]{WalletLocationsDocument.class});
                    agb0.k(WalletLocationsDocument.class, dvhn0.c);
                    agb0.k(WalletLocationsDocument.class, dvhn0.d);
                    agc0 = agb0.a();
                }
                catch(ags ags0) {
                    gmcd0 = gmbu.h(ags0);
                    goto label_30;
                }
                gdta.g(gmcd0).i(new dvhm(agc0), dvhn0.b);
            label_30:
                if(z) {
                    gmcd1 = gdta.g(this.e.h()).i(new dvhq(this), this.d).i(new dvhr(this), this.d);
                }
                else {
                    fjcv fjcv0 = this.e;
                    fjav fjav0 = fjaw.a();
                    fjav0.b(hwhc.d());
                    gmcd1 = fjcv0.d(fjav0.a());
                }
                gdtd.h(new gmcd[]{gdta.g(gmcd0).i(new dvhs(this, z, ggfp1), this.d), gmcd1}).b(new dvht(this, gmcd0, gmcd1, z, ggfp0), this.d).k(new dvhv(this, gmcd0), this.d);
                return 0;
            }
        }
        return 2;
    }

    @Override  // dnqb
    public final void b(Context context0) {
        Bundle bundle0 = new Bundle();
        gfsx gfsx0 = dlmj.a(context0);
        if(gfsx0.i()) {
            bundle0.putString("ACCOUNT_NAME", ((AccountInfo)gfsx0.d()).b);
            bundle0.putString("ACCOUNT_ID", ((AccountInfo)gfsx0.d()).a);
        }
        bundle0.putBoolean("PERFORM_FULL_REFRESH", true);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.t("issuerlocationsoneoff.sync");
        clkn0.g(1);
        clkn0.u = bundle0;
        clkn0.e(0L, 1L);
        clkn0.v(1);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }

    public static boolean c() {
        return hwhc.e() && bbqa.d();
    }

    private final void d(AccountInfo accountInfo0, Context context0) {
        synchronized(this) {
            if(this.i == null) {
                dola dola0 = new dola(accountInfo0.b, accountInfo0.a);
                domv domv0 = domu.a(AppContextProvider.a());
                dola dola1 = dlmg.a(AppContextProvider.a(), accountInfo0.b, accountInfo0.a);
                Preconditions.b(domv0);
                dpqp dpqp0 = dprr.a(AppContextProvider.a(), domv0.n(), dola0, new dmgr("com.google.android.gms"));
                Preconditions.b(dpqp0);
                dvhp dvhp0 = new dvhp(dola1, domv0, dpqp0);
                this.g.f(dvhp0);
                this.i = dvhp0;
            }
            this.i.inject(this);
        }
    }
}

