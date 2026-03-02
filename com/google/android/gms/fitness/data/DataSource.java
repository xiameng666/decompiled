package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bqup;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hldo;
import java.util.Locale;

public class DataSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final DataType a;
    public final int b;
    public final Device c;
    public final Application d;
    public final String e;
    public final String f;
    private static final String g;
    private static final String h;

    static {
        DataSource.g = hldo.a.name().toLowerCase(Locale.ROOT);
        DataSource.h = hldo.b.name().toLowerCase(Locale.ROOT);
        DataSource.CREATOR = new bqup();
    }

    public DataSource(DataType dataType0, int v, Device device0, Application application0, String s) {
        this.a = dataType0;
        this.b = v;
        this.c = device0;
        this.d = application0;
        this.e = s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(DataSource.b(v));
        stringBuilder0.append(":");
        stringBuilder0.append(dataType0.aI);
        if(application0 != null) {
            stringBuilder0.append(":");
            stringBuilder0.append(application0.b);
        }
        if(device0 != null) {
            stringBuilder0.append(":");
            stringBuilder0.append(device0.a());
        }
        if(s != null) {
            stringBuilder0.append(":");
            stringBuilder0.append(s);
        }
        this.f = stringBuilder0.toString();
    }

    public final String a() {
        String s;
        switch(this.b) {
            case 0: {
                s = "r";
                break;
            }
            case 1: {
                s = "d";
                break;
            }
            default: {
                s = "?";
            }
        }
        String s1 = this.a.a();
        String s2 = "";
        String s3 = this.d == null ? "" : ":gms";
        String s4 = this.c == null ? "" : ":" + this.c.b + ":" + this.c.c;
        String s5 = this.e;
        if(s5 != null) {
            s2 = ":" + s5;
        }
        return s + ":" + s1 + s3 + s4 + s2;
    }

    private static String b(int v) {
        switch(v) {
            case 0: {
                return DataSource.g;
            }
            case 1: {
                return DataSource.h;
            }
            default: {
                return DataSource.h;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof DataSource) ? this.f.equals(((DataSource)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DataSource{");
        stringBuilder0.append(DataSource.b(this.b));
        Application application0 = this.d;
        if(application0 != null) {
            stringBuilder0.append(":");
            stringBuilder0.append(application0);
        }
        Device device0 = this.c;
        if(device0 != null) {
            stringBuilder0.append(":");
            stringBuilder0.append(device0);
        }
        String s = this.e;
        if(s != null) {
            stringBuilder0.append(":");
            stringBuilder0.append(s);
        }
        stringBuilder0.append(":");
        stringBuilder0.append(this.a);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 3, this.b);
        baub.t(parcel0, 4, this.c, v, false);
        baub.t(parcel0, 5, this.d, v, false);
        baub.v(parcel0, 6, this.e, false);
        baub.c(parcel0, v1);
    }
}

