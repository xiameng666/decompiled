import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvtk implements View.OnClickListener {
    public final dvts a;

    public dvtk(dvts dvts0) {
        this.a = dvts0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvts dvts0 = this.a;
        dmgi dmgi0 = dvts0.ai;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hana.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hana)hftp1.b_message).b = "SCREEN_WALLET_INSTALL_ALLEY_OOP";
        hana hana0 = (hana)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hana0.getClass();
        hapr0.r = hana0;
        hapr0.b |= 0x200;
        dmgi0.b(((hapr)hftp0.N_build()));
        if(!dvts0.z().equals(guwf.i)) {
            dvts0.aj.j(17, ((Valuable)dvts0.am.d()).b, dvts0.z(), gged_interceptors.l(((Valuable)dvts0.am.d()).b));
        }
        dvts0.startActivityForResult(dvts0.ah.a("DEVICE_HANDOFF_WALLET_EDUCATION"), 1007);
    }
}

