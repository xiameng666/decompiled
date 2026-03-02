import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.ViewCardRequest;

public final class ebcd extends ebav {
    private final ViewCardRequest a;
    private final donp b;

    public ebcd(ViewCardRequest viewCardRequest0, String s, donp donp0, azug azug0) {
        super("ViewCard", s, azug0);
        this.a = viewCardRequest0;
        this.b = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        Account account0 = this.a.a;
        GooglePaymentMethodId googlePaymentMethodId0 = this.a.b;
        if(account0 == null || googlePaymentMethodId0 == null) {
            throw new cjuh(10, null);
        }
        dmqk dmqk0 = new dmqk();
        dmqk0.d(account0);
        dmqk0.h(googlePaymentMethodId0.b);
        dmqk0.i(googlePaymentMethodId0.a);
        this.b.p(Status.b, fqaw.a(context0, googlePaymentMethodId0.hashCode(), dmqk0.c(), 0x4C000000));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.p(status0, null);
    }
}

