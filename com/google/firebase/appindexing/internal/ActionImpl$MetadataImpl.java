package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import goqu;

public class ActionImpl.MetadataImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final boolean f;

    static {
        ActionImpl.MetadataImpl.CREATOR = new goqu();
    }

    public ActionImpl.MetadataImpl(int v, boolean z, String s, String s1, byte[] arr_b, boolean z1) {
        this.a = v;
        this.b = z;
        this.c = s;
        this.d = s1;
        this.e = arr_b;
        this.f = z1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MetadataImpl { { eventStatus: \'");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\' } { uploadable: \'");
        stringBuilder0.append(this.b);
        stringBuilder0.append("\' } ");
        String s = this.c;
        if(s != null) {
            stringBuilder0.append("{ completionToken: \'");
            stringBuilder0.append(s);
            stringBuilder0.append("\' } ");
        }
        String s1 = this.d;
        if(s1 != null) {
            stringBuilder0.append("{ accountName: \'");
            stringBuilder0.append(s1);
            stringBuilder0.append("\' } ");
        }
        byte[] arr_b = this.e;
        if(arr_b != null) {
            stringBuilder0.append("{ ssbContext: [ ");
            for(int v = 0; v < arr_b.length; ++v) {
                int v1 = arr_b[v];
                stringBuilder0.append("0x");
                stringBuilder0.append(Integer.toHexString(v1));
                stringBuilder0.append(" ");
            }
            stringBuilder0.append("] } ");
        }
        stringBuilder0.append("{ contextOnly: \'");
        stringBuilder0.append(this.f);
        stringBuilder0.append("\' } }");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.i(parcel0, 5, this.e, false);
        baub.e(parcel0, 6, this.f);
        baub.c(parcel0, v1);
    }
}

