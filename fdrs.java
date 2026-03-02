import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.util.Log;
import j..util.Objects;

final class fdrs implements SharedPreferences.OnSharedPreferenceChangeListener {
    final fdsh a;

    public fdrs(fdsh fdsh0) {
        Objects.requireNonNull(fdsh0);
        this.a = fdsh0;
        super();
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(Objects.equals(s, "active_migration_node")) {
            fdsh fdsh0 = this.a;
            fdsh0.x = ffem.b(fdsh0.d);
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", String.format("active migration node changed, node: %s", fdsh0.x));
            }
        }
    }
}

