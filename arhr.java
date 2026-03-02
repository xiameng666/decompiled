import java.io.InputStream;
import java.util.Queue;

public final class arhr implements arli {
    public final arhv a;
    public final asce b;
    public final asby c;
    public final arqo d;
    public final InputStream e;
    public final Queue f;

    public arhr(arhv arhv0, asce asce0, asby asby0, arqo arqo0, InputStream inputStream0, Queue queue0) {
        this.a = arhv0;
        this.b = asce0;
        this.c = asby0;
        this.d = arqo0;
        this.e = inputStream0;
        this.f = queue0;
    }

    @Override  // arli
    public final void a(int v) {
        asce asce0 = this.b;
        arhv arhv0 = this.a;
        this.d.d(this.c, this.e);
        if(((Boolean)arhv0.k.mr()).booleanValue() && v == 2) {
            arhv.a.h("Transport already disconnected for the connectionType = %s, no need to keep processing with the rest of the items left in the batch.", new Object[]{hkyj.c.name()});
            return;
        }
        arhv0.b(asce0, this.f);
    }
}

