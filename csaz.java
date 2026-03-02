import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.euicc.DownloadableSubscription;
import android.telephony.euicc.EuiccManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;

public final class csaz extends du {
    public static final bboh a;
    private BroadcastReceiver ag;
    private final csle ah;
    public xob b;
    public Bundle c;
    public csld d;

    static {
        csaz.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public csaz() {
        this.ah = new csle();
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.b = (xob)context0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0532, viewGroup0, false);  // layout:loading_caption_view
        csld csld0 = (csld)new lso(this.b, this.ah).a(csld.class);
        this.d = csld0;
        this.c = csld0.a();
        MobileDataPlanDetailChimeraActivity.g(this, this.b);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B183A);  // id:loading_caption
        TextView textView1 = (TextView)view0.findViewById(0x7F0B183E);  // id:loading_detail
        textView0.setText(this.getString(0x7F150F4C));  // string:esim_activation_loading "Activating eSIM"
        textView1.setText(this.getString(0x7F150F4D));  // string:esim_activation_loading_detail "We\'re installing and activating your eSIM 
                                                        // profile. This may take a few minutes."
        textView1.setVisibility(0);
        csay csay0 = new csay(this);
        this.ag = csay0;
        jwe.b(this.b, csay0, new IntentFilter("com.google.android.gms.mobiledataplan.esim.DOWNLOAD_CALLBACK"), 4);
        String s = this.c.getString("esim_activation_code");
        batl.s(s);
        if(cjmf.b(this.b, "android.permission.WRITE_EMBEDDED_SUBSCRIPTIONS") == 0) {
            bboh bboh0 = csaz.a;
            ((ggtj)bboh0.h()).x("Mobile Data Plan has WRITE_EMBEDDED_SUBSCRIPTIONS for eSIM");
            EuiccManager euiccManager0 = (EuiccManager)this.b.getApplicationContext().getSystemService("euicc");
            if(euiccManager0 != null && euiccManager0.isEnabled()) {
                DownloadableSubscription downloadableSubscription0 = DownloadableSubscription.forActivationCode(s);
                bblp bblp0 = new bblp(1, 10);
                this.d.l(hhct.ep);
                bblp0.execute(new csax(this, euiccManager0, downloadableSubscription0, s));
                return view0;
            }
            ((ggtj)bboh0.j()).x("EuiccManager not enabled because device does not support eSIM.");
        }
        else {
            ((ggtj)csaz.a.j()).x("Mobile Data Plan does not have WRITE_EMBEDDED_SUBSCRIPTIONS permission");
        }
        cscb.B(this.b, this.c, hhct.dx, this.d.b);
        return view0;
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        this.b.unregisterReceiver(this.ag);
    }

    final PendingIntent y(Intent intent0, String s) {
        intent0.setAction("com.google.android.gms.mobiledataplan.esim.DOWNLOAD_CALLBACK");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("esim_activation_code", s);
        return PendingIntent.getBroadcast(this.b, 0, intent0, 0x52000000);
    }
}

