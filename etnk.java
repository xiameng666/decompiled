import android.content.Context;
import android.nfc.NfcAdapter;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.regex.Pattern;

public final class etnk {
    public static final bboh a;

    static {
        etnk.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public static boolean a(esgi esgi0) {
        AccountInfo accountInfo0 = esgi0.a();
        AccountInfo accountInfo1 = eset.f(esgi0.d, esgi0.c);
        return accountInfo1 != null && accountInfo1.a.equals(accountInfo0.a);
    }

    public static boolean b(Context context0) {
        NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
        return nfcAdapter0 != null && nfcAdapter0.isEnabled();
    }

    public static boolean c(String s, String s1) {
        return gfta.c(s) || gfta.c(s1) ? false : Pattern.compile(s).matcher(s1).find();
    }
}

