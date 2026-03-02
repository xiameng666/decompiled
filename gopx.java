import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;
import com.google.firebase.appindexing.internal.ActionImpl;

public final class gopx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        ActionImpl.MetadataImpl actionImpl$MetadataImpl0 = null;
        String s4 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    actionImpl$MetadataImpl0 = (ActionImpl.MetadataImpl)baua.m(parcel0, v1, ActionImpl.MetadataImpl.CREATOR);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ActionImpl(s, s1, s2, s3, actionImpl$MetadataImpl0, s4, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ActionImpl[v];
    }
}

