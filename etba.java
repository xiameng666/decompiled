import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;
import j..util.Objects;

final class etba extends esem {
    public etba(etbt etbt0, aztw aztw0) {
        Objects.requireNonNull(etbt0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final azuj g(Status status0) {
        return new etbi(status0, new GetAllCardsResponse(null, null, null, null, new SparseArray(0)));
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        etau etau0 = (etau)azsr0;
        etbn etbn0 = new etbn(this);
        GetAllCardsRequest getAllCardsRequest0 = new GetAllCardsRequest();
        ((eszv)etau0.H()).p(getAllCardsRequest0, etbn0, cclr.a(etau0.r));
    }
}

