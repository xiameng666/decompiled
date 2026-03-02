import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;

public final class espc implements Runnable {
    public final espj a;

    public espc(espj espj0) {
        this.a = espj0;
    }

    @Override
    public final void run() {
        try {
            esgi esgi0 = esgj.g(this.a, null);
            this.a.c.a(esgi0, new SelectGlobalActionCardRequest(4, "", espj.b));
            int v = new dyct().g();
            if(v != 6 && (v != 4 && v != 5) && v != 3) {
                return;
            }
            new dyct().h(2);
        }
        catch(eshj | cjuh exception0) {
            a.ae(espj.a.j(), "onWalletCardSelected: error", exception0);
        }
    }
}

