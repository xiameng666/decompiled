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
import ddoh;
import ddtl;
import java.util.Arrays;

public final class RegisterSharingProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public azxs a;
    public ddoh b;

    static {
        RegisterSharingProviderParams.CREATOR = new ddtl();
    }

    private RegisterSharingProviderParams() {
    }

    public RegisterSharingProviderParams(IBinder iBinder0, IBinder iBinder1) {
        ddoh ddoh0;
        azxs azxs0 = null;
        if(iBinder0 == null) {
            ddoh0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IExternalSharingProvider");
            ddoh0 = (iInterface0 instanceof ddoh) ? ((ddoh)iInterface0) : new ddoh(iBinder0);
        }
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
        }
        super();
        this.b = ddoh0;
        this.a = azxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RegisterSharingProviderParams) && bata.b(this.b, ((RegisterSharingProviderParams)object0).b) && bata.b(this.a, ((RegisterSharingProviderParams)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.b.a);
        baub.D(parcel0, 2, this.a.asBinder());
        baub.c(parcel0, v1);
    }
}

