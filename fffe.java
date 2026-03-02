import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ExecutionException;

public final class fffe implements Runnable {
    public final fffd a;
    public final boolean b;
    public final Context c;

    public fffe(fffd fffd0, boolean z, Context context0) {
        this.a = fffd0;
        this.b = z;
        this.c = context0;
    }

    @Override
    public final void run() {
        boolean z;
        try {
            z = this.b;
            fffd fffd0 = this.a;
            synchronized(fffd0.b) {
                ffcp ffcp0 = fffd0.a();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffcp.a).w(((ProtoLiteMessage)ffcp0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffcp ffcp1 = (ffcp)hftp0.b_message;
                ffcp1.b |= 1;
                ffcp1.c = z;
                ffcp ffcp2 = (ffcp)hftp0.N_build();
                batl.k("Running setWearableApiReady DB blocking call on main thread.");
                fffc fffc0 = new fffc(ffcp2);
                ((glyq)fffd0.c.b(fffc0, gmap.a)).u();
            }
        }
        catch(ExecutionException | InterruptedException exception0) {
            if(Log.isLoggable("WearReadyBroadcaster", 5)) {
                Log.w("WearReadyBroadcaster", String.format("Unable to set wearable preferences value: %s. Not sending (WearableApiReady = %s) broadcast.", exception0.getLocalizedMessage(), Boolean.valueOf(z)));
                return;
            }
            return;
        }
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.wearable.READY_STATE").setPackage("com.google.android.gms");
        intent0.putExtra("isReady", z);
        this.c.sendBroadcast(intent0);
        if(Log.isLoggable("WearReadyBroadcaster", 2)) {
            Log.v("WearReadyBroadcaster", String.format("Broadcast (WearableApiReady = %s) is sent.", Boolean.valueOf(z)));
        }
    }
}

