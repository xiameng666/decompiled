import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class flnb {
    private final ConcurrentMap a;
    private final Context b;

    public flnb(Context context0) {
        this.b = context0;
        this.a = new ConcurrentHashMap();
    }

    public final SharedPreferences a(AccountContext accountContext0) {
        SharedPreferences sharedPreferences2;
        synchronized(this) {
            Long long0 = accountContext0.a();
            ConcurrentMap concurrentMap0 = this.a;
            if(concurrentMap0.containsKey(long0)) {
                return (SharedPreferences)concurrentMap0.get(long0);
            }
            SharedPreferences sharedPreferences1 = this.b.getSharedPreferences(String.format("lighter_messaging_prefs_%d.xml", long0), 0);
            sharedPreferences2 = (SharedPreferences)gfsx.l(((SharedPreferences)concurrentMap0.putIfAbsent(long0, sharedPreferences1))).f(sharedPreferences1);
        }
        return sharedPreferences2;
    }
}

