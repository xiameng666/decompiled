import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.phonehub.UpdateCameraRollAccessStateIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.UpdateLocalFeatureStateIntentOperation;

public final class alkl {
    public static final bboh a;
    gmcd b;
    public gmcd c;
    public final Context d;
    public final akws e;
    public final aliu f;

    static {
        alkl.a = alis.a("BetterTogetherSettings");
    }

    public alkl(Context context0) {
        this.d = context0;
        this.e = akwr.a(context0);
        this.f = new aliu();
    }

    public final void a(Account account0, alkj alkj0) {
        boolean z2;
        gmcd gmcd10;
        gmcd gmcd0 = gmcn.a(new bblp(1, 9)).e(new aljw(this, account0));
        gmcd gmcd1 = gmcn.a(new bblp(1, 9)).e(new alkh(this, account0));
        boolean z = hpzt.e();
        Boolean boolean0 = Boolean.valueOf(false);
        gmcd gmcd2 = gmbu.i(boolean0);
        gmcd gmcd3 = gmbu.i(boolean0);
        gmcd gmcd4 = gmbu.i(boolean0);
        if(z) {
            if(cpje.c()) {
                gmcd4 = fhra.b(cpje.a());
                gmcd2 = glzd.f(gmcd4, new aljx(this, account0), gmcn.a(new bblp(1, 9)));
                gmcd3 = glzd.f(gmcd4, new aljy(this, account0), gmcn.a(new bblp(1, 9)));
            }
            else {
                gmcd2 = gmcn.a(new bblp(1, 9)).e(new aljz(this, account0));
                gmcd3 = gmcn.a(new bblp(1, 9)).e(new alka(this, account0));
            }
        }
        boolean z1 = albt.c();
        gmcd gmcd5 = gmbu.i(boolean0);
        gmcd gmcd6 = gmbu.i(aldk.a);
        if(!hpzc.c() && z1) {
            gmcd5 = gmcn.a(new bblp(1, 9)).e(new alkb(this, account0));
        }
        if(account0 != null && (hpzc.c() || z1)) {
            gmcd6 = alol.a(account0.name).b();
        }
        gmcd gmcd7 = hpzm.i() ? gmcn.a(new bblp(1, 9)).e(new alkc(this, account0)) : gmbu.i(Boolean.valueOf(true));
        gmcd gmcd8 = gmbu.i(boolean0);
        if(account0 != null) {
            gmcd8 = glzd.f((hpzm.R() ? alol.a(account0.name).c() : almp.a(account0.name).b()), new alkd(), gmap.a);
        }
        gmcd gmcd9 = gmbu.i(boolean0);
        if(hpzm.y() && account0 != null) {
            gmcd10 = gmcd0;
            z2 = z;
            gmcd9 = gmbu.m(new alke(account0), new bblp(1, 9));
        }
        else {
            gmcd10 = gmcd0;
            z2 = z;
        }
        gmcd gmcd11 = gmbu.i(boolean0);
        if(hpzm.A() && account0 != null) {
            gmcd11 = glzd.f(alol.a(account0.name).e(), new aljv(), gmap.a);
        }
        gmcd gmcd12 = gmbu.f(new gmcd[]{gmcd10, gmcd1, gmcd2, gmcd3, gmcd5, gmcd7, gmcd8, gmcd6, gmcd9, gmcd11, gmcd4});
        this.b = gmcd12;
        gmbu.t(gmcd12, new alki(this, z2, z1, account0, alkj0), new bblp(1, 9));
    }

    final void b(String s, boolean z) {
        Intent intent0 = hpzm.R() ? UpdateLocalFeatureStateIntentOperation.a(this.d, s, z) : UpdateCameraRollAccessStateIntentOperation.a(this.d, s, z);
        if(intent0 != null) {
            this.d.startService(intent0);
            this.f.O(z);
        }
    }

    public final boolean c(Account account0) {
        if(account0 == null) {
            return false;
        }
        return hpzt.f() ? this.e.e(account0, gqus.l) : this.e.d(account0, gqus.l);
    }

    public final boolean d(Account account0) {
        if(account0 == null) {
            return false;
        }
        SyncedCryptauthDevice syncedCryptauthDevice0 = alfr.b(this.d, account0.name);
        return syncedCryptauthDevice0 != null && syncedCryptauthDevice0.l.contains(gqus.l.name());
    }
}

