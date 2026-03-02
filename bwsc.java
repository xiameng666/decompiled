import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall.Response;
import java.util.HashSet;

public final class bwsc extends bwzp {
    private final bwmx a;

    public bwsc(bwmx bwmx0) {
        super(gltq.e, 1);
        this.a = bwmx0;
    }

    @Override  // bwzp
    protected final Object a() {
        try {
            bwsc.c(this.a);
        }
        catch(Exception unused_ex) {
            this.a.d();
            huax.h();
            bwne.x();
        }
        return null;
    }

    public static void c(bwmx bwmx0) {
        int v2;
        gged_interceptors gged1;
        Context context0 = bwmx0.b;
        bwqt bwqt0 = bwqt.d(context0);
        bwut bwut0 = bwmx0.f();
        bwtc bwtc0 = bwtc.f();
        bxax bxax0 = bwmx0.f;
        if(bxax0 == null) {
            bwne.s("Failed to get icing settings");
            return;
        }
        if(hubu.g()) {
            bxax0.x(true);
            HashSet hashSet0 = new HashSet();
            gged_interceptors gged0 = bwut0.l();
            int v = ((ggna)gged0).c;
            int v1 = 0;
            while(v1 < v) {
                bwnq bwnq0 = (bwnq)gged0.get(v1);
                if(bwur.C(bwnq0)) {
                    bwsa bwsa0 = bwsa.a(bwnq0.d, bwnq0.f, bwtc0);
                    if(bwsa0 == null) {
                        bwne.v("Failed to find appIndexingCorpusConfig for corpus %s, package %s", bwnq0.d, bwnq0.f);
                    }
                    else {
                        bwuc bwuc0 = bwmx0.l;
                        batl.s(bwuc0);
                        String s = bwsa0.b;
                        RegisterCorpusInfoCall.Request registerCorpusInfoCall$Request0 = bwtd.a(bwsa0);
                        bwud bwud0 = bwuc0.h(s);
                        elbp elbp0 = new elbp(bwmx0.b, bwmx0, registerCorpusInfoCall$Request0, bwud0);
                        bwmx0.c.h(elbp0);
                        if(((RegisterCorpusInfoCall.Response)elbp0.v()).b) {
                            bwts bwts0 = bwmx0.r;
                            glnt glnt0 = (glnt)((ProtoLiteMessage)glnu.a).v_newBuilder();
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glqc.a).v_newBuilder();
                            String s1 = bwnq0.f;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            gged1 = gged0;
                            s1.getClass();
                            v2 = v;
                            ((glqc)hftv0).b |= 16;
                            ((glqc)hftv0).g = s1;
                            String s2 = bwnq0.d;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            glqc glqc0 = (glqc)hftp0.b_message;
                            s2.getClass();
                            glqc0.b |= 0x20;
                            glqc0.h = s2;
                            glnt0.a(hftp0);
                            bwts0.q(6015, ((glnu)((ProtoLiteBuilder)glnt0).N_build()));
                            hashSet0.add(s);
                            goto label_54;
                        }
                    }
                }
                gged1 = gged0;
                v2 = v;
            label_54:
                ++v1;
                gged0 = gged1;
                v = v2;
            }
            for(Object object0: hashSet0) {
                OneoffRebuildIndexChimeraService.e(context0, ((String)object0), glrw.f);
            }
            bwtc.h(context0, bwtc0, bwmx0.r);
            bxax0.x(false);
            return;
        }
        NativeIndex nativeIndex0 = bwmx0.m;
        if(nativeIndex0 == null) {
            bwne.s("Failed to get native index");
            return;
        }
        SQLiteDatabase sQLiteDatabase0 = bwqt0.getWritableDatabase();
        gged_interceptors gged2 = bwut0.l();
        int v4 = ((ggna)gged2).c;
        for(int v3 = 0; v3 < v4; ++v3) {
            bwnq bwnq1 = (bwnq)gged2.get(v3);
            if(bwur.C(bwnq1)) {
                long v5 = nativeIndex0.f(bwnq1.c, true);
                if(v5 > 0L) {
                    bwsa bwsa1 = bwsa.a(bwnq1.d, bwnq1.f, bwtc0);
                    if(bwsa1 == null) {
                        bwne.v("Failed to find appIndexingCorpusConfig for corpus %s, package %s", bwnq1.d, bwnq1.f);
                    }
                    else {
                        sQLiteDatabase0.beginTransaction();
                        try {
                            if(abyd.e(sQLiteDatabase0, bwsa1.e())) {
                                bwqt.h(sQLiteDatabase0, bwsa1, v5);
                            }
                            sQLiteDatabase0.setTransactionSuccessful();
                        }
                        catch(Throwable throwable0) {
                            sQLiteDatabase0.endTransaction();
                            throw throwable0;
                        }
                        sQLiteDatabase0.endTransaction();
                        String s3 = bwsa1.b;
                        bwuc bwuc1 = bwmx0.l;
                        if(bwuc1 == null) {
                            bwne.s("Failed to get client registry");
                        }
                        else if(bwqt0.j(bwmx0, bwuc1.h(s3), bwtc0)) {
                            OneoffRebuildIndexChimeraService.e(context0, s3, glrw.f);
                        }
                    }
                }
            }
        }
    }
}

