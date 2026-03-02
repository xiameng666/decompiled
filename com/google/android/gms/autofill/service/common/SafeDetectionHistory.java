package com.google.android.gms.autofill.service.common;

import ando;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import aors;
import aorx;
import aory;
import aorz;
import aosa;
import baub;
import com.google.android.gms.autofill.fill.IFillField;
import com.google.android.gms.autofill.fill.IFillForm;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gfsx;
import ggaf;
import gged_interceptors;
import ggia;
import ggna;
import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.List;

public class SafeDetectionHistory extends AbstractSafeParcelable implements IDetectionHistory {
    public static final Parcelable.Creator CREATOR;
    private final List a;

    static {
        SafeDetectionHistory.CREATOR = new aosa();
    }

    public SafeDetectionHistory() {
        this(ggna.a);
    }

    public SafeDetectionHistory(List list0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        arrayList0.addAll(list0);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final IFillField a(int v, ando[] arr_ando) {
        List list0 = ggia.g(this.f(v));
        for(int v1 = 0; v1 < arr_ando.length; ++v1) {
            ando ando0 = arr_ando[v1];
            for(Object object0: list0) {
                gfsx gfsx0 = ((IFillForm)object0).e(gged_interceptors.l(ando0));
                if(gfsx0.i()) {
                    return (IFillField)gfsx0.d();
                }
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final IFillField b(int v, ando[] arr_ando) {
        throw null;
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final IFillForm c() {
        return aors.b(this);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final gged_interceptors d(int v) {
        return aors.d(this, v);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final gged_interceptors e() {
        return aors.f(this);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final gged_interceptors f(int v) {
        return aors.g(this, v);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final void g(IDetectionHistory.IDetectionResult[] arr_iDetectionHistory$IDetectionResult) {
        aors.h(this, arr_iDetectionHistory$IDetectionResult);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final gged_interceptors h() {
        return (gged_interceptors)Collection.-EL.stream(this.a).map(new aory()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final void i(gged_interceptors gged0) {
        if(gged0.isEmpty()) {
            return;
        }
        gged_interceptors gged1 = (gged_interceptors)Collection.-EL.stream(gged0).map(new aorz()).collect(ggaf.a);
        this.a.addAll(gged1);
    }

    public static SafeDetectionHistory j(IDetectionHistory iDetectionHistory0) {
        return new SafeDetectionHistory(((gged_interceptors)Collection.-EL.stream(iDetectionHistory0.h()).map(new aorx()).collect(ggaf.a)));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, gged_interceptors.i(this.a), false);
        baub.c(parcel0, v1);
    }
}

