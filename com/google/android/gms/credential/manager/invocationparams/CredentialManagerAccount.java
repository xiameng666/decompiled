package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bdim;
import becp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class CredentialManagerAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        CredentialManagerAccount.CREATOR = new becp();
    }

    public CredentialManagerAccount(String s) {
        this.a = s;
    }

    public static CredentialManagerAccount a(String s) {
        batl.r(s, "accountName must not be empty nor null");
        return new CredentialManagerAccount(s);
    }

    public final boolean b() {
        return bdim.a(this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof CredentialManagerAccount) ? ((CredentialManagerAccount)object0).a.equals(this.a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.c(parcel0, v1);
    }
}

