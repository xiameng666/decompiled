import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.List;

public final class ajfy {
    public final Object a;
    public final SharedPreferences b;

    public ajfy(Context context0) {
        this.a = new Object();
        this.b = context0.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredKeyNames", 0);
    }

    public final void a(String s, List list0) {
        HashSet hashSet0 = new HashSet(this.b.getStringSet(s, ggnj.a));
        hashSet0.addAll(list0);
        synchronized(this.a) {
            this.b.edit().putStringSet(s, hashSet0).commit();
        }
    }
}

