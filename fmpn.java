import android.view.View.OnClickListener;
import android.view.View;

public final class fmpn implements View.OnClickListener {
    public final fmpp a;
    public final fmhp b;

    public fmpn(fmpp fmpp0, fmhp fmhp0) {
        this.a = fmpp0;
        this.b = fmhp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ((fmuw)this.a.a).f(0x7D);
        this.a.e.a(this.b);
    }
}

