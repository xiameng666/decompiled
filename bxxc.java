import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.util.Base64;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.identitycredentials.CredentialInformation;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class bxxc {
    public final icck a;
    private final Context b;
    private final kjl c;

    public bxxc(Context context0, PackageManager packageManager0) {
        ibuq.f(context0, "context");
        ibuq.f(packageManager0, "packageManager");
        super();
        this.b = context0;
        this.a = iccl.b(cclw.a);
        this.c = kjh.a(context0);
    }

    public final Object a(String s, ibrl ibrl0) {
        String s3;
        Object object2;
        String s2;
        byte[] arr_b;
        kjl kjl0;
        bxxa bxxa0;
        if((ibrl0 instanceof bxxa)) {
            bxxa0 = (bxxa)ibrl0;
            int v = bxxa0.f;
            if((v & 0x80000000) == 0) {
                bxxa0 = new bxxa(this, ibrl0);
            }
            else {
                bxxa0.f = v - 0x80000000;
            }
        }
        else {
            bxxa0 = new bxxa(this, ibrl0);
        }
        Object object0 = bxxa0.d;
        Object object1 = ibrx.a;
        switch(bxxa0.f) {
            case 0: {
                ibnx.b(object0);
                kjl0 = this.c;
                List list0 = ibpo.b(new kke(null));
                bxxa0.g = s;
                bxxa0.h = kjl0;
                bxxa0.a = list0;
                bxxa0.f = 1;
                ibuq.f(this.b, "context");
                ibuq.f(s, "packageName");
                try {
                    arr_b = null;
                    arr_b = bbms.j(this.b, s, "SHA-256");
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                String s1 = arr_b == null ? "" : a.l(s, Base64.encodeToString(arr_b, 10), "android://", "@");
                if(s1 != object1) {
                    s2 = s;
                    object2 = list0;
                    object0 = s1;
                    goto label_34;
                }
                return object1;
            }
            case 1: {
                object2 = bxxa0.a;
                kjl0 = bxxa0.h;
                s2 = bxxa0.g;
                ibnx.b(object0);
            label_34:
                kka kka0 = new kka(((List)object2), ((String)object0), false);
                bxxa0.g = s2;
                bxxa0.h = null;
                bxxa0.a = null;
                bxxa0.f = 2;
                icbk icbk0 = new icbk(ibsc.c(bxxa0), 1);
                icbk0.z();
                CancellationSignal cancellationSignal0 = new CancellationSignal();
                icbk0.d(new kji(cancellationSignal0));
                kjj kjj0 = new kjj(icbk0);
                kjg kjg0 = new kjg();
                kjo kjo0 = new kjp(kjl0.a).a(false);
                if(kjo0 == null) {
                    kjj0.a(new klp("No Credential Manager provider found"));
                }
                else {
                    kjo0.onPrepareCredential(kka0, cancellationSignal0, kjg0, kjj0);
                }
                object0 = icbk0.k();
                if(object0 == ibrx.a) {
                    ibsi.b(bxxa0);
                }
                if(object0 != object1) {
                    s3 = s2;
                    goto label_58;
                }
                return object1;
            }
            case 2: {
                s3 = bxxa0.g;
                ibnx.b(object0);
            label_58:
                boolean z = ((kkm)object0).a("android.credentials.TYPE_PASSWORD_CREDENTIAL");
                boolean z1 = ((kkm)object0).a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
                bxxa0.g = s3;
                bxxa0.b = z;
                bxxa0.c = z1;
                bxxa0.f = 3;
                Object object3 = this.b(s3, bxxa0);
                return object3 != object1 ? new CredentialInformation(s3, ((int)z), ((int)z1), ((int)((Boolean)object3).booleanValue()), 0) : object1;
            }
            case 3: {
                boolean z2 = bxxa0.c;
                boolean z3 = bxxa0.b;
                String s4 = bxxa0.g;
                ibnx.b(object0);
                return new CredentialInformation(s4, ((int)z3), ((int)z2), ((int)((Boolean)object0).booleanValue()), 0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(String s, ibrl ibrl0) {
        GoogleAccount googleAccount0;
        Object object3;
        String s1;
        adfy adfy2;
        adfy adfy1;
        bxxb bxxb0;
        if((ibrl0 instanceof bxxb)) {
            bxxb0 = (bxxb)ibrl0;
            int v = bxxb0.d;
            if((v & 0x80000000) == 0) {
                bxxb0 = new bxxb(this, ibrl0);
            }
            else {
                bxxb0.d = v - 0x80000000;
            }
        }
        else {
            bxxb0 = new bxxb(this, ibrl0);
        }
        Object object0 = bxxb0.b;
        Object object1 = ibrx.a;
    alab1:
        switch(bxxb0.d) {
            case 0: {
                ibnx.b(object0);
                adfy adfy0 = new adfy(this.b);
                actm actm0 = GetAccountsRequest.a();
                actm0.b("com.google");
                gmcd gmcd0 = fhra.b(adfy0.c(actm0.a()));
                bxxb0.e = s;
                bxxb0.g = adfy0;
                bxxb0.d = 1;
                Object object2 = icpu.c(gmcd0, bxxb0);
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                adfy1 = adfy0;
                adfy2 = adfy1;
                s1 = s;
                object3 = ((GetAccountsResponse)object0).a.iterator();
                break;
            }
            case 1: {
                adfy1 = bxxb0.g;
                s = bxxb0.e;
                ibnx.b(object0);
                adfy2 = adfy1;
                s1 = s;
                object3 = ((GetAccountsResponse)object0).a.iterator();
                break;
            }
            case 2: {
                try {
                    googleAccount0 = bxxb0.f;
                    object3 = bxxb0.a;
                    adfy2 = bxxb0.g;
                    s1 = bxxb0.e;
                    ibnx.b(object0);
                    while(true) {
                    label_38:
                        ibuq.e(googleAccount0.c, "getEmail(...)");
                        if(googleAccount0.c.length() != 0) {
                            return Boolean.valueOf(true);
                        }
                        break alab1;
                    }
                }
                catch(aztb | IOException | acse unused_ex) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    label_41:
        if(((Iterator)object3).hasNext()) {
            Object object4 = ((Iterator)object3).next();
            googleAccount0 = (GoogleAccount)object4;
            actp actp0 = GetTokenRequest.a();
            actp0.b = googleAccount0.a;
            actp0.h = s1;
            actp0.c = ibpo.g(new String[]{"email", "profile", "openid"});
            GetTokenRequest getTokenRequest0 = actp0.a();
            try {
                gmcd gmcd1 = fhra.b(adfy2.d(getTokenRequest0));
                bxxb0.e = s1;
                bxxb0.g = adfy2;
                bxxb0.a = object3;
                bxxb0.f = googleAccount0;
                bxxb0.d = 2;
                if(icpu.c(gmcd1, bxxb0) != object1) {
                    goto label_38;
                }
            }
            catch(aztb | IOException | acse unused_ex) {
                goto label_41;
            }
            return object1;
        }
        return Boolean.valueOf(false);
    }
}

