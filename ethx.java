import android.os.Parcel;
import com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse;

public abstract class ethx extends wby implements ethy {
    public ethx() {
        super("com.google.android.gms.tapandpay.issuer.IPushTokenizeResponseCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                boolean z = wbz.i(parcel0);
                ethx.gr(parcel0);
                this.d(z);
                return true;
            }
            case 3: {
                GeneratePaymentCredentialsResponse generatePaymentCredentialsResponse0 = (GeneratePaymentCredentialsResponse)wbz.a(parcel0, GeneratePaymentCredentialsResponse.CREATOR);
                ethx.gr(parcel0);
                this.c(generatePaymentCredentialsResponse0);
                return true;
            }
            case 4: {
                int v1 = parcel0.readInt();
                ethx.gr(parcel0);
                this.a(v1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

