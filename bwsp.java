import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class bwsp extends bwsf {
    private final String[] a;
    private final long b;

    public bwsp(String[] arr_s, long v) {
        this.a = arr_s;
        this.b = v;
    }

    @Override  // bwse
    protected final void c(bwmx bwmx0, bwud bwud0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0) {
        String[] arr_s;
        String s = bwud0.e;
        bwne.p("Processing removeTypes synchronously for package %s.", s);
        Context context0 = bwmx0.b;
        bwst.i(context0, bwmx0.r, 5);
        for(int v = 0; true; ++v) {
            arr_s = this.a;
            if(v >= arr_s.length) {
                break;
            }
            String s1 = arr_s[v];
            gged_interceptors gged0 = bwst.c(s, bwuc0, bwuj0);
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                bwvl bwvl0 = (bwvl)gged0.get(v2);
                bwnr bwnr0 = bwst.b(bwvl0, bwuc0, bwuj0);
                if(bwnr0 != null) {
                    bwsa bwsa0 = bwsa.a((bwnr0.c == null ? bwnq.a : bwnr0.c).d, (bwnr0.c == null ? bwnq.a : bwnr0.c).f, bwtc.d(context0));
                    if(bwsa0 == null) {
                        bwne.t("No AppIndexingCorpusConfig found for corpus %s", bwvl0.c());
                    }
                    else if(bwsa0.a.b.equals(s1)) {
                        bwmx0.w(s, (bwnr0.c == null ? bwnq.a : bwnr0.c).d);
                    }
                }
            }
            bwne.r("Synchronous removeType completed for package %s and type %s.", s, s1);
        }
        nativeIndex0.v();
        if(!hubg.h().b.isEmpty()) {
            List list0 = Arrays.asList(arr_s);
            gmcd gmcd0 = bwmx0.j();
            glzd.g(gmcd0, new bwso(list0, bwmx0, this.b, s, gmcd0), gmap.a);
        }
    }

    @Override  // bwse
    public final void e(bwmx bwmx0) {
    }

    @Override  // bwsf
    protected final Set g(SQLiteDatabase sQLiteDatabase0, bwud bwud0, bwtc bwtc0) {
        return bwqt.q(sQLiteDatabase0, ggfp.H(this.a), bwud0, bwtc0);
    }

    @Override  // bwsi
    public final void h(bwmx bwmx0, bwud bwud0, bwrc bwrc0) {
        for(int v = 0; true; ++v) {
            String[] arr_s = this.a;
            if(v >= arr_s.length) {
                break;
            }
            String s = arr_s[v];
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwlq.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwlt.a).v_newBuilder();
            String s1 = bwud0.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((bwlt)hftv0).b = s1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            bwlt bwlt0 = (bwlt)hftp1.b_message;
            s.getClass();
            bwlt0.c = s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bwlq bwlq0 = (bwlq)hftp0.b_message;
            bwlt bwlt1 = (bwlt)hftp1.N_build();
            bwlt1.getClass();
            bwlq0.c = bwlt1;
            bwlq0.b = 5;
            long v1 = this.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((bwlq)hftp0.b_message).d = v1;
            int v2 = bwud0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((bwlq)hftp0.b_message).e = v2;
            bwrc0.a(((bwlq)hftp0.N_build()));
        }
    }

    @Override  // bwsi
    public final void i(bwud bwud0, bwmx bwmx0, bwtc bwtc0) {
    }
}

