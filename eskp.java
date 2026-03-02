import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.BadgeInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.CardRewardsInfo;
import com.google.android.gms.tapandpay.firstparty.InAppCvmConfig;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.SeInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
import java.util.List;

public final class eskp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        String s2 = null;
        String s3 = null;
        TokenStatus tokenStatus0 = null;
        String s4 = null;
        Uri uri0 = null;
        IssuerInfo issuerInfo0 = null;
        String s5 = null;
        TransactionInfo transactionInfo0 = null;
        String s6 = null;
        byte[] arr_b1 = null;
        InStoreCvmConfig inStoreCvmConfig0 = null;
        InAppCvmConfig inAppCvmConfig0 = null;
        String s7 = null;
        OnlineAccountCardLinkInfo[] arr_onlineAccountCardLinkInfo = null;
        List list0 = null;
        String s8 = null;
        String s9 = null;
        CardRewardsInfo cardRewardsInfo0 = null;
        String s10 = null;
        String s11 = null;
        List list1 = null;
        SeInfo seInfo0 = null;
        String s12 = null;
        String s13 = null;
        String s14 = null;
        byte[] arr_b2 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        int v7 = 0;
        boolean z4 = false;
        int v8 = 0;
        boolean z5 = false;
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        int v12 = 0;
        long v13 = 0L;
        long v14 = 0L;
        long v15 = 0L;
        long v16 = 0L;
        long v17 = 0L;
        while(parcel0.dataPosition() < v) {
            int v18 = parcel0.readInt();
            switch(((char)v18)) {
                case 2: {
                    s = baua.s(parcel0, v18);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v18);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v18);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v18);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v18);
                    break;
                }
                case 7: {
                    tokenStatus0 = (TokenStatus)baua.m(parcel0, v18, TokenStatus.CREATOR);
                    break;
                }
                case 8: {
                    s4 = baua.s(parcel0, v18);
                    break;
                }
                case 9: {
                    uri0 = (Uri)baua.m(parcel0, v18, Uri.CREATOR);
                    break;
                }
                case 10: {
                    v2 = baua.f(parcel0, v18);
                    break;
                }
                case 11: {
                    v3 = baua.f(parcel0, v18);
                    break;
                }
                case 12: {
                    issuerInfo0 = (IssuerInfo)baua.m(parcel0, v18, IssuerInfo.CREATOR);
                    break;
                }
                case 13: {
                    s5 = baua.s(parcel0, v18);
                    break;
                }
                case 15: {
                    transactionInfo0 = (TransactionInfo)baua.m(parcel0, v18, TransactionInfo.CREATOR);
                    break;
                }
                case 16: {
                    s6 = baua.s(parcel0, v18);
                    break;
                }
                case 17: {
                    arr_b1 = baua.E(parcel0, v18);
                    break;
                }
                case 18: {
                    v4 = baua.f(parcel0, v18);
                    break;
                }
                case 20: {
                    v5 = baua.f(parcel0, v18);
                    break;
                }
                case 21: {
                    v6 = baua.f(parcel0, v18);
                    break;
                }
                case 22: {
                    inStoreCvmConfig0 = (InStoreCvmConfig)baua.m(parcel0, v18, InStoreCvmConfig.CREATOR);
                    break;
                }
                case 23: {
                    inAppCvmConfig0 = (InAppCvmConfig)baua.m(parcel0, v18, InAppCvmConfig.CREATOR);
                    break;
                }
                case 24: {
                    s7 = baua.s(parcel0, v18);
                    break;
                }
                case 25: {
                    arr_onlineAccountCardLinkInfo = (OnlineAccountCardLinkInfo[])baua.J(parcel0, v18, OnlineAccountCardLinkInfo.CREATOR);
                    break;
                }
                case 26: {
                    z = baua.D(parcel0, v18);
                    break;
                }
                case 27: {
                    list0 = baua.y(parcel0, v18, BadgeInfo.CREATOR);
                    break;
                }
                case 28: {
                    z1 = baua.D(parcel0, v18);
                    break;
                }
                case 29: {
                    z2 = baua.D(parcel0, v18);
                    break;
                }
                case 30: {
                    v13 = baua.i(parcel0, v18);
                    break;
                }
                case 0x1F: {
                    v14 = baua.i(parcel0, v18);
                    break;
                }
                case 0x20: {
                    z3 = baua.D(parcel0, v18);
                    break;
                }
                case 33: {
                    v15 = baua.i(parcel0, v18);
                    break;
                }
                case 34: {
                    s8 = baua.s(parcel0, v18);
                    break;
                }
                case 35: {
                    s9 = baua.s(parcel0, v18);
                    break;
                }
                case 36: {
                    cardRewardsInfo0 = (CardRewardsInfo)baua.m(parcel0, v18, CardRewardsInfo.CREATOR);
                    break;
                }
                case 37: {
                    v7 = baua.f(parcel0, v18);
                    break;
                }
                case 38: {
                    z4 = baua.D(parcel0, v18);
                    break;
                }
                case 39: {
                    s10 = baua.s(parcel0, v18);
                    break;
                }
                case 40: {
                    v8 = baua.f(parcel0, v18);
                    break;
                }
                case 41: {
                    z5 = baua.D(parcel0, v18);
                    break;
                }
                case 42: {
                    v16 = baua.i(parcel0, v18);
                    break;
                }
                case 43: {
                    s11 = baua.s(parcel0, v18);
                    break;
                }
                case 44: {
                    v9 = baua.f(parcel0, v18);
                    break;
                }
                case 45: {
                    s1 = baua.s(parcel0, v18);
                    break;
                }
                case 0x2F: {
                    list1 = baua.v(parcel0, v18);
                    break;
                }
                case 0x30: {
                    seInfo0 = (SeInfo)baua.m(parcel0, v18, SeInfo.CREATOR);
                    break;
                }
                case 49: {
                    s12 = baua.s(parcel0, v18);
                    break;
                }
                case 50: {
                    s13 = baua.s(parcel0, v18);
                    break;
                }
                case 51: {
                    s14 = baua.s(parcel0, v18);
                    break;
                }
                case 52: {
                    v17 = baua.i(parcel0, v18);
                    break;
                }
                case 53: {
                    v10 = baua.f(parcel0, v18);
                    break;
                }
                case 54: {
                    v11 = baua.f(parcel0, v18);
                    break;
                }
                case 55: {
                    v12 = baua.f(parcel0, v18);
                    break;
                }
                case 56: {
                    arr_b2 = baua.E(parcel0, v18);
                    break;
                }
                default: {
                    baua.C(parcel0, v18);
                }
            }
        }
        baua.A(parcel0, v);
        return new CardInfo(s, s1, arr_b, s2, s3, v1, tokenStatus0, s4, uri0, v2, v3, issuerInfo0, s5, transactionInfo0, s6, arr_b1, v4, v5, v6, inStoreCvmConfig0, inAppCvmConfig0, s7, arr_onlineAccountCardLinkInfo, z, list0, z1, z2, v13, v14, z3, v15, s8, s9, cardRewardsInfo0, v7, z4, s10, v8, z5, v16, s11, v9, list1, seInfo0, s12, s13, s14, v17, v10, v11, v12, arr_b2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CardInfo[v];
    }
}

