package com.google.android.gms.appsearch.safeparcel;

import ackd;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;
import java.util.List;
import java.util.Map;

public final class GenericDocumentParcel extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;
    public final List g;
    public final List h;
    public final Map i;
    private Integer j;

    static {
        GenericDocumentParcel.CREATOR = new ackd();
    }

    public GenericDocumentParcel(String s, String s1, String s2, long v, long v1, int v2, List list0, List list1) {
        Objects.requireNonNull(list0);
        ArrayMap arrayMap0 = new ArrayMap(list0.size());
        for(int v3 = 0; v3 < list0.size(); ++v3) {
            PropertyParcel propertyParcel0 = (PropertyParcel)list0.get(v3);
            arrayMap0.put(propertyParcel0.a, propertyParcel0);
        }
        super();
        this.a = (String)Objects.requireNonNull(s);
        this.b = (String)Objects.requireNonNull(s1);
        this.c = (String)Objects.requireNonNull(s2);
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = (List)Objects.requireNonNull(list0);
        this.i = (Map)Objects.requireNonNull(arrayMap0);
        this.h = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GenericDocumentParcel) ? this.a.equals(((GenericDocumentParcel)object0).a) && this.b.equals(((GenericDocumentParcel)object0).b) && this.c.equals(((GenericDocumentParcel)object0).c) && this.e == ((GenericDocumentParcel)object0).e && this.d == ((GenericDocumentParcel)object0).d && this.f == ((GenericDocumentParcel)object0).f && Objects.equals(this.g, ((GenericDocumentParcel)object0).g) && Objects.equals(this.i, ((GenericDocumentParcel)object0).i) && Objects.equals(this.h, ((GenericDocumentParcel)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        if(this.j == null) {
            this.j = Objects.hash(new Object[]{this.a, this.b, this.c, ((long)this.e), ((int)this.f), ((long)this.d), Objects.hashCode(this.g), Objects.hashCode(this.i), Objects.hashCode(this.h)});
        }
        return (int)this.j;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ackd.a(this, parcel0);
    }
}

