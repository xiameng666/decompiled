import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.DataPlanUsageHistory;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.QoeMetrics;
import java.util.List;

public final class crva implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        long v4 = 0L;
        long v5 = 0L;
        long v6 = 0L;
        long v7 = 0L;
        long v8 = 0L;
        long v9 = 0L;
        int v10 = 0;
        int v11 = 0;
        boolean z = false;
        int v12 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        MdpFlexTimeWindow[] arr_mdpFlexTimeWindow = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        List list0 = null;
        String s7 = null;
        String s8 = null;
        QoeMetrics qoeMetrics0 = null;
        DataPlanUsageHistory dataPlanUsageHistory0 = null;
        while(parcel0.dataPosition() < v) {
            int v13 = parcel0.readInt();
            switch(((char)v13)) {
                case 1: {
                    s = baua.s(parcel0, v13);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v13);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v13);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v13);
                    break;
                }
                case 5: {
                    v2 = baua.i(parcel0, v13);
                    break;
                }
                case 6: {
                    arr_mdpFlexTimeWindow = (MdpFlexTimeWindow[])baua.J(parcel0, v13, MdpFlexTimeWindow.CREATOR);
                    break;
                }
                case 7: {
                    v10 = baua.f(parcel0, v13);
                    break;
                }
                case 8: {
                    s3 = baua.s(parcel0, v13);
                    break;
                }
                case 9: {
                    s4 = baua.s(parcel0, v13);
                    break;
                }
                case 10: {
                    s5 = baua.s(parcel0, v13);
                    break;
                }
                case 11: {
                    s6 = baua.s(parcel0, v13);
                    break;
                }
                case 12: {
                    v11 = baua.f(parcel0, v13);
                    break;
                }
                case 13: {
                    list0 = baua.v(parcel0, v13);
                    break;
                }
                case 20: {
                    v3 = baua.i(parcel0, v13);
                    break;
                }
                case 21: {
                    v4 = baua.i(parcel0, v13);
                    break;
                }
                case 22: {
                    v5 = baua.i(parcel0, v13);
                    break;
                }
                case 23: {
                    s7 = baua.s(parcel0, v13);
                    break;
                }
                case 24: {
                    s8 = baua.s(parcel0, v13);
                    break;
                }
                case 25: {
                    z = baua.D(parcel0, v13);
                    break;
                }
                case 26: {
                    qoeMetrics0 = (QoeMetrics)baua.m(parcel0, v13, QoeMetrics.CREATOR);
                    break;
                }
                case 27: {
                    dataPlanUsageHistory0 = (DataPlanUsageHistory)baua.m(parcel0, v13, DataPlanUsageHistory.CREATOR);
                    break;
                }
                case 28: {
                    v12 = baua.f(parcel0, v13);
                    break;
                }
                case 29: {
                    v6 = baua.i(parcel0, v13);
                    break;
                }
                case 30: {
                    v7 = baua.i(parcel0, v13);
                    break;
                }
                case 0x1F: {
                    v8 = baua.i(parcel0, v13);
                    break;
                }
                case 0x20: {
                    v9 = baua.i(parcel0, v13);
                    break;
                }
                default: {
                    baua.C(parcel0, v13);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdpDataPlanStatus(s, s1, s2, v1, v2, arr_mdpFlexTimeWindow, v10, s3, s4, s5, s6, v11, list0, v3, v4, v5, s7, s8, z, qoeMetrics0, dataPlanUsageHistory0, v12, v6, v7, v8, v9);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdpDataPlanStatus[v];
    }
}

