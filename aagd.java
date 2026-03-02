import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

public final class aagd implements lqj {
    public final aahd a;

    public aagd(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aahd aahd0 = this.a;
        boolean z = aahd0.H();
        CardDeckView cardDeckView0 = (CardDeckView)aahd0.aq;
        aaby aaby0 = (aaby)((gfsx)object0).g();
        cardDeckView0.al = aaby0;
        aahb aahb0 = aahd0.a;
        cardDeckView0.aj = aahb0;
        ztd ztd0 = cardDeckView0.an;
        if(ztd0 == null) {
            cardDeckView0.aK();
        }
        else {
            ztd0.H(aaby0, aahb0);
        }
        if(z && (!hoju.j() || ((gfsx)object0).i())) {
            ((CardDeckView)aahd0.aq).aM().aa(0, 0);
        }
    }
}

