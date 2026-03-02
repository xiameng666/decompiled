import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter.ReaderCallback;
import android.nfc.NfcAdapter;

public final class blyw {
    public final NfcAdapter a;

    public blyw(NfcAdapter nfcAdapter0) {
        this.a = nfcAdapter0;
    }

    public final void a(Activity activity0) {
        if(hsub.a.b().i() && activity0.isDestroyed()) {
            return;
        }
        this.a.disableReaderMode(activity0);
    }

    public final boolean b() {
        return this.a.isEnabled();
    }

    public static blyw c(Context context0) {
        return NfcAdapter.getDefaultAdapter(context0) == null ? null : new blyw(NfcAdapter.getDefaultAdapter(context0));
    }

    public final void d(Activity activity0, NfcAdapter.ReaderCallback nfcAdapter$ReaderCallback0, int v) {
        this.a.enableReaderMode(activity0, nfcAdapter$ReaderCallback0, v, null);
    }
}

