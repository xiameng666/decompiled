import android.content.Context;
import android.nfc.NfcAdapter;

public final class czlo {
    private final NfcAdapter a;

    public czlo(Context context0) {
        NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0.getApplicationContext());
        this.a = nfcAdapter0;
        if(nfcAdapter0 == null) {
            czkq.a.e().p("Failed to retrieve default NfcAdapter, NFC is unsupported.", new Object[0]);
        }
    }

    public final boolean a() {
        synchronized(this) {
            if(this.a != null && this.a.isEnabled()) {
                return true;
            }
        }
        return false;
    }
}

