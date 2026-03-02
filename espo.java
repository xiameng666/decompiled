import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;

public final class espo {
    public static final bboh a;
    public final espr b;
    public final CardEmulation c;

    static {
        espo.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public espo(Context context0) {
        espr espr0 = new espr(context0);
        this.b = espr0;
        this.c = CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(espr0));
    }
}

