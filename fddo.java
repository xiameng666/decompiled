import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;

public final class fddo implements View.OnClickListener {
    public final fddr a;

    public fddo(fddr fddr0) {
        this.a = fddr0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        evql evql0;
        int v1;
        fddr fddr0 = this.a;
        fdds fdds0 = fddr0.e;
        Context context0 = fdds0.getContext();
        if(context0 == null) {
            return;
        }
        if(fddr0.d) {
            fddr0.b.setEnabled(false);
            fded fded0 = fdds0.d;
            azts azts0 = new azts(context0, fcfo.a, fcfn.a, aztr_settings.a);
            int v = fddr0.c;
            fciy fciy0 = fcix.a(context0);
            gful_cronetEngineProvider gful0 = fded0.e;
            String s = ((fdan)gful0.mr()).d;
            String s1 = TextUtils.isEmpty(s) ? null : s;
            gged_interceptors gged0 = gged_interceptors.p(Integer.valueOf(0x7F153654), Integer.valueOf(0x7F153664), Integer.valueOf(fddg.a()), Integer.valueOf(0x7F15365D), Integer.valueOf(0x7F15365C));  // string:wearable_tos_google_description "By continuing, you agree to the Google <a 
                                                                                                                                                                                                           // href=https://policies.google.com/terms>Terms of Service</a> and the terms below.<br 
                                                                                                                                                                                                           // />Note: The <a href=https://policies.google.com/privacy>Google Privacy Policy</a> 
                                                                                                                                                                                                           // describes how data is handled in this service."
            if(fdci.b()) {
                v1 = v;
            label_22:
                gmcg gmcg0 = fded0.f;
                fddz fddz0 = new fddz(fded0, context0, v1, s1, gged0);
                fded0 = fded0;
                context0 = context0;
                gmcg0.execute(fddz0);
            }
            else if(v == 1 && hzvd.g()) {
                v1 = 1;
                goto label_22;
            }
            else {
                fded0.a(context0, gged0, fded0.b, null, null, null);
            }
            Object object0 = gful0.mr();
            gftb.check(object0);
            String s2 = gfta.a(((fdan)object0).d);
            String s3 = gfta.a(((fdan)object0).e);
            if(fded0.b(context0, ((fdan)object0)) && s2 != null && s3 != null) {
                boolean z = fded0.b.g(fdcn.d);
                fded.a.h("Enable backup supported, did user opt-in: %b", new Object[]{Boolean.valueOf(z)});
                if(z) {
                    evql0 = fciy0.c(s2, s3);
                    ffnc.c("wearable.TOS", "enableBackupInSetup", evql0);
                }
                else {
                    evql0 = fciy0.d(s2, gico.p);
                    ffnc.c("wearable.TOS", "enableBackupSkipped", evql0);
                }
            }
            else {
                evql0 = evrg.d(null);
            }
            int v2 = (int)hzvd.a.c().b();
            fdea fdea0 = new fdea(fded0, context0, azts0);
            evql evql1 = ffnc.a(v2, gmap.a, ((gful_cronetEngineProvider)fdea0)).g(new fdeb(fded0)).g(new fdec(context0));
            if(!hzwh.c()) {
                evql1 = evrg.f(new evql[]{evql1, evql0});
            }
            evql1.z(new fddp(fddr0));
            return;
        }
        int v3 = fddr0.a.c();
        fddr0.a.m(0, v3);
        fddr0.d = true;
        fddr0.b();
    }
}

