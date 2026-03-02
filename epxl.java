import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.CompanionApp;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import java.util.ArrayList;
import java.util.HashSet;

public final class epxl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        ArrayList arrayList0 = null;
        String s = null;
        CompanionApp companionApp0 = null;
        PostTransferAction postTransferAction0 = null;
        byte[] arr_b = null;
        EsimActivationInfo esimActivationInfo0 = null;
        AdvertisementOptions advertisementOptions0 = null;
        String s1 = null;
        ArrayList arrayList1 = null;
        String s2 = null;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        int v4 = 0;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        boolean z5 = false;
        int v8 = 0;
        long v9 = 0L;
        long v10 = 0L;
        long v11 = 0L;
        int v12 = 0;
        boolean z6 = false;
        while(parcel0.dataPosition() < v) {
            int v13 = parcel0.readInt();
            switch(((char)v13)) {
                case 2: {
                    int v14 = baua.f(parcel0, v13);
                    hashSet0.add(Integer.valueOf(2));
                    v1 = v14;
                    break;
                }
                case 3: {
                    int v15 = baua.f(parcel0, v13);
                    hashSet0.add(Integer.valueOf(3));
                    v1 = v1;
                    v12 = v15;
                    break;
                }
                case 4: {
                    boolean z7 = baua.D(parcel0, v13);
                    hashSet0.add(Integer.valueOf(4));
                    v1 = v1;
                    z6 = z7;
                    break;
                }
                case 5: {
                    ArrayList arrayList2 = baua.x(parcel0, v13);
                    hashSet0.add(Integer.valueOf(5));
                    v1 = v1;
                    arrayList0 = arrayList2;
                    break;
                }
                case 6: {
                    int v16 = baua.a(parcel0, v13);
                    hashSet0.add(Integer.valueOf(6));
                    v1 = v1;
                    v2 = v16;
                    break;
                }
                case 7: {
                    String s3 = baua.s(parcel0, v13);
                    hashSet0.add(Integer.valueOf(7));
                    v1 = v1;
                    s = s3;
                    break;
                }
                case 8: {
                    CompanionApp companionApp1 = (CompanionApp)baua.m(parcel0, v13, CompanionApp.CREATOR);
                    hashSet0.add(Integer.valueOf(8));
                    v1 = v1;
                    companionApp0 = companionApp1;
                    break;
                }
                case 9: {
                    boolean z8 = baua.D(parcel0, v13);
                    hashSet0.add(Integer.valueOf(9));
                    v1 = v1;
                    z = z8;
                    break;
                }
                case 10: {
                    int v17 = baua.f(parcel0, v13);
                    hashSet0.add(Integer.valueOf(10));
                    v1 = v1;
                    v3 = v17;
                    break;
                }
                case 11: {
                    int v18 = baua.f(parcel0, v13);
                    hashSet0.add(Integer.valueOf(11));
                    v1 = v1;
                    v4 = v18;
                    break;
                }
                case 12: {
                    v9 = baua.i(parcel0, v13);
                    hashSet0.add(Integer.valueOf(12));
                    break;
                }
                case 13: {
                    boolean z9 = baua.D(parcel0, v13);
                    hashSet0.add(Integer.valueOf(13));
                    v1 = v1;
                    z1 = z9;
                    break;
                }
                case 14: {
                    boolean z10 = baua.D(parcel0, v13);
                    hashSet0.add(Integer.valueOf(14));
                    v1 = v1;
                    z2 = z10;
                    break;
                }
                case 15: {
                    boolean z11 = baua.D(parcel0, v13);
                    hashSet0.add(Integer.valueOf(15));
                    v1 = v1;
                    z3 = z11;
                    break;
                }
                case 16: {
                    boolean z12 = baua.D(parcel0, v13);
                    hashSet0.add(Integer.valueOf(16));
                    v1 = v1;
                    z4 = z12;
                    break;
                }
                case 17: {
                    int v19 = baua.f(parcel0, v13);
                    hashSet0.add(Integer.valueOf(17));
                    v1 = v1;
                    v5 = v19;
                    break;
                }
                case 18: {
                    v10 = baua.i(parcel0, v13);
                    hashSet0.add(Integer.valueOf(18));
                    break;
                }
                case 19: {
                    int v20 = baua.f(parcel0, v13);
                    hashSet0.add(Integer.valueOf(19));
                    v1 = v1;
                    v6 = v20;
                    break;
                }
                case 20: {
                    v11 = baua.i(parcel0, v13);
                    hashSet0.add(Integer.valueOf(20));
                    break;
                }
                case 21: {
                    PostTransferAction postTransferAction1 = (PostTransferAction)baua.m(parcel0, v13, PostTransferAction.CREATOR);
                    hashSet0.add(Integer.valueOf(21));
                    v1 = v1;
                    postTransferAction0 = postTransferAction1;
                    break;
                }
                case 22: {
                    byte[] arr_b1 = baua.E(parcel0, v13);
                    hashSet0.add(Integer.valueOf(22));
                    v1 = v1;
                    arr_b = arr_b1;
                    break;
                }
                case 23: {
                    EsimActivationInfo esimActivationInfo1 = (EsimActivationInfo)baua.m(parcel0, v13, EsimActivationInfo.CREATOR);
                    hashSet0.add(Integer.valueOf(23));
                    v1 = v1;
                    esimActivationInfo0 = esimActivationInfo1;
                    break;
                }
                case 24: {
                    AdvertisementOptions advertisementOptions1 = (AdvertisementOptions)baua.m(parcel0, v13, AdvertisementOptions.CREATOR);
                    hashSet0.add(Integer.valueOf(24));
                    v1 = v1;
                    advertisementOptions0 = advertisementOptions1;
                    break;
                }
                case 25: {
                    int v21 = baua.f(parcel0, v13);
                    hashSet0.add(Integer.valueOf(25));
                    v1 = v1;
                    v7 = v21;
                    break;
                }
                case 26: {
                    boolean z13 = baua.D(parcel0, v13);
                    hashSet0.add(Integer.valueOf(26));
                    v1 = v1;
                    z5 = z13;
                    break;
                }
                case 27: {
                    String s4 = baua.s(parcel0, v13);
                    hashSet0.add(Integer.valueOf(27));
                    v1 = v1;
                    s1 = s4;
                    break;
                }
                case 28: {
                    int v22 = baua.a(parcel0, v13);
                    hashSet0.add(Integer.valueOf(28));
                    v1 = v1;
                    v8 = v22;
                    break;
                }
                case 29: {
                    ArrayList arrayList3 = baua.y(parcel0, v13, BootstrapAccount.CREATOR);
                    hashSet0.add(Integer.valueOf(29));
                    v1 = v1;
                    arrayList1 = arrayList3;
                    break;
                }
                case 30: {
                    String s5 = baua.s(parcel0, v13);
                    hashSet0.add(Integer.valueOf(30));
                    s2 = s5;
                    break;
                }
                default: {
                    baua.C(parcel0, v13);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new BootstrapOptions(hashSet0, v1, v12, z6, arrayList0, ((byte)v2), s, companionApp0, z, v3, v4, v9, z1, z2, z3, z4, v5, v10, v6, v11, postTransferAction0, arr_b, esimActivationInfo0, advertisementOptions0, v7, z5, s1, ((byte)v8), arrayList1, s2);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BootstrapOptions[v];
    }
}

