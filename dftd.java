import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

public final class dftd extends ddpq {
    final dftj a;
    final dcnp b;

    public dftd(dftj dftj0, dcnp dcnp0) {
        this.a = dftj0;
        this.b = dcnp0;
        super();
    }

    @Override  // ddpr
    public final void a(OnTransferUpdateParams onTransferUpdateParams0) {
        ibuq.f(onTransferUpdateParams0, "params");
        dftc dftc0 = new dftc(this.a, onTransferUpdateParams0, this.b);
        this.a.d.a(dftc0);
    }
}

