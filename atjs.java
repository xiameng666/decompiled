import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadResult;
import j..util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.zip.DeflaterOutputStream;
import jeb.synthetic.TWR;

public final class atjs {
    public static final aqql a;
    public final Context b;
    public final aqys c;
    public final aqyv d;
    public final arua e;
    public Timestamp f;
    private final aqjk g;
    private final aqox h;
    private final aqpe i;
    private final aqnp j;
    private final ModuleManager k;
    private final aqwp l;
    private long m;
    private hisf n;
    private hisy o;
    private int p;
    private boolean q;
    private final atjm r;

    static {
        atjs.a = new aqql(new String[]{"MmsRestoreController"});
        new Uri.Builder().scheme("content").authority("com.google.android.gms.fileprovider").appendPath("mms").build();
        TimeUnit.SECONDS.toMillis(5L);
    }

    public atjs(Context context0, aqys aqys0, aqjk aqjk0, aqox aqox0, aqpe aqpe0, aqnp aqnp0, ModuleManager moduleManager0, aqwp aqwp0, aqyv aqyv0) {
        this.b = context0;
        this.c = aqys0;
        this.g = aqjk0;
        this.h = aqox0;
        this.i = aqpe0;
        this.j = aqnp0;
        this.k = moduleManager0;
        this.l = aqwp0;
        this.d = aqyv0;
        this.r = null;
        this.e = null;
    }

    public atjs(Context context0, aqys aqys0, aqjk aqjk0, aqox aqox0, aqpe aqpe0, aqnp aqnp0, ModuleManager moduleManager0, aqwp aqwp0, aqyv aqyv0, atjm atjm0, arua arua0) {
        this.b = context0;
        this.c = aqys0;
        this.g = aqjk0;
        this.h = aqox0;
        this.i = aqpe0;
        this.j = aqnp0;
        this.k = moduleManager0;
        this.l = aqwp0;
        this.d = aqyv0;
        this.r = atjm0;
        this.e = arua0;
    }

    public final File a(String s, boolean z) {
        ccsg ccsg0 = ccsb.a;
        File file0 = hrnt.i() ? new File(ccsg0.d(ccsg0.b(this.b.getFilesDir(), "mms"), s)) : new File(new File(this.b.getFilesDir(), "mms"), s);
        atjs.k(z, file0);
        return file0;
    }

    public final File b(hisf hisf0, String s, boolean z) {
        ccsg ccsg0 = ccsb.a;
        File file0 = hrnt.i() ? new File(ccsg0.d(ccsg0.d(ccsg0.b(this.b.getFilesDir(), "mms"), hisf0.b), s)) : new File(new File(new File(this.b.getFilesDir(), "mms"), hisf0.b), s);
        atjs.k(z, file0);
        return file0;
    }

    public final void c() {
        FileOutputStream fileOutputStream1;
        int v13;
        File[] arr_file1;
        int v9;
        BufferedReader bufferedReader1;
        clcf clcf0;
        aqnp aqnp0;
        File file5;
        atjm atjm0;
        String s7;
        int v4;
        int v3;
        int v2;
        String s6;
        BufferedReader bufferedReader0;
        File file4;
        hisw hisw0;
        File file3;
        File file2;
        hisy hisy0;
        hisf hisf0;
        Context context0 = this.b;
        if(!asdc.l(context0)) {
            long v = this.g.b("--");
            if(Long.compare(v, 0L) == 0 || v == 1L) {
                if(hqje.w()) {
                    v = bbmq.d(context0);
                    goto label_12;
                }
                atjs.a.m("No ancestor ID", new Object[0]);
                this.c.m(4);
                atjr atjr0 = new atjr("No ancestor ID from backup manager.");
                this.f();
                throw atjr0;
            }
        label_12:
            this.m = v;
            this.f = new Timestamp(System.currentTimeMillis());
            aqys aqys0 = this.c;
            ProtoLiteBuilder hftp0 = aqra.b();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gidz)hftp1.b_message).c = 2;
            ((gidz)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp0.b_message;
            gidz gidz0 = (gidz)hftp1.N_build();
            gidz0.getClass();
            ghys0.J = gidz0;
            ghys0.c |= 0x1000;
            aqys0.x(hftp0, ghyr.Q, aqys0.d);
            try {
                aqox aqox0 = this.h;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hisq.a).v_newBuilder();
                long v1 = this.m;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((hisq)hftp2.b_message).d = v1;
                ProtoLiteBuilder hftp3 = aqow.b(this.k);
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hisq hisq0 = (hisq)hftp2.b_message;
                hise hise0 = (hise)hftp3.N_build();
                hise0.getClass();
                hisq0.c = hise0;
                hisq0.b |= 1;
                hisf0 = aqox0.c(((hisq)hftp2.N_build()));
            }
            catch(IOException | aqxy | aqxu | aqyb | acse exception0) {
                this.l(20, "getBackup", exception0);
                atjr atjr1 = new atjr("Could not start get backup.", exception0);
                this.f();
                throw atjr1;
            }
            catch(iapl iapl0) {
                this.c.m(18);
                atjr atjr2 = new atjr("Could not find backup to restore from.", iapl0);
                this.f();
                throw atjr2;
            }
            this.n = hisf0;
            if(hisf0.d > 0L) {
                File file0 = this.d.a("com.android.providers.telephony");
                if(this.d.b("com.android.providers.telephony").exists() && !file0.exists()) {
                    atjs.a.h("Restore file already exists.", new Object[0]);
                    this.c.n("downloadMmsData", 2);
                    goto label_356;
                }
                if(file0.exists()) {
                    File file1 = hrnt.i() ? new File(ccsb.a.b(this.b.getFilesDir(), "mms")) : new File(this.b.getFilesDir(), "mms");
                    if(!file1.exists()) {
                        atjs.a.h("Temp file already exists.", new Object[0]);
                        this.c.n("downloadMmsData", 3);
                        goto label_356;
                    }
                }
                if(new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes() >= this.n.d * 3L) {
                    try {
                        aqox aqox1 = this.h;
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hisx.a).v_newBuilder();
                        String s = this.n.b;
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        hisx hisx0 = (hisx)hftp4.b_message;
                        s.getClass();
                        hisx0.d = s;
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hita.a).v_newBuilder();
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ((hita)hftp5.b_message).b = 1;
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        hisx hisx1 = (hisx)hftp4.b_message;
                        hita hita0 = (hita)hftp5.N_build();
                        hita0.getClass();
                        hisx1.e = hita0;
                        hisx1.b |= 2;
                        ProtoLiteBuilder hftp6 = aqow.b(this.k);
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        hisx hisx2 = (hisx)hftp4.b_message;
                        hise hise1 = (hise)hftp6.N_build();
                        hise1.getClass();
                        hisx2.c = hise1;
                        hisx2.b |= 1;
                        hisy0 = aqox1.f(((hisx)hftp4.N_build()));
                    }
                    catch(IOException | aqxy | aqxu | aqyb | acse exception1) {
                        this.l(23, "startTransaction", exception1);
                        atjr atjr3 = new atjr("Could not start restore transaction.", exception1);
                        this.f();
                        throw atjr3;
                    }
                    catch(iapl iapl1) {
                        this.c.m(17);
                        atjr atjr4 = new atjr("Start transaction had bad status.", iapl1);
                        this.f();
                        throw atjr4;
                    }
                    this.o = hisy0;
                    try {
                        file2 = this.b(this.n, "fileIds.txt", false);
                    }
                    catch(IOException iOException0) {
                        this.l(12, "downloadMmsData", iOException0);
                        atjr atjr5 = new atjr("Could not get file ID list.", iOException0);
                        this.f();
                        throw atjr5;
                    }
                    if(file2.exists()) {
                        file2.delete();
                    }
                    try {
                        file3 = this.b(this.n, "fileIds.txt.tmp", true);
                    }
                    catch(IOException iOException1) {
                        this.l(12, "writeListFiles", iOException1);
                        atjr atjr6 = new atjr("Could not create temp file ID list.", iOException1);
                        this.f();
                        throw atjr6;
                    }
                    try {
                        aqox aqox2 = this.h;
                        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hisv.a).v_newBuilder();
                        String s1 = this.n.b;
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp7.b_message;
                        s1.getClass();
                        ((hisv)hftv0).d = s1;
                        String s2 = this.o.b;
                        if(!hftv0.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        hisv hisv0 = (hisv)hftp7.b_message;
                        s2.getClass();
                        hisv0.g = s2;
                        ProtoLiteBuilder hftp8 = aqow.b(this.k);
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        hisv hisv1 = (hisv)hftp7.b_message;
                        hise hise2 = (hise)hftp8.N_build();
                        hise2.getClass();
                        hisv1.c = hise2;
                        hisv1.b |= 1;
                        hisw0 = aqox2.e(((hisv)hftp7.N_build()));
                    }
                    catch(IOException | aqxy | aqxu | aqyb | acse exception2) {
                        this.l(21, "getBackupFilesList", exception2);
                        atjr atjr7 = new atjr("Could not start list files.", exception2);
                        this.f();
                        throw atjr7;
                    }
                    catch(iapl iapl2) {
                        this.c.m(19);
                        atjr atjr8 = new atjr("Could not fetch list of files in backup.", iapl2);
                        this.f();
                        throw atjr8;
                    }
                    while(true) {
                        this.h(file3, hisw0);
                        if(hisw0.c.isEmpty()) {
                            break;
                        }
                        String s3 = hisw0.c;
                        try {
                            aqox aqox3 = this.h;
                            ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hisv.a).v_newBuilder();
                            String s4 = this.n.b;
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp9.b_message;
                            s4.getClass();
                            ((hisv)hftv1).d = s4;
                            String s5 = this.o.b;
                            if(!hftv1.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp9.b_message;
                            s5.getClass();
                            ((hisv)hftv2).g = s5;
                            if(!hftv2.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            hisv hisv2 = (hisv)hftp9.b_message;
                            s3.getClass();
                            hisv2.f = s3;
                            ProtoLiteBuilder hftp10 = aqow.b(this.k);
                            if(!hftp9.b_message.isImmutable()) {
                                hftp9.ensureMutable();
                            }
                            hisv hisv3 = (hisv)hftp9.b_message;
                            hise hise3 = (hise)hftp10.N_build();
                            hise3.getClass();
                            hisv3.c = hise3;
                            hisv3.b |= 1;
                            hisw0 = aqox3.e(((hisv)hftp9.N_build()));
                        }
                        catch(IOException | aqxy | aqxu | aqyb | acse exception3) {
                            this.l(22, "getBackupFilesList", exception3);
                            atjr atjr9 = new atjr("Could not start list files.", exception3);
                            this.f();
                            throw atjr9;
                        }
                        catch(iapl iapl3) {
                            this.c.m(19);
                            atjr atjr10 = new atjr("Could not fetch list of files in backup.", iapl3);
                            this.f();
                            throw atjr10;
                        }
                    }
                    try {
                        file3.renameTo(this.b(this.n, "fileIds.txt", false));
                    }
                    catch(IOException iOException2) {
                        this.l(12, "writeListFiles", iOException2);
                        atjr atjr11 = new atjr("Could not rename temp file ID list.", iOException2);
                        this.f();
                        throw atjr11;
                    }
                    atjs.a.d("Total MMS to be downloaded: %s", new Object[]{((int)this.p)});
                    try {
                        file4 = this.b(this.n, "fileIds.txt", false);
                    }
                    catch(IOException iOException3) {
                        this.l(12, "downloadFiles", iOException3);
                        atjr atjr12 = new atjr("Could not load file ID list.", iOException3);
                        this.f();
                        throw atjr12;
                    }
                    try {
                        bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file4), StandardCharsets.UTF_8));
                    }
                    catch(IOException iOException4) {
                        goto label_317;
                    }
                    try {
                        s6 = bufferedReader0.readLine();
                        v2 = 1;
                        v3 = 0;
                        v4 = 0;
                        while(true) {
                        label_224:
                            if(s6 == null) {
                                goto label_314;
                            }
                            if(hqje.a.m().U() && s6.endsWith("_mms_backup")) {
                                s7 = s6.substring(0, s6.length() - 11).concat("_g1_mms_backup");
                                atjs.a.j("Renaming file to use G1 specific MMS suffix. Before %s, after: %s", new Object[]{s6, s7});
                            }
                            else {
                                s7 = s6;
                            }
                            if(this.a(s7, false).exists()) {
                                s6 = bufferedReader0.readLine();
                                if(!hqje.O()) {
                                    continue;
                                }
                                atjm0 = this.r;
                                if(atjm0 == null) {
                                    continue;
                                }
                                if(atjm0.b()) {
                                    this.c.d();
                                    this.i();
                                    this.q = true;
                                    this.f();
                                    break;
                                }
                                goto label_242;
                            }
                            goto label_245;
                        }
                    }
                    catch(Throwable throwable0) {
                        bufferedReader1 = bufferedReader0;
                        goto label_307;
                    }
                    try {
                        bufferedReader0.close();
                    }
                    catch(IOException iOException4) {
                        goto label_317;
                    }
                    goto label_356;
                    try {
                    label_242:
                        ++v4;
                        atjm0.a(this.p, v4);
                    }
                    catch(Throwable throwable0) {
                        bufferedReader1 = bufferedReader0;
                        goto label_307;
                    }
                    goto label_224;
                    try {
                    label_245:
                        file5 = this.a(s7 + ".tmp", true);
                        aqnp0 = this.j;
                        if(aqnp0 == null) {
                            goto label_275;
                        }
                        else {
                            hisr hisr0 = this.d(s6);
                            long v5 = hqje.h();
                            clcf0 = aqnp.b(hisr0);
                            goto label_257;
                        }
                        goto label_283;
                    }
                    catch(aqxy | aqxu | aqyb unused_ex) {
                        bufferedReader1 = bufferedReader0;
                        goto label_300;
                    }
                    catch(Throwable throwable0) {
                        bufferedReader1 = bufferedReader0;
                        goto label_307;
                    }
                label_257:
                    int v6 = 0;
                    while(true) {
                        bufferedReader1 = bufferedReader0;
                        if(((long)v6) >= v5 - 1L) {
                            goto label_272;
                        }
                        try {
                            aqnp0.a(clcf0, file5);
                            v9 = v2;
                            goto label_283;
                        }
                        catch(IOException unused_ex) {
                        }
                        catch(aqxy | aqxu | aqyb unused_ex) {
                            goto label_300;
                        }
                        catch(Throwable throwable0) {
                            goto label_307;
                        }
                        ++v6;
                        try {
                            long v7 = hqje.c();
                            TimeUnit timeUnit0 = TimeUnit.SECONDS;
                            long v8 = ThreadLocalRandom.current().nextLong(hqje.b());
                            SystemClock.sleep(v7 + timeUnit0.toMillis(((long)Math.pow(2.0, v6))) + v8);
                            bufferedReader0 = bufferedReader1;
                            v2 = v2;
                            continue;
                        label_272:
                            v9 = v2;
                            aqnp0.a(clcf0, file5);
                            goto label_283;
                        label_275:
                            bufferedReader1 = bufferedReader0;
                            v9 = v2;
                            hisr hisr1 = this.d(s6);
                            FileOutputStream fileOutputStream0 = new FileOutputStream(file5);
                            aqwm aqwm0 = new aqwm(((gful_cronetEngineProvider)new aqpb()), ((gful_cronetEngineProvider)new aqpc()));
                            aqpd aqpd0 = new aqpd(this.i, aqwm0, hisr1, fileOutputStream0);
                            String s8 = this.i.c.a();
                            Void void0 = (Void)aqpd0.c(this.i.b, s8, "application/octet-stream");
                        label_283:
                            file5.renameTo(this.a(s7, false));
                            ++v3;
                            if(hqje.O()) {
                                atjm atjm1 = this.r;
                                if(atjm1 != null) {
                                    if(!atjm1.b()) {
                                        ++v4;
                                        atjm1.a(this.p, v4);
                                        goto label_298;
                                    }
                                    this.c.d();
                                    this.i();
                                    this.q = true;
                                    this.f();
                                    break;
                                }
                            }
                            goto label_298;
                        }
                        catch(aqxy | aqxu | aqyb unused_ex) {
                            goto label_300;
                        }
                        catch(Throwable throwable0) {
                            goto label_307;
                        }
                    }
                    try {
                        bufferedReader1.close();
                    }
                    catch(IOException iOException4) {
                        goto label_317;
                    }
                    goto label_356;
                    try {
                        try {
                        label_298:
                            atjs.a.d("Downloaded mms count: %s", new Object[]{v4});
                        }
                        catch(aqxy | aqxu | aqyb unused_ex) {
                        label_300:
                            this.a(s7 + ".tmp", false).delete();
                            v2 = 0;
                            s6 = bufferedReader1.readLine();
                            bufferedReader0 = bufferedReader1;
                            goto label_224;
                        }
                        v2 = v9;
                        s6 = bufferedReader1.readLine();
                        bufferedReader0 = bufferedReader1;
                        goto label_224;
                    }
                    catch(Throwable throwable0) {
                    }
                    try {
                    label_307:
                        bufferedReader1.close();
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        try {
                            throwable0.addSuppressed(throwable1);
                            throw throwable0;
                        label_314:
                            bufferedReader0.close();
                            goto label_321;
                        }
                        catch(IOException iOException4) {
                        }
                    }
                label_317:
                    this.l(12, "downloadFiles", iOException4);
                    atjr atjr13 = new atjr("Could not read or write file while downloading.", iOException4);
                    this.f();
                    throw atjr13;
                label_321:
                    if(v2 != 0) {
                        boolean z = this.e().isDirectory();
                        aqys aqys1 = this.c;
                        ProtoLiteBuilder hftp11 = aqra.b();
                        ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
                        if(!hftp12.b_message.isImmutable()) {
                            hftp12.ensureMutable();
                        }
                        ((gidz)hftp12.b_message).c = 7;
                        ((gidz)hftp12.b_message).b |= 1;
                        ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)gidv.a).v_newBuilder();
                        if(!hftp13.b_message.isImmutable()) {
                            hftp13.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp13.b_message;
                        ((gidv)hftv3).b |= 1;
                        ((gidv)hftv3).c = v3;
                        if(!hftv3.isImmutable()) {
                            hftp13.ensureMutable();
                        }
                        gidv gidv0 = (gidv)hftp13.b_message;
                        gidv0.b |= 2;
                        gidv0.d = z;
                        if(!hftp12.b_message.isImmutable()) {
                            hftp12.ensureMutable();
                        }
                        gidz gidz1 = (gidz)hftp12.b_message;
                        gidv gidv1 = (gidv)hftp13.N_build();
                        gidv1.getClass();
                        gidz1.g = gidv1;
                        gidz1.b |= 16;
                        if(!hftp11.b_message.isImmutable()) {
                            hftp11.ensureMutable();
                        }
                        ghys ghys1 = (ghys)hftp11.b_message;
                        gidz gidz2 = (gidz)hftp12.N_build();
                        gidz2.getClass();
                        ghys1.J = gidz2;
                        ghys1.c |= 0x1000;
                        aqys1.x(hftp11, ghyr.Q, aqys1.d);
                    label_356:
                        aqql aqql0 = atjs.a;
                        aqql0.d("Run rewriteMmsJsonFile...", new Object[0]);
                        File file6 = this.e();
                        File file7 = this.d.a("com.android.providers.telephony");
                        if(this.d.b("com.android.providers.telephony").exists() && !file7.exists()) {
                            this.c.n("rewriteMmsJsonFile", 2);
                        }
                        else if(file7.exists()) {
                            File file8 = hrnt.i() ? new File(ccsb.a.b(this.b.getFilesDir(), "mms")) : new File(this.b.getFilesDir(), "mms");
                            if(!file8.exists()) {
                                this.c.n("rewriteMmsJsonFile", 3);
                                aqql0.h("Dump file exists", new Object[0]);
                                goto label_485;
                            }
                            goto label_372;
                        }
                        else {
                        label_372:
                            if(file6.isDirectory()) {
                                try {
                                    File[] arr_file = file6.listFiles();
                                    int v10 = arr_file.length;
                                    int v11 = 0;
                                    while(v11 < v10) {
                                        File file9 = arr_file[v11];
                                        if(file9.isFile()) {
                                            String s9 = file9.getAbsolutePath();
                                            String s10 = s9 + ".tmp";
                                            File file10 = hrnt.i() ? new File(ccsb.a.a(s10)) : new File(s10);
                                            JsonReader jsonReader0 = atjo.a(file9);
                                            arr_file1 = arr_file;
                                            JsonWriter jsonWriter0 = new JsonWriter(new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(file10)), StandardCharsets.UTF_8), 0x8000));
                                            aqql0.d("Rewriting json file without mms_body", new Object[0]);
                                            JsonReader jsonReader1 = atjo.a(file9);
                                            jsonReader0.beginArray();
                                            jsonReader1.beginArray();
                                            jsonWriter0.beginArray();
                                            int v12 = 0;
                                            while(jsonReader0.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                                ++v12;
                                                baun baun0 = atjo.a;
                                                baun0.d("readMmsJsonArray: read mmsJson " + v12, new Object[0]);
                                                baun0.d("isMmsJsonAttachmentEmpty: start", new Object[0]);
                                                jsonReader1.beginObject();
                                                boolean z1 = true;
                                                while(jsonReader1.hasNext()) {
                                                    if(jsonReader1.nextName().equals("attachments")) {
                                                        jsonReader1.beginArray();
                                                        for(z1 = true; jsonReader1.hasNext(); z1 = false) {
                                                            atjo.b(jsonReader1);
                                                        }
                                                        jsonReader1.endArray();
                                                    }
                                                    else {
                                                        atjo.b(jsonReader1);
                                                    }
                                                }
                                                jsonReader1.endObject();
                                                baun0.d("isMmsJsonAttachmentEmpty: end, isMmsJsonAttachmentEmpty=" + z1, new Object[0]);
                                                if(z1) {
                                                    baun0.d(a.f(v12, "readMmsJsonArray: mms ", " doesn\'t have any attachment. Skip write."), new Object[0]);
                                                    atjo.b(jsonReader0);
                                                }
                                                else {
                                                    atjo.c(jsonReader0, jsonWriter0);
                                                }
                                                jsonReader1 = jsonReader1;
                                                v10 = v10;
                                            }
                                            v13 = v10;
                                            jsonReader0.endArray();
                                            jsonReader1.endArray();
                                            jsonWriter0.endArray();
                                            jsonWriter0.flush();
                                            jsonWriter0.close();
                                            jsonReader0.close();
                                            jsonReader1.close();
                                            file9.delete();
                                            File file11 = hrnt.i() ? new File(ccsb.a.a(s9)) : new File(s9);
                                            file10.renameTo(file11);
                                        }
                                        else {
                                            arr_file1 = arr_file;
                                            v13 = v10;
                                        }
                                        ++v11;
                                        arr_file = arr_file1;
                                        v10 = v13;
                                    }
                                    aqys aqys2 = this.c;
                                    ProtoLiteBuilder hftp14 = aqra.b();
                                    ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
                                    if(!hftp15.b_message.isImmutable()) {
                                        hftp15.ensureMutable();
                                    }
                                    ((gidz)hftp15.b_message).c = 6;
                                    ((gidz)hftp15.b_message).b |= 1;
                                    if(!hftp14.b_message.isImmutable()) {
                                        hftp14.ensureMutable();
                                    }
                                    ghys ghys2 = (ghys)hftp14.b_message;
                                    gidz gidz3 = (gidz)hftp15.N_build();
                                    gidz3.getClass();
                                    ghys2.J = gidz3;
                                    ghys2.c |= 0x1000;
                                    aqys2.x(hftp14, ghyr.Q, aqys2.d);
                                }
                                catch(IOException iOException5) {
                                    aqys aqys3 = this.c;
                                    ProtoLiteBuilder hftp16 = aqra.b();
                                    ProtoLiteBuilder hftp17 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
                                    if(!hftp17.b_message.isImmutable()) {
                                        hftp17.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv4 = hftp17.b_message;
                                    ((gidz)hftv4).c = 6;
                                    ((gidz)hftv4).b |= 1;
                                    if(!hftv4.isImmutable()) {
                                        hftp17.ensureMutable();
                                    }
                                    ((gidz)hftp17.b_message).e = 23;
                                    ((gidz)hftp17.b_message).b |= 4;
                                    if(!hftp16.b_message.isImmutable()) {
                                        hftp16.ensureMutable();
                                    }
                                    ghys ghys3 = (ghys)hftp16.b_message;
                                    gidz gidz4 = (gidz)hftp17.N_build();
                                    gidz4.getClass();
                                    ghys3.J = gidz4;
                                    ghys3.c |= 0x1000;
                                    aqys3.x(hftp16, ghyr.Q, aqys3.d);
                                    atjs.a.f("rewriteMmsJsonFile: e = ".concat(iOException5.getMessage()), new Object[0]);
                                }
                            }
                            else {
                                aqql0.d("FilesDirectory does not exist. Skip rewrite mms json.", new Object[0]);
                                this.c.m(25);
                            }
                        }
                    label_485:
                        this.g();
                        if(hqje.O()) {
                            atjm atjm2 = this.r;
                            if(atjm2 == null) {
                                goto label_496;
                            }
                            else if(!this.q) {
                                if(atjm2.b()) {
                                    this.c.d();
                                    this.i();
                                    this.q = true;
                                    this.f();
                                    goto label_509;
                                }
                                goto label_496;
                            }
                        }
                        else {
                        label_496:
                            File file12 = this.d.a("com.android.providers.telephony");
                            File file13 = this.d.b("com.android.providers.telephony");
                            if(file13.exists() && !file12.exists()) {
                                atjs.a.h("Restore file already exists.", new Object[0]);
                            }
                            else {
                                try {
                                    aqwp.h(file12, file13);
                                }
                                catch(IOException iOException6) {
                                    this.l(12, "replaceDumpWithTar", iOException6);
                                    atjr atjr14 = new atjr("Could not convert tar dump to tar.", iOException6);
                                    this.f();
                                    throw atjr14;
                                }
                                file12.delete();
                            }
                        }
                    label_509:
                        if(hqje.O()) {
                            atjm atjm3 = this.r;
                            if(atjm3 != null) {
                                if(this.q) {
                                    return;
                                }
                                if(atjm3.b()) {
                                    this.c.d();
                                    this.i();
                                    this.q = true;
                                    this.f();
                                    return;
                                }
                            }
                        }
                        File file14 = this.d.b;
                        File file15 = hrnt.i() ? new File(ccsb.a.b(file14, "restore_token_file")) : new File(file14, "restore_token_file");
                        try {
                            atjs.k(true, file15);
                        }
                        catch(IOException iOException7) {
                            this.l(12, "generateTokenFile", iOException7);
                            atjr atjr15 = new atjr("Could not create restore token file.", iOException7);
                            this.f();
                            throw atjr15;
                        }
                        String s11 = String.valueOf(this.m);
                        try {
                            fileOutputStream1 = new FileOutputStream(file15);
                        }
                        catch(IOException iOException8) {
                            goto label_545;
                        }
                        try {
                            fileOutputStream1.write(s11.getBytes(StandardCharsets.UTF_8));
                            goto label_542;
                        }
                        catch(Throwable throwable2) {
                            try {
                                fileOutputStream1.close();
                                throw throwable2;
                            }
                            catch(Throwable throwable3) {
                                try {
                                    throwable2.addSuppressed(throwable3);
                                    throw throwable2;
                                label_542:
                                    fileOutputStream1.close();
                                    goto label_549;
                                }
                                catch(IOException iOException8) {
                                }
                            }
                        }
                    label_545:
                        this.l(12, "generateTokenFile", iOException8);
                        atjr atjr16 = new atjr("Could not write to restore token file.", iOException8);
                        this.f();
                        throw atjr16;
                    label_549:
                        this.j(file14);
                        Context context1 = this.b;
                        long v14 = this.g.b("--");
                        aqxo aqxo0 = new aqxo(context1, new aqjk(context1), null);
                        if(hqje.w() && (v14 == 0L || v14 == 1L)) {
                            aqxo0 = new aqxo(context1, new aqjk(context1));
                        }
                        aqxo0.a(new atjq(this));
                        return;
                    }
                    this.c.m(6);
                    throw new atjr("Some files were not downloaded due to network issues.");
                }
                atjs.a.m("Not enough space for restore", new Object[0]);
                this.c.m(5);
                atjr atjr17 = new atjr("Not enough space on device to restore.");
                this.f();
                throw atjr17;
            }
            this.c.m(11);
            atjr atjr18 = new atjr("MMS backup has no data to restore");
            this.f();
            throw atjr18;
        }
        this.c.m(3);
        atjr atjr19 = new atjr("MMS restore already completed");
        this.f();
        throw atjr19;
    }

    private final hisr d(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hisr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = aqow.b(this.k);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hisr hisr0 = (hisr)hftp0.b_message;
        hise hise0 = (hise)hftp1.N_build();
        hise0.getClass();
        hisr0.c = hise0;
        hisr0.b |= 1;
        String s1 = atjh.a(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((hisr)hftv0).d = s1;
        String s2 = this.o.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hisr hisr1 = (hisr)hftp0.b_message;
        s2.getClass();
        hisr1.e = s2;
        return (hisr)hftp0.N_build();
    }

    private final File e() {
        ccsg ccsg0 = ccsb.a;
        return hrnt.i() ? new File(ccsg0.d(ccsg0.d(ccsg0.b(this.b.getFilesDir(), "mms"), this.n.b), "files")) : new File(new File(new File(this.b.getFilesDir(), "mms"), this.n.b), "files");
    }

    private final void f() {
        File file0 = this.d.b("com.android.providers.telephony");
        File file1 = this.d.a("com.android.providers.telephony");
        File file2 = hrnt.i() ? new File(ccsb.a.b(this.b.getFilesDir(), "mms")) : new File(this.b.getFilesDir(), "mms");
        if(file0.exists()) {
            file0.delete();
        }
        if(file1.exists()) {
            file1.delete();
        }
        if(file2.exists()) {
            bboc.e(file2);
        }
        asdc.a.b(this.b, false);
    }

    private final void g() {
        if(hqje.O()) {
            atjm atjm0 = this.r;
            if(atjm0 != null) {
                if(this.q) {
                    return;
                }
                if(atjm0.b()) {
                    this.c.d();
                    this.i();
                    this.q = true;
                    this.f();
                    return;
                }
            }
        }
        File file0 = this.d.a("com.android.providers.telephony");
        if(this.d.b("com.android.providers.telephony").exists() && !file0.exists()) {
            this.c.n("createTarDump", 2);
            return;
        }
        if(file0.exists() && !(hrnt.i() ? new File(ccsb.a.b(this.b.getFilesDir(), "mms")) : new File(this.b.getFilesDir(), "mms")).exists()) {
            this.c.n("createTarDump", 3);
            atjs.a.h("Dump file exists", new Object[0]);
            return;
        }
        try {
            atjs.k(true, file0);
        }
        catch(IOException iOException0) {
            this.l(12, "createTarDump", iOException0);
            atjr atjr0 = new atjr("Could not create temp restore file.", iOException0);
            this.f();
            throw atjr0;
        }
        try {
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            try {
                ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.dup(fileOutputStream0.getFD());
                try {
                    Context context0 = this.b;
                    File file1 = aqze.b(context0, "_manifest");
                    try {
                        this.l.e(file1);
                        FullBackupDataOutput fullBackupDataOutput0 = (FullBackupDataOutput)FullBackupDataOutput.class.getConstructor(ParcelFileDescriptor.class).newInstance(parcelFileDescriptor0);
                        aqwp.g(null, file1.getParent(), file1.getAbsolutePath(), fullBackupDataOutput0);
                        File file2 = this.e();
                        try {
                            File[] arr_file = file2.listFiles();
                            for(int v2 = 0; v2 < arr_file.length; ++v2) {
                                File file3 = arr_file[v2];
                                if(!file3.isDirectory()) {
                                    aqwp.g("d_f", file3.getParent(), file3.getAbsolutePath(), fullBackupDataOutput0);
                                }
                            }
                            File file4 = hrnt.i() ? new File(ccsb.a.b(file2, "app_parts")) : new File(file2, "app_parts");
                            if(file4.isDirectory() && file4.listFiles() != null) {
                                File[] arr_file1 = file4.listFiles();
                                for(int v = 0; v < arr_file1.length; ++v) {
                                    File file5 = arr_file1[v];
                                    aqwp.g("d_r", file5.getParentFile().getParent(), file5.getAbsolutePath(), fullBackupDataOutput0);
                                }
                            }
                            else {
                                atjs.a.d("app_parts/ is not a directory or has no files", new Object[0]);
                            }
                        }
                        catch(aqwq aqwq1) {
                            this.c.m(14);
                            atjr atjr1 = new atjr("Error adding MMS files to tar dump.", aqwq1);
                            this.f();
                            throw atjr1;
                        }
                    }
                    finally {
                        file1.delete();
                    }
                    fileOutputStream0.write(new byte[4]);
                    bboc.e((hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), "mms")) : new File(context0.getFilesDir(), "mms")));
                }
                catch(Throwable throwable1) {
                    TWR.safeClose$NT(parcelFileDescriptor0, throwable1);
                    throw throwable1;
                }
                if(parcelFileDescriptor0 != null) {
                    parcelFileDescriptor0.close();
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(fileOutputStream0, throwable0);
                throw throwable0;
            }
            fileOutputStream0.close();
        }
        catch(IOException iOException1) {
            this.l(12, "createTarDump", iOException1);
            atjr atjr2 = new atjr("Error writing to tar dump file.", iOException1);
            this.f();
            throw atjr2;
        }
        catch(ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException exception0) {
            this.c.m(13);
            atjr atjr3 = new atjr("Could not create full backup data output class.", exception0);
            this.f();
            throw atjr3;
        }
        catch(aqwq aqwq0) {
            this.c.m(14);
            atjr atjr4 = new atjr("Error adding manifest files to tar dump.", aqwq0);
            this.f();
            throw atjr4;
        }
    }

    private final void h(File file0, hisw hisw0) {
        try(BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0, true), StandardCharsets.UTF_8))) {
            Iterator iterator0 = hisw0.b.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                bufferedWriter0.append(((hisp)object0).b);
                bufferedWriter0.newLine();
                bufferedWriter0.flush();
                ++this.p;
            }
        }
        catch(IOException iOException0) {
            this.l(12, "saveFileIds", iOException0);
            atjr atjr0 = new atjr("Could not write file IDs to disk.", iOException0);
            this.f();
            throw atjr0;
        }
    }

    private final void i() {
        arua arua0 = this.e;
        if(arua0 != null) {
            try {
                arua0.a(new CustomBackupDataDownloadResult(false, "Download cancelled"));
            }
            catch(RemoteException remoteException0) {
                atjs.a.g("Caught RemoteException while sending onComplete. %s", remoteException0, new Object[0]);
            }
        }
    }

    private final void j(File file0) {
        File file1 = hrnt.i() ? new File(ccsb.a.b(file0, "@pm@")) : new File(file0, "@pm@");
        try {
            atjs.k(true, file1);
        }
        catch(IOException iOException0) {
            this.l(12, "writePackageManagerData", iOException0);
            atjr atjr0 = new atjr("Could not create metadata file.", iOException0);
            this.f();
            throw atjr0;
        }
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file1); ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
            BackupDataOutput backupDataOutput0 = new BackupDataOutput(fileOutputStream0.getFD());
            DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
            dataOutputStream0.writeInt(23);
            dataOutputStream0.writeUTF("2920157");
            dataOutputStream0.flush();
            aqwp.b(backupDataOutput0, "@meta@", byteArrayOutputStream0.toByteArray());
        }
        catch(IOException iOException1) {
            this.l(12, "initializePackageManagerBackupFile", iOException1);
            atjr atjr1 = new atjr("Could not initialize @pm@ file.", iOException1);
            this.f();
            throw atjr1;
        }
        Context context0 = this.b;
        File file2 = aqze.b(context0, "telephony_metadata");
        try(FileInputStream fileInputStream0 = new FileInputStream(file1); FileOutputStream fileOutputStream1 = new FileOutputStream(file2); ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream(); DataOutputStream dataOutputStream1 = new DataOutputStream(byteArrayOutputStream1)) {
            BackupDataInput backupDataInput0 = new BackupDataInput(fileInputStream0.getFD());
            BackupDataOutput backupDataOutput1 = new BackupDataOutput(fileOutputStream1.getFD());
            while(true) {
                if(!backupDataInput0.readNextHeader()) {
                    break;
                }
                String s = backupDataInput0.getKey();
                int v = backupDataInput0.getDataSize();
                if(v >= 0 && !"com.android.providers.telephony".equals(s)) {
                    byte[] arr_b = new byte[v];
                    backupDataInput0.readEntityData(arr_b, 0, v);
                    aqwp.b(backupDataOutput1, s, arr_b);
                }
                else {
                    backupDataInput0.skipEntityData();
                }
            }
            dataOutputStream1.writeInt(23);
            aqwp.d(dataOutputStream1, aqwp.a(new byte[][]{aqwp.i(context0)}));
            aqwp.b(backupDataOutput1, "com.android.providers.telephony", byteArrayOutputStream1.toByteArray());
            fileInputStream0.close();
            file1.delete();
        }
        catch(IOException | NoSuchAlgorithmException exception0) {
            this.l(12, "writePackageManagerData", exception0);
            atjr atjr2 = new atjr("Error copying to metadata file.", exception0);
            this.f();
            throw atjr2;
        }
        try(FileInputStream fileInputStream1 = new FileInputStream(file2)) {
            bboc.c(fileInputStream1, file1);
            file2.delete();
        }
        catch(IOException iOException2) {
            this.l(12, "writePackageManagerData", iOException2);
            atjr atjr3 = new atjr("Error modifying metadata file.", iOException2);
            this.f();
            throw atjr3;
        }
    }

    private static final void k(boolean z, File file0) {
        if(z) {
            if(file0.exists()) {
                file0.delete();
            }
            file0.getParentFile().mkdirs();
            file0.createNewFile();
        }
    }

    private final void l(int v, String s, Exception exception0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gidw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gidw gidw0 = (gidw)hftp0.b_message;
        gidw0.b |= 1;
        gidw0.c = s;
        String s1 = exception0.getClass().getSimpleName();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((gidw)hftv0).b |= 2;
        ((gidw)hftv0).d = s1;
        if((exception0 instanceof aqxy)) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gidw)hftv1).b |= 2;
            ((gidw)hftv1).d = "HttpStatusException";
            int v1 = ((aqxy)exception0).a;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gidw gidw1 = (gidw)hftp0.b_message;
            gidw1.b |= 4;
            gidw1.e = v1;
        }
        ProtoLiteBuilder hftp1 = aqra.b();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gidz)hftv2).c = 4;
        ((gidz)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gidz)hftv3).e = v - 1;
        ((gidz)hftv3).b |= 4;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        gidz gidz0 = (gidz)hftp2.b_message;
        gidw gidw2 = (gidw)hftp0.N_build();
        gidw2.getClass();
        gidz0.f = gidw2;
        gidz0.b |= 8;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gidz gidz1 = (gidz)hftp2.N_build();
        gidz1.getClass();
        ghys0.J = gidz1;
        ghys0.c |= 0x1000;
        this.c.x(hftp1, ghyr.Q, this.c.d);
    }
}

