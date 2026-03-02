package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmz;
import java.util.ArrayList;
import java.util.Arrays;

public final class TokenReference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String a;
    public final int b;

    static {
        TokenReference.CREATOR = new esmz();
    }

    public TokenReference(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TokenReference) && bata.b(this.a, ((TokenReference)object0).a) && this.b == ((TokenReference)object0).b;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("tokenReferenceId", this.a, arrayList0);
        basz.b("tokenProvider", Integer.valueOf(this.b), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.o(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

