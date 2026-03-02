import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;

public final class ayvk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PlayLoggerContext playLoggerContext0 = null;
        byte[] arr_b = null;
        int[] arr_v = null;
        String[] arr_s = null;
        int[] arr_v1 = null;
        byte[][] arr2_b = null;
        ExperimentTokens[] arr_experimentTokens = null;
        LogVerifierResultParcelable logVerifierResultParcelable0 = null;
        String[] arr_s1 = null;
        DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable0 = null;
        int v1 = 0;
        boolean z = true;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    playLoggerContext0 = (PlayLoggerContext)baua.m(parcel0, v2, PlayLoggerContext.CREATOR);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_v = baua.H(parcel0, v2);
                    break;
                }
                case 5: {
                    arr_s = baua.K(parcel0, v2);
                    break;
                }
                case 6: {
                    arr_v1 = baua.H(parcel0, v2);
                    break;
                }
                case 7: {
                    arr2_b = baua.M(parcel0, v2);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 9: {
                    arr_experimentTokens = (ExperimentTokens[])baua.J(parcel0, v2, ExperimentTokens.CREATOR);
                    break;
                }
                case 11: {
                    logVerifierResultParcelable0 = (LogVerifierResultParcelable)baua.m(parcel0, v2, LogVerifierResultParcelable.CREATOR);
                    break;
                }
                case 12: {
                    arr_s1 = baua.K(parcel0, v2);
                    break;
                }
                case 13: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 14: {
                    dataCollectionIdentifierParcelable0 = (DataCollectionIdentifierParcelable)baua.m(parcel0, v2, DataCollectionIdentifierParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new LogEventParcelable(playLoggerContext0, arr_b, arr_v, arr_s, arr_v1, arr2_b, z, arr_experimentTokens, logVerifierResultParcelable0, arr_s1, v1, dataCollectionIdentifierParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LogEventParcelable[v];
    }
}

