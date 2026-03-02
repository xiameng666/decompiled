import android.content.Context;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;

public final class ezvm extends azts {
    public static final int a;
    private static final azta_api b;
    private static final azss c;
    private static final azsy d;

    static {
        azss azss0 = new azss();
        ezvm.c = azss0;
        ezvk ezvk0 = new ezvk();
        ezvm.d = ezvk0;
        ezvm.b = new azta_api("SystemUpdate.API", ezvk0, azss0);
    }

    protected ezvm(Context context0) {
        super(context0, ezvm.b, azsx.s, aztr_settings.a);
    }

    public final void cA(ezup ezup0) {
        this.jm(azyg.a(ezup0, "ezup"), 0x4792);
    }

    public final void cz(ActivityStatus activityStatus0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ezvf(activityStatus0);
        azzc0.d = 0x4789;
        this.jn(azzc0.a());
    }

    public final evql e() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezuv();
        azzc0.d = 0x478F;
        return this.jn(azzc0.a());
    }

    public final evql f() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezux();
        azzc0.d = 0x4791;
        return this.iG(azzc0.a());
    }

    public final evql g() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezvj();
        azzc0.d = 0x478A;
        return this.iG(azzc0.a());
    }

    public final void h(DownloadOptions downloadOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ezvg(downloadOptions0);
        azzc0.d = 18308;
        this.jn(azzc0.a());
    }

    public final void i(InstallationOptions installationOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ezve(installationOptions0);
        azzc0.d = 18309;
        this.jn(azzc0.a());
    }

    public final void j() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezvi();
        azzc0.d = 0x478B;
        this.jn(azzc0.a());
    }

    public final void k() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezuy();
        azzc0.d = 0x4787;
        this.jn(azzc0.a());
    }

    public final void l(ezup ezup0) {
        azyf azyf0 = azyg.b(ezup0, this.B, "ezup");
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new ezvc(ezup0);
        azyq0.b = new ezvd(ezup0);
        azyq0.e = 0x47A1;
        this.iH(azyq0.a());
    }

    public final void m() {
        azzc azzc0 = new azzc();
        azzc0.a = new ezva();
        azzc0.d = 0x478D;
        this.jn(azzc0.a());
    }

    public final void n(InstallationOptions installationOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ezvh(installationOptions0);
        azzc0.d = 0x478C;
        this.jn(azzc0.a());
    }

    public final void o(DownloadOptions downloadOptions0) {
        azzc azzc0 = new azzc();
        azzc0.a = new ezvb(downloadOptions0);
        azzc0.d = 0x4788;
        this.jn(azzc0.a());
    }
}

