import android.content.SharedPreferences;
import java.util.Locale;

public final class atho {
    public static final aqql a;
    public final SharedPreferences b;
    public final int c;

    static {
        atho.a = new aqql(new String[]{"TertiaryKeyRotationTracker"});
    }

    public atho(SharedPreferences sharedPreferences0, int v) {
        batl.c(v >= 0, String.format(Locale.US, "maxBackupsTillRotation should be non-negative but was %d", v));
        this.b = sharedPreferences0;
        this.c = v;
    }

    public final int a(String s) {
        return this.b.getInt(s, 0);
    }
}

