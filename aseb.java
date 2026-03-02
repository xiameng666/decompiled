import android.accounts.Account;
import java.util.List;

final class aseb extends ibsl implements ibtx {
    int a;
    Object b;
    Object c;
    final aseh d;

    public aseb(aseh aseh0, ibrl ibrl0) {
        this.d = aseh0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        aseb aseb0 = new aseb(this.d, ((ibrl)object2));
        aseb0.b = (aqqh)object0;
        aseb0.c = (aqqh)object1;
        return aseb0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        Object object2 = this.b;
        Object object3 = this.c;
        aseh aseh0 = this.d;
        if(!(object2 instanceof aqqe) && !(object2 instanceof aqqd)) {
            if(!(object2 instanceof aqqf)) {
                throw new ibnq();
            }
            asml asml0 = (asml)((aqqf)object2).a;
            if((asml0 instanceof asmk)) {
                object2 = new aqqf(((asmk)asml0).a);
            }
            else {
                if(!(asml0 instanceof asmi)) {
                    throw new ibnq();
                }
                Account account0 = ((asmi)asml0).a;
                if(account0 == null) {
                    List list0 = aqxq.a(aseh0.a);
                    if((object3 instanceof aqqd)) {
                        ibuq.c(list0);
                        object2 = new aqqf(ibpo.T(list0));
                    }
                    else {
                        object2 = ((aqqh)object3).a(new asdz(list0));
                    }
                }
                else {
                    object2 = new aqqf(account0);
                }
            }
        }
        asea asea0 = new asea(aseh0);
        this.b = null;
        this.a = 1;
        Object object4 = ((aqqh)object2).c(asea0, this);
        return object4 == object1 ? object1 : object4;
    }
}

