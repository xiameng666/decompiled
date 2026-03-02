import android.content.ComponentName;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;
import j..util.Objects;

public final class etkq extends clil {
    final etih a;
    final GeneratePaymentCredentialsRequest b;
    final evqp c;

    public etkq(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0, etih etih0, GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest0, evqp evqp0) {
        this.a = etih0;
        this.b = generatePaymentCredentialsRequest0;
        this.c = evqp0;
        Objects.requireNonNull(requestTokenizeChimeraActivity0);
        super("tapandpay");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        evqp evqp0;
        try {
            evqp0 = this.c;
            etie etie0 = new etie(this.a, evqp0);
            this.a.a.a(this.b, etie0);
        }
        catch(RemoteException remoteException0) {
            evqp0.d(remoteException0);
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
    }
}

