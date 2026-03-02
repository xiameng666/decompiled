import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.BlockstorePayload;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.FolsomDataPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.d2d.data.StartServicePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakePayload;
import java.util.ArrayList;
import java.util.HashSet;

public final class eqha implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        BootstrapOptions bootstrapOptions0 = null;
        BootstrapConfigurations bootstrapConfigurations0 = null;
        DisplayText displayText0 = null;
        AccountBootstrapPayload accountBootstrapPayload0 = null;
        ProgressEvent progressEvent0 = null;
        ArrayList arrayList0 = null;
        AccountTransferPayload accountTransferPayload0 = null;
        DeviceStatus deviceStatus0 = null;
        WorkProfilePayload workProfilePayload0 = null;
        ArrayList arrayList1 = null;
        BlockstorePayload blockstorePayload0 = null;
        SecondDeviceAuthPayload secondDeviceAuthPayload0 = null;
        ArrayList arrayList2 = null;
        byte[] arr_b = null;
        StartServicePayload startServicePayload0 = null;
        QuickStartHandshakePayload quickStartHandshakePayload0 = null;
        PostTransferAction postTransferAction0 = null;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    v1 = baua.f(parcel0, v4);
                    hashSet0.add(Integer.valueOf(1));
                    break;
                }
                case 2: {
                    v3 = baua.f(parcel0, v4);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    bootstrapOptions0 = (BootstrapOptions)baua.m(parcel0, v4, BootstrapOptions.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    v1 = v1;
                    break;
                }
                case 4: {
                    bootstrapConfigurations0 = (BootstrapConfigurations)baua.m(parcel0, v4, BootstrapConfigurations.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    v1 = v1;
                    break;
                }
                case 5: {
                    displayText0 = (DisplayText)baua.m(parcel0, v4, DisplayText.CREATOR);
                    hashSet0.add(Integer.valueOf(5));
                    v1 = v1;
                    break;
                }
                case 6: {
                    accountBootstrapPayload0 = (AccountBootstrapPayload)baua.m(parcel0, v4, AccountBootstrapPayload.CREATOR);
                    hashSet0.add(Integer.valueOf(6));
                    v1 = v1;
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v4);
                    hashSet0.add(Integer.valueOf(7));
                    break;
                }
                case 8: {
                    progressEvent0 = (ProgressEvent)baua.m(parcel0, v4, ProgressEvent.CREATOR);
                    hashSet0.add(Integer.valueOf(8));
                    v1 = v1;
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v4);
                    hashSet0.add(Integer.valueOf(9));
                    break;
                }
                case 10: {
                    arrayList0 = baua.y(parcel0, v4, AccountTransferResult.CREATOR);
                    hashSet0.add(Integer.valueOf(10));
                    v1 = v1;
                    break;
                }
                case 11: {
                    accountTransferPayload0 = (AccountTransferPayload)baua.m(parcel0, v4, AccountTransferPayload.CREATOR);
                    hashSet0.add(Integer.valueOf(11));
                    v1 = v1;
                    break;
                }
                case 12: {
                    deviceStatus0 = (DeviceStatus)baua.m(parcel0, v4, DeviceStatus.CREATOR);
                    hashSet0.add(Integer.valueOf(12));
                    v1 = v1;
                    break;
                }
                case 13: {
                    workProfilePayload0 = (WorkProfilePayload)baua.m(parcel0, v4, WorkProfilePayload.CREATOR);
                    hashSet0.add(Integer.valueOf(13));
                    v1 = v1;
                    break;
                }
                case 14: {
                    arrayList1 = baua.y(parcel0, v4, EsimActivationPayload.CREATOR);
                    hashSet0.add(Integer.valueOf(14));
                    v1 = v1;
                    break;
                }
                case 15: {
                    blockstorePayload0 = (BlockstorePayload)baua.m(parcel0, v4, BlockstorePayload.CREATOR);
                    hashSet0.add(Integer.valueOf(15));
                    v1 = v1;
                    break;
                }
                case 16: {
                    secondDeviceAuthPayload0 = (SecondDeviceAuthPayload)baua.m(parcel0, v4, SecondDeviceAuthPayload.CREATOR);
                    hashSet0.add(Integer.valueOf(16));
                    v1 = v1;
                    break;
                }
                case 17: {
                    arrayList2 = baua.y(parcel0, v4, FolsomDataPayload.CREATOR);
                    hashSet0.add(Integer.valueOf(17));
                    v1 = v1;
                    break;
                }
                case 18: {
                    arr_b = baua.E(parcel0, v4);
                    hashSet0.add(Integer.valueOf(18));
                    break;
                }
                case 19: {
                    startServicePayload0 = (StartServicePayload)baua.m(parcel0, v4, StartServicePayload.CREATOR);
                    hashSet0.add(Integer.valueOf(19));
                    v1 = v1;
                    break;
                }
                case 20: {
                    quickStartHandshakePayload0 = (QuickStartHandshakePayload)baua.m(parcel0, v4, QuickStartHandshakePayload.CREATOR);
                    hashSet0.add(Integer.valueOf(20));
                    v1 = v1;
                    break;
                }
                case 21: {
                    postTransferAction0 = (PostTransferAction)baua.m(parcel0, v4, PostTransferAction.CREATOR);
                    hashSet0.add(Integer.valueOf(21));
                    v1 = v1;
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new MessagePayload(hashSet0, v1, v2, v3, bootstrapOptions0, bootstrapConfigurations0, displayText0, accountBootstrapPayload0, progressEvent0, z, arrayList0, accountTransferPayload0, deviceStatus0, workProfilePayload0, arrayList1, blockstorePayload0, secondDeviceAuthPayload0, arrayList2, arr_b, startServicePayload0, quickStartHandshakePayload0, postTransferAction0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MessagePayload[v];
    }
}

