package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlkj;
import java.util.Arrays;

public final class TransitPass extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;

    static {
        TransitPass.CREATOR = new dlkj();
    }

    public TransitPass() {
    }

    public TransitPass(String s, String s1, String s2, String s3, String s4, String s5, int v) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof TransitPass) && bata.b(this.a, ((TransitPass)object0).a) && bata.b(this.b, ((TransitPass)object0).b) && bata.b(this.c, ((TransitPass)object0).c) && bata.b(this.d, ((TransitPass)object0).d) && bata.b(this.e, ((TransitPass)object0).e) && bata.b(this.f, ((TransitPass)object0).f) && bata.b(Integer.valueOf(this.g), Integer.valueOf(((TransitPass)object0).g));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, ((int)this.g)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.d, false);
        baub.v(parcel0, 4, this.e, false);
        baub.v(parcel0, 5, this.f, false);
        baub.o(parcel0, 6, this.g);
        baub.v(parcel0, 7, this.c, false);
        baub.c(parcel0, v1);
    }
}

