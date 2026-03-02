import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Trace;
import android.util.Log;
import j..util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import jeb.synthetic.TWR;

public final class ifwq {
    private static ifwt a;
    private static String b;
    private static final Object c;

    static {
        ifwq.c = new Object();
    }

    // This method was un-flattened
    public static ifwt a(Context context0, boolean z) {
        ifwt ifwt2;
        ifwt ifwt1;
        String s1;
        int v6;
        Object object2;
        ifwp ifwp1;
        hfsl hfsl0;
        int v1;
        ProtoLiteMessage hftv0;
        hftc hftc0;
        ifwp ifwp0;
        FileInputStream fileInputStream0;
        File file0;
        ApplicationInfo applicationInfo0;
        ResolveInfo resolveInfo0;
        ifwt ifwt0;
        Object object0 = ifwq.c;
        __monitor_enter(object0);
        try {
            if(ifwq.b != null && !"140.0.7289.0".equals(ifwq.b)) {
                throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
            }
            ifwt0 = ifwq.a;
            if(ifwt0 == null) {
                ifwq.b = "140.0.7289.0";
                new ifvp("HttpFlagsLoader#getHttpFlags loading flags");
                goto label_8;
            }
            goto label_224;
        }
        catch(Throwable throwable0) {
            goto label_220;
        }
        try {
        label_8:
            if(ifyg.a(context0).getBoolean("android.net.http.ReadHttpFlags", true)) {
                try {
                    new ifvp("HttpFlagsLoader#getProviderApplicationInfo");
                    goto label_10;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_116;
                }
            }
            else {
                goto label_123;
            }
            goto label_124;
        }
        catch(Throwable throwable1) {
            goto label_212;
        }
        try {
        label_10:
            resolveInfo0 = context0.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 0x100000);
            if(resolveInfo0 == null) {
                Log.i("HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                goto label_13;
            }
            else {
                goto label_16;
            }
            goto label_25;
        }
        catch(Throwable throwable2) {
            goto label_19;
        }
        try {
        label_13:
            Trace.endSection();
            applicationInfo0 = null;
            goto label_25;
        }
        catch(RuntimeException runtimeException0) {
            goto label_116;
        }
        catch(Throwable throwable1) {
            goto label_212;
        }
        try {
        label_16:
            applicationInfo0 = resolveInfo0.serviceInfo.applicationInfo;
            goto label_24;
        }
        catch(Throwable throwable2) {
            try {
            label_19:
                Trace.endSection();
                throw throwable2;
            }
            catch(Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                label_24:
                    Trace.endSection();
                label_25:
                    if(applicationInfo0 == null) {
                        goto label_121;
                    }
                    else {
                        file0 = new File(new File(new File(applicationInfo0.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                        file0.getAbsolutePath();
                        new ifvp("HttpFlagsLoader#loadFlagsFile");
                        goto label_29;
                    }
                    goto label_124;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_116;
                }
                catch(Throwable throwable1) {
                    goto label_212;
                }
            }
        }
        try {
            try {
            label_29:
                try(fileInputStream0 = new FileInputStream(file0)) {
                }
                ifwp0 = ifwp.DEFAULT_INSTANCE;
                hftc0 = hftc.a;
            }
            catch(FileNotFoundException unused_ex) {
                goto label_101;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Unable to read HTTP flags file", iOException0);
            }
            try {
                TWR.useResource$NT(fileInputStream0);
                int v = fileInputStream0.read();
                if(v == -1) {
                    TWR.useResource$NT(fileInputStream0);
                    hftv0 = null;
                }
                else {
                    TWR.useResource$NT(fileInputStream0);
                    v1 = hfsl.L(v, fileInputStream0);
                    goto label_53;
                }
                goto label_97;
            }
            catch(hfur hfur0) {
            }
            catch(IOException iOException1) {
                goto label_51;
            }
            try {
                TWR.useResource$NT(fileInputStream0);
                if(hfur0.b) {
                    TWR.useResource$NT(fileInputStream0);
                    throw new hfur(hfur0);
                }
                TWR.useResource$NT(fileInputStream0);
                throw hfur0;
            label_51:
                TWR.useResource$NT(fileInputStream0);
                throw new hfur(iOException1);
            label_53:
                TWR.useResource$NT(fileInputStream0);
                hfsl0 = hfsl.N(new hfri(fileInputStream0, v1));
                hftv0 = ((ProtoLiteMessage)ifwp0).x_newMutableInstance();
            }
            catch(FileNotFoundException unused_ex) {
                goto label_101;
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Unable to read HTTP flags file", iOException0);
            }
            try {
                TWR.useResource$NT(fileInputStream0);
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
                goto label_90;
            }
            catch(hfur hfur1) {
            }
            catch(hfwr hfwr0) {
                goto label_70;
            }
            catch(IOException iOException2) {
                goto label_75;
            }
            catch(RuntimeException runtimeException1) {
                goto label_84;
            }
            try {
                TWR.useResource$NT(fileInputStream0);
                if(hfur1.b) {
                    TWR.useResource$NT(fileInputStream0);
                    hfur1 = new hfur(hfur1);
                }
                TWR.useResource$NT(fileInputStream0);
                hfur1.a = hftv0;
                throw hfur1;
            label_70:
                TWR.useResource$NT(fileInputStream0);
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            label_75:
                TWR.useResource$NT(fileInputStream0);
                if((iOException2.getCause() instanceof hfur)) {
                    TWR.useResource$NT(fileInputStream0);
                    throw (hfur)iOException2.getCause();
                }
                TWR.useResource$NT(fileInputStream0);
                hfur hfur3 = new hfur(iOException2);
                hfur3.a = hftv0;
                throw hfur3;
            label_84:
                TWR.useResource$NT(fileInputStream0);
                if((runtimeException1.getCause() instanceof hfur)) {
                    TWR.useResource$NT(fileInputStream0);
                    throw (hfur)runtimeException1.getCause();
                }
                TWR.useResource$NT(fileInputStream0);
                throw runtimeException1;
                try {
                label_90:
                    TWR.useResource$NT(fileInputStream0);
                    hfsl0.z(0);
                }
                catch(hfur hfur4) {
                    TWR.useResource$NT(fileInputStream0);
                    hfur4.a = hftv0;
                    throw hfur4;
                }
            label_97:
                TWR.useResource$NT(fileInputStream0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ifwp1 = (ifwp)hftv0;
                goto label_113;
            }
            catch(FileNotFoundException unused_ex) {
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Unable to read HTTP flags file", iOException0);
            }
        label_101:
            Log.i("HttpFlagsLoader", String.format("HTTP flags file `%s` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.", file0.getPath()));
        }
        catch(Throwable throwable4) {
            goto label_108;
        }
        try {
            Trace.endSection();
            ifwp1 = null;
            goto label_118;
        }
        catch(RuntimeException runtimeException0) {
            goto label_116;
        }
        catch(Throwable throwable1) {
            goto label_212;
        }
        try {
            throw new RuntimeException("Unable to read HTTP flags file", iOException0);
        }
        catch(Throwable throwable4) {
            try {
            label_108:
                Trace.endSection();
                throw throwable4;
            }
            catch(Throwable throwable5) {
                try {
                    try {
                        throwable4.addSuppressed(throwable5);
                        throw throwable4;
                    label_113:
                        Trace.endSection();
                    }
                    catch(RuntimeException runtimeException0) {
                    label_116:
                        Log.i("HttpFlagsLoader", "Unable to load HTTP flags file", runtimeException0);
                        goto label_119;
                    }
                label_118:
                    if(ifwp1 == null) {
                    label_119:
                        ifwp1 = null;
                        goto label_124;
                    label_121:
                        ifwp1 = null;
                        goto label_124;
                    label_123:
                        ifwp1 = null;
                    }
                label_124:
                    if(ifwp1 == null) {
                        ifwp1 = (ifwp)((ProtoLiteMessage)ifwp.DEFAULT_INSTANCE).v_newBuilder().N_build();
                    }
                    new ifvp("Cronet ResolvedFlags#resolve");
                }
                catch(Throwable throwable1) {
                    goto label_212;
                }
            }
        }
        try {
            int[] arr_v = ifwt.b("140.0.7289.0");
            HashMap hashMap0 = new HashMap();
            for(Object object1: DesugarCollections.unmodifiableMap(ifwp1.flags_).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                try {
                    object2 = null;
                    Iterator iterator1 = ((ifwn)map$Entry0.getValue()).constrainedValues_.iterator();
                label_135:
                    while(iterator1.hasNext()) {
                        Object object3 = iterator1.next();
                        ifwm ifwm0 = (ifwm)object3;
                        if((ifwm0.bitField0_ & 1) == 0 || ifwm0.appId_.equals("com.google.android.gms")) {
                            if((ifwm0.bitField0_ & 2) != 0) {
                                int[] arr_v1 = ifwt.b(ifwm0.minVersion_);
                                int v2 = 0;
                            label_142:
                                if(v2 >= Math.max(arr_v.length, arr_v1.length)) {
                                    goto label_149;
                                }
                                int v3 = v2 >= arr_v.length ? 0 : arr_v[v2];
                                int v4 = v2 >= arr_v1.length ? 0 : arr_v1[v2];
                                if(v3 > v4) {
                                    goto label_149;
                                }
                                if(v3 < v4) {
                                    continue;
                                }
                                ++v2;
                                goto label_142;
                            }
                        label_149:
                            int v5 = ifwm0.valueCase_;
                            switch(v5) {
                                case 0: {
                                    break;
                                }
                                case 3: {
                                    v6 = 1;
                                    break;
                                }
                                case 4: {
                                    v6 = 2;
                                    break;
                                }
                                case 5: {
                                    v6 = 3;
                                    break;
                                }
                                case 6: {
                                    v6 = 4;
                                    break;
                                }
                                case 7: {
                                    v6 = 5;
                                    break;
                                }
                                default: {
                                    throw null;
                                }
                            }
                            String s = "";
                            switch(v6 - 1) {
                                case 0: {
                                    object2 = new ifws((v5 == 3 ? ((Boolean)ifwm0.value_).booleanValue() : false));
                                    break label_135;
                                }
                                case 1: {
                                    object2 = new ifws((v5 == 4 ? ((long)(((Long)ifwm0.value_))) : 0L));
                                    break label_135;
                                }
                                case 2: {
                                    object2 = new ifws((v5 == 5 ? ((float)(((Float)ifwm0.value_))) : 0.0f));
                                    break label_135;
                                }
                                case 3: {
                                    if(v5 == 6) {
                                        s = (String)ifwm0.value_;
                                    }
                                    object2 = new ifws(s);
                                    break label_135;
                                }
                                case 4: {
                                    object2 = new ifws((v5 == 7 ? ((ByteString)ifwm0.value_) : ByteString.b));
                                    break label_135;
                                }
                                case 5: {
                                    break label_135;
                                }
                                default: {
                                    switch(v6) {
                                        case 1: {
                                            s1 = "BOOL_VALUE";
                                            break;
                                        }
                                        case 2: {
                                            s1 = "INT_VALUE";
                                            break;
                                        }
                                        case 3: {
                                            s1 = "FLOAT_VALUE";
                                            break;
                                        }
                                        case 4: {
                                            s1 = "STRING_VALUE";
                                            break;
                                        }
                                        case 5: {
                                            s1 = "BYTES_VALUE";
                                            break;
                                        }
                                        default: {
                                            s1 = "VALUE_NOT_SET";
                                        }
                                    }
                                    throw new IllegalArgumentException("Flag value uses unknown value type " + s1);
                                }
                            }
                        }
                    }
                }
                catch(RuntimeException runtimeException2) {
                    throw new IllegalArgumentException(a.M(map$Entry0, "Unable to resolve HTTP flag `", "`"), runtimeException2);
                }
                try {
                    if(object2 == null) {
                        continue;
                    }
                    hashMap0.put(((String)map$Entry0.getKey()), object2);
                }
                catch(RuntimeException runtimeException2) {
                    throw new IllegalArgumentException(a.M(map$Entry0, "Unable to resolve HTTP flag `", "`"), runtimeException2);
                }
            }
            ifwt1 = new ifwt(hashMap0);
            goto label_203;
        }
        catch(Throwable throwable6) {
            try {
                Trace.endSection();
                throw throwable6;
            }
            catch(Throwable throwable7) {
                try {
                    throwable6.addSuppressed(throwable7);
                    throw throwable6;
                label_203:
                    Trace.endSection();
                    ifwq.a = ifwt1;
                    ifws ifws0 = (ifws)ifwt1.a().get("Cronet_log_me");
                    if(ifws0 != null) {
                        ifws0.b(4);
                        Log.i("HttpFlagsLoader", String.format("HTTP flags log line (%s): %s", (z ? "API" : "Impl"), ((String)ifws0.a)));
                    }
                    ifwt2 = ifwq.a;
                    goto label_217;
                }
                catch(Throwable throwable1) {
                }
            }
        }
        try {
        label_212:
            Trace.endSection();
            throw throwable1;
        }
        catch(Throwable throwable8) {
            try {
                throwable1.addSuppressed(throwable8);
                throw throwable1;
            label_217:
                Trace.endSection();
                goto label_222;
            }
            catch(Throwable throwable0) {
            }
        }
    label_220:
        __monitor_exit(object0);
        throw throwable0;
    label_222:
        __monitor_exit(object0);
        return ifwt2;
    label_224:
        __monitor_exit(object0);
        return ifwt0;
    }
}

