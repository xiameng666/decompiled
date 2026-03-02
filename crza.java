import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;

public final class crza implements Runnable {
    public final csap a;
    public final cseh b;

    public crza(cseh cseh0, csap csap0) {
        this.b = cseh0;
        this.a = csap0;
    }

    @Override
    public final void run() {
        csap csap0 = this.a;
        long v = csap.a(csap0);
        crxn crxn0 = crxn.c();
        String s = this.b.b;
        crxn0.q(hhct.dU, s, this.b.c, this.b.d, this.b.e, v);
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity0 = this.b.a;
        Intent intent0 = this.b.f;
        if(!(csap0 instanceof csao)) {
            ((ggtj)MobileDataPlanSettingsChimeraActivity.j.j()).B("eSIM GcoreRegister failed with session ID %s", s);
            Bundle bundle0 = intent0.getExtras();
            bundle0.putLong("ESIM_RPC_STATUS_KEY", v);
            mobileDataPlanSettingsChimeraActivity0.g(hhct.ea, bundle0, s);
            return;
        }
        gsof gsof0 = (gsof)csap.b(csap0, gsof.class);
        String s1 = gsof0.b;
        if(gfta.c(s1)) {
            new clht(Looper.getMainLooper()).post(new csei(mobileDataPlanSettingsChimeraActivity0, intent0, s));
            return;
        }
        String s2 = Uri.parse(s1).getHost();
        ((ggtj)MobileDataPlanSettingsChimeraActivity.j.h()).R("eSIM GcoreRegister success with session ID %s and URL %s", s, s2);
        intent0.putExtra("ESIM_SESSION_ID", s);
        intent0.putExtra("ESIM_SERVICE_HOST", s2);
        if(hvlq.q()) {
            hfxk.k(intent0, "esim_precheck_config", ((MessageLite)(gsof0.c == null ? gsnx.a : gsof0.c)));
        }
        mobileDataPlanSettingsChimeraActivity0.startActivityForResult(intent0, 0x91F);
    }
}

