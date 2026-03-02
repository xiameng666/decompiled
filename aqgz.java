import android.content.Context;
import com.google.android.gms.backup.BackUpNowConfig;

public final class aqgz extends azts implements aqdx {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        aqgz.c = azss0;
        aqgy aqgy0 = new aqgy();
        aqgz.d = aqgy0;
        aqgz.b = new azta_api("BackUpNow.API", aqgy0, azss0);
    }

    public aqgz(Context context0) {
        super(context0, aqgz.b, azsx.s, aztr_settings.a);
    }

    @Override  // aqdx
    public final evql b(BackUpNowConfig backUpNowConfig0) {
        azzc azzc0 = new azzc();
        azzc0.a = new aqgw(this, backUpNowConfig0);
        azzc0.d = 10202;
        return this.jn(azzc0.a());
    }

    @Override  // aqdx
    public final evql c() {
        azzc azzc0 = new azzc();
        azzc0.a = new aqgv();
        azzc0.d = 10203;
        return this.jn(azzc0.a());
    }

    @Override  // aqdx
    public final void d(String s, aqgk aqgk0) {
        azzc azzc0 = new azzc();
        azzc0.a = new aqgu(s, aqgk0);
        azzc0.d = 10201;
        this.jn(azzc0.a());
    }

    @Override  // aqdx
    public final void e(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new aqgx(s);
        azzc0.d = 10204;
        this.jn(azzc0.a());
    }
}

