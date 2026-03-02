package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmj;
import java.util.Arrays;

public final class RichCardArtAttributesParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public String h;

    static {
        RichCardArtAttributesParcelable.CREATOR = new esmj();
    }

    public RichCardArtAttributesParcelable() {
    }

    public RichCardArtAttributesParcelable(int v, String s, String s1, String s2, String s3, int v1, int v2, String s4) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v1;
        this.g = v2;
        this.h = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RichCardArtAttributesParcelable) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((RichCardArtAttributesParcelable)object0).a)) && bata.b(this.b, ((RichCardArtAttributesParcelable)object0).b) && bata.b(this.c, ((RichCardArtAttributesParcelable)object0).c) && bata.b(this.d, ((RichCardArtAttributesParcelable)object0).d) && bata.b(this.e, ((RichCardArtAttributesParcelable)object0).e) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((RichCardArtAttributesParcelable)object0).f)) && bata.b(Integer.valueOf(this.g), Integer.valueOf(((RichCardArtAttributesParcelable)object0).g)) && bata.b(this.h, ((RichCardArtAttributesParcelable)object0).h);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, this.c, this.d, this.e, ((int)this.f), ((int)this.g), this.h});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.o(parcel0, 6, this.f);
        baub.o(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.c(parcel0, v1);
    }
}

