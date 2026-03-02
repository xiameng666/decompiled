import android.service.quickaccesswallet.SelectWalletCardRequest;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;

public final class esph implements Runnable {
    public final espj a;
    public final SelectWalletCardRequest b;

    public esph(espj espj0, SelectWalletCardRequest selectWalletCardRequest0) {
        this.a = espj0;
        this.b = selectWalletCardRequest0;
    }

    @Override
    public final void run() {
        try {
            espj espj0 = this.a;
            esgi esgi0 = esgj.g(espj0, null);
            String[] arr_s = TextUtils.split(this.b.getCardId(), "::");
            if(arr_s.length != 2) {
                ((ggtj)espj.a.j()).x("couldn\'t parse card id");
                return;
            }
            int v = Integer.parseInt(arr_s[0]);
            espj0.c.a(esgi0, new SelectGlobalActionCardRequest(v, arr_s[1], espj.b));
        }
        catch(eshj | NumberFormatException | cjuh exception0) {
            a.ae(espj.a.j(), "onWalletCardSelected: error", exception0);
        }
    }
}

