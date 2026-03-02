import android.os.Bundle;
import j..util.Objects;

final class eqpi implements Runnable {
    final eqos a;
    final int b;
    final Bundle c;
    final eqpj d;

    public eqpi(eqpj eqpj0, eqos eqos0, int v, Bundle bundle0) {
        this.a = eqos0;
        this.b = v;
        this.c = bundle0;
        Objects.requireNonNull(eqpj0);
        this.d = eqpj0;
        super();
    }

    @Override
    public final void run() {
        this.a.c(this.b, this.c);
        eqpj eqpj0 = this.d;
        eqos eqos0 = eqpj0.b;
        if(eqos0 != null) {
            kau kau0 = (kau)eqpj0.a.poll();
            if(kau0 != null) {
                Object object0 = kau0.a;
                if(object0 != null) {
                    Object object1 = kau0.b;
                    if(object1 != null) {
                        eqpj0.a(eqos0, ((Integer)object0).intValue(), ((Bundle)object1));
                    }
                }
            }
        }
    }
}

