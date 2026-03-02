package com.google.android.gms.auth.account.accounttransfer;

import a;
import adhf;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbgi;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccountBootstrapPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public ArrayList b;
    public ArrayList c;
    public ExchangeAssertionsForUserCredentialsRequest d;
    public ArrayList e;
    public ExchangeSessionCheckpointsForUserCredentialsRequest f;
    private static final HashMap g;

    static {
        AccountBootstrapPayload.CREATOR = new adhf();
        HashMap hashMap0 = new HashMap();
        AccountBootstrapPayload.g = hashMap0;
        hashMap0.put("userBootstrapInfos", new FastJsonResponse.Field(11, true, 11, true, "userBootstrapInfos", 2, UserBootstrapInfo.class));
        hashMap0.put("challenges", new FastJsonResponse.Field(11, true, 11, true, "challenges", 3, Challenge.class));
        hashMap0.put("exchangeAssertionsForUserCredentialsRequest", new FastJsonResponse.Field(11, false, 11, false, "exchangeAssertionsForUserCredentialsRequest", 4, ExchangeAssertionsForUserCredentialsRequest.class));
        hashMap0.put("userCredentials", new FastJsonResponse.Field(11, true, 11, true, "userCredentials", 5, UserCredential.class));
        hashMap0.put("exchangeSessionCheckpointsForUserCredentialsRequest", new FastJsonResponse.Field(11, false, 11, false, "exchangeSessionCheckpointsForUserCredentialsRequest", 6, ExchangeSessionCheckpointsForUserCredentialsRequest.class));
    }

    public AccountBootstrapPayload() {
        this.a = new HashSet();
    }

    public AccountBootstrapPayload(Set set0, ArrayList arrayList0, ArrayList arrayList1, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0, ArrayList arrayList2, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0) {
        this.a = set0;
        this.b = arrayList0;
        this.c = arrayList1;
        this.d = exchangeAssertionsForUserCredentialsRequest0;
        this.e = arrayList2;
        this.f = exchangeSessionCheckpointsForUserCredentialsRequest0;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                return this.b;
            }
            case 3: {
                return this.c;
            }
            case 4: {
                return this.d;
            }
            case 5: {
                return this.e;
            }
            case 6: {
                return this.f;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    @Override  // bbgi
    public final Map b() {
        return AccountBootstrapPayload.g;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    public final void gE(FastJsonResponse.Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 2: {
                this.b = arrayList0;
                break;
            }
            case 3: {
                this.c = arrayList0;
                break;
            }
            case 5: {
                this.e = arrayList0;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.av(v, arrayList0, " is not a known array of custom type.  Found "));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 4: {
                this.d = (ExchangeAssertionsForUserCredentialsRequest)bbgi0;
                break;
            }
            case 6: {
                this.f = (ExchangeSessionCheckpointsForUserCredentialsRequest)bbgi0;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", v, bbgi0.getClass().getCanonicalName()));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(2))) {
            baub.y(parcel0, 2, this.b, true);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.y(parcel0, 3, this.c, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.t(parcel0, 4, this.d, v, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.y(parcel0, 5, this.e, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.t(parcel0, 6, this.f, v, true);
        }
        baub.c(parcel0, v1);
    }
}

