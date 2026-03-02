import android.accounts.Account;
import java.util.List;

final class asel extends ibsl implements ibtx {
    int a;
    Object b;
    Object c;
    final aser d;

    public asel(aser aser0, ibrl ibrl0) {
        this.d = aser0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        asel asel0 = new asel(this.d, ((ibrl)object2));
        asel0.b = (aqqh)object0;
        asel0.c = (aqqh)object1;
        return asel0.jI(ibom.a);
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
        aser aser0 = this.d;
        if(!(object2 instanceof aqqe) && !(object2 instanceof aqqd)) {
            if(!(object2 instanceof aqqf)) {
                throw new ibnq();
            }
            asoz asoz0 = (asoz)((aqqf)object2).a;
            if((asoz0 instanceof asoy)) {
                object2 = new aqqf(((asoy)asoz0).a);
            }
            else {
                if(!(asoz0 instanceof asox)) {
                    throw new ibnq();
                }
                Account account0 = ((asox)asoz0).a;
                if(account0 == null) {
                    List list0 = aqxq.a(aser0.a);
                    if((object3 instanceof aqqd)) {
                        ibuq.c(list0);
                        object2 = new aqqf(ibpo.T(list0));
                    }
                    else {
                        object2 = ((aqqh)object3).a(new asej(list0));
                    }
                }
                else {
                    object2 = new aqqf(account0);
                }
            }
        }
        asek asek0 = new asek(aser0);
        this.b = null;
        this.a = 1;
        Object object4 = ((aqqh)object2).c(asek0, this);
        return object4 == object1 ? object1 : object4;
    }
}

