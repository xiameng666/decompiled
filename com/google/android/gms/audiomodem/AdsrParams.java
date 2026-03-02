package com.google.android.gms.audiomodem;

import acpa;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class AdsrParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;

    static {
        AdsrParams.CREATOR = new acpa();
    }

    public AdsrParams(long v, long v1, long v2, long v3, float f) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = f;
    }

    public final long a() {
        return this.a + this.b + this.c + this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof AdsrParams) ? this.a == ((AdsrParams)object0).a && this.b == ((AdsrParams)object0).b && this.c == ((AdsrParams)object0).c && this.d == ((AdsrParams)object0).d && this.e == ((AdsrParams)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), ((long)this.b), ((long)this.c), ((long)this.d), ((float)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 2, this.a);
        baub.q(parcel0, 3, this.b);
        baub.q(parcel0, 4, this.c);
        baub.q(parcel0, 5, this.d);
        baub.l(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

