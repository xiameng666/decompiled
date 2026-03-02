import android.accounts.Account;
import java.util.Map;

final class ezre extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final ezrg f;
    final Account g;

    public ezre(ezrg ezrg0, Account account0, ibrl ibrl0) {
        this.f = ezrg0;
        this.g = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ezre)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ezre(this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        Object object8;
        Object object7;
        Map map0;
        Object object6;
        Object object1 = ibrx.a;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                ezrg ezrg0 = this.f;
                object3 = this.g;
                object6 = ezrg0.e;
                this.a = object6;
                this.b = ezrg0;
                this.c = object3;
                this.e = 1;
                if(((icta)object6).b(this) == object1) {
                    return object1;
                }
                object4 = ezrg0;
                goto label_23;
            }
            case 1: {
                object3 = this.c;
                object4 = this.b;
                object6 = this.a;
                ibnx.b(object0);
                try {
                label_23:
                    map0 = ((ezrg)object4).a;
                    object7 = map0.get(object3);
                    if(object7 == null) {
                        this.a = object6;
                        this.b = object4;
                        this.c = object3;
                        this.d = map0;
                        this.e = 2;
                        if(((ezrg)object4).b(this) != object1) {
                            goto label_37;
                        }
                        return object1;
                    }
                    else {
                        object5 = object6;
                        object8 = (ezsr)object7;
                        goto label_55;
                    }
                    object8 = (ezsr)object7;
                    goto label_55;
                }
                catch(Throwable throwable1) {
                    throwable0 = throwable1;
                    object5 = object6;
                    break;
                }
            label_37:
                object2 = map0;
                object5 = object6;
                try {
                label_39:
                    String s = ((Account)object3).name;
                    ibuq.e(s, "name");
                    fpgj fpgj0 = ((ezrg)object4).d;
                    if(fpgj0 == null) {
                        ibuq.j("facsAppSearchSession");
                        fpgj0 = null;
                    }
                    object7 = new ezrc(s, fpgj0, ((ezrg)object4).c);
                    ((Map)object2).put(object3, object7);
                    object8 = (ezsr)object7;
                    goto label_55;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                try {
                    object2 = this.d;
                    object3 = this.c;
                    object4 = this.b;
                    object5 = this.a;
                    ibnx.b(object0);
                    goto label_39;
                }
                catch(Throwable throwable0) {
                }
            }
        }
        ((icta)object5).d();
        throw throwable0;
    label_55:
        ((icta)object5).d();
        return object8;
    }
}

