import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class etbb extends esem {
    public etbb(etbt etbt0, aztw aztw0) {
        Objects.requireNonNull(etbt0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new etbk(status0, null);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        etau etau0 = (etau)azsr0;
        etbr etbr0 = new etbr(this);
        ((eszv)etau0.H()).E(etbr0, cclr.a(etau0.r));
    }
}

