import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.Map.Entry;

public final class azhj {
    public static Integer a(Context context0, String s) {
        azhj.b(context0);
        if(fhcd.g(context0)) {
            context0 = context0.createDeviceProtectedStorageContext();
        }
        int v = context0.getSharedPreferences("QosTierPref", 0).getInt(s, -1);
        hraz hraz0 = hraz.a;
        if(!hraz0.e().T()) {
            if(!hraz0.e().U()) {
                hraz0.e().Z();
                hraz0.e().X();
                hraz0.e().Y();
                return v == -1 ? null : v;
            }
            return (int)hlqe.c.f;
        }
        return (int)hlqe.a.f;
    }

    public static void b(Context context0) {
        if(fhcd.h(context0)) {
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("QosTierPref", 0);
            if(!sharedPreferences0.getBoolean("is_migrated_from_ce_to_de", false)) {
                SharedPreferences.Editor sharedPreferences$Editor0 = context0.createDeviceProtectedStorageContext().getSharedPreferences("QosTierPref", 0).edit();
                sharedPreferences$Editor0.clear();
                for(Object object0: sharedPreferences0.getAll().entrySet()) {
                    Object object1 = ((Map.Entry)object0).getValue();
                    String s = (String)((Map.Entry)object0).getKey();
                    if(s.equals("qos_tier_fingerprint") && object1 != null) {
                        sharedPreferences$Editor0.putLong(s, ((Long)object1).longValue());
                    }
                    else {
                        if(!(object1 instanceof Integer)) {
                            continue;
                        }
                        sharedPreferences$Editor0.putInt(s, ((Integer)object1).intValue());
                    }
                }
                sharedPreferences$Editor0.commit();
                SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences0.edit();
                sharedPreferences$Editor1.putBoolean("is_migrated_from_ce_to_de", true);
                sharedPreferences$Editor1.commit();
            }
        }
    }

    public static void c(SharedPreferences sharedPreferences0, hlqg hlqg0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.clear();
        sharedPreferences$Editor0.putLong("qos_tier_fingerprint", hlqg0.c);
        for(Object object0: hlqg0.b) {
            String s = ((hlqf)object0).b;
            hlqe hlqe0 = hlqe.b(((hlqf)object0).c);
            if(hlqe0 == null) {
                hlqe0 = hlqe.a;
            }
            sharedPreferences$Editor0.putInt(s, hlqe0.f);
        }
        sharedPreferences$Editor0.putBoolean("is_migrated_from_ce_to_de", true);
        sharedPreferences$Editor0.commit();
    }
}

