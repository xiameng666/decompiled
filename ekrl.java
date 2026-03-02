import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;

public final class ekrl {
    public final Map a;

    public ekrl() {
        this.a = new bxd();
    }

    public final void a(int v) {
        synchronized(this) {
            for(Object object0: this.a.entrySet()) {
                ((Executor)((Map.Entry)object0).getValue()).execute(new ekrj(((ekrk)((Map.Entry)object0).getKey()), v));
            }
        }
    }

    public final void b(eksg eksg0) {
        synchronized(this) {
            for(Object object0: this.a.entrySet()) {
                ekrk ekrk0 = (ekrk)((Map.Entry)object0).getKey();
                ((Executor)((Map.Entry)object0).getValue()).execute(new ekrg(ekrk0, eksg0));
            }
        }
    }

    public final void c(eksg eksg0) {
        synchronized(this) {
            for(Object object0: this.a.entrySet()) {
                ekrk ekrk0 = (ekrk)((Map.Entry)object0).getKey();
                ((Executor)((Map.Entry)object0).getValue()).execute(new ekrh(ekrk0, eksg0));
            }
        }
    }

    public final void d() {
        this.a(2);
    }

    public final void e(int v) {
        synchronized(this) {
            for(Object object0: this.a.entrySet()) {
                ekrk ekrk0 = (ekrk)((Map.Entry)object0).getKey();
                ((Executor)((Map.Entry)object0).getValue()).execute(new ekri(ekrk0, v));
            }
        }
    }
}

