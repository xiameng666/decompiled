package com.google.android.gms.auth.api.identity;

import ahqr;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final PendingIntent a;

    static {
        SavePasswordResult.CREATOR = new ahqr();
    }

    public SavePasswordResult(PendingIntent pendingIntent0) {
        batl.s(pendingIntent0);
        this.a = pendingIntent0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof SavePasswordResult) ? bata.b(this.a, ((SavePasswordResult)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

