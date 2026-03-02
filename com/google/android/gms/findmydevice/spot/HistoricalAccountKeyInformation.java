package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bnit;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class HistoricalAccountKeyInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public byte[] b;

    static {
        HistoricalAccountKeyInformation.CREATOR = new bnit();
    }

    public HistoricalAccountKeyInformation() {
    }

    public HistoricalAccountKeyInformation(byte[] arr_b, byte[] arr_b1) {
        this.a = arr_b;
        this.b = arr_b1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof HistoricalAccountKeyInformation) && Arrays.equals(this.a, ((HistoricalAccountKeyInformation)object0).a) && Arrays.equals(this.b, ((HistoricalAccountKeyInformation)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

