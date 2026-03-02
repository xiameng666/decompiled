import android.content.Intent;
import com.google.android.gms.common.api.Status;

public final class ftqi implements Runnable {
    public final ftqm a;
    public final ByteString b;
    public final evqp c;

    public ftqi(ftqm ftqm0, ByteString hfsf0, evqp evqp0) {
        this.a = ftqm0;
        this.b = hfsf0;
        this.c = evqp0;
    }

    @Override
    public final void run() {
        ftqm ftqm0 = this.a;
        ftqf ftqf0 = ftqm0.n;
        ftqg ftqg0 = new ftqg(this.b, this.c);
        if(ftqm0.l && ftqf0 != null) {
            ftqm0.q(ftqf0, ftqg0);
            return;
        }
        ftqm0.k.add(ftqg0);
        if(ftqm0.l) {
            return;
        }
        if(!ftqm0.p()) {
            ftqm0.m(Status.g);
            return;
        }
        ftqm0.l = true;
        Intent intent0 = new Intent(ftqm0.h).setPackage(ftqm0.g);
        ftqm0.f.bindService(intent0, ftqm0.m, (ftqm0.j == 0 ? 33 : ftqm0.j));
        ftqm0.o();
    }
}

