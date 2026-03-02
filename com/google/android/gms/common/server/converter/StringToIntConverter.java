package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import baub;
import bbgc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final HashMap b;
    public final SparseArray c;

    static {
        StringToIntConverter.CREATOR = new bbgc();
    }

    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }

    public StringToIntConverter(int v, ArrayList arrayList0) {
        this.a = v;
        this.b = new HashMap();
        this.c = new SparseArray();
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            StringToIntConverter.Entry stringToIntConverter$Entry0 = (StringToIntConverter.Entry)arrayList0.get(v2);
            this.b.put(stringToIntConverter$Entry0.b, Integer.valueOf(stringToIntConverter$Entry0.c));
            this.c.put(stringToIntConverter$Entry0.c, stringToIntConverter$Entry0.b);
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            arrayList0.add(new StringToIntConverter.Entry(((String)object0), ((int)(((Integer)hashMap0.get(((String)object0)))))));
        }
        baub.y(parcel0, 2, arrayList0, false);
        baub.c(parcel0, v1);
    }
}

