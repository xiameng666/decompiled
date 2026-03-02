import java.io.DataOutputStream;
import java.util.concurrent.Callable;

public final class eqge implements Callable {
    public final eqgk a;
    public final epwg b;

    public eqge(eqgk eqgk0, epwg epwg0) {
        this.a = eqgk0;
        this.b = epwg0;
    }

    @Override
    public final Object call() {
        eqgk eqgk0 = this.a;
        DataOutputStream dataOutputStream0 = eqgk0.h;
        if(dataOutputStream0 != null) {
            dataOutputStream0.writeInt(this.b.b.length);
            dataOutputStream0.write(this.b.b);
            eqgk0.h.flush();
        }
        return null;
    }
}

