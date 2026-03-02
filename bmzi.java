import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import j..util.Objects;

final class bmzi implements bnem {
    final bmzj a;

    public bmzi(bmzj bmzj0) {
        Objects.requireNonNull(bmzj0);
        this.a = bmzj0;
        super();
    }

    @Override  // bnem
    public final void b(Transport transport0, ResponseData responseData0) {
        bmhg bmhg0;
        ((ggtj)((ggtj)bmzj.a.h()).ar(0x109D)).R("U2fTransportControllerCallback#onResultReceived for transport: %s, result: %s", transport0, responseData0);
        for(Object object0: gfud.b(0x400).l(String.format("onResultReceived(%s, %s)", transport0, responseData0))) {
            String s = (String)object0;
        }
        if(this.a.b.b != bncu.c) {
            if(transport0 == null) {
                bmhg0 = null;
            }
            else {
                try {
                    bmhg0 = bmhg.a(transport0.h);
                }
                catch(bmhf bmhf0) {
                    this.a.d.l.a(this.a.d.c, bmhf0);
                    this.a.b(ErrorCode.h, "Unsupported transport " + transport0.h);
                    return;
                }
            }
            if((responseData0 instanceof RegisterResponseData) || (responseData0 instanceof SignResponseData)) {
                bmzj bmzj1 = this.a;
                bncv bncv1 = bmzj1.b;
                if(!hsue.d()) {
                    gftb.q(bncv1.b == bncu.b);
                }
                else if(bncv1.b != bncu.b) {
                    ((ggtj)((ggtj)bncv.a.j()).ar(0x10EC)).B("buildAuthenticatorResponseFromPreparedRequestResult called when tracker is not in REQUEST_PREPARED state. Current state: %s", bncv1.b);
                }
                AuthenticatorResponse authenticatorResponse0 = bncv1.c(responseData0, transport0);
                bncv1.k();
                bmgk bmgk0 = new bmgk(gfqx.a, gfqx.a);
                bmzj1.c.h(authenticatorResponse0, bmhg0, false, bmgk0, gfqx.a);
                bmzj1.d.k();
            }
            else if((responseData0 instanceof ErrorResponseData)) {
                com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode0 = ((ErrorResponseData)responseData0).a;
                String s1 = ((ErrorResponseData)responseData0).b;
                bmzj bmzj0 = this.a;
                ErrorCode errorCode1 = ErrorCode.h;
                bncv bncv0 = bmzj0.b;
                if(bncv0.d && errorCode0 != null && errorCode0 == com.google.android.gms.fido.u2f.api.common.ErrorCode.c) {
                    if(blwt.n(bncv0.e())) {
                        errorCode1 = ErrorCode.k;
                    }
                    else {
                        errorCode1 = ErrorCode.b;
                        s1 = "One of the excluded credentials exists on the local device";
                    }
                }
                if(bmhg0 != null) {
                    bmhb bmhb0 = new bmhb();
                    bmhb0.b(errorCode1);
                    bmhb0.a = s1;
                    bmzj0.d(bmhb0.a(), bmhg0, false, new bmgk(gfqx.a, gfqx.a), gfqx.a);
                }
            }
        }
    }
}

