package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import fzbg;
import fzbk;
import java.util.Arrays;

public class TimeModel implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final fzbg a;
    public final fzbg b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        TimeModel.CREATOR = new fzbk();
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int v) {
        this(0, 0, 10, v);
    }

    public TimeModel(int v, int v1, int v2, int v3) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.c = v3;
        this.g = TimeModel.h(v);
        this.a = new fzbg(59);
        this.b = new fzbg((v3 == 1 ? 23 : 12));
    }

    public final int a() {
        return this.c == 1 ? 0x7F151817 : 0x7F151819;  // string:material_hour_24h_suffix "%1$s hours"
    }

    public final int b() {
        if(this.c == 1) {
            return this.d % 24;
        }
        int v = this.d;
        if(v % 12 == 0) {
            return 12;
        }
        return this.g == 1 ? v - 12 : v;
    }

    public static String c(Resources resources0, CharSequence charSequence0, String s) {
        try {
            return String.format(resources0.getConfiguration().locale, s, Integer.parseInt(String.valueOf(charSequence0)));
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public final void d(int v) {
        int v1 = 12;
        if(this.c == 1) {
            this.d = v;
            return;
        }
        if(1 != this.g) {
            v1 = 0;
        }
        this.d = v % 12 + v1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int v) {
        this.g = TimeModel.h(v);
        this.d = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof TimeModel) ? this.d == ((TimeModel)object0).d && this.e == ((TimeModel)object0).e && this.c == ((TimeModel)object0).c && this.f == ((TimeModel)object0).f : false;
    }

    public final void f(int v) {
        this.e = v % 60;
    }

    public final void g(int v) {
        int v2;
        if(v != this.g) {
            this.g = v;
            int v1 = this.d;
            if(v1 < 12 && v == 1) {
                v2 = v1 + 12;
                goto label_8;
            }
            if(v1 >= 12 && v == 0) {
                v2 = v1 - 12;
            label_8:
                this.d = v2;
            }
        }
    }

    private static int h(int v) {
        return v < 12 ? 0 : 1;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.c), ((int)this.d), ((int)this.e), ((int)this.f)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeInt(this.c);
    }
}

