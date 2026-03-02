package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import basz;
import baub;
import cnms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class NearbyAlertFilter extends AbstractPlaceFilter {
    public static final Parcelable.Creator CREATOR;
    final List a;
    final List b;
    public final String c;
    public final Set d;
    public final Set e;

    static {
        NearbyAlertFilter.CREATOR = new cnms();
    }

    public NearbyAlertFilter(List list0, List list1, String s) {
        this.a = list0;
        this.b = list1;
        this.c = s;
        this.d = NearbyAlertFilter.a(list0);
        this.e = NearbyAlertFilter.a(list1);
    }

    public static NearbyAlertFilter b(Collection collection0) {
        if(collection0 == null) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place IDs to match results with.");
        }
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            String s = (String)object0;
            if(!TextUtils.isEmpty(s)) {
                arrayList0.add(s);
            }
        }
        if(!arrayList0.isEmpty()) {
            return new NearbyAlertFilter(arrayList0, null, null);
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place ID to match results with.");
    }

    public static NearbyAlertFilter c(Collection collection0) {
        if(collection0 == null) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain a list of place types to match results with.");
        }
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            Integer integer0 = (Integer)object0;
            if(integer0 != null) {
                arrayList0.add(integer0);
            }
        }
        if(!arrayList0.isEmpty()) {
            return new NearbyAlertFilter(null, arrayList0, null);
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain at least one place type to match results with.");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof NearbyAlertFilter)) {
            return false;
        }
        String s = this.c;
        if(s == null && ((NearbyAlertFilter)object0).c != null) {
            return false;
        }
        return !this.e.equals(((NearbyAlertFilter)object0).e) || !this.d.equals(((NearbyAlertFilter)object0).d) ? false : s == null || s.equals(((NearbyAlertFilter)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.d, this.c});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        Set set0 = this.e;
        if(!set0.isEmpty()) {
            basz.b("types", set0, arrayList0);
        }
        Set set1 = this.d;
        if(!set1.isEmpty()) {
            basz.b("placeIds", set1, arrayList0);
        }
        String s = this.c;
        if(s != null) {
            basz.b("chainName", s, arrayList0);
        }
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 1, this.a, false);
        baub.E(parcel0, 2, this.b);
        baub.v(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

