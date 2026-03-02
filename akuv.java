import j..util.Objects;
import java.util.ArrayList;

public final class akuv implements Runnable {
    final akvf a;

    public akuv(akvf akvf0) {
        Objects.requireNonNull(akvf0);
        this.a = akvf0;
        super();
    }

    @Override
    public final void run() {
        akvf.a.d("Stopping all advertisements.", new Object[0]);
        akvf akvf0 = this.a;
        for(Object object0: akvf0.f) {
            akvf0.d.add(((akvb)object0).a.b);
        }
        akvf0.e.clear();
        akvf0.j.removeCallbacksAndMessages(null);
        akvf.i(akvf0);
        akvf.j(akvf0);
        akvf0.f(new ArrayList());
    }
}

