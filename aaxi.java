import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.actionlearner.LearnedActionProviderClientOptions;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class aaxi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Set set4;
        Set set0;
        int v = baua.h(parcel0);
        int[] arr_v = null;
        Object object0 = null;
        Object object1 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                case 3: {
                    object0 = baua.j(parcel0, v1);
                    break;
                }
                case 4: {
                    object1 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        ibuq.f(arr_v, "internalContextArray");
        ibuq.f(object0, "customCategoricalContextsBundle");
        ibuq.f(object1, "customNumericalContextsBundle");
        ibuq.f(arr_v, "<this>");
        switch(arr_v.length) {
            case 0: {
                set0 = ibpu.a;
                break;
            }
            case 1: {
                set0 = ibqg.b(Integer.valueOf(arr_v[0]));
                break;
            }
            default: {
                set0 = new LinkedHashSet(ibpz.a(arr_v.length));
                ibuq.f(arr_v, "<this>");
                for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    set0.add(Integer.valueOf(arr_v[v2]));
                }
            }
        }
        Set set1 = ((Bundle)object0).keySet();
        ibuq.e(set1, "keySet(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set1, 10)), 16));
        for(Object object2: set1) {
            String[] arr_s = ((Bundle)object0).getStringArray(((String)object2));
            Set set2 = arr_s == null ? null : ibpg.Q(arr_s);
            if(set2 == null) {
                throw new IllegalStateException("Bad mapping!");
            }
            ibns ibns0 = new ibns(((String)object2), set2);
            linkedHashMap0.put(ibns0.a, ibns0.b);
            continue;
        }
        Set set3 = ((Bundle)object1).keySet();
        ibuq.e(set3, "keySet(...)");
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(set3, 10)), 16));
        for(Object object3: set3) {
            float[] arr_f = ((Bundle)object1).getFloatArray(((String)object3));
            if(arr_f == null) {
                set4 = null;
            }
            else {
                switch(arr_f.length) {
                    case 0: {
                        set4 = ibpu.a;
                        break;
                    }
                    case 1: {
                        set4 = ibqg.b(Float.valueOf(arr_f[0]));
                        break;
                    }
                    default: {
                        set4 = new LinkedHashSet(ibpz.a(arr_f.length));
                        for(int v3 = 0; v3 < arr_f.length; ++v3) {
                            set4.add(Float.valueOf(arr_f[v3]));
                        }
                    }
                }
            }
            if(set4 == null) {
                throw new IllegalStateException("Bad mapping!");
            }
            ibns ibns1 = new ibns(((String)object3), set4);
            linkedHashMap1.put(ibns1.a, ibns1.b);
            continue;
        }
        return new LearnedActionProviderClientOptions(s, set0, linkedHashMap0, linkedHashMap1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LearnedActionProviderClientOptions[v];
    }
}

