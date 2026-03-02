package com.google.android.gms.audiomodem;

import acpt;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class Encoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final DsssEncoding b;
    public final DtmfEncoding c;

    static {
        Encoding.CREATOR = new acpt();
    }

    public Encoding(int v, DsssEncoding dsssEncoding0, DtmfEncoding dtmfEncoding0) {
        this.a = v;
        this.b = dsssEncoding0;
        this.c = dtmfEncoding0;
    }

    public static int a(int v) {
        return v == 2 || v == 3 ? 2 : 0;
    }

    public static boolean b(int v) {
        return v == 1 || v == 3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Encoding)) {
            return false;
        }
        int v = this.a;
        if(v == ((Encoding)object0).a) {
            return v == 0 ? bata.b(this.b, ((Encoding)object0).b) : v != 1 || bata.b(this.c, ((Encoding)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v4;
        int v3;
        int v = this.a;
        int v1 = Arrays.hashCode(new Object[]{v});
        int v2 = 0;
        if(v == 0) {
            v3 = this.b.hashCode();
            v4 = 0;
        }
        else {
            v4 = v;
            v3 = 0;
        }
        if(v4 == 1) {
            v2 = this.c.hashCode();
        }
        return v1 + v3 + v2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.t(parcel0, 3, this.b, v, false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

