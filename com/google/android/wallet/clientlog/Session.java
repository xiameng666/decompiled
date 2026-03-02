package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gcgf;
import getb;
import hcbx;
import java.util.ArrayList;
import java.util.List;

public class Session implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public boolean c;
    public List d;
    public boolean e;
    public int f;

    static {
        Session.CREATOR = new gcgf();
    }

    public Session(Parcel parcel0) {
        List list0;
        boolean z = true;
        this.f = 1;
        this.a = parcel0.readString();
        this.b = parcel0.readInt();
        this.c = parcel0.readInt() == 1;
        int v = getb.a(parcel0.readInt());
        if(v != 0) {
            this.f = v;
        }
        int[] arr_v = parcel0.createIntArray();
        if(arr_v == null) {
            list0 = null;
        }
        else {
            ArrayList arrayList0 = new ArrayList(arr_v.length);
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                hcbx hcbx0 = hcbx.b(arr_v[v1]);
                if(hcbx0 != null) {
                    arrayList0.add(hcbx0);
                }
            }
            list0 = arrayList0;
        }
        this.d = list0;
        if(parcel0.readInt() != 1) {
            z = false;
        }
        this.e = z;
    }

    public Session(String s, int v) {
        this.f = 1;
        this.a = s;
        this.b = v;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(((int)this.c));
        int v1 = this.f - 1;
        int[] arr_v = null;
        if(this.f == 0) {
            throw null;
        }
        parcel0.writeInt(v1);
        List list0 = this.d;
        if(list0 != null) {
            int v2 = list0.size();
            arr_v = new int[v2];
            for(int v3 = 0; v3 < v2; ++v3) {
                arr_v[v3] = ((hcbx)list0.get(v3)).P;
            }
        }
        parcel0.writeIntArray(arr_v);
        parcel0.writeInt(((int)this.e));
    }
}

