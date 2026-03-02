package com.google.android.gms.personalsafety.detection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ehum;
import gfqz;
import j..util.Objects;
import java.util.List;

public class FinderTagInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final Boolean l;

    static {
        FinderTagInfo.CREATOR = new ehum();
    }

    public FinderTagInfo(String s, String s1, String s2, String s3, String s4, Boolean boolean0, List list0, String s5, String s6, String s7, List list1, Boolean boolean1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = boolean0;
        this.g = list0;
        this.h = s5;
        this.i = s6;
        this.j = s7;
        this.k = list1;
        this.l = boolean1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof FinderTagInfo) && gfqz.e(this.a, ((FinderTagInfo)object0).a) && Objects.equals(this.b, ((FinderTagInfo)object0).b) && Objects.equals(this.c, ((FinderTagInfo)object0).c) && Objects.equals(this.d, ((FinderTagInfo)object0).d) && Objects.equals(this.e, ((FinderTagInfo)object0).e) && Objects.equals(this.f, ((FinderTagInfo)object0).f) && Objects.equals(this.g, ((FinderTagInfo)object0).g) && Objects.equals(this.h, ((FinderTagInfo)object0).h) && Objects.equals(this.i, ((FinderTagInfo)object0).i) && Objects.equals(this.j, ((FinderTagInfo)object0).j) && Objects.equals(this.k, ((FinderTagInfo)object0).k);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return String.format("FinderTagInfo:<MAC: %s, Model name: %s, Manufacturer name: %s, Image URL: %s, Ring key: %s, Owned By Caller: %s, Temporarily Disabled: %B>", this.a, this.b, this.h, this.c, this.d, this.f, this.l);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.z(parcel0, 6, this.f);
        baub.x(parcel0, 7, this.g, false);
        baub.v(parcel0, 8, this.h, false);
        baub.v(parcel0, 9, this.i, false);
        baub.v(parcel0, 10, this.j, false);
        baub.x(parcel0, 11, this.k, false);
        baub.z(parcel0, 12, this.l);
        baub.c(parcel0, v1);
    }
}

