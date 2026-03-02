import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ReceiverCallNotAllowedException;

public final class fxur {
    static final IntentFilter a;
    public final Context b;

    static {
        fxur.a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public fxur(Context context0) {
        this.b = context0;
    }

    public static fxro a(Context context0) {
        Intent intent0 = null;
        try {
            intent0 = jwe.b(context0, null, fxur.a, 2);
        }
        catch(ReceiverCallNotAllowedException unused_ex) {
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fxro.a).v_newBuilder();
        if(intent0 != null) {
            int v = fxrn.a(intent0.getIntExtra("plugged", 0));
            if(v == 0) {
                v = 4;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fxro)hftp0.b_message).c = v - 1;
            ((fxro)hftp0.b_message).b |= 1;
            int v1 = intent0.getIntExtra("level", 0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fxro fxro0 = (fxro)hftp0.b_message;
            fxro0.b |= 2;
            fxro0.d = v1;
            int v2 = intent0.getIntExtra("scale", 0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fxro fxro1 = (fxro)hftp0.b_message;
            fxro1.b |= 4;
            fxro1.e = v2;
            int v3 = intent0.getIntExtra("voltage", 0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fxro fxro2 = (fxro)hftp0.b_message;
            fxro2.b |= 8;
            fxro2.f = v3;
        }
        return (fxro)hftp0.N_build();
    }
}

