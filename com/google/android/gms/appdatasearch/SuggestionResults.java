package com.google.android.gms.appdatasearch;

import abxd;
import abxe;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

public class SuggestionResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    public final String[] b;
    final String[] c;

    static {
        SuggestionResults.CREATOR = new abxe();
    }

    public SuggestionResults(String s) {
        this(s, null, null);
    }

    public SuggestionResults(String s, String[] arr_s, String[] arr_s1) {
        this.a = s;
        this.b = arr_s;
        this.c = arr_s1;
    }

    @Override
    public final Iterator iterator() {
        return this.a != null ? null : new abxd(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.w(parcel0, 2, this.b, false);
        baub.w(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

