import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import j..util.Objects;

public final class aage implements lqj {
    public final aahd a;

    public aage(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        CardDeckView cardDeckView0 = (CardDeckView)this.a.aq;
        aamk aamk0 = (aamk)((gfsx)object0).g();
        if(Objects.equals(aamk0, cardDeckView0.am)) {
            return;
        }
        cardDeckView0.am = aamk0;
        cardDeckView0.aL();
    }
}

