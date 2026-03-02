import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetWearPaymentMethodsRequest;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class ebai extends ebav {
    AndroidInjector a;
    dmtv b;
    private final GetWearPaymentMethodsRequest c;
    private final donp d;
    private final String e;

    public ebai(GetWearPaymentMethodsRequest getWearPaymentMethodsRequest0, String s, donp donp0, azug azug0) {
        super("GetWearPaymentMethods", s, azug0);
        this.e = s;
        this.c = getWearPaymentMethodsRequest0;
        this.d = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        GetWearPaymentMethodsRequest getWearPaymentMethodsRequest0 = this.c;
        String s = getWearPaymentMethodsRequest0.a.name;
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            Status status0 = new Status(8);
            this.d.q(status0, null);
            return;
        }
        if(this.a == null) {
            domw domw0 = this.i;
            dola dola0 = new dola(s, s1);
            dmgr dmgr0 = new dmgr(this.e);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.a = new eaxa(dola0, dmgr0, domw0, domv0, new edop());
        }
        this.a.inject(this);
        try {
            donp donp0 = this.d;
            Status status1 = Status.b;
            dmtv dmtv0 = this.b;
            long v = getWearPaymentMethodsRequest0.c;
            int v1 = getWearPaymentMethodsRequest0.b;
            byte[] arr_b = getWearPaymentMethodsRequest0.d;
            int[] arr_v = getWearPaymentMethodsRequest0.e;
            dxep dxep0 = dmtv0.b(v);
            switch(v1) {
                case 1: {
                    break;
                }
                case 2: {
                    dmtt dmtt0 = new dmtt(dmtv0, dxep0, v, arr_b, arr_v);
                    dxep0 = dxep0;
                    dmtv0.c.execute(dmtt0);
                    break;
                }
                case 3: {
                    dmtv0.c(dxep0, v, arr_b, arr_v);
                    dxep0 = dmtv0.b(v);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unsupported fetch mode: " + v1);
                }
            }
            donp0.q(status1, ftqe.a(((MessageLite)dxep0)));
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            throw new cjuh(8, null, null, exception0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.q(status0, null);
    }
}

