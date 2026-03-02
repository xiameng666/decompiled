import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

public final class aags implements Runnable {
    public final aahd a;
    public final aaml b;

    public aags(aahd aahd0, aaml aaml0) {
        this.a = aahd0;
        this.b = aaml0;
    }

    @Override
    public final void run() {
        aahd aahd0 = this.a;
        aaml aaml0 = this.b;
        if(aaml0.b && !aahd0.c.isTouchExplorationEnabled()) {
            CardDeckView cardDeckView0 = (CardDeckView)aahd0.aq;
            int v = aaml0.a.b;
            int v1 = aaml0.a.c;
            aabv aabv0 = cardDeckView0.aM().k == 1 ? new aabv(cardDeckView0, cardDeckView0.getContext(), v1) : new aabw(cardDeckView0, cardDeckView0.getContext(), v1);
            aabv0.b = v;
            cardDeckView0.aM().bb(aabv0);
        }
        else {
            ((CardDeckView)aahd0.aq).aM().aa(aaml0.a.b, aaml0.a.c);
        }
        if(hoju.j() && !aahd0.aq.hasNestedScrollingParent() && aahd0.aq.startNestedScroll(2)) {
            int[] arr_v = new int[2];
            aahd0.aq.dispatchNestedPreScroll(1, 0, arr_v, null);
            ((CardDeckView)aahd0.aq).post(new aagq(aahd0, arr_v));
        }
        if(aaml0.c) {
            ((CardDeckView)aahd0.aq).post(new aagp(aahd0, aaml0));
        }
    }
}

