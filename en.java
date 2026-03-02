import java.util.ArrayList;

public final class en implements Runnable {
    public final fm a;

    public en(fm fm0) {
        this.a = fm0;
    }

    @Override
    public final void run() {
        ArrayList arrayList0 = this.a.m;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((fg)arrayList0.get(v1)).a();
        }
    }
}

