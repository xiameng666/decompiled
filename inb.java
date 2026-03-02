import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

public final class inb implements icck {
    public final View a;
    public final jhm b;
    public final icck c;
    public final AtomicReference d;

    public inb(View view0, jhm jhm0, icck icck0) {
        this.a = view0;
        this.b = jhm0;
        this.c = icck0;
        this.d = new AtomicReference(null);
    }

    public final Object a(epb epb0, ibrl ibrl0) {
        imw imw0;
        if((ibrl0 instanceof imw)) {
            imw0 = (imw)ibrl0;
            int v = imw0.c;
            if((v & 0x80000000) == 0) {
                imw0 = new imw(this, ibrl0);
            }
            else {
                imw0.c = v - 0x80000000;
            }
        }
        else {
            imw0 = new imw(this, ibrl0);
        }
        Object object0 = imw0.a;
        Object object1 = ibrx.a;
        switch(imw0.c) {
            case 0: {
                ibnx.b(object0);
                imy imy0 = new imy(epb0, this);
                ina ina0 = new ina(this, null);
                imw0.c = 1;
                if(hfj.b(this.d, imy0, ina0, imw0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new ibnm();
    }

    @Override  // icck
    public final ibrt c() {
        return this.c.c();
    }
}

