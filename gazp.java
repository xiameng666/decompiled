import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public final class gazp {
    public final Handler a;
    public gazo b;
    public final List c;
    public gazs d;
    private final ibth e;

    public gazp(Handler handler0, ibth ibth0) {
        this.a = handler0;
        this.e = ibth0;
        this.c = new ArrayList();
    }

    public final Object a(gazo gazo0) {
        try {
            gawd.a(this.a);
            gazo gazo1 = this.b;
            if(gazo1 != null && gazo1.getClass() != gazo0.getClass()) {
                throw new IllegalStateException("Check failed.");
            }
            if(gazo1 == null) {
                this.b = gazo0;
            }
            gazs gazs0 = this.d;
            if(gazs0 != null) {
                return gazs0.b();
            }
            gazs gazs1 = this.c();
            ibnx.b(gazs1.b());
            this.d = gazs1;
            return ibom.a;
        }
        catch(Throwable throwable0) {
            return ibnx.a(throwable0);
        }
    }

    public final Object b() {
        Object object1;
        try {
            gawd.a(this.a);
            gazs gazs0 = this.d;
            ibnw ibnw0 = null;
            if(gazs0 != null) {
                Object object0 = gazs0.c();
                if(ibnw.b(object0)) {
                    ibom ibom0 = (ibom)object0;
                    this.d = null;
                    this.b = null;
                }
                ibnw0 = new ibnw(object0);
            }
            object1 = new ibnw(gazq.a(ibnw0));
        }
        catch(Throwable throwable0) {
            object1 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object1);
        if(throwable1 != null) {
            object1 = new ibnw(ibnx.a(throwable1));
        }
        return ((ibnw)object1).a;
    }

    public final gazs c() {
        Object object1;
        if(this.d != null) {
            throw new IllegalStateException("Cannot listen for event while already listening");
        }
        Object object0 = this.e.a();
        try {
            gawd.a(((gazs)object0).a);
            ((gazs)object0).c.add(this);
            object1 = ibom.a;
        }
        catch(Throwable throwable0) {
            object1 = ibnx.a(throwable0);
        }
        ibnx.b(object1);
        return (gazs)object0;
    }
}

