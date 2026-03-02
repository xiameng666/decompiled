package com.google.android.gms.presencemanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejfe;
import java.util.Arrays;

public class ActiveUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final IBinder a;

    static {
        ActiveUser.CREATOR = new ejfe();
    }

    public ActiveUser(IBinder iBinder0) {
        this.a = iBinder0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof ActiveUser)) {
            return false;
        }
        return this == object0 ? true : bata.b(this.a, ((ActiveUser)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

