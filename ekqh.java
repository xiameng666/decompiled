import android.content.Context;
import android.content.Intent;
import com.google.android.gms.scheduler.DeviceStateReceiver;

public final class ekqh implements Runnable {
    public final DeviceStateReceiver a;
    public final Intent b;
    public final Context c;

    public ekqh(DeviceStateReceiver deviceStateReceiver0, Intent intent0, Context context0) {
        this.a = deviceStateReceiver0;
        this.b = intent0;
        this.c = context0;
    }

    @Override
    public final void run() {
        String s = this.b.getAction();
        if(s == null) {
            return;
        }
        if("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(s)) {
            ekrs.b().f.a(4);
            return;
        }
        if("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED".equals(s)) {
            ekrs.b().f.a(5);
            return;
        }
        ekqg ekqg0 = this.a.a;
        if(!s.equals("android.intent.action.DOCK_ACTIVE") && !s.equals("android.intent.action.DOCK_IDLE") || ekqg0.a) {
            Context context0 = this.c;
            bbib bbib0 = new bbib(context0);
            if(s.equals("android.intent.action.SCREEN_ON")) {
                ekqg0.b(bbib0, s);
            }
            else if(s.equals("android.intent.action.DREAMING_STOPPED")) {
                hrvh.a.i().ax();
                if(ekqg0.b.c()) {
                    ekqg0.b(bbib0, s);
                    goto label_29;
                }
                goto label_19;
            }
            else {
            label_19:
                if(s.equals("android.intent.action.DOCK_ACTIVE")) {
                    ekqg0.b(bbib0, s);
                }
                else if(s.equals("android.intent.action.SCREEN_OFF") || s.equals("android.intent.action.DREAMING_STARTED") || s.equals("android.intent.action.DOCK_IDLE")) {
                    ekqg0.d(bbib0, s, context0);
                }
                else if(s.equals("com.google.android.gms.gcm.TRIGGER_IDLE")) {
                    ekqg0.c();
                }
            }
        }
    label_29:
        ekrl ekrl0 = ekrs.b().f;
        switch(s.hashCode()) {
            case 0x81271581: {
                if(s.equals("android.intent.action.SCREEN_OFF")) {
                    ekrl0.a(13);
                    return;
                }
                break;
            }
            case 0xA953D76D: {
                if(s.equals("android.intent.action.SCREEN_ON")) {
                    ekrl0.a(12);
                    return;
                }
                break;
            }
        }
    }
}

