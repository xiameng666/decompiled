package com.google.android.gms.appinvite.model;

import acbs;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bata;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public Long c;
    public AvatarReference d;
    public final ArrayList e;
    int f;

    static {
        ContactPerson.CREATOR = new acbs();
    }

    public ContactPerson(String s, String s1, AvatarReference avatarReference0, List list0) {
        this(s, s1, null, avatarReference0, list0, 0);
    }

    public ContactPerson(String s, String s1, Long long0, AvatarReference avatarReference0, List list0, int v) {
        ArrayList arrayList0 = new ArrayList();
        this.e = arrayList0;
        this.a = s;
        this.b = s1;
        this.c = long0;
        this.d = avatarReference0;
        if(list0 != null) {
            arrayList0.addAll(list0);
        }
        this.f = v;
    }

    public final ContactPerson.ContactMethod a() {
        return this.f >= this.e.size() ? null : ((ContactPerson.ContactMethod)this.e.get(this.f));
    }

    public final void b(ContactPerson.ContactMethod contactPerson$ContactMethod0) {
        if(contactPerson$ContactMethod0 == null) {
            this.f = this.e.size();
            return;
        }
        ArrayList arrayList0 = this.e;
        if(arrayList0.contains(contactPerson$ContactMethod0)) {
            this.f = arrayList0.indexOf(contactPerson$ContactMethod0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ContactPerson) ? bata.b(this.a, ((ContactPerson)object0).a) && bata.b(this.b, ((ContactPerson)object0).b) && bata.b(this.c, ((ContactPerson)object0).c) && bata.b(this.e, ((ContactPerson)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ContactPerson{");
        if(!TextUtils.isEmpty(this.a)) {
            stringBuilder0.append(" name=");
            stringBuilder0.append(this.a);
        }
        if(!TextUtils.isEmpty(this.b)) {
            stringBuilder0.append(" gaiaId=");
            stringBuilder0.append(this.b);
        }
        if(this.c != null) {
            stringBuilder0.append(" cp2Id=");
            stringBuilder0.append(this.c);
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.I(parcel0, 4, this.c);
        baub.t(parcel0, 5, this.d, v, false);
        baub.y(parcel0, 6, this.e, false);
        baub.o(parcel0, 7, this.f);
        baub.c(parcel0, v1);
    }
}

