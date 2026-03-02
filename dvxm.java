import android.view.View.OnClickListener;
import android.view.View;

public final class dvxm implements View.OnClickListener {
    public final dvxp a;
    public final gtzc b;

    public dvxm(dvxp dvxp0, gtzc gtzc0) {
        this.a = dvxp0;
        this.b = gtzc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtzc.a).v_newBuilder();
        String s = this.b.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtzc gtzc0 = (gtzc)hftp0.b_message;
        s.getClass();
        gtzc0.e = s;
        gtzc gtzc1 = (gtzc)hftp0.N_build();
        this.a.a.c(view0, gtzc1, this.a.b, this.a.c, true);
    }
}

