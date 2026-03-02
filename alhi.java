import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.ExternalDeviceInfoEntity;
import java.util.ArrayList;
import java.util.HashSet;

public final class alhi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        String s = null;
        ArrayList arrayList0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        ArrayList arrayList1 = null;
        long v1 = 0L;
        boolean z4 = false;
        ArrayList arrayList2 = null;
        String s4 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    boolean z5 = baua.D(parcel0, v2);
                    hashSet0.add(Integer.valueOf(2));
                    z4 = z5;
                    break;
                }
                case 3: {
                    ArrayList arrayList3 = baua.y(parcel0, v2, BeaconSeedEntity.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    arrayList2 = arrayList3;
                    break;
                }
                case 4: {
                    String s5 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(4));
                    s4 = s5;
                    break;
                }
                case 5: {
                    String s6 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(5));
                    s = s6;
                    break;
                }
                case 6: {
                    ArrayList arrayList4 = baua.x(parcel0, v2);
                    hashSet0.add(Integer.valueOf(6));
                    arrayList0 = arrayList4;
                    break;
                }
                case 7: {
                    String s7 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(7));
                    s1 = s7;
                    break;
                }
                case 8: {
                    v1 = baua.i(parcel0, v2);
                    hashSet0.add(Integer.valueOf(8));
                    break;
                }
                case 9: {
                    boolean z6 = baua.D(parcel0, v2);
                    hashSet0.add(Integer.valueOf(9));
                    z = z6;
                    break;
                }
                case 10: {
                    String s8 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(10));
                    s2 = s8;
                    break;
                }
                case 11: {
                    boolean z7 = baua.D(parcel0, v2);
                    hashSet0.add(Integer.valueOf(11));
                    z1 = z7;
                    break;
                }
                case 12: {
                    String s9 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(12));
                    s3 = s9;
                    break;
                }
                case 13: {
                    ArrayList arrayList5 = baua.x(parcel0, v2);
                    hashSet0.add(Integer.valueOf(13));
                    arrayList1 = arrayList5;
                    break;
                }
                case 14: {
                    boolean z8 = baua.D(parcel0, v2);
                    hashSet0.add(Integer.valueOf(14));
                    z2 = z8;
                    break;
                }
                case 15: {
                    boolean z9 = baua.D(parcel0, v2);
                    hashSet0.add(Integer.valueOf(15));
                    z3 = z9;
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new ExternalDeviceInfoEntity(hashSet0, z4, arrayList2, s4, s, arrayList0, s1, v1, z, s2, z1, s3, arrayList1, z2, z3);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExternalDeviceInfoEntity[v];
    }
}

