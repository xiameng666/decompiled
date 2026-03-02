import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.net.Uri.Builder;
import android.os.SystemClock;
import android.os.Trace;
import android.system.Os;
import android.util.Log;
import android.util.LruCache;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.clearcut.store.FlatFileLogStore.CantCreateDirException;
import com.google.android.gms.clearcut.store.FlatFileLogStore.InvalidLogFileNameException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class azfv implements azge {
    public static final int a;
    public static final gfud b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Context f;
    public final File g;
    public final LruCache h;
    public final LruCache i;
    public volatile Map j;
    final Map k;
    final frli l;
    private static final String[] m;
    private static final gfud n;
    private final String o;
    private final gged_interceptors p;
    private final LruCache q;
    private final ayub r;
    private long s;
    private volatile Long t;
    private ayvj u;
    private long v;
    private long w;

    static {
        azfv.a = CodedOutputStream.Y(0x7FFFFFFF);
        azfv.b = gfud.e(',');
        azfv.m = new String[0];
        azfv.n = gfud.e('.');
    }

    public azfv(Context context0, frii frii0) {
        String s;
        File file0 = new File(context0.getFilesDir(), "clearcut");
        ayub ayub0 = new ayub(context0);
        super();
        this.c = new Object();
        this.d = new Object();
        this.e = new Object();
        this.h = new LruCache(((int)hram.a.d().e()));
        this.i = new azff(this, ((int)hram.a.d().f()));
        this.q = new azfi(this, ((int)hrbh.a.b().a()));
        this.j = null;
        this.t = null;
        this.u = null;
        this.k = new HashMap();
        this.v = 0L;
        this.w = 0L;
        this.f = context0;
        this.g = file0;
        try {
            s = file0.getCanonicalPath();
        }
        catch(IOException iOException0) {
            Log.e("CCTFlatFileLogStore", "Failed to get the canonical path for root directory.", iOException0);
            s = null;
        }
        this.o = s;
        this.p = gged_interceptors.k(hlqe.values());
        this.s = 0L;
        frie frie0 = frif.a();
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("file").authority("").path("/");
        ggdy ggdy0 = new ggdy();
        frcp.b(file0, uri$Builder0);
        uri$Builder0.appendPath("internal_events.pb");
        frie0.f(frcp.a(uri$Builder0, ggdy0));
        frie0.e(((MessageLite)hlpf.a));
        this.l = frii0.a(frie0.a());
        this.r = ayub0;
        this.u = null;
    }

    @Override  // azge
    public final boolean A() {
        for(int v = 0; true; ++v) {
            gged_interceptors gged0 = this.p;
            if(v >= ((ggna)gged0).c) {
                break;
            }
            hlqe hlqe0 = (hlqe)gged0.get(v);
            File file0 = new File(this.g, Integer.toString(hlqe0.f));
            if(file0.isDirectory()) {
                Iterator iterator0 = azfp.a(file0).iterator();
                while(iterator0.hasNext()) {
                    File file1 = ((azfo)iterator0).a();
                    if(file1.isDirectory() && !file1.getName().equals("METALOG_COUNTERS") && azfv.L(file1.list()).length > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // azge
    public final void B(int v) {
        Integer integer0;
        try {
            integer0 = (Integer)evrg.o(this.r.e(), hqzj.a.b().a(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Log.e("CCTFlatFileLogStore", "Failed to get boot count.", exception0);
            integer0 = null;
        }
        if(integer0 != null) {
            long v1 = SystemClock.elapsedRealtime();
            long v2 = System.currentTimeMillis();
            hftr hftr0 = (hftr)((ProtoLiteMessage)hlpp.a).v_newBuilder();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlpp hlpp0 = (hlpp)hftr0.b_message;
            hlpp0.b |= 1;
            hlpp0.c = v2;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            hlpp hlpp1 = (hlpp)hftr0.b_message;
            hlpp1.b |= 2;
            hlpp1.d = v1;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            ((hlpp)hftr0.b_message).n = v - 1;
            ((hlpp)hftr0.b_message).b |= 0x200000;
            hlpp hlpp2 = (hlpp)((ProtoLiteBuilder)hftr0).N_build();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlpe.a).v_newBuilder();
            int v3 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hlpe)hftv0).b |= 1;
            ((hlpe)hftv0).c = v3;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((hlpe)hftv1).b |= 2;
            ((hlpe)hftv1).d = v1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlpe hlpe0 = (hlpe)hftp0.b_message;
            hlpe0.b |= 4;
            hlpe0.e = v2;
            ByteString hfsf0 = hlpp2.getDefaultInstanceForType();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hlpe hlpe1 = (hlpe)hftp0.b_message;
            hlpe1.b |= 8;
            hlpe1.f = hfsf0;
            azfj azfj0 = new azfj(((long)(((int)integer0))), v1);
            long v4 = Math.max(0L, System.currentTimeMillis() - hram.a.d().c());
            try {
                azfa azfa0 = new azfa(v4, azfj0, hftp0);
                gmde.a(this.l.b(azfa0, gmap.a));
            }
            catch(ExecutionException executionException0) {
                Log.e("CCTFlatFileLogStore", "Failed to update Clearcut internal events.", executionException0);
            }
        }
    }

    private final long C(azfs azfs0, azfu azfu0, azfz azfz0, File file0, azgc azgc0) {
        long v = 0L;
        for(Object object0: azfu0.b()) {
            long v1 = ((File)object0).length();
            int v2 = azfv.z(((File)object0)).a;
            if(azfs0.a(((File)object0), azfu0.c(), azgc0, v2)) {
                v += this.b(v1);
                if(azfz0 != null) {
                    azfz0.g += (long)v2;
                    azfz0.c += v1;
                }
            }
        }
        if(!file0.delete()) {
            Log.e("CCTFlatFileLogStore", file0.getAbsolutePath() + " could not be deleted.");
        }
        File file1 = azfu0.a;
        if(file1.delete()) {
            if(azfz0 != null) {
                ++azfz0.d;
            }
            this.s(azfu0.c(), -1L);
            return v;
        }
        Log.e("CCTFlatFileLogStore", file1.getAbsolutePath() + " could not be deleted.");
        return v;
    }

    private static azfj D(hfsl hfsl0) {
        long v = 0x8000000000000000L;
        long v1 = 0x8000000000000000L;
        int v2;
        while((v2 = hfsl0.m()) != 0) {
            switch(v2 >>> 3) {
                case 17: {
                    v = ((hfsh)hfsl0).r();
                    break;
                }
                case 22: {
                    v1 = ((hfsh)hfsl0).r();
                    break;
                }
                default: {
                    hfsl0.F(v2);
                }
            }
            if(v1 != 0x8000000000000000L && v != 0x8000000000000000L) {
                return new azfj(v1, v);
            }
        }
        return v == 0x8000000000000000L ? null : new azfj(0L, v);
    }

    private static ByteString E(File file0) {
        ByteString hfsf0;
        try(InputStream inputStream0 = azfv.F(file0)) {
            ArrayList arrayList0 = new ArrayList();
            int v = 0x100;
            int v1 = 0;
            while(true) {
                try {
                    byte[] arr_b = new byte[v];
                    int v2;
                    for(v2 = 0; true; v2 += v3) {
                        if(v2 >= v) {
                            break;
                        }
                        int v3 = inputStream0.read(arr_b, v2, v - v2);
                        if(v3 == -1) {
                            break;
                        }
                    }
                    hfsf0 = v2 == 0 ? null : ByteString.z(arr_b, 0, v2);
                    goto label_41;
                }
                catch(EOFException unused_ex) {
                    try(InputStream inputStream1 = azfv.F(file0)) {
                        inputStream1.skip(((long)v1));
                        byte[] arr_b1 = new byte[1];
                        while(true) {
                            if(inputStream1.read(arr_b1, 0, 1) == -1) {
                                break;
                            }
                            arrayList0.add(ByteString.copyFrom(arr_b1));
                        }
                        return ByteString.u(arrayList0);
                    label_41:
                        if(hfsf0 == null) {
                            return ByteString.u(arrayList0);
                        }
                        goto label_44;
                    }
                    catch(EOFException unused_ex) {
                    }
                }
                return ByteString.u(arrayList0);
            label_44:
                v1 += hfsf0.size();
                arrayList0.add(hfsf0);
                v = Math.min(v + v, 0x2000);
            }
        }
    }

    private static InputStream F(File file0) {
        String s = file0.getName();
        List list0 = azfv.n.n(s);
        if(list0.isEmpty()) {
            throw new IllegalStateException("Empty file name:" + file0.getAbsolutePath());
        }
        if(list0.size() <= 2) {
            if(list0.size() == 1) {
                return new FileInputStream(file0);
            }
            try {
                return azfk.b(((String)list0.get(1))) - 1 != 0 ? new GZIPInputStream(new FileInputStream(file0)) : new FileInputStream(file0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new IOException("Unsupported compression algorithm: " + ((String)list0.get(1)), illegalArgumentException0);
            }
        }
        throw new FlatFileLogStore.InvalidLogFileNameException("Invalid log file name: " + file0.getAbsolutePath());
    }

    private static Integer G(Map.Entry map$Entry0) {
        Object object0 = map$Entry0.getValue();
        if((object0 instanceof Integer)) {
            return (Integer)object0;
        }
        Log.w("CCTFlatFileLogStore", String.format("Log drop pref has invalid type %s. Entry: %s.", object0, map$Entry0));
        return (int)0;
    }

    private final Iterable H(gged_interceptors gged0) {
        return gggq.j(gggq.d(ggch.e(gggq.j(gggq.d(ggch.e(gggq.j(gggq.d(gggq.j(gged0, new azfb(this)), new azfc()), new azfd())), new azfc()), new azfd())), new azfc()), new azfe());
    }

    private final List I(String s, boolean z) {
        List list0 = new ArrayList();
        Object object0 = this.c;
        __monitor_enter(object0);
        try {
            this.o();
            azfs azfs0 = new azfs(this);
            try {
                int v = 0;
                ggqk ggqk0 = this.p.E();
                while(true) {
                label_7:
                    if(!ggqk0.hasNext()) {
                        goto label_61;
                    }
                    Object object1 = ggqk0.next();
                    File file0 = new File(this.g.getAbsolutePath() + "/" + Integer.toString(((hlqe)object1).f) + "/" + s);
                    if(!file0.isDirectory()) {
                        continue;
                    }
                    Iterator iterator0 = azfp.a(file0).iterator();
                    while(iterator0.hasNext()) {
                        File file1 = ((azfo)iterator0).a();
                        if(file1.isDirectory()) {
                            String s1 = new File(file1, "play_logger_context.pb").getAbsolutePath();
                            hlsi hlsi0 = (hlsi)this.q.get(s1);
                            if(hlsi0 != null) {
                                String s2 = hlsi0.c;
                                int v1 = hlsi0.d;
                                int v2 = hlsi0.e;
                                Integer integer0 = null;
                                String s3 = (hlsi0.b & 16) == 0 ? null : hlsi0.f;
                                ggqk ggqk1 = ggqk0;
                                boolean z1 = hlsi0.g;
                                String s4 = hlsi0.i;
                                boolean z2 = hlsi0.j;
                                int v3 = hlsi0.k;
                                if((hlsi0.b & 0x2000) != 0) {
                                    integer0 = (int)hlsi0.n;
                                }
                                PlayLoggerContext playLoggerContext0 = new PlayLoggerContext(s2, v1, v2, s3, z1, s4, z2, v3, integer0, hlsi0.o, hlsi0.p);
                                Iterator iterator1 = azfp.a(file1).iterator();
                                while(iterator1.hasNext()) {
                                    File file2 = ((azfo)iterator1).a();
                                    if(file2.getName().equals("play_logger_context.pb")) {
                                        continue;
                                    }
                                    InputStream inputStream0 = azfv.F(file2);
                                    try {
                                        azgi azgi0 = new azgi(hfsl.N(inputStream0));
                                        while(azgi0.a()) {
                                            LogEventParcelable logEventParcelable0 = new LogEventParcelable(playLoggerContext0, null, azgi0.c(), null, null, null, null, null, 0, null);
                                            playLoggerContext0 = playLoggerContext0;
                                            list0.add(logEventParcelable0);
                                            azgi0 = azgi0;
                                            iterator1 = iterator1;
                                        }
                                    }
                                    catch(Throwable throwable2) {
                                        TWR.safeClose$NT(inputStream0, throwable2);
                                        throw throwable2;
                                    }
                                    v += azgi0.b;
                                    inputStream0.close();
                                    if(z) {
                                        azfs0.b(file2);
                                    }
                                    iterator1 = iterator1;
                                }
                                goto label_55;
                            }
                        }
                        ggqk1 = ggqk0;
                    label_55:
                        ggqk0 = ggqk1;
                    }
                }
            }
            catch(Throwable throwable1) {
                TWR.safeClose$NT(azfs0, throwable1);
                throw throwable1;
            }
            goto label_7;
        label_61:
            azfs0.close();
            this.q(s, v);
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
        return list0;
    }

    private final void J(String s, long v) {
        if(this.j == null) {
            return;
        }
        azfy azfy0 = (azfy)this.j.get(s);
        if(azfy0 == null) {
            azfy0 = new azfy();
            this.j.put(s, azfy0);
        }
        azfy0.c += v;
    }

    private final void K(boolean z) {
        Object object0 = this.e;
        synchronized(object0) {
            if(z) {
                goto label_18;
            }
            else {
                __monitor_enter(object0);
                goto label_4;
            }
            goto label_36;
        }
        try {
        label_4:
            hram hram0 = hram.a;
            long v = hram0.d().a();
            if(v <= 0L || this.v < v) {
                long v1 = hram0.d().b();
                goto label_12;
            }
            else {
                goto label_17;
            }
            goto label_36;
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
    label_12:
        if(v1 > 0L && System.currentTimeMillis() - this.w >= v1) {
            __monitor_exit(object0);
            goto label_18;
        }
        else {
            __monitor_exit(object0);
            goto label_36;
        label_17:
            __monitor_exit(object0);
            try {
            label_18:
                SharedPreferences sharedPreferences0 = this.f.getSharedPreferences("LogDropPref", 0);
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                Map map0 = this.k;
                for(Object object1: map0.entrySet()) {
                    sharedPreferences$Editor0.putInt(((String)((Map.Entry)object1).getKey()), sharedPreferences0.getInt(((String)((Map.Entry)object1).getKey()), 0) + ((int)(((Integer)((Map.Entry)object1).getValue()))));
                }
                if(sharedPreferences$Editor0.commit()) {
                    this.v = 0L;
                    this.w = System.currentTimeMillis();
                    map0.clear();
                }
                else {
                    Log.e("CCTFlatFileLogStore", "Failed to record dropped logs");
                }
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
    label_36:
        __monitor_exit(object0);
    }

    private static String[] L(String[] arr_s) {
        return arr_s == null ? azfv.m : arr_s;
    }

    private static final long M(azfs azfs0, azfu azfu0, String s, azfz azfz0) {
        File file0 = new File(azfu0.a, s);
        long v = file0.length();
        if(azfs0.a(file0, azfu0.c(), azfl.g, 1)) {
            if(azfz0 != null) {
                ++azfz0.h;
            }
            return v;
        }
        return 0L;
    }

    private static final long N() {
        return Math.max(0L, System.currentTimeMillis() - hram.a.d().d());
    }

    private static final long O(azfs azfs0, long v, azfu azfu0, String s, boolean z, azfz azfz0) {
        String s1;
        int v1 = s.indexOf(46);
        if(v1 == -1) {
            s1 = s;
        }
        else {
            try {
                s1 = s.substring(0, v1);
            label_5:
                long v2 = Long.parseLong(s1);
                goto label_8;
            }
            catch(NumberFormatException unused_ex) {
            }
            return azfv.M(azfs0, azfu0, s, azfz0);
        }
        goto label_5;
    label_8:
        if(v1 != -1) {
            if(s.indexOf(46, v1 + 1) != -1) {
                return azfv.M(azfs0, azfu0, s, azfz0);
            }
            try {
                azfk.b(s.substring(v1 + 1));
            }
            catch(IllegalArgumentException unused_ex) {
                return azfv.M(azfs0, azfu0, s, azfz0);
            }
        }
        if(v2 >= v) {
            return -1L;
        }
        File file0 = new File(azfu0.a, s);
        long v3 = file0.length();
        int v4 = azfv.z(file0).a;
        String s2 = azfu0.c();
        azfl azfl0 = z ? azfl.c : azgb.b;
        if(!azfs0.a(file0, s2, azfl0, v4)) {
            Log.e("CCTFlatFileLogStore", file0.getAbsolutePath() + " could not be deleted.");
            return 0L;
        }
        if(azfz0 != null) {
            if(z) {
                azfz0.a += v3;
                azfz0.e += (long)v4;
                return v3;
            }
            azfz0.f += (long)v4;
            azfz0.b += v3;
        }
        return v3;
    }

    private static final void P(File file0, byte[] arr_b) {
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
            fileOutputStream0.write(arr_b);
        }
    }

    static int a(byte[] arr_b) {
        int v5;
        int v2;
        int v1 = 0;
        for(int v = 0; true; v += 4) {
            v2 = arr_b.length & -4;
            if(v >= v2) {
                break;
            }
            int v3 = (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16 | arr_b[v + 3] << 24) * 0xCC9E2D51;
            int v4 = v1 ^ (v3 >>> 17 | v3 << 15) * 461845907;
            v1 = (v4 >>> 19 | v4 << 13) * 5 - 430675100;
        }
        switch(arr_b.length & 3) {
            case 1: {
                v5 = (arr_b[v2] & 0xFF) * 0xCC9E2D51;
                v1 ^= (v5 >>> 17 | v5 << 15) * 461845907;
                break;
            }
            case 2: {
                v5 = (arr_b[v2] & 0xFF | (arr_b[v2 + 1] & 0xFF) << 8) * 0xCC9E2D51;
                v1 ^= (v5 >>> 17 | v5 << 15) * 461845907;
                break;
            }
            case 3: {
                v5 = (arr_b[v2] & 0xFF | ((arr_b[v2 + 2] & 0xFF) << 16 | (arr_b[v2 + 1] & 0xFF) << 8)) * 0xCC9E2D51;
                v1 ^= (v5 >>> 17 | v5 << 15) * 461845907;
            }
        }
        int v6 = v1 ^ arr_b.length;
        int v7 = (v6 ^ v6 >>> 16) * -2048144789;
        int v8 = (v7 ^ v7 >>> 13) * -1028477387;
        return v8 ^ v8 >>> 16;
    }

    final long b(long v) {
        long v1 = this.s;
        if(v1 == 0L) {
            try {
                this.s = 0x1000L;
                File file0 = this.g.getAbsoluteFile();
                String s = file0.exists() ? file0.getAbsolutePath() : file0.getParent();
                if(s != null) {
                    long v2 = Os.statvfs(s).f_frsize;
                    if(v2 >= 0x80L && v2 < 500000L) {
                        this.s = v2;
                        return v % this.s == 0L ? v / this.s * this.s : (v / this.s + 1L) * this.s;
                    }
                }
            }
            catch(Throwable unused_ex) {
                return v % this.s == 0L ? v / this.s * this.s : (v / this.s + 1L) * this.s;
            }
            return v % this.s == 0L ? v / this.s * this.s : (v / this.s + 1L) * this.s;
        }
        return v % v1 == 0L ? v / v1 * v1 : (v / v1 + 1L) * v1;
    }

    @Override  // azge
    public final long c() {
        long v = 0L;
        for(int v1 = 0; true; ++v1) {
            gged_interceptors gged0 = this.p;
            if(v1 >= ((ggna)gged0).c) {
                break;
            }
            hlqe hlqe0 = (hlqe)gged0.get(v1);
            File file0 = new File(this.g, Integer.toString(hlqe0.f));
            if(file0.isDirectory()) {
                Iterator iterator0 = azfp.a(file0).iterator();
                while(iterator0.hasNext()) {
                    File file1 = ((azfo)iterator0).a();
                    if(file1.isDirectory()) {
                        v += (long)azfv.L(file1.list()).length;
                    }
                }
            }
        }
        return v;
    }

    @Override
    public final void close() {
        synchronized(this.c) {
            this.o();
        }
        if(hram.e()) {
            this.K(true);
        }
    }

    @Override  // azge
    public final long d() {
        if(this.t != null) {
            return (long)this.t;
        }
        synchronized(this.c) {
            if(this.t == null) {
                long v1 = 0L;
                for(Object object1: this.H(this.p)) {
                    for(Object object2: ((azfu)object1).b()) {
                        v1 += this.b(((File)object2).length());
                    }
                }
                this.t = v1;
            }
        }
        return (long)this.t;
    }

    static azfw e(hlpf hlpf0, azfr azfr0, File file0) {
        ByteString hfsf0;
        int v4;
        int v3;
        hfse hfse1;
        azfj azfj1;
        byte[] arr_b;
        int v2;
        int v1;
        azgi azgi0;
        InputStream inputStream0;
        hfsn hfsn0;
        hfse hfse0;
        hlpe hlpe1;
        int v = 0;
        if(hlpf0 != null && hlpf0.b.size() > 0) {
            azfj azfj0 = azfr0.b;
            if(azfj0 != null && azfj0.a != 0L) {
                hlpe hlpe0 = (hlpe)hlpf0.b.get(hlpf0.b.size() - 1);
                if(azfj0.a(new azfj(((long)hlpe0.c), hlpe0.d)) < 0) {
                    do {
                        hlpe1 = (hlpe)hlpf0.b.get(v);
                        if(azfj0.a(new azfj(((long)hlpe1.c), hlpe1.d)) < 0) {
                            break;
                        }
                        ++v;
                    }
                    while(v < hlpf0.b.size());
                    try {
                        hfse0 = new hfse(0x80);
                        hfsn0 = new hfsn(hfse0, 0x1000);
                        try(inputStream0 = azfv.F(file0)) {
                            azgi0 = new azgi(hfsl.Q(inputStream0, azfv.a + azfv.a));
                            ((CodedOutputStream)hfsn0).ag(azgi0.c());
                        }
                        v1 = azgi0.b;
                        v2 = 1;
                        arr_b = null;
                        azfj1 = null;
                    }
                    catch(Throwable throwable0) {
                        goto label_95;
                    }
                    while(true) {
                        if(arr_b == null) {
                            try {
                                TWR.useResource$NT(inputStream0);
                                if(!azgi0.a()) {
                                    goto label_24;
                                }
                                goto label_26;
                            }
                            catch(EOFException unused_ex) {
                            }
                            catch(Throwable throwable0) {
                                goto label_95;
                            }
                        label_24:
                            hfse1 = hfse0;
                            goto label_88;
                        }
                    label_26:
                        if(hlpe1 != null && azfj1 != null) {
                            try {
                                TWR.useResource$NT(inputStream0);
                                if(azfj1.a == 0L) {
                                    goto label_37;
                                }
                                else {
                                    try {
                                        TWR.useResource$NT(inputStream0);
                                        v3 = v2;
                                        v4 = v;
                                        hfse1 = hfse0;
                                        if(azfj1.a(new azfj(((long)hlpe1.c), hlpe1.d)) >= 0) {
                                            TWR.useResource$NT(inputStream0);
                                            v2 = v3;
                                            goto label_64;
                                        label_37:
                                            TWR.useResource$NT(inputStream0);
                                            v4 = v;
                                            hfse1 = hfse0;
                                            v3 = v2;
                                            goto label_46;
                                        label_42:
                                            TWR.useResource$NT(inputStream0);
                                            v4 = v;
                                            v3 = v2;
                                            hfse1 = hfse0;
                                        }
                                    label_46:
                                        TWR.useResource$NT(inputStream0);
                                        if(arr_b == null) {
                                            goto label_58;
                                        }
                                        else {
                                            TWR.useResource$NT(inputStream0);
                                            ((CodedOutputStream)hfsn0).ag(arr_b);
                                            v2 = v3 + 1;
                                            goto label_55;
                                        }
                                        goto label_60;
                                    }
                                    catch(EOFException unused_ex) {
                                        goto label_52;
                                    }
                                }
                                goto label_46;
                                try {
                                label_52:
                                    TWR.useResource$NT(inputStream0);
                                    v2 = v3;
                                    break;
                                label_55:
                                    TWR.useResource$NT(inputStream0);
                                    v1 = azgi0.b;
                                    goto label_60;
                                label_58:
                                    TWR.useResource$NT(inputStream0);
                                    v2 = v3;
                                label_60:
                                    TWR.useResource$NT(inputStream0);
                                    if(azgi0.a()) {
                                        goto label_81;
                                    }
                                    else {
                                        TWR.useResource$NT(inputStream0);
                                        arr_b = null;
                                    }
                                label_64:
                                    TWR.useResource$NT(inputStream0);
                                    if(hlpe1 != null) {
                                        TWR.useResource$NT(inputStream0);
                                        ((CodedOutputStream)hfsn0).o(hlpe1.f);
                                        v = v4 + 1;
                                        goto label_69;
                                    }
                                    goto label_78;
                                }
                                catch(EOFException unused_ex) {
                                    break;
                                }
                                try {
                                label_69:
                                    TWR.useResource$NT(inputStream0);
                                    if(v < hlpf0.b.size()) {
                                        TWR.useResource$NT(inputStream0);
                                        hlpe1 = (hlpe)hlpf0.b.get(v);
                                        hfse0 = hfse1;
                                    }
                                    else {
                                        hfse0 = hfse1;
                                        hlpe1 = null;
                                    }
                                    continue;
                                }
                                catch(EOFException unused_ex) {
                                    goto label_88;
                                }
                                try {
                                label_78:
                                    hfse0 = hfse1;
                                    v = v4;
                                    continue;
                                label_81:
                                    TWR.useResource$NT(inputStream0);
                                    arr_b = azgi0.c();
                                    azfj1 = azfv.D(hfsl.P(arr_b));
                                    hfse0 = hfse1;
                                    v = v4;
                                    goto label_26;
                                }
                                catch(EOFException unused_ex) {
                                }
                                break;
                            }
                            catch(Throwable throwable0) {
                                goto label_95;
                            }
                        }
                        else {
                            goto label_42;
                        }
                        goto label_46;
                    }
                    v = v4;
                label_88:
                    while(v < hlpf0.b.size()) {
                        ((CodedOutputStream)hfsn0).o(((hlpe)hlpf0.b.get(v)).f);
                        ++v;
                    }
                    ((CodedOutputStream)hfsn0).flush();
                    return new azfw(file0, hfse1.b(), v2, v1);
                label_95:
                    TWR.moot$NT();
                    throw throwable0;
                }
            }
        }
        if(hram.a.d().n()) {
            hfsf0 = azfv.E(file0);
        }
        else {
            try(InputStream inputStream1 = azfv.F(file0)) {
                hfsf0 = ByteString.C(inputStream1);
            }
        }
        azgi azgi1 = new azgi(hfsf0.k());
        int v5;
        for(v5 = 0; azgi1.b(); ++v5) {
        }
        if(azgi1.a) {
            hfsl hfsl0 = hfsf0.k();
            azgi azgi2 = new azgi(hfsl0);
            hfsl0.J();
            hfse hfse2 = new hfse(0x80);
            hfsn hfsn1 = new hfsn(hfse2, 0x1000);
            while(azgi2.a()) {
                ((CodedOutputStream)hfsn1).ag(azgi2.c());
            }
            ((CodedOutputStream)hfsn1).flush();
            hfsf0 = hfse2.b();
            v = azgi2.b;
        }
        return new azfw(file0, hfsf0, v5, v);
    }

    @Override  // azgf
    public final azfx f(long v, azgl azgl0) {
        azfx azfx0;
        hlpf hlpf0;
        long v5;
        Throwable throwable4;
        azfr azfr0;
        InputStream inputStream0;
        String s2;
        String[] arr_s1;
        int v4;
        int v3;
        int v2;
        azfs azfs0;
        PriorityQueue priorityQueue0;
        String[] arr_s;
        ArrayList arrayList0;
        File file0;
        azfu azfu0;
        String s;
        hlsi hlsi0;
        Object object0 = this.c;
        __monitor_enter(object0);
        try {
            hlsi0 = azgl0.a;
            Integer integer0 = (int)azgl0.b;
            this.i.remove(integer0);
            this.h.remove(integer0);
            s = azif.b(hlsi0);
            azfu0 = new azfu(this.g, String.valueOf(hlsi0.k), s, String.valueOf(((int)azgl0.b)));
            file0 = azfu0.a;
            if(file0.isDirectory()) {
                arrayList0 = new ArrayList();
                arr_s = azfv.L(file0.list());
                priorityQueue0 = new PriorityQueue();
                long v1 = azfv.N();
                azfs0 = new azfs(this);
                goto label_15;
            }
            goto label_87;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
        try {
        label_15:
            v2 = arr_s.length;
            v3 = 0;
            while(true) {
            label_17:
                if(v3 >= v2) {
                    goto label_48;
                }
                String s1 = arr_s[v3];
                if("play_logger_context.pb".equals(s1)) {
                    v4 = v3;
                    arr_s1 = arr_s;
                }
                else {
                    v4 = v3;
                    arr_s1 = arr_s;
                    if(azfv.O(azfs0, v1, azfu0, s1, true, null) == -1L) {
                        File file1 = new File(file0, s1);
                        s2 = file1.getName();
                        try {
                            inputStream0 = azfv.F(file1);
                            break;
                        }
                        catch(IOException iOException0) {
                            goto label_41;
                        }
                    }
                }
                goto label_44;
            }
        }
        catch(Throwable throwable1) {
            goto label_68;
        }
        try {
            azfr0 = new azfr(s2, azfv.D(hfsl.P(new azgi(hfsl.Q(inputStream0, azfv.a + azfv.a)).c())));
            goto label_38;
        }
        catch(Throwable throwable2) {
            try {
                throwable4 = throwable2;
                inputStream0.close();
                throw throwable4;
            }
            catch(Throwable throwable3) {
                try {
                    try {
                        throwable4.addSuppressed(throwable3);
                        throw throwable4;
                    label_38:
                        inputStream0.close();
                    }
                    catch(IOException iOException0) {
                    label_41:
                        Log.e("CCTFlatFileLogStore", "Can\'t get boot count and uptime from log event.", iOException0);
                        azfr0 = new azfr(s2, null);
                    }
                    priorityQueue0.add(azfr0);
                label_44:
                    v3 = v4 + 1;
                    arr_s = arr_s1;
                    v2 = v2;
                    goto label_17;
                label_48:
                    if(hram.g()) {
                    label_53:
                        v5 = v;
                        hlpf0 = null;
                        goto label_57;
                    label_56:
                        v5 = v;
                    }
                    else {
                        try {
                            hlpf0 = (hlpf)gmde.a(this.l.a());
                            goto label_56;
                        }
                        catch(ExecutionException executionException0) {
                            Log.e("CCTFlatFileLogStore", "Failed to get data from ClearcutInternalEvents proto data store.", executionException0);
                            goto label_53;
                        }
                    }
                    while(true) {
                    label_57:
                        azfr azfr1 = (azfr)priorityQueue0.poll();
                        if(azfr1 == null || v5 <= 0L) {
                            goto label_70;
                        }
                        File file2 = new File(azfu0.a, azfr1.a);
                        try {
                            azfw azfw0 = azfv.e(hlpf0, azfr1, file2);
                            v5 -= (long)azfw0.b.size();
                            arrayList0.add(azfw0);
                        }
                        catch(IOException iOException1) {
                            azfs0.a(file2, azif.b(hlsi0), new azfm(azfl.h, iOException1), 1);
                        }
                    }
                }
                catch(Throwable throwable1) {
                }
            }
        }
        try {
        label_68:
            TWR.safeClose$NT(azfs0, throwable1);
            throw throwable1;
        label_70:
            azfs0.close();
            azfx0 = new azfx(hlsi0, arrayList0);
            gged_interceptors gged0 = azfx0.c;
            int v6 = gged0.size();
            int v8 = 0;
            for(int v7 = 0; v7 < v6; ++v7) {
                v8 += ((azfw)gged0.get(v7)).d;
            }
            this.q(s, v8);
        }
        catch(Throwable throwable0) {
        label_83:
            __monitor_exit(object0);
            throw throwable0;
        }
        __monitor_exit(object0);
        return azfx0;
    label_87:
        __monitor_exit(object0);
        return azfx.a;
    }

    @Override  // azge
    public final azfz g() {
        azfh azfh1;
        azfz azfz1;
        azfu azfu2;
        String[] arr_s1;
        long v8;
        long v7;
        String s2;
        azfs azfs1;
        Throwable throwable4;
        String[] arr_s;
        File file2;
        azfl azfl0;
        azfm azfm0;
        byte[] arr_b;
        azfu azfu1;
        azfu azfu0;
        azfs azfs0;
        long v3;
        int v2;
        int v1;
        long v;
        azfh azfh0;
        Object object0;
        azfz azfz0;
        azfv azfv0 = this;
        gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/store/FlatFileLogStore", "cleanupAfterUpload", 0x4AD, "FlatFileLogStore#cleanupAfterUpload");
        try {
            azfz0 = new azfz();
            object0 = azfv0.c;
            __monitor_enter(object0);
        }
        catch(Throwable throwable0) {
            goto label_140;
        }
        try {
            azfv0.o();
            azfh0 = new azfh(azfv0, azfv0.d() - hram.c());
            v = azfv.N();
            v1 = 0;
            v2 = 0;
            while(true) {
            label_10:
                v3 = azfh0.b;
                azfs0 = new azfs(azfv0);
                break;
            }
        }
        catch(Throwable throwable1) {
            goto label_135;
        }
        try {
            Iterator iterator0 = azfv0.H(azfv0.p).iterator();
            while(true) {
            label_13:
                if(!iterator0.hasNext()) {
                    goto label_109;
                }
                Object object1 = iterator0.next();
                azfu0 = (azfu)object1;
                if(v1 + 1 == 1) {
                    break;
                }
                else {
                    goto label_42;
                }
                goto label_43;
            }
        }
        catch(Throwable throwable2) {
            goto label_60;
        }
        try {
            azfu1 = azfu0;
            File file0 = azfu1.a();
            try {
                arr_b = azfv.y(file0);
            }
            catch(IOException iOException0) {
                Log.e("CCTFlatFileLogStore", "Failed to read PLC file " + file0.getAbsolutePath(), iOException0);
                azfm0 = new azfm(azfl.i, iOException0);
                goto label_39;
            }
            int v4 = azfv.a(arr_b);
            File file1 = file0.getParentFile();
            gftb.check(file1);
            String s = file1.getName();
            try {
                if(v4 == Integer.parseInt(s)) {
                    goto label_36;
                }
                else {
                    azfl0 = azfl.k;
                }
            }
            catch(NumberFormatException numberFormatException0) {
                Log.e("CCTFlatFileLogStore", a.a(s, "Failed to convert ", " to int."), numberFormatException0);
                azfl0 = azfl.j;
            }
            goto label_38;
        label_36:
            String s1 = file0.getAbsolutePath();
            azfl0 = ((hlsi)azfv0.q.get(s1)) == null ? azfl.l : null;
        label_38:
            azfm0 = azfl0;
        label_39:
            if(azfm0 != null) {
                azfh0.a(this.C(azfs0, azfu1, azfz0, file0, azfm0));
                goto label_53;
            }
            goto label_43;
        }
        catch(Throwable throwable3) {
            goto label_50;
        }
    label_42:
        azfu1 = azfu0;
        try {
        label_43:
            file2 = azfu1.a;
            arr_s = azfv.L(file2.list());
            int v5 = arr_s.length;
            if(v5 <= 1) {
                goto label_47;
            }
            goto label_55;
        }
        catch(Throwable throwable2) {
            goto label_60;
        }
        try {
        label_47:
            azfs0.a.add(file2);
        }
        catch(Throwable throwable3) {
        label_50:
            throwable4 = throwable3;
            azfs1 = azfs0;
            goto label_116;
        }
    label_53:
        azfv0 = this;
        goto label_13;
    label_55:
        int v6 = 0;
        while(true) {
            if(v6 >= v5) {
                goto label_106;
            }
            try {
                s2 = arr_s[v6];
            }
            catch(Throwable throwable2) {
            label_60:
                azfs1 = azfs0;
                throwable4 = throwable2;
                goto label_116;
            }
            if(s2.equals("play_logger_context.pb")) {
                v7 = v;
                v8 = v3;
                arr_s1 = arr_s;
                azfu2 = azfu1;
                azfz1 = azfz0;
                azfh1 = azfh0;
                azfs1 = azfs0;
            }
            else {
                try {
                    v8 = v3;
                    azfz1 = azfz0;
                    azfh1 = azfh0;
                    v7 = v;
                    azfs1 = azfs0;
                    azfu2 = azfu1;
                    long v9 = azfv.O(azfs1, v7, azfu2, s2, ((boolean)(v2 ^ 1)), azfz1);
                    if(v9 != -1L) {
                        azfh1.a(v9);
                        goto label_96;
                    }
                    else if(azfh1.b > 0L) {
                        int v10 = s2.indexOf(46);
                        long v11 = Long.parseLong((v10 == -1 ? s2 : s2.substring(0, v10)));
                        arr_s1 = arr_s;
                        if(azfh1.b > azfh1.c && azfh1.size() < 1500 || !azfh1.isEmpty() && ((azfg)azfh1.peek()).a > v11) {
                            long v12 = new File(file2, s2).length();
                            long v13 = azfh1.d.b(v12);
                            azfh1.add(new azfg(azfh1.d, v11, v13));
                            long v14 = Math.max(azfh1.a, azfh1.size());
                            azfh1 = azfh1;
                            azfh1.a = v14;
                            azfh1.c += v13;
                            azfh1.b();
                        }
                    }
                    else {
                    label_96:
                        arr_s1 = arr_s;
                    }
                label_97:
                    ++v6;
                    azfs0 = azfs1;
                    azfu1 = azfu2;
                    arr_s = arr_s1;
                    v3 = v8;
                    azfh0 = azfh1;
                    v = v7;
                    azfz0 = azfz1;
                    continue;
                label_106:
                    azfv0 = this;
                    v = v;
                    goto label_13;
                label_109:
                    azfs1 = azfs0;
                    if(azfh0.isEmpty()) {
                        goto label_132;
                    }
                    else {
                        v = ((azfg)azfh0.peek()).a + 1L;
                        azfh0.clear();
                        goto label_121;
                    }
                    goto label_137;
                }
                catch(Throwable throwable2) {
                    break;
                }
            }
            goto label_97;
        }
        throwable4 = throwable2;
        try {
        label_116:
            azfs1.close();
            throw throwable4;
        }
        catch(Throwable throwable5) {
            try {
                throwable4.addSuppressed(throwable5);
                throw throwable4;
            label_121:
                if(Long.compare(v3, azfh0.b) > 0 || v1 + 1 == 1) {
                    azfs1.close();
                    if(azfh0.b > 0L && v1 + 1 < 100) {
                        azfv0 = this;
                        ++v1;
                        azfh0 = azfh0;
                        v2 = 1;
                        azfz0 = azfz0;
                        goto label_10;
                    }
                }
                else {
                    azfs1.close();
                    goto label_137;
                label_132:
                    azfs1.close();
                }
                goto label_137;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
        label_135:
            __monitor_exit(object0);
            throw throwable1;
        label_137:
            __monitor_exit(object0);
        }
        catch(Throwable throwable0) {
        label_140:
            TWR.safeClose$NT(gdqb0, throwable0);
            throw throwable0;
        }
        gdqb0.close();
        return azfz0;
    }

    @Override  // azge
    public final ggeo h() {
        Object object0 = this.e;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        ggek ggek0 = new ggek();
        if(hram.e()) {
            this.K(true);
        }
        SharedPreferences sharedPreferences0 = this.f.getSharedPreferences("LogDropPref", 0);
        for(Object object1: sharedPreferences0.getAll().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            CharSequence charSequence0 = (CharSequence)map$Entry0.getKey();
            List list0 = azfv.b.n(charSequence0);
            if(list0.size() == 1) {
                ggek0.i(new azgd("", ((String)list0.get(0))), azfv.G(map$Entry0));
            }
            else {
                if(list0.size() != 2) {
                    continue;
                }
                ggek0.i(new azgd(((String)list0.get(0)), ((String)list0.get(1))), azfv.G(map$Entry0));
            }
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.clear();
        if(sharedPreferences$Editor0.commit()) {
            FIN.finallyCodeBegin$NT(v);
            return ggek0.b();
        }
        throw new IOException("Failed to clear log drop count");
    }

    @Override  // azge
    public final String i() {
        return this.f.isDeviceProtectedStorage() ? "DEFlatFileLogStore" : "CEFlatFileLogStore";
    }

    @Override  // azge
    public final List j(String s) {
        return this.I(s, true);
    }

    @Override  // azge
    public final List k(String s) {
        return this.I(s, false);
    }

    @Override  // azge
    public final Map l() {
        synchronized(this.c) {
            if(this.j != null) {
                return new HashMap(this.j);
            }
            HashMap hashMap0 = new HashMap();
            for(Object object1: this.H(this.p)) {
                String s = ((azfu)object1).c();
                if(!hashMap0.containsKey(s)) {
                    hashMap0.put(s, new azfy());
                }
                azfy azfy0 = (azfy)hashMap0.get(s);
                ++azfy0.b;
                for(Object object2: ((azfu)object1).b()) {
                    ++azfy0.c;
                    azfy0.a += this.b(((File)object2).length());
                }
            }
            this.j = hashMap0;
        }
        return new HashMap(this.j);
    }

    @Override  // azge
    public final Map m() {
        Map map0 = new HashMap();
        synchronized(this.c) {
            for(Object object1: this.H(this.p)) {
                azfu azfu0 = (azfu)object1;
                String s = azfu0.a().getAbsolutePath();
                hlsi hlsi0 = (hlsi)this.q.get(s);
                if(hlsi0 != null) {
                    long v1 = 0L;
                    for(Object object2: azfu0.b()) {
                        v1 += this.b(((File)object2).length());
                    }
                    map0.put(hlsi0, new azfy(v1));
                }
            }
        }
        return map0;
    }

    @Override  // azgf
    public final Map n(gged_interceptors gged0) {
        long v2;
        hlsi hlsi6;
        ggfp ggfp0;
        try {
            gdqb gdqb0 = gdsp.e("com/google/android/gms/clearcut/store/FlatFileLogStore", "getUploadContextMap", 0x62A, "FlatFileLogStore#getUploadContextMap");
            TWR.declareResource(gdqb0);
            TWR.useResource$NT(gdqb0);
            String s = this.f.getSharedPreferences("CCTLogStoreUtil", 0).getString("log_source_batching_blacklist", null);
            if(s != null && !s.isEmpty()) {
                TWR.useResource$NT(gdqb0);
                ggfp0 = ggfp.H(s.split(","));
            }
            else {
                TWR.useResource$NT(gdqb0);
                ggfp0 = ggnj.a;
            }
            TWR.useResource$NT(gdqb0);
            Map map0 = new HashMap();
            Object object0 = this.c;
            __monitor_enter(object0);
            int v = FIN.finallyOpen$NT();
            Iterator iterator0 = this.H(gged0).iterator();
            while(true) {
                TWR.useResource$NT(gdqb0);
                if(!iterator0.hasNext()) {
                    TWR.useResource$NT(gdqb0);
                    FIN.finallyCodeBegin$NT(v);
                    return map0;
                }
                TWR.useResource$NT(gdqb0);
                Object object1 = iterator0.next();
                azfu azfu0 = (azfu)object1;
                String s1 = azfu0.a().getAbsolutePath();
                hlsi hlsi0 = (hlsi)this.q.get(s1);
                if(hlsi0 == null) {
                    continue;
                }
                TWR.useResource$NT(gdqb0);
                if(ggfp0.contains(azif.b(hlsi0))) {
                    TWR.useResource$NT(gdqb0);
                    hlsi6 = hlsi0;
                }
                else {
                    TWR.useResource$NT(gdqb0);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlsi.a).v_newBuilder();
                    if((hlsi0.b & 0x200) != 0) {
                        TWR.useResource$NT(gdqb0);
                        boolean z = hlsi0.j;
                        if(!hftp0.b_message.isImmutable()) {
                            TWR.useResource$NT(gdqb0);
                            hftp0.ensureMutable();
                        }
                        TWR.useResource$NT(gdqb0);
                        hlsi hlsi1 = (hlsi)hftp0.b_message;
                        hlsi1.b |= 0x200;
                        hlsi1.j = z;
                    }
                    TWR.useResource$NT(gdqb0);
                    if((hlsi0.b & 16) != 0) {
                        TWR.useResource$NT(gdqb0);
                        String s2 = hlsi0.f;
                        if(!hftp0.b_message.isImmutable()) {
                            TWR.useResource$NT(gdqb0);
                            hftp0.ensureMutable();
                        }
                        TWR.useResource$NT(gdqb0);
                        hlsi hlsi2 = (hlsi)hftp0.b_message;
                        s2.getClass();
                        hlsi2.b |= 16;
                        hlsi2.f = s2;
                    }
                    TWR.useResource$NT(gdqb0);
                    if((hlsi0.b & 0x80) != 0) {
                        TWR.useResource$NT(gdqb0);
                        String s3 = hlsi0.h;
                        if(!hftp0.b_message.isImmutable()) {
                            TWR.useResource$NT(gdqb0);
                            hftp0.ensureMutable();
                        }
                        TWR.useResource$NT(gdqb0);
                        hlsi hlsi3 = (hlsi)hftp0.b_message;
                        s3.getClass();
                        hlsi3.b |= 0x80;
                        hlsi3.h = s3;
                    }
                    TWR.useResource$NT(gdqb0);
                    if((hlsi0.b & 0x400) != 0) {
                        TWR.useResource$NT(gdqb0);
                        int v1 = hlsi0.k;
                        if(!hftp0.b_message.isImmutable()) {
                            TWR.useResource$NT(gdqb0);
                            hftp0.ensureMutable();
                        }
                        TWR.useResource$NT(gdqb0);
                        hlsi hlsi4 = (hlsi)hftp0.b_message;
                        hlsi4.b |= 0x400;
                        hlsi4.k = v1;
                    }
                    TWR.useResource$NT(gdqb0);
                    if((hlsi0.b & 2) != 0) {
                        TWR.useResource$NT(gdqb0);
                        String s4 = hlsi0.c;
                        if(hraz.g() && (!hraz.a.e().L() || hraz.a.e().y().b.contains(s4))) {
                            TWR.useResource$NT(gdqb0);
                            String s5 = hlsi0.c;
                            if(!hftp0.b_message.isImmutable()) {
                                TWR.useResource$NT(gdqb0);
                                hftp0.ensureMutable();
                            }
                            TWR.useResource$NT(gdqb0);
                            hlsi hlsi5 = (hlsi)hftp0.b_message;
                            s5.getClass();
                            hlsi5.b |= 2;
                            hlsi5.c = s5;
                        }
                    }
                    TWR.useResource$NT(gdqb0);
                    hlsi6 = (hlsi)hftp0.N_build();
                }
                TWR.useResource$NT(gdqb0);
                Collection collection0 = (Collection)map0.get(hlsi6);
                if(collection0 == null) {
                    TWR.useResource$NT(gdqb0);
                    collection0 = new ArrayList();
                    map0.put(hlsi6, collection0);
                }
                try {
                    TWR.useResource$NT(gdqb0);
                    v2 = Long.parseLong(azfu0.d());
                }
                catch(NumberFormatException numberFormatException0) {
                    TWR.useResource$NT(gdqb0);
                    Log.e("CCTFlatFileLogStore", "Failed to parse " + azfu0.d() + " to long.", numberFormatException0);
                    continue;
                }
                TWR.useResource$NT(gdqb0);
                collection0.add(new azgl(hlsi0, v2));
            }
        }
        catch(Throwable throwable0) {
            TWR.moot$NT();
            throw throwable0;
        }
    }

    final void o() {
        this.i.evictAll();
        this.h.evictAll();
    }

    @Override  // azgf
    public final void p(Collection collection0) {
        synchronized(this.c) {
            Iterator iterator0 = collection0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                ggqk ggqk0 = ((azfx)object1).c.E();
                while(true) {
                    if(!ggqk0.hasNext()) {
                        break;
                    }
                    Object object2 = ggqk0.next();
                    File file0 = ((azfw)object2).a;
                    if(file0 != null) {
                        azfs0.b(file0);
                    }
                }
            }
        }
    }

    public final void q(String s, int v) {
        if(v <= 0) {
            return;
        }
        this.r(s, azfl.n, v);
    }

    @Override  // azge
    public final void r(String s, azgc azgc0, int v) {
        if(hqzy.f()) {
            azbc azbc0 = azgc0.a();
            if(azbc0 != null) {
                azbk.a().f(s, azbc0, v);
            }
        }
        if(hram.a.d().p()) {
            if(this.u == null) {
                this.u = new azdg(this.f);
            }
            if(!this.u.b()) {
                return;
            }
        }
        else {
            this.u = null;
        }
        String s1 = a.I(azgc0, s, ",");
        if(hram.e()) {
            synchronized(this.e) {
                Map map0 = this.k;
                Integer integer0 = (Integer)map0.get(s1);
                if(integer0 == null) {
                    integer0 = (int)0;
                }
                map0.put(s1, Integer.valueOf(((int)integer0) + v));
                this.v = glun.d(this.v, v);
                this.K(false);
            }
            return;
        }
        SharedPreferences sharedPreferences0 = this.f.getSharedPreferences("LogDropPref", 0);
        synchronized(this.e) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putInt(s1, sharedPreferences0.getInt(s1, 0) + v);
            if(!sharedPreferences$Editor0.commit()) {
                Log.e("CCTFlatFileLogStore", a.f(v, "Failed to record ", "dropped logs"));
            }
        }
    }

    public final void s(String s, long v) {
        gftb.checkTrue(Long.compare(v, 1L) == 0 || v == -1L);
        if(this.j != null) {
            azfy azfy0 = (azfy)this.j.get(s);
            if(azfy0 == null) {
                azfy0 = new azfy();
                this.j.put(s, azfy0);
            }
            long v1 = azfy0.b + v;
            azfy0.b = v1;
            if(azfy0.a == 0L && v1 == 0L && azfy0.c == 0L) {
                Map map0 = this.j;
                gftb.check(map0);
                map0.remove(s);
            }
        }
    }

    public final void t(String s, long v) {
        long v1 = this.b(Math.abs(v));
        if(this.t != null) {
            this.t = (long)(((long)this.t) + (v < 0L ? -v1 : v1));
        }
        if(this.j == null) {
            return;
        }
        azfy azfy0 = (azfy)this.j.get(s);
        if(azfy0 == null) {
            azfy0 = new azfy();
            this.j.put(s, azfy0);
        }
        long v2 = azfy0.a;
        if(Long.compare(v, 0L) < 0) {
            v1 = -v1;
        }
        azfy0.a = v2 + v1;
    }

    @Override  // azge
    public final boolean u() {
        File file0 = new File(this.g, Integer.toString(3));
        if(file0.isDirectory()) {
            Iterator iterator0 = azfp.a(file0).iterator();
            while(iterator0.hasNext()) {
                File file1 = ((azfo)iterator0).a();
                if(file1.isDirectory() && azfv.L(file1.list()).length > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // azge
    public final boolean v() {
        long v = this.d();
        long v1 = hram.c();
        return v > v1 + v1;
    }

    @Override  // azge
    public final boolean w(hlsi hlsi0, ByteString hfsf0) {
        byte[] arr_b;
        azfv azfv0;
        byte[] arr_b4;
        long v7;
        long v6;
        File file3;
        int v5;
        boolean z;
        int v4;
        int v;
        String s = azif.b(hlsi0);
        String s1 = hram.a.d().l();
        try {
            v = 1;
            v = azfk.b(s1);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        Trace.beginSection("Clearcut flat file serialize PLC proto");
        try {
            arr_b = hlsi0.toBytesArray();
        }
        finally {
            Trace.endSection();
        }
        int v2 = azfv.a(arr_b);
        azfu azfu0 = new azfu(this.g, Integer.toString(hlsi0.k), s, Integer.toString(v2));
        File file0 = azfu0.a();
        synchronized(this.c) {
            if(!hram.f()) {
                if(azfu0.a.exists() && azfv.L(azfu0.a.list()).length > 0 && !file0.exists()) {
                label_20:
                    Integer integer0 = v2;
                    this.i.remove(integer0);
                    this.h.remove(integer0);
                    try(azfs azfs0 = new azfs(this)) {
                        this.C(azfs0, azfu0, null, file0, azfl.f);
                    }
                    if(azfu0.a.exists()) {
                        this.r(s, azfl.e, 1);
                        return false;
                    }
                }
            }
            else if(!file0.exists() && azfv.L(azfu0.a.list()).length > 0) {
                goto label_20;
            }
            LruCache lruCache0 = this.i;
            Integer integer1 = v2;
            azfn azfn0 = (azfn)lruCache0.get(integer1);
            IOException iOException0 = null;
            if(azfn0 == null) {
                v4 = v2;
                z = false;
            }
            else {
                if(!(azfn0.d == null ? ((ProtoLiteMessage)hlsi0).equals(azfn0.c) : Arrays.equals(arr_b, azfn0.d))) {
                    this.r(s, azfl.a, 1);
                    return false;
                }
                if(azfn0.b.getName().endsWith(azfk.a(v))) {
                    v4 = v2;
                    if(azfn0.g > hram.b()) {
                        goto label_49;
                    }
                }
                else {
                    v4 = v2;
                label_49:
                    lruCache0.remove(integer1);
                    this.h.remove(integer1);
                    azfn0 = null;
                }
                z = true;
            }
            if(azfn0 == null) {
                if(this.o != null && !azfu0.a.getCanonicalPath().startsWith(this.o)) {
                    this.r(s, azfl.m, 1);
                    return false;
                }
                File file1 = azfu0.a;
                if(!file1.exists()) {
                    if(!file1.mkdirs()) {
                        throw new FlatFileLogStore.CantCreateDirException(String.format(Locale.US, "Creating PlcHash directory \'%s/%s/%s\' failed.", ((int)hlsi0.k), s, integer1));
                    }
                    this.s(s, 1L);
                }
                if(z) {
                    v5 = v4;
                }
                else if(!file0.exists()) {
                    azfv.P(file0, arr_b);
                    v5 = v4;
                }
                else {
                    byte[] arr_b1 = azfv.y(file0);
                    if(Arrays.equals(arr_b1, arr_b)) {
                        v5 = v4;
                    }
                    else {
                        v5 = v4;
                        if(azfv.a(arr_b1) == v5) {
                            this.r(s, azfl.a, 1);
                            return false;
                        }
                        try(azfs azfs1 = new azfs(this)) {
                            this.C(azfs1, azfu0, null, file0, azfl.d);
                        }
                        File file2 = azfu0.a;
                        if(file2.exists()) {
                            this.r(s, azfl.e, 1);
                            return false;
                        }
                        if(!file2.mkdirs()) {
                            throw new FlatFileLogStore.CantCreateDirException(String.format(Locale.US, "Creating PlcHash directory \'%s/%s/%s\' failed.", ((int)hlsi0.k), s, integer1));
                        }
                        this.s(s, 1L);
                        azfv.P(file0, arr_b);
                    }
                }
                byte[] arr_b2 = hram.f() ? arr_b : null;
                azfq azfq0 = (azfq)this.h.remove(integer1);
                if(azfq0 == null) {
                label_110:
                    file3 = null;
                    v6 = 0L;
                    v7 = 0L;
                }
                else {
                    file3 = new File(azfu0.a, azfq0.a);
                    if(file3.exists() && azfq0.a.endsWith(azfk.a(v))) {
                        v6 = this.b(file3.length());
                        v7 = azfq0.b;
                        goto label_113;
                    }
                    goto label_110;
                }
            label_113:
                if(file3 == null) {
                    String s2 = azfk.a(v);
                    byte[] arr_b3 = arr_b2;
                    long v8 = System.currentTimeMillis();
                    File file4 = azfu0.a;
                    long v9 = v8;
                    file3 = new File(file4, v8 + "." + s2);
                    while(file3.exists()) {
                        file3 = new File(file4, v9 + 1L + "." + s2);
                        arr_b3 = arr_b3;
                        ++v9;
                    }
                    arr_b4 = arr_b3;
                    this.J(azfu0.c(), 1L);
                }
                else {
                    arr_b4 = arr_b2;
                }
                GZIPOutputStream gZIPOutputStream0 = v - 1 == 0 ? new FileOutputStream(file3, true) : new GZIPOutputStream(new FileOutputStream(file3, true), true);
                v4 = v5;
                hfsn hfsn0 = new hfsn(gZIPOutputStream0, azfv.a);
                azfv0 = this;
                azfn azfn1 = new azfn(SystemClock.elapsedRealtime(), file3, hlsi0, arr_b4, v7, v6, gZIPOutputStream0, ((CodedOutputStream)hfsn0));
                azfv0.i.put(Integer.valueOf(v4), azfn1);
                azfn0 = azfn1;
            }
            else {
                azfv0 = this;
            }
            long v10 = azfn0.h;
            long v11 = azfn0.g;
            int v12 = CodedOutputStream.I(hfsf0);
            try {
                azfn0.f.o(hfsf0);
                azfn0.f.flush();
                azfn0.e.flush();
            }
            catch(IOException iOException1) {
                iOException0 = iOException1;
            }
            File file5 = azfn0.b;
            long v13 = azfv0.b(file5.length());
            ++azfn0.i;
            azfn0.g += (long)v12;
            azfn0.h = v13;
            azfv0.t(s, v13 - v10);
            if(iOException0 != null) {
                Integer integer2 = v4;
                azfv0.i.remove(integer2);
                azfv0.h.remove(integer2);
                if(v11 == 0L) {
                    azfs azfs2 = new azfs(azfv0);
                    TWR.declareResource(azfs2);
                    TWR.useResource$NT(azfs2);
                    azfs2.b(file5);
                }
                throw iOException0;
            }
            if(gluj.e(azfn0.i) && (((long)azfn0.i) >= hram.a.d().j() || azfn0.g >= hram.a.d().i())) {
                Log.w("CCTFlatFileLogStore", String.format("Excessive logging: %d events, %d bytes from log source %s last %ds", ((int)azfn0.i), ((long)azfn0.g), s, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - azfn0.a)));
            }
        }
        return true;
    }

    static void x(azfv azfv0, String s) {
        azfv0.J(s, -1L);
    }

    public static final byte[] y(File file0) {
        try {
            return ghju.d(file0);
        }
        catch(ClosedByInterruptException unused_ex) {
            Thread.currentThread().interrupt();
            try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
                return ghjj.g(fileInputStream0);
            }
        }
    }

    public static final azgh z(File file0) {
        try(InputStream inputStream0 = azfv.F(file0)) {
            azgi azgi0 = new azgi(hfsl.Q(inputStream0, azfv.a));
            int v;
            for(v = 0; true; ++v) {
                if(!azgi0.b()) {
                    break;
                }
            }
            return new azgh(v);
        }
        catch(IOException iOException0) {
            Log.e("CCTFlatFileLogStore", "Error counting log events in file " + file0.getAbsolutePath(), iOException0);
            return new azgh(0);
        }
    }
}

