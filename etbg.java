import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetActiveCardsForAccountResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetActiveCardsForAccountRequest;
import j..util.Objects;

final class etbg extends esem {
    final String a;

    public etbg(etbt etbt0, aztw aztw0, String s) {
        this.a = s;
        Objects.requireNonNull(etbt0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new etbh(status0, new GetActiveCardsForAccountResponse(null));
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        etau etau0 = (etau)azsr0;
        etbm etbm0 = new etbm(this);
        GetActiveCardsForAccountRequest getActiveCardsForAccountRequest0 = new GetActiveCardsForAccountRequest(this.a);
        ((eszv)etau0.H()).n(getActiveCardsForAccountRequest0, etbm0, cclr.a(etau0.r));
    }
}

