import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.learning.TrainingInterval;

public final class cbzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        Uri uri0 = null;
        InAppTrainingConstraints inAppTrainingConstraints0 = null;
        Uri uri1 = null;
        TrainingInterval trainingInterval0 = null;
        byte[] arr_b = null;
        Uri uri2 = null;
        Bundle bundle0 = null;
        byte[] arr_b1 = null;
        long v1 = 0L;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 6: {
                    uri0 = (Uri)baua.m(parcel0, v4, Uri.CREATOR);
                    break;
                }
                case 9: {
                    inAppTrainingConstraints0 = (InAppTrainingConstraints)baua.m(parcel0, v4, InAppTrainingConstraints.CREATOR);
                    break;
                }
                case 10: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 11: {
                    uri1 = (Uri)baua.m(parcel0, v4, Uri.CREATOR);
                    break;
                }
                case 12: {
                    trainingInterval0 = (TrainingInterval)baua.m(parcel0, v4, TrainingInterval.CREATOR);
                    break;
                }
                case 13: {
                    arr_b = baua.E(parcel0, v4);
                    break;
                }
                case 14: {
                    uri2 = (Uri)baua.m(parcel0, v4, Uri.CREATOR);
                    break;
                }
                case 15: {
                    bundle0 = baua.j(parcel0, v4);
                    break;
                }
                case 16: {
                    arr_b1 = baua.E(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new InAppTrainerOptions(s, v2, z, s1, v3, uri0, inAppTrainingConstraints0, v1, uri1, trainingInterval0, arr_b, uri2, bundle0, arr_b1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InAppTrainerOptions[v];
    }
}

