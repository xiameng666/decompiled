import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsInitiatorParams;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsResponderParams;
import com.google.android.gms.nearby.internal.connection.ProviderGetLocalDeviceParams;
import com.google.android.gms.nearby.internal.connection.ProviderGetServiceIdParams;
import j..util.Objects;

public final class czfc extends wby implements czfd {
    final azyf a;

    public czfc() {
        super("com.google.android.gms.nearby.internal.connection.IDeviceProvider");
    }

    public czfc(czdu czdu0, azyf azyf0) {
        this.a = azyf0;
        Objects.requireNonNull(czdu0);
        super("com.google.android.gms.nearby.internal.connection.IDeviceProvider");
    }

    @Override  // czfd
    public final void a(ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams0) {
        czdh czdh0 = new czdh(this, providerAuthenticateAsInitiatorParams0);
        this.a.b(czdh0);
    }

    @Override  // czfd
    public final void b(ProviderAuthenticateAsResponderParams providerAuthenticateAsResponderParams0) {
        czdl czdl0 = new czdl(this, providerAuthenticateAsResponderParams0);
        this.a.b(czdl0);
    }

    @Override  // czfd
    public final void c(ProviderGetLocalDeviceParams providerGetLocalDeviceParams0) {
        czdd czdd0 = new czdd(this, providerGetLocalDeviceParams0);
        this.a.b(czdd0);
    }

    @Override  // czfd
    public final void d(ProviderGetServiceIdParams providerGetServiceIdParams0) {
        czdc czdc0 = new czdc(this, providerGetServiceIdParams0);
        this.a.b(czdc0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ProviderGetServiceIdParams providerGetServiceIdParams0 = (ProviderGetServiceIdParams)wbz.a(parcel0, ProviderGetServiceIdParams.CREATOR);
                czfc.gr(parcel0);
                this.d(providerGetServiceIdParams0);
                return true;
            }
            case 2: {
                ProviderGetLocalDeviceParams providerGetLocalDeviceParams0 = (ProviderGetLocalDeviceParams)wbz.a(parcel0, ProviderGetLocalDeviceParams.CREATOR);
                czfc.gr(parcel0);
                this.c(providerGetLocalDeviceParams0);
                return true;
            }
            case 3: {
                ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams0 = (ProviderAuthenticateAsInitiatorParams)wbz.a(parcel0, ProviderAuthenticateAsInitiatorParams.CREATOR);
                czfc.gr(parcel0);
                this.a(providerAuthenticateAsInitiatorParams0);
                return true;
            }
            case 4: {
                ProviderAuthenticateAsResponderParams providerAuthenticateAsResponderParams0 = (ProviderAuthenticateAsResponderParams)wbz.a(parcel0, ProviderAuthenticateAsResponderParams.CREATOR);
                czfc.gr(parcel0);
                this.b(providerAuthenticateAsResponderParams0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

