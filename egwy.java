import com.google.android.gms.people.internal.SyncStatus;

public final class egwy implements Runnable {
    public final egxc a;
    public final SyncStatus b;

    public egwy(egxc egxc0, SyncStatus syncStatus0) {
        this.a = egxc0;
        this.b = syncStatus0;
    }

    @Override
    public final void run() {
        egxb egxb0;
        int v2;
        int v1;
        egxc egxc0 = this.a;
        if(!egxc.r(egxc0.h)) {
            if(egyf.b(egxc0.i)) {
                int v = this.b.a;
                switch(v) {
                    case 0: {
                        v2 = 6;
                        v1 = 0;
                        break;
                    }
                    case 1: {
                        v1 = egxc0.b();
                        v2 = 2;
                        break;
                    }
                    case 2: {
                        v1 = 0;
                        v2 = 1;
                        break;
                    }
                    default: {
                        if(v == 3 || v == 6 || (v == 7 || v == 8)) {
                            v1 = 0;
                            v2 = 2;
                        }
                        else {
                            v1 = 0;
                            v2 = 1;
                        }
                    }
                }
                egxb0 = new egxb(v2, v1, gfqx.a, 0, gfqx.a, -1L);
            }
            else {
                egxb0 = new egxb(5, 0, gfqx.a, 0, gfqx.a, -1L);
            }
        }
        else if(hwyp.i()) {
            egxb0 = new egxb(4, egxc0.q(), gfqx.a, 0, gfqx.a, -1L);
        }
        else {
            egxb0 = new egxb(4, 0, gfqx.a, 0, gfqx.a, -1L);
        }
        egxc0.ii(egxb0);
    }
}

