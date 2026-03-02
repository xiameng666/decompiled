package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bnjg;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class ReportFastPairDeviceConnectionChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public BloomFilterData b;
    public byte[] c;
    public String d;
    public ClockSyncMessageStreamData e;
    public boolean f;

    static {
        ReportFastPairDeviceConnectionChangeRequest.CREATOR = new bnjg();
    }

    public ReportFastPairDeviceConnectionChangeRequest() {
    }

    public ReportFastPairDeviceConnectionChangeRequest(byte[] arr_b, BloomFilterData bloomFilterData0, byte[] arr_b1, String s, ClockSyncMessageStreamData clockSyncMessageStreamData0, boolean z) {
        this.a = arr_b;
        this.b = bloomFilterData0;
        this.c = arr_b1;
        this.d = s;
        this.e = clockSyncMessageStreamData0;
        this.f = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ReportFastPairDeviceConnectionChangeRequest) && Arrays.equals(this.a, ((ReportFastPairDeviceConnectionChangeRequest)object0).a) && bata.b(this.b, ((ReportFastPairDeviceConnectionChangeRequest)object0).b) && Arrays.equals(this.c, ((ReportFastPairDeviceConnectionChangeRequest)object0).c) && bata.b(this.d, ((ReportFastPairDeviceConnectionChangeRequest)object0).d) && bata.b(this.e, ((ReportFastPairDeviceConnectionChangeRequest)object0).e) && bata.b(Boolean.valueOf(this.f), Boolean.valueOf(((ReportFastPairDeviceConnectionChangeRequest)object0).f));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b, Arrays.hashCode(this.c), this.d, this.e, Boolean.valueOf(this.f)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 2, this.c, false);
        baub.i(parcel0, 3, this.a, false);
        baub.v(parcel0, 4, this.d, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.t(parcel0, 6, this.b, v, false);
        baub.e(parcel0, 7, this.f);
        baub.c(parcel0, v1);
    }
}

