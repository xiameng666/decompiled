import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetPaymentMethodsRequest;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@cmcs(a = cmcr.c)
public final class eazz extends ebav {
    AndroidInjector a;
    dmtv b;
    edrc c;
    private final GetPaymentMethodsRequest d;
    private final donp e;
    private final String f;

    public eazz(GetPaymentMethodsRequest getPaymentMethodsRequest0, String s, donp donp0, azug azug0) {
        super("GetPaymentMethods", s, azug0);
        this.f = s;
        this.d = getPaymentMethodsRequest0;
        this.e = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        GetPaymentMethodsRequest getPaymentMethodsRequest0 = this.d;
        String s = getPaymentMethodsRequest0.a.name;
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            Status status0 = new Status(8);
            this.e.q(status0, null);
            return;
        }
        if(this.a == null) {
            domw domw0 = this.i;
            dola dola0 = dlmg.a(AppContextProvider.a(), s, s1);
            dmgr dmgr0 = new dmgr(this.f);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.a = new eavt(dola0, dmgr0, domw0, domv0, new edop());
        }
        this.a.inject(this);
        try {
            dxeo dxeo0 = this.c.a || hwtu.f() ? this.b.a(getPaymentMethodsRequest0.a, getPaymentMethodsRequest0.b.a) : dxeo.a;
            this.e.q(Status.b, ftqe.a(((MessageLite)dxeo0)));
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            throw new cjuh(8, null, null, exception0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e.q(status0, null);
    }
}

