package com.google.android.gms.appdatasearch;

import abvt;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

@Deprecated
public class GlobalSearchApplicationInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    static {
        GlobalSearchApplicationInfo.CREATOR = new abvt();
    }

    public GlobalSearchApplicationInfo(String s, String s1, int v, int v1, int v2, String s2, String s3, String s4) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = s2;
        this.g = s3;
        this.h = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GlobalSearchApplicationInfo) && TextUtils.equals(this.a, ((GlobalSearchApplicationInfo)object0).a) && TextUtils.equals(this.b, ((GlobalSearchApplicationInfo)object0).b) && this.c == ((GlobalSearchApplicationInfo)object0).c && this.d == ((GlobalSearchApplicationInfo)object0).d && this.e == ((GlobalSearchApplicationInfo)object0).e && TextUtils.equals(this.f, ((GlobalSearchApplicationInfo)object0).f) && TextUtils.equals(this.g, ((GlobalSearchApplicationInfo)object0).g) && TextUtils.equals(this.h, ((GlobalSearchApplicationInfo)object0).h);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), ((int)this.d), ((int)this.e), this.f, this.g, this.h});
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + "{" + this.a + ";sourceName=" + this.b + ";labelId=" + Integer.toHexString(this.c) + ";settingsDescriptionId=" + Integer.toHexString(this.d) + ";iconId=" + Integer.toHexString(this.e) + ";defaultIntentAction=" + this.f + ";defaultIntentData=" + this.g + ";defaultIntentActivity=" + this.h + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.c);
        baub.o(parcel0, 3, this.d);
        baub.o(parcel0, 4, this.e);
        baub.v(parcel0, 5, this.f, false);
        baub.v(parcel0, 6, this.g, false);
        baub.v(parcel0, 7, this.h, false);
        baub.v(parcel0, 8, this.b, false);
        baub.c(parcel0, v1);
    }
}

