import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class ebvu extends ibsl implements ibtw {
    int a;
    final ebvx b;
    final Context c;

    public ebvu(ebvx ebvx0, Context context0, ibrl ibrl0) {
        this.b = ebvx0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebvu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebvu(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                object0 = this.b.c(this.c, this);
                if(object0 == object1) {
                    return object1;
                }
            label_9:
                this.b.a.x(((Status)object0));
                return new cjuf(((Status)object0));
            }
            catch(RemoteException unused_ex) {
                return new cjuf(Status.h);
            }
            catch(cjuh cjuh0) {
                return new cjuf(cjuh0.a_OperationException);
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(RemoteException unused_ex) {
                return new cjuf(Status.h);
            }
            catch(cjuh cjuh0) {
                return new cjuf(cjuh0.a_OperationException);
            }
        }
        goto label_9;
    }
}

