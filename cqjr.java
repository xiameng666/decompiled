import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.mdm.services.BaseLockscreenMessageChimeraService.1;
import com.google.android.gms.mdm.services.BaseLockscreenMessageChimeraService.2;

public class cqjr extends Service {
    public cqig a;
    private final BroadcastReceiver b;
    private final BroadcastReceiver c;

    public cqjr(cqig cqig0) {
        this.a = null;
        this.b = new BaseLockscreenMessageChimeraService.1(this);
        this.c = new BaseLockscreenMessageChimeraService.2(this);
        this.a = cqig0;
    }

    public static void a(Context context0, String s, String s1) {
        Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.mdm.services.LockscreenMessageService");
        intent0.putExtra("lock_message", s);
        if(!TextUtils.isEmpty(s1)) {
            intent0.putExtra("lock_phone_number", s1);
        }
        context0.startService(intent0);
    }

    public static void b(Context context0) {
        cqix.i.b(context0, "");
        cqix.j.b(context0, "");
        cqix.o.b(context0, "");
        context0.stopService(new Intent().setClassName(context0, "com.google.android.gms.mdm.services.LockscreenMessageService"));
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.USER_PRESENT");
        jwe.b(this, this.c, intentFilter0, 2);
        IntentFilter intentFilter1 = new IntentFilter("android.intent.action.SCREEN_ON");
        jwe.b(this, this.b, intentFilter1, 2);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        Intent intent0 = new Intent("com.google.android.gms.mdm.DISMISS_MESSAGE");
        lvj.a(this).e(intent0);
        this.unregisterReceiver(this.c);
        this.unregisterReceiver(this.b);
        this.stopForeground(true);
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        String s = intent0.getStringExtra("lock_message");
        if(TextUtils.isEmpty(s)) {
            this.stopSelf();
            return 2;
        }
        cqix.i.b(this, s);
        String s1 = intent0.getStringExtra("lock_phone_number");
        if(!TextUtils.isEmpty(s1)) {
            cqix.j.b(this, s1);
        }
        cqqu.d(this);
        juo juo0 = cqqu.b(this);
        juo0.D("Find Hub");
        juo0.k(s);
        juk juk0 = new juk();
        juk0.e(s);
        juo0.v(juk0);
        juo0.h = cqjk.b(cqhn.a(this, s, s1, true), this);
        juo0.m = 2;
        juo0.B = "msg";
        juo0.E = 1;
        Notification notification0 = juo0.a();
        cqqa.g(this);
        this.startForeground(76183, notification0);
        this.startActivity(cqhn.a(this, s, s1, false));
        return 3;
    }
}

