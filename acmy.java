import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdProviderService;
import android.content.Context;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdRequestParams;
import com.google.android.gms.appset.AppSetInfoParcel;
import com.google.android.gms.appset.service.AppSetIdProviderChimeraService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class acmy extends AppSetIdProviderService {
    public final boolean a;
    public final gmcd b;
    public final gmcg c;
    public static final int d;
    private final acku e;

    public acmy() {
        gmcg gmcg0 = acni.a();
        this.c = gmcg0;
        AppContextProvider.a();
        boolean z = hoti.i();
        this.a = z;
        this.b = z ? gmcg0.e(new acmx(this)) : gmbu.g();
        this.e = new acku(this.b);
    }

    private static final boolean a(Context context0, String s, String s1) {
        return cjmf.c(context0, s1, -1, Binder.getCallingUid(), s, null) == 0;
    }

    public final AppSetId onGetAppSetId(int v, String s) {
        ccmq.a().a(bbdg.sK);
        long v1 = System.currentTimeMillis();
        Context context0 = AppContextProvider.a();
        String[] arr_s = bbsr.b(context0).k(Binder.getCallingUid());
        boolean z = false;
        if(!hotp.e()) {
            if(arr_s != null && arr_s.length == 1) {
                if(acnh.a(arr_s[0])) {
                    z = true;
                }
                else if(acnh.b(arr_s[0])) {
                    goto label_20;
                }
            }
        label_19:
            if(z) {
            label_20:
                AppSetIdRequestParams appSetIdRequestParams0 = new AppSetIdRequestParams(null, s);
                try {
                    Context context1 = AppContextProvider.a();
                    AppSetInfoParcel appSetInfoParcel0 = (AppSetInfoParcel)this.e.a(context1, appSetIdRequestParams0, v).get();
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
                    gldz gldz0 = gldz.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gldm gldm0 = (gldm)hftp0.b_message;
                    gldz0.getClass();
                    gldm0.d = gldz0;
                    gldm0.c = 5;
                    glil0.s(hftp0);
                    acml.b(((glim)((ProtoLiteBuilder)glil0).N_build()));
                    return new AppSetId(appSetInfoParcel0.a, appSetInfoParcel0.b);
                }
                catch(ExecutionException | InterruptedException | CancellationException exception0) {
                    glil glil1 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp1.b_message;
                    ((gldm)hftv2).b |= 1;
                    ((gldm)hftv2).e = v1;
                    if(!hftv2.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gldm)hftp1.b_message).g = 2;
                    ((gldm)hftp1.b_message).b |= 4;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gldz.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gldz)hftp2.b_message).c = 5;
                    ((gldz)hftp2.b_message).b |= 1;
                    gldz gldz1 = (gldz)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gldm gldm1 = (gldm)hftp1.b_message;
                    gldz1.getClass();
                    gldm1.d = gldz1;
                    gldm1.c = 5;
                    glil1.s(hftp1);
                    acml.b(((glim)((ProtoLiteBuilder)glil1).N_build()));
                    Log.e(AppSetIdProviderChimeraService.a, "Failed to get app set id " + exception0.getMessage());
                    return new AppSetId("", 1);
                }
            }
        }
        else if(arr_s != null && arr_s.length == 1) {
            String s1 = arr_s[0];
            if(acnh.a(s1) || acnh.b(s1)) {
                z = acmy.a(context0, s1, "android.permission.ACCESS_PRIVILEGED_APP_SET_ID");
                goto label_19;
            }
            else if(Objects.equals(s1, "com.google.android.ext.services") || Objects.equals(s1, "com.android.ext.services")) {
                z = acmy.a(context0, s1, "android.permission.ACCESS_PRIVILEGED_APP_SET_ID_COMPAT");
                goto label_19;
            }
        }
        glil glil2 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gldm.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        ((gldm)hftv3).b |= 1;
        ((gldm)hftv3).e = v1;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gldm)hftp3.b_message).g = 2;
        ((gldm)hftp3.b_message).b |= 4;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gldz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((gldz)hftp4.b_message).c = 2;
        ((gldz)hftp4.b_message).b |= 1;
        gldz gldz2 = (gldz)hftp4.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gldm gldm2 = (gldm)hftp3.b_message;
        gldz2.getClass();
        gldm2.d = gldz2;
        gldm2.c = 5;
        glil2.s(hftp3);
        acml.b(((glim)((ProtoLiteBuilder)glil2).N_build()));
        throw new SecurityException(String.format(Locale.ENGLISH, "Unauthorized caller: %s", s));
    }
}

