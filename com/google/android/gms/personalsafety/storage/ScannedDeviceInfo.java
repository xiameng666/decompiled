package com.google.android.gms.personalsafety.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.personalsafety.detection.FinderTagInfo;
import eikd;
import j..util.Objects;
import java.util.List;

public class ScannedDeviceInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final LatLng b;
    public final TagDeviceData c;
    public final LatLng d;
    public final List e;
    public final FinderTagInfo f;

    static {
        ScannedDeviceInfo.CREATOR = new eikd();
    }

    public ScannedDeviceInfo(long v, LatLng latLng0, TagDeviceData tagDeviceData0, LatLng latLng1, List list0, FinderTagInfo finderTagInfo0) {
        this.a = v;
        this.b = latLng0;
        this.c = tagDeviceData0;
        this.d = latLng1;
        this.e = list0;
        this.f = finderTagInfo0;
    }

    public final ScannedDeviceInfo a(FinderTagInfo finderTagInfo0) {
        return new ScannedDeviceInfo(this.a, this.b, this.c, this.d, this.e, finderTagInfo0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ScannedDeviceInfo) && this.a == ((ScannedDeviceInfo)object0).a && Objects.equals(this.b, ((ScannedDeviceInfo)object0).b) && this.c.equals(((ScannedDeviceInfo)object0).c) && Objects.equals(this.d, ((ScannedDeviceInfo)object0).d) && Objects.equals(this.e, ((ScannedDeviceInfo)object0).e) && Objects.equals(this.f, ((ScannedDeviceInfo)object0).f);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((long)this.a), this.b, this.c, this.d, this.e});
    }

    @Override
    public final String toString() {
        List list0 = this.e;
        String s = "";
        if(list0 != null) {
            for(Object object0: list0) {
                LocationScan locationScan0 = (LocationScan)object0;
                if(locationScan0 != null) {
                    s = s + " " + locationScan0.toString() + ", ";
                }
            }
        }
        return String.format("Scanned Device Info:<First Seen Time: %s, First Seen Location: %s, Tag Device Detail: %s, Last Seen Location: %s, Location History: %s, Finder tag info: %s>", ((long)this.a), this.b, this.c, this.d, s, this.f);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.y(parcel0, 5, this.e, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}

