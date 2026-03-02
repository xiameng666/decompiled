package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bkpj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import gftb;
import godf;
import gogk;
import gogp;
import hfuh;

public final class CanCreateFamilyData implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public gogp[] b;
    public PageData c;

    static {
        CanCreateFamilyData.CREATOR = new bkpj();
    }

    public CanCreateFamilyData(Parcel parcel0) {
        boolean[] arr_z = parcel0.createBooleanArray();
        int[] arr_v = parcel0.createIntArray();
        if(arr_z != null && arr_z.length != 0 && arr_v != null) {
            this.a = arr_z[0];
            gogp[] arr_gogp = new gogp[arr_v.length];
            for(int v = 0; v < arr_v.length; ++v) {
                gogp gogp0 = gogp.b(arr_v[v]);
                gftb.check(gogp0);
                arr_gogp[v] = gogp0;
            }
            this.b = arr_gogp;
            this.c = (PageData)parcel0.readParcelable(PageData.class.getClassLoader());
            return;
        }
        this.b = new gogp[0];
    }

    public CanCreateFamilyData(godf godf0) {
        this.a = godf0.e;
        this.b = (gogp[])new hfuh(godf0.f, godf.a).toArray(new gogp[0]);
        if((godf0.c & 8) != 0) {
            this.c = new PageData((godf0.g == null ? gogk.a : godf0.g));
        }
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int[] arr_v;
        boolean[] arr_z = new boolean[1];
        arr_z[0] = this.a;
        parcel0.writeBooleanArray(arr_z);
        gogp[] arr_gogp = this.b;
        if(arr_gogp == null) {
            arr_v = new int[0];
        }
        else {
            int[] arr_v1 = new int[arr_gogp.length];
            for(int v1 = 0; v1 < arr_gogp.length; ++v1) {
                arr_v1[v1] = arr_gogp[v1].ap;
            }
            arr_v = arr_v1;
        }
        parcel0.writeIntArray(arr_v);
        parcel0.writeParcelable(this.c, v);
    }
}

