import android.adservices.adid.AdId;
import android.adservices.adid.AdIdProviderService;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.ads.identifier.util.d;
import com.google.android.gms.chimera.modules.adid.AppContextProvider;
import java.util.Locale;

public final class aaza extends AdIdProviderService {
    private final b a;
    private final Context b;

    public aaza() {
        Context context0 = AppContextProvider.a();
        this.b = context0;
        this.a = b.c(context0);
    }

    public final AdId onGetAdId(int v, String s) {
        long v1 = System.currentTimeMillis();
        String[] arr_s = bbsr.b(AppContextProvider.a()).k(Binder.getCallingUid());
        if(arr_s != null && arr_s.length == 1) {
            String s1 = arr_s[0];
            if(d.a(s1) || d.b(s1) || hotp.e() && d.c(s1)) {
                try {
                    String s2 = this.a.f(v);
                    boolean z = this.a.n(v);
                    long v2 = System.currentTimeMillis();
                    glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gldm)hftv0).b |= 1;
                    ((gldm)hftv0).e = v1;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp0.b_message;
                    ((gldm)hftv1).b |= 2;
                    ((gldm)hftv1).f = v2;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gldm)hftp0.b_message).g = 1;
                    ((gldm)hftp0.b_message).b |= 4;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gldi.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gldi)hftp1.b_message).f = 1;
                    ((gldi)hftp1.b_message).b |= 8;
                    gldi gldi0 = (gldi)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gldm gldm0 = (gldm)hftp0.b_message;
                    gldi0.getClass();
                    gldm0.d = gldi0;
                    gldm0.c = 4;
                    glil0.s(hftp0);
                    aayz.a(((glim)((ProtoLiteBuilder)glil0).N_build()));
                    return new AdId(s2, z);
                }
                catch(RuntimeException runtimeException0) {
                    glil glil1 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    ((gldm)hftv2).b |= 1;
                    ((gldm)hftv2).e = v1;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gldm)hftp2.b_message).g = 2;
                    ((gldm)hftp2.b_message).b |= 4;
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gldi.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp3.b_message;
                    ((gldi)hftv3).f = 1;
                    ((gldi)hftv3).b |= 8;
                    if(!hftv3.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((gldi)hftp3.b_message).c = 4;
                    ((gldi)hftp3.b_message).b |= 1;
                    gldi gldi1 = (gldi)hftp3.N_build();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gldm gldm1 = (gldm)hftp2.b_message;
                    gldi1.getClass();
                    gldm1.d = gldi1;
                    gldm1.c = 4;
                    glil1.s(hftp2);
                    aayz.a(((glim)((ProtoLiteBuilder)glil1).N_build()));
                    throw runtimeException0;
                }
            }
        }
        glil glil2 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp4.b_message;
        ((gldm)hftv4).b |= 1;
        ((gldm)hftv4).e = v1;
        if(!hftv4.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((gldm)hftp4.b_message).g = 2;
        ((gldm)hftp4.b_message).b |= 4;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gldi.a).v_newBuilder();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp5.b_message;
        ((gldi)hftv5).f = 1;
        ((gldi)hftv5).b |= 8;
        if(!hftv5.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((gldi)hftp5.b_message).c = 2;
        ((gldi)hftp5.b_message).b |= 1;
        gldi gldi2 = (gldi)hftp5.N_build();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gldm gldm2 = (gldm)hftp4.b_message;
        gldi2.getClass();
        gldm2.d = gldi2;
        gldm2.c = 4;
        glil2.s(hftp4);
        aayz.a(((glim)((ProtoLiteBuilder)glil2).N_build()));
        throw new SecurityException(String.format(Locale.ENGLISH, "Unauthorized caller: %s", s));
    }
}

