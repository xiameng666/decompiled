import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

public final class aqow {
    public static ProtoLiteBuilder a(Context context0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hise.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hish.a).v_newBuilder();
        String s = String.valueOf(ModuleManager.get(context0).getCurrentModule().moduleVersion);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((hish)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hish)hftp1.b_message).c = 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hise hise0 = (hise)hftp0.b_message;
        hish hish0 = (hish)hftp1.N_build();
        hish0.getClass();
        hise0.c = hish0;
        hise0.b |= 1;
        return hftp0;
    }

    public static ProtoLiteBuilder b(ModuleManager moduleManager0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hise.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hish.a).v_newBuilder();
        String s = String.valueOf(moduleManager0.getCurrentModule().moduleVersion);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((hish)hftv0).b = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hish)hftp1.b_message).c = 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hise hise0 = (hise)hftp0.b_message;
        hish hish0 = (hish)hftp1.N_build();
        hish0.getClass();
        hise0.c = hish0;
        hise0.b |= 1;
        return hftp0;
    }
}

