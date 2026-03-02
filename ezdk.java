import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public class ezdk extends wby implements ezdl {
    public ezdk() {
        super("com.google.android.gms.trustagent.internal.IStateCallbacks");
    }

    @Override  // ezdl
    public void a(Bundle bundle0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // ezdl
    public void b(Bundle bundle0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezdk.gr(parcel0);
                this.a(bundle0, apiMetadata0);
                break;
            }
            case 2: {
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ezdk.gr(parcel0);
                this.b(bundle1, apiMetadata1);
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

