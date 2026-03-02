import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

public final class abwi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        int v1 = 0;
        String s = null;
        Uri uri0 = null;
        RegisterSectionInfo[] arr_registerSectionInfo = null;
        GlobalSearchCorpusConfig globalSearchCorpusConfig0 = null;
        Account account0 = null;
        RegisterCorpusIMEInfo registerCorpusIMEInfo0 = null;
        String s1 = null;
        boolean z1 = true;
        String s2 = "0";
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    uri0 = (Uri)baua.m(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 4: {
                    arr_registerSectionInfo = (RegisterSectionInfo[])baua.J(parcel0, v2, RegisterSectionInfo.CREATOR);
                    break;
                }
                case 7: {
                    globalSearchCorpusConfig0 = (GlobalSearchCorpusConfig)baua.m(parcel0, v2, GlobalSearchCorpusConfig.CREATOR);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 9: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 10: {
                    registerCorpusIMEInfo0 = (RegisterCorpusIMEInfo)baua.m(parcel0, v2, RegisterCorpusIMEInfo.CREATOR);
                    break;
                }
                case 11: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 12: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 13: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new RegisterCorpusInfo(s, s2, uri0, arr_registerSectionInfo, globalSearchCorpusConfig0, z1, account0, registerCorpusIMEInfo0, s1, z, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RegisterCorpusInfo[v];
    }
}

