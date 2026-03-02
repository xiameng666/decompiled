import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri.Builder;
import android.net.Uri;
import android.provider.Settings.Secure;
import android.provider.Telephony.Mms;
import android.provider.Telephony.Threads;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.webkit.MimeTypeMap;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.DeflaterOutputStream;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class atjh {
    private boolean A;
    private final ScheduledExecutorService B;
    private final atjj C;
    public static final aqql a;
    static final Uri b;
    static final String[] c;
    static final String[] d;
    static final String[] e;
    static final String[] f;
    static final String[] g;
    static final Uri h;
    public final Context i;
    Map j;
    public int k;
    public int l;
    public final aqox m;
    final aqnp n;
    public aqys o;
    public atji p;
    private static final String[] q;
    private static final String[] r;
    private final ContentResolver s;
    private final int t;
    private final Map u;
    private int v;
    private int w;
    private final aqpe x;
    private long y;
    private Timestamp z;

    static {
        atjh.a = new aqql(new String[]{"MmsAgent"});
        atjh.b = Uri.parse("content://mms-sms/canonical-address");
        atjh.q = new String[]{"archived"};
        atjh.c = new String[]{"type", "address", "charset"};
        atjh.d = new String[]{"text", "chset"};
        atjh.r = new String[]{"_id", "recipient_ids"};
        atjh.e = new String[]{"_id", "ct", "cl", "text", "_data"};
        atjh.f = new String[]{"_id", "ct", "cl", "text", "_data", "name"};
        atjh.g = new String[]{"_id", "sub", "sub_cs", "date", "date_sent", "m_type", "v", "msg_box", "ct_l", "thread_id", "tr_id", "read"};
        atjh.h = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();
    }

    @Deprecated
    public atjh(Context context0) {
        this(context0, null, null, null);
    }

    public atjh(Context context0, atji atji0, atjj atjj0, ScheduledExecutorService scheduledExecutorService0) {
        aqnp aqnp0 = null;
        this.j = null;
        this.t = (int)hqje.a.m().h();
        this.u = new HashMap();
        this.k = 0;
        this.l = 0;
        this.v = 0;
        this.w = 0;
        this.y = 0L;
        this.i = context0;
        this.p = atji0;
        this.B = scheduledExecutorService0;
        this.C = hqje.N() ? atjj0 : null;
        this.s = context0.getContentResolver();
        if(hqjj.c()) {
            this.m = new aqob(context0);
        }
        else if(hqje.C()) {
            this.m = new aqok(context0);
        }
        else {
            this.m = new aqov(context0);
        }
        this.x = new aqpe(context0);
        if(hqje.D()) {
            aqnp0 = new aqnp(context0);
        }
        this.n = aqnp0;
        this.o = new aqys(context0);
    }

    public static String a(String s) {
        if(gfta.c(s)) {
            return s;
        }
        String[] arr_s = s.split("/");
        arr_s[arr_s.length - 1] = Uri.encode(arr_s[arr_s.length - 1]);
        return gfss.d('/').f(arr_s);
    }

    final void b() {
        ScheduledExecutorService scheduledExecutorService0 = this.B;
        if(scheduledExecutorService0 == null) {
            this.o.q(2);
            return;
        }
        long v = TimeUnit.SECONDS.toMillis(hqil.c()) / hqje.a.m().l();
        atjh.a.h("Periodic backup progress update is scheduled.", new Object[0]);
        try {
            ((bbll)scheduledExecutorService0).a(new atjg(this), v, v, TimeUnit.MILLISECONDS);
            aqys aqys0 = this.o;
            ProtoLiteBuilder hftp0 = aqra.b();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gifl.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gifl)hftv0).c = 1;
            ((gifl)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gifl)hftv1).b |= 8;
            ((gifl)hftv1).f = v;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gifl gifl0 = (gifl)hftp1.b_message;
            gifl0.b |= 4;
            gifl0.e = true;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp0.b_message;
            gifl gifl1 = (gifl)hftp1.N_build();
            gifl1.getClass();
            ghys0.af = gifl1;
            ghys0.d |= 0x40;
            aqys0.x(hftp0, ghyr.ar, aqys0.c);
        }
        catch(RejectedExecutionException unused_ex) {
            this.o.q(3);
        }
        catch(NullPointerException unused_ex) {
            this.o.q(4);
        }
        catch(IllegalArgumentException unused_ex) {
            this.o.q(5);
        }
    }

    public final void c(boolean z) {
        Context context0 = this.i;
        SharedPreferences.Editor sharedPreferences$Editor0 = new bakc(context0, "g1_shared_prefs", true).edit();
        sharedPreferences$Editor0.putBoolean("mms_data_deleted", z);
        sharedPreferences$Editor0.apply();
        if(z && hqje.a.m().T()) {
            asdc.o(context0, 0L);
        }
    }

    public final boolean d() {
        hisy hisy2;
        Cursor cursor0;
        Context context5;
        InputStream inputStream0;
        File file1;
        File file0;
        ConnectivityManager connectivityManager1;
        int v13;
        String s5;
        int v10;
        Context context4;
        boolean z1;
        String s3;
        int v9;
        Closeable closeable0;
        Cursor cursor3;
        ContentResolver contentResolver0;
        Uri uri0;
        Cursor cursor2;
        int v7;
        ConnectivityManager connectivityManager0;
        boolean z;
        Context context3;
        Cursor cursor1;
        aqql aqql1;
        hisy hisy1;
        HashSet hashSet0;
        hisw hisw0;
        hisy hisy0;
        hisf hisf0;
        hisu hisu0;
        try {
            Context context0 = this.i;
            asdc.p(context0, true);
            aqze.e(context0);
            this.c(false);
            aqee aqee0 = new aqee(context0);
            if(!aqee0.d()) {
                aqql aqql0 = atjh.a;
                aqql0.h("Device is not initialized", new Object[0]);
                bakc bakc0 = new bakc(context0, "BackupDeviceState", true);
                aqjo aqjo0 = new aqjo(new bbll(1, 10), bakc0, 100L);
                ((glyq)aqjo0.a()).u();
                if(!aqee0.d()) {
                    aqql0.h("Starting KV backup of telephony to initialize backup", new Object[0]);
                    new aqjk(context0).a(new String[]{"com.android.providers.telephony"}, null, null, 0);
                    ((glyq)aqjo0.a()).u();
                }
                aqql0.h("Device is now initialized after waiting for backup", new Object[0]);
            }
            if(hqje.a.m().ah()) {
                try {
                    aqox aqox0 = this.m;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hiss.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = aqow.a(context0);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hiss hiss0 = (hiss)hftp0.b_message;
                    hise hise0 = (hise)hftp1.N_build();
                    hise0.getClass();
                    hiss0.c = hise0;
                    hiss0.b |= 1;
                    hisu0 = aqox0.d(((hiss)hftp0.N_build()));
                }
                catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception1) {
                    this.o.k(13, "listBackupRpc", exception1);
                    throw new atje("No existing backup", exception1);
                }
                long v = bbmq.d(this.i);
                hisf0 = (hisf)hisu0.b.get(Long.valueOf(v));
                if(hisf0 == null) {
                    goto label_62;
                }
            }
            else {
                try {
                    aqox aqox1 = this.m;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hisq.a).v_newBuilder();
                    Context context1 = this.i;
                    long v1 = bbmq.d(context1);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((hisq)hftp2.b_message).d = v1;
                    ProtoLiteBuilder hftp3 = aqow.a(context1);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hisq hisq0 = (hisq)hftp2.b_message;
                    hise hise1 = (hise)hftp3.N_build();
                    hise1.getClass();
                    hisq0.c = hise1;
                    hisq0.b |= 1;
                    hisf0 = aqox1.c(((hisq)hftp2.N_build()));
                    goto label_63;
                }
                catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception2) {
                    if(hqje.a.m().at()) {
                        if(!(exception2 instanceof aqxy) || ((aqxy)exception2).a != 404) {
                            this.o.k(23, "getBackup", exception2);
                            throw new atje("Could not get backup.", exception2);
                        }
                        atjh.a.n("No existing backup", exception2, new Object[0]);
                    }
                    else {
                        atjh.a.n("No existing backup", exception2, new Object[0]);
                        exception2.printStackTrace();
                    }
                }
            label_62:
                hisf0 = null;
            }
        label_63:
            if(hisf0 == null) {
                this.o.c(true);
                this.A = true;
                try {
                    aqox aqox2 = this.m;
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hisk.a).v_newBuilder();
                    Context context2 = this.i;
                    long v2 = bbmq.d(context2);
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ((hisk)hftp4.b_message).d = v2;
                    ProtoLiteBuilder hftp5 = aqow.a(context2);
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hisk hisk0 = (hisk)hftp4.b_message;
                    hise hise2 = (hise)hftp5.N_build();
                    hise2.getClass();
                    hisk0.c = hise2;
                    hisk0.b |= 1;
                    hisf0 = aqox2.b(((hisk)hftp4.N_build()));
                }
                catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception3) {
                    this.o.k(14, "createBackupRpc", exception3);
                    throw new atje("Could not create backup.", exception3);
                }
            }
            else {
                this.o.c(false);
                this.A = false;
            }
            this.z = new Timestamp(System.currentTimeMillis());
            if(hisf0 == null) {
                this.o.j(9);
                throw new aqwq();
            }
            hisy0 = this.g(hisf0);
            if(hqje.K()) {
                this.b();
            }
            ArrayList arrayList0 = new ArrayList();
            try {
                aqox aqox3 = this.m;
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hisv.a).v_newBuilder();
                String s = hisf0.b;
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp6.b_message;
                s.getClass();
                ((hisv)hftv0).d = s;
                String s1 = hisy0.b;
                if(!hftv0.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hisv hisv0 = (hisv)hftp6.b_message;
                s1.getClass();
                hisv0.g = s1;
                ProtoLiteBuilder hftp7 = aqow.a(this.i);
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hisv hisv1 = (hisv)hftp6.b_message;
                hise hise3 = (hise)hftp7.N_build();
                hise3.getClass();
                hisv1.c = hise3;
                hisv1.b |= 1;
                hisw0 = aqox3.e(((hisv)hftp6.N_build()));
            }
            catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception4) {
                this.o.k(17, "listFilesRpc", exception4);
                throw new atje("Could not list files", exception4);
            }
            while(true) {
            label_124:
                arrayList0.addAll(hisw0.b);
                if(hisw0.c.isEmpty()) {
                    aqys aqys0 = this.o;
                    String s2 = hisf0.b;
                    long v3 = (long)arrayList0.size();
                    long v4 = hisf0.d;
                    ProtoLiteBuilder hftp8 = aqra.b();
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp9.b_message;
                    ((gidr)hftv1).c = 12;
                    ((gidr)hftv1).b |= 1;
                    if(!hftv1.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp9.b_message;
                    s2.getClass();
                    ((gidr)hftv2).b |= 0x400;
                    ((gidr)hftv2).l = s2;
                    if(!hftv2.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp9.b_message;
                    ((gidr)hftv3).b |= 0x100;
                    ((gidr)hftv3).j = v3;
                    if(!hftv3.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    gidr gidr0 = (gidr)hftp9.b_message;
                    gidr0.b |= 0x200;
                    gidr0.k = v4;
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    ghys ghys0 = (ghys)hftp8.b_message;
                    gidr gidr1 = (gidr)hftp9.N_build();
                    gidr1.getClass();
                    ghys0.H = gidr1;
                    ghys0.c |= 0x400;
                    aqys0.x(hftp8, ghyr.O, aqys0.c);
                    hashSet0 = new HashSet();
                    try {
                        cursor0 = this.e();
                        if(cursor0 != null) {
                            cursor0.moveToFirst();
                        }
                        hisy1 = hisy0;
                        for(int v6 = 0; true; ++v6) {
                            if(cursor0 == null) {
                                cursor0 = null;
                                break;
                            }
                            if(cursor0.isAfterLast()) {
                                break;
                            }
                            atjh.m();
                            hisy1 = this.f(cursor0, String.format(Locale.US, "%06d_mms_backup", v6), hisy1, hisf0, hashSet0);
                        }
                    }
                    finally {
                        bbpb.b(cursor0);
                    }
                    aqql1 = atjh.a;
                    aqql1.j("Backing up mms attachments", new Object[0]);
                    atji atji0 = this.p;
                    if(atji0 != null) {
                        atji0.a(this.k, this.l);
                    }
                    cursor1 = this.e();
                    if(cursor1 != null) {
                        break;
                    }
                    goto label_187;
                }
                goto label_497;
            }
        }
        catch(InterruptedException interruptedException0) {
            goto label_531;
        }
        catch(atje atje0) {
            goto label_538;
        }
        catch(Exception exception0) {
            goto label_543;
        }
        catch(Throwable throwable0) {
            goto label_551;
        }
        try {
            cursor1.moveToFirst();
        label_187:
            if(hqje.N()) {
                atjh.m();
            }
            context3 = this.i;
            z = new bakc(context3, "g1_shared_prefs", true).getBoolean("use_mobile_data_for_mms", false);
            connectivityManager0 = (ConnectivityManager)context3.getSystemService("connectivity");
            v7 = 0;
        }
        catch(Throwable throwable1) {
            cursor2 = cursor1;
            v7 = 0;
            goto label_325;
        }
        while(true) {
            if(cursor1 == null) {
                goto label_329;
            }
            try {
                if(cursor1.isAfterLast()) {
                    goto label_329;
                }
                if(connectivityManager0.isActiveNetworkMetered() && !z) {
                    cursor1.moveToLast();
                    cursor1.moveToNext();
                    continue;
                }
                int v8 = cursor1.getInt(0);
                Uri.Builder uri$Builder0 = Telephony.Mms.CONTENT_URI.buildUpon();
                uri$Builder0.appendPath(String.valueOf(v8)).appendPath("part");
                uri0 = uri$Builder0.build();
                aqql1.j("downloading mms id: " + v8, new Object[0]);
            }
            catch(Throwable throwable1) {
                cursor2 = cursor1;
                goto label_325;
            }
            try {
                contentResolver0 = this.s;
                cursor3 = contentResolver0.query(uri0, (hqje.P() ? atjh.f : atjh.e), null, null, "_id ASC");
            }
            catch(Throwable throwable2) {
                try {
                    cursor2 = cursor1;
                    closeable0 = null;
                    goto label_307;
                }
                catch(Throwable throwable1) {
                    goto label_325;
                }
            }
            if(cursor3 == null) {
                goto label_298;
            }
            else {
                try {
                    if(cursor3.moveToFirst()) {
                        v9 = 0;
                        while(true) {
                        label_223:
                            s3 = cursor3.getString(cursor3.getColumnIndex("ct"));
                            cursor2 = cursor1;
                            goto label_229;
                        }
                    }
                    else {
                        goto label_298;
                    }
                    goto label_303;
                }
                catch(Throwable throwable2) {
                    try {
                        cursor2 = cursor1;
                        goto label_306;
                    label_229:
                        z1 = z;
                        context4 = context3;
                        aqql1.j("attachment contentType = " + s3, new Object[0]);
                        v10 = gfta.c(s3) || !s3.equals("text/plain") ? v9 : 1;
                        if(atjh.n(s3)) {
                            int v11 = cursor3.getInt(cursor3.getColumnIndex("_id"));
                            String s4 = cursor3.getString(cursor3.getColumnIndex("cl"));
                            if(s4 == null) {
                                int v12 = cursor3.getColumnIndex("name");
                                if(hqje.P() && v12 >= 0 && cursor3.getString(v12) != null) {
                                    s4 = cursor3.getString(v12);
                                    goto label_243;
                                }
                                else if(hqje.Q()) {
                                    s4 = aqwo.a(null, v11);
                                    goto label_243;
                                }
                            }
                            else {
                            label_243:
                                s5 = Uri.encode(aqwo.a(s4, v11));
                                aqql1.j("attachment filename: %s", new Object[]{s5});
                                hashSet0.add(s5);
                                for(Object object0: arrayList0) {
                                    v13 = v10;
                                    if(!((hisp)object0).b.substring(((hisp)object0).b.lastIndexOf(0x2F) + 1).equals(s5)) {
                                        v10 = v13;
                                        continue;
                                    }
                                    connectivityManager1 = connectivityManager0;
                                    goto label_291;
                                }
                                v13 = v10;
                                Uri uri1 = Uri.parse(("content://mms/part/" + v11));
                                if(hrnt.i()) {
                                    connectivityManager1 = connectivityManager0;
                                    file0 = new File(ccsb.a.b(aqze.d(context4), "app_parts"));
                                }
                                else {
                                    connectivityManager1 = connectivityManager0;
                                    file0 = new File(aqze.d(context4), "app_parts");
                                }
                                file0.mkdirs();
                                file1 = hrnt.i() ? new File(ccsb.a.b(file0, s5)) : new File(file0, s5);
                                aqql1.j("writing to file: " + file1.getAbsolutePath(), new Object[0]);
                                try {
                                    inputStream0 = contentResolver0.openInputStream(uri1);
                                    goto label_267;
                                }
                                catch(IOException iOException0) {
                                    goto label_279;
                                }
                            }
                        }
                        goto label_289;
                    }
                    catch(Throwable throwable2) {
                        goto label_306;
                    }
                }
                try {
                label_267:
                    try(FileOutputStream fileOutputStream0 = new FileOutputStream(file1)) {
                        ghjj.b(inputStream0, fileOutputStream0);
                    }
                }
                catch(Throwable throwable3) {
                    try {
                        TWR.safeClose$NT(inputStream0, throwable3);
                        throw throwable3;
                    }
                    catch(IOException iOException0) {
                        goto label_279;
                    }
                    catch(Throwable throwable2) {
                        goto label_306;
                    }
                }
                if(inputStream0 != null) {
                    try {
                        try {
                            inputStream0.close();
                        }
                        catch(IOException iOException0) {
                        label_279:
                            atjh.a.n("Could not write mms attachment to file.", iOException0, new Object[0]);
                            this.o.k(22, "writeMmsAttachmentTmpFile", iOException0);
                            throw new atje("Could not write mms attachment to file.", iOException0);
                        }
                    label_282:
                        try {
                            hisy2 = this.h(hisy1, hisf0, file1, "app_parts/" + s5);
                        }
                        finally {
                            file1.delete();
                        }
                        hisy1 = hisy2;
                        goto label_291;
                    label_289:
                        v13 = v10;
                        connectivityManager1 = connectivityManager0;
                    label_291:
                        if(cursor3.moveToNext()) {
                            connectivityManager0 = connectivityManager1;
                            context3 = context4;
                            cursor1 = cursor2;
                            z = z1;
                            v9 = v13;
                            goto label_223;
                        label_298:
                            cursor2 = cursor1;
                            z1 = z;
                            context4 = context3;
                            connectivityManager1 = connectivityManager0;
                            v13 = 0;
                        }
                    label_303:
                        cursor2.moveToNext();
                        goto label_309;
                    }
                    catch(Throwable throwable2) {
                    }
                    goto label_306;
                }
                goto label_282;
            }
            goto label_303;
            try {
            label_306:
                closeable0 = cursor3;
            label_307:
                bbpb.b(closeable0);
                throw throwable2;
            label_309:
                bbpb.b(cursor3);
                if(v13 != 0) {
                    ++v7;
                }
                int v15 = this.l + 1;
                this.l = v15;
                atji atji1 = this.p;
                if(atji1 != null) {
                    atji1.a(this.k, v15);
                }
                if(hqje.N()) {
                    atjh.m();
                }
                connectivityManager0 = connectivityManager1;
                context3 = context4;
                cursor1 = cursor2;
                z = z1;
                continue;
            }
            catch(Throwable throwable1) {
            }
            try {
            label_325:
                if(hqje.G()) {
                    this.o.b(((long)this.l), ((long)v7));
                }
                bbpb.b(cursor2);
                throw throwable1;
            label_329:
                if(hqje.G()) {
                    this.o.b(((long)this.l), ((long)v7));
                }
                bbpb.b(cursor1);
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: arrayList0) {
                    String s6 = ((hisp)object1).b;
                    if(!hashSet0.contains(s6.substring(s6.lastIndexOf(0x2F) + 1))) {
                        arrayList1.add(atjh.a(s6));
                    }
                }
                if(!hqjj.c() || !hqjp.a.b().a()) {
                    int v16 = arrayList1.size();
                    for(int v17 = 0; v17 < v16; ++v17) {
                        String s7 = (String)arrayList1.get(v17);
                        try {
                            aqox aqox4 = this.m;
                            ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hisn.a).v_newBuilder();
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            ProtoLiteMessage hftv4 = hftp10.b_message;
                            s7.getClass();
                            ((hisn)hftv4).d = s7;
                            String s8 = hisy1.b;
                            if(!hftv4.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            hisn hisn0 = (hisn)hftp10.b_message;
                            s8.getClass();
                            hisn0.e = s8;
                            ProtoLiteBuilder hftp11 = aqow.a(context3);
                            if(!hftp10.b_message.isImmutable()) {
                                hftp10.ensureMutable();
                            }
                            hisn hisn1 = (hisn)hftp10.b_message;
                            hise hise4 = (hise)hftp11.N_build();
                            hise4.getClass();
                            hisn1.c = hise4;
                            hisn1.b |= 1;
                            aqox4.i(((hisn)hftp10.N_build()));
                        }
                        catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception5) {
                            this.o.k(19, "deleteFileRpc", exception5);
                            throw new atje("Could not delete file", exception5);
                        }
                    }
                }
                else {
                    try {
                        aqox aqox5 = this.m;
                        ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)hiso.a).v_newBuilder();
                        String s9 = hisf0.b;
                        if(!hftp12.b_message.isImmutable()) {
                            hftp12.ensureMutable();
                        }
                        ProtoLiteMessage hftv5 = hftp12.b_message;
                        s9.getClass();
                        ((hiso)hftv5).d = s9;
                        if(!hftv5.isImmutable()) {
                            hftp12.ensureMutable();
                        }
                        hiso hiso0 = (hiso)hftp12.b_message;
                        hfuo hfuo0 = hiso0.e;
                        if(!hfuo0.c()) {
                            hiso0.e = ProtoLiteMessage.E(hfuo0);
                        }
                        hfrj.E(arrayList1, hiso0.e);
                        String s10 = hisy1.b;
                        if(!hftp12.b_message.isImmutable()) {
                            hftp12.ensureMutable();
                        }
                        hiso hiso1 = (hiso)hftp12.b_message;
                        s10.getClass();
                        hiso1.f = s10;
                        ProtoLiteBuilder hftp13 = aqow.a(context3);
                        if(!hftp12.b_message.isImmutable()) {
                            hftp12.ensureMutable();
                        }
                        hiso hiso2 = (hiso)hftp12.b_message;
                        hise hise5 = (hise)hftp13.N_build();
                        hise5.getClass();
                        hiso2.c = hise5;
                        hiso2.b |= 1;
                        aqox5.j(((hiso)hftp12.N_build()));
                    }
                    catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception6) {
                        this.o.k(18, "deleteFilesRpc", exception6);
                        throw new atje("Could not delete files", exception6);
                    }
                }
                this.j(hisy1, hisf0);
                context5 = this.i;
                long v18 = Settings.Secure.getLong(context5.getContentResolver(), "mms_backup_last_completed", 0L);
                asdc.o(context5, System.currentTimeMillis());
                Timestamp timestamp0 = new Timestamp(System.currentTimeMillis());
                long v19 = this.z == null ? 0L : timestamp0.getTime() - this.z.getTime();
                long v20 = v18 == 0L ? -1L : timestamp0.getTime() - v18;
                if(hqje.J()) {
                    aqys aqys1 = this.o;
                    boolean z2 = this.A;
                    long v21 = (long)this.v;
                    long v22 = (long)this.w;
                    ProtoLiteBuilder hftp14 = aqra.b();
                    ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
                    if(!hftp15.b_message.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp15.b_message;
                    ((gidr)hftv6).c = 8;
                    ((gidr)hftv6).b |= 1;
                    if(!hftv6.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    ProtoLiteMessage hftv7 = hftp15.b_message;
                    ((gidr)hftv7).g = (z2 ? 2 : 3) - 1;
                    ((gidr)hftv7).b |= 16;
                    if(!hftv7.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp15.b_message;
                    ((gidr)hftv8).b |= 0x2000;
                    ((gidr)hftv8).o = v21;
                    if(!hftv8.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    ProtoLiteMessage hftv9 = hftp15.b_message;
                    ((gidr)hftv9).b |= 0x4000;
                    ((gidr)hftv9).p = v22;
                    if(!hftv9.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    ProtoLiteMessage hftv10 = hftp15.b_message;
                    ((gidr)hftv10).b |= 2;
                    ((gidr)hftv10).d = v19 / 1000L;
                    if(!hftv10.isImmutable()) {
                        hftp15.ensureMutable();
                    }
                    gidr gidr2 = (gidr)hftp15.b_message;
                    gidr2.b |= 4;
                    gidr2.e = v20 / 1000L;
                    if(!hftp14.b_message.isImmutable()) {
                        hftp14.ensureMutable();
                    }
                    ghys ghys1 = (ghys)hftp14.b_message;
                    gidr gidr3 = (gidr)hftp15.N_build();
                    gidr3.getClass();
                    ghys1.H = gidr3;
                    ghys1.c |= 0x400;
                    aqys1.x(hftp14, ghyr.O, aqys1.c);
                }
                else {
                    aqys aqys2 = this.o;
                    boolean z3 = this.A;
                    ProtoLiteBuilder hftp16 = aqra.b();
                    ProtoLiteBuilder hftp17 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
                    if(!hftp17.b_message.isImmutable()) {
                        hftp17.ensureMutable();
                    }
                    ProtoLiteMessage hftv11 = hftp17.b_message;
                    ((gidr)hftv11).c = 8;
                    ((gidr)hftv11).b |= 1;
                    if(!hftv11.isImmutable()) {
                        hftp17.ensureMutable();
                    }
                    ProtoLiteMessage hftv12 = hftp17.b_message;
                    ((gidr)hftv12).g = (z3 ? 2 : 3) - 1;
                    ((gidr)hftv12).b |= 16;
                    if(!hftv12.isImmutable()) {
                        hftp17.ensureMutable();
                    }
                    ProtoLiteMessage hftv13 = hftp17.b_message;
                    ((gidr)hftv13).b |= 2;
                    ((gidr)hftv13).d = v19 / 1000L;
                    if(!hftv13.isImmutable()) {
                        hftp17.ensureMutable();
                    }
                    gidr gidr4 = (gidr)hftp17.b_message;
                    gidr4.b |= 4;
                    gidr4.e = v20 / 1000L;
                    if(!hftp16.b_message.isImmutable()) {
                        hftp16.ensureMutable();
                    }
                    ghys ghys2 = (ghys)hftp16.b_message;
                    gidr gidr5 = (gidr)hftp17.N_build();
                    gidr5.getClass();
                    ghys2.H = gidr5;
                    ghys2.c |= 0x400;
                    aqys2.x(hftp16, ghyr.O, aqys2.c);
                }
                break;
            }
            catch(InterruptedException interruptedException0) {
                goto label_531;
            }
            catch(atje atje0) {
                goto label_538;
            }
            catch(Exception exception0) {
                goto label_543;
            }
            catch(Throwable throwable0) {
                goto label_551;
            }
        }
        if(hqje.K()) {
            this.i();
        }
        aqze.e(context5);
        asdc.p(context5, false);
        return true;
        try {
            try {
            label_497:
                String s11 = hisw0.c;
                try {
                    aqox aqox6 = this.m;
                    ProtoLiteBuilder hftp18 = ((ProtoLiteMessage)hisv.a).v_newBuilder();
                    String s12 = hisf0.b;
                    if(!hftp18.b_message.isImmutable()) {
                        hftp18.ensureMutable();
                    }
                    ProtoLiteMessage hftv14 = hftp18.b_message;
                    s12.getClass();
                    ((hisv)hftv14).d = s12;
                    String s13 = hisy0.b;
                    if(!hftv14.isImmutable()) {
                        hftp18.ensureMutable();
                    }
                    ProtoLiteMessage hftv15 = hftp18.b_message;
                    s13.getClass();
                    ((hisv)hftv15).g = s13;
                    if(!hftv15.isImmutable()) {
                        hftp18.ensureMutable();
                    }
                    hisv hisv2 = (hisv)hftp18.b_message;
                    s11.getClass();
                    hisv2.f = s11;
                    ProtoLiteBuilder hftp19 = aqow.a(this.i);
                    if(!hftp18.b_message.isImmutable()) {
                        hftp18.ensureMutable();
                    }
                    hisv hisv3 = (hisv)hftp18.b_message;
                    hise hise6 = (hise)hftp19.N_build();
                    hise6.getClass();
                    hisv3.c = hise6;
                    hisv3.b |= 1;
                    hisw0 = aqox6.e(((hisv)hftp18.N_build()));
                    goto label_124;
                }
                catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception7) {
                    this.o.k(17, "listFilesRpcWithToken", exception7);
                    throw new atje("Could not list files", exception7);
                }
            }
            catch(InterruptedException interruptedException0) {
            }
            catch(atje atje0) {
                goto label_538;
            }
            catch(Exception exception0) {
                goto label_543;
            }
        label_531:
            Thread.currentThread().interrupt();
            this.o.j(12);
            atjh.a.e("Backup is cancelled", interruptedException0, new Object[0]);
        }
        catch(Throwable throwable0) {
            goto label_551;
        }
        if(hqje.K()) {
            this.i();
            goto label_547;
            try {
            label_538:
                atjh.a.n("Backup terminate with MmsBackupException", atje0, new Object[0]);
            }
            catch(Throwable throwable0) {
                goto label_551;
            }
            if(hqje.K()) {
                this.i();
                goto label_547;
                try {
                label_543:
                    this.o.k(1, "backupMmsData", exception0);
                    atjh.a.n("Error when backing up", exception0, new Object[0]);
                }
                catch(Throwable throwable0) {
                    goto label_551;
                }
                if(hqje.K()) {
                    this.i();
                }
            }
        }
    label_547:
        aqze.e(this.i);
        asdc.p(this.i, false);
        return false;
    label_551:
        if(hqje.K()) {
            this.i();
        }
        aqze.e(this.i);
        asdc.p(this.i, false);
        throw throwable0;
    }

    private final Cursor e() {
        return this.s.query(Telephony.Mms.CONTENT_URI, atjh.g, null, null, "date ASC");
    }

    // This method was un-flattened
    private final hisy f(Cursor cursor0, String s, hisy hisy0, hisf hisf0, Set set0) {
        hisy hisy1;
        File file3;
        Closeable closeable4;
        Cursor cursor9;
        Closeable closeable3;
        Cursor cursor8;
        Closeable closeable2;
        ContentResolver contentResolver1;
        Cursor cursor7;
        int v8;
        File file2;
        atjf atjf2;
        String s5;
        boolean z;
        Closeable closeable1;
        Cursor cursor6;
        Cursor cursor5;
        int v16;
        atjf atjf3;
        int v15;
        long v14;
        CharSequence charSequence0;
        long v10;
        int v5;
        File file1;
        String s2;
        int v3;
        atjf atjf0;
        int v;
        Closeable closeable0;
        JsonWriter jsonWriter0;
        Cursor cursor1 = cursor0;
        String s1 = "application/smil";
        if(cursor1.isAfterLast()) {
            return hisy0;
        }
        File file0 = aqze.b(this.i, s);
        Object[] arr_object = {file0.getAbsolutePath()};
        atjh.a.d("backupFile: %s", arr_object);
        try {
            jsonWriter0 = new JsonWriter(new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(file0)), StandardCharsets.UTF_8), 0x8000));
        }
        catch(IOException iOException0) {
            closeable0 = null;
            goto label_336;
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            goto label_343;
        }
        try {
            jsonWriter0.beginArray();
            v = 0;
            while(true) {
                try {
                    if(v >= this.t || cursor1.isAfterLast()) {
                        break;
                    }
                    int v1 = cursor1.getInt(0);
                    Uri uri0 = Telephony.Mms.CONTENT_URI.buildUpon().appendPath(String.valueOf(v1)).appendPath("part").build();
                    try {
                        Cursor cursor2 = this.s.query(uri0, atjh.d, "ct=?", new String[]{"text/plain"}, "_id ASC");
                        ContentResolver contentResolver0 = this.s;
                        if(cursor2 != null && cursor2.moveToFirst()) {
                            atjf0 = new atjf();
                            while(true) {
                                if(TextUtils.isEmpty(atjf0.a)) {
                                    v3 = v1;
                                    atjf0.a = cursor2.getString(0);
                                }
                                else {
                                    v3 = v1;
                                    atjf0.a = atjf0.a + cursor2.getString(0);
                                }
                                atjf0.b = cursor2.getInt(1);
                                if(!cursor2.moveToNext()) {
                                    break;
                                }
                                v1 = v3;
                            }
                        }
                        else {
                            v3 = v1;
                            atjf0 = null;
                        }
                    }
                    finally {
                        bbpb.b(cursor2);
                    }
                    atjf atjf1 = atjf0 == null || atjf0.a == null ? null : atjf0;
                    if(hqje.a.m().au()) {
                        Uri.Builder uri$Builder0 = Telephony.Mms.CONTENT_URI.buildUpon();
                        uri$Builder0.appendPath(String.valueOf(v3)).appendPath("part");
                        Uri uri1 = uri$Builder0.build();
                        int v4 = FIN.finallyOpen$NT();
                        Cursor cursor3 = contentResolver0.query(uri1, atjh.f, null, null, "_id ASC");
                        if(cursor3 != null && cursor3.moveToFirst()) {
                            do {
                            label_48:
                                if(atjh.n(cursor3.getString(cursor3.getColumnIndex("ct")))) {
                                    FIN.finallyExec$NT(v4);
                                    break;
                                }
                                if(cursor3.moveToNext()) {
                                    goto label_48;
                                }
                                goto label_52;
                            }
                            while(true);
                        }
                        else {
                        label_52:
                            FIN.finallyCodeBegin$NT(v4);
                            s2 = s1;
                            file1 = file0;
                            v5 = 0;
                            goto label_322;
                        }
                    }
                    jsonWriter0.beginObject();
                    int v6 = 0;
                    int v7 = 1;
                    while(v6 < cursor1.getColumnCount()) {
                        String s3 = cursor1.getColumnName(v6);
                        String s4 = cursor1.getString(v6);
                        if(s4 == null) {
                        label_81:
                            s5 = s1;
                            atjf2 = atjf1;
                            file2 = file0;
                            v8 = v6;
                            goto label_213;
                        label_86:
                            long v9 = cursor1.getLong(v6);
                            if(this.j == null) {
                                this.j = new HashMap();
                            }
                            Long long0 = v9;
                            if(this.j.containsKey(long0)) {
                                v10 = v9;
                                s5 = s1;
                                atjf2 = atjf1;
                                file2 = file0;
                                v8 = v6;
                            }
                            else {
                                if(v9 <= 0L) {
                                    v10 = v9;
                                }
                                else {
                                    v10 = v9;
                                    Cursor cursor4 = contentResolver0.query(atjh.h, atjh.r, "_id=?", new String[]{String.valueOf(v9)}, null);
                                    if(cursor4 != null) {
                                        int v11 = FIN.finallyOpen$NT();
                                        if(cursor4.moveToFirst()) {
                                            String s6 = cursor4.getString(1);
                                            FIN.finallyCodeBegin$NT(v11);
                                            cursor4.close();
                                            FIN.finallyCodeEnd$NT(v11);
                                            charSequence0 = s6;
                                            goto label_107;
                                        }
                                        else {
                                            FIN.finallyExec$NT(v11);
                                        }
                                    }
                                }
                                charSequence0 = null;
                            label_107:
                                if(TextUtils.isEmpty(charSequence0)) {
                                    s5 = s1;
                                    atjf2 = atjf1;
                                    file2 = file0;
                                    v8 = v6;
                                    this.j.put(long0, new ArrayList());
                                }
                                else {
                                    Map map0 = this.j;
                                    v8 = v6;
                                    ArrayList arrayList0 = new ArrayList();
                                    file2 = file0;
                                    String[] arr_s = ((String)charSequence0).split(" ", -1);
                                    int v12 = arr_s.length;
                                    String[] arr_s1 = arr_s;
                                    int v13 = 0;
                                    while(true) {
                                        if(v13 >= v12) {
                                            s5 = s1;
                                            atjf2 = atjf1;
                                            if(arrayList0.isEmpty()) {
                                                atjh.a.m(a.a(((String)charSequence0), "No MMS addresses found from ids string [", "]"), new Object[0]);
                                            }
                                            map0.put(long0, arrayList0);
                                            break;
                                        }
                                        String s7 = arr_s1[v13];
                                        try {
                                            v14 = Long.parseLong(s7);
                                            if(v14 < 0L) {
                                                v15 = v12;
                                                goto label_137;
                                            }
                                            else {
                                                goto label_146;
                                            }
                                            goto label_167;
                                        }
                                        catch(NumberFormatException numberFormatException0) {
                                            v15 = v12;
                                            goto label_142;
                                        }
                                        try {
                                        label_137:
                                            atjh.a.m(a.u(v14, "getAddresses: invalid id "), new Object[0]);
                                            atjf3 = atjf1;
                                            v16 = v13;
                                            goto label_167;
                                        }
                                        catch(NumberFormatException numberFormatException0) {
                                        }
                                    label_142:
                                        atjf3 = atjf1;
                                        v16 = v13;
                                        atjh.a.n("getAddresses: invalid id.", numberFormatException0, new Object[0]);
                                        goto label_167;
                                        try {
                                        label_146:
                                            v15 = v12;
                                            v16 = v13;
                                            atjf3 = atjf1;
                                            cursor5 = contentResolver0.query(ContentUris.withAppendedId(atjh.b, v14), null, null, null, null);
                                            atjf3 = atjf1;
                                            v16 = v13;
                                        }
                                        catch(Exception exception0) {
                                            atjh.a.n(a.u(v14, "getAddresses: query failed for id "), exception0, new Object[0]);
                                            cursor5 = null;
                                        }
                                        if(cursor5 != null) {
                                            int v17 = FIN.finallyOpen$NT();
                                            if(cursor5.moveToFirst()) {
                                                String s8 = cursor5.getString(0);
                                                if(TextUtils.isEmpty(s8)) {
                                                    atjh.a.m(a.u(v14, "Canonical MMS/SMS address is empty for id: "), new Object[0]);
                                                }
                                                else {
                                                    arrayList0.add(s8);
                                                }
                                            }
                                            FIN.finallyCodeBegin$NT(v17);
                                            cursor5.close();
                                            FIN.finallyCodeEnd$NT(v17);
                                        }
                                    label_167:
                                        v13 = v16 + 1;
                                        atjf1 = atjf3;
                                        s1 = s1;
                                        v12 = v15;
                                    }
                                }
                            }
                            List list0 = (List)this.j.get(Long.valueOf(v10));
                            if(list0 != null && !list0.isEmpty()) {
                                JsonWriter jsonWriter1 = jsonWriter0.name("recipients");
                                jsonWriter1.beginArray();
                                for(Object object0: list0) {
                                    jsonWriter1.value(((String)object0));
                                }
                                jsonWriter1.endArray();
                                Map map1 = this.u;
                                Long long1 = v10;
                                if(!map1.containsKey(long1)) {
                                    Uri.Builder uri$Builder1 = Telephony.Threads.CONTENT_URI.buildUpon();
                                    uri$Builder1.appendPath(String.valueOf(v10)).appendPath("recipients");
                                    Uri uri2 = uri$Builder1.build();
                                    try {
                                        cursor6 = this.s.query(uri2, atjh.q, null, null, null);
                                    }
                                    catch(Throwable throwable1) {
                                        closeable1 = null;
                                        goto label_204;
                                    }
                                    if(cursor6 != null) {
                                        try {
                                            if(cursor6.moveToFirst()) {
                                                if(cursor6.getInt(0) == 1) {
                                                    goto label_206;
                                                }
                                                else {
                                                    goto label_210;
                                                }
                                            }
                                            goto label_211;
                                        }
                                        catch(Throwable throwable1) {
                                            closeable1 = cursor6;
                                        }
                                    label_204:
                                        bbpb.b(closeable1);
                                        throw throwable1;
                                    label_206:
                                        z = true;
                                        bbpb.b(cursor6);
                                        jsonWriter0.name("archived").value(true);
                                        goto label_212;
                                    label_210:
                                        z = false;
                                    }
                                label_211:
                                    bbpb.b(cursor6);
                                label_212:
                                    map1.put(long1, Boolean.valueOf(z));
                                }
                            }
                        }
                        else {
                            switch(s3) {
                                case "_id": {
                                    goto label_81;
                                }
                                case "sub": {
                                    jsonWriter0.name(s3).value(s4);
                                    s5 = s1;
                                    atjf2 = atjf1;
                                    file2 = file0;
                                    v8 = v6;
                                    v7 = 0;
                                    goto label_214;
                                }
                                case "sub_cs": {
                                    goto label_81;
                                }
                                case "thread_id": {
                                    goto label_86;
                                }
                                default: {
                                    s5 = s1;
                                    atjf2 = atjf1;
                                    file2 = file0;
                                    v8 = v6;
                                    jsonWriter0.name(s3).value(s4);
                                }
                            }
                        }
                    label_213:
                        v7 = v7;
                    label_214:
                        v6 = v8 + 1;
                        cursor1 = cursor0;
                        atjf1 = atjf2;
                        file0 = file2;
                        s1 = s5;
                    }
                    String s9 = s1;
                    file1 = file0;
                    JsonWriter jsonWriter2 = jsonWriter0.name("mms_addresses");
                    Uri.Builder uri$Builder2 = Telephony.Mms.CONTENT_URI.buildUpon();
                    uri$Builder2.appendPath(String.valueOf(v3)).appendPath("addr");
                    Uri uri3 = uri$Builder2.build();
                    jsonWriter2.beginArray();
                    try {
                        cursor7 = this.s.query(uri3, atjh.c, null, null, "_id ASC");
                        contentResolver1 = this.s;
                    }
                    catch(Throwable throwable2) {
                        closeable2 = null;
                        goto label_245;
                    }
                    if(cursor7 != null) {
                        try {
                            if(cursor7.moveToFirst()) {
                                do {
                                    if(cursor7.getString(cursor7.getColumnIndex("address")) != null) {
                                        jsonWriter2.beginObject();
                                        atjh.k(jsonWriter2, cursor7, "type");
                                        atjh.l(jsonWriter2, cursor7, "address");
                                        atjh.k(jsonWriter2, cursor7, "charset");
                                        jsonWriter2.endObject();
                                    }
                                }
                                while(cursor7.moveToNext());
                            }
                            goto label_247;
                        }
                        catch(Throwable throwable2) {
                            closeable2 = cursor7;
                        }
                    label_245:
                        bbpb.b(closeable2);
                        throw throwable2;
                    }
                label_247:
                    bbpb.b(cursor7);
                    jsonWriter2.endArray();
                    JsonWriter jsonWriter3 = jsonWriter0.name("attachments");
                    Uri.Builder uri$Builder3 = Telephony.Mms.CONTENT_URI.buildUpon();
                    uri$Builder3.appendPath(String.valueOf(v3)).appendPath("part");
                    Uri uri4 = uri$Builder3.build();
                    jsonWriter3.beginArray();
                    try {
                        cursor8 = contentResolver1.query(uri4, (hqje.P() ? atjh.f : atjh.e), null, null, "_id ASC");
                    }
                    catch(Throwable throwable3) {
                        closeable3 = null;
                        goto label_282;
                    }
                    if(cursor8 != null) {
                        try {
                            if(cursor8.moveToFirst()) {
                                while(true) {
                                    String s10 = cursor8.getString(cursor8.getColumnIndex("ct"));
                                    if(atjh.n(s10)) {
                                        int v18 = cursor8.getInt(cursor8.getColumnIndex("_id"));
                                        String s11 = cursor8.getString(cursor8.getColumnIndex("cl"));
                                        if(s11 != null) {
                                        label_271:
                                            String s12 = aqwo.a(s11, v18);
                                            jsonWriter3.beginObject();
                                            jsonWriter3.name("mime_type").value(s10);
                                            jsonWriter3.name("filename").value(s12);
                                            String s13 = cursor8.getString(cursor8.getColumnIndex("text"));
                                            jsonWriter3.name("mms_body").value(s13);
                                            jsonWriter3.endObject();
                                        }
                                        else if(hqje.P() && cursor8.getString(cursor8.getColumnIndex("name")) != null) {
                                            s11 = cursor8.getString(cursor8.getColumnIndex("name"));
                                            goto label_271;
                                        }
                                        else if(hqje.Q()) {
                                            s11 = aqwo.a(null, v18);
                                            goto label_271;
                                        }
                                    }
                                    if(!cursor8.moveToNext()) {
                                        break;
                                    }
                                }
                            }
                            goto label_284;
                        }
                        catch(Throwable throwable3) {
                            closeable3 = cursor8;
                        }
                    label_282:
                        bbpb.b(closeable3);
                        throw throwable3;
                    }
                label_284:
                    bbpb.b(cursor8);
                    jsonWriter3.endArray();
                    Uri.Builder uri$Builder4 = Telephony.Mms.CONTENT_URI.buildUpon();
                    uri$Builder4.appendPath(String.valueOf(v3)).appendPath("part");
                    Uri uri5 = uri$Builder4.build();
                    try {
                        cursor9 = contentResolver1.query(uri5, (hqje.P() ? atjh.f : atjh.e), "ct=?", new String[]{s9}, "_id ASC");
                    }
                    catch(Throwable throwable4) {
                        closeable4 = null;
                        goto label_309;
                    }
                    if(cursor9 == null) {
                        goto label_305;
                    label_308:
                        closeable4 = cursor9;
                    label_309:
                        bbpb.b(closeable4);
                        throw throwable4;
                    }
                    else {
                        try {
                            if(cursor9.moveToFirst()) {
                                while(true) {
                                    s2 = s9;
                                    if(s2.equals(cursor9.getString(cursor9.getColumnIndex("ct")))) {
                                        String s14 = cursor9.getString(cursor9.getColumnIndex("text"));
                                        jsonWriter0.name("smil").value(s14);
                                    }
                                    if(!cursor9.moveToNext()) {
                                        goto label_311;
                                    }
                                    s9 = s2;
                                }
                            }
                            else {
                                s2 = s9;
                                goto label_311;
                            }
                        label_305:
                            s2 = s9;
                            goto label_311;
                        }
                        catch(Throwable throwable4) {
                        }
                        goto label_308;
                    }
                label_311:
                    bbpb.b(cursor9);
                    jsonWriter0.name("mms_body").value("");
                    if(atjf1 != null) {
                        jsonWriter0.name("mms_charset").value(((long)atjf1.b));
                    }
                    if(v7 == 0) {
                        cursor1 = cursor0;
                        atjh.l(jsonWriter0, cursor1, "sub_cs");
                    }
                    else {
                        cursor1 = cursor0;
                    }
                    jsonWriter0.endObject();
                    v5 = 1;
                label_322:
                    cursor1.moveToNext();
                    s1 = s2;
                    file0 = file1;
                    v += v5;
                }
                catch(IOException iOException1) {
                    atjh.a.n("Could not put mms messages to json.", iOException1, new Object[0]);
                    this.o.k(22, "putMmsMessagesToJson", iOException1);
                    throw new atje("Could not put mms messages to json.", iOException1);
                }
            }
            jsonWriter0.endArray();
            goto label_345;
        }
        catch(IOException iOException0) {
            closeable0 = jsonWriter0;
            try {
            label_336:
                atjh.a.n("Could not get json writer.", iOException0, new Object[0]);
                this.o.k(22, "backupAll", iOException0);
                throw new atje("Could not get json writer.", iOException0);
            }
            catch(Throwable throwable0) {
            }
        }
        catch(Throwable throwable0) {
            closeable0 = jsonWriter0;
        }
    label_343:
        bbpb.b(closeable0);
        throw throwable0;
    label_345:
        bbpb.b(jsonWriter0);
        int v19 = FIN.finallyOpen$NT();
        if(v > 0) {
            this.k += v;
            file3 = file0;
            hisy1 = this.h(hisy0, hisf0, file3, s);
            set0.add(s);
        }
        else {
            file3 = file0;
            hisy1 = hisy0;
        }
        FIN.finallyCodeBegin$NT(v19);
        file3.delete();
        FIN.finallyCodeEnd$NT(v19);
        return hisy1;
    }

    private final hisy g(hisf hisf0) {
        try {
            aqox aqox0 = this.m;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hisx.a).v_newBuilder();
            String s = hisf0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hisx hisx0 = (hisx)hftp0.b_message;
            s.getClass();
            hisx0.d = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hita.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hita)hftp1.b_message).b = 2;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hisx hisx1 = (hisx)hftp0.b_message;
            hita hita0 = (hita)hftp1.N_build();
            hita0.getClass();
            hisx1.e = hita0;
            hisx1.b |= 2;
            long v = hqje.i();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hisx)hftp0.b_message).f = v;
            ProtoLiteBuilder hftp2 = aqow.a(this.i);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hisx hisx2 = (hisx)hftp0.b_message;
            hise hise0 = (hise)hftp2.N_build();
            hise0.getClass();
            hisx2.c = hise0;
            hisx2.b |= 1;
            hisy hisy0 = aqox0.f(((hisx)hftp0.N_build()));
            this.y = 0L;
            return hisy0;
        }
        catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception0) {
            if(hqje.L() && ((exception0 instanceof aqxy) && ((aqxy)exception0).a == 429)) {
                this.o.k(24, "startTransactionRpc", exception0);
                atjh.a.m("startTransaction exceed storage quota.", new Object[0]);
                throw new atje("StartTransaction file exceed storage quota.", exception0);
            }
            this.o.k(15, "startTransactionRpc", exception0);
            throw new atje("Could not start transaction.", exception0);
        }
    }

    private final hisy h(hisy hisy0, hisf hisf0, File file0, String s) {
        hjiz hjiz3;
        hjjc hjjc0;
        Uri.Builder uri$Builder1;
        hitc hitc7;
        Uri.Builder uri$Builder0;
        hjiz hjiz2;
        int v9;
        boolean z;
        long v8;
        long v7;
        hitc hitc6;
        aqpe aqpe0;
        hisy hisy2;
        hjjw hjjw0;
        claw claw0;
        arxu arxu1;
        clgu clgu0;
        clcf clcf0;
        ckcq ckcq0;
        hisp hisp2;
        arxy arxy0;
        String s5;
        ProtoLiteBuilder hftp3;
        hjiz hjiz1;
        hjiz hjiz0;
        int v4;
        long v3;
        long v2;
        hitc hitc2;
        long v1;
        aqnp aqnp0;
        hisy hisy1;
        File file1 = file0;
        long v = file1.length();
        if(this.y > 0L && this.y + v > hqje.i()) {
            this.j(hisy0, hisf0);
            hisy1 = this.g(hisf0);
        }
        else {
            hisy1 = hisy0;
        }
        String s1 = MimeTypeMap.getFileExtensionFromUrl(file1.getAbsolutePath());
        String s2 = s1 == null ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(s1);
        hisp hisp0 = hisp.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hisp0).v_newBuilder();
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hisp)hftp0.b_message).c = s2;
        }
        try {
            aqnp0 = this.n;
            if(aqnp0 == null) {
                goto label_193;
            }
            else {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hitc.a).v_newBuilder();
                String s3 = hisy1.b;
                v1 = v;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s3.getClass();
                ((hitc)hftv0).f = s3;
                String s4 = hisf0.b;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s4.getClass();
                ((hitc)hftv1).d = s4;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                s.getClass();
                ((hitc)hftv2).e = s;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hitc hitc0 = (hitc)hftp1.b_message;
                hisp hisp1 = (hisp)hftp0.N_build();
                hisp1.getClass();
                hitc0.g = hisp1;
                hitc0.b |= 2;
                ProtoLiteBuilder hftp2 = aqow.a(this.i);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hitc hitc1 = (hitc)hftp1.b_message;
                hise hise0 = (hise)hftp2.N_build();
                hise0.getClass();
                hitc1.c = hise0;
                hitc1.b |= 1;
                hitc2 = (hitc)hftp1.N_build();
                v2 = hqje.h();
                v3 = hqje.c();
                v4 = 0;
                while(true) {
                    hjiz0 = new hjiz(file1);
                    goto label_56;
                }
            }
            return hisy2;
        }
        catch(ExecutionException | hjjv | aqxy | IOException | aqxu | aqyb exception0) {
            hisy2 = hisy1;
            goto label_304;
        }
        try {
        label_56:
            hjiz1 = hjiz0;
            hftp3 = ((ProtoLiteMessage)arxy.a).v_newBuilder();
            s5 = hitc2.d;
            hjiz1 = hjiz0;
            goto label_65;
        }
        catch(hjjv | aqxy | IOException | aqxu | aqyb exception1) {
        }
        catch(Throwable throwable0) {
            goto label_188;
        }
        hitc hitc3 = hitc2;
        hjiz1 = hjiz0;
        hisp2 = hisp0;
        goto label_174;
        try {
        label_65:
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp3.b_message;
            arxy0 = (arxy)hftv3;
            s5.getClass();
            hisp2 = hisp0;
            goto label_76;
        }
        catch(hjjv | aqxy | IOException | aqxu | aqyb exception1) {
        }
        catch(Throwable throwable0) {
            goto label_188;
        }
        hitc3 = hitc2;
        hisp2 = hisp0;
        goto label_174;
        try {
        label_76:
            arxy0.b |= 1;
            arxy0.c = s5;
            String s6 = hitc2.e;
            if(!hftv3.isImmutable()) {
                hftp3.ensureMutable();
            }
            arxy arxy1 = (arxy)hftp3.b_message;
            s6.getClass();
            arxy1.b |= 2;
            arxy1.d = s6;
            arxy arxy2 = (arxy)hftp3.N_build();
            clbc clbc0 = new clbc(null);
            clbc0.c(hqje.k());
            clbc0.b("upload/v1");
            clbc0.d(((MessageLite)arxy2), ckay.f, arxz.a);
            clbd clbd0 = new clbd(clbc0);
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)arxw.a).v_newBuilder();
            String s7 = hitc2.f;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            arxw arxw0 = (arxw)hftp4.b_message;
            s7.getClass();
            hfuo hfuo0 = arxw0.b;
            if(!hfuo0.c()) {
                arxw0.b = ProtoLiteMessage.E(hfuo0);
            }
            arxw0.b.add(s7);
            String s8 = (hitc2.g == null ? hisp2 : hitc2.g).c;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            arxw arxw1 = (arxw)hftp4.b_message;
            s8.getClass();
            hfuo hfuo1 = arxw1.c;
            if(!hfuo1.c()) {
                arxw1.c = ProtoLiteMessage.E(hfuo1);
            }
            arxw1.c.add(s8);
            String s9 = (hitc2.c == null ? hise.a : hitc2.c).d;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            arxw arxw2 = (arxw)hftp4.b_message;
            s9.getClass();
            hfuo hfuo2 = arxw2.d;
            if(!hfuo2.c()) {
                arxw2.d = ProtoLiteMessage.E(hfuo2);
            }
            arxw2.d.add(s9);
            hise hise1 = hitc2.c == null ? hise.a : hitc2.c;
            String s10 = (hise1.c == null ? hish.a : hise1.c).b;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            arxw arxw3 = (arxw)hftp4.b_message;
            s10.getClass();
            hfuo hfuo3 = arxw3.e;
            if(!hfuo3.c()) {
                arxw3.e = ProtoLiteMessage.E(hfuo3);
            }
            arxw3.e.add(s10);
            hise hise2 = hitc2.c == null ? hise.a : hitc2.c;
            String s11 = String.valueOf((hise2.c == null ? hish.a : hise2.c).c);
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            arxw arxw4 = (arxw)hftp4.b_message;
            s11.getClass();
            hfuo hfuo4 = arxw4.f;
            if(!hfuo4.c()) {
                arxw4.f = ProtoLiteMessage.E(hfuo4);
            }
            arxw4.f.add(s11);
            arxw arxw5 = (arxw)hftp4.N_build();
            clba clba0 = new clba(null);
            clba0.c(((MessageLite)arxw5), ckay.e, arxx.a);
            cldm cldm0 = new cldm(clba0);
            ckcq0 = ckay.c;
            clcf0 = clcg.b(clbd0, cldm0, ckcq0);
            clgu0 = aqnp0.d;
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)arxu.a).v_newBuilder();
            String s12 = "Bearer " + aqnp0.b.a();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            arxu arxu0 = (arxu)hftp5.b_message;
            hfuo hfuo5 = arxu0.b;
            if(!hfuo5.c()) {
                arxu0.b = ProtoLiteMessage.E(hfuo5);
            }
            arxu0.b.add(s12);
            arxu1 = (arxu)hftp5.N_build();
            claw0 = new claw(null);
            hitc3 = hitc2;
            goto label_162;
        }
        catch(hjjv | aqxy | IOException | aqxu | aqyb exception1) {
        }
        catch(Throwable throwable0) {
            goto label_188;
        }
        hitc3 = hitc2;
        goto label_174;
        try {
        label_162:
            claw0.b(((MessageLite)arxu1), ckay.d, arxv.a);
            hjjt hjjt0 = clgu0.a(clcf0, "POST", new clax(claw0), hjiz1, null, null, -1, 1040, ckcq0);
            try {
                hjjw0 = (hjjw)hjjt0.b().get();
                if(hjjw0.a()) {
                    int v5 = hjjw0.b.a;
                    if(v5 == 200) {
                        goto label_190;
                    }
                    throw new aqxy("Scotty upload failure", v5);
                }
            }
            catch(ExecutionException | InterruptedException exception2) {
                throw (exception2.getCause() instanceof IOException) ? ((IOException)exception2.getCause()) : new IOException("Scotty upload response is empty", exception2);
            }
            if(!hjjw0.b()) {
                goto label_190;
            }
            try {
                throw hjjw0.a;
            }
            catch(ExecutionException | InterruptedException exception2) {
                throw (exception2.getCause() instanceof IOException) ? ((IOException)exception2.getCause()) : new IOException("Scotty upload response is empty", exception2);
            }
        }
        catch(hjjv | aqxy | IOException | aqxu | aqyb exception1) {
        }
        catch(Throwable throwable0) {
            goto label_188;
        }
        try {
        label_174:
            int v6 = Long.compare(v4 + 1, v2);
            if(v6 >= 0) {
                aqnp.a.m(a.ao(exception1, "Update file retry fail with "), new Object[0]);
                throw exception1;
            }
            Thread.sleep(v3, 0);
            v3 += v3;
        }
        catch(Throwable throwable0) {
            goto label_188;
        }
        try {
            hjiz1.close();
            if(v6 < 0) {
                hitc2 = hitc3;
                file1 = file0;
                ++v4;
                hisp0 = hisp2;
                hjiz0 = new hjiz(file1);
                goto label_56;
            label_188:
                hjiz1.close();
                throw throwable0;
            label_190:
                hjiz1.close();
            }
            hisy2 = hisy1;
            goto label_299;
        label_193:
            v1 = v;
            aqpe0 = this.x;
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hitc.a).v_newBuilder();
            String s13 = hisy1.b;
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp6.b_message;
            s13.getClass();
            ((hitc)hftv4).f = s13;
            String s14 = hisf0.b;
            if(!hftv4.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv5 = hftp6.b_message;
            s14.getClass();
            ((hitc)hftv5).d = s14;
            if(!hftv5.isImmutable()) {
                hftp6.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp6.b_message;
            s.getClass();
            ((hitc)hftv6).e = s;
            if(!hftv6.isImmutable()) {
                hftp6.ensureMutable();
            }
            hitc hitc4 = (hitc)hftp6.b_message;
            hisp hisp3 = (hisp)hftp0.N_build();
            hisp3.getClass();
            hitc4.g = hisp3;
            hitc4.b |= 2;
            ProtoLiteBuilder hftp7 = aqow.a(this.i);
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            hitc hitc5 = (hitc)hftp6.b_message;
            hise hise3 = (hise)hftp7.N_build();
            hise3.getClass();
            hitc5.c = hise3;
            hitc5.b |= 1;
            hitc6 = (hitc)hftp6.N_build();
            v7 = hqje.h();
            v8 = hqje.c();
            hqje hqje0 = hqje.a;
            z = hqje0.m().M();
            v9 = 0;
            while(true) {
            label_234:
                hjiz2 = new hjiz(file0);
                break;
            }
        }
        catch(ExecutionException | hjjv | aqxy | IOException | aqxu | aqyb exception0) {
            hisy2 = hisy1;
            goto label_304;
        }
        try {
            hisy2 = hisy1;
            uri$Builder0 = new Uri.Builder().scheme("https").encodedAuthority(hqje.n()).appendPath("upload").appendPath("v1").appendEncodedPath(hitc6.d).appendPath("files").appendEncodedPath(hitc6.e);
            hisy2 = hisy1;
            goto label_247;
        }
        catch(ExecutionException | hjjv | aqxy | IOException | aqxu | aqyb exception3) {
            hitc7 = hitc6;
            hisy2 = hisy1;
            hjiz3 = hjiz2;
            goto label_278;
            try {
            label_247:
                uri$Builder1 = uri$Builder0.appendQueryParameter("transaction_id", hitc6.f).appendQueryParameter("file.mime_type", (hitc6.g == null ? hisp.a : hitc6.g).c);
                aqpe.a(uri$Builder1, (hitc6.c == null ? hise.a : hitc6.c));
                hjjc0 = new hjjc();
                hitc7 = hitc6;
                goto label_255;
            }
            catch(ExecutionException | hjjv | aqxy | IOException | aqxu | aqyb exception3) {
            }
            catch(Throwable throwable1) {
                hjiz3 = hjiz2;
                goto label_287;
            }
            hitc7 = hitc6;
            hjiz3 = hjiz2;
            goto label_278;
            try {
            label_255:
                hjjc0.d("Authorization", "Bearer " + aqpe0.c.a());
                hjiz3 = hjiz2;
                goto label_264;
            }
            catch(ExecutionException | hjjv | aqxy | IOException | aqxu | aqyb exception3) {
            }
            catch(Throwable throwable1) {
                hjiz3 = hjiz2;
                goto label_287;
            }
            hjiz3 = hjiz2;
            goto label_278;
        }
        catch(Throwable throwable1) {
            hjiz3 = hjiz2;
            goto label_287;
        }
        try {
        label_264:
            hjjt hjjt1 = aqpe0.d.a(uri$Builder1.toString(), "POST", hjjc0, hjiz3, null, null);
            if(hrsa.j()) {
                hjjt1.g(cjxb.a(1040));
            }
            hjjw hjjw1 = (hjjw)hjjt1.b().get();
            if(!hjjw1.a()) {
                if(hjjw1.b()) {
                    throw hjjw1.a;
                }
                throw new IOException("Scotty upload response is empty");
            }
            int v10 = hjjw1.b.a;
            if(v10 != 200) {
                throw new aqxy("Scotty upload failure", v10);
            }
            if(hqje0.m().Z()) {
                goto label_289;
            }
            goto label_291;
        }
        catch(ExecutionException | hjjv | aqxy | IOException | aqxu | aqyb exception3) {
        }
        catch(Throwable throwable1) {
            goto label_287;
        }
        try {
        label_278:
            if(!z || ((long)(v9 + 1)) >= v7) {
                aqpe.a.m(a.ao(exception3, "Update file retry fail with "), new Object[0]);
                throw exception3;
            }
            Thread.sleep(v8, 0);
            v8 += v8;
        }
        catch(Throwable throwable1) {
            goto label_287;
        }
        try {
            hjiz3.close();
            boolean z1 = true;
            goto label_293;
        label_287:
            hjiz3.close();
            throw throwable1;
        label_289:
            hjiz3.close();
            goto label_299;
        label_291:
            hjiz3.close();
            z1 = z;
        label_293:
            if(z1 && ((long)(v9 + 1)) < v7) {
                hitc6 = hitc7;
                ++v9;
                hisy1 = hisy2;
                v7 = v7;
                goto label_234;
            }
        label_299:
            this.y += v1;
            if(hqje.J()) {
                ++this.v;
                return hisy2;
            }
            return hisy2;
        }
        catch(ExecutionException | hjjv | aqxy | IOException | aqxu | aqyb exception0) {
        }
    label_304:
        if(hqje.a.m().af() && (this.C != null && this.C.a.b.a.get())) {
            atjh.a.d("canceled flag is true, throw InterruptedException", new Object[0]);
            throw new InterruptedException();
        }
        if(hqje.J()) {
            ++this.w;
        }
        aqql aqql0 = atjh.a;
        aqql0.n("Error for backing up attachment", exception0, new Object[0]);
        if(hqje.L() && (exception0 instanceof aqxy) && ((aqxy)exception0).a == 429) {
            this.o.k(24, "uploadFile", exception0);
            aqql0.m("uploadFile exceed storage quota.", new Object[0]);
            throw new atje("Upload file exceed storage quota.", exception0);
        }
        return hisy2;
    }

    private final void i() {
        ScheduledExecutorService scheduledExecutorService0 = this.B;
        if(scheduledExecutorService0 == null) {
            return;
        }
        atjh.a.h("Periodic backup progress update is shut down.", new Object[0]);
        scheduledExecutorService0.shutdownNow();
        aqys aqys0 = this.o;
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gifl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gifl)hftp1.b_message).c = 3;
        ((gifl)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gifl gifl0 = (gifl)hftp1.N_build();
        gifl0.getClass();
        ghys0.af = gifl0;
        ghys0.d |= 0x40;
        aqys0.x(hftp0, ghyr.ar, aqys0.c);
    }

    private final void j(hisy hisy0, hisf hisf0) {
        try {
            aqox aqox0 = this.m;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hisi.a).v_newBuilder();
            String s = hisf0.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((hisi)hftv0).d = s;
            String s1 = hisy0.b;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hisi hisi0 = (hisi)hftp0.b_message;
            s1.getClass();
            hisi0.e = s1;
            ProtoLiteBuilder hftp1 = aqow.a(this.i);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hisi hisi1 = (hisi)hftp0.b_message;
            hise hise0 = (hise)hftp1.N_build();
            hise0.getClass();
            hisi1.c = hise0;
            hisi1.b |= 1;
            aqox0.g(((hisi)hftp0.N_build()));
        }
        catch(IOException | aqxy | aqxu | aqyb | acse | iapl exception0) {
            if(hqje.L() && ((exception0 instanceof aqxy) && ((aqxy)exception0).a == 429)) {
                this.o.k(24, "commitTransactionRpc", exception0);
                atjh.a.m("commitTransaction exceed storage quota.", new Object[0]);
                throw new atje("CommitTransaction file exceed storage quota.", exception0);
            }
            this.o.k(16, "commitTransactionRpc", exception0);
            throw new atje("Could not commit transaction.", exception0);
        }
    }

    private static void k(JsonWriter jsonWriter0, Cursor cursor0, String s) {
        int v = cursor0.getInt(cursor0.getColumnIndex(s));
        if(v != 0) {
            jsonWriter0.name(s).value(((long)v));
        }
    }

    private static void l(JsonWriter jsonWriter0, Cursor cursor0, String s) {
        String s1 = cursor0.getString(cursor0.getColumnIndex(s));
        if(s1 != null) {
            jsonWriter0.name(s).value(s1);
        }
    }

    private static final void m() {
        if(!Thread.currentThread().isInterrupted()) {
            return;
        }
        throw new InterruptedException();
    }

    private static final boolean n(String s) {
        String s1 = hqje.a.m().y();
        if(!gfta.c(s) && !gfta.c(s1)) {
            String[] arr_s = s1.split(";", -1);
            for(int v = 0; v < arr_s.length; ++v) {
                if(s.startsWith(arr_s[v]) && !s.equals("text/plain")) {
                    return true;
                }
            }
        }
        return false;
    }
}

