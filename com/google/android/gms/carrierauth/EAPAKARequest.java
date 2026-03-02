package com.google.android.gms.carrierauth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import atqm;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class EAPAKARequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final int e;

    static {
        EAPAKARequest.CREATOR = new atqm();
    }

    public EAPAKARequest(String s, Integer integer0, Integer integer1, Integer integer2, int v) {
        this.a = s;
        this.b = integer0;
        this.c = integer1;
        this.d = integer2;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof EAPAKARequest) ? this.e == ((EAPAKARequest)object0).e && bata.b(this.a, ((EAPAKARequest)object0).a) && bata.b(this.b, ((EAPAKARequest)object0).b) && bata.b(this.c, ((EAPAKARequest)object0).c) && bata.b(this.d, ((EAPAKARequest)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, ((int)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.F(parcel0, 2, this.b);
        baub.F(parcel0, 3, this.c);
        baub.F(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

