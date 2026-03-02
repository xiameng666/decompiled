import java.util.Queue;

public final class arir implements arli {
    public final arjh a;
    public final asce b;
    public final Queue c;

    public arir(arjh arjh0, asce asce0, Queue queue0) {
        this.a = arjh0;
        this.b = asce0;
        this.c = queue0;
    }

    @Override  // arli
    public final void a(int v) {
        asce asce0 = this.b;
        arjh arjh0 = this.a;
        if(((Boolean)arjh0.G.mr()).booleanValue() && v == 2) {
            arjh.p.h("Transport already disconnected for the connectionType = %s, no need to keep processing with the rest of the items left in the batch.", new Object[]{hkyj.c.name()});
            return;
        }
        arjh0.B = false;
        arjh0.x(asce0, this.c);
    }
}

