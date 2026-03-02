package com.google.android.gms.chimera.container;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import avzk;
import avzl;
import awer;
import aweu;
import awev;
import awew;
import awez;
import awjj;
import awjn;
import awjq;
import bars;
import bauc;
import bbdg;
import bblf;
import bblg;
import bbqq;
import bbra;
import ccmp;
import cjok;
import clim;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.chimera.container.gmsplatform.PackageWatcher.PackageStateReceiver;
import com.google.android.gms.dynamite.DynamiteModuleData;
import fhcd;
import gfta;
import gfud;
import gfuy;
import giju;
import gpgh;
import hrnf;
import hrpd;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import wyc;
import wyn;
import wzg;
import wzv;
import wzw;
import xbm;
import xde;
import xdf;
import xeb;
import xed;
import xee;
import xes;
import xik;
import xir;

public class GmsModuleChimeraProvider extends wzw implements clim {
    private static final UriMatcher d;
    private bbra e;
    private Context f;
    private awez g;

    static {
        UriMatcher uriMatcher0 = new UriMatcher(-1);
        GmsModuleChimeraProvider.d = uriMatcher0;
        uriMatcher0.addURI("*", "api/*", 1);
        uriMatcher0.addURI("*", "api_force_staging/*", 2);
    }

    @Override  // wzw
    protected final Bundle a(String s) {
        int v1;
        awev awev0;
        Bundle bundle0;
        Intent intent0 = BoundService.getStartIntent(this.c, s);
        if(intent0 == null) {
            bundle0 = null;
        }
        else {
            bundle0 = new Bundle();
            bundle0.putParcelable("serviceResponseIntentKey", intent0);
        }
        if(bundle0 != null) {
            return bundle0;
        }
        Bundle bundle1 = new Bundle();
        awez awez0 = this.g;
        String s1 = (String)awez0.c.get(s);
        if(s1 == null) {
            String s2 = hrpd.a.b().c();
            s1 = s2.isEmpty() ? null : ((String)gfud.g(",").i().d().o().a(s2).get(s));
        }
        if(s1 == null) {
            aweu aweu0 = awev.a();
            aweu0.b(false);
            awev0 = aweu0.a();
        }
        else {
            awew awew0 = awez0.b;
            Map map0 = awew0.d;
            synchronized(map0) {
                if(map0.containsKey(s1)) {
                    v1 = (int)(((Integer)awew0.d.get(s1)));
                }
                else {
                    PackageWatcher.PackageStateReceiver packageWatcher$PackageStateReceiver0 = awew0.b;
                    synchronized(packageWatcher$PackageStateReceiver0) {
                        if(!awew0.c) {
                            IntentFilter intentFilter0 = new IntentFilter();
                            intentFilter0.addAction("android.intent.action.PACKAGE_ADDED");
                            intentFilter0.addAction("android.intent.action.PACKAGE_REMOVED");
                            intentFilter0.addDataScheme("package");
                            bblf bblf0 = new bblf(new bblg(9));
                            awew0.a.registerReceiver(packageWatcher$PackageStateReceiver0, intentFilter0, null, bblf0);
                            awew0.c = true;
                        }
                    }
                    v1 = awew0.a(s1);
                }
            }
            switch(v1) {
                case 0: {
                    aweu aweu2 = awev.a();
                    aweu2.b(false);
                    Intent intent1 = bars.b(s1);
                    aweu2.b = cjok.a(awez0.a, 0, intent1, 0x4000000);
                    awev0 = aweu2.a();
                    break;
                }
                case 2: {
                    aweu aweu3 = awev.a();
                    aweu3.b(true);
                    aweu3.a = new Intent(s).setPackage(s1);
                    awev0 = aweu3.a();
                    break;
                }
                default: {
                    aweu aweu1 = awev.a();
                    aweu1.b(false);
                    awev0 = aweu1.a();
                }
            }
        }
        if(awev0.a) {
            bundle1.putParcelable("serviceResponseIntentKey", awev0.b);
            return bundle1.isEmpty() ? null : bundle1;
        }
        if(hrpd.a.b().d()) {
            PendingIntent pendingIntent0 = awev0.c;
            if(pendingIntent0 != null) {
                bundle1.putParcelable("serviceMissingResolutionIntentKey", pendingIntent0);
            }
        }
        return bundle1.isEmpty() ? null : bundle1;
    }

    @Override  // wzw
    public final void c() {
        awer.d().g();
    }

    @Override  // wzw
    public final Bundle call(String s, String s1, Bundle bundle0) {
        byte[] arr_b = null;
        if("api_dynamite_module_call".equals(s)) {
            if(!hrnf.a.b().h()) {
                Log.i("GmsModuleProvider", "Dynamite Module call interface not enabled.");
                return null;
            }
            if(bundle0 == null) {
                Log.w("GmsModuleProvider", "Parameters must be provided in extras.");
                return null;
            }
            String s2 = bundle0.getString("api_dynamite_module_module_id", "");
            if(gfta.c(s2)) {
                Log.w("GmsModuleProvider", "No valid module id!");
                return null;
            }
            if(!bundle0.containsKey("api_dynamite_module_force_staging")) {
                Log.w("GmsModuleProvider", "Force staging should be specified!");
                return null;
            }
            boolean z = bundle0.getBoolean("api_dynamite_module_force_staging", false);
            long v = bundle0.getLong("api_dynamite_module_start_time_ms", 0L);
            DynamiteModuleData dynamiteModuleData0 = awer.d().e(this.f, this.e, (v >= 0L ? v : 0L), s2, z, true, this.getCallingPackage());
            Bundle bundle1 = new Bundle(1);
            if(dynamiteModuleData0 == null) {
                return bundle1;
            }
            bundle1.putByteArray("api_dynamite_module_data", bauc.n(dynamiteModuleData0));
            new ccmp().a(bbdg.wh);
            return bundle1;
        }
        switch(s.hashCode()) {
            case -1102730960: {
                if(s.equals("featureCheckCall")) {
                    Bundle bundle2 = new Bundle();
                    if(bundle0 != null) {
                        arr_b = bundle0.getByteArray("featuresBundleKey");
                    }
                    if(arr_b == null) {
                        Log.e("ModuleProvider", "Missing extras key: featureCheckCall");
                        bundle2.putInt("featuresResult", 3);
                        return bundle2;
                    }
                    xed xed0 = this.b();
                    if(xed0 == null) {
                        Log.e("ModuleProvider", "An error occurred while trying to load the container features. All client api feature requests will fail.");
                        bundle2.putInt("featuresResult", 3);
                        return bundle2;
                    }
                    bundle2.putInt("featuresResult", xik.b(xed0, arr_b));
                    return bundle2;
                }
                break;
            }
            case 0xF7E4FBAF: {
                if(s.equals("serviceIntentCall")) {
                    String s3 = bundle0 == null ? null : bundle0.getString("serviceActionBundleKey");
                    if(s3 == null) {
                        Log.e("ModuleProvider", "Missing action in extras: serviceIntentCall");
                        return null;
                    }
                    return this.a(s3);
                }
                break;
            }
            case 0x5CC2A1E2: {
                if(s.equals("featureFetchCall")) {
                    Bundle bundle3 = new Bundle();
                    if(bundle0 == null) {
                        Log.e("ModuleProvider", "Missing extras bundle");
                        bundle3.putInt("featuresResult", 3);
                        return bundle3;
                    }
                    String[] arr_s = bundle0.getStringArray("featureNamesBundleKey");
                    if(arr_s != null && arr_s.length != 0) {
                        xed xed1 = this.b();
                        if(xed1 == null) {
                            Log.e("ModuleProvider", "An error occurred while trying to load the container features. All client api feature requests will fail.");
                            bundle3.putInt("featuresResult", 3);
                            return bundle3;
                        }
                        List list0 = xik.c(xed1, Arrays.asList(arr_s));
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)xdf.a).v_newBuilder();
                        hftp0.ah(list0);
                        bundle3.putByteArray("featuresResponseListKey", ((xdf)hftp0.N_build()).toBytesArray());
                        bundle3.putInt("featuresResult", 0);
                        return bundle3;
                    }
                    Log.e("ModuleProvider", "Missing feature names to fetch for key: featureNamesBundleKey");
                    bundle3.putInt("featuresResult", 3);
                    return bundle3;
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    private static long d(Uri uri0) {
        try {
            String s = uri0.getQueryParameter("requestStartUptime");
            if(s != null) {
                long v = Long.parseLong(s);
                return v >= 0L ? v : 0L;
            }
        }
        catch(NumberFormatException | UnsupportedOperationException exception0) {
            Log.w("GmsModuleProvider", "invalid request start time", exception0);
        }
        return 0L;
    }

    @Override  // wzw
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        xed xed1;
        xir xir0;
        xed xed0;
        wyc wyc0 = wyc.f();
        try {
            xed0 = wyc0.k();
            xir0 = wyc0.o(xed0);
        }
        catch(InvalidConfigException invalidConfigException0) {
            printWriter0.println("Unable to retrieve config: " + invalidConfigException0.toString());
            goto label_169;
        }
        printWriter0.println("Module Sets:");
        int v = xir0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            giju giju0 = (giju)xir0.get(v1);
            StringBuilder stringBuilder0 = new StringBuilder("  ");
            stringBuilder0.append("Module Set ID: ");
            stringBuilder0.append(giju0.c);
            stringBuilder0.append(", Module Set Version: ");
            stringBuilder0.append(giju0.f);
            if((giju0.e & 0x80) != 0) {
                stringBuilder0.append(" (placebo)");
            }
            printWriter0.println(stringBuilder0);
            if(giju0.g.size() > 0) {
                StringBuilder stringBuilder1 = new StringBuilder("      ");
                stringBuilder1.append("Enabled features: ");
                for(int v2 = 0; v2 < giju0.g.size(); ++v2) {
                    if(v2 > 0) {
                        stringBuilder1.append(", ");
                    }
                    stringBuilder1.append(((String)giju0.g.get(v2)));
                }
                printWriter0.println(stringBuilder1);
            }
        }
        printWriter0.println();
        printWriter0.println("Configuration Mode(s):");
        int v3 = xed0.c();
        if(v3 == 0) {
            printWriter0.println("  <default>");
        }
        else {
            for(int v4 = 0; v4 < v3; ++v4) {
                printWriter0.println("  " + xed0.n(v4));
            }
        }
        printWriter0.println();
        int v5 = xed0.b();
        if(v5 > 0) {
            printWriter0.println("Blocked Modules:");
            for(int v6 = 0; v6 < v5; ++v6) {
                printWriter0.println("  " + xed0.m(v6));
            }
            printWriter0.println();
        }
        printWriter0.println("Modules:");
        int v7 = xed0.e();
        ArrayList arrayList0 = new ArrayList(v7);
        for(int v8 = 0; v8 < v7; ++v8) {
            arrayList0.add(xed0.j(v8));
        }
        Collections.sort(arrayList0, wzw.b);
        String s = new File(wzg.e().b, "m").getAbsolutePath();
        String s1 = String.valueOf(File.separator);
        int v9 = xed0.a();
        xeb xeb0 = new xeb();
        int v10 = 0;
        int v11 = 0;
        while(v10 < v9) {
            xed0.h(xeb0, v10);
            StringBuilder stringBuilder2 = new StringBuilder("  ");
            stringBuilder2.append(xeb0.k());
            stringBuilder2.append(" [");
            stringBuilder2.append(xeb0.b());
            stringBuilder2.append("] [");
            String s2 = xeb0.m();
            if(!TextUtils.isEmpty(s2)) {
                stringBuilder2.append(s2);
                stringBuilder2.append("] [");
            }
            int v12 = xbm.a(xeb0.a());
            if(v12 == 0) {
                throw null;
            }
            switch(v12 - 1) {
                case 1: {
                    xed1 = xed0;
                    stringBuilder2.append("Container");
                    break;
                }
                case 2: {
                    xed1 = xed0;
                    stringBuilder2.append("Installed");
                    break;
                }
                default: {
                    xed1 = xed0;
                    switch(v12 - 1) {
                        case 3: {
                            int v13 = xes.a(xeb0.f());
                            if(v13 == 0) {
                                throw null;
                            }
                            switch(v13 - 1) {
                                case 1: {
                                    stringBuilder2.append("Container");
                                    break;
                                }
                                case 2: {
                                    stringBuilder2.append("Download");
                                    break;
                                }
                                case 3: {
                                    stringBuilder2.append("Installed");
                                    break;
                                }
                                case 4: {
                                    stringBuilder2.append("System");
                                    break;
                                }
                                default: {
                                    stringBuilder2.append("???");
                                }
                            }
                            String s3 = s + s1;
                            String s4 = xeb0.l();
                            if(s4.startsWith(s3)) {
                                s4 = s4.substring(s3.length());
                            }
                            stringBuilder2.append(":");
                            stringBuilder2.append(s4);
                            break;
                        }
                        case 4: {
                            stringBuilder2.append("Split");
                            break;
                        }
                        default: {
                            stringBuilder2.append("???");
                        }
                    }
                }
            }
            stringBuilder2.append("]");
            switch(xbm.a(xeb0.a())) {
                case 4: 
                case 5: {
                    stringBuilder2.append(" [");
                    stringBuilder2.append(xeb0.r());
                    if(xeb0.p() != null) {
                        stringBuilder2.append(":");
                        stringBuilder2.append(xeb0.p());
                    }
                    if(xeb0.q() != null) {
                        stringBuilder2.append(":");
                        stringBuilder2.append(xeb0.q());
                    }
                    stringBuilder2.append("]");
                }
            }
            printWriter0.println(stringBuilder2);
            int v14 = arrayList0.size();
            v11 = v11;
            boolean z;
            for(z = false; v11 < v14 && ((xee)arrayList0.get(v11)).at() == v10; z = true) {
                xee xee0 = (xee)arrayList0.get(v11);
                StringBuilder stringBuilder3 = new StringBuilder("      ");
                stringBuilder3.append(xee0.e());
                stringBuilder3.append(" [v");
                stringBuilder3.append(xee0.b());
                stringBuilder3.append("]");
                printWriter0.println(stringBuilder3);
                ++v11;
            }
            if(!z) {
                printWriter0.println("      No modules accepted");
            }
            ++v10;
            v9 = v9;
            xeb0 = xeb0;
            xed0 = xed1;
            continue;
        }
        xed xed2 = xed0;
        printWriter0.println();
        printWriter0.println("Features:");
        int v15 = xed2.d();
        gpgh gpgh0 = new gpgh();
        int v16 = 0;
        while(v16 < v15) {
            xed2.q(gpgh0, v16);
            StringBuilder stringBuilder4 = new StringBuilder("  ");
            stringBuilder4.append(gpgh0.ar());
            stringBuilder4.append(" [v");
            stringBuilder4.append(gpgh0.x());
            stringBuilder4.append("]");
            if(gpgh0.z()) {
                stringBuilder4.append(" [optional]");
            }
            printWriter0.println(stringBuilder4.toString());
            ++v16;
            xed2 = xed2;
        }
        printWriter0.println();
    label_169:
        printWriter0.println("\nModule Set Journal Entries:\n");
        avzk avzk0 = new avzk(fhcd.a(this.f.getApplicationContext()).getSharedPreferences("ChimeraConfigService", 4), true);
        awjj awjj0 = avzk0.f();
        Set set0 = avzk0.g();
        for(Object object0: awjj0.b) {
            String s5 = ((awjn)object0).c;
            printWriter0.println(s5 + ":" + ((awjn)object0).d + (set0.contains(s5) ? ":BLOCKED" : ""));
            printWriter0.println("-----");
            printWriter0.println(awjq.a(((awjn)object0)));
            printWriter0.println();
        }
        printWriter0.println("\nmodule_set_list: " + Base64.encodeToString(((byte[])avzl.d.b()), 2));
        printWriter0.println("required_features: " + Base64.encodeToString(((byte[])avzl.b.b()), 2));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)xde.a).v_newBuilder();
        hftp0.ag(wyn.d().f());
        printWriter0.println("requested_features: " + Base64.encodeToString(((xde)hftp0.N_build()).toBytesArray(), 2));
    }

    @Override  // wzw
    public final String getType(Uri uri0) {
        String s = wzw.a.match(uri0) == 1 ? "vnd.android.cursor.dir/features" : null;
        if(!TextUtils.isEmpty(s)) {
            return s;
        }
        switch(GmsModuleChimeraProvider.d.match(uri0)) {
            case 1: 
            case 2: {
                return "vnd.android.cursor.item/api";
            }
            default: {
                return null;
            }
        }
    }

    @Override  // wzw
    public final boolean onCreate() {
        Context context0 = this.getContext();
        gfuy.e(context0);
        this.c = context0;
        Context context1 = this.getContext();
        gfuy.e(context1);
        this.f = context1;
        this.e = new bbra(context1);
        if(this.g == null) {
            this.g = new awez(context1);
        }
        return true;
    }

    @Override  // com.google.android.chimera.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri0, String s) {
        long v;
        switch(GmsModuleChimeraProvider.d.match(uri0)) {
            case 1: 
            case 2: {
                List list0 = uri0.getPathSegments();
                if(list0.size() >= 2 && !((String)list0.get(1)).isEmpty()) {
                    try {
                        v = Long.parseLong(((String)list0.get(1)));
                    }
                    catch(NumberFormatException numberFormatException0) {
                        Log.e("GmsModuleProvider", "Invalid configLastModTime in openFile: " + numberFormatException0.toString());
                        return null;
                    }
                    wyc wyc0 = wyc.f();
                    try {
                        return wyc0.d(v);
                    }
                    catch(InvalidConfigException | IOException exception0) {
                        Log.e("GmsModuleProvider", "Failed to get config file descriptor: " + exception0.toString());
                        return null;
                    }
                }
                Log.e("GmsModuleProvider", "No configLastModTime in openFile");
                return null;
            }
            default: {
                return super.openFile(uri0, s);
            }
        }
    }

    @Override  // wzw
    public final Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        Cursor cursor1;
        boolean z;
        switch(GmsModuleChimeraProvider.d.match(uri0)) {
            case 1: {
                z = false;
                break;
            }
            case 2: {
                z = true;
                break;
            }
            default: {
                if(wzw.a.match(uri0) != 1) {
                    Log.e("ModuleProvider", "Unhandled query from " + this.getCallingPackage() + ": " + uri0);
                    return null;
                }
                xed xed0 = this.b();
                if(xed0 == null) {
                    return new MatrixCursor(wzv.a, 0);
                }
                int v1 = xed0.d();
                Cursor cursor0 = new MatrixCursor(wzv.a, v1);
                gpgh gpgh0 = new gpgh();
                for(int v = 0; v < v1; ++v) {
                    xed0.q(gpgh0, v);
                    ((MatrixCursor)cursor0).addRow(new Object[]{gpgh0.ar(), gpgh0.x()});
                }
                return cursor0;
            }
        }
        List list0 = uri0.getPathSegments();
        if(list0.size() >= 2 && !((String)list0.get(1)).isEmpty()) {
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = bbqq.a();
            try {
                DynamiteModuleData dynamiteModuleData0 = awer.d().e(this.f, this.e, GmsModuleChimeraProvider.d(uri0), ((String)list0.get(1)), z, true, this.getCallingPackage());
                if(dynamiteModuleData0 != null) {
                    new ccmp().a(bbdg.wg);
                }
                cursor1 = awer.b(dynamiteModuleData0);
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            return cursor1;
        }
        Log.e("GmsModuleProvider", "No featureName in query.");
        return null;
    }
}

