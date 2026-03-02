import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import j..util.Objects;

public final class aagc implements lqj {
    public final aahd a;

    public aagc(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        CardDeckView cardDeckView0 = (CardDeckView)this.a.aq;
        grya grya0 = (grya)((gfsx)object0).g();
        if(Objects.equals(cardDeckView0.ao, grya0)) {
            return;
        }
        cardDeckView0.ao = grya0;
        cardDeckView0.aL();
    }
}

