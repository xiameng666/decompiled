package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gfuy;
import gopr;
import goqt;
import java.util.Arrays;

public class Thing.Metadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final int b;
    public final String c;
    public final Bundle d;
    public final Bundle e;

    static {
        Thing.Metadata.CREATOR = new goqt();
    }

    public Thing.Metadata(boolean z, int v, String s, Bundle bundle0, Bundle bundle1) {
        this.a = z;
        this.b = v;
        this.c = s;
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        this.d = bundle0;
        if(bundle1 == null) {
            bundle1 = new Bundle();
        }
        this.e = bundle1;
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        gfuy.e(classLoader0);
        bundle1.setClassLoader(classLoader0);
    }

    public final boolean a() {
        Thing.Metadata thing$Metadata0 = new gopr().a();
        return bata.b(Boolean.valueOf(this.a), Boolean.valueOf(thing$Metadata0.a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(thing$Metadata0.b)) && bata.b(this.c, thing$Metadata0.c) && this.d.isEmpty() && this.e.isEmpty();
    }

    public final boolean[] b() {
        return (this.d.get("isGlobalSearchable") instanceof boolean[]) ? this.d.getBooleanArray("isGlobalSearchable") : null;
    }

    public final long[] c() {
        return (this.d.get("scope") instanceof long[]) ? this.d.getLongArray("scope") : null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof Thing.Metadata) ? bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((Thing.Metadata)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((Thing.Metadata)object0).b)) && bata.b(this.c, ((Thing.Metadata)object0).c) && Thing.e(this.d, ((Thing.Metadata)object0).d) && Thing.e(this.e, ((Thing.Metadata)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Thing.a(this.d);
        Integer integer1 = Thing.a(this.e);
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), ((int)this.b), this.c, integer0, integer1});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("worksOffline: ");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", score: ");
        stringBuilder0.append(this.b);
        String s = this.c;
        if(!s.isEmpty()) {
            stringBuilder0.append(", accountEmail: ");
            stringBuilder0.append(s);
        }
        Bundle bundle0 = this.d;
        if(!bundle0.isEmpty()) {
            stringBuilder0.append(", Properties { ");
            Thing.d(bundle0, stringBuilder0);
            stringBuilder0.append("}");
        }
        Bundle bundle1 = this.e;
        if(!bundle1.isEmpty()) {
            stringBuilder0.append(", embeddingProperties { ");
            Thing.d(bundle1, stringBuilder0);
            stringBuilder0.append("}");
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.g(parcel0, 4, this.d, false);
        baub.g(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

