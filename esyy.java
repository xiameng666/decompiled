import android.content.ComponentName;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;

public final class esyy {
    public static final void a(xob xob0) {
        if(esgb.c(xob0)) {
            NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(xob0);
            if(nfcAdapter0 != null) {
                try {
                    CardEmulation cardEmulation0 = CardEmulation.getInstance(nfcAdapter0);
                    ComponentName componentName0 = new ComponentName(xob0, "com.google.android.gms.tapandpay.hce.service.TpHceService");
                    if(esyy.d(cardEmulation0, componentName0)) {
                        cardEmulation0.setPreferredService(xob0.getContainerActivity(), componentName0);
                    }
                }
                catch(UnsupportedOperationException unused_ex) {
                }
            }
        }
    }

    public static final boolean b(Context context0) {
        NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
        if(nfcAdapter0 == null) {
            return false;
        }
        try {
            return esyy.d(CardEmulation.getInstance(nfcAdapter0), new ComponentName(context0, "com.google.android.gms.tapandpay.hce.service.TpHceService"));
        }
        catch(UnsupportedOperationException unused_ex) {
            return false;
        }
    }

    public static final void c(xob xob0) {
        if(esgb.c(xob0)) {
            NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(xob0);
            if(nfcAdapter0 != null) {
                try {
                    CardEmulation cardEmulation0 = CardEmulation.getInstance(nfcAdapter0);
                    if(esyy.d(cardEmulation0, new ComponentName(xob0, "com.google.android.gms.tapandpay.hce.service.TpHceService"))) {
                        cardEmulation0.unsetPreferredService(xob0.getContainerActivity());
                    }
                }
                catch(UnsupportedOperationException unused_ex) {
                }
            }
        }
    }

    private static final boolean d(CardEmulation cardEmulation0, ComponentName componentName0) {
        return !cardEmulation0.isDefaultServiceForCategory(componentName0, "payment") && cardEmulation0.categoryAllowsForegroundPreference("payment");
    }
}

