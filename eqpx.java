import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

public final class eqpx implements evqf {
    public final eqqd a;

    public eqpx(eqqd eqqd0) {
        this.a = eqqd0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        AdvertisingInfo advertisingInfo0 = (AdvertisingInfo)object0;
        this.a.d = advertisingInfo0.b;
        eqqd.a.j("Retrieved advertising info.", new Object[0]);
        eqqd.a.j("mDeviceName fetched: " + this.a.d, new Object[0]);
        eqqd.a.j("Pairing code: " + advertisingInfo0.d, new Object[0]);
        Bundle bundle0 = new Bundle();
        bundle0.putString("deviceName", this.a.d);
        bundle0.putString("pairingCode", advertisingInfo0.d);
        bundle0.putString("encodedKey", advertisingInfo0.c);
        this.a.ai.c(0x74, bundle0);
    }
}

