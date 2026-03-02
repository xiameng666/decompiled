import android.os.Handler;
import android.os.Looper;

public final class flrd {
    public final Handler a;

    public flrd() {
        this.a = new Handler(Looper.getMainLooper());
    }

    public static boolean a(iapk iapk0) {
        if(iapk0 == null) {
            return false;
        }
        switch(iapk0.t.ordinal()) {
            case 1: 
            case 4: 
            case 8: 
            case 10: 
            case 13: 
            case 14: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

