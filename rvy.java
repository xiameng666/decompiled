import android.content.Context;
import android.os.PersistableBundle;

final class rvy extends ibsl implements ibtw {
    int a;
    final rxl b;
    final rve c;
    final ryh d;
    final PersistableBundle e;
    final AutoCloseable f;

    public rvy(rxl rxl0, rve rve0, ryh ryh0, PersistableBundle persistableBundle0, AutoCloseable autoCloseable0, ibrl ibrl0) {
        this.b = rxl0;
        this.c = rve0;
        this.d = ryh0;
        this.e = persistableBundle0;
        this.f = autoCloseable0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rvy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rvy(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                sct.c("OTMServiceBinder", "executeTask#Flushing InProgress state before executing the task.");
                this.a = 1;
                if(this.b.f.d(this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                try {
                    ibnx.b(object0);
                    goto label_24;
                }
                catch(RuntimeException runtimeException0) {
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    this.b.f.j(this.d);
                    throw throwable0;
                }
            }
        }
        Object object2 = this.e;
        rpv rpv0 = rqa.c;
        String s = this.c.fb();
        String s1 = this.c.fa();
        long v = this.c.d;
        try {
            object2 = this.c.k().k().fm(object2);
        }
        catch(Exception unused_ex) {
        }
        rpv0.a(new rpq(s, s1, v, object2));
        sct.c("OTMServiceBinder", "executeTask#start[" + this.d + "]");
        try {
            try {
                Context context0 = ((Context)this.b.a.get()).getApplicationContext();
                ibuq.e(context0, "getApplicationContext(...)");
                this.a = 2;
                object0 = rve.y(this.c, context0, this.e, this);
                if(object0 == object1) {
                    return object1;
                }
            label_24:
                sct.c("OTMServiceBinder", a.m(((rxv)object0), this.d, "executeTask#end[", "] taskState="));
                this.b.f.l(this.d, ((rxv)object0));
                rxl.E(this.d, ((rxv)object0));
            }
            catch(RuntimeException runtimeException0) {
            label_29:
                sct.f("OTMServiceBinder", "executeTask#Caught RuntimeException during task execution", runtimeException0);
                rxv rxv0 = this.b.f.c(this.d);
                rxl.A(this.d, rxv0, runtimeException0);
            }
        }
        catch(Throwable throwable0) {
            this.b.f.j(this.d);
            throw throwable0;
        }
        this.b.f.j(this.d);
        return ibom.a;
    }
}

