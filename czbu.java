import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;

public final class czbu implements azys {
    public final czdu a;
    public final byte[] b;
    public final String c;
    public final azyf d;
    public final AdvertisingOptions e;

    public czbu(czdu czdu0, byte[] arr_b, azyf azyf0, AdvertisingOptions advertisingOptions0) {
        this.a = czdu0;
        this.b = arr_b;
        this.c = "NearbySharing";
        this.d = azyf0;
        this.e = advertisingOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czbf czbf0 = (czbf)object0;
        czds czds0 = new czds(this.a, ((evqp)object1));
        com.google.android.gms.nearby.internal.connection.AdvertisingOptions advertisingOptions0 = com.google.android.gms.nearby.internal.connection.AdvertisingOptions.a(this.e);
        cyyy cyyy0 = new cyyy(this.d);
        czbf0.f.add(cyyy0);
        czft czft0 = (czft)czbf0.H();
        StartAdvertisingParams startAdvertisingParams0 = new StartAdvertisingParams();
        startAdvertisingParams0.a = new czbe(czds0);
        startAdvertisingParams0.h = this.b;
        startAdvertisingParams0.d = this.c;
        startAdvertisingParams0.f = advertisingOptions0;
        startAdvertisingParams0.g = cyyy0;
        czft0.t(startAdvertisingParams0);
    }
}

