import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public final class cjbb extends ibow {
    private final WorkSource a;

    public cjbb(WorkSource workSource0) {
        ibuq.f(workSource0, "workSource");
        super();
        this.a = workSource0;
    }

    @Override  // iboq
    public final int a() {
        return bbrd.a(this.a);
    }

    public final cjay b(int v) {
        Method method0 = bbrd.b;
        WorkSource workSource0 = this.a;
        int v1 = 0;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(workSource0, v);
                batl.s(object0);
                v1 = (int)(((Integer)object0));
            }
            catch(Exception exception0) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception0);
            }
        }
        String s = bbrd.d(this.a, v);
        ibuq.c(s);
        return new cjay(v1, s);
    }

    @Override  // iboq
    public final boolean contains(Object object0) {
        return (object0 instanceof cjay) ? super.contains(((cjay)object0)) : false;
    }

    @Override  // ibow
    public final Object get(int v) {
        return this.b(v);
    }

    @Override  // ibow
    public final int indexOf(Object object0) {
        return (object0 instanceof cjay) ? super.indexOf(((cjay)object0)) : -1;
    }

    @Override  // ibow
    public final int lastIndexOf(Object object0) {
        return (object0 instanceof cjay) ? super.lastIndexOf(((cjay)object0)) : -1;
    }
}

