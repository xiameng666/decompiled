import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;

public final class aagu implements lqj {
    public final aahd a;

    public aagu(aahd aahd0) {
        this.a = aahd0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        aahd aahd0 = this.a;
        tk tk0 = ((CardDeckView)aahd0.aq).m;
        aafy aafy0 = new aafy(aahd0, ((aaml)object0));
        if(tk0 != null && tk0.b() == 0) {
            tk0.A(new aagz(aahd0, tk0, aafy0));
            return;
        }
        aafy0.run();
    }
}

