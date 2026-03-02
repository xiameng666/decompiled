import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.List;

public final class bukh implements View.OnClickListener {
    public final bukv a;
    public final cmeb b;
    public final List c;
    public final hivl d;

    public bukh(bukv bukv0, cmeb cmeb0, List list0, hivl hivl0) {
        this.a = bukv0;
        this.b = cmeb0;
        this.c = list0;
        this.d = hivl0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bukv bukv0 = this.a;
        fhvu fhvu0 = buqr.b(bukv0.aF.a);
        this.b.b(gltz.e, fhvu0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)buhq.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        buhq buhq0 = (buhq)hftp0.b_message;
        hfuo hfuo0 = buhq0.c;
        if(!hfuo0.c()) {
            buhq0.c = ProtoLiteMessage.E(hfuo0);
        }
        hivl hivl0 = this.d;
        hfrj.E(this.c, buhq0.c);
        if(!(hivl0.b == null ? hivk.a : hivl0.b).i.isEmpty()) {
            String s = (hivl0.b == null ? hivk.a : hivl0.b).i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            buhq buhq1 = (buhq)hftp0.b_message;
            s.getClass();
            buhq1.b |= 1;
            buhq1.d = s;
        }
        if(!(hivl0.b == null ? hivk.a : hivl0.b).h.isEmpty()) {
            String s1 = (hivl0.b == null ? hivk.a : hivl0.b).h;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            buhq buhq2 = (buhq)hftp0.b_message;
            s1.getClass();
            buhq2.b |= 2;
            buhq2.e = s1;
        }
        buhq buhq3 = (buhq)hftp0.N_build();
        Bundle bundle0 = new Bundle(1);
        hfxk.m(bundle0, "filterListBottomSheetDialogFragmentArgs", ((MessageLite)buhq3));
        bulo bulo0 = new bulo();
        bulo0.setArguments(bundle0);
        bulo0.ag = bukv0.aP;
        ca ca0 = new ca(bukv0.getChildFragmentManager());
        ca0.v(bulo0, "filterListBottomSheetDialogFragment");
        ca0.C();
        ca0.f();
    }
}

