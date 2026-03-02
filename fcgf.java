import android.os.Build;
import j..util.Objects;

public final class fcgf extends baun {
    public fcgf(String[] arr_s) {
        super("WearBackup", arr_s);
    }

    @Override  // baun
    public final boolean b(int v) {
        if(!Objects.equals(Build.TYPE, "userdebug") && !Objects.equals(Build.TYPE, "eng")) {
            return v > 2 ? super.b(3) : false;
        }
        return true;
    }
}

