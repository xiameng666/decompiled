package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import bauc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmx;
import java.util.ArrayList;
import java.util.Arrays;

@Deprecated
public class TapEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    final int b;
    final ValuableInfo[] c;
    final TapFailureUiInfo d;

    static {
        TapEvent.CREATOR = new esmx();
    }

    public TapEvent(int v, int v1) {
        this(v, v1, null, null);
    }

    public TapEvent(int v, int v1, ValuableInfo[] arr_valuableInfo, TapFailureUiInfo tapFailureUiInfo0) {
        this.a = v;
        this.b = v1;
        this.c = arr_valuableInfo;
        this.d = tapFailureUiInfo0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TapEvent) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((TapEvent)object0).a)) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((TapEvent)object0).b)) && Arrays.equals(this.c, ((TapEvent)object0).c);
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.deepHashCode(this.c);
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), integer0});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("eventType", Integer.valueOf(this.a), arrayList0);
        basz.b("failedReason", Integer.valueOf(this.b), arrayList0);
        basz.b("valuableInfos", Arrays.toString(this.c), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        switch(this.a) {
            case 5: {
                parcel0.writeInt(this.b);
                TapFailureUiInfo tapFailureUiInfo0 = this.d;
                if(tapFailureUiInfo0 != null) {
                    parcel0.writeByteArray(bauc.n(tapFailureUiInfo0));
                }
                return;
            }
            case 2: 
            case 4: 
            case 6: {
                return;
            }
            case 7: {
                parcel0.writeInt(this.b);
                return;
            }
            default: {
                parcel0.writeTypedArray(this.c, v);
            }
        }
    }
}

