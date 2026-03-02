import android.view.View;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;

public final class bvuo implements lqj {
    public final GrowthWebViewChimeraActivity a;
    public final View b;

    public bvuo(GrowthWebViewChimeraActivity growthWebViewChimeraActivity0, View view0) {
        this.a = growthWebViewChimeraActivity0;
        this.b = view0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        GrowthWebViewChimeraActivity growthWebViewChimeraActivity0 = this.a;
        if(growthWebViewChimeraActivity0.p != null && growthWebViewChimeraActivity0.p.getVisibility() == 0 && ((int)(((Integer)object0))) == 0) {
            bvrf bvrf0 = growthWebViewChimeraActivity0.v;
            String s = growthWebViewChimeraActivity0.t;
            int v = growthWebViewChimeraActivity0.u;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqyb.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqyb)hftp0.b_message).d = 19;
            ((gqyb)hftp0.b_message).b |= 2;
            bvrf0.b(s, v, hftp0);
        }
        this.b.setVisibility(((Integer)object0).intValue());
    }
}

