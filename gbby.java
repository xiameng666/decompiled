import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.android.Activity;

public final class gbby implements DialogInterface.OnShowListener {
    public final gbbz a;

    public gbby(gbbz gbbz0) {
        this.a = gbbz0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        View view0;
        gbbz gbbz0 = this.a;
        Bundle bundle0 = gbbz0.getArguments();
        long v = bundle0 == null ? 0L : bundle0.getLong("uiReference");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkzs.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkzq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkzq gkzq0 = (gkzq)hftp1.b_message;
        gkzq0.b |= 1;
        gkzq0.c = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkzs gkzs0 = (gkzs)hftp0.b_message;
        gkzq gkzq1 = (gkzq)hftp1.N_build();
        gkzq1.getClass();
        gkzs0.d = gkzq1;
        gkzs0.b |= 2;
        gkzs gkzs1 = (gkzs)hftp0.N_build();
        int v1 = gbbz0.ah;
        fhvo fhvo0 = gbbz0.ai.a.b(fidj.a(gbbz0.ai.b), v1);
        fhvo0.d(new fhvp(gkzx.a, gkzs1));
        fhvs fhvs0 = fhvo0.b();
        for(du du0 = gbbz0.getParentFragment(); true; du0 = du0.getParentFragment()) {
            view0 = null;
            if(du0 == null) {
                break;
            }
            View view1 = du0.getView();
            if(view1 != null) {
                view0 = view1;
                break;
            }
        }
        if(view0 == null) {
            Activity activity0 = (Activity)gbbz0.getContext();
            gftb.check(activity0);
            view0 = fhwh.a(activity0.getContainerActivity());
        }
        fhvs fhvs1 = fhwh.c(view0);
        gftb.check(fhvs1);
        fidb.a(fhvs0, fhvs1);
        if(!gbbz0.aj) {
            gbbz0.aj = true;
            gbbz0.y();
        }
    }
}

