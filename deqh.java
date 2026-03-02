import android.content.Intent;
import com.google.android.chimera.android.Activity;

public final class deqh implements ibth {
    public final Activity a;

    public deqh(Activity activity0) {
        this.a = activity0;
    }

    @Override  // ibth
    public final Object a() {
        Activity activity0 = this.a;
        if(activity0 != null) {
            activity0.startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
        }
        return ibom.a;
    }
}

