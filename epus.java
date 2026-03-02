import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class epus extends bxoi {
    public static final int a;
    private final epvc b;
    private final String c;
    private final RecordConsentByConsentResultRequest d;
    private final epub f;
    private final epvg g;

    public epus(epvc epvc0, String s, RecordConsentByConsentResultRequest recordConsentByConsentResultRequest0, epub epub0) {
        super(44, "RecordConsentByConsentResult");
        this.b = epvc0;
        this.c = s;
        this.d = recordConsentByConsentResultRequest0;
        this.f = epub0;
        this.g = epvg.a;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ajnv ajnv0 = new ajnv(context0);
        TokenRequest tokenRequest0 = (TokenRequest)bxom.a(this.d.a, "token_request", TokenRequest.class);
        ConsentResult consentResult0 = (ConsentResult)bxom.a(this.d.a, "consent_result", ConsentResult.class);
        gftb.check(consentResult0);
        TokenRequest tokenRequest1 = new TokenRequest(tokenRequest0.a(), tokenRequest0.a);
        tokenRequest1.f(tokenRequest0.b());
        tokenRequest1.d(ajol.b);
        tokenRequest1.i = tokenRequest0.i;
        FACLConfig fACLConfig0 = consentResult0.e;
        if(fACLConfig0 != null) {
            tokenRequest1.d = fACLConfig0;
        }
        PACLConfig pACLConfig0 = tokenRequest1.e;
        String s = consentResult0.d;
        if(s != null) {
            tokenRequest1.e = new PACLConfig((pACLConfig0 == null ? null : pACLConfig0.b), s);
        }
        ajol ajol0 = consentResult0.a();
        if(ajol0 != null) {
            tokenRequest1.d(ajol0);
        }
        String s1 = consentResult0.g;
        if(!TextUtils.isEmpty(s1)) {
            tokenRequest1.p = s1;
        }
        String s2 = consentResult0.h;
        if(!TextUtils.isEmpty(s2)) {
            tokenRequest1.q = s2;
        }
        TokenData tokenData0 = ajnv0.c(tokenRequest1).w;
        if(tokenData0 != null) {
            String s3 = tokenData0.b;
            Set set0 = this.b.p();
            if(s3 != null) {
                List list0 = tokenData0.f;
                if(list0 != null && set0 != null) {
                    list0 = ggia.b(list0);
                    list0.retainAll(ggch.j(set0).l(new epur()).n());
                    Account account0 = tokenRequest0.a();
                    epvf epvf0 = new epvf(this.c, account0);
                    HashSet hashSet0 = new HashSet(list0);
                    this.g.b.put(epvf0, hashSet0);
                }
                epub epub0 = this.f;
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                epub0.kB(new RecordConsentByConsentResultResponse(list0, s3));
                return;
            }
        }
        RecordConsentByConsentResultResponse recordConsentByConsentResultResponse0 = new RecordConsentByConsentResultResponse(ggna.a, null);
        this.f.kB(recordConsentByConsentResultResponse0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        RecordConsentByConsentResultResponse recordConsentByConsentResultResponse0 = new RecordConsentByConsentResultResponse(ggna.a, null);
        this.f.kB(recordConsentByConsentResultResponse0);
    }
}

