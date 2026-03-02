import android.content.Context;
import j..time.Duration;
import java.util.List;
import java.util.Locale;

public final class aqks {
    public static final baun a;
    private final Context b;

    static {
        aqks.a = aqql.a("FreshnessTargetTierChecker");
    }

    public aqks(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.b = context0;
    }

    public final gmcd a(List list0) {
        ibuq.f(list0, "packagesAndBackupTypes");
        aqkn aqkn0 = new aqkn(this.b);
        aqkg aqkg0 = new aqkg(new aqkf());
        return glzd.f(glzd.g(aqkn0.c.b(aqkg0, aqkn0.b), new aqki(new aqkh(aqkn0)), aqkn0.b), new aqkp(new aqko(list0)), new bblp(1, 10));
    }

    public static final String b(Duration duration0) {
        String s = "0S".toLowerCase(Locale.ROOT);
        ibuq.e(s, "toLowerCase(...)");
        return s;
    }
}

