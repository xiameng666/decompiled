import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import j..util.Objects;

final class aiak {
    final aian a;

    public aiak(aian aian0) {
        Objects.requireNonNull(aian0);
        this.a = aian0;
        super();
    }

    public final long a(long v) {
        long v4;
        long v1 = System.currentTimeMillis() + v;
        aian aian0 = this.a;
        Context context0 = (Context)aian0.c.get();
        if(context0 == null) {
            return v1;
        }
        Intent intent0 = new Intent("com.google.android.gms.auth.api.phone.action.ON_ALARM").setPackage("com.google.android.gms");
        synchronized(aiam.class) {
            int v3 = aian0.e;
            aian0.e = v3 + 1;
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, v3, intent0, 0x2000000);
            v4 = System.currentTimeMillis() + v;
            new bbib(context0).d("SmsRetrieverCore", 1, v4, pendingIntent0, null);
        }
        if(hppk.f()) {
            aian.a.h("Set new Alarm. Expecting trigger at: %d", new Object[]{v4});
            return v4;
        }
        aian.a.d("componentHelper.setAlarm. Expecting trigger at: %d", new Object[]{v4});
        return v4;
    }

    public final Context b() {
        return (Context)this.a.c.get();
    }

    public final void c(Intent intent0) {
        Context context0 = (Context)this.a.c.get();
        if(context0 != null) {
            context0.sendBroadcast(intent0);
        }
    }

    public final void d(aicq aicq0) {
        synchronized(aiam.class) {
            aian aian0 = this.a;
            Context context0 = (Context)aian0.c.get();
            if(context0 != null) {
                aicr aicr0 = aian0.b;
                if(aicr0 != null) {
                    aicr0.k(context0, aicq0);
                }
            }
        }
    }
}

