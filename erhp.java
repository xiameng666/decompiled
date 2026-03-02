import android.content.Context;
import java.util.concurrent.Callable;

public final class erhp implements Callable {
    public final Context a;

    public erhp(Context context0) {
        this.a = context0;
    }

    @Override
    public final Object call() {
        oyn.a("SecondDeviceAuthRpcController-droidGuardInit");
        return bhnc.a(this.a, "smartsetup_2");
    }
}

