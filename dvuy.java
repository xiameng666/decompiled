import com.google.android.gms.pay.GetImagesForValuableResponse;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvuy implements evqf {
    public final dvuz a;
    public final Valuable b;
    public final xob c;

    public dvuy(dvuz dvuz0, Valuable valuable0, xob xob0) {
        this.a = dvuz0;
        this.b = valuable0;
        this.c = xob0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ((ggtj)dvuz.a.h()).B("Image fetch successful for valuable %s. Hiding spinner and updating valuable.", this.b.b);
        gged_interceptors gged0 = gged_interceptors.k(((GetImagesForValuableResponse)object0).a);
        this.a.d(this.c, this.b, gged0);
    }
}

