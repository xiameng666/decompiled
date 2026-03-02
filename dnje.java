import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import com.google.android.libraries.tapandpay.ui.rowsecondary.toggle.RowSecondaryToggle;

public final class dnje implements View.OnClickListener {
    public final dxev a;
    public final dnjs b;

    public dnje(dxev dxev0, dnjs dnjs0) {
        this.a = dxev0;
        this.b = dnjs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ibuq.f(view0, "view");
        view0.setClickable(false);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtfc.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        dxev dxev0 = this.a;
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
        String s = (hjwt0.d == null ? hjwq.a : hjwt0.d).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gtfc)hftv0).b = s;
        hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
        hjwt hjwt1 = hkhr1.d == null ? hjwt.a : hkhr1.d;
        ByteString hfsf0 = (hjwt1.d == null ? hjwq.a : hjwt1.d).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtfc gtfc0 = (gtfc)hftp0.b_message;
        hfsf0.getClass();
        gtfc0.c = hfsf0;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtpc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtpc gtpc0 = (gtpc)hftp1.b_message;
        gtfc gtfc1 = (gtfc)hftp0.N_build();
        gtfc1.getClass();
        gtpc0.c = gtfc1;
        gtpc0.b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtpb.a).v_newBuilder();
        int v = 4;
        if(hwev.c()) {
            fuca fuca0 = ((RowSecondary)view0).g().d;
            ibuq.d(fuca0, "null cannot be cast to non-null type com.google.android.libraries.tapandpay.ui.compose.sidecontent.TrailingElement.Switch");
            if(((fubx)fuca0).a) {
                v = 5;
            }
        }
        else if(((RowSecondaryToggle)view0).g()) {
            v = 5;
        }
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gtpb)hftp2.b_message).b = v - 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dnjs dnjs0 = this.b;
        gtpc gtpc1 = (gtpc)hftp1.b_message;
        gtpb gtpb0 = (gtpb)hftp2.N_build();
        gtpb0.getClass();
        gtpc1.d = gtpb0;
        gtpc1.b |= 2;
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        if(hwev.c()) {
            dnjq dnjq0 = new dnjq(dnjs0, ((RowSecondary)view0));
            dptv.l(dnjs0.f, dpuj.cc, ((MessageLite)(((gtpc)hftv1))), ((MessageLite)gtpd.a), dnjq0);
            return;
        }
        dnjr dnjr0 = new dnjr(((RowSecondaryToggle)view0), dnjs0);
        dptv.l(dnjs0.f, dpuj.cc, ((MessageLite)(((gtpc)hftv1))), ((MessageLite)gtpd.a), dnjr0);
    }
}

