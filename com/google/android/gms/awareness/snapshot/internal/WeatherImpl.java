package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aqdl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class WeatherImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final int[] e;

    static {
        WeatherImpl.CREATOR = new aqdl();
    }

    public WeatherImpl(float f, float f1, float f2, int v, int[] arr_v) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = v;
        this.e = arr_v;
    }

    static float a(int v, float f) {
        return v == 1 ? f : (f - 32.0f) * 5.0f / 9.0f;
    }

    public final float b(int v) {
        return WeatherImpl.a(v, this.c);
    }

    public final float c(int v) {
        return WeatherImpl.a(v, this.b);
    }

    public final float d(int v) {
        return WeatherImpl.a(v, this.a);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Temp=");
        stringBuilder0.append(this.d(1));
        stringBuilder0.append("F/");
        stringBuilder0.append(this.d(2));
        stringBuilder0.append("C, Feels=");
        stringBuilder0.append(this.c(1));
        stringBuilder0.append("F/");
        stringBuilder0.append(this.c(2));
        stringBuilder0.append("C, Dew=");
        stringBuilder0.append(this.b(1));
        stringBuilder0.append("F/");
        stringBuilder0.append(this.b(2));
        stringBuilder0.append("C, Humidity=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", Condition=");
        int[] arr_v = this.e;
        if(arr_v == null) {
            stringBuilder0.append("unknown");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("[");
        int v = 0;
        for(boolean z = true; v < arr_v.length; z = false) {
            int v1 = arr_v[v];
            if(!z) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(v1);
            ++v;
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.l(parcel0, 2, this.a);
        baub.l(parcel0, 3, this.b);
        baub.l(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.p(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

