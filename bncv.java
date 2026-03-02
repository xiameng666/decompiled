import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class bncv {
    public static final bboh a;
    public bncu b;
    public ResponseData c;
    public boolean d;
    private RequestParams e;
    private blxu f;
    private RequestOptions g;
    private String h;

    static {
        bncv.a = bnaa.d("RequestDataTracker");
    }

    public bncv(RequestOptions requestOptions0) {
        this.g = requestOptions0;
        this.d = true;
        this.p(bncu.a);
    }

    public bncv(RequestParams requestParams0) {
        gftb.check(requestParams0);
        this.e = requestParams0;
        this.d = false;
        this.p(bncu.a);
    }

    protected abstract blxu a(MessageDigest arg1, String arg2, String arg3);

    public abstract bmbu b(String arg1, String arg2);

    public abstract AuthenticatorResponse c(ResponseData arg1, Transport arg2);

    public final blxu d() {
        gftb.q(this.b == bncu.b);
        return this.f;
    }

    public final RequestOptions e() {
        boolean z = true;
        if(!hsue.d()) {
            if(this.b != bncu.a && this.b != bncu.b) {
                z = false;
            }
            gftb.q(z);
            return this.g;
        }
        if(this.b != bncu.a && this.b != bncu.b) {
            ((ggtj)((ggtj)bncv.a.j()).ar(0x10F3)).B("getFido2RequestOptions called when tracker is not in INIT or REQUEST_PREPARED state. Current state: %s", this.b);
        }
        return this.g;
    }

    public final RequestParams f() {
        if(!hsue.d()) {
            gftb.q(this.b == bncu.a);
            return this.e;
        }
        if(this.b != bncu.a) {
            ((ggtj)((ggtj)bncv.a.j()).ar(0x10F4)).B("getRequestParams called when tracker is not in INIT state. Current state: %s", this.b);
        }
        return this.e;
    }

    public final String g() {
        if(!hsue.d()) {
            gftb.q(this.b == bncu.a);
            return this.h;
        }
        if(this.b != bncu.a) {
            ((ggtj)((ggtj)bncv.a.j()).ar(0x10F2)).B("getAppIdInExtension called when tracker is not in INIT state. Current state: %s", this.b);
        }
        return this.h;
    }

    public final void h() {
        if(this.b != bncu.a && this.b != bncu.b) {
            ((ggtj)((ggtj)bncv.a.j()).ar(0x10EE)).B("completeOnError called when tracker is not in INIT or REQUEST_PREPARED state. Current state: %s", this.b);
            return;
        }
        this.k();
    }

    public final void i(ErrorResponseData errorResponseData0) {
        boolean z = true;
        if(!hsue.d()) {
            if(this.b != bncu.a && this.b != bncu.b) {
                z = false;
            }
            gftb.q(z);
        }
        else if(this.b != bncu.a && this.b != bncu.b) {
            ((ggtj)((ggtj)bncv.a.j()).ar(0x10EF)).B("completeOnError called when tracker is not in INIT or REQUEST_PREPARED state. Current state: %s", this.b);
        }
        this.c = errorResponseData0;
        this.k();
    }

    public final void j() {
        if(!hsue.d()) {
            gftb.q(this.b == bncu.a);
        }
        else if(this.b != bncu.a) {
            ((ggtj)((ggtj)bncv.a.j()).ar(0x10F1)).B("deactivateFido2Request called when tracker is not in INIT state. Current state: %s", this.b);
        }
        this.d = false;
    }

    public final void k() {
        this.f = null;
        this.p(bncu.c);
    }

    protected static final bmbu l(String s, String s1, String s2, TokenBinding tokenBinding0, bmbt bmbt0) {
        if(tokenBinding0 != null) {
            try {
                return new bmbu(bmbt0, s, s1, s2, new JSONObject().put("status", tokenBinding0.a).put("id", tokenBinding0.b));
            }
            catch(JSONException jSONException0) {
                throw new RuntimeException(jSONException0);
            }
        }
        return new bmbu(bmbt0, s, s1, s2, null);
    }

    public final void m(MessageDigest messageDigest0, String s, String s1, String s2) {
        gftb.q(this.b == bncu.a);
        gftb.check(messageDigest0);
        this.h = s1;
        this.f = this.a(messageDigest0, s, s2);
        this.e = null;
        this.p(bncu.b);
    }

    protected static final String n(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 11);
    }

    protected static final String o(String s, String s1, String s2, TokenBinding tokenBinding0, bmbt bmbt0) {
        return bncv.l(s, s1, s2, tokenBinding0, bmbt0).a().toString();
    }

    private final void p(bncu bncu0) {
        gftb.check(bncu0);
        this.b = bncu0;
    }
}

