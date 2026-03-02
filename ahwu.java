import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public class ahwu extends wby implements ahwv {
    public ahwu() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override  // ahwv
    public void a(ProxyResponse proxyResponse0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ahwv
    public void b(String s) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ProxyResponse proxyResponse0 = (ProxyResponse)wbz.a(parcel0, ProxyResponse.CREATOR);
                ahwu.gr(parcel0);
                this.a(proxyResponse0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                ahwu.gr(parcel0);
                this.b(s);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

