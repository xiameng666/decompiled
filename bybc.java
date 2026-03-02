import android.content.Context;
import android.content.Intent;
import android.content.pm.SigningInfo;
import android.credentials.CredentialOption.Builder;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest.Builder;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.GetCredentialRequest;
import android.util.Log;
import com.google.android.gms.identitycredentials.CredentialOption;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public final class bybc {
    public static final int a;
    private static final SecureRandom b;

    static {
        bybc.b = new SecureRandom();
    }

    public static final List a(List list0, kvx kvx0, bxvs bxvs0, kvi kvi0, String s, Drawable drawable0) {
        ibuq.f(list0, "providerActions");
        ibuq.f(kvx0, "callingAppInfo");
        ibuq.f(bxvs0, "requestInfo");
        ibuq.f(kvi0, "beginGetCredentialRequest");
        ibuq.f(s, "providerName");
        ibuq.f(drawable0, "providerIcon");
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            list1.add(bybp.b(s, ((kuu)object0), "key", "subkey", bybc.f(bxvs0, kvi0, kvx0), drawable0));
            s = s;
        }
        return list1;
    }

    public static final List b(List list0, kvx kvx0, bxvs bxvs0, kvi kvi0, String s, String s1, Drawable drawable0) {
        ibuq.f(list0, "providerAuthenticationEntries");
        ibuq.f(kvx0, "callingAppInfo");
        ibuq.f(bxvs0, "requestInfo");
        ibuq.f(kvi0, "beginGetCredentialRequest");
        String s2 = s;
        ibuq.f(s2, "providerName");
        String s3 = s1;
        ibuq.f(s3, "providerLabel");
        Drawable drawable1 = drawable0;
        ibuq.f(drawable1, "providerIcon");
        List list1 = new ArrayList(ibpo.q(list0, 10));
        int v = 0;
        for(Object object0: list0) {
            if(v < 0) {
                ibpo.m();
            }
            list1.add(bybp.c(s2, s3, drawable1, ((kuw)object0), "lockedEntryKey", String.valueOf(bybc.b.nextInt()), bybc.f(bxvs0, kvi0, kvx0), false, false));
            s2 = s;
            s3 = s1;
            drawable1 = drawable0;
            ++v;
        }
        return list1;
    }

    public static final List c(Context context0, List list0, kvx kvx0, bxvs bxvs0, kvi kvi0, String s, String s1) {
        ibuq.f(context0, "context");
        ibuq.f(list0, "providerCredentialEntries");
        ibuq.f(kvx0, "callingAppInfo");
        ibuq.f(bxvs0, "requestInfo");
        ibuq.f(kvi0, "beginGetCredentialRequest");
        ibuq.f(s, "providerName");
        ibuq.f(s1, "providerLabel");
        List list1 = new ArrayList();
        for(Object object0: list0) {
            bybu bybu0 = bybp.d(context0, s, s1, ((kwc)object0), "key", "subkey", bybc.g(bxvs0, ((kwc)object0).b, kvx0), null);
            if(bybu0 != null) {
                list1.add(bybu0);
            }
            context0 = context0;
            s = s;
            s1 = s1;
        }
        return list1;
    }

    public static final bxzv d(kxc kxc0, kvx kvx0, bxvs bxvs0, String s) {
        ibuq.f(kvx0, "callingAppInfo");
        ibuq.f(bxvs0, "requestInfo");
        ibuq.f(s, "providerName");
        if(kxc0 != null) {
            Intent intent0 = new Intent();
            bybc.e(intent0, bxvs0, kvx0, bxvs0.a.a);
            return bybq.a(s, new bybr(kxc0, "key", "subkey", intent0));
        }
        return null;
    }

    private static final void e(Intent intent0, bxvs bxvs0, kvx kvx0, List list0) {
        if(Build.VERSION.SDK_INT >= 34) {
            SigningInfo signingInfo0 = kvx0.a();
            CallingAppInfo callingAppInfo0 = new CallingAppInfo(bxvs0.c, signingInfo0, bxvs0.a.c);
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(new CredentialOption.Builder(((CredentialOption)object0).a, ((CredentialOption)object0).b, ((CredentialOption)object0).c).build());
            }
            ibuq.c(intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", new GetCredentialRequest(callingAppInfo0, arrayList0)));
            return;
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            arrayList1.add(kjm.a(((CredentialOption)object1).a, ((CredentialOption)object1).b, ((CredentialOption)object1).c, false, ibpu.a));
        }
        intent0.putExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", kww.a(new kwx(arrayList1, kvx0, null, bxvs0.a.b)));
    }

    private static final Intent f(bxvs bxvs0, kvi kvi0, kvx kvx0) {
        Intent intent0 = new Intent();
        if(Build.VERSION.SDK_INT >= 34) {
            BeginGetCredentialRequest.Builder beginGetCredentialRequest$Builder0 = new BeginGetCredentialRequest.Builder();
            SigningInfo signingInfo0 = kvx0.a();
            BeginGetCredentialRequest.Builder beginGetCredentialRequest$Builder1 = beginGetCredentialRequest$Builder0.setCallingAppInfo(new CallingAppInfo(bxvs0.c, signingInfo0, bxvs0.a.c));
            ArrayList arrayList0 = new ArrayList(ibpo.q(kvi0.a, 10));
            for(Object object0: kvi0.a) {
                arrayList0.add(new BeginGetCredentialOption(((kvg)object0).a, ((kvg)object0).b, ((kvg)object0).c));
            }
            intent0.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", beginGetCredentialRequest$Builder1.setBeginGetCredentialOptions(arrayList0).build());
            return intent0;
        }
        ibuq.f(kvi0, "request");
        intent0.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", kvh.a(kvi0));
        return intent0;
    }

    private static final Intent g(bxvs bxvs0, kvg kvg0, kvx kvx0) {
        Intent intent0 = new Intent();
        try {
            int v = Integer.parseInt(kvg0.a);
            bybc.e(intent0, bxvs0, kvx0, ibpo.b(((CredentialOption)bxvs0.a.a.get(v))));
        }
        catch(NumberFormatException numberFormatException0) {
            Log.e("CredentialSelector", "Failed to parse option index", numberFormatException0);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            Log.e("CredentialSelector", "Unexpected option index", arrayIndexOutOfBoundsException0);
        }
        return intent0;
    }
}

