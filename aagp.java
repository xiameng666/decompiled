import android.view.View;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

public final class aagp implements Runnable {
    public final aahd a;
    public final aaml b;

    public aagp(aahd aahd0, aaml aaml0) {
        this.a = aahd0;
        this.b = aaml0;
    }

    @Override
    public final void run() {
        View view0 = ((CardDeckView)this.a.aq).aM().S(this.b.a.b);
        if(view0 != null) {
            view0.sendAccessibilityEvent(8);
        }
    }
}

