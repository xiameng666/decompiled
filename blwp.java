import android.os.ResultReceiver;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

public final class blwp {
    public static ahnd a(RequestOptions requestOptions0, String s, bxnm bxnm0, boolean z) {
        ChromeOptions chromeOptions0;
        String s1 = (String)ChromeOptions.a.get(s);
        ResultReceiver resultReceiver0 = null;
        if(s1 == null) {
            chromeOptions0 = null;
        }
        else {
            ahpq ahpq0 = ChromeOptions.a();
            ahpq0.a = s1;
            chromeOptions0 = ahpq0.a();
        }
        if(blwt.n(requestOptions0)) {
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = (requestOptions0 instanceof BrowserPublicKeyCredentialRequestOptions) ? ((BrowserPublicKeyCredentialRequestOptions)requestOptions0).a : ((PublicKeyCredentialRequestOptions)requestOptions0);
            ahmw ahmw0 = new ahmw();
            ahmw0.c(publicKeyCredentialRequestOptions0.a);
            ahmw0.a = publicKeyCredentialRequestOptions0.b;
            ahmw0.b(publicKeyCredentialRequestOptions0.c);
            ahmw0.b = publicKeyCredentialRequestOptions0.d;
            ahmw0.c = publicKeyCredentialRequestOptions0.f;
            ahmw0.d = publicKeyCredentialRequestOptions0.g;
            ahmw0.e = publicKeyCredentialRequestOptions0.h;
            com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions1 = ahmw0.a();
            ahlm ahlm0 = AuthenticationOptions.e();
            ahlm0.a = publicKeyCredentialRequestOptions1;
            ahlm0.d(bxnm0);
            ahlm0.e(bxol.a());
            ahlm0.b(s);
            ahlm0.c(z);
            bxos bxos0 = (bxos)bxos.a.b();
            ahlm0.f(System.currentTimeMillis());
            if(hpkt.h()) {
                resultReceiver0 = publicKeyCredentialRequestOptions0.j;
            }
            ahlm0.d = resultReceiver0;
            if((requestOptions0 instanceof BrowserPublicKeyCredentialRequestOptions)) {
                ahls ahls0 = new ahls();
                ahls0.b(((BrowserPublicKeyCredentialRequestOptions)requestOptions0).b.toString());
                ahls0.c(((BrowserPublicKeyCredentialRequestOptions)requestOptions0).c);
                ahls0.a = chromeOptions0;
                ahlm0.b = ahls0.a();
            }
            return ahlm0.a();
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = (requestOptions0 instanceof BrowserPublicKeyCredentialCreationOptions) ? ((BrowserPublicKeyCredentialCreationOptions)requestOptions0).a : ((PublicKeyCredentialCreationOptions)requestOptions0);
        ahmu ahmu0 = new ahmu();
        ahmu0.a = publicKeyCredentialCreationOptions0.a;
        ahmu0.b = publicKeyCredentialCreationOptions0.b;
        ahmu0.c(publicKeyCredentialCreationOptions0.c);
        ahmu0.b(publicKeyCredentialCreationOptions0.d);
        ahmu0.d = publicKeyCredentialCreationOptions0.e;
        ahmu0.e = publicKeyCredentialCreationOptions0.f;
        ahmu0.f = publicKeyCredentialCreationOptions0.g;
        ahmu0.g = publicKeyCredentialCreationOptions0.i;
        ahmu0.h = publicKeyCredentialCreationOptions0.j;
        ahmu0.i = publicKeyCredentialCreationOptions0.k;
        ahmu0.j = publicKeyCredentialCreationOptions0.n;
        com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions1 = ahmu0.a();
        ahna ahna0 = RegistrationOptions.e();
        ahna0.a = publicKeyCredentialCreationOptions1;
        ahna0.b(s);
        ahna0.c(bxnm0);
        ahna0.d(bxol.a());
        ahna0.e = Boolean.valueOf(z);
        bxos bxos1 = (bxos)bxos.a.b();
        ahna0.e(System.currentTimeMillis());
        if(hpkt.h()) {
            resultReceiver0 = publicKeyCredentialCreationOptions0.m;
        }
        ahna0.f = resultReceiver0;
        if((requestOptions0 instanceof BrowserPublicKeyCredentialCreationOptions)) {
            ahls ahls1 = new ahls();
            ahls1.b(((BrowserPublicKeyCredentialCreationOptions)requestOptions0).b.toString());
            ahls1.c(((BrowserPublicKeyCredentialCreationOptions)requestOptions0).c);
            ahls1.a = chromeOptions0;
            ahna0.b = ahls1.a();
        }
        return ahna0.a();
    }
}

