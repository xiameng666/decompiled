import android.util.Log;

public final class akqe implements qlb {
    public final akqh a;
    public final akqg b;

    public akqe(akqh akqh0, akqg akqg0) {
        this.a = akqh0;
        this.b = akqg0;
    }

    @Override  // qlb
    public final void a(Object object0) {
        Log.e("Auth", "Error while downloading animation for screen id: " + this.b, ((Throwable)object0));
        this.a.a(akqg.a, 3);
    }
}

