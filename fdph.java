import android.content.Intent;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import j..util.Objects;

final class fdph implements Handler.Callback {
    final fdpj a;

    public fdph(fdpj fdpj0) {
        Objects.requireNonNull(fdpj0);
        this.a = fdpj0;
        super();
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        if(message0 != null) {
            Intent intent0 = (Intent)message0.obj;
            if(intent0 != null && intent0.hasExtra("status")) {
                String s = intent0.getStringExtra("status");
                if(Log.isLoggable("CloudSync", 3)) {
                    Log.d("CloudSync", "Gcm connection state: " + s);
                }
                if(Objects.equals(s, "1")) {
                    if(Log.isLoggable("CloudSync", 3)) {
                        Log.d("CloudSync", "Already connected to GCM.");
                    }
                    this.a.p.a("Already connected to GCM");
                    synchronized(this.a.f) {
                        this.a.n = true;
                        this.a.j("check gcm already connected");
                    }
                    return true;
                }
            }
            else if(Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "No GCM status found in the response.");
            }
        }
        return true;
    }
}

