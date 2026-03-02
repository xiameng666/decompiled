import android.support.v7.widget.SwitchCompat;
import android.view.View.OnClickListener;
import android.view.View;

public final class dnga implements View.OnClickListener {
    public final dngl a;
    public final dxev b;

    public dnga(dngl dngl0, dxev dxev0) {
        this.a = dngl0;
        this.b = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        view0.setClickable(false);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtfc.a).v_newBuilder();
        dxev dxev0 = this.b;
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
        SwitchCompat switchCompat0 = (SwitchCompat)view0.findViewById(0x7F0B0868);  // id:Switch
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
        int v = switchCompat0.isChecked() ? 4 : 5;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gtpb)hftp2.b_message).b = v - 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtpc gtpc1 = (gtpc)hftp1.b_message;
        gtpb gtpb0 = (gtpb)hftp2.N_build();
        gtpb0.getClass();
        gtpc1.d = gtpb0;
        gtpc1.b |= 2;
        gtpc gtpc2 = (gtpc)hftp1.N_build();
        dngi dngi0 = new dngi(this.a, view0);
        dptv.l(this.a.e, dpuj.cc, ((MessageLite)gtpc2), ((MessageLite)gtpd.a), dngi0);
    }
}

