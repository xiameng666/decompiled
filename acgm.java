import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserHandle;
import android.util.ArrayMap;
import com.google.android.gms.appsearch.AppSearchSchema;
import com.google.android.gms.appsearch.GetByDocumentIdRequest;
import com.google.android.gms.appsearch.InternalVisibilityConfig;
import com.google.android.gms.appsearch.RemoveByDocumentIdRequest;
import com.google.android.gms.appsearch.SchemaVisibilityConfig;
import com.google.android.gms.appsearch.SearchSpec;
import com.google.android.gms.appsearch.aidl.AppSearchAttributionSource;
import com.google.android.gms.common.Feature;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class acgm extends azts implements acfm {
    public final String a;
    public final AppSearchAttributionSource b;
    public final Context c;
    public volatile boolean d;
    public final bavt e;
    public static final int f;
    private static final azta_api g;
    private volatile boolean h;
    private static final azss i;
    private static final azsy j;

    static {
        azss azss0 = new azss();
        acgm.i = azss0;
        acgg acgg0 = new acgg();
        acgm.j = acgg0;
        acgm.g = new azta_api("AppSearch.API", acgg0, azss0);
    }

    public acgm(Context context0, acgr acgr0, bavt bavt0) {
        super(context0, acgm.g, acgr0, aztr_settings.a);
        this.d = false;
        this.h = false;
        this.a = "com.google.android.gms";
        int v = Process.myPid();
        this.b = new AppSearchAttributionSource(new aciw(context0.getAttributionSource(), v));
        this.c = context0;
        this.e = bavt0;
    }

    @Override  // acfm
    public final acik b(String s, SearchSpec searchSpec0, String s1) {
        batl.m(((boolean)(this.h ^ 1)), "SearchSession has already been closed");
        UserHandle userHandle0 = Process.myUserHandle();
        return new acik(this, this.b, s1, s, searchSpec0, userHandle0);
    }

    @Override  // acfm
    public final evql c(GetByDocumentIdRequest getByDocumentIdRequest0, String s) {
        batl.m(((boolean)(this.h ^ 1)), "SearchSession has already been closed");
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{achf.a};
        azzc0.a = new acfn(this, s, getByDocumentIdRequest0);
        azzc0.d = 30106;
        return this.iG(azzc0.a());
    }

    @Override  // acfm
    public final evql e(String s) {
        batl.m(((boolean)(this.h ^ 1)), "SearchSession has already been closed");
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{achf.a};
        azzc0.a = new acft(this, s);
        azzc0.d = 30103;
        return this.iG(azzc0.a());
    }

    @Override  // acfm
    public final evql f(acib acib0, String s) {
        batl.m(((boolean)(this.h ^ 1)), "SearchSession has already been closed");
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{achf.a};
        azzc0.a = new acfw(this, acib0, s);
        azzc0.d = 30105;
        return this.jn(azzc0.a());
    }

    @Override  // acfm
    public final evql g(RemoveByDocumentIdRequest removeByDocumentIdRequest0, String s) {
        batl.m(((boolean)(this.h ^ 1)), "SearchSession has already been closed");
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{achf.a};
        azzc0.a = new acfx(this, s, removeByDocumentIdRequest0);
        azzc0.d = 30108;
        return this.jn(azzc0.a());
    }

    @Override  // azts, azty
    public final Feature[] gm() {
        return new Feature[]{achf.b};
    }

    @Override  // acfm
    public final evql h(acip acip0, String s) {
        Objects.requireNonNull(acip0);
        Objects.requireNonNull(s);
        batl.m(((boolean)(this.h ^ 1)), "AppSearchSession has already been closed");
        ArrayList arrayList0 = new ArrayList(acip0.c());
        Set set0 = acip0.c();
        Set set1 = DesugarCollections.unmodifiableSet(acip0.a);
        ArrayMap arrayMap0 = new ArrayMap();
        for(Object object0: acip0.b.entrySet()) {
            arrayMap0.put(((String)((Map.Entry)object0).getKey()), new bxf(((Collection)((Map.Entry)object0).getValue())));
        }
        ArrayMap arrayMap1 = acip.a(acip0.c);
        Map map0 = DesugarCollections.unmodifiableMap(acip0.d);
        ArrayMap arrayMap2 = new ArrayMap();
        for(Object object1: acip0.e.entrySet()) {
            arrayMap2.put(((String)((Map.Entry)object1).getKey()), new bxf(((Collection)((Map.Entry)object1).getValue())));
        }
        ArrayList arrayList1 = new ArrayList(set0.size());
        for(Object object2: set0) {
            String s1 = ((AppSearchSchema)object2).a;
            achn achn0 = new achn(s1);
            boolean z = set1.contains(s1);
            achn0.a();
            achn0.b = z;
            Set set2 = (Set)arrayMap0.get(s1);
            if(set2 != null) {
                for(Object object3: set2) {
                    achn0.a();
                    achn0.c.b(((achw)object3));
                }
            }
            Set set3 = (Set)arrayMap1.get(s1);
            if(set3 != null) {
                for(Object object4: set3) {
                    achn0.a();
                    achn0.c.c(((Set)object4));
                }
            }
            achw achw0 = (achw)map0.get(s1);
            if(achw0 != null) {
                achn0.a();
                achn0.c.d(achw0);
            }
            Set set4 = (Set)arrayMap2.get(s1);
            if(set4 != null) {
                for(Object object5: set4) {
                    Objects.requireNonNull(((SchemaVisibilityConfig)object5));
                    achn0.a();
                    achn0.d.add(((SchemaVisibilityConfig)object5));
                }
            }
            achn0.e = true;
            boolean z1 = achn0.b;
            SchemaVisibilityConfig schemaVisibilityConfig0 = achn0.c.a();
            arrayList1.add(new InternalVisibilityConfig(achn0.a, z1, schemaVisibilityConfig0, achn0.d));
        }
        if(acip0.b().isEmpty()) {
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{achf.a};
            azzc0.a = new acfo(this, s, arrayList0, arrayList1, acip0);
            azzc0.d = 30102;
            return this.jn(azzc0.a());
        }
        acgn.a();
        ExecutorService executorService0 = achl.a();
        long v = SystemClock.elapsedRealtime();
        long v1 = SystemClock.elapsedRealtime();
        azzc azzc1 = new azzc();
        azzc1.c = new Feature[]{achf.a};
        azzc1.a = new acfv(this, executorService0, s, acip0, arrayList0, arrayList1, v1, v);
        azzc1.d = 30102;
        return this.jn(azzc1.a());
    }

    @Override  // acfm
    public final void i() {
        if(this.d && !this.h) {
            this.h = true;
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{achf.a};
            azzc0.a = new acfy(this);
            azzc0.d = 0x75A0;
            this.jn(azzc0.a());
            return;
        }
        evrg.d(null);
    }

    @Override  // acfm
    public final evql j(SearchSpec searchSpec0, String s) {
        batl.m(((boolean)(this.h ^ 1)), "SearchSession has already been closed");
        if(searchSpec0.m != null) {
            throw new IllegalArgumentException("JoinSpec not allowed in removeByQuery, but JoinSpec was provided.");
        }
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{achf.a};
        azzc0.a = new acfz(this, s, searchSpec0);
        azzc0.d = 30109;
        return this.iG(azzc0.a());
    }

    public static List k(List list0) {
        List list1 = new ArrayList(list0.size());
        for(int v = 0; v < list0.size(); ++v) {
            list1.add(((achh)list0.get(v)).a);
        }
        return list1;
    }
}

