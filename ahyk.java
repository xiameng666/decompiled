import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.phone.internal.ConsentPromptUserResponse;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.common.api.ApiMetadata;
import java.lang.ref.WeakReference;
import java.util.ListIterator;

public final class ahyk extends wby implements ahyl, cjug {
    private final Context a;
    private final cjts b;
    private final String c;
    private final String d;

    public ahyk() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverInternal");
    }

    public ahyk(Context context0, cjts cjts0, String s, String s1) {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverInternal");
        this.a = context0.getApplicationContext();
        this.b = cjts0;
        this.c = s;
        this.d = s1;
    }

    @Override  // ahyl
    public final RequestResult a(String s, VerificationToken verificationToken0, ApiMetadata apiMetadata0) {
        RequestResult requestResult0;
        if(!TextUtils.isEmpty(s)) {
            synchronized(aiam.class) {
                aian aian0 = aiam.a(this.a, s);
                WeakReference weakReference0 = aian0.d.f.a;
                if(weakReference0 == null) {
                    requestResult0 = new RequestResult();
                    requestResult0.a = 2;
                }
                else {
                    ahxq ahxq0 = (ahxq)weakReference0.get();
                    if(ahxq0 == null) {
                        requestResult0 = new RequestResult();
                        requestResult0.a = 2;
                    }
                    else {
                        ahxv ahxv0 = (ahxv)ahxq0.a.c.get(verificationToken0.b);
                        if(ahxv0 == null) {
                            requestResult0 = new RequestResult();
                            requestResult0.a = 2;
                        }
                        else {
                            gfza gfza0 = ahxv0.d;
                            Long long0 = (long)verificationToken0.a;
                            if(gfza0.u(long0)) {
                                ListIterator listIterator0 = gfza0.g(long0).listIterator();
                                while(listIterator0.hasNext()) {
                                    ahxt ahxt0 = (ahxt)listIterator0.next();
                                    if(!s.equals(ahxt0.a)) {
                                        continue;
                                    }
                                    listIterator0.remove();
                                    RequestResult requestResult1 = ahxv0.b;
                                    RequestResult requestResult2 = new RequestResult();
                                    requestResult2.a = requestResult1.a;
                                    requestResult2.b = requestResult1.b;
                                    requestResult2.c = requestResult1.c;
                                    requestResult2.d = requestResult1.d;
                                    requestResult2.d = ahxv0.a - ahxt0.b;
                                    aian0.d();
                                    return requestResult2;
                                }
                                requestResult0 = new RequestResult();
                                requestResult0.a = 3;
                            }
                            else {
                                requestResult0 = new RequestResult();
                                requestResult0.a = 2;
                            }
                        }
                    }
                }
                aian0.d();
            }
            return requestResult0;
        }
        RequestResult requestResult3 = new RequestResult();
        requestResult3.a = 0;
        return requestResult3;
    }

    @Override  // ahyl
    public final void b(SmsRetrieverEvent smsRetrieverEvent0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.H);
        azuf0.g(bbdq.t);
        azuf0.d(this.c);
        azuf0.c(this.d);
        aibg aibg0 = new aibg(smsRetrieverEvent0, azuf0.a());
        this.b.b(aibg0);
    }

    @Override  // ahyl
    public final void c(ConsentPromptUserResponse consentPromptUserResponse0, ApiMetadata apiMetadata0) {
        if(consentPromptUserResponse0 != null) {
            Class class0 = aiam.class;
            synchronized(class0) {
                aian aian0 = aiam.a(this.a, consentPromptUserResponse0.b);
                long v1 = System.currentTimeMillis();
                WeakReference weakReference0 = aian0.d.f.a;
                if(weakReference0 != null) {
                    ahxq ahxq0 = (ahxq)weakReference0.get();
                    if(ahxq0 != null) {
                        ahxv ahxv0 = ahxq0.a.c(consentPromptUserResponse0.c);
                        String s = consentPromptUserResponse0.b;
                        ahxu ahxu0 = new ahxu(v1, consentPromptUserResponse0.a);
                        ahxv0.e.put(s, ahxu0);
                        long v2 = ahxr.b();
                        ahxq0.a.f.a(ahxq0.a.d, v2);
                    }
                }
                aian0.d();
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                VerificationToken verificationToken0 = (VerificationToken)wbz.a(parcel0, VerificationToken.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahyk.gr(parcel0);
                RequestResult requestResult0 = this.a(s, verificationToken0, apiMetadata0);
                parcel1.writeNoException();
                wbz.g(parcel1, requestResult0);
                return true;
            }
            case 2: {
                ConsentPromptUserResponse consentPromptUserResponse0 = (ConsentPromptUserResponse)wbz.a(parcel0, ConsentPromptUserResponse.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahyk.gr(parcel0);
                this.c(consentPromptUserResponse0, apiMetadata1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                SmsRetrieverEvent smsRetrieverEvent0 = (SmsRetrieverEvent)wbz.a(parcel0, SmsRetrieverEvent.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ahyk.gr(parcel0);
                this.b(smsRetrieverEvent0, apiMetadata2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

