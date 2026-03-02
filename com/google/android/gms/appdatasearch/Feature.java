package com.google.android.gms.appdatasearch;

import a;
import abvo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    final Bundle b;

    static {
        Feature.CREATOR = new abvo();
    }

    public Feature(int v) {
        this(v, new Bundle());
    }

    public Feature(int v, Bundle bundle0) {
        this.a = v;
        this.b = bundle0;
    }

    public static Feature a(int v, Feature[] arr_feature) {
        if(arr_feature != null) {
            for(int v1 = 0; v1 < arr_feature.length; ++v1) {
                Feature feature0 = arr_feature[v1];
                if(feature0.a == v) {
                    return feature0;
                }
            }
        }
        return null;
    }

    public final String b(String s) {
        return this.b.getString(s);
    }

    public static void c(List list0, Feature feature0) {
        if(feature0 != null) {
            int v = 0;
            while(v < list0.size()) {
                int v1 = ((Feature)list0.get(v)).a;
                int v2 = feature0.a;
                if(v1 == v2) {
                    throw new IllegalStateException(a.f(v2, "Feature ", " already exists"));
                }
                ++v;
                continue;
            }
            list0.add(feature0);
        }
    }

    public final void d(String s, String s1) {
        this.b.putString(s, s1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Feature)) {
            return false;
        }
        if(this.a != ((Feature)object0).a) {
            return false;
        }
        Bundle bundle0 = this.b;
        if(bundle0 == null) {
            return ((Feature)object0).b == null;
        }
        Bundle bundle1 = ((Feature)object0).b;
        if(bundle1 == null) {
            return false;
        }
        if(bundle0.size() != bundle1.size()) {
            return false;
        }
        for(Object object1: bundle0.keySet()) {
            if(!bundle1.containsKey(((String)object1)) || !bata.b(bundle0.getString(((String)object1)), bundle1.getString(((String)object1)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(Integer.valueOf(this.a));
        Bundle bundle0 = this.b;
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                arrayList0.add(((String)object0));
                String s = bundle0.getString(((String)object0));
                if(s != null) {
                    arrayList0.add(s);
                }
            }
        }
        return Arrays.hashCode(arrayList0.toArray(new Object[0]));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.g(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

