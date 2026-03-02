import android.os.Build;

public final class aqql extends baun {
    @Deprecated
    public aqql(String[] arr_s) {
        super("Backup", arr_s);
    }

    public static baun a(String s) {
        return new aqql(new String[]{s});
    }

    @Override  // baun
    public final boolean b(int v) {
        hqkp hqkp0 = hqkp.a;
        if(!hqkp0.b().b()) {
            boolean z = "userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE);
            return !hqkp0.b().c() || !z ? super.b(v) : true;
        }
        return true;
    }
}

