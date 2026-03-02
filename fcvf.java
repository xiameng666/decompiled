import android.os.OutcomeReceiver;
import j..util.Objects;
import java.util.function.Function;

final class fcvf implements OutcomeReceiver {
    final String a;
    final jqt b;
    final Function c;
    final Object d;

    public fcvf(fcvh fcvh0, String s, jqt jqt0, Function function0, Object object0) {
        this.a = s;
        this.b = jqt0;
        this.c = function0;
        this.d = object0;
        Objects.requireNonNull(fcvh0);
        super();
    }

    @Override  // android.os.OutcomeReceiver
    public final void onError(Throwable throwable0) {
        fcvh.a.m("MigrationManager#%s error: ", new Object[]{this.a, throwable0});
        this.b.b(this.d);
    }

    @Override  // android.os.OutcomeReceiver
    public final void onResult(Object object0) {
        fcvh.a.d("MigrationManager#%s complete", new Object[]{this.a});
        Object object1 = this.c.apply(object0);
        this.b.b(object1);
    }
}

