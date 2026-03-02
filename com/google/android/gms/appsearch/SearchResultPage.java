package com.google.android.gms.appsearch;

import acig;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class SearchResultPage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    private final List b;

    static {
        SearchResultPage.CREATOR = new acig();
    }

    public SearchResultPage() {
        this.a = 0L;
        this.b = Collections.EMPTY_LIST;
    }

    public SearchResultPage(long v, List list0) {
        this.a = v;
        this.b = list0;
    }

    public final List a() {
        return this.b == null ? Collections.EMPTY_LIST : this.b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.q(parcel0, 1, this.a);
        baub.y(parcel0, 2, this.a(), false);
        baub.c(parcel0, v1);
    }
}

