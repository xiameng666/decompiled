import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.ActionTile;
import com.google.android.gms.mobiledataplan.CellularInfo;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import java.util.List;

public final class crve implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        MdpDataPlanStatus[] arr_mdpDataPlanStatus = null;
        Bundle bundle0 = null;
        String s1 = null;
        WalletBalanceInfo walletBalanceInfo0 = null;
        Integer integer0 = null;
        Long long0 = null;
        Long long1 = null;
        CellularInfo[] arr_cellularInfo = null;
        String s2 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_mdpDataPlanStatus = (MdpDataPlanStatus[])baua.J(parcel0, v1, MdpDataPlanStatus.CREATOR);
                    break;
                }
                case 3: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    walletBalanceInfo0 = (WalletBalanceInfo)baua.m(parcel0, v1, WalletBalanceInfo.CREATOR);
                    break;
                }
                case 6: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 7: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 8: {
                    long1 = baua.r(parcel0, v1);
                    break;
                }
                case 9: {
                    arr_cellularInfo = (CellularInfo[])baua.J(parcel0, v1, CellularInfo.CREATOR);
                    break;
                }
                case 10: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 11: {
                    list0 = baua.y(parcel0, v1, ActionTile.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdpDataPlanStatusResponse(s, arr_mdpDataPlanStatus, bundle0, s1, walletBalanceInfo0, integer0, long0, long1, arr_cellularInfo, s2, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdpDataPlanStatusResponse[v];
    }
}

