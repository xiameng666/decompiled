package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bniv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class ImportGivenOwnerKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;

    static {
        ImportGivenOwnerKeyResponse.CREATOR = new bniv();
    }

    public ImportGivenOwnerKeyResponse() {
    }

    public ImportGivenOwnerKeyResponse(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ImportGivenOwnerKeyResponse) ? bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((ImportGivenOwnerKeyResponse)object0).a)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

