import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dulo implements View.OnClickListener {
    public final duls a;
    public final gtxg b;

    public dulo(duls duls0, gtxg gtxg0) {
        this.a = duls0;
        this.b = gtxg0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.b.b;
        dmqo dmqo0 = new dmqo("com.google.android.gms.pay.pass.idcard.view.detail.VIEW_MDOC_LAUNCH_IDV_WIDGET");
        dmqo0.h(s);
        dmqo0.i(2);
        Intent intent0 = dmqo0.c();
        this.a.startActivity(intent0);
        this.a.ar();
    }
}

