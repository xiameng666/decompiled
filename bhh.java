import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class bhh implements bld {
    public final Object d;
    public final List e;
    public List f;
    public Throwable g;
    public boolean h;

    public bhh(List list0) {
        this.d = new Object();
        this.e = new CopyOnWriteArrayList();
        this.g = null;
        this.h = false;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            ibuq.f(((String)object0), "primaryCameraId");
            arrayList0.add(azx.a(((String)object0)));
        }
        this.f = arrayList0;
    }

    protected abstract void c();

    public final void d(List list0, Throwable throwable0) {
        Throwable throwable1;
        List list1;
        boolean z = false;
        synchronized(this.d) {
            if(throwable0 == null) {
                kay.i(list0);
                if(this.g != null || !this.f.equals(list0)) {
                    z = true;
                }
                this.g = null;
                this.f = list0;
            }
            else {
                if(this.g == null || !this.f.isEmpty()) {
                    z = true;
                }
                this.g = throwable0;
                this.f = Collections.EMPTY_LIST;
            }
            list1 = DesugarCollections.unmodifiableList(this.f);
            throwable1 = this.g;
        }
        if(z) {
            for(Object object1: this.e) {
                bhh.e(((bhg)object1), list1, throwable1);
            }
        }
    }

    public static final void e(bhg bhg0, List list0, Throwable throwable0) {
        bhf bhf0 = new bhf(throwable0, bhg0, list0);
        bhg0.a.execute(bhf0);
    }
}

