package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlit;
import java.util.Arrays;

public final class SecureElementPrepaidTosSection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public int c;
    public String d;

    static {
        SecureElementPrepaidTosSection.CREATOR = new dlit();
    }

    public SecureElementPrepaidTosSection() {
    }

    public SecureElementPrepaidTosSection(String s, String s1, int v, String s2) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SecureElementPrepaidTosSection) && bata.b(this.a, ((SecureElementPrepaidTosSection)object0).a) && bata.b(this.b, ((SecureElementPrepaidTosSection)object0).b) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((SecureElementPrepaidTosSection)object0).c)) && bata.b(this.d, ((SecureElementPrepaidTosSection)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

