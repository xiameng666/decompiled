import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.ArrayList;
import java.util.Set;

public final class bwsl extends bwsf {
    private final long a;

    public bwsl(long v) {
        this.a = v;
    }

    @Override  // bwse
    protected final void c(bwmx bwmx0, bwud bwud0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0) {
        String s = bwud0.e;
        bwne.p("Processing removeAll synchronously for package %s.", s);
        bwst.i(bwmx0.b, bwmx0.r, 5);
        gged_interceptors gged0 = bwst.c(s, bwuc0, bwuj0);
        int v = ((ggna)gged0).c;
        for(int v2 = 0; v2 < v; ++v2) {
            bwnr bwnr0 = bwst.b(((bwvl)gged0.get(v2)), bwuc0, bwuj0);
            if(bwnr0 != null) {
                bwmx0.w(s, (bwnr0.c == null ? bwnq.a : bwnr0.c).d);
            }
        }
        bwne.p("Synchronous removeAll completed for package %s.", s);
        nativeIndex0.v();
        if(!hubg.h().b.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            gged_interceptors gged1 = bwst.c(s, bwuc0, bwuj0);
            int v3 = ((ggna)gged1).c;
            for(int v1 = 0; v1 < v3; ++v1) {
                bwnr bwnr1 = bwst.b(((bwvl)gged1.get(v1)), bwuc0, bwuj0);
                if(bwnr1 != null) {
                    String s1 = bwsa.g((bwnr1.c == null ? bwnq.a : bwnr1.c).d);
                    if(!s1.isEmpty()) {
                        arrayList0.add(s1);
                    }
                }
            }
            if(!arrayList0.isEmpty()) {
                glzd.g(bwmx0.j(), new bwsk(arrayList0, bwmx0, this.a, s), gmap.a);
            }
        }
    }

    @Override  // bwse
    public final void e(bwmx bwmx0) {
    }

    @Override  // bwsf
    protected final Set g(SQLiteDatabase sQLiteDatabase0, bwud bwud0, bwtc bwtc0) {
        return bwqt.q(sQLiteDatabase0, null, bwud0, bwtc0);
    }

    @Override  // bwsi
    public final void h(bwmx bwmx0, bwud bwud0, bwrc bwrc0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwlq.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwlr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((bwlr)hftp1.b_message).b = bwud0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwlq bwlq0 = (bwlq)hftp0.b_message;
        bwlr bwlr0 = (bwlr)hftp1.N_build();
        bwlr0.getClass();
        bwlq0.c = bwlr0;
        bwlq0.b = 4;
        long v = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bwlq)hftp0.b_message).d = v;
        int v1 = bwud0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bwlq)hftp0.b_message).e = v1;
        bwrc0.a(((bwlq)hftp0.N_build()));
    }

    @Override  // bwsi
    public final void i(bwud bwud0, bwmx bwmx0, bwtc bwtc0) {
    }
}

