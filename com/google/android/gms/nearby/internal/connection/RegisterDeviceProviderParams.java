package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import czfb;
import czfd;
import czhu;
import java.util.Arrays;

public final class RegisterDeviceProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public czfd a;

    static {
        RegisterDeviceProviderParams.CREATOR = new czhu();
    }

    public RegisterDeviceProviderParams() {
    }

    public RegisterDeviceProviderParams(IBinder iBinder0) {
        czfd czfd0;
        if(iBinder0 == null) {
            czfd0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDeviceProvider");
            czfd0 = (iInterface0 instanceof czfd) ? ((czfd)iInterface0) : new czfb(iBinder0);
        }
        super();
        this.a = czfd0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof RegisterDeviceProviderParams) ? bata.b(this.a, ((RegisterDeviceProviderParams)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.c(parcel0, v1);
    }
}

