package com.google.android.gms.appsearch;

import achk;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class GetSchemaResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    final List b;
    final List c;
    public Set d;
    public Map e;
    public Map f;
    public Map g;
    public Map h;
    private Set i;

    static {
        GetSchemaResponse.CREATOR = new achk();
    }

    public GetSchemaResponse(int v, List list0, List list1) {
        this.a = v;
        this.b = (List)Objects.requireNonNull(list0);
        this.c = list1;
    }

    public final List a() {
        List list0 = this.c;
        if(list0 != null) {
            return list0;
        }
        throw new UnsupportedOperationException("Get visibility setting is not supported with this backend/Android API level combination.");
    }

    public final Set b() {
        if(this.i == null) {
            this.i = DesugarCollections.unmodifiableSet(new bxf(this.b));
        }
        return this.i;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.y(parcel0, 2, this.b, false);
        baub.y(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

