package com.google.android.gms.family.v2.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bata;
import baub;
import bkpl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Long b;
    public final AvatarReference c;
    public final ArrayList d;
    public final Uri e;

    static {
        ContactPerson.CREATOR = new bkpl();
    }

    public ContactPerson(String s, Long long0, AvatarReference avatarReference0, Uri uri0) {
        this.d = new ArrayList();
        this.a = s;
        this.b = long0;
        this.c = avatarReference0;
        this.e = uri0;
    }

    public ContactPerson(String s, Long long0, AvatarReference avatarReference0, List list0, Uri uri0) {
        ArrayList arrayList0 = new ArrayList();
        this.d = arrayList0;
        this.a = s;
        this.b = long0;
        this.c = avatarReference0;
        if(list0 != null) {
            arrayList0.addAll(list0);
        }
        this.e = uri0;
    }

    public final void a(List list0) {
        this.d.addAll(list0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && bata.b(this.a, ((ContactPerson)object0).a) && bata.b(this.b, ((ContactPerson)object0).b) && bata.b(new HashSet(this.d), new HashSet(((ContactPerson)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ContactPerson{");
        String s = this.a;
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append(" name=");
            stringBuilder0.append(s);
        }
        Long long0 = this.b;
        if(long0 != null) {
            stringBuilder0.append(" cp2Id=");
            stringBuilder0.append(long0);
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.I(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.y(parcel0, 4, this.d, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.c(parcel0, v1);
    }
}

