import android.content.Context;
import android.content.SharedPreferences;

public final class egvt {
    public final SharedPreferences a;
    private static egvt b;

    public egvt(SharedPreferences sharedPreferences0) {
        this.a = sharedPreferences0;
    }

    public static egvt a(Context context0) {
        synchronized(egvt.class) {
            if(egvt.b == null) {
                egvt.b = new egvt(context0.getSharedPreferences("gms.people.ui", 0));
            }
        }
        return egvt.b;
    }

    public final String b() {
        return this.a.getString("core_ui_selected_account", "");
    }
}

