package com.google.android.gms.dtdi.core.internal;

import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import biwc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class OnIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public IntentSender a;

    static {
        OnIntentParams.CREATOR = new biwc();
    }

    public OnIntentParams() {
    }

    public OnIntentParams(IntentSender intentSender0) {
        this.a = intentSender0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof OnIntentParams) ? bata.b(this.a, ((OnIntentParams)object0).a) : false;
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

