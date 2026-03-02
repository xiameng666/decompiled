import android.view.View.OnClickListener;
import android.view.View;

public final class epjc implements View.OnClickListener {
    public final epje a;
    public final epji b;
    public final epng c;

    public epjc(epje epje0, epji epji0, epng epng0) {
        this.a = epje0;
        this.b = epji0;
        this.c = epng0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        lps lps0 = lsr.a(this.a.a);
        if(lps0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        lpk lpk0 = lpt.a(lps0);
        epjd epjd0 = new epjd(this.b, this.c, null);
        icbb.b(lpk0, cclw.d, null, epjd0, 2);
    }
}

