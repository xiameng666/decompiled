import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseData;
import android.os.ParcelUuid;

final class czqd {
    public final AdvertiseData a;
    public final AdvertiseData b;

    public czqd() {
        throw null;
    }

    public czqd(AdvertiseData advertiseData0, AdvertiseData advertiseData1) {
        this.a = advertiseData0;
        this.b = advertiseData1;
    }

    static czqd a(byte[] arr_b, boolean z) {
        return czqd.b(arr_b, z, false);
    }

    static czqd b(byte[] arr_b, boolean z, boolean z1) {
        ParcelUuid parcelUuid0 = z1 ? czri.b : czri.a;
        int v = bbqa.d() ? 27 : 23;
        if(z || !bbqa.d()) {
            v += -3;
        }
        AdvertiseData.Builder advertiseData$Builder0 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
        if(arr_b.length <= v) {
            advertiseData$Builder0.addServiceData(parcelUuid0, arr_b);
            if(!bbqa.d()) {
                advertiseData$Builder0.addServiceUuid(parcelUuid0);
            }
            return new czqd(advertiseData$Builder0.build(), null);
        }
        if(arr_b.length <= 27) {
            if(!bbqa.d()) {
                advertiseData$Builder0.addServiceUuid(parcelUuid0);
            }
            AdvertiseData.Builder advertiseData$Builder1 = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false);
            advertiseData$Builder1.addServiceData(parcelUuid0, arr_b);
            return new czqd(advertiseData$Builder0.build(), advertiseData$Builder1.build());
        }
        czkq.a.e().h("Failed to create ble advertisement, size exceeded. length : %d", Integer.valueOf(arr_b.length));
        return new czqd(null, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czqd)) {
            AdvertiseData advertiseData0 = this.a;
            if(advertiseData0 == null) {
                if(((czqd)object0).a == null) {
                    return this.b == null ? ((czqd)object0).b == null : this.b.equals(((czqd)object0).b);
                }
            }
            else if(advertiseData0.equals(((czqd)object0).a)) {
                return this.b == null ? ((czqd)object0).b == null : this.b.equals(((czqd)object0).b);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        AdvertiseData advertiseData0 = this.b;
        if(advertiseData0 != null) {
            v = advertiseData0.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "Advertisement{advertiseData=" + this.a + ", scanResponse=" + this.b + "}";
    }
}

