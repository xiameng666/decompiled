import java.util.List;

public final class atf implements Runnable {
    public final atk a;

    public atf(atk atk0) {
        this.a = atk0;
    }

    @Override
    public final void run() {
        atk atk0 = this.a;
        synchronized(atk0.a) {
            List list0 = atk0.b;
            if(list0.isEmpty()) {
                return;
            }
            try {
                atk0.n(list0);
            }
            finally {
                atk0.b.clear();
            }
        }
    }
}

