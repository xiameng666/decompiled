import android.app.admin.DevicePolicyManager;
import android.content.Context;

public final class ezce {
    public final DevicePolicyManager a;
    private static ezce b;

    private ezce(Context context0) {
        this.a = (DevicePolicyManager)context0.getSystemService("device_policy");
    }

    public static ezce a(Context context0) {
        synchronized(ezce.class) {
            if(ezce.b == null) {
                ezce.b = new ezce(context0);
            }
        }
        return ezce.b;
    }
}

