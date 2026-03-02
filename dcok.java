import android.util.ArrayMap;
import j..util.Map.-EL;

final class dcok extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final dcor f;
    private Object g;

    public dcok(dcor dcor0, ibrl ibrl0) {
        this.f = dcor0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcok)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcok(this.f, ibrl0);
        ibrl1.g = object0;
        return ibrl1;
    }

    public static final ArrayMap d(ibnn ibnn0) {
        return (ArrayMap)ibnn0.a();
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object5;
        Object object4;
        Object object3;
        Object object2;
        Object object7;
        Object object6;
        icck icck1;
        Object object1 = ibrx.a;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                icck1 = (icck)this.g;
                object6 = new ibnz(new dcog());
                object7 = this.f.b.A();
                goto label_40;
            }
            case 1: {
                object7 = this.b;
                object6 = this.a;
                icck icck2 = (icck)this.g;
                ibnx.b(object0);
                icck0 = icck2;
                break;
            }
            default: {
                object2 = this.d;
                object3 = this.c;
                object4 = this.b;
                object5 = this.a;
                icck0 = (icck)this.g;
                ibnx.b(object0);
                goto label_35;
            }
        }
        while(true) {
            object5 = object6;
            object4 = object7;
            if(!((Boolean)object0).booleanValue()) {
                break;
            }
            Object object8 = ((icgh)object4).b();
            dcnz dcnz0 = ((dcny)this.f.d.b()).a(object8);
            object3 = dcnz0.a;
            dcoa dcoa0 = dcnz0.b;
            iccl.f(icck0);
            this.g = icck0;
            this.a = object5;
            this.b = object4;
            this.c = object3;
            this.d = dcoa0;
            this.e = 2;
            if(this.f.d.a(object3, this) != object1) {
                object2 = dcoa0;
            label_35:
                if(object2 != null) {
                    Map.-EL.compute(dcok.d(((ibnn)object5)), ((dcoa)object2).a(), new dcoi(new dcoh(icck0, this.f, ((dcoa)object2), ((dcny)object3), ((ibnn)object5))));
                }
                object7 = object4;
                icck1 = icck0;
                object6 = object5;
            label_40:
                this.g = icck1;
                this.a = object6;
                this.b = object7;
                this.c = null;
                this.d = null;
                this.e = 1;
                Object object9 = ((icgh)object7).a(this);
                if(object9 == object1) {
                    return object1;
                }
                icck0 = icck1;
                object0 = object9;
                continue;
            }
            return object1;
        }
        return ibom.a;
    }
}

