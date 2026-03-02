package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import azty;
import bata;
import batl;
import baub;
import bawa;
import bawb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;
    private static final Comparator e;

    static {
        ApiFeatureRequest.CREATOR = new bawb();
        ApiFeatureRequest.e = new bawa();
    }

    public ApiFeatureRequest(List list0, boolean z, String s, String s1) {
        batl.s(list0);
        this.a = list0;
        this.b = z;
        this.c = s;
        this.d = s1;
    }

    public static ApiFeatureRequest a(List list0, boolean z) {
        TreeSet treeSet0 = new TreeSet(ApiFeatureRequest.e);
        for(Object object0: list0) {
            Collections.addAll(treeSet0, ((azty)object0).gm());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet0), z, null, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof ApiFeatureRequest) ? this.b == ((ApiFeatureRequest)object0).b && bata.b(this.a, ((ApiFeatureRequest)object0).a) && bata.b(this.c, ((ApiFeatureRequest)object0).c) && bata.b(this.d, ((ApiFeatureRequest)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

