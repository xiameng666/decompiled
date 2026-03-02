import java.util.Arrays;

public abstract class hmny extends hmnz {
    @Override  // hmnz
    public final void a(hmoe hmoe0) {
        this.c.b(hmoe0);
        if(hmoe0.f == 0) {
            this.a = this.c.a;
            return;
        }
        this.a = Arrays.copyOf(this.c.a, this.c.a.length);
    }
}

