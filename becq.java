import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;

public final class becq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        CredentialManagerAccount credentialManagerAccount0 = null;
        CallerInfo callerInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    credentialManagerAccount0 = (CredentialManagerAccount)baua.m(parcel0, v1, CredentialManagerAccount.CREATOR);
                    break;
                }
                case 2: {
                    callerInfo0 = (CallerInfo)baua.m(parcel0, v1, CallerInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CredentialManagerInvocationParams(credentialManagerAccount0, callerInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CredentialManagerInvocationParams[v];
    }
}

