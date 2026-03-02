import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;

public final class ehib {
    public final efur a;
    public final String b;

    public ehib(efur efur0, String s) {
        this.a = efur0;
        this.b = s;
    }

    public final void a(boolean z, long v) {
        batl.k(null);
        efur efur0 = this.a;
        SharedPreferences sharedPreferences0 = efur0.a;
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        String s = this.b;
        sharedPreferences$Editor0.putBoolean("focus_conditionally_reduce_page_size_enabled_" + s, z).commit();
        efur0.n(s);
        if(hwzd.c()) {
            efur0.q(s);
        }
        sharedPreferences0.edit().putLong("focus_timestamp_of_page_size_change_" + s, v).commit();
    }
}

