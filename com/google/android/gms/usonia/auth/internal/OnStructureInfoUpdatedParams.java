package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fanl;
import java.util.Arrays;

public final class OnStructureInfoUpdatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public TrustedId[] a;
    public HomeGraphId[] b;

    static {
        OnStructureInfoUpdatedParams.CREATOR = new fanl();
    }

    private OnStructureInfoUpdatedParams() {
    }

    public OnStructureInfoUpdatedParams(TrustedId[] arr_trustedId, HomeGraphId[] arr_homeGraphId) {
        this.a = arr_trustedId;
        this.b = arr_homeGraphId;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnStructureInfoUpdatedParams) && Arrays.equals(this.a, ((OnStructureInfoUpdatedParams)object0).a) && Arrays.equals(this.b, ((OnStructureInfoUpdatedParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.J(parcel0, 2, this.b, v);
        baub.c(parcel0, v1);
    }
}

