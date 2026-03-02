import android.util.Log;

public final class llk implements Runnable {
    public final String a;
    public final llx b;

    public llk(String s, llx llx0) {
        this.a = s;
        this.b = llx0;
    }

    @Override
    public final void run() {
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + this.a, this.b);
        throw this.b;
    }
}

