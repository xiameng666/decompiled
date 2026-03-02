import android.content.Intent;
import android.os.ResultReceiver;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public final class blyp {
    public static gfsx a(Intent intent0) {
        String s = intent0.getStringExtra("DelegatedCallingPackage");
        return s == null ? gfqx.a : gfsx.m(s);
    }

    public static gfsx b(Intent intent0) {
        if(intent0.hasExtra("RequestOptionsExtra") && intent0.hasExtra("RequestTypeExtra")) {
            String s = intent0.getStringExtra("RequestTypeExtra");
            batl.s(s);
            try {
                bmiw[] arr_bmiw = bmiw.values();
                for(int v = 0; true; ++v) {
                    if(v >= arr_bmiw.length) {
                        throw new bmiv(s);
                    }
                    bmiw bmiw0 = arr_bmiw[v];
                    if(s.equals(bmiw0.c)) {
                        break;
                    }
                }
            }
            catch(bmiv unused_ex) {
                return gfqx.a;
            }
            String s1 = intent0.getStringExtra("CallerTypeExtra");
            batl.s(s1);
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = null;
            switch(bmiw0.ordinal()) {
                case 0: {
                    if(s1.equals("APPLICATION")) {
                        publicKeyCredentialCreationOptions0 = (PublicKeyCredentialCreationOptions)bauc.a(intent0.getByteArrayExtra("RequestOptionsExtra"), PublicKeyCredentialCreationOptions.CREATOR);
                    }
                    else if(s1.equals("BROWSER")) {
                        publicKeyCredentialCreationOptions0 = (BrowserPublicKeyCredentialCreationOptions)bauc.a(intent0.getByteArrayExtra("RequestOptionsExtra"), BrowserPublicKeyCredentialCreationOptions.CREATOR);
                    }
                    break;
                }
                case 1: {
                    if(s1.equals("APPLICATION")) {
                        publicKeyCredentialCreationOptions0 = (PublicKeyCredentialRequestOptions)bauc.a(intent0.getByteArrayExtra("RequestOptionsExtra"), PublicKeyCredentialRequestOptions.CREATOR);
                    }
                    else if(s1.equals("BROWSER")) {
                        publicKeyCredentialCreationOptions0 = (BrowserPublicKeyCredentialRequestOptions)bauc.a(intent0.getByteArrayExtra("RequestOptionsExtra"), BrowserPublicKeyCredentialRequestOptions.CREATOR);
                    }
                }
            }
            if(publicKeyCredentialCreationOptions0 != null) {
                if(intent0.hasExtra("ReceiverExtra") && hsvs.o()) {
                    publicKeyCredentialCreationOptions0.h(((ResultReceiver)intent0.getParcelableExtra("ReceiverExtra")));
                }
                return gfsx.m(publicKeyCredentialCreationOptions0);
            }
        }
        return gfqx.a;
    }
}

