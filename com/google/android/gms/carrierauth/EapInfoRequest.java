package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import atqo;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class EapInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        EapInfoRequest.CREATOR = new atqo();
    }

    public EapInfoRequest(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof EapInfoRequest) ? this.a == ((EapInfoRequest)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

