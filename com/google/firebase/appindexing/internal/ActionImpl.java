package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gfuy;
import gopx;

public class ActionImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ActionImpl.MetadataImpl e;
    public final String f;
    public final Bundle g;

    static {
        ActionImpl.CREATOR = new gopx();
    }

    public ActionImpl(String s, String s1, String s2, String s3, ActionImpl.MetadataImpl actionImpl$MetadataImpl0, String s4, Bundle bundle0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = actionImpl$MetadataImpl0;
        this.f = s4;
        this.g = bundle0 == null ? Bundle.EMPTY : bundle0;
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        gfuy.e(classLoader0);
        this.g.setClassLoader(classLoader0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ActionImpl { { actionType: \'");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\' } { objectName: \'");
        stringBuilder0.append(this.b);
        stringBuilder0.append("\' } { objectUrl: \'");
        stringBuilder0.append(this.c);
        stringBuilder0.append("\' } ");
        String s = this.d;
        if(s != null) {
            stringBuilder0.append("{ objectSameAs: \'");
            stringBuilder0.append(s);
            stringBuilder0.append("\' } ");
        }
        ActionImpl.MetadataImpl actionImpl$MetadataImpl0 = this.e;
        if(actionImpl$MetadataImpl0 != null) {
            stringBuilder0.append("{ metadata: \'");
            stringBuilder0.append(actionImpl$MetadataImpl0.toString());
            stringBuilder0.append("\' } ");
        }
        String s1 = this.f;
        if(s1 != null) {
            stringBuilder0.append("{ actionStatus: \'");
            stringBuilder0.append(s1);
            stringBuilder0.append("\' } ");
        }
        Bundle bundle0 = this.g;
        if(!bundle0.isEmpty()) {
            stringBuilder0.append("{ ");
            stringBuilder0.append(bundle0);
            stringBuilder0.append(" } ");
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.v(parcel0, 6, this.f, false);
        baub.g(parcel0, 7, this.g, false);
        baub.c(parcel0, v1);
    }
}

