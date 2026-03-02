import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

public final class ajon implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ArrayList arrayList0 = new ArrayList();
        Bundle bundle0 = new Bundle();
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int v2 = 0;
        boolean z5 = false;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        CaptchaChallenge captchaChallenge0 = null;
        String s8 = null;
        String s9 = null;
        PostSignInData postSignInData0 = null;
        Account account0 = null;
        String s10 = null;
        TokenData tokenData0 = null;
        String s11 = null;
        ResolutionData resolutionData0 = null;
        AuthzenBeginTxData authzenBeginTxData0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    s5 = baua.s(parcel0, v3);
                    break;
                }
                case 8: {
                    s6 = baua.s(parcel0, v3);
                    break;
                }
                case 9: {
                    s7 = baua.s(parcel0, v3);
                    break;
                }
                case 10: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 11: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 12: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 13: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                case 14: {
                    captchaChallenge0 = (CaptchaChallenge)baua.m(parcel0, v3, CaptchaChallenge.CREATOR);
                    break;
                }
                case 15: {
                    arrayList0 = baua.y(parcel0, v3, ScopeDetail.CREATOR);
                    break;
                }
                case 16: {
                    s8 = baua.s(parcel0, v3);
                    break;
                }
                case 17: {
                    s9 = baua.s(parcel0, v3);
                    break;
                }
                case 19: {
                    z4 = baua.D(parcel0, v3);
                    break;
                }
                case 20: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 21: {
                    postSignInData0 = (PostSignInData)baua.m(parcel0, v3, PostSignInData.CREATOR);
                    break;
                }
                case 22: {
                    account0 = (Account)baua.m(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 26: {
                    s10 = baua.s(parcel0, v3);
                    break;
                }
                case 27: {
                    tokenData0 = (TokenData)baua.m(parcel0, v3, TokenData.CREATOR);
                    break;
                }
                case 28: {
                    bundle0 = baua.j(parcel0, v3);
                    break;
                }
                case 29: {
                    s11 = baua.s(parcel0, v3);
                    break;
                }
                case 30: {
                    resolutionData0 = (ResolutionData)baua.m(parcel0, v3, ResolutionData.CREATOR);
                    break;
                }
                case 0x1F: {
                    authzenBeginTxData0 = (AuthzenBeginTxData)baua.m(parcel0, v3, AuthzenBeginTxData.CREATOR);
                    break;
                }
                case 0x20: {
                    z5 = baua.D(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new TokenResponse(v1, s, s1, s2, s3, s4, s5, s6, s7, z, z1, z2, z3, captchaChallenge0, arrayList0, s8, s9, z4, v2, postSignInData0, account0, s10, tokenData0, bundle0, s11, resolutionData0, authzenBeginTxData0, z5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TokenResponse[v];
    }
}

