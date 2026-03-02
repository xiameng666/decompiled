import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import java.util.List;

public final class eqlo {
    private static final baun a;
    private final UserManager b;
    private final DevicePolicyManager c;

    static {
        eqlo.a = new erqc(new String[]{"WorkProfileHelper"});
    }

    public eqlo(Context context0) {
        Context context1 = context0.getApplicationContext();
        this.b = (UserManager)context1.getSystemService("user");
        this.c = (DevicePolicyManager)context1.getSystemService("device_policy");
    }

    public final UserHandle a() {
        for(Object object0: this.b.getUserProfiles()) {
            UserHandle userHandle0 = (UserHandle)object0;
            int v = userHandle0.getIdentifier();
            String s = this.c.getProfileOwnerNameAsUser(v);
            eqlo.a.d("ProfileOwnerName(%d) = %s", new Object[]{v, s});
            if(s != null) {
                return userHandle0;
            }
        }
        return null;
    }

    public final int b() {
        DevicePolicyManager devicePolicyManager0 = this.c;
        String s = devicePolicyManager0.getDeviceOwner();
        UserHandle userHandle0 = this.a();
        if(s == null && userHandle0 == null) {
            List list0 = devicePolicyManager0.getActiveAdmins();
            if(list0 != null) {
                String s1 = hyhe.a.c().c();
                for(Object object0: list0) {
                    if(s1.equals(((ComponentName)object0).flattenToShortString())) {
                        return 5;
                    }
                }
            }
        }
        if(s != null && userHandle0 != null) {
            return 6;
        }
        if(s != null) {
            return 5;
        }
        return userHandle0 == null ? 2 : 4;
    }
}

