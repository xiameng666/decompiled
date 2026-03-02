import android.util.Log;
import java.io.IOException;

public final class fdpe implements Runnable {
    public final fdpj a;

    public fdpe(fdpj fdpj0) {
        this.a = fdpj0;
    }

    @Override
    public final void run() {
        fdpj fdpj0;
        try {
            fdpj0 = this.a;
            fdpj0.e.m(true);
            fdpj0.p.a("sent disconnect heartbeat");
        }
        catch(IOException | fdsp unused_ex) {
            Log.w("CloudSync", "Failed to send disconnect heartbeat");
            fdpj0.p.a("failed to send disconnect heartbeat");
        }
    }
}

