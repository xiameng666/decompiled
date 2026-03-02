package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bata;
import batl;
import baub;
import bctc;
import bctl;
import bctr;
import bcve;
import bcvh;
import bcwm;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import xti;

public class ContextDataFilterImpl extends AbstractSafeParcelable implements bcvh, bcwm {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList a;
    public final ArrayList b;
    public final QueryFilterParameters c;

    static {
        ContextDataFilterImpl.CREATOR = new bcve();
    }

    public ContextDataFilterImpl(ArrayList arrayList0, ArrayList arrayList1, QueryFilterParameters queryFilterParameters0) {
        this.a = arrayList0;
        this.b = arrayList1;
        this.c = queryFilterParameters0;
    }

    @Override  // bcwm
    public final QueryFilterParameters a() {
        return this.c;
    }

    public final HashSet b() {
        ArrayList arrayList0 = this.a;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            HashSet hashSet0 = new HashSet();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                hashSet0.add(Integer.valueOf(((ContextDataFilterImpl.Inclusion)arrayList0.get(v1)).b));
            }
            return hashSet0;
        }
        return null;
    }

    public final boolean c() {
        return this.a != null && !this.a.isEmpty();
    }

    public final boolean d() {
        return this.b != null && !this.b.isEmpty();
    }

    // This method was un-flattened
    @Override  // bcvh
    public final boolean e(ContextData contextData0) {
        if(this.d()) {
            bctc bctc0 = contextData0.d();
            if(bctc0 != null) {
                ArrayList arrayList0 = this.b;
                batl.s(arrayList0);
                int v = arrayList0.size();
                int v1 = 0;
                while(v1 < v) {
                    String s = (String)arrayList0.get(v1);
                    ++v1;
                    if(TextUtils.equals(s, bctc0.c())) {
                        goto label_11;
                    }
                }
            }
        }
        else {
        label_11:
            if(this.c()) {
                ArrayList arrayList1 = this.a;
                batl.s(arrayList1);
                int v2 = arrayList1.size();
                int v3 = 0;
                while(v3 < v2) {
                    ContextDataFilterImpl.Inclusion contextDataFilterImpl$Inclusion0 = (ContextDataFilterImpl.Inclusion)arrayList1.get(v3);
                    if(contextDataFilterImpl$Inclusion0.a()) {
                        int v4 = contextData0.a();
                        if(contextDataFilterImpl$Inclusion0.a != v4) {
                            ++v3;
                            continue;
                        }
                    }
                    if(contextDataFilterImpl$Inclusion0.c()) {
                        int v5 = contextData0.b();
                        if(contextDataFilterImpl$Inclusion0.b != v5) {
                            ++v3;
                            continue;
                        }
                    }
                    if(contextDataFilterImpl$Inclusion0.d()) {
                        if(contextData0.f() == null) {
                            xti.d("ContextDataFilterImpl", "No context time specified for Context: [%s]", Integer.valueOf(contextData0.b()));
                        }
                        else {
                            bctr bctr0 = contextData0.f();
                            batl.s(bctr0);
                            ArrayList arrayList2 = contextDataFilterImpl$Inclusion0.c.a;
                            int v6 = arrayList2.size();
                            int v7 = 0;
                            while(v7 < v6) {
                                TimeFilterImpl.Interval timeFilterImpl$Interval0 = (TimeFilterImpl.Interval)arrayList2.get(v7);
                                int v8 = Long.compare(timeFilterImpl$Interval0.b() - timeFilterImpl$Interval0.c(), bctr0.b() - bctr0.c());
                                TimeFilterImpl.Interval timeFilterImpl$Interval1 = v8 > 0 ? timeFilterImpl$Interval0 : bctr0;
                                if(v8 > 0) {
                                    timeFilterImpl$Interval0 = bctr0;
                                }
                                long v9 = timeFilterImpl$Interval1.c();
                                long v10 = timeFilterImpl$Interval1.b();
                                long v11 = timeFilterImpl$Interval0.c();
                                long v12 = timeFilterImpl$Interval0.b();
                                if((Long.compare(v11, v9) < 0 || v11 > v10) && (v12 < v9 || v12 > v10)) {
                                    ++v7;
                                    continue;
                                }
                                else {
                                    goto label_54;
                                }
                                break;
                            }
                            ++v3;
                            continue;
                        }
                    }
                label_54:
                    if(contextDataFilterImpl$Inclusion0.b()) {
                        batl.s(contextDataFilterImpl$Inclusion0.d);
                        bctl bctl0 = contextData0.e();
                        ArrayList arrayList3 = contextDataFilterImpl$Inclusion0.d.a;
                        if(!arrayList3.isEmpty()) {
                            int v13 = arrayList3.size();
                            for(int v14 = 0; v14 < v13; ++v14) {
                                KeyFilterImpl.Inclusion keyFilterImpl$Inclusion0 = (KeyFilterImpl.Inclusion)arrayList3.get(v14);
                                if(bctl0 != null && (KeyFilterImpl.a(bctl0.b(), keyFilterImpl$Inclusion0.a) && KeyFilterImpl.a(bctl0.c(), keyFilterImpl$Inclusion0.b) && KeyFilterImpl.a(bctl0.d(), keyFilterImpl$Inclusion0.c))) {
                                    return true;
                                }
                            }
                            ++v3;
                            continue;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ContextDataFilterImpl) ? bata.b(this.a, ((ContextDataFilterImpl)object0).a) && bata.b(this.b, ((ContextDataFilterImpl)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("contexts=[");
        ArrayList arrayList0 = this.a;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                stringBuilder0.append(((ContextDataFilterImpl.Inclusion)arrayList0.get(v1)).b);
                stringBuilder0.append(",");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 2, this.a, false);
        baub.x(parcel0, 3, this.b, false);
        baub.t(parcel0, 4, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

