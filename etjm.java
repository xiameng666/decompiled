import android.widget.Toast;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjm implements evqc {
    public final RequestTokenizeChimeraActivity a;

    public etjm(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(RequestTokenizeChimeraActivity.j.j(), "Failed to get parental consent", exception0);
        Toast.makeText(this.a, 0x7F1507F3, 0).show();  // string:common_cancelled "Cancelled"
        this.a.finish();
    }
}

