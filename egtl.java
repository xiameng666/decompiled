import android.view.View.OnClickListener;
import android.view.View;

public final class egtl implements View.OnClickListener {
    public final egtw a;

    public egtl(egtw egtw0) {
        this.a = egtw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        egtw egtw0 = this.a;
        String s = egtw0.a.name;
        efpr efpr0 = egtw0.av.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = 22;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqu)hftp0.b_message).e = 2;
        ((giqu)hftp0.b_message).b |= 4;
        efpr0.j(((giqu)hftp0.N_build()), s);
        egtw0.b.i.l(Integer.valueOf(3));
    }
}

