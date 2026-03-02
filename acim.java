import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.EmbeddingVector;
import com.google.android.gms.appsearch.JoinSpec;
import com.google.android.gms.appsearch.SearchSpec;
import java.util.List;

public final class acim implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        Bundle bundle0 = null;
        List list2 = null;
        Bundle bundle1 = null;
        Bundle bundle2 = null;
        JoinSpec joinSpec0 = null;
        String s = null;
        List list3 = null;
        String s1 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        while(parcel0.dataPosition() < v) {
            int v11 = parcel0.readInt();
            switch(((char)v11)) {
                case 1: {
                    v1 = baua.f(parcel0, v11);
                    break;
                }
                case 2: {
                    list0 = baua.x(parcel0, v11);
                    break;
                }
                case 3: {
                    list1 = baua.x(parcel0, v11);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v11);
                    break;
                }
                case 5: {
                    list2 = baua.x(parcel0, v11);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v11);
                    break;
                }
                case 7: {
                    v3 = baua.f(parcel0, v11);
                    break;
                }
                case 8: {
                    v4 = baua.f(parcel0, v11);
                    break;
                }
                case 9: {
                    v5 = baua.f(parcel0, v11);
                    break;
                }
                case 10: {
                    v6 = baua.f(parcel0, v11);
                    break;
                }
                case 11: {
                    v7 = baua.f(parcel0, v11);
                    break;
                }
                case 12: {
                    bundle1 = baua.j(parcel0, v11);
                    break;
                }
                case 13: {
                    v8 = baua.f(parcel0, v11);
                    break;
                }
                case 14: {
                    v9 = baua.f(parcel0, v11);
                    break;
                }
                case 15: {
                    bundle2 = baua.j(parcel0, v11);
                    break;
                }
                case 16: {
                    joinSpec0 = (JoinSpec)baua.m(parcel0, v11, JoinSpec.CREATOR);
                    break;
                }
                case 17: {
                    s = baua.s(parcel0, v11);
                    break;
                }
                case 18: {
                    list3 = baua.x(parcel0, v11);
                    break;
                }
                case 19: {
                    s1 = baua.s(parcel0, v11);
                    break;
                }
                case 20: {
                    list4 = baua.y(parcel0, v11, EmbeddingVector.CREATOR);
                    break;
                }
                case 21: {
                    v10 = baua.f(parcel0, v11);
                    break;
                }
                case 22: {
                    list5 = baua.x(parcel0, v11);
                    break;
                }
                case 23: {
                    list6 = baua.x(parcel0, v11);
                    break;
                }
                default: {
                    baua.C(parcel0, v11);
                }
            }
        }
        baua.A(parcel0, v);
        return new SearchSpec(v1, list0, list1, bundle0, list2, v2, v3, v4, v5, v6, v7, bundle1, v8, v9, bundle2, joinSpec0, s, list3, s1, list4, v10, list5, list6);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SearchSpec[v];
    }
}

