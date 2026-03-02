package com.google.android.gms.wearable.internal;

import a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Log;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fceu;
import fcev;
import fdhk;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class DataItemParcelable extends AbstractSafeParcelable implements fceu {
    public static final Parcelable.Creator CREATOR;
    public final Uri a;
    public final Map b;
    public byte[] c;

    static {
        DataItemParcelable.CREATOR = new fdhk();
    }

    public DataItemParcelable(Uri uri0) {
        HashMap hashMap0 = new HashMap();
        super();
        this.a = uri0;
        this.b = hashMap0;
        this.c = null;
    }

    public DataItemParcelable(Uri uri0, Bundle bundle0, byte[] arr_b) {
        this.a = uri0;
        HashMap hashMap0 = new HashMap();
        ClassLoader classLoader0 = DataItemAssetParcelable.class.getClassLoader();
        batl.s(classLoader0);
        bundle0.setClassLoader(classLoader0);
        for(Object object0: bundle0.keySet()) {
            Parcelable parcelable0 = bundle0.getParcelable(((String)object0));
            batl.s(parcelable0);
            hashMap0.put(((String)object0), ((DataItemAssetParcelable)parcelable0));
        }
        this.b = hashMap0;
        this.c = arr_b;
    }

    @Override  // fceu
    public final Uri a() {
        return this.a;
    }

    @Override  // fceu
    public final Map b() {
        return this.b;
    }

    @Override  // fceu
    public final byte[] c() {
        return this.c;
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override
    public final String toString() {
        boolean z = Log.isLoggable("DataItem", 3);
        StringBuilder stringBuilder0 = new StringBuilder("DataItemParcelable[@");
        stringBuilder0.append(Integer.toHexString(this.hashCode()));
        byte[] arr_b = this.c;
        String s = arr_b == null ? "null" : ((int)arr_b.length);
        stringBuilder0.append(",dataSz=" + s.toString());
        Map map0 = this.b;
        stringBuilder0.append(a.aj(map0, ", numAssets="));
        stringBuilder0.append(", uri=" + this.a);
        if(!z) {
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("]\n  assets: ");
        for(Object object0: map0.keySet()) {
            stringBuilder0.append("\n    " + ((String)object0) + ": " + map0.get(((String)object0)));
        }
        stringBuilder0.append("\n  ]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        Bundle bundle0 = new Bundle();
        ClassLoader classLoader0 = DataItemAssetParcelable.class.getClassLoader();
        batl.s(classLoader0);
        bundle0.setClassLoader(classLoader0);
        for(Object object0: this.b.entrySet()) {
            bundle0.putParcelable(((String)((Map.Entry)object0).getKey()), new DataItemAssetParcelable(((fcev)((Map.Entry)object0).getValue())));
        }
        baub.g(parcel0, 4, bundle0, false);
        baub.i(parcel0, 5, this.c, false);
        baub.c(parcel0, v1);
    }
}

