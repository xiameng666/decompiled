import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class bwsj extends bwsh {
    Map a;
    private final Thing[] b;
    private final long c;

    public bwsj(Thing[] arr_thing, long v) {
        super(bwst.a(arr_thing), 4);
        this.b = arr_thing;
        this.c = v;
    }

    @Override  // bwse
    protected final void c(bwmx bwmx0, bwud bwud0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0) {
        bwne.p("Processing patch synchronously for package %s.", bwud0.e);
        bwst.d(bwmx0, "patch");
        bwst.i(bwmx0.b, bwmx0.r, 4);
        gftb.z(this.a, "execute called without validateInput");
        for(Object object0: this.a.entrySet()) {
            bwsa bwsa0 = (bwsa)((Map.Entry)object0).getKey();
            for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                hlne hlne0 = bwth.b(((Thing)object1));
                String s = bwsa0.c();
                bwst.e(bwsa0.b, s, hlne0, true, bwmx0, nativeIndex0, bwuc0, bwuj0);
                bwne.r("Synchronously patched Thing (pkg: %s, url: %s)", bwsa0.b, ((Thing)object1).d);
                bwmx0 = bwmx0;
                nativeIndex0 = nativeIndex0;
            }
        }
        nativeIndex0.v();
    }

    @Override  // bwsh
    public final bwsg g(SQLiteDatabase sQLiteDatabase0, bwqt bwqt0, bwud bwud0, bwtc bwtc0) {
        Thing[] arr_thing = this.b;
        if(arr_thing == null) {
            return new bwsg(null, null);
        }
        batl.l(sQLiteDatabase0.inTransaction());
        String s = bwud0.e;
        if(arr_thing.length == 0) {
            return new bwsg(Collections.EMPTY_SET, null);
        }
        if(goqs.a(3)) {
            for(int v1 = 0; v1 < arr_thing.length; ++v1) {
                goqs.b(String.format(Locale.US, "Patch Indexable %d / %d", ((int)(v1 + 1)), ((int)arr_thing.length)));
                goqs.b(arr_thing[v1].toString());
            }
        }
        gfza gfza0 = new gfza();
        for(int v = 0; v < arr_thing.length; ++v) {
            Thing thing0 = arr_thing[v];
            gfza0.v(bwtc0.a(thing0.e).b, thing0);
        }
        gfza gfza1 = new gfza();
        Set set0 = bwqs.a(sQLiteDatabase0, s, bwtc0);
        Iterator iterator0 = set0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            bwsa bwsa0 = (bwsa)object0;
            String s1 = bwsa0.a.b;
            if(gfza0.u(s1)) {
                gfza1.v(s1, bwsa0);
            }
            else {
                iterator0.remove();
            }
        }
        for(Object object1: gfza1.w()) {
            String s2 = (String)((Map.Entry)object1).getKey();
            bwsa bwsa1 = (bwsa)((Map.Entry)object1).getValue();
            for(Object object2: gfza0.g(s2)) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("action", "mod");
                contentValues0.put("uri", ((Thing)object2).d);
                contentValues0.put("section_thing_proto", bwth.c(((Thing)object2)));
                sQLiteDatabase0.insertOrThrow(bwtd.c(bwsa1.e()), null, contentValues0);
            }
        }
        return new bwsg(set0, null);
    }

    @Override  // bwsi
    public final void h(bwmx bwmx0, bwud bwud0, bwrc bwrc0) {
        bwst.d(bwmx0, "patch");
        gftb.z(this.a, "execute called without validateInput");
        for(Object object0: this.a.entrySet()) {
            bwsa bwsa0 = (bwsa)((Map.Entry)object0).getKey();
            for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                hlne hlne0 = bwth.b(((Thing)object1));
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwlq.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwlu.a).v_newBuilder();
                String s = bwsa0.b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                bwlu bwlu0 = (bwlu)hftp1.b_message;
                s.getClass();
                bwlu0.c = s;
                String s1 = bwsa0.c();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((bwlu)hftv0).d = s1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                bwlu bwlu1 = (bwlu)hftp1.b_message;
                hlne0.getClass();
                bwlu1.e = hlne0;
                bwlu1.b |= 1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwlq bwlq0 = (bwlq)hftp0.b_message;
                bwlu bwlu2 = (bwlu)hftp1.N_build();
                bwlu2.getClass();
                bwlq0.c = bwlu2;
                bwlq0.b = 2;
                long v = this.c;
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
        }
    }

    @Override  // bwsi
    public final void i(bwud bwud0, bwmx bwmx0, bwtc bwtc0) {
        Thing[] arr_thing = this.b;
        String s = bwud0.e;
        bwsz.c(arr_thing, s, bwmx0.b, true, bwtc0);
        if(arr_thing == null) {
            return;
        }
        this.a = bwsb.b(arr_thing, s, bwtc0);
    }
}

