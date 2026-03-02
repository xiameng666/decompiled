import android.view.View.OnClickListener;
import android.view.View;

public final class egre implements View.OnClickListener {
    public final egrw a;

    public egre(egrw egrw0) {
        this.a = egrw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.p();
        String s = egxj.g(this.a.a);
        efpr efpr0 = this.a.av.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giqu)hftv0).c = 24;
        ((giqu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqu)hftp0.b_message).e = 3;
        ((giqu)hftp0.b_message).b |= 4;
        efpr0.j(((giqu)hftp0.N_build()), s);
    }
}

