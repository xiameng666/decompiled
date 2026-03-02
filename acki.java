import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appsearch.EmbeddingVector;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.appsearch.safeparcel.PropertyParcel;

public final class acki implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String[] arr_s = null;
        long[] arr_v = null;
        double[] arr_f = null;
        boolean[] arr_z = null;
        byte[][] arr2_b = null;
        GenericDocumentParcel[] arr_genericDocumentParcel = null;
        EmbeddingVector[] arr_embeddingVector = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_v = baua.I(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_f = baua.F(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_z = baua.L(parcel0, v1);
                    break;
                }
                case 6: {
                    arr2_b = baua.M(parcel0, v1);
                    break;
                }
                case 7: {
                    arr_genericDocumentParcel = (GenericDocumentParcel[])baua.J(parcel0, v1, GenericDocumentParcel.CREATOR);
                    break;
                }
                case 8: {
                    arr_embeddingVector = (EmbeddingVector[])baua.J(parcel0, v1, EmbeddingVector.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PropertyParcel(s, arr_s, arr_v, arr_f, arr_z, arr2_b, arr_genericDocumentParcel, arr_embeddingVector);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PropertyParcel[v];
    }
}

