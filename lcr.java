import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

final class lcr extends ibsl implements ibts {
    Object a;
    Object b;
    int c;
    final Object d;
    final lci e;

    public lcr(lci lci0, Object object0, ibrl ibrl0) {
        this.e = lci0;
        this.d = object0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new lcr(this.e, this.d, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        FileOutputStream fileOutputStream0;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            object2 = this.b;
            object3 = this.a;
            ibnx.b(object0);
            goto label_20;
        }
        ibnx.b(object0);
        try {
            fileOutputStream0 = new FileOutputStream(this.e.a);
        }
        catch(Exception exception0) {
            throw (exception0 instanceof FileNotFoundException) ? lce.a(this.e.a.getParent(), exception0) : exception0;
        }
        try {
            leg leg0 = new leg(fileOutputStream0);
            this.a = fileOutputStream0;
            this.b = fileOutputStream0;
            this.c = 1;
            if(this.e.b.c(this.d, leg0) != object1) {
                goto label_18;
            }
            return object1;
        }
        catch(Throwable throwable1) {
            object3 = fileOutputStream0;
            throwable0 = throwable1;
            throw throwable0;
        }
    label_18:
        object2 = fileOutputStream0;
        object3 = object2;
        try {
        label_20:
            ((FileOutputStream)object2).getFD().sync();
            goto label_27;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable2) {
            try {
                ibsx.a(((Closeable)object3), throwable0);
                throw throwable2;
            label_27:
                ibsx.a(((Closeable)object3), null);
                return ibom.a;
            }
            catch(Exception exception0) {
            }
        }
        throw (exception0 instanceof FileNotFoundException) ? lce.a(this.e.a.getParent(), exception0) : exception0;
    }
}

