import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.ExecutorService;

public final class arfp implements Runnable {
    public final arjh a;
    private final ExecutorService b;
    private final Context c;

    public arfp(Context context0, ExecutorService executorService0, arjh arjh0) {
        this.b = executorService0;
        this.a = arjh0;
        this.c = context0;
    }

    @Override
    public final void run() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = jwe.b(this.c, null, intentFilter0, 2);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbp.a).v_newBuilder();
        int v = intent0.getIntExtra("level", -1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbp asbp0 = (asbp)hftp0.b_message;
        asbp0.b |= 2;
        asbp0.d = v;
        int v1 = intent0.getIntExtra("scale", -1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbp asbp1 = (asbp)hftp0.b_message;
        boolean z = true;
        asbp1.b |= 1;
        asbp1.c = v1;
        switch(intent0.getIntExtra("status", -1)) {
            case 2: 
            case 5: {
                break;
            }
            default: {
                z = false;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbp asbp2 = (asbp)hftp0.b_message;
        asbp2.b |= 4;
        asbp2.e = z;
        arfo arfo0 = new arfo(this, hftp0);
        this.b.execute(arfo0);
    }
}

