import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Bundle;

public final class cciu extends ali {
    final cciv a;

    public cciu(cciv cciv0) {
        this.a = cciv0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        ibuq.f(charSequence0, "errString");
        bboh bboh0 = cciv.ag;
        ((ggtj)bboh0.h()).H("When enrolling in intrusion detection, an authentication error occurred: code=%d errorMsg=%s", v, charSequence0);
        if(v != 11 && v != 14) {
            return;
        }
        ((ggtj)bboh0.j()).x("User does not have a device credential set, which is required for enrolling in intrusion detection.");
        this.a.dismiss();
    }

    @Override  // ali
    public final void c(alj alj0) {
        cciv cciv0 = this.a;
        Context context0 = cciv0.requireContext();
        boolean z = true;
        ((ggtj)ccid.a.h()).B("setAdvancedProtectionEnabled: %s", Boolean.valueOf(true));
        ccil.a(context0).b(true);
        boolean z1 = ((Boolean)cciv0.ai.a()).booleanValue();
        ccim ccim0 = ccil.a(cciv0.requireContext());
        if((!z1 || !ccim0.d() || DevicePolicyManager.isMtePolicyEnforced()) && (!z1 || ccim0.d() || !DevicePolicyManager.isMtePolicyEnforced())) {
            z = false;
        }
        fm fm0 = cciv0.getParentFragmentManager();
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("shouldRestart", z);
        fm0.ae("optInRequestKey", bundle0);
        cciv0.dismiss();
    }
}

