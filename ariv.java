import java.io.InputStream;
import java.util.Queue;

public final class ariv implements arli {
    public final arjh a;
    public final asce b;
    public final asby c;
    public final arqo d;
    public final InputStream e;
    public final hkyj f;
    public final Queue g;

    public ariv(arjh arjh0, asce asce0, asby asby0, arqo arqo0, InputStream inputStream0, hkyj hkyj0, Queue queue0) {
        this.a = arjh0;
        this.b = asce0;
        this.c = asby0;
        this.d = arqo0;
        this.e = inputStream0;
        this.f = hkyj0;
        this.g = queue0;
    }

    @Override  // arli
    public final void a(int v) {
        asce asce0 = this.b;
        hkyj hkyj0 = this.f;
        arjh arjh0 = this.a;
        this.d.d(this.c, this.e);
        if(((Boolean)arjh0.G.mr()).booleanValue() && v == 2) {
            arjh.p.h("Transport already disconnected for the connectionType = %s, no need to keep processing with the rest of the items left in the batch.", new Object[]{hkyj0.name()});
            return;
        }
        switch(hkyj0.ordinal()) {
            case 1: {
                arjh0.C = false;
                break;
            }
            case 2: {
                arjh0.B = false;
            }
        }
        arjh0.x(asce0, this.g);
    }
}

