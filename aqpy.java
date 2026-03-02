import android.accounts.Account;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

public final class aqpy {
    public final SharedPreferences a;
    public final long b;
    public final TimeUnit c;

    public aqpy() {
        throw null;
    }

    public aqpy(SharedPreferences sharedPreferences0, long v, TimeUnit timeUnit0) {
        this.a = sharedPreferences0;
        this.b = v;
        this.c = timeUnit0;
    }

    public static String a(Account account0) {
        return "storage_quota_info/" + account0.name;
    }
}

