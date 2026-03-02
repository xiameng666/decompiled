import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjd implements ibts {
    public final RequestTokenizeChimeraActivity a;

    public etjd(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        etho etho0 = this.a.G;
        fced fced0 = this.a.z;
        fcfe fcfe0 = this.a.A;
        ibrt ibrt0 = this.a.B;
        azts azts0 = this.a.H;
        AccountInfo accountInfo0 = this.a.o;
        PushTokenizeRequest pushTokenizeRequest0 = this.a.y;
        batl.s(pushTokenizeRequest0);
        esgi esgi0 = this.a.p;
        ethw ethw0 = this.a.y.c();
        batl.s(ethw0);
        return new etlf(etho0, fced0, fcfe0, ibrt0, azts0, accountInfo0, pushTokenizeRequest0, esgi0, new etih(ethw0), this.a.getPackageManager(), this.a.getApplication(), this.a.q);
    }
}

