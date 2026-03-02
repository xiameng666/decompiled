import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.appdatasearch.CorpusStatus;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class bwwy {
    public final Context a;
    public final bwts b;
    public final bwyv c;
    private static final ekyy d;
    private static bwwy e;
    private final elbu f;
    private final elfg g;

    static {
        ekyx ekyx0 = new ekyx();
        ekyx0.a = "AppsCorpus";
        bwwy.d = new ekyy(ekyx0);
    }

    public bwwy(Context context0, bwyv bwyv0, elbu elbu0, elfg elfg0) {
        this.a = context0;
        this.c = bwyv0;
        this.f = elbu0;
        this.g = elfg0;
        this.b = new bwts(context0);
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("proxy-apps-corpus", 0);
        int v = sharedPreferences0.getInt("version", 0);
        if(v < 4) {
            sharedPreferences0.edit().putInt("version", 4).commit();
        }
        if(v >= 4) {
            SharedPreferences sharedPreferences1 = context0.getSharedPreferences("proxy-apps-corpus", 0);
            String s = sharedPreferences1.getString("current-os-build-id", null);
            if(s == null || !Build.ID.equals(s)) {
                sharedPreferences1.edit().putString("current-os-build-id", Build.ID).apply();
            }
            else if(this.b() > 0L) {
                return;
            }
            bwzh.a().b(new bwzg(() -> {
                bwzd.c("AppsCorpus.onMaintenance starts");
                long v = System.currentTimeMillis();
                Context context0 = this.a;
                if(context0 != null) {
                    bwts bwts0 = this.b;
                    gged_interceptors gged0 = bwxb.c(context0, bwts0);
                    if(!gged0.isEmpty()) {
                        bwyv bwyv0 = this.c;
                        if(bwyv0 != null) {
                            bwyv0.c(bwxb.f(gged0));
                        }
                        Set set0 = bwxb.g(this.g, bwts0);
                        if(set0 != null) {
                            HashSet hashSet0 = new HashSet(gged0);
                            if(set0.equals(hashSet0)) {
                                bwzd.d("AppsCorpus has %d ComponentNames.", Integer.valueOf(hashSet0.size()));
                            }
                            else {
                                HashSet hashSet1 = new HashSet(set0);
                                hashSet1.retainAll(hashSet0);
                                set0.removeAll(hashSet1);
                                hashSet0.removeAll(hashSet1);
                                long v1 = this.b();
                                ArrayList arrayList0 = new ArrayList(set0.size() + hashSet0.size());
                                for(Object object0: set0) {
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwws.a).v_newBuilder();
                                    String s = ((bwxa)object0).a;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv0 = hftp0.b_message;
                                    s.getClass();
                                    ((bwws)hftv0).b |= 2;
                                    ((bwws)hftv0).d = s;
                                    if(!hftv0.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp0.b_message;
                                    ((bwws)hftv1).c = 2;
                                    ((bwws)hftv1).b |= 1;
                                    ++v1;
                                    if(!hftv1.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    bwws bwws0 = (bwws)hftp0.b_message;
                                    bwws0.b |= 4;
                                    bwws0.e = v1;
                                    arrayList0.add(((bwws)hftp0.N_build()));
                                }
                                for(Object object1: hashSet0) {
                                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwws.a).v_newBuilder();
                                    String s1 = ((bwxa)object1).a;
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp1.b_message;
                                    s1.getClass();
                                    ((bwws)hftv2).b |= 2;
                                    ((bwws)hftv2).d = s1;
                                    if(!hftv2.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv3 = hftp1.b_message;
                                    ((bwws)hftv3).c = 1;
                                    ((bwws)hftv3).b |= 1;
                                    ++v1;
                                    if(!hftv3.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    bwws bwws1 = (bwws)hftp1.b_message;
                                    bwws1.b |= 4;
                                    bwws1.e = v1;
                                    arrayList0.add(((bwws)hftp1.N_build()));
                                }
                                bwyv0.d(arrayList0);
                                this.f(v1);
                                this.e();
                            }
                        }
                    }
                }
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glnk.a).v_newBuilder();
                long v2 = this.a("icing_apps_corpus_entries.bin") + this.a("icing_apps_corpus_component_names.txt");
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                glnk glnk0 = (glnk)hftp2.b_message;
                glnk0.b |= 1;
                glnk0.c = (int)(v2 >> 10);
                long v3 = System.currentTimeMillis() - v;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                glnk glnk1 = (glnk)hftp2.b_message;
                glnk1.b |= 2;
                glnk1.d = (int)v3;
                glnk glnk2 = (glnk)hftp2.N_build();
                bwts bwts1 = this.b;
                long v4 = huax.e();
                if(bwts1.m(v4, false)) {
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    glnz glnz0 = (glnz)hftp3.b_message;
                    glnk2.getClass();
                    glnz0.q = glnk2;
                    glnz0.b |= 0x4000;
                    if(huae.g()) {
                        bwts1.t(hftp3);
                        bwts1.a.d(cdef.dK, 2004, hftp3);
                    }
                    else {
                        bwts1.s(2004, hftp3, v4);
                    }
                }
                bwzd.c("AppsCorpus.onMaintenance ends");
            }, "AppsCorpusReconcileCorpusRunnable"));
            return;
        }
        bwzh.a().b(new bwzg(new bwww(this), "AppsCorpusRecreateCorpusRunnable"));
    }

    final long a(String s) {
        Context context0 = this.a;
        if(context0 != null) {
            try {
                File file0 = context0.getFileStreamPath(s);
                if(file0 != null) {
                    return file0.length();
                }
            }
            catch(SecurityException unused_ex) {
                bwzd.p("Failed to get file size for %s", s);
            }
        }
        return 0L;
    }

    public final long b() {
        return this.a == null ? -1L : this.a.getSharedPreferences("proxy-apps-corpus", 0).getLong("last-seqno", -1L);
    }

    public static bwwy c(Context context0) {
        if(!bwwy.g()) {
            return null;
        }
        synchronized(bwwy.class) {
            if(bwwy.e == null) {
                Context context1 = context0.getApplicationContext();
                Class class1 = bwyv.class;
                synchronized(class1) {
                    if(bwyv.b == null) {
                        bwyv.b = new bwyv(context1);
                    }
                }
                bwwy.e = new bwwy(context1, bwyv.b, new elcl(context1, bwwy.d), new elfw(context1, bwwy.d));
            }
        }
        return bwwy.e;
    }

    // Detected as a lambda impl.
    public final void d() {
        bwzd.c("AppsCorpus.onMaintenance starts");
        long v = System.currentTimeMillis();
        Context context0 = this.a;
        if(context0 != null) {
            bwts bwts0 = this.b;
            gged_interceptors gged0 = bwxb.c(context0, bwts0);
            if(!gged0.isEmpty()) {
                bwyv bwyv0 = this.c;
                if(bwyv0 != null) {
                    bwyv0.c(bwxb.f(gged0));
                }
                Set set0 = bwxb.g(this.g, bwts0);
                if(set0 != null) {
                    HashSet hashSet0 = new HashSet(gged0);
                    if(set0.equals(hashSet0)) {
                        bwzd.d("AppsCorpus has %d ComponentNames.", Integer.valueOf(hashSet0.size()));
                    }
                    else {
                        HashSet hashSet1 = new HashSet(set0);
                        hashSet1.retainAll(hashSet0);
                        set0.removeAll(hashSet1);
                        hashSet0.removeAll(hashSet1);
                        long v1 = this.b();
                        ArrayList arrayList0 = new ArrayList(set0.size() + hashSet0.size());
                        for(Object object0: set0) {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwws.a).v_newBuilder();
                            String s = ((bwxa)object0).a;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            s.getClass();
                            ((bwws)hftv0).b |= 2;
                            ((bwws)hftv0).d = s;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp0.b_message;
                            ((bwws)hftv1).c = 2;
                            ((bwws)hftv1).b |= 1;
                            ++v1;
                            if(!hftv1.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            bwws bwws0 = (bwws)hftp0.b_message;
                            bwws0.b |= 4;
                            bwws0.e = v1;
                            arrayList0.add(((bwws)hftp0.N_build()));
                        }
                        for(Object object1: hashSet0) {
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwws.a).v_newBuilder();
                            String s1 = ((bwxa)object1).a;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp1.b_message;
                            s1.getClass();
                            ((bwws)hftv2).b |= 2;
                            ((bwws)hftv2).d = s1;
                            if(!hftv2.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp1.b_message;
                            ((bwws)hftv3).c = 1;
                            ((bwws)hftv3).b |= 1;
                            ++v1;
                            if(!hftv3.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            bwws bwws1 = (bwws)hftp1.b_message;
                            bwws1.b |= 4;
                            bwws1.e = v1;
                            arrayList0.add(((bwws)hftp1.N_build()));
                        }
                        bwyv0.d(arrayList0);
                        this.f(v1);
                        this.e();
                    }
                }
            }
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glnk.a).v_newBuilder();
        long v2 = this.a("icing_apps_corpus_entries.bin") + this.a("icing_apps_corpus_component_names.txt");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        glnk glnk0 = (glnk)hftp2.b_message;
        glnk0.b |= 1;
        glnk0.c = (int)(v2 >> 10);
        long v3 = System.currentTimeMillis() - v;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        glnk glnk1 = (glnk)hftp2.b_message;
        glnk1.b |= 2;
        glnk1.d = (int)v3;
        glnk glnk2 = (glnk)hftp2.N_build();
        bwts bwts1 = this.b;
        long v4 = huax.e();
        if(bwts1.m(v4, false)) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            glnz glnz0 = (glnz)hftp3.b_message;
            glnk2.getClass();
            glnz0.q = glnk2;
            glnz0.b |= 0x4000;
            if(huae.g()) {
                bwts1.t(hftp3);
                bwts1.a.d(cdef.dK, 2004, hftp3);
            }
            else {
                bwts1.s(2004, hftp3, v4);
            }
        }
        bwzd.c("AppsCorpus.onMaintenance ends");
    }

    final void e() {
        CorpusStatus corpusStatus0;
        try {
            corpusStatus0 = (CorpusStatus)evrg.n(this.f.b("com.google.android.gms", "apps"));
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            bwzd.p("Couldn\'t fetch status for corpus %s", "apps");
            return;
        }
        if(!corpusStatus0.a) {
            bwzd.p("Couldn\'t find corpus %s", "apps");
            return;
        }
        long v = corpusStatus0.c;
        Long long0 = v;
        bwzd.n("Status for corpus %s, lastCommittedSeqno:%d lastIndexedSeqno:%d", new Object[]{"apps", long0, ((long)corpusStatus0.b)});
        bwyv bwyv0 = this.c;
        if(bwyv0 != null) {
            bwzd.d("removeCommittedEntries for lastCommittedSeqno %d", long0);
            synchronized(bwyv.a) {
                List list0 = bwyv0.b();
                int v2;
                for(v2 = -1; v2 + 1 < list0.size() && v >= ((bwws)list0.get(v2 + 1)).e; ++v2) {
                }
                if(v2 >= 0) {
                    bwzd.e("Remove committed entries from %d to %d", Long.valueOf(((bwws)list0.get(0)).e), Long.valueOf(((bwws)list0.get(v2)).e));
                    list0.subList(0, v2 + 1).clear();
                    bwyv0.d(list0);
                }
            }
        }
        bwzd.e("Requesting indexing of %s with lastSeqno %d", "apps", Long.valueOf(this.b()));
        try {
            long v3 = this.b();
            if(!((Boolean)evrg.n(this.f.c("com.google.android.gms", "apps", v3))).booleanValue()) {
                bwzd.o("Failed to request indexing");
            }
        }
        catch(ExecutionException | InterruptedException exception0) {
            if((exception0 instanceof aztb)) {
                bwzd.p("Failed to request indexing. Status Code: %d", Integer.valueOf(((aztb)exception0).b()));
            }
        }
    }

    public final void f(long v) {
        Context context0 = this.a;
        if(context0 != null) {
            context0.getSharedPreferences("proxy-apps-corpus", 0).edit().putLong("last-seqno", v).commit();
        }
    }

    public static boolean g() {
        if(hubg.n()) {
            bwzd.k("AppsCorpus is disabled by Gservices flag");
            return false;
        }
        return true;
    }

    public final boolean h() {
        bwzd.c("AppsCorpus::recreateWholeCorpus");
        Context context0 = this.a;
        if(context0 != null) {
            bwts bwts0 = this.b;
            gged_interceptors gged0 = bwxb.c(context0, bwts0);
            if(!gged0.isEmpty()) {
                bwyv bwyv0 = this.c;
                if(bwyv0 != null) {
                    bwyv0.c(bwxb.f(gged0));
                }
                Set set0 = bwxb.g(this.g, bwts0);
                if(set0 != null) {
                    long v = this.b();
                    int v1 = ((ggna)gged0).c;
                    ArrayList arrayList0 = new ArrayList(set0.size() + v1);
                    for(Object object0: set0) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwws.a).v_newBuilder();
                        String s = ((bwxa)object0).a;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s.getClass();
                        ((bwws)hftv0).b |= 2;
                        ((bwws)hftv0).d = s;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((bwws)hftv1).c = 2;
                        ((bwws)hftv1).b |= 1;
                        ++v;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        bwws bwws0 = (bwws)hftp0.b_message;
                        bwws0.b |= 4;
                        bwws0.e = v;
                        arrayList0.add(((bwws)hftp0.N_build()));
                    }
                    for(int v2 = 0; v2 < v1; ++v2) {
                        bwxa bwxa0 = (bwxa)gged0.get(v2);
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwws.a).v_newBuilder();
                        String s1 = bwxa0.a;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp1.b_message;
                        s1.getClass();
                        ((bwws)hftv2).b |= 2;
                        ((bwws)hftv2).d = s1;
                        if(!hftv2.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv3 = hftp1.b_message;
                        ((bwws)hftv3).c = 1;
                        ((bwws)hftv3).b |= 1;
                        ++v;
                        if(!hftv3.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        bwws bwws1 = (bwws)hftp1.b_message;
                        bwws1.b |= 4;
                        bwws1.e = v;
                        arrayList0.add(((bwws)hftp1.N_build()));
                    }
                    bwyv0.d(arrayList0);
                    this.f(v);
                    return true;
                }
            }
        }
        return false;
    }
}

