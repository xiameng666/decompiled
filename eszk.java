import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;

public final class eszk implements evpz {
    public final eszq a;

    public eszk(eszq eszq0) {
        this.a = eszq0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        eszq eszq0 = this.a;
        xob xob0 = eszq0.an();
        if(xob0 == null) {
            return;
        }
        if(evql0.n()) {
            eszq0.al = (GetAllCardsResponse)evql0.j();
            eszq0.ak = eszq.z(((GetAllCardsResponse)evql0.j()).a);
            eszq0.D(xob0);
            return;
        }
        xob0.finish();
    }
}

