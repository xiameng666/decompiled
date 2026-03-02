import android.accounts.Account;
import android.content.Context;

public final class aiwi {
    public static final bboh a;
    public static final byte[] b;
    public final cjao c;
    public final Context d;

    static {
        aiwi.a = aiqz.b("FootprintsSynchronizer");
        aiwi.b = new byte[0];
    }

    public aiwi(Context context0) {
        cjao cjao0 = hprv.i() ? aiwi.a(context0, "autopushsearchqual-footprints-pa.sandbox.googleapis.com") : aiwi.a(context0, "footprints-pa.googleapis.com");
        super();
        this.d = context0;
        this.c = cjao0;
    }

    public static cjao a(Context context0, String s) {
        return new cjao(new bbfe_BaseGrpcServer(context0, s, 443, context0.getApplicationInfo().uid, 0x8201));
    }

    public static String b(long v) {
        return String.format("aid:%s", v);
    }

    public static baqr c(Context context0, Account account0) {
        int v = bbmq.c(context0, "com.google.android.gms");
        baqr baqr0 = new baqr();
        baqr0.a = v;
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        baqr0.l("https://www.googleapis.com/auth/webhistory");
        return baqr0;
    }
}

