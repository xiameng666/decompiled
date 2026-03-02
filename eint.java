import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class eint extends eins {
    private final SharedPreferences a;
    private final SharedPreferences b;

    public eint(einq einq0, SharedPreferences sharedPreferences0) {
        super(einq0, "com.google.android.gms.phenotype");
        this.a = sharedPreferences0;
        this.b = null;
    }

    public eint(einq einq0, String s, String s1, Context context0) {
        super(einq0, s);
        this.a = eint.j(context0, s1);
        this.b = eint.k(context0, s1);
    }

    @Override  // eins
    protected boolean d(Configurations configurations0) {
        boolean z = eint.i(this.a, configurations0);
        SharedPreferences sharedPreferences0 = this.b;
        if(sharedPreferences0 != null) {
            z = eint.i(sharedPreferences0, configurations0);
        }
        fpjh.c();
        return z;
    }

    @Override  // eins
    protected final String g() {
        return this.a.getString("__phenotype_snapshot_token", null);
    }

    public static SharedPreferences j(Context context0, String s) {
        if(s.startsWith("direct_boot:")) {
            s = s.substring(12);
        }
        return context0.getSharedPreferences(s, 0);
    }

    public static SharedPreferences k(Context context0, String s) {
        return s.startsWith("direct_boot:") ? fhcd.a(context0).getSharedPreferences(s.substring(12), 0) : null;
    }

    public static void l(Context context0) {
        batl.b(((boolean)(1 ^ context0.isDeviceProtectedStorage())));
        if(!fhcd.g(context0)) {
            Context context1 = fhcd.a(context0);
            if(context0.getSharedPreferences("gms_chimera_phenotype_flags", 0).getAll().isEmpty()) {
                eint.m(context1, context0, "gms_chimera_phenotype_flags");
                return;
            }
            if(context1.getSharedPreferences("gms_chimera_phenotype_flags", 0).getAll().isEmpty()) {
                eint.m(context0, context1, "gms_chimera_phenotype_flags");
            }
        }
    }

    private static void m(Context context0, Context context1, String s) {
        Map map0 = context0.getSharedPreferences(s, 0).getAll();
        SharedPreferences.Editor sharedPreferences$Editor0 = context1.getSharedPreferences(s, 0).edit();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if((map$Entry0.getValue() instanceof String)) {
                sharedPreferences$Editor0.putString(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue()));
                continue;
            }
            if((map$Entry0.getValue() instanceof Boolean)) {
                sharedPreferences$Editor0.putBoolean(((String)map$Entry0.getKey()), ((Boolean)map$Entry0.getValue()).booleanValue());
                continue;
            }
            if((map$Entry0.getValue() instanceof Integer)) {
                sharedPreferences$Editor0.putInt(((String)map$Entry0.getKey()), ((Integer)map$Entry0.getValue()).intValue());
                continue;
            }
            if((map$Entry0.getValue() instanceof Long)) {
                sharedPreferences$Editor0.putLong(((String)map$Entry0.getKey()), ((Long)map$Entry0.getValue()).longValue());
                continue;
            }
            if((map$Entry0.getValue() instanceof Float)) {
                sharedPreferences$Editor0.putFloat(((String)map$Entry0.getKey()), ((Float)map$Entry0.getValue()).floatValue());
                continue;
            }
            if((map$Entry0.getValue() instanceof Set)) {
                sharedPreferences$Editor0.putStringSet(((String)map$Entry0.getKey()), ((Set)map$Entry0.getValue()));
                continue;
            }
            return;
        }
        sharedPreferences$Editor0.commit();
    }
}

