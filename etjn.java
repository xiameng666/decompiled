import android.widget.Toast;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjn implements evqc {
    public final RequestTokenizeChimeraActivity a;

    public etjn(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.t();
        Status status0 = (exception0 instanceof aztb) ? ((aztb)exception0).a : Status.d;
        Toast.makeText(this.a, 0x7F15332E, 0).show();  // string:tp_switching_accounts_failed_text "Switching accounts failed. Please try 
                                                       // again."
        ((ggtj)RequestTokenizeChimeraActivity.j.i()).H("setActiveAccount failed %d %s", status0.i, status0.j);
    }
}

