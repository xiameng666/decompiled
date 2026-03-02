package com.google.android.gms.nearby.internal.connection;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czhi;
import java.util.Arrays;

public final class ParcelableFileWithMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public ParcelFileDescriptor b;
    public long c;
    public Uri d;

    static {
        ParcelableFileWithMetaData.CREATOR = new czhi();
    }

    public ParcelableFileWithMetaData() {
    }

    public ParcelableFileWithMetaData(byte[] arr_b, ParcelFileDescriptor parcelFileDescriptor0, long v, Uri uri0) {
        this.a = arr_b;
        this.b = parcelFileDescriptor0;
        this.c = v;
        this.d = uri0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ParcelableFileWithMetaData) && Arrays.equals(this.a, ((ParcelableFileWithMetaData)object0).a) && bata.b(this.b, ((ParcelableFileWithMetaData)object0).b) && bata.b(Long.valueOf(this.c), Long.valueOf(((ParcelableFileWithMetaData)object0).c)) && bata.b(this.d, ((ParcelableFileWithMetaData)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b, ((long)this.c), this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.q(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

