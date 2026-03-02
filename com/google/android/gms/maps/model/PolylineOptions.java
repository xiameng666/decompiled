package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Pair;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cpsh;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public float b;
    public int c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Cap h;
    public Cap i;
    public int j;
    public List k;
    private List l;

    static {
        PolylineOptions.CREATOR = new cpsh();
    }

    public PolylineOptions() {
        this.b = 10.0f;
        this.c = 0xFF000000;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.l = new ArrayList();
        this.a = new ArrayList();
    }

    public PolylineOptions(List list0, float f, int v, float f1, boolean z, boolean z1, boolean z2, Cap cap0, Cap cap1, int v1, List list1, List list2) {
        this.b = 10.0f;
        this.c = 0xFF000000;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.l = new ArrayList();
        this.a = list0;
        this.b = f;
        this.c = v;
        this.d = f1;
        this.e = z;
        this.f = z1;
        this.g = z2;
        if(cap0 != null) {
            this.h = cap0;
        }
        if(cap1 != null) {
            this.i = cap1;
        }
        this.j = v1;
        this.k = list1;
        if(list2 != null) {
            this.l = list2;
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 2, this.a, false);
        baub.l(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.l(parcel0, 5, this.d);
        baub.e(parcel0, 6, this.e);
        baub.e(parcel0, 7, this.f);
        baub.e(parcel0, 8, this.g);
        baub.t(parcel0, 9, this.h.a(), v, false);
        baub.t(parcel0, 10, this.i.a(), v, false);
        baub.o(parcel0, 11, this.j);
        baub.y(parcel0, 12, this.k, false);
        ArrayList arrayList0 = new ArrayList(this.l.size());
        for(Object object0: this.l) {
            Pair pair0 = new Pair(((int)((StyleSpan)object0).a.b), ((int)((StyleSpan)object0).a.c));
            arrayList0.add(new StyleSpan(new StrokeStyle(this.b, ((int)(((Integer)pair0.first))), ((int)(((Integer)pair0.second))), this.e, ((StyleSpan)object0).a.e), ((StyleSpan)object0).b));
        }
        baub.y(parcel0, 13, arrayList0, false);
        baub.c(parcel0, v1);
    }
}

