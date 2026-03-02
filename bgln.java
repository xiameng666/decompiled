import android.content.pm.PackageManager;
import android.view.View;

public final class bgln {
    public final xob a;
    public final gftc b;

    private bgln(xob xob0, gftc gftc0) {
        this.a = xob0;
        this.b = gftc0;
    }

    public static void a(xob xob0, gftc gftc0, bglk bglk0, bgll bgll0) {
        bgln bgln0 = new bgln(xob0, gftc0);
        PackageManager packageManager0 = bgln0.a.getPackageManager();
        View view0 = bgln0.a.getLayoutInflater().inflate(0x7F0E083F, null);  // layout:pwm_appchooser_header
        bglh bglh0 = new bglh(bgln0.a);
        view0.findViewById(0x7F0B1D35).setVisibility(0);  // id:progress_bar
        fyju fyju0 = new fyju(bgln0.a, 0x7F16063A);  // style:PwmAlertDialogThemeOverlay
        fyju0.y(view0);
        fyju0.w(bglh0, new bgld(bgln0, bglh0, bglk0));
        fyju0.F(0x7F1507F2, new bgle(bgll0));  // string:common_cancel "Cancel"
        fyju0.a();
        evrg.a(new bblp(0x7FFFFFFF, 9), new bglf(bgln0, packageManager0)).b(new bglg(bglh0, view0));
    }
}

