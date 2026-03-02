import android.provider.Settings.Secure;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bwfk implements Consumer {
    public final bwfr a;

    public bwfk(bwfr bwfr0) {
        this.a = bwfr0;
    }

    @Override
    public final void accept(Object object0) {
        Void void0 = (Void)object0;
        clja clja0 = new clja();
        clja0.t("DSUW_TASK");
        clja0.j = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        clja0.v(1);
        clja0.p = true;
        clja0.y(0, 1);
        clja0.c(new cliz(Settings.Secure.getUriFor("user_setup_personalization_state"), 0));
        cljb cljb0 = clja0.a();
        this.a.e.a(cljb0);
        clkn clkn0 = new clkn();
        clkn0.t("DSUW_TIMEOUT_TASK");
        clkn0.j = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        clkn0.v(1);
        clkn0.p = true;
        clkn0.y(0, 1);
        clkn0.e(htwv.a.b().b(), htwv.a.b().a());
        clko clko0 = clkn0.a();
        this.a.e.a(clko0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

