import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Trace;
import android.provider.Settings.Secure;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import jeb.synthetic.TWR;

public final class azer extends cjtm {
    public static final azcx a;
    private final azcx b;
    private final LogEventParcelable c;
    private final azgg d;
    private final ModuleManager e;
    private final String f;
    private final azem g;
    private final ayvj h;

    static {
        azer.a = new azeq();
    }

    public azer(azcx azcx0, LogEventParcelable logEventParcelable0, azgg azgg0, ModuleManager moduleManager0, String s, azem azem0, ayvj ayvj0) {
        super(40, "LogOperation");
        this.b = azcx0;
        this.c = logEventParcelable0;
        this.d = azgg0;
        this.e = moduleManager0;
        this.f = s;
        this.g = azem0;
        this.h = ayvj0;
    }

    public final ByteString b(Context context0, byte[] arr_b, int[] arr_v, String[] arr_s, int[] arr_v1, byte[][] arr2_b, ExperimentTokens[] arr_experimentTokens, boolean z, String[] arr_s1, String s, boolean z1, String s1, double f, eiox eiox0, azef azef0) {
        gged_interceptors gged0;
        String[] arr_s3;
        ExperimentTokens experimentTokens1;
        gdqb gdqb3;
        Throwable throwable5;
        String s2;
        ExperimentTokens experimentTokens0;
        gdqb gdqb2;
        gged_interceptors gged1;
        Throwable throwable2;
        gdqb gdqb1;
        byte[] arr_b1;
        int v2;
        ggdy ggdy1;
        ggdy ggdy0;
        int v1;
        byte[][] arr2_b1 = arr2_b;
        hftr hftr0 = (hftr)((ProtoLiteMessage)hlpp.a).v_newBuilder();
        hlqc hlqc0 = (hlqc)this.g.c.mr();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hlpp hlpp0 = (hlpp)hftr0.b_message;
        hlqc0.getClass();
        hlpp0.p = hlqc0;
        hlpp0.b |= 0x400000;
        Integer integer0 = aywn.a(context0);
        if(integer0 != null) {
            long v = (long)(((int)integer0));
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlpp hlpp1 = (hlpp)hftr0.b_message;
            hlpp1.b |= 4;
            hlpp1.e = v;
        }
        if(arr_v != null) {
            List list0 = glwy.j(arr_v);
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlpp hlpp2 = (hlpp)hftr0.b_message;
            hfuf hfuf0 = hlpp2.o;
            if(!hfuf0.c()) {
                hlpp2.o = ProtoLiteMessage.C(hfuf0);
            }
            hfrj.E(list0, hlpp2.o);
        }
        if(s1 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlpq.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hlpq)hftv0).b |= 1;
            ((hlpq)hftv0).c = "application_id_3p";
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlpq hlpq0 = (hlpq)hftp0.b_message;
            hlpq0.b |= 2;
            hlpq0.d = s1;
            hftr0.dr(((hlpq)hftp0.N_build()));
        }
        if(!z1) {
            gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/service/LogOperation", "withAdditionalFields", 0x250, "GetExperiments");
            if(arr_experimentTokens == null) {
                v1 = 0;
            }
            else {
                try {
                    v1 = arr_experimentTokens.length;
                label_45:
                    ggdy0 = gged_interceptors.e(v1 + (arr2_b1 == null ? 0 : arr2_b1.length));
                    if(arr_experimentTokens != null) {
                        goto label_47;
                    }
                    goto label_48;
                }
                catch(Throwable throwable0) {
                    gdqb1 = gdqb0;
                    goto label_166;
                }
            }
            goto label_45;
            try {
            label_47:
                ggdy0.j(arr_experimentTokens);
            }
            catch(Throwable throwable1) {
                throwable2 = throwable1;
                gdqb1 = gdqb0;
                goto label_167;
            }
        label_48:
            if(arr2_b1 == null) {
                goto label_84;
            }
            else {
                try {
                    if(arr2_b1.length == 0) {
                        gdqb1 = gdqb0;
                        gged0 = ggna.a;
                    }
                    else {
                        ggdy1 = new ggdy();
                        v2 = 0;
                        while(true) {
                        label_52:
                            if(v2 >= arr2_b1.length) {
                                gdqb1 = gdqb0;
                                gged0 = ggdy1.h();
                                break;
                            }
                            arr_b1 = arr2_b1[v2];
                            goto label_58;
                        }
                    }
                    goto label_86;
                }
                catch(Throwable throwable0) {
                    gdqb1 = gdqb0;
                    goto label_166;
                }
            label_58:
                if(arr_b1 == null) {
                    try {
                        Log.e("CCTLogOperation", "Could not deserialize null to valid experiment token.");
                        goto label_72;
                        try {
                        label_61:
                            ggdy1.i(ExperimentTokens.d(new String(arr_b1, StandardCharsets.UTF_8)));
                            goto label_72;
                        }
                        catch(RuntimeException runtimeException0) {
                        }
                        goto label_64;
                    }
                    catch(Throwable throwable1) {
                        throwable2 = throwable1;
                        gdqb1 = gdqb0;
                        goto label_167;
                    }
                }
                else {
                    goto label_61;
                    try {
                    label_64:
                        gdqb1 = gdqb0;
                        int v3 = v2;
                        Log.e("CCTLogOperation", String.format("Could not deserialize %s to valid experiment token.", new String(arr_b1, StandardCharsets.UTF_8)), runtimeException0);
                        v2 = v3 + 1;
                        arr2_b1 = arr2_b;
                        gdqb0 = gdqb1;
                        goto label_52;
                    label_72:
                        gdqb1 = gdqb0;
                        v3 = v2;
                        v2 = v3 + 1;
                        arr2_b1 = arr2_b;
                        gdqb0 = gdqb1;
                        goto label_52;
                    label_84:
                        gdqb1 = gdqb0;
                        gged0 = ggna.a;
                    label_86:
                        ggdy0.k(gged0);
                        gged1 = ggdy0.h();
                        gdqb2 = gdsp.e("com/google/android/gms/clearcut/service/LogOperation", "withAdditionalFields", 596, "GetExperimentTokens");
                        goto label_89;
                    }
                    catch(Throwable throwable0) {
                        goto label_166;
                    }
                }
                goto label_72;
            }
            goto label_86;
            try {
            label_89:
                experimentTokens0 = null;
                s2 = this.f;
                if(s == null) {
                    goto label_100;
                }
                else {
                    goto label_92;
                }
                goto label_154;
            }
            catch(Throwable throwable3) {
                gdqb3 = gdqb2;
                goto label_148;
            }
            try {
            label_92:
                if(hrab.a.b().c().b.contains(s)) {
                    gdqb3 = gdqb2;
                }
                else {
                    goto label_100;
                }
                goto label_154;
            }
            catch(Throwable throwable4) {
                throwable5 = throwable4;
                gdqb3 = gdqb2;
                goto label_149;
            }
            gdqb3 = gdqb2;
            goto label_154;
            try {
            label_100:
                ggfp ggfp0 = ggfp.H(arr_s1);
                if(s == null) {
                    goto label_117;
                }
                else {
                    experimentTokens1 = azeh.a(s, s2, null, ggfp0, eiox0);
                    if(z || !ggfp0.isEmpty()) {
                        gdqb3 = gdqb2;
                    }
                    else if(experimentTokens1 == null) {
                        gdqb3 = gdqb2;
                        experimentTokens1 = null;
                    }
                    else {
                        gdqb3 = gdqb2;
                        experimentTokens1 = new ExperimentTokens(experimentTokens1.c, null, experimentTokens1.e, experimentTokens1.f, experimentTokens1.g, experimentTokens1.h, null, null, experimentTokens1.l);
                    }
                }
                goto label_119;
            }
            catch(Throwable throwable3) {
                gdqb3 = gdqb2;
                goto label_148;
            }
            try {
                experimentTokens1 = new ExperimentTokens(experimentTokens1.c, null, experimentTokens1.e, experimentTokens1.f, experimentTokens1.g, experimentTokens1.h, null, null, experimentTokens1.l);
                goto label_119;
            label_117:
                gdqb3 = gdqb2;
                experimentTokens1 = null;
            label_119:
                String[] arr_s2 = arr_s == null ? azeh.a : arr_s;
                if(!gged1.isEmpty() || arr_s2.length != 0) {
                    ArrayList arrayList0 = new ArrayList(arr_s2.length + 1 + ((ggna)gged1).c);
                    if(experimentTokens1 != null) {
                        arrayList0.add(experimentTokens1);
                    }
                    int v4 = 0;
                    while(v4 < arr_s2.length) {
                        String s3 = arr_s2[v4];
                        if(s3 != null && !ggfp0.contains(s3)) {
                            arr_s3 = arr_s2;
                            ExperimentTokens experimentTokens2 = azeh.a(null, s2, s3, null, eiox0);
                            if(experimentTokens2 != null) {
                                arrayList0.add(experimentTokens2);
                            }
                        }
                        else {
                            arr_s3 = arr_s2;
                        }
                        ++v4;
                        arr_s2 = arr_s3;
                    }
                    arrayList0.addAll(gged1);
                    if(!arrayList0.isEmpty()) {
                        ExperimentTokens experimentTokens3 = ExperimentTokens.e(arrayList0);
                        if(experimentTokens3 == null) {
                            Log.e("CCTLogOperation", "bad merge: " + s + "mendel packaged: " + new gfss(", ").b(arrayList0));
                            experimentTokens0 = experimentTokens1;
                        }
                        else {
                            experimentTokens0 = experimentTokens3;
                        }
                    }
                }
                else {
                    experimentTokens0 = experimentTokens1;
                }
                goto label_154;
            }
            catch(Throwable throwable3) {
            }
        label_148:
            throwable5 = throwable3;
            try {
            label_149:
                gdqb3.close();
                throw throwable5;
            }
            catch(Throwable throwable6) {
                try {
                    throwable5.addSuppressed(throwable6);
                    throw throwable5;
                label_154:
                    gdqb3.close();
                    try(gdqb gdqb4 = gdsp.e("com/google/android/gms/clearcut/service/LogOperation", "withAdditionalFields", 608, "ConvertExperimentIds")) {
                        gnzx gnzx0 = azic.a(experimentTokens0, arr_v1, true);
                        if(gnzx0 != null) {
                            if(!hftr0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)hftr0).ensureMutable();
                            }
                            ((hlpp)hftr0.b_message).l = gnzx0;
                            ((hlpp)hftr0.b_message).b |= 0x40000;
                        }
                    }
                    goto label_172;
                }
                catch(Throwable throwable0) {
                }
            }
        label_166:
            throwable2 = throwable0;
            try {
            label_167:
                gdqb1.close();
            }
            catch(Throwable throwable7) {
                throwable2.addSuppressed(throwable7);
            }
            throw throwable2;
        label_172:
            gdqb1.close();
            if(hrag.c()) {
                gftb.check(azef0);
                if(azef0.c) {
                    double f1 = azef0.b;
                    if(!hftr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr0).ensureMutable();
                    }
                    hlpp hlpp3 = (hlpp)hftr0.b_message;
                    hlpp3.b |= 0x2000000;
                    hlpp3.t = f1;
                }
            }
            else {
                if(!hftr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hftr0).ensureMutable();
                }
                hlpp hlpp4 = (hlpp)hftr0.b_message;
                hlpp4.b |= 0x2000000;
                hlpp4.t = f;
            }
        }
        hlpp hlpp5 = (hlpp)((ProtoLiteBuilder)hftr0).N_build();
        return ByteString.copyFrom(arr_b).t(hlpp5.getDefaultInstanceForType());
    }

    public final void c(Context context0, ProtoLiteBuilder hftp0) {
        int v = bbms.a(context0);
        Integer integer0 = v;
        integer0.getClass();
        Long long0 = null;
        if(v == -1) {
            integer0 = null;
        }
        boolean z = ((hlsi)hftp0.b_message).g;
        boolean z1 = ((hlsi)hftp0.b_message).o;
        int v1 = ((hlsi)hftp0.b_message).d;
        bbmy bbmy0 = bbmz.e(this.e);
        boolean z2 = ((hlsi)hftp0.b_message).j;
        String s = ((hlsi)hftp0.b_message).i;
        hlph hlph0 = (hlph)this.g.b.mr();
        int v2 = 5;
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hlph0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)hlph0));
        if(!z) {
            if(!((hftr)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
            }
            hlph hlph1 = (hlph)((hftr)hftp1).b_message;
            hlph1.b &= -2;
            hlph1.c = 0L;
        }
        if(z1) {
            if(!((hftr)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
            }
            hlph hlph2 = (hlph)((hftr)hftp1).b_message;
            hlph2.b &= 0xFFFFFBFF;
            hlph2.l = hlph.a.l;
        }
        String s1 = Integer.toString(v1);
        if(!((hftr)hftp1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
        }
        hlph hlph3 = (hlph)((hftr)hftp1).b_message;
        s1.getClass();
        hlph3.b |= 0x200;
        hlph3.k = s1;
        if(integer0 != null) {
            int v3 = (int)integer0;
            if(!((hftr)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
            }
            hlph hlph4 = (hlph)((hftr)hftp1).b_message;
            hlph4.b |= 0x40000;
            hlph4.u = v3;
        }
        ((hftr)hftp1).n(hloq.b, bbmy0.a);
        if(hrab.a.b().i() && s != null && hrab.a.b().d().b.contains(s)) {
            PackageInfo packageInfo0 = pyd.a(context0);
            String s2 = packageInfo0 == null ? null : packageInfo0.packageName;
            if(packageInfo0 != null) {
                long0 = packageInfo0.getLongVersionCode();
            }
            if(s2 != null) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hhld.a).v_newBuilder();
                switch(s2) {
                    case "com.android.chrome": {
                        v2 = 3;
                        break;
                    }
                    case "com.android.webview": {
                        v2 = 1;
                        break;
                    }
                    case "com.chrome.beta": {
                        v2 = 4;
                        break;
                    }
                    case "com.chrome.canary": {
                        v2 = 6;
                        break;
                    }
                    case "com.chrome.dev": {
                        break;
                    }
                    case "com.google.android.apps.chrome": {
                        v2 = 7;
                        break;
                    }
                    case "com.google.android.webview": {
                        v2 = 2;
                        break;
                    }
                    case "com.google.android.webview.beta": {
                        v2 = 8;
                        break;
                    }
                    case "com.google.android.webview.canary": {
                        v2 = 10;
                        break;
                    }
                    case "com.google.android.webview.debug": {
                        v2 = 11;
                        break;
                    }
                    case "com.google.android.webview.dev": {
                        v2 = 9;
                        break;
                    }
                    default: {
                        v2 = 12;
                    }
                }
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((hhld)hftp2.b_message).d = v2 - 1;
                ((hhld)hftp2.b_message).b |= 2;
                long v4 = (long)long0;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hhld hhld0 = (hhld)hftp2.b_message;
                hhld0.b |= 1;
                hhld0.c = v4;
                if(!((hftr)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
                }
                hlph hlph5 = (hlph)((hftr)hftp1).b_message;
                hhld hhld1 = (hhld)hftp2.N_build();
                hhld1.getClass();
                hlph5.E = hhld1;
                hlph5.b |= 0x40000000;
            }
        }
        if(z2) {
            if(!((hftr)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
            }
            hlph hlph6 = (hlph)((hftr)hftp1).b_message;
            hlph6.b &= 0xFFFDFFFF;
            hlph6.t = hlph.a.t;
        }
        if(!z2) {
            int v5 = azex.b().a(context0);
            if(v5 != 0) {
                if(!((hftr)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((hftr)hftp1))).ensureMutable();
                }
                hlph hlph7 = (hlph)((hftr)hftp1).b_message;
                hlph7.b |= 0x80000000;
                hlph7.F = (long)v5;
            }
        }
        hlph hlph8 = (hlph)((ProtoLiteBuilder)(((hftr)hftp1))).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlsi hlsi0 = (hlsi)hftp0.b_message;
        hlph8.getClass();
        hlsi0.l = hlph8;
        hlsi0.b |= 0x800;
    }

    public static final void d(Context context0, ProtoLiteBuilder hftp0) {
        String s;
        if(((hlsi)hftp0.b_message).i.isEmpty()) {
            hlsi hlsi0 = (hlsi)hftp0.b_message;
            s = (hlsi0.b & 8) == 0 ? "" : Integer.toString(hlsi0.e);
        }
        else {
            s = ((hlsi)hftp0.b_message).i;
        }
        Integer integer0 = azhj.a(context0, s);
        if(integer0 != null) {
            int v = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsi hlsi1 = (hlsi)hftp0.b_message;
            hlsi1.b |= 0x400;
            hlsi1.k = v;
            return;
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if((((hlsi)hftv0).b & 0x400) != 0) {
            return;
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlsi hlsi2 = (hlsi)hftp0.b_message;
        hlsi2.b |= 0x400;
        hlsi2.k = 0;
    }

    public static final void e(ProtoLiteBuilder hftp0, eiox eiox0) {
        long v = eiow.a(eiox0);
        if(v != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlsi hlsi0 = (hlsi)hftp0.b_message;
            hlsi0.b |= 0x1000;
            hlsi0.m = v;
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gdqb gdqb2;
        double f2;
        byte[] arr_b2;
        boolean z5;
        azbj azbj2;
        azge azge4;
        Context context1;
        hlsi hlsi3;
        azef azef1;
        double f1;
        long v11;
        hlqx hlqx0;
        boolean z4;
        String[] arr_s2;
        boolean z3;
        String s12;
        ExperimentTokens[] arr_experimentTokens1;
        byte[][] arr2_b1;
        int[] arr_v4;
        String[] arr_s1;
        azge azge3;
        int[] arr_v3;
        Object object3;
        SharedPreferences sharedPreferences0;
        int[] arr_v2;
        byte[] arr_b1;
        hlsi hlsi2;
        eiox eiox0;
        azge azge1;
        long v9;
        Object object2;
        azgg azgg1;
        azbj azbj1;
        glgz glgz0;
        glil glil0;
        cfgk cfgk0;
        DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable0;
        azge azge0;
        azgg azgg0;
        String s10;
        hrab hrab0;
        LogEventParcelable logEventParcelable1;
        azef azef0;
        String s9;
        Class class1;
        azea azea0;
        azdr azdr0;
        Random random0;
        azdw azdw0;
        gfsx gfsx0;
        String s8;
        azee azee0;
        gdqb gdqb1;
        ggeo ggeo0;
        String s6;
        String s5;
        PlayLoggerContext playLoggerContext1;
        azbj azbj0;
        String s;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/service/LogOperation", "execute", 0xF8, "LogOperation.execute");
        try {
            gftb.check(this.d);
            gftb.check(this.h);
            if(hqzv.a.b().b()) {
                goto label_651;
            }
            else {
                LogEventParcelable logEventParcelable0 = this.c;
                s = azif.a(logEventParcelable0.a);
                if(hqzy.f()) {
                    azbj0 = azbk.a();
                    azbj0.e(s, azbc.r);
                }
                else {
                    azbj0 = null;
                }
                if(hqzv.d()) {
                    String s1 = this.f;
                    hlsl hlsl0 = (hlsl)((ProtoLiteMessage)hlsn.a).v_newBuilder();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlsm.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlsj.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlsj hlsj0 = (hlsj)hftp1.b_message;
                    s1.getClass();
                    hlsj0.b |= 2;
                    hlsj0.d = s1;
                    PlayLoggerContext playLoggerContext0 = logEventParcelable0.a;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlsk.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hlsi.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hlsi.b(((hlsi)hftp3.b_message));
                    String s2 = gfta.b(playLoggerContext0.a);
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp3.b_message;
                    ((hlsi)hftv0).b |= 2;
                    ((hlsi)hftv0).c = s2;
                    int v = playLoggerContext0.b;
                    if(!hftv0.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp3.b_message;
                    ((hlsi)hftv1).b |= 4;
                    ((hlsi)hftv1).d = v;
                    int v1 = playLoggerContext0.c;
                    if(!hftv1.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp3.b_message;
                    ((hlsi)hftv2).b |= 8;
                    ((hlsi)hftv2).e = v1;
                    String s3 = gfta.b(playLoggerContext0.d);
                    if(!hftv2.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp3.b_message;
                    ((hlsi)hftv3).b |= 16;
                    ((hlsi)hftv3).f = s3;
                    boolean z = playLoggerContext0.e;
                    if(!hftv3.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp3.b_message;
                    ((hlsi)hftv4).b |= 0x40;
                    ((hlsi)hftv4).g = z;
                    if(!hftv4.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp3.b_message;
                    ((hlsi)hftv5).b |= 0x80;
                    ((hlsi)hftv5).h = "";
                    String s4 = gfta.b(playLoggerContext0.f);
                    if(!hftv5.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp3.b_message;
                    ((hlsi)hftv6).b |= 0x100;
                    ((hlsi)hftv6).i = s4;
                    boolean z1 = playLoggerContext0.g;
                    if(!hftv6.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv7 = hftp3.b_message;
                    ((hlsi)hftv7).b |= 0x200;
                    ((hlsi)hftv7).j = z1;
                    int v2 = playLoggerContext0.h;
                    if(!hftv7.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hlsi hlsi0 = (hlsi)hftp3.b_message;
                    hlsi0.b |= 0x400;
                    hlsi0.k = v2;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hlsk hlsk0 = (hlsk)hftp2.b_message;
                    hlsi hlsi1 = (hlsi)hftp3.N_build();
                    hlsi1.getClass();
                    hlsk0.c = hlsi1;
                    hlsk0.b |= 1;
                    byte[] arr_b = logEventParcelable0.b;
                    if(arr_b != null) {
                        ByteString hfsf0 = ByteString.copyFrom(arr_b);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hlsk hlsk1 = (hlsk)hftp2.b_message;
                        hlsk1.b |= 2;
                        hlsk1.d = hfsf0;
                    }
                    String[] arr_s = logEventParcelable0.d;
                    if(arr_s != null) {
                        List list0 = Arrays.asList(arr_s);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hlsk hlsk2 = (hlsk)hftp2.b_message;
                        hfuo hfuo0 = hlsk2.f;
                        if(!hfuo0.c()) {
                            hlsk2.f = ProtoLiteMessage.E(hfuo0);
                        }
                        hfrj.E(list0, hlsk2.f);
                    }
                    int[] arr_v = logEventParcelable0.c;
                    if(arr_v != null) {
                        List list1 = glwy.j(arr_v);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hlsk hlsk3 = (hlsk)hftp2.b_message;
                        hfuf hfuf0 = hlsk3.e;
                        if(!hfuf0.c()) {
                            hlsk3.e = ProtoLiteMessage.C(hfuf0);
                        }
                        hfrj.E(list1, hlsk3.e);
                    }
                    int[] arr_v1 = logEventParcelable0.e;
                    if(arr_v1 != null) {
                        List list2 = glwy.j(arr_v1);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hlsk hlsk4 = (hlsk)hftp2.b_message;
                        hfuf hfuf1 = hlsk4.g;
                        if(!hfuf1.c()) {
                            hlsk4.g = ProtoLiteMessage.C(hfuf1);
                        }
                        hfrj.E(list2, hlsk4.g);
                    }
                    byte[][] arr2_b = logEventParcelable0.f;
                    if(arr2_b != null) {
                        Iterable iterable0 = gggq.j(Arrays.asList(arr2_b), new ayue());
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hlsk hlsk5 = (hlsk)hftp2.b_message;
                        hfuo hfuo1 = hlsk5.h;
                        if(!hfuo1.c()) {
                            hlsk5.h = ProtoLiteMessage.E(hfuo1);
                        }
                        hfrj.E(iterable0, hlsk5.h);
                    }
                    boolean z2 = logEventParcelable0.h;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hlsk hlsk6 = (hlsk)hftp2.b_message;
                    hlsk6.b |= 4;
                    hlsk6.i = z2;
                    ExperimentTokens[] arr_experimentTokens = logEventParcelable0.g;
                    if(arr_experimentTokens != null) {
                        Iterable iterable1 = gggq.j(Arrays.asList(arr_experimentTokens), new ayuf());
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hlsk hlsk7 = (hlsk)hftp2.b_message;
                        hfuo hfuo2 = hlsk7.j;
                        if(!hfuo2.c()) {
                            hlsk7.j = ProtoLiteMessage.E(hfuo2);
                        }
                        hfrj.E(iterable1, hlsk7.j);
                    }
                    hlsk hlsk8 = (hlsk)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hlsj hlsj1 = (hlsj)hftp1.b_message;
                    hlsk8.getClass();
                    hlsj1.c = hlsk8;
                    hlsj1.b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlsm hlsm0 = (hlsm)hftp0.b_message;
                    hlsj hlsj2 = (hlsj)hftp1.N_build();
                    hlsj2.getClass();
                    hlsm0.d = hlsj2;
                    hlsm0.b |= 2;
                    long v3 = System.currentTimeMillis();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlsm hlsm1 = (hlsm)hftp0.b_message;
                    hlsm1.b |= 1;
                    hlsm1.c = v3;
                    hlsl0.a(hftp0);
                    hlsn hlsn0 = (hlsn)((ProtoLiteBuilder)hlsl0).N_build();
                    try(FileOutputStream fileOutputStream0 = new FileOutputStream(new File(AppContextProvider.a().getFilesDir(), "clearcut_simulation_log_events.pb"), true)) {
                        hlsn0.writeToStream(fileOutputStream0);
                        fileOutputStream0.flush();
                    }
                    catch(IOException iOException0) {
                        throw new gfuz("Failed to write simulation log events to file.", iOException0);
                    }
                }
                gftb.check(this.c.a);
                playLoggerContext1 = this.c.a;
                if(bbnp.d(context0)) {
                    s5 = playLoggerContext1.f;
                    s6 = hrat.a.c().e();
                    ggeo0 = azet.e;
                    __monitor_enter(ggeo0);
                    goto label_189;
                }
                goto label_232;
            }
            goto label_657;
        }
        catch(Throwable throwable0) {
            goto label_655;
        }
        try {
        label_189:
            if(!s6.equals(azet.h)) {
                azet.h = s6;
                String s7 = azet.h;
                ggek ggek0 = new ggek();
                for(Object object0: azet.f.l(s7)) {
                    List list3 = azet.g.n(((String)object0).trim());
                    if(list3.size() == 2) {
                        Integer integer0 = (Integer)ggeo0.get(list3.get(1));
                        if(integer0 == null) {
                            Log.e("CCTSidewinderThing", "Bad permission in sidewinderPermissions: " + s7);
                        }
                        else {
                            ggek0.i(((String)list3.get(0)), integer0);
                        }
                    }
                    else {
                        Log.e("CCTSidewinderThing", "Failed to parse a pair in sidewinderPermissions: " + s7);
                    }
                }
                azet.i = ggek0.b();
            }
            __monitor_exit(ggeo0);
        }
        catch(Throwable throwable1) {
            gdqb1 = gdqb0;
            while(true) {
                __monitor_exit(ggeo0);
                break;
            }
            try {
                throw throwable1;
            }
            catch(Throwable throwable0) {
                goto label_637;
            }
        }
        try {
            Integer integer1 = (Integer)azet.i.get(s5);
            if(integer1 == null) {
                playLoggerContext1 = null;
            }
            else if(integer1.equals(azet.a)) {
                playLoggerContext1 = null;
            }
            else if(!integer1.equals(azet.d)) {
                ayvn ayvn0 = playLoggerContext1.g ? ayvn.b : ayvn.c;
                if(integer1.equals(azet.b)) {
                    playLoggerContext1 = new PlayLoggerContext(playLoggerContext1.a, playLoggerContext1.b, playLoggerContext1.f, null, hlqe.b(playLoggerContext1.h), playLoggerContext1.i, playLoggerContext1.j, ayvn.b);
                }
                else if(integer1.equals(azet.c)) {
                    playLoggerContext1 = new PlayLoggerContext(playLoggerContext1.a, playLoggerContext1.b, playLoggerContext1.f, null, hlqe.b(playLoggerContext1.h), playLoggerContext1.i, playLoggerContext1.j, ayvn0);
                }
                else {
                    playLoggerContext1 = null;
                }
            }
        label_232:
            if(playLoggerContext1 == null) {
                goto label_647;
            }
            else {
                this.c.a = playLoggerContext1;
                if(azbj0 == null) {
                    azbj0 = null;
                }
                else {
                    azbj0.e(s, azbc.s);
                }
                if(hrag.c()) {
                    azeb azeb0 = azeb.b;
                    if(azeb0 == null) {
                        synchronized(azeb.class) {
                            azeb0 = azeb.b;
                            if(azeb0 == null) {
                                azeb0 = new azeb();
                                azeb.b = azeb0;
                            }
                        }
                    }
                    azee0 = new azee(this.c.a.f, this.c.j);
                    fpkp fpkp0 = hraj.a.b().a();
                    s8 = azee0.a;
                    Map map0 = fpkp0.b;
                    if(map0.containsKey(s8)) {
                        gfsx0 = gfsx.m(map0.get(s8));
                    }
                    else {
                        fpjb fpjb0 = (fpjb)fpkp0.a.get(s8);
                        gfsx0 = fpjb0 == null ? gfqx.a : gfsx.m(fpjb0.b());
                    }
                    azdw0 = null;
                    if(gfsx0.i()) {
                        for(Object object1: ((hlqw)gfsx0.d()).b) {
                            hlqv hlqv0 = (hlqv)object1;
                            if(((hlqv0.d == null ? hlqt.a : hlqv0.d).b & 1) == 0 || (hlqv0.d == null ? hlqt.a : hlqv0.d).c == azee0.b) {
                                azdw0 = new azdw(s8, hlqv0, ((hlqw)gfsx0.d()).c, s8 + (hlqv0.d == null ? hlqt.a : hlqv0.d).c);
                                break;
                            }
                        }
                    }
                    if(azdw0 == null) {
                        goto label_308;
                    }
                    else {
                        random0 = azeb0.c;
                        int v5 = hlqu.a(azdw0.a.b);
                        if(v5 == 0) {
                            throw null;
                        }
                        switch(v5 - 1) {
                            case 0: {
                                azdr0 = new azdr(random0, azdw0);
                                goto label_305;
                            }
                            case 1: {
                                azea0 = azea.a;
                                if(azea0 == null) {
                                    class1 = azea.class;
                                    __monitor_enter(class1);
                                    goto label_294;
                                }
                                goto label_304;
                            }
                            default: {
                                int v6 = hlqu.a(azdw0.a.b);
                                if(v6 == 1) {
                                    s9 = "EVENT_LEVEL_STRATEGY";
                                }
                                else {
                                    switch(v6) {
                                        case 2: {
                                            s9 = "DEVICE_LEVEL_STRATEGY";
                                            break;
                                        }
                                        case 3: {
                                            s9 = "SAMPLINGSTRATEGY_NOT_SET";
                                            break;
                                        }
                                        default: {
                                            s9 = "null";
                                        }
                                    }
                                }
                                throw new AssertionError(String.format("Unsupported sampling strategy: %s", s9));
                            }
                        }
                    }
                    goto label_310;
                }
                else {
                    goto label_313;
                }
            }
            goto label_657;
        }
        catch(Throwable throwable0) {
            goto label_655;
        }
        try {
        label_294:
            azea azea1 = azea.a;
            if(azea1 == null) {
                azea1 = new azea(AppContextProvider.a());
                azea.a = azea1;
            }
            __monitor_exit(class1);
            azea0 = azea1;
            goto label_304;
        }
        catch(Throwable throwable2) {
            try {
                __monitor_exit(class1);
                throw throwable2;
            label_304:
                azdr0 = new azdo(random0, azdw0, azea0);
            label_305:
                azef0 = azdr0.a();
                azeb.a(azee0.a, azef0.a);
                goto label_310;
            label_308:
                azeb.a(s8, true);
                azef0 = azeb.a;
            label_310:
                if(azef0.a) {
                label_321:
                    logEventParcelable1 = this.c;
                    int v7 = logEventParcelable1.a.h;
                    Integer integer2 = azhj.a(context0, azif.a(logEventParcelable1.a));
                    if(integer2 != null) {
                        v7 = (int)integer2;
                    }
                    if(v7 == 4) {
                        goto label_639;
                    }
                    else {
                        azhi.a();
                        hrab0 = hrab.a;
                        if(hrab0.b().h()) {
                            azql azql0 = azql.c(context0);
                            s10 = this.f;
                            if(azql0.g(s10)) {
                                s10 = null;
                            }
                        }
                        else {
                            s10 = null;
                        }
                        azgg0 = this.d;
                        azge0 = azgg0.a();
                        if(azge0 == null) {
                            if(azbj0 != null) {
                                azbj0.e(s, azbc.ae);
                            }
                            this.i(new Status(31002, "Log dropped due to uninitialized log store."));
                            goto label_652;
                        }
                        else {
                            if(hrab0.b().g()) {
                                dataCollectionIdentifierParcelable0 = logEventParcelable1.k;
                                if(dataCollectionIdentifierParcelable0 == null) {
                                    goto label_377;
                                }
                                else {
                                    gftb.check(logEventParcelable1.b);
                                    cfgk0 = cfgk.v();
                                    glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
                                    glgz0 = (glgz)((ProtoLiteMessage)glhc.a).v_newBuilder();
                                    gdqb1 = gdqb0;
                                    goto label_351;
                                }
                            }
                            else {
                                goto label_377;
                            }
                            goto label_380;
                        }
                    }
                }
                else {
                    this.i(new Status(31002, "Log dropped from sampling."));
                    goto label_652;
                label_313:
                    hlpp hlpp0 = this.c.l;
                    if(this.h.a(this.c.a.f, this.c.a.c, (hlpp0 == null ? 0 : hlpp0.g))) {
                        if(azbj0 == null) {
                            azef0 = null;
                            azbj0 = null;
                        }
                        else {
                            azbj0.e(s, azbc.t);
                            azef0 = null;
                        }
                        goto label_321;
                    }
                    else {
                        goto label_643;
                    }
                }
                goto label_657;
            }
            catch(Throwable throwable0) {
                goto label_655;
            }
        }
        try {
        label_351:
            bbed bbed0 = bbed.b(dataCollectionIdentifierParcelable0.a) == null ? bbed.a : bbed.b(dataCollectionIdentifierParcelable0.a);
            if(!glgz0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glgz0).ensureMutable();
            }
            glhc glhc0 = (glhc)glgz0.b_message;
            azbj1 = azbj0;
            glhc0.c = bbed0.a();
            glhc0.b |= 1;
            int v8 = dataCollectionIdentifierParcelable0.b;
            if(!glgz0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glgz0).ensureMutable();
            }
            glhc glhc1 = (glhc)glgz0.b_message;
            glhc1.b |= 4;
            glhc1.g = v8;
            bbdz bbdz0 = bbdz.b(dataCollectionIdentifierParcelable0.c) == null ? bbdz.a : bbdz.b(dataCollectionIdentifierParcelable0.c);
            if(!glgz0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glgz0).ensureMutable();
            }
            glhc glhc2 = (glhc)glgz0.b_message;
            glhc2.h = bbdz0.a();
            glhc2.b |= 8;
            azgg1 = azgg0;
            glgz0.m(((long)logEventParcelable1.b.length));
            double f = hrab0.b().a();
            glgz0.l(((long)(((int)(((double)(((float)logEventParcelable1.b.length))) * f)))));
            glil0.l(glgz0);
            cfgk0.j(((ProtoLiteMessage)(((glim)((ProtoLiteBuilder)glil0).N_build()))));
            goto label_380;
        label_377:
            gdqb1 = gdqb0;
            azbj1 = azbj0;
            azgg1 = azgg0;
        label_380:
            Trace.beginSection(a.a(s, "Clearcut LogOperation overall (", ")"));
        }
        catch(Throwable throwable0) {
            goto label_637;
        }
        try {
            object2 = ((azfv)azge0).c;
            __monitor_enter(object2);
        }
        catch(IOException iOException1) {
            goto label_417;
        }
        catch(Throwable throwable3) {
            goto label_629;
        }
        try {
            if(((azfv)azge0).j == null || !((azfv)azge0).j.containsKey(s)) {
                if(((azfv)azge0).j == null) {
                    ((azfv)azge0).l();
                }
                azfy azfy0 = (azfy)((azfv)azge0).j.get(s);
                v9 = azfy0 == null ? 0L : azfy0.a;
            }
            else {
                v9 = ((azfy)((azfv)azge0).j.get(s)).a;
            }
            __monitor_exit(object2);
        }
        catch(Throwable throwable4) {
            azge1 = azge0;
            while(true) {
                __monitor_exit(object2);
                break;
            }
            try {
                throw throwable4;
            }
            catch(IOException iOException1) {
            }
            catch(Throwable throwable3) {
                goto label_629;
            }
            goto label_418;
        }
        try {
            hlqq hlqq0 = hram.a.d().k();
            long v10 = hlqq0.b;
            s.getClass();
            Long long0 = (Long)hlqq0.c.get(s);
            if(long0 != null) {
                v10 = (long)long0;
            }
            if(Long.compare(v9, v10) > 0) {
                azer.h(azge0, s, azgb.d);
                this.i(new Status(31003, "Log dropped because of log cap for this log source exceeded."));
                goto label_538;
            }
            else if(azge0.v()) {
                azer.h(azge0, s, azgb.a);
                this.i(new Status(31003, "Log dropped because of storage quota exceeded."));
                goto label_538;
            }
            else {
                goto label_420;
            }
            goto label_657;
        }
        catch(IOException iOException1) {
        label_417:
            azge1 = azge0;
            try {
            label_418:
                azer.h(azge1, s, new azga(iOException1.getClass().getSimpleName(), azbc.E));
                throw new cjuh(31005, "Error checking storage size", null, iOException1);
            label_420:
                eiox0 = eiov.b(context0);
                try {
                    ProtoLiteBuilder hftp4 = azif.c(logEventParcelable1.a);
                    azer.g(context0, hftp4);
                    this.c(context0, hftp4);
                    azer.e(hftp4, eiox0);
                    azer.d(context0, hftp4);
                    hlsi2 = (hlsi)hftp4.N_build();
                    arr_b1 = logEventParcelable1.b;
                    gftb.check(arr_b1);
                    arr_v2 = logEventParcelable1.c;
                    if(hxkl.b().b.contains(s)) {
                        azge azge2 = azgg1.a();
                        gftb.check(azge2);
                        sharedPreferences0 = ((azfv)azge2).f.getSharedPreferences("TestCodePref", 0);
                        object3 = ((azfv)azge2).d;
                        __monitor_enter(object3);
                        goto label_436;
                    }
                    goto label_471;
                }
                catch(IOException iOException2) {
                    goto label_479;
                }
            }
            catch(Throwable throwable3) {
                goto label_629;
            }
            try {
            label_436:
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                String s11 = sharedPreferences0.getString(s, "");
                if(s11.isEmpty()) {
                    arr_v3 = new int[0];
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object4: azfv.b.l(s11)) {
                        Integer integer3 = glwy.i(((String)object4));
                        if(integer3 != null) {
                            arrayList0.add(integer3);
                        }
                    }
                    sharedPreferences$Editor0.remove(s);
                    if(!sharedPreferences$Editor0.commit()) {
                        Log.e("CCTFlatFileLogStore", "Failed to remove test codes for " + s);
                    }
                    arr_v3 = glwy.n(arrayList0);
                }
                __monitor_exit(object3);
                goto label_463;
            }
            catch(Throwable throwable5) {
                azge3 = azge0;
                while(true) {
                    __monitor_exit(object3);
                    break;
                }
                try {
                    try {
                        throw throwable5;
                    }
                    catch(IOException iOException2) {
                        goto label_626;
                    }
                    try {
                    label_463:
                        if(arr_v2 == null) {
                            arr_v2 = arr_v3;
                        }
                        else if(arr_v2.length == 0) {
                            arr_v2 = arr_v3;
                        }
                        else if(arr_v3 != null && arr_v3.length != 0) {
                            arr_v2 = glwy.m(new int[][]{arr_v2, arr_v3});
                        }
                    label_471:
                        arr_s1 = this.c.d;
                        arr_v4 = this.c.e;
                        arr2_b1 = this.c.f;
                        arr_experimentTokens1 = this.c.g;
                        s12 = s10;
                        z3 = this.c.h;
                        goto label_481;
                    }
                    catch(IOException iOException2) {
                    }
                }
                catch(Throwable throwable3) {
                    goto label_629;
                }
            }
        label_479:
            azge3 = azge0;
            goto label_626;
            try {
            label_481:
                arr_s2 = this.c.a();
                z4 = this.c.a.g;
                hlpp hlpp1 = this.c.l;
                List list4 = ((azdg)this.h).c(this.c.a.f, this.c.a.c, (hlpp1 == null ? 0 : hlpp1.g));
                if(list4.isEmpty()) {
                    goto label_514;
                }
                else if(list4.size() <= 1) {
                    hlqx0 = (hlqx)list4.get(0);
                    if((hlqx0.b & 16) == 0) {
                        v11 = hlqx0.f;
                        if(v11 > 0L) {
                            goto label_493;
                        }
                        else {
                            goto label_505;
                        }
                    }
                    else {
                        f1 = hlqx0.g;
                        goto label_515;
                    }
                }
                else {
                    goto label_505;
                }
                goto label_527;
            }
            catch(IOException iOException2) {
                goto label_525;
            }
            catch(Throwable throwable3) {
                goto label_629;
            }
        label_493:
            long v12 = hlqx0.e;
            if(v12 >= 0L && v12 <= v11) {
                f1 = ((double)v12) / ((double)v11);
                azef1 = azef0;
                hlsi3 = hlsi2;
                s12 = s12;
                goto label_517;
            }
            else {
                context1 = context0;
                azef1 = azef0;
                hlsi3 = hlsi2;
                s12 = s12;
                goto label_508;
                try {
                label_505:
                    context1 = context0;
                    azef1 = azef0;
                    hlsi3 = hlsi2;
                label_508:
                    azge4 = azge0;
                    azbj2 = azbj1;
                    z5 = z4;
                    arr_b2 = arr_b1;
                    f2 = -1.0;
                    goto label_527;
                label_514:
                    f1 = 1.0;
                label_515:
                    azef1 = azef0;
                    hlsi3 = hlsi2;
                label_517:
                    azge4 = azge0;
                    azbj2 = azbj1;
                    z5 = z4;
                    f2 = f1;
                    arr_b2 = arr_b1;
                    context1 = context0;
                    goto label_527;
                }
                catch(IOException iOException2) {
                }
                catch(Throwable throwable3) {
                    goto label_629;
                }
            label_525:
                azge3 = azge0;
                goto label_626;
            }
            try {
            label_527:
                ByteString hfsf1 = this.b(context1, arr_b2, arr_v2, arr_s1, arr_v4, arr2_b1, arr_experimentTokens1, z3, arr_s2, s, z5, s12, f2, eiox0, azef1);
                if(azbj2 != null) {
                    azbj2.e(s, azbc.u);
                }
                if(hfsf1.size() > 0x100000) {
                    azge3 = azge4;
                    goto label_536;
                }
                else {
                    goto label_540;
                }
                goto label_657;
            }
            catch(IOException iOException2) {
            }
            catch(Throwable throwable3) {
                goto label_629;
            }
            azge3 = azge4;
            goto label_626;
            try {
            label_536:
                azer.h(azge3, s, azgb.c);
                this.i(new Status(31004, "Log dropped because event exceeds maximum size"));
            }
            catch(IOException iOException2) {
                goto label_626;
            }
            catch(Throwable throwable3) {
                goto label_629;
            }
            try {
            label_538:
                Trace.endSection();
                goto label_657;
            }
            catch(Throwable throwable0) {
                goto label_637;
            }
            try {
                try {
                label_540:
                    azge3 = azge4;
                    if(!hqzv.a.b().d()) {
                        goto label_542;
                    }
                    goto label_589;
                }
                catch(IOException iOException2) {
                    goto label_626;
                }
                try {
                label_542:
                    try(gdqb2 = gdsp.e("com/google/android/gms/clearcut/service/LogOperation", "executeImpl", 408, "WriteLogEventProto")) {
                        if(azge3.w(hlsi3, hfsf1)) {
                            if(azbj2 != null) {
                                azbj2.e(s, azbc.v);
                            }
                            if(hlsi3.k == 3) {
                                azhi azhi0 = azhi.a();
                                Object object5 = azhi0.b;
                                synchronized(object5) {
                                    if(!azhi0.c) {
                                        azhi0.d(0L);
                                    }
                                }
                            }
                            if(hrat.b().b.contains(s)) {
                                try {
                                    if(Settings.Secure.getInt(context0.getContentResolver(), "user_setup_complete", 0) != 1) {
                                        goto label_573;
                                    }
                                }
                                catch(IllegalArgumentException | NullPointerException exception1) {
                                    goto label_571;
                                }
                            }
                        }
                        else {
                            goto label_580;
                        }
                    }
                    goto label_589;
                }
                catch(Exception exception0) {
                    goto label_586;
                }
                try {
                label_571:
                    TWR.useResource$NT(gdqb2);
                    Log.e("CCTLogOperation", "Exception thrown when trying to get user_setup_complete setting.", exception1);
                label_573:
                    TWR.useResource$NT(gdqb2);
                    cljp cljp0 = azhi.a().a;
                    clkn clkn0 = azhi.b("qos_aob");
                    clkn0.e(hrat.a.c().b(), hrat.a.c().a());
                    clkn0.g(2);
                    cljp0.f(clkn0.a());
                    goto label_589;
                label_580:
                    TWR.useResource$NT(gdqb2);
                    if(azbj2 != null) {
                        TWR.useResource$NT(gdqb2);
                        azbj2.e(s, azbc.G);
                    }
                    goto label_589;
                }
                catch(Exception exception0) {
                    try {
                    label_586:
                        if(azbj2 != null) {
                            azbj2.e(s, azbc.H);
                        }
                        throw exception0;
                    label_589:
                        int[] arr_v5 = this.c.c;
                        if(arr_v5 != null && arr_v5.length > 0) {
                            hfuo hfuo3 = hxkl.b().b;
                            SharedPreferences sharedPreferences1 = ((azfv)azge3).f.getSharedPreferences("TestCodePref", 0);
                            Object object6 = ((azfv)azge3).d;
                            synchronized(object6) {
                                SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences1.edit();
                                for(Object object7: hfuo3) {
                                    String s13 = (String)object7;
                                    if(!s13.equals(s)) {
                                        HashSet hashSet0 = new HashSet();
                                        for(int v15 = 0; v15 < arr_v5.length; ++v15) {
                                            hashSet0.add(Integer.valueOf(arr_v5[v15]));
                                        }
                                        String s14 = sharedPreferences1.getString(s13, "");
                                        if(!s14.isEmpty()) {
                                            for(Object object8: azfv.b.l(s14)) {
                                                Integer integer4 = glwy.i(((String)object8));
                                                if(integer4 != null) {
                                                    hashSet0.add(integer4);
                                                }
                                            }
                                        }
                                        sharedPreferences$Editor1.putString(s13, new gfss(",").b(hashSet0));
                                    }
                                }
                                if(!sharedPreferences$Editor1.commit()) {
                                    Log.e("CCTFlatFileLogStore", "Failed to persist test codes.");
                                }
                            }
                        }
                        goto label_631;
                    }
                    catch(IOException iOException2) {
                    }
                }
            label_626:
                azer.h(azge3, s, new azga(azgj.a(iOException2.getClass().getSimpleName(), iOException2), azbc.I));
                throw new cjuh(31005, "Error writing log", null, iOException2);
            }
            catch(Throwable throwable3) {
                goto label_629;
            }
        }
        catch(Throwable throwable3) {
            try {
            label_629:
                Trace.endSection();
                throw throwable3;
            label_631:
                Trace.endSection();
                if(azbj2 != null) {
                    azbj2.e(s, azbc.w);
                }
                this.i(Status.b);
                goto label_657;
            }
            catch(Throwable throwable0) {
            }
        }
    label_637:
        TWR.safeClose$NT(gdqb1, throwable0);
        throw throwable0;
        try {
        label_639:
            if(azbj0 != null) {
                azbj0.e(s, azbc.A);
            }
            this.i(new Status(31002, "Log dropped from Qos Tier."));
            goto label_652;
        label_643:
            if(azbj0 != null) {
                azbj0.e(s, azbc.z);
            }
            this.i(new Status(31002, "Log dropped from sampling."));
            goto label_652;
        label_647:
            if(azbj0 != null) {
                azbj0.e(s, azbc.y);
            }
            this.i(new Status(31002, "Log dropped from Sidewinder."));
            goto label_652;
        label_651:
            this.i(new Status(31002, "Logging is disabled"));
        label_652:
            gdqb1 = gdqb0;
        }
        catch(Throwable throwable0) {
        label_655:
            TWR.safeClose$NT(gdqb0, throwable0);
            throw throwable0;
        }
    label_657:
        gdqb1.close();
    }

    public static final void g(Context context0, ProtoLiteBuilder hftp0) {
        if(!fhcd.g(context0) && !((hlsi)hftp0.b_message).j) {
            String s = ejky.b(context0).a;
            if(s != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hlsi hlsi0 = (hlsi)hftp0.b_message;
                hlsi0.b |= 0x80;
                hlsi0.h = s;
            }
        }
    }

    private static void h(azge azge0, String s, azgc azgc0) {
        try {
            azge0.r(s, azgc0, 1);
        }
        catch(IOException unused_ex) {
            Log.e("CCTLogOperation", a.Y(azgc0, s, "Failed to record log drop for source: ", " and reason: "));
        }
    }

    private final void i(Status status0) {
        azcx azcx0 = this.b;
        if(azcx0 != null) {
            azcx0.d(status0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.i(status0);
    }
}

