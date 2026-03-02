import java.util.Iterator;

public final class dtyf implements evqf {
    public final evqp a;

    public dtyf(evqp evqp0) {
        this.a = evqp0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        evqp evqp0;
        Iterator iterator0 = ((gtxh)object0).b.iterator();
        while(true) {
            evqp0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            switch(((gtxi)object1).c) {
                case 1: 
                case 2: {
                    break;
                }
                default: {
                    continue;
                }
            }
            evqp0.b(Boolean.valueOf(true));
            return;
        }
        evqp0.b(Boolean.valueOf(false));
    }
}

