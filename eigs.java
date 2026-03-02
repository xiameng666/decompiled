import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.personalsafety.scheduler.AlarmManagerImpl.AlarmBroadcastReceiver;
import java.util.HashSet;
import java.util.Set;

public final class eigs {
    public final Context a;
    public final eicb b;
    public final Set c;
    public final AlarmManagerImpl.AlarmBroadcastReceiver d;
    public boolean e;
    private static eigs f;
    private final bbib g;
    private PendingIntent h;

    public eigs(Context context0, bbib bbib0, eicb eicb0) {
        this.c = new HashSet();
        this.d = new AlarmManagerImpl.AlarmBroadcastReceiver(this);
        this.e = false;
        this.a = context0.getApplicationContext();
        this.g = bbib0;
        this.b = eicb0;
    }

    public static eigs a(Context context0) {
        synchronized(eigs.class) {
            if(eigs.f == null) {
                eigs.f = new eigs(context0, new bbib(context0), eicb.a(context0));
            }
        }
        return eigs.f;
    }

    public final void c() {
        synchronized(this) {
            PendingIntent pendingIntent0 = this.h;
            if(pendingIntent0 == null) {
                return;
            }
            this.g.a(pendingIntent0);
            eicb eicb0 = this.b;
            long v1 = System.currentTimeMillis();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwmw.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gwmw)hftp0.b_message).c = 2;
            ((gwmw)hftp0.b_message).b |= 1;
            eicb0.d(v1, ((gwmw)hftp0.N_build()));
        }
    }

    public final void d() {
        synchronized(this) {
            try {
                this.c.clear();
                this.a.unregisterReceiver(this.d);
                this.e = false;
                this.c();
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
    }

    public final void e(long v) {
        synchronized(this) {
            this.c();
            Intent intent0 = new Intent("com.google.android.gms.personalsafety.scheduler.ACTION_SCHEDULE_TASK");
            intent0.setPackage("com.google.android.gms");
            this.h = PendingIntent.getBroadcast(this.a, 0, intent0, 0x42000000);
            this.g.j("PersonalSafetyAlarm", 0, System.currentTimeMillis() + v, this.h);
            long v2 = System.currentTimeMillis();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwmw.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gwmw)hftv0).c = 1;
            ((gwmw)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwmw gwmw0 = (gwmw)hftp0.b_message;
            gwmw0.b |= 2;
            gwmw0.d = v;
            gwmw gwmw1 = (gwmw)hftp0.N_build();
            this.b.d(v2, gwmw1);
        }
    }
}

