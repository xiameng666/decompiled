package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bzwm;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

public class VisitedApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final BitmapTeleporter a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ContentRating f;
    private final ArrayList g;

    static {
        VisitedApplication.CREATOR = new bzwm();
    }

    public VisitedApplication(BitmapTeleporter bitmapTeleporter0, String s, String s1, String s2, String s3, Collection collection0, ContentRating contentRating0) {
        this.a = bitmapTeleporter0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        ArrayList arrayList0 = new ArrayList((collection0 == null ? 0 : collection0.size()));
        this.g = arrayList0;
        if(collection0 != null) {
            arrayList0.addAll(collection0);
        }
        this.f = contentRating0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.x(parcel0, 7, DesugarCollections.unmodifiableList(this.g), false);
        baub.t(parcel0, 8, this.f, v, false);
        baub.c(parcel0, v1);
    }
}

