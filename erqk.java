import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class erqk implements Runnable {
    public final erql a;

    public erqk(erql erql0) {
        this.a = erql0;
    }

    @Override
    public final void run() {
        erql erql0 = this.a;
        erqj erqj0 = erql0.d;
        if(erqj0 == null) {
            return;
        }
        cjpc cjpc0 = cjqh.a(erql0.c, "smartdevice", "bluetooth_state", 4);
        try {
            synchronized(erql.b) {
                if(!cjpc0.h("bluetooth_state")) {
                    cjpa cjpa0 = cjpc0.c();
                    cjpa0.e("bluetooth_state", erqj0.d());
                    cjpa0.b().get();
                }
            }
        }
        catch(IOException | ExecutionException | InterruptedException exception0) {
            erql.a.g("Failed to store bluetooth state to disk", exception0, new Object[0]);
        }
    }
}

