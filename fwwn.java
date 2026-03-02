import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.os.PowerManager;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public class fwwn {
    private static fwwn a;

    public fwus b() {
        if(!humf.c()) {
            try {
                return new fwur();
            }
            catch(NoClassDefFoundError unused_ex) {
            }
        }
        return new fwuq();
    }

    public boolean d(PowerManager powerManager0) {
        throw null;
    }

    public void e(Context context0, fwvz fwvz0, boolean z, fwyc fwyc0, fvwz fvwz0, Executor executor0) {
        throw null;
    }

    protected fvtm f(List list0, long v, Collection collection0) {
        long v1 = v;
        if(list0 != null) {
            gged_interceptors gged0 = fvtm.b;
            gged_interceptors gged1 = gged0;
            Collection collection1 = null;
            CellInfoLte cellInfoLte0 = null;
            List list1 = null;
            CellInfoCdma cellInfoCdma0 = null;
            List list2 = null;
            CellInfoGsm cellInfoGsm0 = null;
            CellInfoWcdma cellInfoWcdma0 = null;
            for(Object object0: list0) {
                CellInfo cellInfo0 = (CellInfo)object0;
                if((cellInfo0 instanceof CellInfoLte)) {
                    CellIdentityLte cellIdentityLte0 = ((CellInfoLte)cellInfo0).getCellIdentity();
                    CellIdentityLte cellIdentityLte1 = cellIdentityLte0;
                    if(cellIdentityLte0 == null || cellIdentityLte1.getPci() == 0x7FFFFFFF) {
                        continue;
                    }
                    if(((CellInfoLte)cellInfo0).isRegistered()) {
                        if(cellIdentityLte1.getCi() == 0x7FFFFFFF || cellIdentityLte1.getPci() == 0x7FFFFFFF || cellIdentityLte1.getMnc() == 0x7FFFFFFF || cellIdentityLte1.getMcc() == 0x7FFFFFFF || cellIdentityLte1.getTac() == 0x7FFFFFFF) {
                            continue;
                        }
                        cellInfoLte0 = (CellInfoLte)cellInfo0;
                    }
                    else {
                        if(gged1 == gged0) {
                            gged1 = new ArrayList(list0.size());
                        }
                        gged1.add(fwtw.b(v1, ((CellInfoLte)cellInfo0), gged0, gged0));
                    }
                }
                else if((cellInfo0 instanceof CellInfoWcdma)) {
                    if(((CellInfoWcdma)cellInfo0).isRegistered()) {
                        cellInfoWcdma0 = (CellInfoWcdma)cellInfo0;
                    }
                    else {
                        if(list1 == null) {
                            list1 = new ArrayList(list0.size());
                        }
                        list1.add(((CellInfoWcdma)cellInfo0));
                    }
                }
                else if(!(cellInfo0 instanceof CellInfoGsm)) {
                    if(!(cellInfo0 instanceof CellInfoCdma)) {
                        continue;
                    }
                    if(((CellInfoCdma)cellInfo0).isRegistered()) {
                        cellInfoCdma0 = (CellInfoCdma)cellInfo0;
                    }
                    else {
                        if(list2 == null) {
                            list2 = new ArrayList(list0.size());
                        }
                        list2.add(((CellInfoCdma)cellInfo0));
                    }
                }
                else if(((CellInfoGsm)cellInfo0).isRegistered()) {
                    cellInfoGsm0 = (CellInfoGsm)cellInfo0;
                }
                else {
                    if(collection1 == null) {
                        collection1 = new ArrayList(list0.size());
                    }
                    ((List)collection1).add(((CellInfoGsm)cellInfo0));
                }
            }
            if(cellInfoGsm0 != null) {
                CellIdentityGsm cellIdentityGsm0 = cellInfoGsm0.getCellIdentity();
                ggdy ggdy0 = new ggdy();
                ggdy0.k(collection0);
                if(collection1 != null && !collection1.isEmpty()) {
                    for(Object object1: collection1) {
                        CellInfoGsm cellInfoGsm1 = (CellInfoGsm)object1;
                        int v2 = cellInfoGsm1.getCellIdentity().getCid();
                        if(v2 != -1 && v2 != 0x7FFFFFFF) {
                            ggdy0.i(new fvts(cellInfoGsm1.getTimestampMillis(), v1, 1, v2, cellIdentityGsm0.getMcc(), cellIdentityGsm0.getMnc(), cellIdentityGsm0.getLac(), fwtv.a(cellIdentityGsm0), 0x7FFFFFFF, cellInfoGsm1.getCellSignalStrength().getDbm(), gged0));
                            v1 = v;
                            ggdy0 = ggdy0;
                            cellInfoGsm0 = cellInfoGsm0;
                            cellIdentityGsm0 = cellIdentityGsm0;
                        }
                        else {
                            v1 = v;
                        }
                    }
                }
                return new fvts(cellInfoGsm0.getTimestampMillis(), v, 1, cellIdentityGsm0.getCid(), cellIdentityGsm0.getMcc(), cellIdentityGsm0.getMnc(), cellIdentityGsm0.getLac(), fwtv.a(cellIdentityGsm0), 0x7FFFFFFF, cellInfoGsm0.getCellSignalStrength().getDbm(), ggdy0.h());
            }
            if(cellInfoWcdma0 != null) {
                CellIdentityWcdma cellIdentityWcdma0 = cellInfoWcdma0.getCellIdentity();
                ggdy ggdy1 = new ggdy();
                ggdy1.k(collection0);
                if(list1 != null && !list1.isEmpty()) {
                    for(Object object2: list1) {
                        CellInfoWcdma cellInfoWcdma1 = (CellInfoWcdma)object2;
                        int v3 = cellInfoWcdma1.getCellIdentity().getPsc();
                        if(v3 != -1 && v3 != 0x7FFFFFFF) {
                            ggdy1.i(new fvts(cellInfoWcdma1.getTimestampMillis(), v, 3, cellIdentityWcdma0.getCid(), cellIdentityWcdma0.getMcc(), cellIdentityWcdma0.getMnc(), cellIdentityWcdma0.getLac(), v3, fwtv.b(cellIdentityWcdma0), cellInfoWcdma1.getCellSignalStrength().getDbm(), gged0));
                            ggdy1 = ggdy1;
                        }
                    }
                }
                return new fvts(cellInfoWcdma0.getTimestampMillis(), v, 3, cellIdentityWcdma0.getCid(), cellIdentityWcdma0.getMcc(), cellIdentityWcdma0.getMnc(), cellIdentityWcdma0.getLac(), cellIdentityWcdma0.getPsc(), fwtv.b(cellIdentityWcdma0), cellInfoWcdma0.getCellSignalStrength().getDbm(), ggdy1.h());
            }
            if(cellInfoLte0 != null) {
                return fwtw.b(v, cellInfoLte0, gged1, collection0);
            }
            if(cellInfoCdma0 != null) {
                ggdy ggdy2 = new ggdy();
                ggdy2.k(collection0);
                if(list2 != null && !list2.isEmpty()) {
                    for(Object object3: list2) {
                        ggdy2.i(fwtw.a(v, ((CellInfoCdma)object3), gged0));
                    }
                }
                return fwtw.a(v, cellInfoCdma0, ggdy2.h());
            }
        }
        return null;
    }

    public fwvy g(ScanResult scanResult0) {
        throw null;
    }

    public static fwwn h() {
        fwwn fwwn1;
        synchronized(fwwn.class) {
            fwwn fwwn0 = fwwn.a;
            if(fwwn0 != null) {
                return fwwn0;
            }
            fwwn1 = new fwwm();
            fwwn.a = fwwn1;
        }
        return fwwn1;
    }

    public static final fwxv i(BluetoothDevice bluetoothDevice0) {
        return bluetoothDevice0 == null ? null : new fwxv(bluetoothDevice0);
    }
}

