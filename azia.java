import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class azia {
    static String a;
    public final Context b;
    public final azgf c;
    public final azdl d;
    public final ModuleManager e;
    public final boolean f;
    public final azbj g;
    private static final Object h;
    private static actv i;
    private final azgx j;
    private final azhq k;

    static {
        azia.h = new Object();
    }

    public azia(Context context0, azgf azgf0, azgx azgx0, azdl azdl0, azbj azbj0, ModuleManager moduleManager0, azhq azhq0, boolean z) {
        this.b = context0;
        this.c = azgf0;
        this.j = azgx0;
        this.d = azdl0;
        this.g = azbj0;
        this.e = moduleManager0;
        this.k = azhq0;
        this.f = z;
    }

    public static azfx a(Context context0, azbj azbj0, azbh azbh0) {
        try {
            return azhd.a(context0, "CLEARCUT_FUNNEL", ((MessageLite)azbh0.a), ayvn.c, true, azbh0.b);
        }
        catch(IOException iOException0) {
            Log.e("CCTUploader", "failed to serialize funnel event", iOException0);
            azbj0.b();
            return null;
        }
    }

    public final azhz b(hlsi hlsi0, azgp azgp0, boolean z) {
        String s2;
        gdqb gdqb2;
        azhz azhz0;
        String s1;
        gdqb gdqb1;
        boolean z10;
        Object object4;
        String s7;
        SharedPreferences sharedPreferences0;
        Throwable throwable5;
        hlqg hlqg0;
        Context context3;
        long v6;
        int v5;
        hlpt hlpt0;
        ProtoLiteMessage hftv0;
        hftc hftc0;
        int v4;
        int v3;
        azgw azgw1;
        azgw azgw0;
        boolean z6;
        String s6;
        String s5;
        azgx azgx0;
        azgp azgp1;
        gfsx gfsx0;
        PackageManager packageManager0;
        boolean z4;
        long v1;
        azhy azhy0;
        String s;
        long v;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/uploader/Uploader", "uploadLogRequest", 292, "Uploader#uploadLogRequest");
        try {
            v = SystemClock.elapsedRealtime();
            s = hlsi0.f;
            azhy0 = azhz.a();
        }
        catch(Throwable throwable0) {
            gdqb2 = gdqb0;
            goto label_364;
        }
        if(s.isEmpty()) {
            s2 = null;
            try {
            label_43:
                v1 = SystemClock.elapsedRealtime();
                boolean z2 = hraz.h();
            }
            catch(Throwable throwable0) {
                gdqb2 = gdqb0;
                goto label_364;
            }
            if(z2) {
                try {
                    ConnectivityManager connectivityManager0 = (ConnectivityManager)this.b.getSystemService("connectivity");
                    if(connectivityManager0 == null) {
                        z4 = false;
                    }
                    else {
                        boolean z3 = connectivityManager0.isDefaultNetworkActive();
                        z4 = z3;
                    }
                }
                catch(Throwable throwable1) {
                    throwable5 = throwable1;
                    gdqb2 = gdqb0;
                    goto label_365;
                }
            }
            else {
                z4 = false;
            }
            try {
                try {
                    boolean z5 = hraz.g();
                }
                catch(IOException iOException0) {
                    azgp1 = azgp0;
                    z6 = z4;
                    goto label_128;
                }
                try {
                    if(z5) {
                        Context context1 = this.b;
                        if((hlsi0.b & 2) == 0) {
                            gfsx0 = gfqx.a;
                        }
                        else {
                            packageManager0 = context1.getPackageManager();
                            goto label_66;
                        }
                    }
                    else {
                        gfsx0 = gfqx.a;
                    }
                    goto label_84;
                }
                catch(IOException iOException0) {
                    azgp1 = azgp0;
                    z6 = z4;
                    goto label_128;
                }
            }
            catch(Throwable throwable4) {
                azgp1 = azgp0;
                goto label_140;
            }
        label_66:
            if(packageManager0 == null) {
                try {
                    Log.e("CCTPLCUtil", "Cannot get PackageManager");
                    gfsx0 = gfqx.a;
                }
                catch(IOException iOException0) {
                    azgp1 = azgp0;
                    z6 = z4;
                    goto label_128;
                }
                catch(Throwable throwable4) {
                    azgp1 = azgp0;
                    goto label_140;
                }
            }
            else {
                try {
                    try {
                        ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(hlsi0.c, 0);
                        if(applicationInfo0 == null) {
                            Log.e("CCTPLCUtil", "Cannot get ApplicationInfo of " + hlsi0.c);
                            gfsx0 = gfqx.a;
                        }
                        else {
                            gfsx0 = gfsx.m(Integer.valueOf(applicationInfo0.uid));
                        }
                        goto label_84;
                    }
                    catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    }
                    catch(IOException iOException0) {
                        azgp1 = azgp0;
                        z6 = z4;
                        goto label_128;
                    }
                    try {
                        Log.e("CCTPLCUtil", "package name " + hlsi0.c + " not found", packageManager$NameNotFoundException0);
                        gfsx0 = gfqx.a;
                        goto label_84;
                    }
                    catch(IOException iOException0) {
                        azgp1 = azgp0;
                        z6 = z4;
                        goto label_128;
                    }
                }
                catch(Throwable throwable4) {
                    azgp1 = azgp0;
                    goto label_140;
                }
                azgp1 = azgp0;
                z6 = z4;
                goto label_128;
            }
            try {
            label_84:
                if(gfsx0.i()) {
                    bbfj.c(0x1065FFF, ((Integer)gfsx0.d()).intValue());
                }
                else {
                    bbfj.b(0x1065FFF);
                }
                if(hraz.a.e().P()) {
                    Context context2 = this.b;
                    if(azib.f(context2)) {
                        cmdb.a(context2).c(38);
                    }
                    if(!azib.d(context2)) {
                        int v2 = azib.a(context2);
                        if(v2 < 70 && v2 >= 50) {
                            cmdb.a(context2).c(39);
                        }
                        else if(v2 < 50 && v2 >= 30) {
                            cmdb.a(context2).c(40);
                        }
                        else if(v2 < 30) {
                            cmdb.a(context2).c(41);
                        }
                    }
                    if(azib.e(context2)) {
                        cmdb.a(context2).c(42);
                    }
                }
                azgx0 = this.j;
                if(s2 == null) {
                    s5 = null;
                }
                else {
                    String s3 = azia.d();
                    String s4 = s3 != null && s3.startsWith("oauth2:") ? "Bearer ".concat(s2) : "GoogleLogin auth=".concat(s2);
                    s5 = s4;
                }
                s6 = (String)aywo.a.b();
            }
            catch(IOException iOException0) {
                azgp1 = azgp0;
                z6 = z4;
                goto label_128;
            }
            catch(Throwable throwable4) {
                azgp1 = azgp0;
                goto label_140;
            }
            azgp1 = azgp0;
            z6 = z4;
            try {
                azgw0 = azgx0.a(hlsi0, azgp1, s5, s6, gfsx0);
                goto label_149;
            }
            catch(IOException iOException0) {
                try {
                label_128:
                    Log.w("CCTUploader", String.format("Clearcut transport failed to make network request after %d milliseconds.", ((long)(SystemClock.elapsedRealtime() - v1))), iOException0);
                }
                catch(Throwable throwable4) {
                    goto label_140;
                }
                try {
                    boolean z7 = hrll.c();
                }
                catch(Throwable throwable0) {
                    gdqb2 = gdqb0;
                    goto label_364;
                }
                if(z7) {
                    try {
                        for(Object object1: azgp1.c()) {
                            bain.a.a("Clearcut upload: ".concat(String.valueOf(((String)object1))));
                        }
                    }
                    catch(Throwable throwable1) {
                        throwable5 = throwable1;
                        gdqb2 = gdqb0;
                        goto label_365;
                    }
                }
                try {
                    bbfj.a();
                    azgw1 = null;
                    goto label_157;
                }
                catch(Throwable throwable0) {
                    gdqb2 = gdqb0;
                    goto label_364;
                }
            }
            catch(Throwable throwable4) {
            }
        label_140:
            gdqb2 = gdqb0;
            try {
                if(hrll.c()) {
                    for(Object object2: azgp1.c()) {
                        bain.a.a("Clearcut upload: ".concat(String.valueOf(((String)object2))));
                    }
                }
                bbfj.a();
                throw throwable4;
            }
            catch(Throwable throwable0) {
                goto label_364;
            }
            try {
            label_149:
                if(hrll.c()) {
                    for(Object object3: azgp1.c()) {
                        bain.a.a("Clearcut upload: ".concat(String.valueOf(((String)object3))));
                    }
                }
                bbfj.a();
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                gdqb2 = gdqb0;
                goto label_365;
            }
            azgw1 = azgw0;
            try {
            label_157:
                if(azgw1 == null) {
                    goto label_300;
                }
                else {
                    v3 = azgw1.b;
                    boolean z8 = hqzp.e();
                    goto label_160;
                }
                goto label_303;
            }
            catch(Throwable throwable0) {
                gdqb2 = gdqb0;
                goto label_364;
            }
            try {
            label_160:
                if(z8) {
                    azhy0.e(v3);
                }
                v4 = 3;
                if(v3 == 0xCF) {
                    goto label_201;
                }
                else if(v3 < 200 || v3 >= 300) {
                    switch(v3) {
                        case 400: {
                            goto label_168;
                        }
                        case 401: {
                            goto label_171;
                        }
                        case 500: {
                            goto label_186;
                        }
                        case 501: {
                            goto label_188;
                        }
                        case 502: {
                            goto label_190;
                        }
                        case 503: {
                            goto label_192;
                        }
                        case 504: {
                            goto label_194;
                        }
                        case 507: {
                            goto label_196;
                        }
                    }
                }
                else {
                    v4 = 4;
                }
                goto label_202;
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                gdqb2 = gdqb0;
                goto label_365;
            }
            try {
                Log.e("CCTUploader", "Unexpected error received from server: " + v3 + " " + azgw1.c);
                goto label_202;
            }
            catch(Throwable throwable0) {
                gdqb2 = gdqb0;
                goto label_364;
            }
            try {
            label_168:
                Log.e("CCTUploader", "Server returned 400... deleting local malformed logs");
                v4 = 7;
                goto label_202;
            label_171:
                Log.w("CCTUploader", "Server returned 401... invalidating auth token");
                if(s2 != null) {
                    try {
                        try {
                            evrg.n(azia.c(this.b).b(s2));
                            goto label_202;
                        }
                        catch(ExecutionException executionException0) {
                            if((executionException0.getCause() instanceof acse)) {
                                throw (acse)executionException0.getCause();
                            }
                            Log.w("CCTUploader", "Unexpected exception while clearing token", executionException0);
                            goto label_202;
                        }
                        catch(InterruptedException interruptedException0) {
                            Thread.currentThread().interrupt();
                            throw new IOException(interruptedException0);
                        }
                    }
                    catch(acse | IOException exception1) {
                        Log.w("CCTUploader", "Exception clearing auth token", exception1);
                        goto label_202;
                    }
                label_186:
                    Log.w("CCTUploader", "Server returned 500...");
                    goto label_202;
                label_188:
                    Log.w("CCTUploader", "Server returned 501... service doesn\'t seem to exist");
                    goto label_202;
                label_190:
                    Log.w("CCTUploader", "Server returned 502... servers are down");
                    goto label_202;
                label_192:
                    Log.w("CCTUploader", "Server returned 503... service is unavailable");
                    goto label_202;
                label_194:
                    Log.w("CCTUploader", "Server returned 504... timeout");
                    goto label_202;
                label_196:
                    Log.w("CCTUploader", "Server returned 507... downstream dependency error");
                    v4 = 5;
                    goto label_202;
                label_201:
                    v4 = 6;
                }
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                gdqb2 = gdqb0;
                goto label_365;
            }
            try {
            label_202:
                if(azie.d(((gful_cronetEngineProvider)new azhs()), "debug_ignore_response", Boolean.valueOf(false))) {
                    gdqb2 = gdqb0;
                    v5 = v4;
                    goto label_302;
                }
                else {
                    byte[] arr_b = azgw1.a;
                    if(arr_b == null) {
                        gdqb2 = gdqb0;
                        v5 = v4;
                        goto label_302;
                    }
                    else {
                        try {
                            hftc0 = hftc.a();
                        }
                        catch(hfur hfur0) {
                            goto label_215;
                        }
                        try {
                            hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hlpt.a), arr_b, 0, arr_b.length, hftc0);
                            goto label_211;
                        }
                        catch(hfur hfur0) {
                        }
                        gdqb2 = gdqb0;
                        goto label_216;
                    }
                }
                goto label_303;
            }
            catch(Throwable throwable0) {
                gdqb2 = gdqb0;
                goto label_364;
            }
            try {
                gdqb2 = gdqb0;
                goto label_216;
            }
            catch(Throwable throwable0) {
                goto label_364;
            }
            try {
            label_211:
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hlpt0 = (hlpt)hftv0;
                goto label_220;
            }
            catch(hfur hfur0) {
                try {
                label_215:
                    gdqb2 = gdqb0;
                label_216:
                    this.d.o();
                    Log.e("CCTUploader", "Error parsing log response content.", hfur0);
                    v5 = v4;
                }
                catch(Throwable throwable0) {
                    goto label_364;
                }
                goto label_302;
                try {
                label_220:
                    v6 = hlpt0.c;
                }
                catch(Throwable throwable0) {
                    gdqb2 = gdqb0;
                    goto label_364;
                }
                if(v6 >= 0L) {
                    try {
                        SharedPreferences.Editor sharedPreferences$Editor0 = this.k.a.getSharedPreferences("timing_control_pref", 0).edit();
                        sharedPreferences$Editor0.putLong("server_suggested_interval_millis", v6);
                        sharedPreferences$Editor0.apply();
                        try {
                        label_225:
                            if((hlpt0.b & 4) == 0) {
                                goto label_249;
                            }
                            else {
                                context3 = this.b;
                                hlqg0 = hlpt0.d;
                                goto label_228;
                            }
                            goto label_250;
                        }
                        catch(Throwable throwable0) {
                            gdqb2 = gdqb0;
                            goto label_364;
                        }
                    label_228:
                        if(hlqg0 == null) {
                            try {
                                hlqg0 = hlqg.a;
                                goto label_235;
                            }
                            catch(Throwable throwable1) {
                            }
                            throwable5 = throwable1;
                            gdqb2 = gdqb0;
                            goto label_365;
                        }
                        goto label_235;
                    }
                    catch(Throwable throwable1) {
                        throwable5 = throwable1;
                        gdqb2 = gdqb0;
                        goto label_365;
                    }
                }
                goto label_225;
                try {
                label_235:
                    sharedPreferences0 = context3.getSharedPreferences("QosTierPref", 0);
                    if(sharedPreferences0.contains("qos_tier_fingerprint")) {
                        long v7 = sharedPreferences0.getLong("qos_tier_fingerprint", 0x8000000000000000L);
                        goto label_242;
                    }
                    else {
                        goto label_245;
                    }
                    goto label_250;
                }
                catch(Throwable throwable0) {
                    gdqb2 = gdqb0;
                    goto label_364;
                }
            }
            catch(Throwable throwable0) {
                gdqb2 = gdqb0;
                goto label_364;
            }
        label_242:
            gdqb2 = gdqb0;
            try {
                if(v7 != hlqg0.c) {
                    azhj.c(sharedPreferences0, hlqg0);
                    azhj.c(context3.createDeviceProtectedStorageContext().getSharedPreferences("QosTierPref", 0), hlqg0);
                    goto label_250;
                label_245:
                    gdqb2 = gdqb0;
                    azhj.c(sharedPreferences0, hlqg0);
                    azhj.c(context3.createDeviceProtectedStorageContext().getSharedPreferences("QosTierPref", 0), hlqg0);
                    goto label_250;
                label_249:
                    gdqb2 = gdqb0;
                }
            label_250:
                if((hlpt0.b & 8) != 0) {
                    hlpx hlpx0 = hlpt0.e;
                    if(hlpx0 == null) {
                        hlpx0 = hlpx.a;
                    }
                    s7 = TextUtils.join(",", hlpx0.b);
                    object4 = azia.h;
                    __monitor_enter(object4);
                    goto label_257;
                }
                goto label_267;
            }
            catch(Throwable throwable0) {
                goto label_364;
            }
            try {
            label_257:
                if(azia.a == null || !s7.equals(azia.a)) {
                    SharedPreferences.Editor sharedPreferences$Editor1 = this.b.getSharedPreferences("CCTLogStoreUtil", 0).edit();
                    sharedPreferences$Editor1.putString("log_source_batching_blacklist", s7);
                    sharedPreferences$Editor1.apply();
                    azia.a = s7;
                }
                goto label_266;
            }
            catch(Throwable throwable6) {
                try {
                    __monitor_exit(object4);
                    throw throwable6;
                label_266:
                    __monitor_exit(object4);
                label_267:
                    if(hlpt0.g.size() > 0) {
                        hfuo hfuo0 = hlpt0.g;
                        hraz hraz0 = hraz.a;
                        if(hraz0.e().R()) {
                            gmbu.t(ejlh.a(), new azhv(this), gmap.a);
                        }
                        else if(hraz0.e().N()) {
                            ggdy ggdy0 = new ggdy();
                            for(Object object5: hfuo0) {
                                hlqh hlqh0 = (hlqh)object5;
                                String s8 = hlqh0.c;
                                String s9 = (hlqh0.b & 2) == 0 ? null : hlqh0.d;
                                ggdy0.i(new SessionZwiebackToken(s8, s9));
                            }
                            gged_interceptors gged0 = ggdy0.h();
                            ejkr ejkr0 = (ejkr)ejlh.g.mr();
                            gmcd gmcd0 = ejle.b(gged0, ejkr0, new fgvy());
                            Objects.requireNonNull(ejkr0);
                            gmcd0.hB(new ejlb(ejkr0), gmap.a);
                            gmbu.t(gmcd0, new azhw(this), gmap.a);
                        }
                    }
                    v5 = v4;
                    goto label_303;
                label_300:
                    gdqb2 = gdqb0;
                    v5 = 2;
                label_302:
                    hlpt0 = null;
                label_303:
                    azdl azdl1 = this.d;
                    azdl1.p(hlsi0, v5, z6);
                    if(v5 - 1 != 1 && v5 - 1 != 2) {
                        switch(v5 - 1) {
                            case 4: {
                                goto label_353;
                            }
                            case 5: {
                                goto label_319;
                            }
                        }
                        azbj azbj0 = this.g;
                        if(azbj0 != null && z) {
                            azbj0.b();
                        }
                        azdl1.j(hlsi0, azgp1.a() - v);
                        this.e(azgp1);
                        if(azbj0 != null) {
                            azbc azbc0 = v5 == 7 ? azbc.K : azbc.J;
                            this.f(azbc0, azgp1.c);
                            goto label_353;
                        label_319:
                            azdl1.j(hlsi0, azgp1.a() - v);
                            if(hlpt0 != null && hlpt0.f.size() > 0) {
                                ggfn ggfn0 = new ggfn();
                                for(Object object6: hlpt0.f) {
                                    int v8 = ((hlpw)object6).b;
                                    if(v8 >= 0 && hlpv.a(((hlpw)object6).c) == 2) {
                                        ggfn0.i(Integer.valueOf(v8));
                                    }
                                }
                                ggfp ggfp0 = ggfn0.h();
                                ArrayList arrayList0 = new ArrayList();
                                boolean z9 = z;
                                for(int v9 = 0; v9 < azgp1.b.size(); ++v9) {
                                    if(!ggfp0.contains(Integer.valueOf(v9))) {
                                        if(z9) {
                                            azbj azbj1 = this.g;
                                            if(azbj1 != null) {
                                                hlsi hlsi1 = azgp1.b(v9).b;
                                                if(hlsi1 != null && hlsi1.i.equals("CLEARCUT_FUNNEL")) {
                                                    azbj1.b();
                                                    z9 = false;
                                                    continue;
                                                }
                                            }
                                        }
                                        arrayList0.add(azgp1.b(v9));
                                    }
                                }
                                this.c.p(arrayList0);
                                if(this.g != null) {
                                    this.f(azbc.J, arrayList0);
                                }
                            }
                            else {
                                this.e(azgp1);
                                if(this.g != null) {
                                    this.f(azbc.L, azgp1.c);
                                }
                            }
                        }
                    label_353:
                        z10 = true;
                    }
                    else {
                        z10 = false;
                    }
                    if(z10) {
                        azhy0.f(System.currentTimeMillis());
                    }
                    else {
                        azhy0.d(System.currentTimeMillis());
                    }
                    azhy0.g(z10);
                    azhz0 = azhy0.a();
                    goto label_370;
                }
                catch(Throwable throwable0) {
                }
            }
        label_364:
            throwable5 = throwable0;
            try {
            label_365:
                gdqb2.close();
            }
            catch(Throwable throwable7) {
                throwable5.addSuppressed(throwable7);
            }
            throw throwable5;
        }
        else {
            try {
                gdqb1 = gdsp.e("com/google/android/gms/clearcut/uploader/Uploader", "getAuthToken", 836, "Uploader#getAuthToken");
            }
            catch(Throwable throwable1) {
                throwable5 = throwable1;
                gdqb2 = gdqb0;
                goto label_365;
            }
            try {
                Context context0 = this.b;
                boolean z1 = bbmn.m(context0, new Account(s, "com.google"));
                if(z1) {
                    try {
                        s1 = new adgg(context0).d(context0, new Account(s, "com.google"), azia.d(), null);
                    }
                    catch(IOException | acse | SecurityException exception0) {
                        this.d.d(2, null);
                        if(Log.isLoggable("CCTUploader", 4)) {
                            Log.i("CCTUploader", "Failed to get auth token due to ".concat(String.valueOf(exception0.getClass())));
                        }
                        s1 = null;
                    }
                }
                else {
                    azdl azdl0 = this.d;
                    azdl0.d(1, null);
                    for(Object object0: azgp0.c()) {
                        azdl0.d(1, ((String)object0));
                    }
                    Log.i("CCTUploader", "Failed to get auth token for log sources [" + azgp0.c().toString() + "] because the account doesn\'t exist on the device.");
                    s1 = null;
                }
                if(s1 != null) {
                    this.d.d(0, null);
                }
                goto label_34;
            }
            catch(Throwable throwable2) {
                try {
                    gdqb1.close();
                    throw throwable2;
                }
                catch(Throwable throwable3) {
                    try {
                        throwable2.addSuppressed(throwable3);
                        throw throwable2;
                    label_34:
                        gdqb1.close();
                        if(s1 == null) {
                            azhy0.g(true);
                            azhz0 = azhy0.a();
                            gdqb2 = gdqb0;
                        }
                        else {
                            s2 = s1;
                            goto label_43;
                        }
                        goto label_370;
                    }
                    catch(Throwable throwable1) {
                        throwable5 = throwable1;
                        gdqb2 = gdqb0;
                        goto label_365;
                    }
                }
            }
            goto label_43;
        }
    label_370:
        gdqb2.close();
        return azhz0;
    }

    private static actv c(Context context0) {
        synchronized(azia.class) {
            if(azia.i == null) {
                azia.i = new adfy(context0.getApplicationContext());
            }
        }
        return azia.i;
    }

    private static String d() {
        String s = azie.c(((gful_cronetEngineProvider)new azht()), "oauth2_developer_code", "https://www.googleapis.com/auth/cclog");
        return s.isEmpty() ? hraz.a.e().z() : "oauth2:" + s;
    }

    private final void e(azgp azgp0) {
        this.c.p(azgp0.c);
    }

    private final void f(azbc azbc0, List list0) {
        azbj azbj0 = this.g;
        if(azbj0 != null) {
            for(Object object0: list0) {
                azfx azfx0 = (azfx)object0;
                hlsi hlsi0 = azfx0.b;
                if(hlsi0 != null) {
                    gged_interceptors gged0 = azfx0.c;
                    String s = azif.b(hlsi0);
                    int v = gged0.size();
                    int v2 = 0;
                    for(int v1 = 0; v1 < v; ++v1) {
                        v2 += ((azfw)gged0.get(v1)).c;
                    }
                    azbj0.f(s, azbc0, v2);
                }
            }
        }
    }
}

