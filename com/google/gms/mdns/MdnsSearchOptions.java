package com.google.gms.mdns;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gprp;
import java.util.ArrayList;
import java.util.List;

public class MdnsSearchOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final Network g;
    public final int h;

    static {
        MdnsSearchOptions.CREATOR = new gprp();
    }

    public MdnsSearchOptions(List list0, int v, boolean z, Network network0, int v1, String s, boolean z1, int v2) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        if(list0 != null) {
            arrayList0.addAll(list0);
        }
        this.c = v;
        this.d = z1;
        this.e = v2;
        this.f = z;
        this.g = network0;
        this.h = v1;
        this.b = s;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeStringList(this.a);
        parcel0.writeInt(this.c);
        parcel0.writeInt(((int)this.f));
        parcel0.writeParcelable(this.g, 0);
        parcel0.writeInt(this.h);
        parcel0.writeString(this.b);
        parcel0.writeInt(((int)this.d));
        parcel0.writeInt(this.e);
    }
}

