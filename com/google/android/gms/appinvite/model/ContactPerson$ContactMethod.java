package com.google.android.gms.appinvite.model;

import acbr;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.Arrays;

public class ContactPerson.ContactMethod extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final AvatarReference c;

    static {
        ContactPerson.ContactMethod.CREATOR = new acbr();
    }

    public ContactPerson.ContactMethod(int v, String s) {
        this(v, s, null);
    }

    public ContactPerson.ContactMethod(int v, String s, AvatarReference avatarReference0) {
        this.a = v;
        this.b = s;
        this.c = avatarReference0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ContactPerson.ContactMethod) ? this.a == ((ContactPerson.ContactMethod)object0).a && bata.b(this.b, ((ContactPerson.ContactMethod)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

