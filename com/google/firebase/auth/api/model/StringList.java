package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbqr;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import goyx;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public List a;

    static {
        StringList.CREATOR = new goyx();
    }

    public StringList() {
        this(null);
    }

    public StringList(List list0) {
        this.a = new ArrayList();
        if(list0 != null && !list0.isEmpty()) {
            this.a.addAll(list0);
        }
    }

    public StringList(List list0, byte[] arr_b) {
        if(list0 != null && !list0.isEmpty()) {
            for(int v = 0; v < list0.size(); ++v) {
                list0.set(v, bbqr.b(((String)list0.get(v))));
            }
            this.a = DesugarCollections.unmodifiableList(list0);
            return;
        }
        this.a = Collections.EMPTY_LIST;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.x(parcel0, 2, this.a, false);
        baub.c(parcel0, v1);
    }
}

