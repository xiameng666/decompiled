import android.content.ComponentName;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class cqop implements View.OnClickListener {
    public final cqpi a;
    public final cqpc b;

    public cqop(cqpi cqpi0, cqpc cqpc0) {
        this.a = cqpi0;
        this.b = cqpc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        cqpi cqpi0 = this.a;
        switch(this.b.ordinal()) {
            case 0: {
                cqpi0.startActivity(new Intent("com.google.android.gms.settings.FIND_MY_DEVICE_SETTINGS").setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.mdm.settings.FindMyDeviceSettingsActivity")));
                return;
            }
            case 1: {
                cqpi0.startActivity(new Intent("android.app.action.SET_NEW_PASSWORD").setPackage("com.android.settings"));
                return;
            }
            case 2: {
                cqpi0.startActivity(cqpi.L());
                return;
            }
            case 3: {
                cqpi0.startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS").putExtra("account_types", new String[]{"com.google"}).setPackage("com.android.settings"));
                return;
            }
            case 4: {
                cqpi0.startActivity(cqpi.K());
                return;
            }
            case 5: 
            case 6: {
                cqpi0.S();
                return;
            }
            case 7: {
                cqqn.c(cqrb.a(cqpi0.requireContext(), hgzp.dH));
                cqpi0.X();
                return;
            }
            default: {
                throw new AssertionError();
            }
        }
    }
}

