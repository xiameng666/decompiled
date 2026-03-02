import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import j..util.Objects;

public final class aagt implements lqj {
    public final aahd a;

    public aagt(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        CardDeckView cardDeckView0 = (CardDeckView)this.a.aq;
        aamm aamm0 = (aamm)((gfsx)object0).g();
        if(Objects.equals(cardDeckView0.ap, aamm0)) {
            return;
        }
        cardDeckView0.ap = aamm0;
        cardDeckView0.aL();
    }
}

