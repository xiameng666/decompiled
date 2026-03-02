package com.google.android.gms.semanticlocation.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import emhf;
import java.util.Arrays;

public class SemanticLocationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final String b;
    public final String c;

    static {
        SemanticLocationParameters.CREATOR = new emhf();
    }

    public SemanticLocationParameters(Account account0, String s, String s1) {
        this.a = account0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SemanticLocationParameters) ? bata.b(this.a, ((SemanticLocationParameters)object0).a) && bata.b(this.b, ((SemanticLocationParameters)object0).b) && bata.b(this.c, ((SemanticLocationParameters)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

