import android.content.Intent;
import java.util.List;

final class gatk implements ganu {
    private final ganu a;
    private final gatj b;

    public gatk(ganu ganu0, gatj gatj0) {
        this.a = ganu0;
        this.b = gatj0;
    }

    @Override  // ganu
    public final void nH(int v, ganp ganp0) {
        Intent intent0 = ganp0.a;
        if(intent0.hasExtra("extraIntegratorAnalyticLogEvents")) {
            List list0 = gawi.o(intent0, "extraIntegratorAnalyticLogEvents", ((MessageLite)heah.a));
            this.b.g.b(list0);
        }
        this.a.nH(v, ganp0);
    }
}

