import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import j..util.Objects;

public final class eips {
    public static eipp a(Context context0, Intent intent0) {
        String s = intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = intent0.getPackage();
        if(s2 != null) {
            s1 = s2;
        }
        if(Objects.equals(intent0.getPackage(), "com.google.android.gms")) {
            IntentOperation.startIntentOperations(context0, intent0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlrk.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hlrk)hftv0).b |= 1;
            ((hlrk)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((hlrk)hftv1).b |= 2;
            ((hlrk)hftv1).d = s1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hlrk)hftp0.b_message).e = 1;
            ((hlrk)hftp0.b_message).b |= 4;
            return new eipp(((hlrk)hftp0.N_build()));
        }
        context0.sendBroadcast(intent0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlri.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((hlri)hftv2).b |= 1;
        ((hlri)hftv2).c = s;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        hlri hlri0 = (hlri)hftp1.b_message;
        hlri0.b |= 2;
        hlri0.d = s1;
        int v = intent0.getIntExtra("com.google.android.gms.phenotype.UPDATE_REASON", 0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hlri hlri1 = (hlri)hftp1.b_message;
        hlri1.b |= 4;
        hlri1.e = v;
        boolean z = intent0.getBooleanExtra("com.google.android.gms.phenotype.URGENT", false);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hlri hlri2 = (hlri)hftp1.b_message;
        hlri2.b |= 8;
        hlri2.f = z;
        return new eipp(((hlri)hftp1.N_build()));
    }
}

