import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import j..util.Objects;

public final class aaga implements lqj {
    public final aahd a;

    public aaga(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        CardDeckView cardDeckView0 = (CardDeckView)this.a.aq;
        aatc aatc0 = (aatc)((gfsx)object0).g();
        if(Objects.equals(cardDeckView0.aq, aatc0)) {
            return;
        }
        cardDeckView0.aq = aatc0;
        cardDeckView0.aL();
    }
}

