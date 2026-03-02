import android.view.View.OnClickListener;
import android.view.View;

final class cbjj implements View.OnClickListener {
    final icbi a;
    final fzbf b;

    public cbjj(icbi icbi0, fzbf fzbf0) {
        this.a = icbi0;
        this.b = fzbf0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gvmb gvmb0 = gvma.a(((ProtoLiteMessage)gvlz.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = gvmb0.a;
        fzbf fzbf0 = this.b;
        int v = fzbf0.y();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvlz gvlz0 = (gvlz)hftp0.b_message;
        gvlz0.b |= 1;
        gvlz0.c = v;
        int v1 = fzbf0.z();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvlz gvlz1 = (gvlz)hftp0.b_message;
        gvlz1.b |= 2;
        gvlz1.d = v1;
        gvlz gvlz2 = gvmb0.a();
        this.a.w(gvlz2);
    }
}

