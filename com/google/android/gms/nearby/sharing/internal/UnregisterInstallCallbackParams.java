package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ddoi;
import ddok;
import ddup;
import java.util.Arrays;

public final class UnregisterInstallCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ddok a;
    public azxs b;

    static {
        UnregisterInstallCallbackParams.CREATOR = new ddup();
    }

    public UnregisterInstallCallbackParams() {
    }

    public UnregisterInstallCallbackParams(IBinder iBinder0, IBinder iBinder1) {
        ddok ddok0;
        azxs azxs0 = null;
        if(iBinder0 == null) {
            ddok0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IInstallUpdateCallback");
            ddok0 = (iInterface0 instanceof ddok) ? ((ddok)iInterface0) : new ddoi(iBinder0);
        }
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
        }
        super();
        this.a = ddok0;
        this.b = azxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UnregisterInstallCallbackParams) && bata.b(this.a, ((UnregisterInstallCallbackParams)object0).a) && bata.b(this.b, ((UnregisterInstallCallbackParams)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a.asBinder());
        baub.D(parcel0, 2, this.b.asBinder());
        baub.c(parcel0, v1);
    }
}

