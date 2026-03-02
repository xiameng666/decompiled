package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import batl;
import baub;
import bqug;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    static {
        BleDevice.CREATOR = new bqug();
    }

    public BleDevice(String s, String s1, List list0, List list1) {
        this.a = s;
        this.b = s1;
        this.c = DesugarCollections.unmodifiableList(list0);
        this.d = DesugarCollections.unmodifiableList(list1);
    }

    public BleDevice(String s, String s1, Set set0, Set set1) {
        batl.s(s);
        this.a = s;
        batl.s(s1);
        this.b = s1;
        batl.s(set1);
        this.d = new ArrayList(set1);
        batl.s(set0);
        this.c = new ArrayList(set0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof BleDevice) ? this.b.equals(((BleDevice)object0).b) && this.a.equals(((BleDevice)object0).a) && new HashSet(this.c).equals(new HashSet(((BleDevice)object0).c)) && new HashSet(this.d).equals(new HashSet(((BleDevice)object0).d)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("name", this.b, arrayList0);
        basz.b("address", this.a, arrayList0);
        basz.b("dataTypes", this.d, arrayList0);
        basz.b("supportedProfiles", this.c, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.x(parcel0, 3, this.c, false);
        baub.y(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

