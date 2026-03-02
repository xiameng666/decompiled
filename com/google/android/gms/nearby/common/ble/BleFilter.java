package com.google.android.gms.nearby.common.ble;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cunx;
import cunz;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class BleFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final ParcelUuid e;
    public final byte[] f;
    public final byte[] g;
    public final int h;
    public final byte[] i;
    public final byte[] j;

    static {
        BleFilter.CREATOR = new cunx();
    }

    public BleFilter(String s, String s1, ParcelUuid parcelUuid0, ParcelUuid parcelUuid1, ParcelUuid parcelUuid2, byte[] arr_b, byte[] arr_b1, int v, byte[] arr_b2, byte[] arr_b3) {
        this.a = s;
        this.c = parcelUuid0;
        this.d = parcelUuid1;
        this.b = s1;
        this.e = parcelUuid2;
        this.f = arr_b;
        this.g = arr_b1;
        this.h = v;
        this.i = arr_b2;
        this.j = arr_b3;
    }

    public final boolean a(BleFilter bleFilter0) {
        if(bleFilter0 == null) {
            return false;
        }
        if(this.equals(bleFilter0)) {
            return true;
        }
        if(this.b != null && !this.b.equals(bleFilter0.b)) {
            return false;
        }
        if(this.a != null && !this.a.equals(bleFilter0.a)) {
            return false;
        }
        ParcelUuid parcelUuid0 = this.c;
        if(parcelUuid0 != null) {
            ParcelUuid parcelUuid1 = this.d;
            ParcelUuid parcelUuid2 = bleFilter0.c;
            ParcelUuid parcelUuid3 = bleFilter0.d;
            if(parcelUuid2 == null) {
                return false;
            }
            if(parcelUuid1 == null) {
                if(!parcelUuid0.equals(parcelUuid2)) {
                    return false;
                }
                return this.e == null || this.e.equals(bleFilter0.e) && BleFilter.e(this.f, this.g, bleFilter0.f, bleFilter0.g) ? this.h < 0 || this.h == bleFilter0.h && BleFilter.e(this.i, this.j, bleFilter0.i, bleFilter0.j) : false;
            }
            if(parcelUuid3 != null) {
                long v = parcelUuid1.getUuid().getMostSignificantBits();
                long v1 = parcelUuid1.getUuid().getLeastSignificantBits();
                if((parcelUuid3.getUuid().getMostSignificantBits() & v) == v && (v1 & parcelUuid3.getUuid().getLeastSignificantBits()) == v1) {
                    goto label_21;
                }
                return false;
            }
        label_21:
            if(!BleFilter.d(parcelUuid0, parcelUuid1, Arrays.asList(new ParcelUuid[]{parcelUuid2}))) {
                return false;
            }
        }
        return this.e == null || this.e.equals(bleFilter0.e) && BleFilter.e(this.f, this.g, bleFilter0.f, bleFilter0.g) ? this.h < 0 || this.h == bleFilter0.h && BleFilter.e(this.i, this.j, bleFilter0.i, bleFilter0.j) : false;
    }

    public final boolean b(BleSighting bleSighting0) {
        if(this.b != null && (bleSighting0.a == null || !this.b.equals(bleSighting0.a.getAddress()))) {
            return false;
        }
        cunz cunz0 = bleSighting0.b;
        if(this.a != null && !this.a.equals(cunz0.d)) {
            return false;
        }
        if(this.c != null && !BleFilter.d(this.c, this.d, cunz0.a)) {
            return false;
        }
        ParcelUuid parcelUuid0 = this.e;
        if(parcelUuid0 != null) {
            byte[] arr_b = cunz0.c(parcelUuid0);
            if(!BleFilter.c(this.f, this.g, arr_b)) {
                return false;
            }
        }
        int v = this.h;
        if(v >= 0) {
            byte[] arr_b1 = cunz0.b(v);
            return BleFilter.c(this.i, this.j, arr_b1);
        }
        return true;
    }

    static boolean c(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        if(arr_b != null && arr_b2 != null && arr_b2.length >= arr_b.length) {
            if(arr_b1 == null) {
                for(int v = 0; v < arr_b.length; ++v) {
                    if(arr_b2[v] != arr_b[v]) {
                        return false;
                    }
                }
                return true;
            }
            for(int v1 = 0; v1 < arr_b.length; ++v1) {
                int v2 = arr_b1[v1];
                if((arr_b2[v1] & v2) != (v2 & arr_b[v1])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean d(ParcelUuid parcelUuid0, ParcelUuid parcelUuid1, List list0) {
        UUID uUID0 = parcelUuid1 == null ? null : parcelUuid1.getUuid();
        for(Object object0: list0) {
            UUID uUID1 = parcelUuid0.getUuid();
            UUID uUID2 = ((ParcelUuid)object0).getUuid();
            if(uUID0 == null) {
                if(!uUID1.equals(uUID2)) {
                    continue;
                }
                return true;
            }
            if((uUID1.getLeastSignificantBits() & uUID0.getLeastSignificantBits()) == (uUID2.getLeastSignificantBits() & uUID0.getLeastSignificantBits()) && (uUID1.getMostSignificantBits() & uUID0.getMostSignificantBits()) == (uUID2.getMostSignificantBits() & uUID0.getMostSignificantBits())) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        if(Arrays.equals(arr_b, arr_b2) && Arrays.equals(arr_b1, arr_b3)) {
            return true;
        }
        if(arr_b == null) {
            return true;
        }
        if(arr_b2 == null) {
            return false;
        }
        if(arr_b1 != null && arr_b3 != null) {
            int v = 0;
            for(int v1 = 0; v < arr_b1.length && v1 < arr_b3.length; ++v1) {
                int v2 = arr_b1[v];
                if((arr_b3[v1] & v2) != v2) {
                    return false;
                }
                ++v;
            }
        }
        return BleFilter.c(arr_b, arr_b1, arr_b2);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && bata.b(this.a, ((BleFilter)object0).a) && bata.b(this.b, ((BleFilter)object0).b) && this.h == ((BleFilter)object0).h && Arrays.equals(this.i, ((BleFilter)object0).i) && Arrays.equals(this.j, ((BleFilter)object0).j) && bata.b(this.e, ((BleFilter)object0).e) && Arrays.equals(this.f, ((BleFilter)object0).f) && Arrays.equals(this.g, ((BleFilter)object0).g) && bata.b(this.c, ((BleFilter)object0).c) && bata.b(this.d, ((BleFilter)object0).d);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.i);
        Integer integer1 = Arrays.hashCode(this.j);
        Integer integer2 = Arrays.hashCode(this.f);
        Integer integer3 = Arrays.hashCode(this.g);
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.h), integer0, integer1, this.e, integer2, integer3, this.c, this.d});
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.f);
        String s1 = Arrays.toString(this.g);
        String s2 = Arrays.toString(this.i);
        String s3 = Arrays.toString(this.j);
        return "BleFilter [deviceName=" + this.a + ", deviceAddress=" + this.b + ", uuid=" + this.c + ", uuidMask=" + this.d + ", serviceDataUuid=" + this.e + ", serviceData=" + s + ", serviceDataMask=" + s1 + ", manufacturerId=" + this.h + ", manufacturerData=" + s2 + ", manufacturerDataMask=" + s3 + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.t(parcel0, 5, this.d, v, false);
        baub.t(parcel0, 6, this.e, v, false);
        baub.i(parcel0, 7, this.f, false);
        baub.i(parcel0, 8, this.g, false);
        baub.o(parcel0, 9, this.h);
        baub.i(parcel0, 10, this.i, false);
        baub.i(parcel0, 11, this.j, false);
        baub.c(parcel0, v1);
    }
}

