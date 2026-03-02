import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.api.Status;

public final class gozo {
    public static final gozo a;
    public final gozq b;

    static {
        gozo.a = new gozo();
    }

    private gozo() {
        gozq gozq0 = gozq.b;
        if(gozm.a == null) {
            gozm.a = new gozm();
        }
        super();
        this.b = gozq0;
    }

    public final void a(Context context0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        gged_interceptors gged0 = gozq.a;
        int v1 = ((ggna)gged0).c;
        for(int v = 0; v < v1; ++v) {
            sharedPreferences$Editor0.remove(((String)gged0.get(v)));
        }
        sharedPreferences$Editor0.commit();
    }

    public final void b(Context context0, Status status0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        sharedPreferences$Editor0.putInt("statusCode", status0.i);
        sharedPreferences$Editor0.putString("statusMessage", status0.j);
        sharedPreferences$Editor0.putLong("timestamp", System.currentTimeMillis());
        sharedPreferences$Editor0.commit();
    }
}

