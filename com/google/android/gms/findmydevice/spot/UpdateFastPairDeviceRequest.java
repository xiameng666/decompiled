package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bnju;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class UpdateFastPairDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public byte[] b;
    public FastPairDeviceMetadata c;

    static {
        UpdateFastPairDeviceRequest.CREATOR = new bnju();
    }

    public UpdateFastPairDeviceRequest() {
    }

    public UpdateFastPairDeviceRequest(Account account0, byte[] arr_b, FastPairDeviceMetadata fastPairDeviceMetadata0) {
        this.a = account0;
        this.b = arr_b;
        this.c = fastPairDeviceMetadata0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UpdateFastPairDeviceRequest) && bata.b(this.a, ((UpdateFastPairDeviceRequest)object0).a) && Arrays.equals(this.b, ((UpdateFastPairDeviceRequest)object0).b) && bata.b(this.c, ((UpdateFastPairDeviceRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.i(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

