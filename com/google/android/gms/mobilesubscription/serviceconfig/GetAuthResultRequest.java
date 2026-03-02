package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import csnh;
import java.util.Arrays;

public class GetAuthResultRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    static {
        GetAuthResultRequest.CREATOR = new csnh();
    }

    public GetAuthResultRequest(int v, int v1, String s, String s1, int v2, long v3, String s2, String s3, String s4, String s5) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
        this.e = v2;
        this.f = v3;
        this.g = s2;
        this.h = s3;
        this.i = s4;
        this.j = s5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetAuthResultRequest) ? this.a == ((GetAuthResultRequest)object0).a && this.b == ((GetAuthResultRequest)object0).b && this.e == ((GetAuthResultRequest)object0).e && this.f == ((GetAuthResultRequest)object0).f && bata.b(this.c, ((GetAuthResultRequest)object0).c) && bata.b(this.d, ((GetAuthResultRequest)object0).d) && bata.b(this.g, ((GetAuthResultRequest)object0).g) && bata.b(this.h, ((GetAuthResultRequest)object0).h) && bata.b(this.i, ((GetAuthResultRequest)object0).i) && bata.b(this.j, ((GetAuthResultRequest)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), this.c, this.d, ((int)this.e), ((long)this.f), this.g, this.h, this.i, this.j});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.o(parcel0, 5, this.e);
        baub.q(parcel0, 6, this.f);
        baub.v(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.v(parcel0, 10, this.j, false);
        baub.c(parcel0, v1);
    }
}

