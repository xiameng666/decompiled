import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;

public final class ahgj implements bxmw {
    public final ahgq a;

    public ahgj(ahgq ahgq0) {
        this.a = ahgq0;
    }

    @Override  // bxmw
    public final gmcd a() {
        gfsx gfsx0;
        ahgq ahgq0 = this.a;
        Context context0 = ahgq0.d;
        Account account0 = ahgq0.a;
        Bundle bundle0 = Bundle.EMPTY;
        gftb.z(context0, "Context cannot be null");
        gftb.z(account0, "Account cannot be null");
        gftb.z(bundle0, "Options cannot be null");
        for(Object object0: context0.getPackageManager().queryIntentActivities(bxjv.a, 0x80)) {
            ResolveInfo resolveInfo0 = (ResolveInfo)object0;
            if(resolveInfo0.activityInfo == null || resolveInfo0.activityInfo.metaData == null || !"all".equals(resolveInfo0.activityInfo.metaData.getString("handle.managed.account.category"))) {
                continue;
            }
            Intent intent0 = new Intent().setComponent(new ComponentName("com.google.android.gms", resolveInfo0.activityInfo.name));
            intent0.putExtra("account", account0).putExtra("is_setup_wizard", false).putExtra("ui_parameters", Bundle.EMPTY).putExtra("suppress_account_provisioning", false).putExtra("is_user_owner", true).putExtra("dm_status", "dmStatus").putExtra("flow", 1).putExtra("options", bundle0);
            gfsx0 = gfsx.m(intent0);
            goto label_17;
        }
        gfsx0 = gfqx.a;
    label_17:
        if(!gfsx0.i()) {
            return gmbu.h(bxma.f(8, "Device management is not supported."));
        }
        ahgq0.startActivityForResult(((Intent)gfsx0.d()), 102);
        return ahgq0.ak.a();
    }
}

