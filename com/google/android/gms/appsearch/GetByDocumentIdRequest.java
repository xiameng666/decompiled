package com.google.android.gms.appsearch;

import achj;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;
import java.util.List;

public final class GetByDocumentIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    final List b;
    final Bundle c;

    static {
        GetByDocumentIdRequest.CREATOR = new achj();
    }

    public GetByDocumentIdRequest(String s, List list0, Bundle bundle0) {
        this.a = (String)Objects.requireNonNull(s);
        this.b = (List)Objects.requireNonNull(list0);
        this.c = (Bundle)Objects.requireNonNull(bundle0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.x(parcel0, 2, this.b, false);
        baub.g(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

