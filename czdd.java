import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.nearby.internal.connection.DeviceParams;
import com.google.android.gms.nearby.internal.connection.ProviderGetLocalDeviceParams;
import com.google.android.gms.nearby.presence.PresenceDevice;
import j..util.Objects;
import j..util.Optional;

final class czdd implements azye {
    final ProviderGetLocalDeviceParams a;

    public czdd(czfc czfc0, ProviderGetLocalDeviceParams providerGetLocalDeviceParams0) {
        this.a = providerGetLocalDeviceParams0;
        Objects.requireNonNull(czfc0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cuwd cuwd0;
        cuwe cuwe0 = (cuwe)object0;
        try {
            byte[] arr_b = this.a.b;
            if(arr_b == null) {
                cuwd0 = cuwe0.c();
            }
            else {
                Optional optional0 = Optional.empty();
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.unmarshall(arr_b, 0, arr_b.length);
                    parcel0.setDataPosition(0);
                    optional0 = Optional.of(((cuwd)PresenceDevice.CREATOR.createFromParcel(parcel0)));
                }
                catch(ClassCastException classCastException0) {
                    Log.w("NearbyConnections", "DeviceProvider<T> type is not compatible with PresenceDevice. Passing Optional.empty() for remoteDevice.", classCastException0);
                }
                finally {
                    parcel0.recycle();
                }
                cuwd0 = cuwe0.d(optional0);
            }
            if(cuwd0.a() != 2) {
                throw new RemoteException("Unknown device type");
            }
            czfg czfg0 = this.a.a;
            DeviceParams deviceParams0 = new DeviceParams();
            deviceParams0.a = cuwd0.a();
            deviceParams0.b = (PresenceDevice)cuwd0;
            czfg0.a(deviceParams0);
        }
        catch(RemoteException remoteException0) {
            Log.w("NearbyConnections", "Failed to get local device from the provider.", remoteException0);
        }
    }

    @Override  // azye
    public final void b() {
    }
}

