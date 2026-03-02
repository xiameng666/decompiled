import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.CreateOrUpdateUserCreatedPassIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.UserCreatedPassAttachmentMetadata;
import com.google.android.gms.pay.UserCreatedPassVerticalMetadata;

public final class dlck implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ProtoSafeParcelable protoSafeParcelable0 = null;
        ProtoSafeParcelable protoSafeParcelable1 = null;
        ProtoSafeParcelable protoSafeParcelable2 = null;
        Uri[] arr_uri = null;
        ProtoSafeParcelable protoSafeParcelable3 = null;
        ProtoSafeParcelable protoSafeParcelable4 = null;
        UserCreatedPassAttachmentMetadata[] arr_userCreatedPassAttachmentMetadata = null;
        UserCreatedPassVerticalMetadata userCreatedPassVerticalMetadata0 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        int v2 = 0;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 2: {
                    protoSafeParcelable1 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 3: {
                    protoSafeParcelable2 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_uri = (Uri[])baua.J(parcel0, v3, Uri.CREATOR);
                    break;
                }
                case 6: {
                    protoSafeParcelable3 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 7: {
                    protoSafeParcelable4 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    arr_userCreatedPassAttachmentMetadata = (UserCreatedPassAttachmentMetadata[])baua.J(parcel0, v3, UserCreatedPassAttachmentMetadata.CREATOR);
                    break;
                }
                case 10: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 11: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 12: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 13: {
                    userCreatedPassVerticalMetadata0 = (UserCreatedPassVerticalMetadata)baua.m(parcel0, v3, UserCreatedPassVerticalMetadata.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreateOrUpdateUserCreatedPassIntentArgs(protoSafeParcelable0, protoSafeParcelable1, protoSafeParcelable2, v1, arr_uri, protoSafeParcelable3, protoSafeParcelable4, z, arr_userCreatedPassAttachmentMetadata, z1, v2, z2, userCreatedPassVerticalMetadata0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreateOrUpdateUserCreatedPassIntentArgs[v];
    }
}

