import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpMoney;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

public final class crvl {
    public String a;
    public Bundle b;
    public Integer c;
    public Long d;
    public String e;
    public Long f;
    public MdpMoney g;
    public String h;
    public String i;
    private final PaymentForm[] j;

    public crvl() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.j = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public crvl(MdpUpsellOfferRequest mdpUpsellOfferRequest0) {
        this.a = mdpUpsellOfferRequest0.a;
        this.b = mdpUpsellOfferRequest0.b;
        this.c = mdpUpsellOfferRequest0.c;
        this.d = mdpUpsellOfferRequest0.d;
        this.j = mdpUpsellOfferRequest0.e;
        this.e = mdpUpsellOfferRequest0.f;
        this.f = mdpUpsellOfferRequest0.g;
        this.g = mdpUpsellOfferRequest0.h;
        this.h = mdpUpsellOfferRequest0.i;
        this.i = mdpUpsellOfferRequest0.j;
    }

    public final MdpUpsellOfferRequest a() {
        return new MdpUpsellOfferRequest(this.a, this.b, this.c, this.d, this.j, this.e, this.f, this.g, this.h, this.i);
    }
}

