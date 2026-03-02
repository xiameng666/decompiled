import android.content.Intent;
import java.util.List;

public final class algm implements Runnable {
    public final algs a;
    public final Intent b;

    public algm(algs algs0, Intent intent0) {
        this.a = algs0;
        this.b = intent0;
    }

    @Override
    public final void run() {
        algs algs0 = this.a;
        if(!algs0.d) {
            Intent intent0 = this.b;
            if(baiw.a(intent0) == 0) {
                algs0.a.h(intent0);
                algs0.d = true;
                batl.l(algs0.d);
                List list0 = algs0.c;
                for(Object object0: list0) {
                    algs0.b.post(((Runnable)object0));
                }
                list0.clear();
            }
        }
    }
}

