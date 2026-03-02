import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import j..time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class gaoo extends gaok {
    private final bmei b;
    private final ahmb c;

    public gaoo(gamx gamx0, bmei bmei0, ahmb ahmb0) {
        super(gamx0);
        this.b = bmei0;
        this.c = ahmb0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        bxnm bxnm2;
        Intent intent0 = gano0.a;
        if(intent0.hasExtra("fidoKeyCreationData")) {
            int v = intent0.getIntExtra("requestId", 0);
            byte[] arr_b = intent0.getByteArrayExtra("fidoKeyCreationData");
            gftb.check(arr_b);
            PendingIntent pendingIntent0 = this.h(arr_b, v);
            return pendingIntent0 == null ? new ganp(ganp.d(0)) : new ganp(gaoo.b(pendingIntent0.getIntentSender()));
        }
        boolean z = intent0.getBooleanExtra("fidoCheckKeyAvailability", false);
        byte[] arr_b1 = intent0.getByteArrayExtra("fidoCredentialId");
        String s = intent0.getStringExtra("fidoRelyingPartyId");
        byte[] arr_b2 = intent0.getByteArrayExtra("fidoChallengeData");
        try {
            hcyv hcyv0 = (hcyv)gawi.i(intent0, "fidoKeyAssertionData", ((MessageLite)hcyv.a));
            hfuo hfuo0 = hcyv0.c;
            bxnm bxnm0 = bxnm.m;
            ibuq.f(hcyv0, "<this>");
            ibuq.f(bxnm0, "defaultInvocationType");
            if((hcyv0.b & 1) == 0) {
                bxnm2 = bxnm0;
            }
            else {
                bxnm bxnm1 = bxnm.b(hcyv0.d);
                bxnm2 = bxnm1 == null ? bxnm0 : bxnm1;
            }
            int v1 = intent0.getIntExtra("requestId", 0);
            Intent intent1 = null;
            if(z) {
                int v2 = this.g(arr_b1, s);
                if(v2 != -1) {
                    intent1 = ganp.d(v2);
                }
            }
            if(intent1 == null) {
                ggdy ggdy0 = new ggdy();
                if(arr_b1 != null) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcyx.a).v_newBuilder();
                    ByteString hfsf0 = ByteString.copyFrom(arr_b1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcyx hcyx0 = (hcyx)hftp0.b_message;
                    hcyx0.b |= 2;
                    hcyx0.d = hfsf0;
                    String s1 = PublicKeyCredentialType.a.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcyx hcyx1 = (hcyx)hftp0.b_message;
                    s1.getClass();
                    hcyx1.b |= 1;
                    hcyx1.c = s1;
                    ggdy0.i(((hcyx)hftp0.N_build()));
                }
                ggdy0.k(hfuo0);
                PendingIntent pendingIntent1 = this.i(s, arr_b2, ggdy0.h(), v1, bxnm2);
                intent1 = pendingIntent1 == null ? ganp.d(0) : gaoo.b(pendingIntent1.getIntentSender());
            }
            return new ganp(intent1);
        }
        catch(RuntimeException runtimeException0) {
            throw new IllegalStateException("Invalid key assertion data", runtimeException0);
        }
    }

    static Intent b(IntentSender intentSender0) {
        Intent intent0 = ganp.e(0);
        intent0.putExtra("fidoResponseIntentSender", intentSender0);
        return intent0;
    }

    public static IntentSender c(ganp ganp0) {
        return (IntentSender)ganp0.a.getParcelableExtra("fidoResponseIntentSender");
    }

    protected final int g(byte[] arr_b, String s) {
        evql evql0;
        if(hzlv.h()) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            String s1 = this.d().d.D;
            evql0 = this.c.b(s, hfsf0, 6, s1);
        }
        else {
            evql0 = this.b.h(s, arr_b);
        }
        try {
            if(((Boolean)evrg.o(evql0, 600000L, TimeUnit.MILLISECONDS)).booleanValue()) {
                return -1;
            }
            Log.w("GmsFidoAction", "Credential key is not available");
            return 1;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Log.e("GmsFidoAction", "Unexpected exception when checking key availability", exception0);
            return 0;
        }
    }

    protected final PendingIntent h(byte[] arr_b, int v) {
        hcyw hcyw0 = (hcyw)gciq.c(arr_b, ((Parser)((ProtoLiteMessage)hcyw.a).jf(7, null)));
        hcyt hcyt0 = hcyw0.c == null ? hcyt.a : hcyw0.c;
        hcyu hcyu0 = hcyw0.d == null ? hcyu.a : hcyw0.d;
        ArrayList arrayList0 = new ArrayList(hcyw0.h.size());
        for(Object object0: hcyw0.h) {
            arrayList0.add(new PublicKeyCredentialDescriptor(((hcyx)object0).c, ((hcyx)object0).d.toByteArray(), null));
        }
        if(hzlv.h()) {
            ahmu ahmu0 = new ahmu();
            ahmu0.a = new PublicKeyCredentialRpEntity(hcyt0.b, hcyt0.c, null);
            ahmu0.b = new PublicKeyCredentialUserEntity(hcyu0.b.toByteArray(), hcyu0.d, null, hcyu0.c);
            ahmu0.c(hcyw0.e.toByteArray());
            ahmu0.b(ggia.d(new PublicKeyCredentialParameters[]{new PublicKeyCredentialParameters(PublicKeyCredentialType.a.b, glwy.h(hcyw0.f))}));
            Duration duration0 = Duration.ofMillis(hcyw0.g);
            ahmu0.d = (double)(((double)duration0.getSeconds()) + ((double)duration0.getNano()) / 1000000000.0);
            ahmu0.f = bmhd.a(Attachment.a, Boolean.valueOf(false), UserVerificationRequirement.a, null);
            ahmu0.h = AttestationConveyancePreference.c;
            ahmu0.e = arrayList0;
            ahmu0.j = hcyw0.i.isEmpty() ? hzji.c().b : hcyw0.i;
            ahna ahna0 = RegistrationOptions.e();
            ahna0.a = ahmu0.a();
            ahna0.d(this.d().d.D);
            ahna0.b("com.google.android.gms");
            bxnm bxnm0 = bxnm.m;
            ibuq.f(hcyw0, "<this>");
            ibuq.f(bxnm0, "defaultInvocationType");
            if((hcyw0.b & 0x20) != 0) {
                bxnm bxnm1 = bxnm.b(hcyw0.j);
                if(bxnm1 != null) {
                    bxnm0 = bxnm1;
                }
            }
            ahna0.c(bxnm0);
            RegistrationOptions registrationOptions0 = ahna0.a();
            evql evql0 = this.c.d(registrationOptions0);
            try {
                gfsx gfsx0 = (gfsx)evrg.o(evql0, 600000L, TimeUnit.MILLISECONDS);
                if(gfsx0.i()) {
                    return (PendingIntent)gfsx0.d();
                }
                Log.e("GmsFidoAction", "GIS Registration Pending Intent is absent.");
            }
            catch(TimeoutException unused_ex) {
                Log.w("GmsFidoAction", "Timed out trying to create PendingIntent for FIDO registration.");
            }
            catch(ExecutionException | InterruptedException exception0) {
                Log.w("GmsFidoAction", "Can\'t retrieve a PendingIntent for FIDO registration.", exception0);
            }
            return null;
        }
        bmii bmii0 = new bmii();
        bmii0.a = new PublicKeyCredentialRpEntity(hcyt0.b, hcyt0.c, null);
        bmii0.b = new PublicKeyCredentialUserEntity(hcyu0.b.toByteArray(), hcyu0.d, null, hcyu0.c);
        bmii0.b(hcyw0.e.toByteArray());
        bmii0.c(ggia.d(new PublicKeyCredentialParameters[]{new PublicKeyCredentialParameters(PublicKeyCredentialType.a.b, glwy.h(hcyw0.f))}));
        bmii0.c = (double)TimeUnit.MILLISECONDS.toSeconds(hcyw0.g);
        bmii0.e = bmhd.a(Attachment.a, Boolean.valueOf(false), UserVerificationRequirement.a, null);
        bmii0.h = AttestationConveyancePreference.c;
        bmii0.d = arrayList0;
        bmii0.j = hcyw0.i.isEmpty() ? hzji.c().b : hcyw0.i;
        if(v != 0) {
            bmii0.f = v;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions0 = bmii0.a();
        evql evql1 = this.b.e(publicKeyCredentialCreationOptions0);
        try {
            return (PendingIntent)evrg.o(evql1, 600000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException unused_ex) {
            Log.w("GmsFidoAction", "Timed out trying to create PendingIntent for FIDO registration.");
            return null;
        }
        catch(ExecutionException | InterruptedException exception1) {
            Log.w("GmsFidoAction", "Can\'t retrieve a PendingIntent for FIDO registration.", exception1);
            return null;
        }
    }

    protected final PendingIntent i(String s, byte[] arr_b, List list0, int v, bxnm bxnm0) {
        ArrayList arrayList0 = new ArrayList(((ggna)list0).c);
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            arrayList0.add(new PublicKeyCredentialDescriptor(((hcyx)object0).c, ((hcyx)object0).d.toByteArray(), null));
        }
        if(hzlv.h()) {
            ahmw ahmw0 = new ahmw();
            ahmw0.c(arr_b);
            ahmw0.b = arrayList0;
            ahmw0.b(s);
            ahlm ahlm0 = AuthenticationOptions.e();
            ahlm0.a = ahmw0.a();
            ahlm0.e(this.d().d.D);
            ahlm0.b("com.google.android.gms");
            ahlm0.d(bxnm0);
            AuthenticationOptions authenticationOptions0 = ahlm0.a();
            evql evql0 = this.c.c(authenticationOptions0);
            try {
                gfsx gfsx0 = (gfsx)evrg.o(evql0, 600000L, TimeUnit.MILLISECONDS);
                if(gfsx0.i()) {
                    return (PendingIntent)gfsx0.d();
                }
                Log.e("GmsFidoAction", "GIS Authentication Pending Intent is absent.");
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                Log.w("GmsFidoAction", "Can\'t retrieve a sign PendingIntent.", exception0);
            }
            return null;
        }
        bmio bmio0 = new bmio();
        bmio0.b(arr_b);
        bmio0.b = arrayList0;
        bmio0.c(s);
        if(v != 0) {
            bmio0.c = v;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions0 = bmio0.a();
        evql evql1 = this.b.f(publicKeyCredentialRequestOptions0);
        try {
            return (PendingIntent)evrg.o(evql1, 600000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception1) {
            Log.w("GmsFidoAction", "Can\'t retrieve a sign PendingIntent.", exception1);
            return null;
        }
    }
}

