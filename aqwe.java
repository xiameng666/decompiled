import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.TrafficStats;
import android.os.SystemProperties;
import android.text.format.Time;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

public final class aqwe {
    public static final String a;
    private static final baun b;
    private final Context c;
    private final aqwn d;
    private final aqpv e;

    static {
        aqwe.b = aqql.a("BackupHttpRequestUtil");
        aqwe.a = String.format("Gms-Backup/%s (gzip)", ((int)0xF1B18AD));
    }

    public aqwe(Context context0, aqwn aqwn0, aqpv aqpv0) {
        this.c = context0;
        this.d = aqwn0;
        this.e = aqpv0;
    }

    public static aqwe a(Context context0) {
        if(hqlt.E()) {
            aqpv aqpv0 = new aqpv(aqpw.a(context0), new aqnm(hqln.c()));
            return new aqwe(context0, aqwn.a(context0), aqpv0);
        }
        return new aqwe(context0, aqwn.a(context0), null);
    }

    public final aqfo b(Account account0, ProtoLiteBuilder hftp0, ref ref0, boolean z, int v) {
        int v1 = 1;
        int v2 = this.e == null || !hqlt.E() ? 1 : 2;
        gfsx gfsx0 = this.d.b();
        if(gfsx0.i()) {
            String s = (String)gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqfe aqfe0 = (aqfe)hftp0.b_message;
            aqfe0.b |= 0x400;
            aqfe0.j = s;
        }
        aqwh aqwh0 = aqwh.a(hftp0);
        String s1 = bbnp.d(this.c) ? String.format("https://%s/backup", SystemProperties.get("gms.backup.sw_domain", "android.googleapis.com")) : hqlt.a.o().J();
        baun baun0 = aqwe.b;
        baun0.d("Routing request of type %s", new Object[]{aqwh0});
        switch(aqwh0.ordinal()) {
            case 0: {
                if(!hqlz.a.b().a()) {
                    s1 = s1 + "/backup";
                }
                else if(z) {
                    s1 = s1 + "/backup?userinitiated=true";
                }
                else {
                    s1 = s1 + "/backup?userinitiated=false";
                }
                break;
            }
            case 2: {
                s1 = s1 + "/listdevices";
                break;
            }
            case 3: {
                s1 = s1 + "/cleardevice";
                break;
            }
            case 4: 
            case 5: {
                break;
            }
            case 1: 
            case 6: {
                s1 = s1 + "/restore";
                break;
            }
            default: {
                baun0.d("Unknown type of request when routing url", new Object[0]);
            }
        }
        String s2 = s1;
        if(v2 == 2) {
            baun0.d("Moscato Server request via gRPC for type: %s", new Object[]{aqwh0.toString()});
        }
        else {
            baun0.d("Legacy Server request url: %s", new Object[]{s2});
        }
        switch(aqwh0.ordinal()) {
            case 0: {
                v1 = (int)hqhn.a.d().c();
                break;
            }
            case 1: {
                v1 = (int)hqhn.a.d().g();
                break;
            }
            case 2: {
                v1 = (int)hqhn.a.d().f();
                break;
            }
            case 3: {
                v1 = (int)hqhn.a.d().d();
                break;
            }
            case 6: {
                v1 = (int)hqhn.a.d().e();
            }
        }
        int v3 = v1 - 1;
        while(v3 > 0) {
            try {
                return this.e(account0, s2, hftp0, ref0, v2, v);
            }
            catch(aqxy aqxy0) {
                if(aqxy0.a == 503) {
                    throw aqxy0;
                }
                aqwe.d(aqxy0, aqwh0, v3);
            }
            catch(IOException iOException0) {
                aqwe.d(iOException0, aqwh0, v3);
            }
            --v3;
            s2 = s2;
        }
        return this.e(account0, s2, hftp0, ref0, v2, v);
    }

    public final aqfo c(Account account0, ProtoLiteBuilder hftp0) {
        return this.b(account0, hftp0, null, false, -1);
    }

    private static void d(Exception exception0, aqwh aqwh0, int v) {
        aqwe.b.g("Transient error encountered during %s. Will retry %d more times.", exception0, new Object[]{aqwh0, v});
    }

    private final aqfo e(Account account0, String s, ProtoLiteBuilder hftp0, ref ref0, int v, int v1) {
        int v11;
        int v10;
        rec rec1;
        int v9;
        DataOutputStream dataOutputStream0;
        HttpURLConnection httpURLConnection0;
        baun baun0;
        byte[] arr_b2;
        aqfo aqfo0;
        hltl hltl0;
        aqqc aqqc0;
        int v4;
        Closeable closeable0;
        try {
            TrafficStats.setThreadStatsTagBackup();
            int v2 = 200;
            int v3 = 3;
            closeable0 = null;
            v4 = 503;
            if(v == 2) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                aqfe aqfe0 = (aqfe)hftp0.b_message;
                aqfe0.b |= 16;
                aqfe0.f = "";
                try {
                    aqpv aqpv0 = this.e;
                    aqfe aqfe1 = (aqfe)hftp0.N_build();
                    Context context0 = this.c;
                    byte[] arr_b = aqfe1.toBytesArray();
                    hftc hftc0 = hftc.a();
                    hlti hlti0 = hlti.a;
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hlti0), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    aqwh aqwh0 = aqwh.a(aqfe1);
                    if(aqwh0 == aqwh.a && hqlt.a.o().aK()) {
                        gftb.b(((boolean)(context0 instanceof Activity ^ 1)), "The context provided should be Application context");
                        bbfe_BaseGrpcServer bbfe0 = aqpw.b(context0, v1);
                        if(hqlt.D()) {
                            bbfe0.addHeader("x-backup-gmsversion", Integer.toString(0xF1B18AD));
                        }
                        aqqc0 = new aqqc(bbfe0);
                    }
                    else {
                        aqqc0 = aqpv0.b;
                    }
                    ckcq ckcq0 = aqwh.a(aqfe1) == aqwh.c ? ckaz.c : ckaz.b;
                    aqqc aqqc1 = new aqqc(aqqc0, cmlp.a, ckcq0);
                    baqr baqr0 = aqpv0.c.a(account0);
                    long v5 = hqlt.a.o().A();
                    switch(aqwh0.ordinal()) {
                        case 0: 
                        case 7: {
                            break;
                        }
                        case 1: 
                        case 2: 
                        case 4: 
                        case 6: 
                        case 8: {
                            v3 = 1;
                            break;
                        }
                        case 3: 
                        case 5: 
                        case 9: {
                            v3 = 2;
                            break;
                        }
                        default: {
                            throw new RuntimeException(null, null);
                        }
                    }
                    switch(v3 - 1) {
                        case 0: {
                            if(aqqc.a == null) {
                                ibjh ibjh2 = new ibjh(((MessageLite)hlti0));
                                ibjh ibjh3 = new ibjh(((MessageLite)hltl.a));
                                aqqc.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.apps.backup.androidplatformbackuprestore.v1.AndroidPlatformBackupRestoreService/HandleBackupRequestHighPri", ((gRPCMarshaller)ibjh2), ((gRPCMarshaller)ibjh3), false);
                            }
                            hltl0 = (hltl)aqqc1.e.callUnaryWithAuth(aqqc.a, baqr0, ((hlti)hftv0), v5, TimeUnit.MILLISECONDS, aqqc1.f);
                            break;
                        }
                        case 1: {
                            if(aqqc.b == null) {
                                ibjh ibjh4 = new ibjh(((MessageLite)hlti0));
                                ibjh ibjh5 = new ibjh(((MessageLite)hltl.a));
                                aqqc.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.apps.backup.androidplatformbackuprestore.v1.AndroidPlatformBackupRestoreService/HandleBackupRequestMidPri", ((gRPCMarshaller)ibjh4), ((gRPCMarshaller)ibjh5), false);
                            }
                            hltl0 = (hltl)aqqc1.e.callUnaryWithAuth(aqqc.b, baqr0, ((hlti)hftv0), v5, TimeUnit.MILLISECONDS, aqqc1.f);
                            break;
                        }
                        default: {
                            if(aqqc.c == null) {
                                ibjh ibjh0 = new ibjh(((MessageLite)hlti0));
                                ibjh ibjh1 = new ibjh(((MessageLite)hltl.a));
                                aqqc.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.apps.backup.androidplatformbackuprestore.v1.AndroidPlatformBackupRestoreService/HandleBackupRequestLowPri", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                            }
                            hltl0 = (hltl)aqqc1.e.callUnaryWithAuth(aqqc.c, baqr0, ((hlti)hftv0), v5, TimeUnit.MILLISECONDS, aqqc1.f);
                        }
                    }
                }
                catch(iapl | iapn exception0) {
                    iaph iaph0 = iapk.d(exception0).t;
                    String s1 = "Non-OK status (" + iaph0.name() + ") when contacting Moscato, message: " + exception0.getMessage();
                    switch(iaph0.ordinal()) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            v2 = 0x1F3;
                            break;
                        }
                        case 4: {
                            v2 = 504;
                            break;
                        }
                        case 5: {
                            v2 = 404;
                            break;
                        }
                        case 7: {
                            v2 = 403;
                            break;
                        }
                        case 8: {
                            v2 = 429;
                            break;
                        }
                        case 6: 
                        case 10: {
                            v2 = 409;
                            break;
                        }
                        case 3: 
                        case 9: 
                        case 11: {
                            v2 = 400;
                            break;
                        }
                        case 12: {
                            v2 = 501;
                            break;
                        }
                        case 14: {
                            v2 = 503;
                            break;
                        }
                        case 16: {
                            v2 = 401;
                            break;
                        }
                        default: {
                            v2 = 500;
                        }
                    }
                    throw new aqxy(s1, v2);
                }
                byte[] arr_b1 = hltl0.toBytesArray();
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aqfo.a), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                aqfo0 = (aqfo)hftv1;
            }
            else {
                arr_b2 = ((aqfe)hftp0.N_build()).toBytesArray();
                baun0 = aqwe.b;
                baun0.d("sending request: %d bytes", new Object[]{((int)arr_b2.length)});
                goto label_91;
            }
            goto label_179;
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
        try {
        label_91:
            URL uRL0 = new URL(s);
            httpURLConnection0 = null;
            httpURLConnection0 = aqwm.b(this.c, uRL0);
            httpURLConnection0.setRequestMethod("POST");
            httpURLConnection0.setRequestProperty("User-Agent", aqwe.a);
            httpURLConnection0.setRequestProperty("Content-Type", "application/octet-stream");
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setDoOutput(true);
            dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
        }
        catch(Throwable throwable1) {
            goto label_174;
        }
        try {
            dataOutputStream0.write(arr_b2);
            dataOutputStream0.flush();
            dataOutputStream0.close();
        }
        catch(Throwable throwable1) {
            closeable0 = dataOutputStream0;
            goto label_174;
        }
        try {
            int v6 = httpURLConnection0.getResponseCode();
            baun0.h("Http Response Code: %d", new Object[]{v6});
            if(v6 == 503) {
                String s2 = httpURLConnection0.getHeaderField("Retry-After");
                if(s2 != null && ref0 != null) {
                    try {
                        ref0.b(Long.parseLong(s2) * 1000L + System.currentTimeMillis());
                    }
                    catch(NumberFormatException unused_ex) {
                        try {
                            Matcher matcher0 = red.a.matcher(s2);
                            if(matcher0.find()) {
                                v10 = red.a(matcher0.group(1));
                                v11 = red.b(matcher0.group(2));
                                v9 = red.c(matcher0.group(3));
                                rec1 = red.d(matcher0.group(4));
                            }
                            else {
                                Matcher matcher1 = red.b.matcher(s2);
                                if(!matcher1.find()) {
                                    throw new IllegalArgumentException();
                                }
                                int v7 = red.b(matcher1.group(1));
                                int v8 = red.a(matcher1.group(2));
                                rec rec0 = red.d(matcher1.group(3));
                                v9 = red.c(matcher1.group(4));
                                rec1 = rec0;
                                v10 = v8;
                                v11 = v7;
                            }
                            Time time0 = new Time("UTC");
                            time0.set(rec1.c, rec1.b, rec1.a, (v9 < 0x7F6 ? v10 : 1), (v9 < 0x7F6 ? v11 : 0), (v9 < 0x7F6 ? v9 : 0x7F6));
                            ref0.b(time0.toMillis(false));
                        }
                        catch(IllegalArgumentException unused_ex) {
                            aqwe.b.f("Invalid Retry-After date: %s", new Object[]{s2});
                            goto label_140;
                        }
                    }
                    aqwe.b.d("got 503 Retry-After: %s", new Object[]{s2});
                }
            }
            else {
                v4 = v6;
            }
        label_140:
            if(v4 != 200) {
                throw new aqxy(a.v(new String(ghjj.g(httpURLConnection0.getErrorStream()), "UTF-8"), "Server rejected http request: "), v4);
            }
            if(httpURLConnection0.getInputStream() == null) {
                throw new IOException("Missing response body");
            }
            hfsl hfsl0 = hfsl.N(httpURLConnection0.getInputStream());
            hftc hftc2 = hftc.a();
            ProtoLiteMessage hftv2 = ((ProtoLiteMessage)aqfo.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv2);
                hfwc0.l(hftv2, hfsm.p(hfsl0), hftc2);
                hfwc0.g(hftv2);
            }
            catch(hfur hfur0) {
                if(hfur0.b) {
                    hfur0 = new hfur(hfur0);
                }
                hfur0.a = hftv2;
                throw hfur0;
            }
            catch(hfwr hfwr0) {
                hfur hfur1 = hfwr0.a();
                hfur1.a = hftv2;
                throw hfur1;
            }
            catch(IOException iOException0) {
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur2 = new hfur(iOException0);
                hfur2.a = hftv2;
                throw hfur2;
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            ProtoLiteMessage.P_makeImmutable(hftv2);
            aqfo0 = (aqfo)hftv2;
            goto label_178;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_174:
            ghjp.b(closeable0);
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            throw throwable1;
        label_178:
            httpURLConnection0.disconnect();
        label_179:
            if((aqfo0.b & 8) != 0) {
                String s3 = aqfo0.e;
                try {
                    SharedPreferences.Editor sharedPreferences$Editor0 = this.d.b.edit();
                    sharedPreferences$Editor0.putString("versionInfoToken", s3);
                    sharedPreferences$Editor0.putLong("versionInfoTimestamp", System.currentTimeMillis());
                    sharedPreferences$Editor0.apply();
                }
                catch(bakb bakb0) {
                    aqwn.a.n("Error writing version_info to shared preferences", bakb0, new Object[0]);
                }
            }
        }
        catch(Throwable throwable0) {
            TrafficStats.clearThreadStatsTag();
            throw throwable0;
        }
        TrafficStats.clearThreadStatsTag();
        return aqfo0;
    }
}

