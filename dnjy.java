import com.google.android.gms.pay.fops.details.FopDetailsFragment;

public final class dnjy implements evpz {
    final eflz a;
    final FopDetailsFragment b;

    public dnjy(eflz eflz0, FopDetailsFragment fopDetailsFragment0) {
        this.a = eflz0;
        this.b = fopDetailsFragment0;
        super();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        Exception exception0 = evql0.i();
        if(exception0 != null) {
            a.ae(FopDetailsFragment.a.i(), "delete token failed", exception0);
        }
        this.a.dismiss();
        FopDetailsFragment fopDetailsFragment0 = this.b;
        fopDetailsFragment0.A().f(false);
        if(evql0.n()) {
            ((ggtj)FopDetailsFragment.a.h()).x("token successfully deleted from wallet");
            fopDetailsFragment0.A().j();
            FopDetailsFragment.E(fopDetailsFragment0);
        }
    }
}

