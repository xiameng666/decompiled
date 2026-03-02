import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.location.quake.ealert.NotificationBlockStateChangeObserver.1;
import java.util.function.Supplier;

public final class fxky extends fxow {
    public static final int a;
    private final Context b;
    private final Supplier c;
    private BroadcastReceiver e;
    private bayn f;

    static {
        bboh.c("EAlert", bbcu.g, "NtfW");
    }

    public fxky(Context context0) {
        fxku fxku0 = new fxku(context0);
        super();
        this.b = context0;
        this.c = fxku0;
    }

    @Override  // fxow
    public final void a() {
        NotificationBlockStateChangeObserver.1 notificationBlockStateChangeObserver$10 = new NotificationBlockStateChangeObserver.1(this);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.app.action.APP_BLOCK_STATE_CHANGED");
        intentFilter0.addAction("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED");
        intentFilter0.addAction("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED");
        jwe.b(this.b, notificationBlockStateChangeObserver$10, intentFilter0, 4);
        this.e = notificationBlockStateChangeObserver$10;
        if(this.f == null) {
            this.f = (bayn)this.c.get();
        }
    }

    @Override  // fxow
    public final void b() {
        BroadcastReceiver broadcastReceiver0 = this.e;
        if(broadcastReceiver0 != null) {
            this.b.unregisterReceiver(broadcastReceiver0);
        }
    }

    public static gwlt c(fxkw fxkw0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwlt.a).v_newBuilder();
        int v = fxky.f(fxkw0.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwlt)hftv0).c = v - 1;
        ((gwlt)hftv0).b |= 1;
        int v1 = fxky.f(fxkw0.c);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwlt)hftv1).d = v1 - 1;
        ((gwlt)hftv1).b |= 2;
        int v2 = fxky.f(fxkw0.d);
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gwlt)hftv2).e = v2 - 1;
        ((gwlt)hftv2).b |= 4;
        int v3 = fxky.f(fxkw0.e);
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gwlt)hftv3).g = v3 - 1;
        ((gwlt)hftv3).b |= 16;
        int v4 = fxky.f(fxkw0.f);
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwlt)hftp0.b_message).f = v4 - 1;
        ((gwlt)hftp0.b_message).b |= 8;
        return (gwlt)hftp0.N_build();
    }

    private final int e(String s) {
        NotificationChannel notificationChannel0 = this.f.c(s);
        if(notificationChannel0 == null) {
            return 1;
        }
        return notificationChannel0.getImportance() == 0 ? 3 : 2;
    }

    private static int f(int v) {
        if(v != 1) {
            switch(v) {
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                default: {
                    return 1;
                }
            }
        }
        return 2;
    }

    @Override  // fxow
    public final Object get() {
        fxkv fxkv0 = new fxkv();
        int v = this.e("eew_alert_v2");
        fxkv0.e = v;
        fxkv0.f = (byte)(fxkv0.f | 0x20);
        int v1 = this.e("eew_notification_v2");
        fxkv0.d = v1;
        fxkv0.f = (byte)(fxkv0.f | 16);
        int v2 = this.e("eew_update");
        fxkv0.c = v2;
        fxkv0.f = (byte)(fxkv0.f | 8);
        NotificationChannelGroup notificationChannelGroup0 = this.f.d("Personal_Safety_Id");
        int v3 = 0;
        int v4 = 3;
        if(v2 == 3) {
            v3 = 1;
        }
        int v5 = (v == 3 ? 1 : 0) | (v1 == 3 ? 1 : 0) | v3;
        if(notificationChannelGroup0 == null) {
            fxkv0.a(1);
        }
        else {
            notificationChannelGroup0.isBlocked();
            fxkv0.a((notificationChannelGroup0.isBlocked() ? 3 : 2));
            v5 |= notificationChannelGroup0.isBlocked();
        }
        this.f.z();
        if(this.f.z()) {
            v4 = 2;
        }
        fxkv0.a = v4;
        fxkv0.f = (byte)(fxkv0.f | 2);
        int v6 = this.f.z() ^ 1;
        int v7 = fxkv0.f | 1;
        fxkv0.f = (byte)v7;
        if(v7 != 0x3F) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((fxkv0.f & 1) == 0) {
                stringBuilder0.append(" hasBlocks");
            }
            if((fxkv0.f & 2) == 0) {
                stringBuilder0.append(" applicationState");
            }
            if((fxkv0.f & 4) == 0) {
                stringBuilder0.append(" channelGroupState");
            }
            if((fxkv0.f & 8) == 0) {
                stringBuilder0.append(" lowImportanceState");
            }
            if((fxkv0.f & 16) == 0) {
                stringBuilder0.append(" mediumImportanceState");
            }
            if((fxkv0.f & 0x20) == 0) {
                stringBuilder0.append(" highImportanceState");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new fxkw(((boolean)(v5 | v6)), fxkv0.a, fxkv0.b, fxkv0.c, fxkv0.d, fxkv0.e);
    }
}

