import android.os.Build;
import android.util.Log;
import java.util.Locale;

public final class erqc extends baun {
    private final String b;
    private final String c;

    public erqc(String[] arr_s) {
        super("SmartDevice", arr_s);
        this.b = "SmartDevice";
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(stringBuilder0.length() > 1) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(s);
        }
        stringBuilder0.append("] ");
        this.c = stringBuilder0.toString();
    }

    private final String a(String s, Object[] arr_object) {
        if(arr_object.length > 0) {
            s = String.format(Locale.US, s, arr_object);
        }
        return this.c + s;
    }

    @Override  // baun
    public final void d(String s, Object[] arr_object) {
        if(!this.b(3) && erqc.r()) {
            return;
        }
        String s1 = this.a(s, arr_object);
        Log.d(this.b, s1);
    }

    @Override  // baun
    public final void e(String s, Throwable throwable0, Object[] arr_object) {
        if(!this.b(3) && erqc.r()) {
            return;
        }
        String s1 = this.a(s, arr_object);
        Log.d(this.b, s1, throwable0);
    }

    @Override  // baun
    public final void j(String s, Object[] arr_object) {
        if(!this.b(2) && erqc.r()) {
            return;
        }
        String s1 = this.a(s, arr_object);
        Log.v(this.b, s1);
    }

    @Override  // baun
    public final void k(String s, Throwable throwable0, Object[] arr_object) {
        if(!this.b(2) && erqc.r()) {
            return;
        }
        String s1 = this.a(s, arr_object);
        Log.v(this.b, s1, throwable0);
    }

    private static final boolean r() {
        return "user".equals(Build.TYPE);
    }
}

