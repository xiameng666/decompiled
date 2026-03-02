import android.os.Message;
import j..util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

final class feen extends fefk {
    final feeq a;

    public feen(feeq feeq0) {
        Objects.requireNonNull(feeq0);
        this.a = feeq0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ScanningState";
    }

    @Override  // fefk
    public final void b() {
        ArrayBlockingQueue arrayBlockingQueue0;
        feeu feeu0 = new feeu();
        feeq feeq0 = this.a;
        feeq0.d = feeu0;
        while(true) {
            arrayBlockingQueue0 = feeq0.c;
            if(arrayBlockingQueue0.size() < 100) {
                break;
            }
            arrayBlockingQueue0.poll();
        }
        arrayBlockingQueue0.add(feeq0.d);
        feeq0.x(4);
    }

    @Override  // fefk
    public final void c() {
        this.a.g();
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        return true;
    }
}

