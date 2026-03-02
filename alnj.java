import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.RestrictionsManager;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import java.util.List;

public final class alnj {
    public final Context a;
    private static final baun b;
    private final alnk c;

    static {
        alnj.b = new baun("ProximityAuth", new String[]{"EnterprisePolicy"});
    }

    public alnj(Context context0) {
        if(alnk.b == null) {
            alnk.b = new alnk(context0);
        }
        alnk alnk0 = alnk.b;
        super();
        this.a = context0;
        this.c = alnk0;
    }

    public final boolean a() {
        return alnj.c(this.a) != 4;
    }

    public final boolean b(UserHandle userHandle0) {
        if(Process.myUserHandle().equals(userHandle0)) {
            return this.a();
        }
        if(!hpzm.A() && bbpj.a(this.a).h()) {
            return false;
        }
        alnk alnk0 = this.c;
        if(Process.myUserHandle().equals(userHandle0)) {
            alnk.a.m("Unexpected check for cross profile stream on the same user", new Object[0]);
            return true;
        }
        try(ywg ywg0 = alna.a(alnk0.c)) {
            Bundle bundle0 = alnk0.d.a.b().a(0xD614099F5AE047CDL, 0, new Bundle(Bundler.class.getClassLoader()));
            BundlerType bundlerType0 = BundlerType.a("boolean");
            return ((Boolean)alnn.b.a(bundle0, "return", bundlerType0)).booleanValue();
        }
        catch(ywm ywm0) {
            alnk.a.g("Profile unavailable", ywm0, new Object[0]);
            return false;
        }
    }

    public static int c(Context context0) {
        int v;
        if(context0.checkSelfPermission("android.permission.READ_NEARBY_STREAMING_POLICY") == 0) {
            DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService("device_policy");
            if(devicePolicyManager0 == null) {
                goto label_12;
            }
            else {
                try {
                    switch(devicePolicyManager0.getNearbyNotificationStreamingPolicy()) {
                        case 1: {
                            v = 4;
                            goto label_13;
                        }
                        case 2: {
                            v = 2;
                            goto label_13;
                        }
                        case 3: {
                            goto label_9;
                        }
                    }
                }
                catch(NullPointerException unused_ex) {
                }
                goto label_12;
            label_9:
                v = 3;
            }
        }
        else {
            alnj.b.h("Skipping policy check due to lack of permission.", new Object[0]);
        label_12:
            v = 1;
        }
    label_13:
        RestrictionsManager restrictionsManager0 = (RestrictionsManager)context0.getSystemService("restrictions");
        if(restrictionsManager0 == null) {
        label_29:
            DevicePolicyManager devicePolicyManager1 = (DevicePolicyManager)context0.getSystemService("device_policy");
            if(devicePolicyManager1 != null) {
                List list0 = devicePolicyManager1.getActiveAdmins();
                if(list0 != null && !list0.isEmpty()) {
                    return v - 1 < 2 ? 3 : v;
                }
            }
        }
        else {
            Bundle bundle0 = restrictionsManager0.getApplicationRestrictions();
            if(bundle0 == null) {
                goto label_29;
            }
            else {
                String s = bundle0.getString("phone_hub_notification_streaming");
                if(s == null) {
                    goto label_29;
                }
                else {
                    switch(s.hashCode()) {
                        case 0x95F7A8B5: {
                            if(!s.equals("NOT_CONTROLLED_BY_POLICY")) {
                                goto label_29;
                            }
                            break;
                        }
                        case 0xCADB1721: {
                            if(s.equals("ENABLED")) {
                                return v - 1 < 1 ? 2 : v;
                            }
                            goto label_29;
                        }
                        case 1053567612: {
                            if(s.equals("DISABLED")) {
                                return v - 1 < 3 ? 4 : v;
                            }
                            goto label_29;
                        }
                        case 1901784471: {
                            if(s.equals("SAME_MANAGED_ACCOUNT_ONLY")) {
                                return v - 1 < 2 ? 3 : v;
                            }
                            goto label_29;
                        }
                        default: {
                            goto label_29;
                        }
                    }
                }
            }
        }
        return v - 1 < 0 ? 1 : v;
    }
}

