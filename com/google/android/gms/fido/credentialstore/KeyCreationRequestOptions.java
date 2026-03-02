package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bmcp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class KeyCreationRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;
    public final int c;
    public final int[] d;
    public final byte[] e;
    public final String f;
    public final String g;
    public final Account h;
    public final boolean i;
    public final boolean j;

    static {
        KeyCreationRequestOptions.CREATOR = new bmcp();
    }

    public KeyCreationRequestOptions(String s, boolean z, int v, int[] arr_v, byte[] arr_b, String s1, String s2, Account account0, boolean z1, boolean z2) {
        batl.c(s != null && s.length() > 0, "rpId cannot be empty");
        this.a = s;
        this.b = z;
        this.c = v;
        this.d = arr_v;
        this.e = arr_b;
        this.f = s1;
        this.g = s2;
        this.h = account0;
        this.i = z1;
        this.j = z2;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof KeyCreationRequestOptions) ? bata.b(this.a, ((KeyCreationRequestOptions)object0).a) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((KeyCreationRequestOptions)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((KeyCreationRequestOptions)object0).c)) && bata.b(this.d, ((KeyCreationRequestOptions)object0).d) && Arrays.equals(this.e, ((KeyCreationRequestOptions)object0).e) && bata.b(this.f, ((KeyCreationRequestOptions)object0).f) && bata.b(this.g, ((KeyCreationRequestOptions)object0).g) && bata.b(this.h, ((KeyCreationRequestOptions)object0).h) && bata.b(Boolean.valueOf(this.i), Boolean.valueOf(((KeyCreationRequestOptions)object0).i)) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((KeyCreationRequestOptions)object0).j)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), ((int)this.c), this.d, this.e, this.f, this.g, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.p(parcel0, 4, this.d, false);
        baub.i(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.t(parcel0, 8, this.h, v, false);
        baub.e(parcel0, 9, this.i);
        baub.e(parcel0, 10, this.j);
        baub.c(parcel0, v1);
    }
}

