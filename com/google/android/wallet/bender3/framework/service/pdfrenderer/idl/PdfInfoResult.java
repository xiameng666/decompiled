package com.google.android.wallet.bender3.framework.service.pdfrenderer.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gbkg;
import ibuq;

public final class PdfInfoResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;

    static {
        PdfInfoResult.CREATOR = new gbkg();
    }

    public PdfInfoResult(int v, String s) {
        ibuq.f(s, "cacheKey");
        super();
        this.a = v;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PdfInfoResult)) {
            return false;
        }
        return this.a == ((PdfInfoResult)object0).a ? ibuq.m(this.b, ((PdfInfoResult)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "PdfInfoResult(pageCount=" + this.a + ", cacheKey=" + this.b + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

