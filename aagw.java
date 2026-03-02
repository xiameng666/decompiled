import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import j..util.Objects;

public final class aagw implements lqj {
    public final aahd a;

    public aagw(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        CardDeckView cardDeckView0 = (CardDeckView)this.a.aq;
        String s = (String)((gfsx)object0).g();
        if(Objects.equals(cardDeckView0.ar, s)) {
            return;
        }
        cardDeckView0.ar = s;
        cardDeckView0.aL();
    }
}

