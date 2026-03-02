import android.app.admin.DevicePolicyManager;
import android.content.Context;

public final class bjlt {
    static {
        bboh.c("EnterpriseCommon", bbcu.dA, "ZeroTouchCommonUtils");
    }

    public static boolean a(Context context0) {
        DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService(DevicePolicyManager.class);
        gftb.check(devicePolicyManager0);
        return devicePolicyManager0.isDeviceProvisioned();
    }
}

