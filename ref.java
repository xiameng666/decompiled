import android.content.SharedPreferences;
import android.text.format.Time;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ref {
    public final SharedPreferences a;

    public ref(SharedPreferences sharedPreferences0) {
        this.a = sharedPreferences0;
    }

    public final long a(ree ree0) {
        SharedPreferences sharedPreferences0 = this.a;
        if(!sharedPreferences0.getBoolean("OperationScheduler_enabledState", true)) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        if(sharedPreferences0.getBoolean("OperationScheduler_permanentError", false)) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        int v = sharedPreferences0.getInt("OperationScheduler_errorCount", 0);
        long v1 = System.currentTimeMillis();
        long v2 = this.d("OperationScheduler_lastSuccessTimeMillis", v1);
        long v3 = this.d("OperationScheduler_lastErrorTimeMillis", v1);
        long v4 = Math.max(Math.max(sharedPreferences0.getLong("OperationScheduler_triggerTimeMillis", 0x7FFFFFFFFFFFFFFFL), this.d("OperationScheduler_moratoriumTimeMillis", this.d("OperationScheduler_moratoriumSetTimeMillis", v1) + ree0.d)), v2);
        return v <= 0 ? v4 : Math.max(v4, v3 + Math.min(ree0.a + ree0.b * ((long)v) + (((long)ree0.c) << (v - 1 <= 30 ? v - 1 : 30)), ree0.d));
    }

    public final void b(long v) {
        reg.a(this.a.edit().putLong("OperationScheduler_moratoriumTimeMillis", v).putLong("OperationScheduler_moratoriumSetTimeMillis", System.currentTimeMillis()));
    }

    public final void c() {
        reg.a(this.a.edit().putLong("OperationScheduler_triggerTimeMillis", 0L));
    }

    private final long d(String s, long v) {
        SharedPreferences sharedPreferences0 = this.a;
        long v1 = sharedPreferences0.getLong(s, 0L);
        if(v1 > v) {
            reg.a(sharedPreferences0.edit().putLong(s, v));
            return v;
        }
        return v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[OperationScheduler:");
        for(Object object0: new TreeMap(this.a.getAll()).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s = (String)map$Entry0.getKey();
            if(!s.startsWith("OperationScheduler_")) {
            }
            else if(s.endsWith("TimeMillis")) {
                Time time0 = new Time();
                time0.set(((Long)map$Entry0.getValue()).longValue());
                stringBuilder0.append(" ");
                stringBuilder0.append(s.substring(19, s.length() - 10));
                stringBuilder0.append("=");
                stringBuilder0.append(time0.format("%Y-%m-%d/%H:%M:%S"));
            }
            else {
                stringBuilder0.append(" ");
                stringBuilder0.append(s.substring(19));
                Object object1 = map$Entry0.getValue();
                if(object1 == null) {
                    stringBuilder0.append("=(null)");
                }
                else {
                    stringBuilder0.append("=");
                    stringBuilder0.append(object1.toString());
                }
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

