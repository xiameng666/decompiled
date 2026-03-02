import android.widget.Toast;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

public final class etjz implements ette {
    public final RequestTokenizeChimeraActivity a;

    public etjz(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity0) {
        this.a = requestTokenizeChimeraActivity0;
    }

    @Override  // ette
    public final void a(etth etth0) {
        a.ae(RequestTokenizeChimeraActivity.j.j(), "Error generating session id.", etth0);
        Toast.makeText(this.a, 0x7F1507F3, 0).show();  // string:common_cancelled "Cancelled"
        this.a.finish();
    }
}

