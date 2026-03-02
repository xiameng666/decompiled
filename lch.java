import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

final class lch extends ibsl implements ibts {
    Object a;
    int b;
    final lci c;

    public lch(lci lci0, ibrl ibrl0) {
        this.c = lci0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new lch(this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                try {
                    Object object3 = new FileInputStream(this.c.a);
                    try {
                        this.a = object3;
                        this.b = 1;
                        object0 = this.c.b.b(((InputStream)object3));
                        if(object0 == object1) {
                            return object1;
                        }
                        goto label_20;
                    label_14:
                        object3 = this.a;
                        ibnx.b(object0);
                    }
                    catch(Throwable throwable1) {
                        ibsx.a(((Closeable)object3), throwable1);
                        throw throwable1;
                    }
                label_20:
                    ibsx.a(((Closeable)object3), null);
                    return object0;
                }
                catch(FileNotFoundException unused_ex) {
                    break;
                }
            }
            case 1: {
                goto label_14;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                goto label_38;
            }
        }
        lci lci0 = this.c;
        File file0 = lci0.a;
        if(file0.exists()) {
            try {
                FileInputStream fileInputStream0 = new FileInputStream(file0);
                try {
                    this.a = fileInputStream0;
                    this.b = 2;
                    object0 = lci0.b.b(fileInputStream0);
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    object2 = fileInputStream0;
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    ibsx.a(((Closeable)object2), throwable0);
                    throw throwable2;
                }
            label_36:
                if(object0 != object1) {
                    object2 = fileInputStream0;
                label_38:
                    ibsx.a(((Closeable)object2), null);
                    return object0;
                }
            }
            catch(Exception exception0) {
                throw (exception0 instanceof FileNotFoundException) ? lce.a(this.c.a.getParent(), exception0) : exception0;
            }
            return object1;
        }
        return this.c.b.a();
    }
}

