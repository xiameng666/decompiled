import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

public final class egyp {
    private static egyp a;
    private final SharedPreferences b;

    public egyp(SharedPreferences sharedPreferences0) {
        this.b = sharedPreferences0;
    }

    public final egpr a() {
        batl.k(null);
        String s = this.b.getString("backup_and_sync", "");
        egpp egpp0 = (egpp)((ProtoLiteMessage)egpr.a).v_newBuilder();
        if(!s.isEmpty()) {
            try {
                egpp0.y(Base64.decode(s, 0));
            }
            catch(hfur unused_ex) {
            }
        }
        return (egpr)((ProtoLiteBuilder)egpp0).N_build();
    }

    public static egyp b(Context context0) {
        synchronized(egyp.class) {
            if(egyp.a == null) {
                egyp.a = new egyp(context0.getSharedPreferences("gms.people.contactssync.optin", 0));
            }
        }
        return egyp.a;
    }

    public final void c(egpr egpr0) {
        batl.k(null);
        this.b.edit().putString("backup_and_sync", Base64.encodeToString(egpr0.toBytesArray(), 0)).apply();
    }
}

