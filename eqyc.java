import android.app.NotificationChannel;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService;
import j..util.Objects;

public final class eqyc extends clht {
    final SourceQuickStartChimeraService a;

    public eqyc(SourceQuickStartChimeraService sourceQuickStartChimeraService0, Looper looper0) {
        Objects.requireNonNull(sourceQuickStartChimeraService0);
        this.a = sourceQuickStartChimeraService0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(message0.what) {
            case 4000: {
                SourceQuickStartChimeraService sourceQuickStartChimeraService0 = this.a;
                String s = sourceQuickStartChimeraService0.j;
                if(s != null) {
                    ConnectionRequest connectionRequest0 = new ConnectionRequest(null, null, s, null, sourceQuickStartChimeraService0.e.p, 0, true, true, sourceQuickStartChimeraService0.e.L, 0, sourceQuickStartChimeraService0.e.F);
                    eqwl eqwl0 = sourceQuickStartChimeraService0.k;
                    if(eqwl0 != null) {
                        eqwi eqwi0 = sourceQuickStartChimeraService0.i;
                        if(eqwi0 != null) {
                            try {
                                eqwl0.b(connectionRequest0, eqwi0);
                                return;
                            }
                            catch(RemoteException remoteException0) {
                                SourceQuickStartChimeraService.a.l(remoteException0);
                            }
                        }
                    }
                }
                return;
            }
            case 4001: {
                this.a.getContainerService().stopForeground(1);
                return;
            }
            case 4002: {
                SourceQuickStartChimeraService sourceQuickStartChimeraService1 = this.a;
                bayn bayn0 = sourceQuickStartChimeraService1.b;
                if(bayn0 != null && bayn0.c("smartdevice_quickstart_channel_id") == null) {
                    bayn0.p(new NotificationChannel("smartdevice_quickstart_channel_id", "Device setup", 2));
                }
                juo juo0 = new juo(sourceQuickStartChimeraService1, "smartdevice_quickstart_channel_id");
                juo0.s(avyq.a(sourceQuickStartChimeraService1, 0x7F080D3E));
                juo0.D("Device setup in progress");
                juo0.k("Tap to resume");
                Intent intent0 = new Intent();
                intent0.setClassName(sourceQuickStartChimeraService1, "com.google.android.gms.smartdevice.quickstart.ui.SourceQuickStartActivity");
                intent0.addFlags(0x14000000);
                intent0.putExtra("foreground_trigger", true);
                intent0.putExtra("launch_state", 302);
                juo0.h = cjok.a(sourceQuickStartChimeraService1, 0, intent0, 0xA000000);
                sourceQuickStartChimeraService1.startForeground(0x7B, juo0.a());
                return;
            }
            default: {
                SourceQuickStartChimeraService.a.m(a.aG(message0, "Invalid handler message: "), new Object[0]);
            }
        }
    }
}

