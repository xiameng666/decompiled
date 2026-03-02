package com.google.android.gms.multidevice.sync;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ctgi;
import ibuq;

public final class QuickAccessDocument extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final Integer f;
    public final Long g;
    public final String h;

    static {
        QuickAccessDocument.CREATOR = new ctgi();
    }

    public QuickAccessDocument(String s, String s1, String s2, long v, int v1, Integer integer0, Long long0, String s3) {
        ibuq.f(s, "documentId");
        ibuq.f(s1, "displayName");
        ibuq.f(s2, "mimeType");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = v;
        this.e = v1;
        this.f = integer0;
        this.g = long0;
        this.h = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof QuickAccessDocument)) {
            return false;
        }
        if(!ibuq.m(this.a, ((QuickAccessDocument)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((QuickAccessDocument)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((QuickAccessDocument)object0).c)) {
            return false;
        }
        if(this.d != ((QuickAccessDocument)object0).d) {
            return false;
        }
        if(this.e != ((QuickAccessDocument)object0).e) {
            return false;
        }
        if(!ibuq.m(this.f, ((QuickAccessDocument)object0).f)) {
            return false;
        }
        return ibuq.m(this.g, ((QuickAccessDocument)object0).g) ? ibuq.m(this.h, ((QuickAccessDocument)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + this.e) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F;
        int v2 = this.g == null ? 0 : this.g.hashCode();
        String s = this.h;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "QuickAccessDocument(documentId=" + this.a + ", displayName=" + this.b + ", mimeType=" + this.c + ", size=" + this.d + ", flags=" + this.e + ", icon=" + this.f + ", lastModified=" + this.g + ", summary=" + this.h + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.q(parcel0, 4, this.d);
        baub.o(parcel0, 5, this.e);
        baub.F(parcel0, 6, this.f);
        baub.I(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.c(parcel0, v1);
    }
}

