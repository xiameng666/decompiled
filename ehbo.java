import android.content.ContentProviderOperation.Builder;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jeb.synthetic.FIN;

public final class ehbo {
    private ArrayList a;
    private ContentProviderOperation.Builder b;
    private int c;
    private final Map d;

    public ehbo() {
        this.a = new ArrayList();
        this.d = new HashMap();
    }

    public final int a(ContentProviderOperation.Builder contentProviderOperation$Builder0, boolean z) {
        int v1;
        synchronized(this) {
            gftb.check(contentProviderOperation$Builder0);
            if(z) {
                v1 = this.j(contentProviderOperation$Builder0);
                this.g();
            }
            else {
                v1 = this.j(contentProviderOperation$Builder0);
                egiv.R();
                hwzc hwzc0 = hwzc.a;
                boolean z1 = hwzc0.c().aL();
                Boolean.valueOf(z1).getClass();
                if(z1) {
                    int v2 = (int)hwzc0.c().r();
                    Integer.valueOf(v2).getClass();
                    if(this.c >= v2) {
                        this.g();
                        return v1;
                    }
                }
            }
        }
        return v1;
    }

    public final int b() {
        synchronized(this) {
            if(this.h()) {
                return 0;
            }
        }
        return this.a.size() + 1;
    }

    public final ArrayList c() {
        ArrayList arrayList0;
        synchronized(this) {
            arrayList0 = this.a;
            ContentProviderOperation.Builder contentProviderOperation$Builder0 = this.b;
            if(contentProviderOperation$Builder0 != null) {
                arrayList0.add(contentProviderOperation$Builder0.build());
            }
            this.a = new ArrayList();
            this.b = null;
            this.c = 0;
        }
        return arrayList0;
    }

    public static ArrayList d(ArrayList arrayList0, int v, int v1, Map map0) {
        ArrayList arrayList1 = new ArrayList();
        if(v != 0) {
            for(int v2 = v; v2 < v1; ++v2) {
                ContentProviderOperation contentProviderOperation0 = (ContentProviderOperation)arrayList0.get(v2);
                ehbm ehbm0 = (ehbm)map0.get(Integer.valueOf(v2));
                if(ehbm0 == null) {
                    arrayList1.add(contentProviderOperation0);
                }
                else {
                    arrayList1.add(ContentProviderOperation.newInsert(contentProviderOperation0.getUri()).withValues(ehbm0.a).withValueBackReference(ehbm0.b, ehbm0.c - v).withYieldAllowed(contentProviderOperation0.isYieldAllowed()).build());
                }
            }
            return arrayList1;
        }
        return new ArrayList(arrayList0.subList(0, v1));
    }

    public final Map e() {
        synchronized(this) {
        }
        return this.d;
    }

    public final void f() {
        synchronized(this) {
            this.d.clear();
        }
    }

    public final void g() {
        synchronized(this) {
            ContentProviderOperation.Builder contentProviderOperation$Builder0 = this.b;
            if(contentProviderOperation$Builder0 != null) {
                contentProviderOperation$Builder0.withYieldAllowed(true);
                this.c = 0;
            }
        }
    }

    public final boolean h() {
        synchronized(this) {
        }
        return this.b == null;
    }

    public final void i(Integer integer0, ContentValues contentValues0, Integer integer1) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(contentValues0 != null) {
            this.d.put(integer0, new ehbm(contentValues0, ((int)integer1)));
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new NullPointerException("Null values");
    }

    private final int j(ContentProviderOperation.Builder contentProviderOperation$Builder0) {
        ++this.c;
        int v = this.b();
        ContentProviderOperation.Builder contentProviderOperation$Builder1 = this.b;
        if(contentProviderOperation$Builder1 != null) {
            this.a.add(contentProviderOperation$Builder1.build());
        }
        this.b = contentProviderOperation$Builder0;
        return v;
    }
}

