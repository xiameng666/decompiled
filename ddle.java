import com.google.android.gms.nearby.sharing.discovery.FastInitiation.6;

public final class ddle implements Runnable {
    public final FastInitiation.6 a;
    public final int b;

    public ddle(FastInitiation.6 fastInitiation$60, int v) {
        this.a = fastInitiation$60;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.a.d(this.b);
    }
}

