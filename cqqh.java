import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class cqqh {
    public static final IntentFilter a;

    static {
        cqqh.a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static hltp a(Context context0) {
        int v4;
        int v3;
        int v = 2;
        Intent intent0 = jwe.b(context0, null, cqqh.a, 2);
        if(intent0 == null) {
            intent0 = new Intent();
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hltp.a).v_newBuilder();
        boolean z = intent0.getBooleanExtra("present", false);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltp hltp0 = (hltp)hftp0.b_message;
        hltp0.b |= 1;
        hltp0.c = z;
        int v1 = intent0.getIntExtra("level", 0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltp hltp1 = (hltp)hftp0.b_message;
        hltp1.b |= 2;
        hltp1.d = v1;
        int v2 = intent0.getIntExtra("scale", 0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hltp hltp2 = (hltp)hftp0.b_message;
        hltp2.b |= 4;
        hltp2.e = v2;
        switch(intent0.getIntExtra("plugged", -1)) {
            case 0: {
                v3 = 2;
                break;
            }
            case 1: {
                v3 = 3;
                break;
            }
            case 2: {
                v3 = 4;
                break;
            }
            case 4: {
                v3 = 5;
                break;
            }
            default: {
                v3 = 1;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hltp)hftp0.b_message).f = v3 - 1;
        ((hltp)hftp0.b_message).b |= 8;
        switch(intent0.getIntExtra("status", 1)) {
            case 2: {
                v4 = 2;
                break;
            }
            case 3: {
                v4 = 3;
                break;
            }
            case 4: {
                v4 = 4;
                break;
            }
            case 5: {
                v4 = 5;
                break;
            }
            default: {
                v4 = 1;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hltp)hftp0.b_message).g = v4 - 1;
        ((hltp)hftp0.b_message).b |= 16;
        switch(intent0.getIntExtra("health", 1)) {
            case 2: {
                break;
            }
            case 3: {
                v = 3;
                break;
            }
            case 4: {
                v = 4;
                break;
            }
            case 5: {
                v = 5;
                break;
            }
            case 6: {
                v = 6;
                break;
            }
            case 7: {
                v = 7;
                break;
            }
            default: {
                v = 1;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hltp)hftp0.b_message).h = v - 1;
        ((hltp)hftp0.b_message).b |= 0x20;
        return (hltp)hftp0.N_build();
    }
}

