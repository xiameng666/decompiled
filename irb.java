import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public final class irb {
    public final gwq a;
    public final ReferenceQueue b;

    public irb() {
        this.a = new gwq(new Reference[16]);
        this.b = new ReferenceQueue();
    }

    public final void a() {
        do {
            Reference reference0 = this.b.poll();
            if(reference0 != null) {
                this.a.m(reference0);
            }
        }
        while(reference0 != null);
    }
}

