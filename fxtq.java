import android.content.SharedPreferences;
import java.util.Map;

public final class fxtq implements Runnable {
    public final fxtr a;
    public final SharedPreferences b;
    public final String c;

    public fxtq(fxtr fxtr0, SharedPreferences sharedPreferences0, String s) {
        this.a = fxtr0;
        this.b = sharedPreferences0;
        this.c = s;
    }

    @Override
    public final void run() {
        fxtr fxtr0 = this.a;
        String s = this.c;
        synchronized(fxtr.b) {
            Object object1 = this.b.getAll().get(s);
            Map map0 = fxtr0.g;
            if(map0.containsKey(s)) {
                Object object2 = map0.get(s);
                if(object2 != object1 && (object2 == null || !object2.equals(object1))) {
                    map0.put(s, object1);
                    fxtr0.h.clear();
                }
            }
            else {
                map0.put(s, object1);
                fxtr0.h.clear();
            }
        }
    }
}

