import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.chimera.config.ModuleManager;

final class cbub implements icih {
    final cbuo a;

    public cbub(cbuo cbuo0) {
        this.a = cbuo0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cbuy cbuy0 = ((cbuz)object0).b;
        if(((cbuz)object0).a) {
            switch(cbuy0.ordinal()) {
                case 1: {
                    goto label_13;
                }
                case 0: 
                case 5: {
                    goto label_6;
                }
            }
            this.a.aw();
            this.a.aB();
            return ibom.a;
        label_6:
            this.a.y().l(this.a.requireContext());
            this.a.aj();
            cbir cbir0 = this.a.R();
            if(cbir0 != null) {
                cbua cbua0 = new cbua();
                cbir0.a(gvkq.dq, cbua0);
                return ibom.a;
            label_13:
                cbuo cbuo0 = this.a;
                if(cbuo0.d != null) {
                    hukf hukf0 = hukf.a;
                    if(hukf0.c().p()) {
                        int v = (int)hukf0.c().a();
                        ModuleManager.get(cbuo0.requireContext()).pauseModuleUpdates("KIDS_ONBOARDING_SOURCE", v);
                        ((ggtj)cbuo.a.h()).z("Module updates paused for %d seconds.", v);
                    }
                    xob xob0 = xoc.b(cbuo0);
                    Intent intent0 = xob0.getIntent();
                    ibuq.e(intent0, "getIntent(...)");
                    Account account0 = cbuo0.d;
                    ibuq.d(account0, "null cannot be cast to non-null type android.accounts.Account");
                    String s = ((gvlp)cbuo0.ae().f.b()).b;
                    ibuq.e(s, "getParentAccessToken(...)");
                    Intent intent1 = new Intent("com.google.android.gms.kids.CONTINUE_DEVICE_SUPERVISION_OPT_IN");
                    intent1.setComponent(new ComponentName(xoc.b(cbuo0).getApplication().getApplicationContext(), (cbuo0.y().b ? "com.google.android.gms.kids.auth.KidsAuthDeviceSupervisionOptInActivity" : "com.google.android.gms.kids.KidSetupActivity")));
                    intent1.putExtra("session_id", cbuo0.y().k());
                    intent1.putExtra("account", account0);
                    intent1.putExtra("pat", s);
                    gagb.a(intent0, intent1);
                    if(!intent1.hasExtra("theme")) {
                        intent1.putExtra("theme", "glif_v3_light");
                    }
                    if(hukf.h()) {
                        intent1.putExtra("enable_palette_colors", true);
                    }
                    if(hukf0.c().v()) {
                        intent1.putExtra("use_setup_design_lib", hukf.f());
                    }
                    xob0.startActivity(intent1);
                    cbuo0.aw();
                    cbuo.aC(cbuo0);
                    return ibom.a;
                }
                ((ggtj)cbuo.a.i()).x("No user authenticated after first part of the flow completed, we should cancel the rest of the flow.");
                cbuo0.aw();
                cbuo0.aB();
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

