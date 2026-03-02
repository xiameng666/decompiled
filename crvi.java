import android.os.Bundle;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;

public final class crvi {
    public String a;
    public String b;
    public String c;
    public String d;
    public Bundle e;
    public Integer f;
    public Long g;
    public int h;
    private final PaymentForm[] i;
    private final String j;

    public crvi() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.i = null;
        this.j = null;
    }

    public crvi(MdpPurchaseOfferRequest mdpPurchaseOfferRequest0) {
        this.a = mdpPurchaseOfferRequest0.a;
        this.b = mdpPurchaseOfferRequest0.b;
        this.c = mdpPurchaseOfferRequest0.c;
        this.d = mdpPurchaseOfferRequest0.d;
        this.e = mdpPurchaseOfferRequest0.e;
        this.f = mdpPurchaseOfferRequest0.f;
        this.g = mdpPurchaseOfferRequest0.g;
        this.h = mdpPurchaseOfferRequest0.h;
        this.i = mdpPurchaseOfferRequest0.i;
        this.j = mdpPurchaseOfferRequest0.j;
    }

    public final MdpPurchaseOfferRequest a() {
        return new MdpPurchaseOfferRequest(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}

