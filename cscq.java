import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse.Filter;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import j..util.Objects;
import j..util.Optional;
import java.util.List;

final class cscq implements evqf {
    final cscs a;

    public cscq(cscs cscs0) {
        Objects.requireNonNull(cscs0);
        this.a = cscs0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        cscs cscs0 = this.a;
        cscs0.ah.setVisibility(8);
        List list0 = ((MdpUpsellOfferResponse)object0).j;
        cscs0.ag = (gged_interceptors)Optional.ofNullable(((MdpUpsellOfferResponse)object0).e).map(new cscp()).orElse(ggna.a);
        cscs0.c.j(hhct.dW, 0L);
        if(!list0.isEmpty()) {
            ((ggtj)cscs.a.h()).B("eSIM plan offers have these filters options available: %s", list0);
            cscs0.y(Optional.of(((MdpUpsellOfferResponse.Filter)list0.get(0))));
            return;
        }
        cscs0.y(Optional.empty());
    }
}

