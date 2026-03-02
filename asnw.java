import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import java.util.function.Supplier;

public final class asnw extends ccrk {
    public static final baun a;
    public final Context b;
    public final asxf c;
    public final Account d;
    private final asnz f;

    static {
        asnw.a = aqql.a("BackupContextualCardFetcher");
    }

    public asnw(Context context0, asxf asxf0, asnz asnz0, Account account0) {
        this.b = context0;
        this.c = asxf0;
        this.d = account0;
        this.f = asnz0;
    }

    public final ccnh a(String s, String s1, String s2, ccmy ccmy0, ccow ccow0) {
        ccna ccna0 = new ccna();
        ccna0.f(s);
        ccna0.e(s1);
        ccna0.b(ccmy0);
        ccmz ccmz0 = new ccmz();
        ccmz0.b(s2);
        ccmz0.a = ccmy0;
        ccna0.c(new ccne(ccmz0.a()));
        ccna0.d(ccow0);
        gfsx gfsx0 = (gfsx)asnw.d("createBackupStorageMeter", new asnv(this));
        if(gfsx0.i()) {
            ccna0.a = (ccoq)gfsx0.d();
            ccna0.b = (byte)(ccna0.b | 0x20);
        }
        return ccna0.a();
    }

    public final ccnh b(int v, int v1, Intent intent0, cmeu cmeu0, ccow ccow0) {
        ccmy ccmy0 = ccmu.a(intent0, cmeu0);
        return this.a(this.b.getString(v), this.b.getString(v1), "@com.google.android.gms:string/safetycenter_bbg1_information_card_action_label", ccmy0, ccow0);
    }

    @Override  // ccrk
    public final gmcd c(gmcg gmcg0) {
        return this.f == null ? gmcg0.e(new asns(this)) : icpu.e(iccl.b(icdt.b(gmcg0).plus(new icfg(null))), new asny(this.f, null));
    }

    public static final Object d(String s, Supplier supplier0) {
        if(hqlb.a.e().q()) {
            try(gdqb gdqb0 = gdsp.e("com/google/android/gms/backup/settings/gmsfeatures/card/BackupContextualCardFetcher", "executeWithTracing", 0x108, s)) {
                return supplier0.get();
            }
        }
        return supplier0.get();
    }

    public static final Intent e(boolean z) {
        if(z) {
            return hqlb.i() ? aqzc.h("photos_v2") : aqzc.h("photos");
        }
        return aqzc.h(null);
    }
}

