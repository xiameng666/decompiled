import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.util.Log;
import j..util.Objects;

final class fdyx implements SharedPreferences.OnSharedPreferenceChangeListener {
    final fdyy a;

    public fdyx(fdyy fdyy0) {
        Objects.requireNonNull(fdyy0);
        this.a = fdyy0;
        super();
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(Objects.equals(s, "active_migration_node")) {
            fdyy fdyy0 = this.a;
            batl.s(fdyy0.e);
            fdyy0.i = ffem.b(fdyy0.e);
            if(Log.isLoggable("rpctransport", 2)) {
                Log.v("rpctransport", String.format("active migration node changed, node: %s", fdyy0.i));
            }
        }
    }
}

