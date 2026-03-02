import java.util.ArrayList;
import java.util.List;

public final class hmkh {
    public final Object a;
    public List b;
    public hmkh c;

    public hmkh(Object object0) {
        this.a = object0;
    }

    public final void a(hmkh hmkh0) {
        if(this.b == null) {
            this.b = new ArrayList();
        }
        hmkh0.c = this;
        this.b.add(hmkh0);
    }
}

