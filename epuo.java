import android.content.Context;
import android.content.SharedPreferences.Editor;

public final class epuo {
    public static final epuo a;

    static {
        epuo.a = new epuo();
    }

    public static final void a(Context context0, String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = bbmn.e(context0).edit();
        sharedPreferences$Editor0.putBoolean("x-client-auth:" + s, true);
        sharedPreferences$Editor0.apply();
    }
}

