import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;

public final class fhol implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        CellSignalStrength cellSignalStrength0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fhqd.a).v_newBuilder();
        boolean z = ((CellInfo)object0).isRegistered();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fhqd fhqd0 = (fhqd)hftp0.b_message;
        fhqd0.b |= 2;
        fhqd0.d = z;
        if((((CellInfo)object0) instanceof CellInfoLte)) {
            cellSignalStrength0 = ((CellInfoLte)(((CellInfo)object0))).getCellSignalStrength();
        }
        else if((((CellInfo)object0) instanceof CellInfoGsm)) {
            cellSignalStrength0 = ((CellInfoGsm)(((CellInfo)object0))).getCellSignalStrength();
        }
        else if((((CellInfo)object0) instanceof CellInfoCdma)) {
            cellSignalStrength0 = ((CellInfoCdma)(((CellInfo)object0))).getCellSignalStrength();
        }
        else if((((CellInfo)object0) instanceof CellInfoNr)) {
            cellSignalStrength0 = ((CellInfoNr)(((CellInfo)object0))).getCellSignalStrength();
        }
        else if((((CellInfo)object0) instanceof CellInfoWcdma)) {
            cellSignalStrength0 = ((CellInfoWcdma)(((CellInfo)object0))).getCellSignalStrength();
        }
        else if((((CellInfo)object0) instanceof CellInfoTdscdma)) {
            cellSignalStrength0 = ((CellInfoTdscdma)(((CellInfo)object0))).getCellSignalStrength();
        }
        else {
            cellSignalStrength0 = null;
        }
        if(cellSignalStrength0 != null) {
            long v = (long)cellSignalStrength0.getDbm();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd1 = (fhqd)hftp0.b_message;
            fhqd1.b |= 1;
            fhqd1.c = v;
            long v1 = (long)cellSignalStrength0.getLevel();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd2 = (fhqd)hftp0.b_message;
            fhqd2.b |= 4;
            fhqd2.e = v1;
        }
        if((((CellInfo)object0) instanceof CellInfoGsm)) {
            long v2 = (long)((CellInfoGsm)(((CellInfo)object0))).getCellIdentity().getCid();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((fhqd)hftv0).b |= 8;
            ((fhqd)hftv0).f = v2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd3 = (fhqd)hftp0.b_message;
            fhqd3.b |= 16;
            fhqd3.g = "gsm";
            return (fhqd)hftp0.N_build();
        }
        if((((CellInfo)object0) instanceof CellInfoLte)) {
            long v3 = (long)((CellInfoLte)(((CellInfo)object0))).getCellIdentity().getCi();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((fhqd)hftv1).b |= 8;
            ((fhqd)hftv1).f = v3;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd4 = (fhqd)hftp0.b_message;
            fhqd4.b |= 16;
            fhqd4.g = "lte";
            return (fhqd)hftp0.N_build();
        }
        if((((CellInfo)object0) instanceof CellInfoCdma)) {
            CellIdentityCdma cellIdentityCdma0 = ((CellInfoCdma)(((CellInfo)object0))).getCellIdentity();
            int v4 = cellIdentityCdma0.getLatitude();
            int v5 = cellIdentityCdma0.getLongitude() ^ v4;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((fhqd)hftv2).b |= 8;
            ((fhqd)hftv2).f = (long)v5;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd5 = (fhqd)hftp0.b_message;
            fhqd5.b |= 16;
            fhqd5.g = "cdma";
            return (fhqd)hftp0.N_build();
        }
        if((((CellInfo)object0) instanceof CellInfoNr)) {
            long v6 = ((CellIdentityNr)((CellInfoNr)(((CellInfo)object0))).getCellIdentity()).getNci();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((fhqd)hftv3).b |= 8;
            ((fhqd)hftv3).f = v6;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd6 = (fhqd)hftp0.b_message;
            fhqd6.b |= 16;
            fhqd6.g = "nr";
            return (fhqd)hftp0.N_build();
        }
        if((((CellInfo)object0) instanceof CellInfoTdscdma)) {
            long v7 = (long)((CellInfoTdscdma)(((CellInfo)object0))).getCellIdentity().getCid();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp0.b_message;
            ((fhqd)hftv4).b |= 8;
            ((fhqd)hftv4).f = v7;
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd7 = (fhqd)hftp0.b_message;
            fhqd7.b |= 16;
            fhqd7.g = "tdscdma";
            return (fhqd)hftp0.N_build();
        }
        if((((CellInfo)object0) instanceof CellInfoWcdma)) {
            long v8 = (long)((CellInfoWcdma)(((CellInfo)object0))).getCellIdentity().getCid();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp0.b_message;
            ((fhqd)hftv5).b |= 8;
            ((fhqd)hftv5).f = v8;
            if(!hftv5.isImmutable()) {
                hftp0.ensureMutable();
            }
            fhqd fhqd8 = (fhqd)hftp0.b_message;
            fhqd8.b |= 16;
            fhqd8.g = "wcdma";
        }
        return (fhqd)hftp0.N_build();
    }
}

