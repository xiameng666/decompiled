import android.nfc.NfcAdapter;
import com.google.android.chimera.android.Activity;

public final class ddyk implements ibts {
    public final NfcAdapter a;
    public final Activity b;

    public ddyk(NfcAdapter nfcAdapter0, Activity activity0) {
        this.a = nfcAdapter0;
        this.b = activity0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gqb)object0), "$this$DisposableEffect");
        android.app.Activity activity0 = this.b.getContainerActivity();
        ddyj ddyj0 = new ddyj(this.b);
        this.a.enableReaderMode(activity0, ddyj0, 385, ddyn.a);
        return new ddym(this.a, this.b);
    }
}

