import android.content.BroadcastReceiver.PendingResult;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

final class furf extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final furg f;
    final View g;
    final BroadcastReceiver.PendingResult h;
    final long i;

    public furf(furg furg0, View view0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0, long v, ibrl ibrl0) {
        this.f = furg0;
        this.g = view0;
        this.h = broadcastReceiver$PendingResult0;
        this.i = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((furf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new furf(this.f, this.g, this.h, this.i, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        long v;
        Object object5;
        Throwable throwable2;
        furb furb0;
        Object object1 = ibrx.a;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                try {
                    Object object2 = new ByteArrayOutputStream();
                    Object object3 = new furb(((OutputStream)object2));
                    GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(((OutputStream)object3));
                    try {
                        furb0 = new furb(gZIPOutputStream0);
                        this.a = object2;
                        this.b = object3;
                        this.c = gZIPOutputStream0;
                        this.d = furb0;
                        this.e = 1;
                        Object object4 = this.f.b.c(this.g, furb0, furs.b, this);
                        if(object4 != object1) {
                            object4 = ibom.a;
                        }
                    }
                    catch(Throwable throwable1) {
                        throwable2 = throwable1;
                        object5 = gZIPOutputStream0;
                        throw throwable2;
                    }
                    if(object4 == object1) {
                        return object1;
                    }
                    object5 = gZIPOutputStream0;
                    Object object6 = furb0;
                    v = ((furb)object6).a;
                    goto label_39;
                    try {
                    label_26:
                        object6 = this.d;
                        object5 = this.c;
                        object3 = this.b;
                        object2 = this.a;
                        ibnx.b(object0);
                        v = ((furb)object6).a;
                        goto label_39;
                    }
                    catch(Throwable throwable3) {
                        throwable2 = throwable3;
                    }
                    try {
                        throw throwable2;
                    }
                    catch(Throwable throwable4) {
                        ibsx.a(((Closeable)object5), throwable2);
                        throw throwable4;
                    }
                label_39:
                    ibsx.a(((Closeable)object5), null);
                    String s = Base64.encodeToString(((ByteArrayOutputStream)object2).toByteArray(), 0);
                    furd furd0 = new furd(this.h, s, this.f, this.i, v, ((furb)object3), null);
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 2;
                    if(icbd.a(furs.b, furd0, this) == object1) {
                        return object1;
                    label_49:
                        ibnx.b(object0);
                        return ibom.a;
                    }
                    return ibom.a;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_26;
            }
            case 2: {
                goto label_49;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        Log.e(furg.a, "Failed to snapshot hierarchy", throwable0);
        fure fure0 = new fure(this.f, this.h, null);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 3;
        return icbd.a(furs.b, fure0, this) == object1 ? object1 : ibom.a;
    }
}

