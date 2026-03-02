package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eilx;
import einr;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final Flag[] b;
    public final String[] c;
    public final Map d;

    static {
        Configuration.CREATOR = new eilx();
    }

    public Configuration(int v, Flag[] arr_flag, String[] arr_s) {
        this.a = v;
        this.b = arr_flag;
        this.d = new TreeMap();
        for(int v1 = 0; v1 < arr_flag.length; ++v1) {
            Flag flag0 = arr_flag[v1];
            this.d.put(flag0.b, flag0);
        }
        this.c = arr_s;
        if(arr_s != null) {
            Arrays.sort(arr_s);
        }
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a - ((Configuration)object0).a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof Configuration) && this.a == ((Configuration)object0).a && einr.a(this.d, ((Configuration)object0).d) && Arrays.equals(this.c, ((Configuration)object0).c);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Configuration(");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", (");
        for(Object object0: this.d.values()) {
            stringBuilder0.append(((Flag)object0));
            stringBuilder0.append(", ");
        }
        stringBuilder0.append("), (");
        String[] arr_s = this.c;
        if(arr_s == null) {
            stringBuilder0.append("null");
        }
        else {
            for(int v = 0; v < arr_s.length; ++v) {
                stringBuilder0.append(arr_s[v]);
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("))");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.J(parcel0, 3, this.b, v);
        baub.w(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

