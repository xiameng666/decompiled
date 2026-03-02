package com.google.android.gms.auth.api.phone.internal;

import aiad;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class RequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public int c;
    public long d;

    static {
        RequestResult.CREATOR = new aiad();
    }

    public RequestResult() {
        this.c = -1;
    }

    public RequestResult(int v, String s, int v1, long v2) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RequestResult) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((RequestResult)object0).a)) && bata.b(this.b, ((RequestResult)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((RequestResult)object0).c)) && bata.b(Long.valueOf(this.d), Long.valueOf(((RequestResult)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), (this.b == null ? "" : this.b), ((int)this.c), ((long)this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

