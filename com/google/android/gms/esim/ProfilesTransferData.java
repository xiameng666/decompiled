package com.google.android.gms.esim;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjpe;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class ProfilesTransferData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final List b;

    static {
        ProfilesTransferData.CREATOR = new bjpe();
    }

    public ProfilesTransferData(long v, List list0) {
        this.a = v;
        this.b = list0;
    }

    @Override
    public final String toString() {
        return "ProfilesTransferData: [lastUpdateTimeMillis: " + this.a + ", profileTransferDataList:" + this.b + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.y(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

