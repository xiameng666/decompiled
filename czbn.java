import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.UpdateAdvertisingOptionsParams;

public final class czbn implements azys {
    public final czdu a;
    public final String b;
    public final byte[] c;
    public final AdvertisingOptions d;

    public czbn(czdu czdu0, byte[] arr_b, AdvertisingOptions advertisingOptions0) {
        this.a = czdu0;
        this.b = "NearbySharing";
        this.c = arr_b;
        this.d = advertisingOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czds czds0 = new czds(this.a, ((evqp)object1));
        com.google.android.gms.nearby.internal.connection.AdvertisingOptions advertisingOptions0 = com.google.android.gms.nearby.internal.connection.AdvertisingOptions.a(this.d);
        czft czft0 = (czft)((czbf)object0).H();
        UpdateAdvertisingOptionsParams updateAdvertisingOptionsParams0 = new UpdateAdvertisingOptionsParams();
        updateAdvertisingOptionsParams0.a = new czbc(czds0);
        updateAdvertisingOptionsParams0.b = this.b;
        updateAdvertisingOptionsParams0.d = this.c;
        updateAdvertisingOptionsParams0.c = advertisingOptions0;
        czft0.I(updateAdvertisingOptionsParams0);
    }
}

