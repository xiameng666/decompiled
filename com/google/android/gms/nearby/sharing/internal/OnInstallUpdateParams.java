package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import com.google.android.gms.nearby.sharing.ShareTarget;
import ddsj;
import java.util.Arrays;

public final class OnInstallUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ShareTarget a;
    public AppInstallMetadata b;

    static {
        OnInstallUpdateParams.CREATOR = new ddsj();
    }

    public OnInstallUpdateParams() {
    }

    public OnInstallUpdateParams(ShareTarget shareTarget0, AppInstallMetadata appInstallMetadata0) {
        this.a = shareTarget0;
        this.b = appInstallMetadata0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof OnInstallUpdateParams) && bata.b(this.a, ((OnInstallUpdateParams)object0).a) && bata.b(this.b, ((OnInstallUpdateParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

