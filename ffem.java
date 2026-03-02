import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import com.google.android.gms.chimera.modules.wearable.AppContextProvider;

@Deprecated
public final class ffem {
    public static Context a;

    public static SharedPreferences a() {
        synchronized(ffgp.e) {
            batl.c(ffgp.f, "Local Edition mode must be initialized");
        }
        return (ffem.a == null ? AppContextProvider.a() : ffem.a).getSharedPreferences("wearable", 0);
    }

    public static String b(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getString("active_migration_node", null);
    }

    public static String c(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getString("client_node_id", null);
    }

    public static void d(SharedPreferences sharedPreferences0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.remove("active_migration_node");
        sharedPreferences$Editor0.apply();
    }

    public static void e(SharedPreferences sharedPreferences0, SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        sharedPreferences0.registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener0);
    }

    public static void f(SharedPreferences sharedPreferences0, String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.putString("active_migration_node", s);
        sharedPreferences$Editor0.apply();
    }

    public static void g(SharedPreferences sharedPreferences0, String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.putString("client_node_id", s);
        sharedPreferences$Editor0.apply();
    }
}

