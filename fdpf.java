import android.util.Log;
import java.io.IOException;

public final class fdpf implements Runnable {
    public final fdpj a;

    public fdpf(fdpj fdpj0) {
        this.a = fdpj0;
    }

    @Override
    public final void run() {
        fdpj fdpj0;
        try {
            fdpj0 = this.a;
            fdpj0.e.m(false);
            fdpj0.p.a("sent heartbeat");
        }
        catch(IOException | fdsp unused_ex) {
            Log.w("CloudSync", "Failed to send heartbeat");
            fdpj0.p.a("failed to send heartbeat");
        }
    }
}

