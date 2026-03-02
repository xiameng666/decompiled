import android.nfc.NfcAdapter.OnTagRemovedListener;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

public final class blyv implements NfcAdapter.OnTagRemovedListener {
    public final bneb a;

    public blyv(bneb bneb0) {
        this.a = bneb0;
    }

    @Override  // android.nfc.NfcAdapter$OnTagRemovedListener
    public final void onTagRemoved() {
        bnef bnef0 = this.a.a;
        if(bnef0.m == null) {
            bnef0.m = new ErrorResponseData(ErrorCode.b);
        }
        bnef0.g.b(Transport.c, bnef0.m);
    }
}

