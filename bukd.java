import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.List;

public final class bukd implements View.OnClickListener {
    public final bukv a;
    public final cmeb b;
    public final List c;
    public final hivl d;

    public bukd(bukv bukv0, cmeb cmeb0, List list0, hivl hivl0) {
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
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)buhs.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        buhs buhs0 = (buhs)hftp0.b_message;
        hfuo hfuo0 = buhs0.c;
        if(!hfuo0.c()) {
            buhs0.c = ProtoLiteMessage.E(hfuo0);
        }
        hivl hivl0 = this.d;
        hfrj.E(this.c, buhs0.c);
        if(!(hivl0.b == null ? hivk.a : hivl0.b).k.isEmpty()) {
            String s = (hivl0.b == null ? hivk.a : hivl0.b).k;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            buhs buhs1 = (buhs)hftp0.b_message;
            s.getClass();
            buhs1.b |= 2;
            buhs1.e = s;
        }
        if(!(hivl0.b == null ? hivk.a : hivl0.b).j.isEmpty()) {
            String s1 = (hivl0.b == null ? hivk.a : hivl0.b).j;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            buhs buhs2 = (buhs)hftp0.b_message;
            s1.getClass();
            buhs2.b |= 1;
            buhs2.d = s1;
        }
        buhs buhs3 = (buhs)hftp0.N_build();
        Bundle bundle0 = new Bundle(1);
        hfxk.m(bundle0, "sortMenuBottomSheetDialogFragmentArgs", ((MessageLite)buhs3));
        buna buna0 = new buna();
        buna0.setArguments(bundle0);
        buna0.ag = bukv0.aP;
        ca ca0 = new ca(bukv0.getChildFragmentManager());
        ca0.v(buna0, "sortMenuBottomSheetDialogFragment");
        ca0.C();
        ca0.f();
    }
}

