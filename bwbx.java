import android.view.View.OnClickListener;
import android.widget.Button;

public final class bwbx {
    public static final fhvv a(int v, String s, int v1) {
        ibuq.f(s, "featureName");
        fhvt fhvt0 = new fhvt(gltz.e);
        hfta hfta0 = hglp.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giur.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gius.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        if(v != 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gius gius0 = (gius)hftp1.b_message;
            gius0.b |= 1;
            gius0.c = v;
        }
        if(!ibzk.D(s)) {
            ibuq.f(s, "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gius gius1 = (gius)hftp1.b_message;
            s.getClass();
            gius1.b |= 2;
            gius1.d = s;
        }
        if(v1 != 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gius gius2 = (gius)hftp1.b_message;
            gius2.b |= 4;
            gius2.e = v1;
        }
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gius)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giur giur0 = (giur)hftp0.b_message;
        ((gius)hftv0).getClass();
        giur0.c = (gius)hftv0;
        giur0.b |= 1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        fhvt0.b(new fhvu(hfta0, ((giur)hftv1)));
        return fhvt0.a();
    }

    public static final void b(Button button0, View.OnClickListener view$OnClickListener0) {
        ibuq.f(button0, "<this>");
        Object object0 = button0.getTag(0x7F0B23A4);  // id:uiflow_compound_click_listener
        bwcc bwcc0 = (object0 instanceof bwcc) ? ((bwcc)object0) : null;
        if(bwcc0 == null) {
            bwcc0 = new bwcc();
            button0.setTag(0x7F0B23A4, bwcc0);  // id:uiflow_compound_click_listener
            button0.setOnClickListener(bwcc0);
        }
        bwcc0.a.add(view$OnClickListener0);
    }
}

