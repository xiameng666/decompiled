import com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingChimeraService;

public final class czwm implements czlf {
    public final NfcAdvertisingChimeraService a;
    public final czwk b;

    public czwm(NfcAdvertisingChimeraService nfcAdvertisingChimeraService0, czwk czwk0) {
        this.a = nfcAdvertisingChimeraService0;
        this.b = czwk0;
    }

    @Override  // czlf
    public final void a() {
        NfcAdvertisingChimeraService nfcAdvertisingChimeraService0 = this.a;
        if(nfcAdvertisingChimeraService0.a == this.b) {
            nfcAdvertisingChimeraService0.a = null;
        }
    }
}

