import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class foqu extends foqk {
    public final List b;

    public foqu() {
        this.b = new CopyOnWriteArrayList();
    }

    @Override  // foqk
    public final void g(fokg fokg0) {
        for(Object object0: this.b) {
            ((foqo)object0).g(fokg0);
        }
    }

    @Override  // foqk
    public final void j(fokg fokg0) {
        for(Object object0: this.b) {
            ((foqo)object0).j(fokg0);
        }
    }
}

