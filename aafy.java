import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

public final class aafy implements Runnable {
    public final aahd a;
    public final aaml b;

    public aafy(aahd aahd0, aaml aaml0) {
        this.a = aahd0;
        this.b = aaml0;
    }

    @Override
    public final void run() {
        ((CardDeckView)this.a.aq).post(new aags(this.a, this.b));
    }
}

