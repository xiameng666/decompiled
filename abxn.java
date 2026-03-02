import android.app.BroadcastOptions;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri.Builder;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.service.LightweightIndexChimeraService;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class abxn extends wby implements abxo, cjug {
    final bxgu a;
    final bwts b;
    final bwsx c;
    final bxgd d;
    final bxfz e;
    final elad f;
    final azql g;
    final gopj h;
    private static int i;
    private final String j;
    private final String k;
    private final LightweightIndexChimeraService l;
    private final Executor m;
    private final cjts n;
    private final String o;
    private final int p;

    public abxn() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public abxn(LightweightIndexChimeraService lightweightIndexChimeraService0, Executor executor0, cjts cjts0, String s, int v, bxgu bxgu0, bwts bwts0, bwsx bwsx0, bxgd bxgd0, bxfz bxfz0, azql azql0, gopj gopj0, String s1, String s2) {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        this.j = s1;
        this.k = s2;
        this.l = lightweightIndexChimeraService0;
        this.m = executor0;
        this.n = cjts0;
        this.o = s;
        this.p = v;
        this.a = bxgu0;
        this.b = bwts0;
        this.c = bwsx0;
        this.d = bxgd0;
        this.e = bxfz0;
        this.f = new elax(lightweightIndexChimeraService0);
        this.g = azql0;
        this.h = gopj0;
        if(abxn.i == 0) {
            PackageManager packageManager0 = lightweightIndexChimeraService0.getPackageManager();
            int v1 = 0;
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.google.android.googlequicksearchbox", 0);
                if(azql0.g("com.google.android.googlequicksearchbox") && packageInfo0.applicationInfo != null) {
                    v1 = packageInfo0.applicationInfo.uid;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            abxn.i = v1;
        }
    }

    @Override  // abxo
    public final void a(abxr abxr0, ApiMetadata apiMetadata0) {
        if(!bbmq.Y(this.l)) {
            throw new SecurityException("Access denied");
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.ch);
        azuf0.g(bbdq.am);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azug azug0 = azuf0.a();
        bxaq bxaq0 = new bxaq(abxr0, this.a, azug0);
        this.n.b(bxaq0);
    }

    @Override  // abxo
    public final void b(abxr abxr0, UsageInfo[] arr_usageInfo, ApiMetadata apiMetadata0) {
        String s6;
        DocumentSection[] arr_documentSection1;
        hftc hftc0;
        byte[] arr_b;
        String s2;
        String s1;
        int v1;
        LightweightIndexChimeraService lightweightIndexChimeraService1;
        try {
            String s = this.o;
            if(this.g.g(s)) {
                LightweightIndexChimeraService lightweightIndexChimeraService0 = this.l;
                int v = 0;
                while(true) {
                    if(v >= arr_usageInfo.length) {
                        this.g(arr_usageInfo);
                        this.e(abxr0, arr_usageInfo, "AppIndexApi", apiMetadata0);
                        return;
                    }
                    UsageInfo usageInfo0 = arr_usageInfo[v];
                    if(usageInfo0 == null) {
                        lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                        v1 = v;
                    }
                    else {
                        if(usageInfo0.c == 3) {
                            usageInfo0.h = 2;
                            usageInfo0.c = 4;
                        }
                        if(usageInfo0.h == 0) {
                            usageInfo0.h = 1;
                        }
                        DocumentId documentId0 = usageInfo0.a;
                        if(documentId0 == null) {
                        label_126:
                            s2 = "No document ID";
                        }
                        else {
                            if(TextUtils.isEmpty(documentId0.a)) {
                                s1 = "No package name specified";
                            }
                            else {
                                s1 = documentId0.b == null ? "Null corpus name specified" : bwnb.a("Uri", documentId0.c, 0x100);
                            }
                            if(s1 != null) {
                                lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                v1 = v;
                                s2 = s1;
                                goto label_129;
                            }
                            else if(usageInfo0.b >= 0L) {
                                int v2 = usageInfo0.c;
                                if(v2 < 0 || v2 > 5) {
                                    lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                    v1 = v;
                                    s2 = "Bad usage type: " + v2;
                                    goto label_129;
                                }
                                else {
                                    DocumentContents documentContents0 = usageInfo0.e;
                                    if(documentContents0 == null) {
                                        lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                        v1 = v;
                                        s2 = null;
                                        goto label_129;
                                    }
                                    else if(documentContents0.d == null || bbmn.m(lightweightIndexChimeraService0, documentContents0.d)) {
                                        DocumentSection[] arr_documentSection = documentContents0.a;
                                        if(arr_documentSection == null) {
                                            lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                            v1 = v;
                                            s2 = null;
                                            goto label_129;
                                        }
                                        else if(arr_documentSection.length <= 16) {
                                            int v3 = 0;
                                            boolean z = false;
                                            while(true) {
                                                if(v3 >= arr_documentSection.length) {
                                                    lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                                    v1 = v;
                                                    if(documentContents0.c && !z) {
                                                        s2 = "Global search enabled but no title or no data";
                                                        goto label_129;
                                                    }
                                                    s2 = null;
                                                    goto label_129;
                                                }
                                                DocumentSection documentSection0 = arr_documentSection[v3];
                                                String s3 = documentSection0.a();
                                                if(s3 != null) {
                                                    lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                                    v1 = v;
                                                    s2 = s3;
                                                    goto label_129;
                                                }
                                                bwna bwna0 = bwnb.b;
                                                RegisterSectionInfo registerSectionInfo0 = documentSection0.d;
                                                if("name".equals(registerSectionInfo0.h)) {
                                                    bwna0 = bwnb.a;
                                                }
                                                int v4 = documentSection0.e;
                                                if(v4 != DocumentSection.a) {
                                                    String s4 = abvx.b(v4);
                                                    if(!documentContents0.c) {
                                                        s2 = "Has global search fields but global search not enabled";
                                                        lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                                        v1 = v;
                                                        goto label_129;
                                                    }
                                                    else if(s4 != null && s4.equals("text1")) {
                                                        bwna0 = bwnb.a;
                                                        z = true;
                                                    }
                                                }
                                                if(".private:action".equals(registerSectionInfo0.a)) {
                                                    try {
                                                        arr_b = documentSection0.f;
                                                        if(arr_b == null) {
                                                            goto label_100;
                                                        }
                                                        else {
                                                            hftc0 = hftc.a();
                                                            goto label_89;
                                                        }
                                                        goto label_103;
                                                    }
                                                    catch(hfur unused_ex) {
                                                        lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                                        v1 = v;
                                                        s2 = "Malformed action provided";
                                                        goto label_129;
                                                    }
                                                label_89:
                                                    lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                                    v1 = v;
                                                    try {
                                                        arr_documentSection1 = arr_documentSection;
                                                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)igtn.a), arr_b, 0, arr_b.length, hftc0);
                                                        ProtoLiteMessage.P_makeImmutable(hftv0);
                                                        if(((igtn)hftv0).d.size() > 30) {
                                                            s2 = "Too many action properties declared (max: 30)";
                                                            Log.w("AppIndexApi", "Too many action properties declared (max: 30)");
                                                            goto label_129;
                                                        }
                                                        goto label_103;
                                                    }
                                                    catch(hfur unused_ex) {
                                                    }
                                                    s2 = "Malformed action provided";
                                                    goto label_129;
                                                }
                                                else {
                                                label_100:
                                                    lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                                                    v1 = v;
                                                    arr_documentSection1 = arr_documentSection;
                                                }
                                            label_103:
                                                String s5 = documentSection0.c;
                                                if(s5 == null) {
                                                    byte[] arr_b1 = documentSection0.f;
                                                    s6 = arr_b1 == null ? null : bwna0.b(arr_b1);
                                                }
                                                else {
                                                    s6 = bwna0.a(s5);
                                                }
                                                if(s6 != null) {
                                                    s2 = s6;
                                                    goto label_129;
                                                }
                                                ++v3;
                                                lightweightIndexChimeraService0 = lightweightIndexChimeraService1;
                                                v = v1;
                                                arr_documentSection = arr_documentSection1;
                                            }
                                        }
                                        else {
                                            s2 = "Too many sections";
                                            goto label_127;
                                        }
                                        s2 = "Invalid account specified";
                                        goto label_127;
                                    }
                                    else {
                                        s2 = "Invalid account specified";
                                        goto label_127;
                                    }
                                }
                                s2 = "Negative timestamp specified";
                                goto label_127;
                            }
                            else {
                                s2 = "Negative timestamp specified";
                                goto label_127;
                            }
                            goto label_126;
                        }
                    label_127:
                        lightweightIndexChimeraService1 = lightweightIndexChimeraService0;
                        v1 = v;
                    label_129:
                        if(s2 != null) {
                            Log.w("AppIndexApi", "Received an invalid action.");
                            bwne.v("Ignoring usage report, got bad usage info: %s, clientPackageName: %s", s2, s);
                            arr_usageInfo[v1] = null;
                        }
                    }
                    v = v1 + 1;
                    lightweightIndexChimeraService0 = lightweightIndexChimeraService1;
                }
            }
            bwts bwts0 = this.b;
            long v5 = huax.c();
            if(bwts0.m(v5, false)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glnq.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glnq glnq0 = (glnq)hftp1.b_message;
                s.getClass();
                glnq0.b |= 1;
                glnq0.c = s;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glnz glnz0 = (glnz)hftp0.b_message;
                glnq glnq1 = (glnq)hftp1.N_build();
                glnq1.getClass();
                glnz0.w = glnq1;
                glnz0.b |= 0x8000000;
                if(huae.g()) {
                    bwts0.a.d(cdef.dJ, 6017, hftp0);
                    return;
                }
                bwts0.s(6017, hftp0, v5);
            }
        }
        catch(Throwable throwable0) {
            bwne.w(throwable0, "Error reporting usage.", new Object[0]);
            if(!bbnp.p()) {
                throw throwable0;
            }
            try {
                abxr0.c(Status.d, ApiMetadata.b);
            }
            catch(Throwable unused_ex) {
                bwne.s("Client died while providing callback.");
            }
        }
    }

    public final void c(abxr abxr0, ActionImpl[] arr_actionImpl, glrs glrs0, glrq glrq0, String s) {
        try {
            abxr0.c(new Status(bwsz.b(glrs0), s), ApiMetadata.b);
        }
        catch(RemoteException remoteException0) {
            bwne.w(remoteException0, "Client died while providing callback for: %s", new Object[]{this.d(glrq0)});
        }
        this.f(glrq0, glrs0, (arr_actionImpl == null ? 0 : arr_actionImpl.length));
    }

    private final String d(glrq glrq0) {
        switch(glrq0.ordinal()) {
            case 3: {
                return "START[" + this.o + "]";
            }
            case 4: {
                return "END[" + this.o + "]";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    private final void e(abxr abxr0, UsageInfo[] arr_usageInfo, String s, ApiMetadata apiMetadata0) {
        int v3;
        Iterator iterator0;
        CodedOutputStream hfsq0;
        byte[] arr_b;
        int v1;
        BufferedOutputStream bufferedOutputStream0;
        if(arr_usageInfo == null) {
            throw new IllegalArgumentException("null usageInfo");
        }
        LightweightIndexChimeraService lightweightIndexChimeraService0 = this.l;
        String s1 = this.o;
        bxft.b(lightweightIndexChimeraService0, s1, arr_usageInfo, s);
        long v = System.currentTimeMillis();
        if(!bbnp.p() && huau.a.c().f()) {
            List list0 = bxgs.a(lightweightIndexChimeraService0, v);
            bwne.o("Not reporting usage and writing to app history debug file instead.");
            List list1 = bxft.a(lightweightIndexChimeraService0, s1, list0, arr_usageInfo);
            synchronized(bxft.a) {
                File file0 = lightweightIndexChimeraService0.getFilesDir();
                if(!(hrnt.i() ? new File(ccsb.a.b(file0, "icing_app_history_debug")) : new File(file0, "icing_app_history_debug")).exists()) {
                    bwne.a("App history debug file doesn\'t exist.");
                    goto label_76;
                }
            }
            try {
                bufferedOutputStream0 = null;
                bufferedOutputStream0 = new BufferedOutputStream(lightweightIndexChimeraService0.openFileOutput("icing_app_history_debug", 0x8000));
                arr_b = new byte[0x2000];
                hfsq0 = CodedOutputStream.ad(arr_b);
                iterator0 = list1.iterator();
                goto label_34;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                v1 = 0;
                goto label_58;
            }
            catch(IOException iOException0) {
                v1 = 0;
                goto label_62;
                try {
                    arr_b = new byte[0x2000];
                    hfsq0 = CodedOutputStream.ad(arr_b);
                    iterator0 = list1.iterator();
                    goto label_34;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                }
                catch(IOException iOException0) {
                    v1 = 0;
                    goto label_62;
                }
                catch(Throwable throwable1) {
                    goto label_67;
                }
                v1 = 0;
                goto label_58;
            label_34:
                v1 = 0;
                try {
                    while(iterator0.hasNext()) {
                        Object object1 = iterator0.next();
                        bxaf bxaf0 = (bxaf)object1;
                        if(((ProtoLiteMessage)bxaf0).isImmutable()) {
                            v3 = ((ProtoLiteMessage)bxaf0).t(null);
                            if(v3 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + v3);
                            }
                        }
                        else {
                            int v2 = bxaf0.memoizedSerializedSize & 0x7FFFFFFF;
                            if(v2 == 0x7FFFFFFF) {
                                v3 = ((ProtoLiteMessage)bxaf0).t(null);
                                if(v3 < 0) {
                                    throw new IllegalStateException("serialized size must be non-negative, was " + v3);
                                }
                                bxaf0.memoizedSerializedSize = bxaf0.memoizedSerializedSize & 0x80000000 | v3;
                            }
                            else {
                                v3 = v2;
                            }
                        }
                        hfsq0.writeRawVarint32(v3);
                        ((ProtoLiteMessage)bxaf0).writeTo(hfsq0);
                        ++v1;
                    }
                    bufferedOutputStream0.write(arr_b, 0, 0x2000 - hfsq0.spaceLeft());
                    goto label_70;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                }
                catch(IOException iOException0) {
                    goto label_62;
                }
                catch(Throwable throwable1) {
                    goto label_67;
                }
                try {
                label_58:
                    bwne.e(fileNotFoundException0, "Unable to create app history debug file.", new Object[0]);
                    if(bufferedOutputStream0 != null) {
                        goto label_70;
                    label_62:
                        bwne.e(iOException0, "Failed to write to app history debug file.", new Object[0]);
                        if(bufferedOutputStream0 != null) {
                            goto label_64;
                        }
                    }
                    goto label_71;
                }
                catch(Throwable throwable1) {
                    goto label_67;
                }
                try {
                label_64:
                    bufferedOutputStream0.close();
                    goto label_71;
                }
                catch(IOException unused_ex) {
                    goto label_71;
                }
                catch(Throwable throwable0) {
                }
            }
            catch(Throwable throwable1) {
            label_67:
                if(bufferedOutputStream0 == null) {
                    throw throwable1;
                }
                try {
                    try {
                        bufferedOutputStream0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                    throw throwable1;
                    try {
                    label_70:
                        bufferedOutputStream0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                label_71:
                    bwne.b("Dumped %d app history events to debug file.", Integer.valueOf(v1));
                    goto label_76;
                }
                catch(Throwable throwable0) {
                }
                throw throwable0;
            }
            throw throwable0;
        }
        else {
            bwne.o("App history debug disabled.");
        }
    label_76:
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.ch);
        azuf0.g(bbdq.am);
        azuf0.d(this.j);
        azuf0.c(this.k);
        azuf0.h(false);
        azug azug0 = azuf0.a();
        bxat bxat0 = new bxat(abxr0, this.f, this.a, this.b, arr_usageInfo, s1, azug0);
        this.n.b(bxat0);
    }

    private final void f(glrq glrq0, glrs glrs0, int v) {
        this.b.e(this.o, this.p, glrq0, glrs0, v, null, 0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        String s8;
        glrs glrs3;
        String s7;
        ActionImpl[] arr_actionImpl1;
        abxr abxr5;
        bwrx bwrx0;
        glrq glrq0;
        ActionImpl actionImpl0;
        abxr abxr4;
        abxr abxr3;
        abxr abxr2;
        abxr abxr1;
        abxr abxr0;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    abxr0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    abxr0 = (iInterface0 instanceof abxr) ? ((abxr)iInterface0) : new abxp(iBinder0);
                }
                parcel0.readString();
                UsageInfo[] arr_usageInfo = (UsageInfo[])parcel0.createTypedArray(UsageInfo.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxn.gr(parcel0);
                this.b(abxr0, arr_usageInfo, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    abxr1 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    abxr1 = (iInterface1 instanceof abxr) ? ((abxr)iInterface1) : new abxp(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxn.gr(parcel0);
                this.a(abxr1, apiMetadata1);
                break;
            }
            case 5: {
                GetRecentContextCall.Request getRecentContextCall$Request0 = (GetRecentContextCall.Request)wbz.a(parcel0, GetRecentContextCall.Request.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 == null) {
                    abxr2 = null;
                }
                else {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    abxr2 = (iInterface2 instanceof abxr) ? ((abxr)iInterface2) : new abxp(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxn.gr(parcel0);
                if(!this.h() && !bbmq.Y(this.l)) {
                    throw new SecurityException("Access denied");
                }
                azuf azuf0 = azug.b(apiMetadata2);
                azuf0.e(bbdp.ch);
                azuf0.g(bbdq.am);
                azuf0.d(this.j);
                azuf0.c(this.k);
                azug azug0 = azuf0.a();
                bxal bxal0 = new bxal(getRecentContextCall$Request0, abxr2, this.d, azug0);
                this.n.b(bxal0);
                break;
            }
            case 6: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    abxr3 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    abxr3 = (iInterface3 instanceof abxr) ? ((abxr)iInterface3) : new abxp(iBinder3);
                }
                parcel0.readString();
                String s = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                abxn.gr(parcel0);
                if(!this.h()) {
                    throw new SecurityException("Access denied");
                }
                try {
                    bxfz bxfz0 = this.e;
                    long v1 = System.currentTimeMillis();
                    if(s != null && this.o != null) {
                        bxfz0.a();
                        bxfy bxfy0 = new bxfy(v1);
                        bxfz0.b.put(s, bxfy0);
                    }
                    abxr3.c(Status.b, ApiMetadata.b);
                }
                catch(RemoteException remoteException0) {
                    bwne.w(remoteException0, "Client died during registerCompletionFilter", new Object[0]);
                }
                break;
            }
            case 7: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    abxr4 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
                    abxr4 = (iInterface4 instanceof abxr) ? ((abxr)iInterface4) : new abxp(iBinder4);
                }
                ActionImpl[] arr_actionImpl = (ActionImpl[])parcel0.createTypedArray(ActionImpl.CREATOR);
                abxn.gr(parcel0);
                glrs glrs0 = glrs.a;
                if(arr_actionImpl == null) {
                    abxr5 = abxr4;
                    arr_actionImpl1 = null;
                    throw new bwrw("Actions cannot be null.", glrs.t);
                }
                try {
                    if(arr_actionImpl.length != 1) {
                        abxr5 = abxr4;
                        arr_actionImpl1 = arr_actionImpl;
                        throw new bwrw("Providing more than one action in one start/end call is not allowed.", glrs.u);
                    }
                    actionImpl0 = arr_actionImpl[0];
                    if(actionImpl0 == null) {
                        abxr5 = abxr4;
                        arr_actionImpl1 = arr_actionImpl;
                        throw new bwrw("Action cannot be null.", glrs.t);
                    }
                    int v2 = actionImpl0.e.a;
                    if(v2 == 1) {
                        glrq0 = glrq.d;
                    }
                    else {
                        if(v2 != 2) {
                            abxr5 = abxr4;
                            arr_actionImpl1 = arr_actionImpl;
                            throw new bwrw("EventStatus in Metadata is not supported.", actionImpl0, glrs.z);
                        }
                        glrq0 = glrq.e;
                    }
                    String s1 = actionImpl0.c;
                    if(s1 != null) {
                        try {
                            bwtj.b(s1);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            throw new bwrw(glrq0, illegalArgumentException0.getMessage(), actionImpl0, glrs.v, illegalArgumentException0);
                        }
                    }
                    if(!htzv.c()) {
                        String[] arr_s = actionImpl0.g.getStringArray("url");
                        if(arr_s != null && arr_s.length > 0 && !arr_s[0].isEmpty() && !arr_s[0].equals(s1)) {
                            throw new bwrw(glrq0, actionImpl0, glrs.M);
                        }
                    }
                    String s2 = actionImpl0.d;
                    if(s2 != null) {
                        try {
                            bwtj.c(s2);
                        }
                        catch(IllegalArgumentException illegalArgumentException1) {
                            throw new bwrw(glrq0, illegalArgumentException1.getMessage(), actionImpl0, glrs.m, illegalArgumentException1);
                        }
                    }
                    bwrx0 = new bwrx(glrq0);
                }
                catch(bwrw bwrw0) {
                    try {
                        abxr5 = abxr4;
                        arr_actionImpl1 = arr_actionImpl;
                    }
                    catch(bwrw bwrw0) {
                    }
                    goto label_185;
                }
                String s3 = this.o;
                if(huar.a.d().P() && bwtj.e(this.l, s3)) {
                    ActionImpl actionImpl1 = arr_actionImpl[0];
                    if(htzv.c()) {
                        bwts bwts0 = this.b;
                        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("appindex").authority(s3).path("action");
                        String s4 = actionImpl1.a;
                        Uri.Builder uri$Builder1 = uri$Builder0.appendQueryParameter("type", s4);
                        String s5 = actionImpl1.c;
                        Uri.Builder uri$Builder2 = uri$Builder1.appendQueryParameter("object", s5);
                        if(uri$Builder2.toString().length() > 0x100) {
                            bwne.r("ActionUrl is too long and need to be hashed, callerPackageName : %s, actionType : %s.", s3, s4);
                            bwts0.d("actions_rewrite_uri_too_long");
                            uri$Builder2.clearQuery().appendQueryParameter("type", Long.toHexString(ghfs.a.c(s4, StandardCharsets.UTF_8).c())).appendQueryParameter("object", Long.toHexString(ghfs.a.c(s5, StandardCharsets.UTF_8).c()));
                        }
                        actionImpl1.g.putStringArray("url", new String[]{uri$Builder2.toString()});
                    }
                    ArrayList arrayList0 = new ArrayList();
                    bwne.b("Report Action %s", actionImpl1.toString());
                    arrayList0.add(bwti.a(actionImpl1, System.currentTimeMillis(), s3));
                    UsageInfo[] arr_usageInfo1 = (UsageInfo[])arrayList0.toArray(new UsageInfo[0]);
                    this.g(arr_usageInfo1);
                    if(htzv.e()) {
                        bwne.o("Redirecting reportUserActions() to AppIndexService in main");
                        MutateRequest mutateRequest0 = new MutateRequest(7, null, null, null, arr_actionImpl[0], s3, s3);
                        evql evql0 = this.h.c(mutateRequest0);
                        bxar bxar0 = new bxar(this, abxr4, arr_actionImpl, bwrx0);
                        evql0.s(this.m, bxar0);
                        this.f(bwrx0.a, glrs.O, 1);
                    }
                    else {
                        String s6 = this.d(bwrx0.a);
                        try {
                            this.c.d(s3, actionImpl1);
                            this.e(abxr4, arr_usageInfo1, "FirebaseUserActions", null);
                        }
                        catch(Throwable throwable0) {
                            bwne.w(throwable0, "Error performing: %s", new Object[]{s6});
                            glrs glrs1 = glrs.e;
                            huax.h();
                            bwne.x();
                            if(!bbnp.p()) {
                                throw throwable0;
                            }
                            try {
                                abxr4.c(new Status(bwsz.b(glrs1)), cckf.d(bbdp.ch));
                            }
                            catch(RemoteException remoteException1) {
                                bwne.w(remoteException1, "Client died while providing callback for: %s", new Object[]{s6});
                            }
                            glrs0 = glrs1;
                            this.f(bwrx0.a, glrs0, arr_actionImpl.length);
                            break;
                        }
                        this.f(bwrx0.a, glrs0, arr_actionImpl.length);
                    }
                }
                else {
                    this.c(abxr4, arr_actionImpl, glrs.s, bwrx0.a, null);
                    break;
                    try {
                        abxr5 = abxr4;
                        arr_actionImpl1 = arr_actionImpl;
                        throw new bwrw("EventStatus in Metadata is not supported.", actionImpl0, glrs.z);
                    }
                    catch(bwrw bwrw0) {
                    }
                    try {
                    label_185:
                        glrs glrs2 = bwrw0.a;
                        s7 = bwrw0.getMessage();
                        ActionImpl actionImpl2 = bwrw0.c;
                        if(actionImpl2 != null) {
                            s7 = s7 + " The invalid action is: " + actionImpl2.toString();
                        }
                        bwne.w(bwrw0, "%s failed", new Object[]{this.d(bwrw0.b)});
                        glrs3 = glrs2;
                        goqs.b(String.format("Invalid Action detected: %s", s7));
                        glrs3 = glrs2;
                        this.c.c(this.o, bwrw0.b, glrs3, bwrw0.getMessage(), null, actionImpl2);
                    }
                    catch(Exception unused_ex) {
                        huax.h();
                        bwne.x();
                    }
                    s8 = s7;
                    this.c(abxr5, arr_actionImpl1, glrs3, bwrw0.b, s8);
                }
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    private final void g(UsageInfo[] arr_usageInfo) {
        Object object0;
        boolean z = this.g.g(this.o);
        boolean z1 = huau.a.c().h();
        int v = 0;
        if(z) {
            for(int v1 = 0; v1 < arr_usageInfo.length; ++v1) {
                UsageInfo usageInfo0 = arr_usageInfo[v1];
                if(usageInfo0 != null && (usageInfo0.c == 0 || usageInfo0.c == 4 || usageInfo0.c == 5)) {
                    this.d.c(usageInfo0);
                }
            }
        }
        else if(z1) {
            bwne.a("Ignoring usage report: missing consent.");
        }
        bxfz bxfz0 = this.e;
        bxfz0.a();
        if(!bxfz0.b()) {
            while(v < arr_usageInfo.length) {
                UsageInfo usageInfo1 = arr_usageInfo[v];
                if(usageInfo1 != null && usageInfo1.e != null) {
                    igtl igtl0 = abwr.a("completionToken", usageInfo1);
                    if(igtl0 != null) {
                        object0 = (igtl0.d == null ? igto.a : igtl0.d).d;
                        goto label_25;
                    }
                }
                object0 = null;
            label_25:
                if(object0 != null) {
                    bxfx bxfx0 = bxfz0.b;
                    if(bxfx0.get(object0) != null) {
                        LightweightIndexChimeraService lightweightIndexChimeraService0 = this.l;
                        if(azql.c(lightweightIndexChimeraService0).g("com.google.android.googlequicksearchbox")) {
                            Intent intent0 = new Intent("com.google.android.gms.appindex.action.APPINDEX_CONTEXT_UPDATED").putExtra("com.google.android.gms.appindex.extra.COMPLETION_TOKEN", ((String)object0)).setPackage("com.google.android.googlequicksearchbox");
                            if(Build.VERSION.SDK_INT < 34) {
                                lightweightIndexChimeraService0.sendBroadcast(intent0);
                            }
                            else {
                                lightweightIndexChimeraService0.sendBroadcast(intent0, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            }
                        }
                        bxfx0.remove(object0);
                    }
                }
                ++v;
            }
        }
    }

    private final boolean h() {
        return Binder.getCallingUid() == abxn.i && "com.google.android.googlequicksearchbox".equals(this.o);
    }
}

