import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aile {
    public final aiig a;
    public final aikd b;
    public static final baun c;
    azts d;
    private final Context e;
    private final bbic f;

    static {
        aile.c = new baun(new String[]{"TransactionMessageBuilder"});
    }

    public aile(Context context0) {
        aiig aiig0 = new aiig(context0);
        aikd aikd0 = new aikd(context0);
        bbic bbic0 = bbic.a();
        super();
        this.e = context0;
        this.a = aiig0;
        this.b = aikd0;
        this.f = bbic0;
    }

    public final void a(ProtoLiteBuilder hftp0) {
        long v5;
        long v;
        boolean z;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if((((hhsk)hftv0).b & 0x40) == 0) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhsk hhsk0 = (hhsk)hftp0.b_message;
            hhsk0.b |= 0x40;
            hhsk0.i = false;
        }
        ajpf ajpf0 = null;
        if(this.d == null) {
            this.d = new azts(this.e, null);
        }
        if(azts.ci(this.e)) {
            try {
                evql evql0 = this.d.cg();
                evrg.o(evql0, 5L, TimeUnit.SECONDS);
                ezco ezco0 = (ezco)evql0.j();
                z = ezco0.c;
                v = ezco0.d;
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                z = false;
                aile.c.g("TrustAgentState not returned successfully", exception0, new Object[0]);
                v = -1L;
            }
        }
        else {
            z = false;
            v = -1L;
        }
        if(v > -1L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhsk hhsk1 = (hhsk)hftp0.b_message;
            hhsk1.b |= 8;
            hhsk1.f = v;
        }
        azox azox0 = new azox();
        Intent intent0 = new Intent().setClassName(this.e, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService");
        if(this.f.d(this.e, intent0, azox0, 1)) {
            try {
                IBinder iBinder0 = azox0.a();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                    ajpf0 = (iInterface0 instanceof ajpf) ? ((ajpf)iInterface0) : new ajpd(iBinder0);
                }
                long v2 = ajpf0.b();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhsk hhsk2 = (hhsk)hftp0.b_message;
                hhsk2.b |= 4;
                hhsk2.e = v2;
                long v3 = 0L;
                if(!z) {
                    long v4 = ajpf0.a();
                    if(v4 > 0L) {
                        v5 = SystemClock.elapsedRealtime();
                    }
                    else {
                        aile.c.f(a.u(v4, "Unexpected value for IDeviceSignalsService.getLastSecureUnlockTime(): "), new Object[0]);
                        v5 = 2592000000L;
                    }
                    v3 = v5 - v4;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((hhsk)hftv1).b |= 16;
                ((hhsk)hftv1).g = v3;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hhsk hhsk3 = (hhsk)hftp0.b_message;
                hhsk3.b |= 0x20;
                hhsk3.h = v3;
            }
            catch(InterruptedException | RemoteException unused_ex) {
                aile.c.f("Bind to DeviceSignalsService interrupted", new Object[0]);
                return;
            }
            finally {
                this.f.b(this.e, azox0);
            }
            return;
        }
        aile.c.f("Failed to bind to DeviceSignalsService", new Object[0]);
    }
}

