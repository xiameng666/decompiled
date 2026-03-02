import android.util.Log;
import j..util.Objects;

final class fdub implements ffeq {
    final fdud a;

    public fdub(fdud fdud0) {
        Objects.requireNonNull(fdud0);
        this.a = fdud0;
        super();
    }

    @Override  // ffeq
    public final void a(int v, byte[] arr_b) {
        synchronized(this.a.b) {
            this.a.c = 0;
            this.a.d = false;
        }
        this.a.d(arr_b);
    }

    @Override  // ffeq
    public final void b(int v) {
        fdud fdud0 = this.a;
        synchronized(fdud0.b) {
            boolean z = true;
            int v1 = fdud0.c + 1;
            fdud0.c = v1;
            if(v1 >= 3) {
                fdud0.c = 0;
                z = false;
            }
            fdud0.d = false;
        }
        if(z) {
            Log.w("CloudSync", "Timeout waiting for cloudsync key response from phone, retrying request");
            this.a.f();
            return;
        }
        Log.e("CloudSync", "Stopping requests for cloudsync key from phone after 3 attempts");
    }
}

