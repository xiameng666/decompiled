import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.TargetDeviceInfo;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakeOptionFlags;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakePayload;
import com.google.android.gms.smartdevice.quickstart.RestoreAnytimeContext;
import com.google.android.gms.smartdevice.quickstart.TargetQuickStartChimeraService;
import java.util.ArrayList;

public final class eqzj implements eqmj {
    public final eqzp a;
    private static final erqc b;
    private final eqwu c;
    private final eray d;

    static {
        eqzj.b = new erqc(new String[]{"TargetQuickStartConnectionCallbacks"});
    }

    public eqzj(eqwu eqwu0, eqzp eqzp0, eray eray0) {
        this.c = eqwu0;
        this.a = eqzp0;
        this.d = eray0;
    }

    @Override  // eqmj
    public final void a(epyj epyj0, TargetConnectionArgs targetConnectionArgs0) {
        baun baun0 = eqzp.f;
        baun0.d("Connected to source device and received deviceMessageSender", new Object[0]);
        eqzp eqzp0 = this.a;
        eqzp0.j = epyj0;
        eqzp0.z();
        int v1 = eqzp0.t;
        if(v1 == 1000) {
            eqzp0.t = 1001;
            eqzp0.k.o(gjjm.i);
        }
        else if(v1 == 1002) {
            eqzp0.t = 1003;
            eqzp0.k.o(gjjm.G);
        }
        if(eqzp0.t == 1001) {
            baun0.h("Initiate handshake.", new Object[0]);
            Context context0 = eqzp0.g;
            int v2 = erei.b(context0, eqzp0.r);
            String s = Build.MODEL;
            byte b = eqsh.a(context0);
            int v3 = eqxk.a(context0);
            int v4 = azqk.a(context0);
            String s1 = eqzp0.s;
            TargetDeviceInfo targetDeviceInfo0 = new TargetDeviceInfo();
            targetDeviceInfo0.b = s;
            Integer integer0 = (int)1;
            targetDeviceInfo0.a.add(integer0);
            targetDeviceInfo0.c = b;
            Integer integer1 = (int)2;
            targetDeviceInfo0.a.add(integer1);
            targetDeviceInfo0.d = v2;
            targetDeviceInfo0.a.add(Integer.valueOf(3));
            targetDeviceInfo0.e = v3;
            targetDeviceInfo0.a.add(Integer.valueOf(4));
            targetDeviceInfo0.f = v4;
            targetDeviceInfo0.a.add(Integer.valueOf(5));
            targetDeviceInfo0.g = s1;
            targetDeviceInfo0.a.add(Integer.valueOf(6));
            QuickStartHandshakePayload quickStartHandshakePayload0 = new QuickStartHandshakePayload();
            quickStartHandshakePayload0.b = eqzp0.l;
            quickStartHandshakePayload0.a.add(integer0);
            quickStartHandshakePayload0.c = targetDeviceInfo0;
            quickStartHandshakePayload0.a.add(integer1);
            QuickStartHandshakeOptionFlags quickStartHandshakeOptionFlags0 = new QuickStartHandshakeOptionFlags();
            if(v2 != 0) {
                quickStartHandshakeOptionFlags0.r(3);
                quickStartHandshakeOptionFlags0.r(4);
            }
            quickStartHandshakePayload0.p(quickStartHandshakeOptionFlags0);
            if(eqzp0.p != null) {
                eqln eqln0 = new eqln(context0, eqzp0.c);
                eqlf eqlf0 = new eqlf(context0);
                Account[] arr_account = cchj.b(context0).p("com.google");
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < arr_account.length; ++v) {
                    Account account0 = arr_account[v];
                    BootstrapAccount bootstrapAccount0 = BootstrapAccount.p(account0);
                    boolean z = eqlf0.c(account0);
                    bootstrapAccount0.s(z);
                    bootstrapAccount0.t(bbmn.w(context0, account0.name));
                    if(!z || eqsh.t(context0, account0)) {
                        arrayList0.add(bootstrapAccount0);
                    }
                }
                RestoreAnytimeContext restoreAnytimeContext0 = eqzp0.p;
                if(restoreAnytimeContext0 != null) {
                    restoreAnytimeContext0.g = eqln0.f() - 1;
                    restoreAnytimeContext0.a.add(Integer.valueOf(6));
                    eqzp0.p.e = arrayList0;
                    eqzp0.p.a.add(Integer.valueOf(4));
                    quickStartHandshakePayload0.q(eqzp0.p);
                }
            }
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.ak(quickStartHandshakePayload0);
            eqzp0.n(messagePayload0);
        }
        try {
            this.c.c();
        }
        catch(RemoteException remoteException0) {
            eqzj.b.l(remoteException0);
        }
    }

    @Override  // eqmj
    public final void b(byte[] arr_b) {
        this.a.f(arr_b);
    }

    @Override  // eqmj
    public final void c() {
        eqzp eqzp0 = this.a;
        eqzp0.k.o(gjjm.ad);
        eqzp0.z();
        if(eqzp0.o) {
            TargetQuickStartChimeraService.g(eqzp0.g);
        }
        else {
            eqzp.f.d("Connection lost on state: %d", new Object[]{((int)eqzp0.t)});
            int v = eqzp0.t;
            if(v == 1001) {
                eqzp0.t = 1004;
            }
            else if(v == 1003) {
                eqzp0.t = 1005;
            }
            eqzp0.A();
        }
        try {
            this.c.d();
        }
        catch(RemoteException remoteException0) {
            eqzj.b.l(remoteException0);
        }
    }

    @Override  // eqmj
    public final void d(int v, eqoc eqoc0) {
        this.d.n(v, eqoc0);
        try {
            Bundle bundle0 = erei.c(eqoc0);
            this.c.e(v, bundle0);
        }
        catch(RemoteException remoteException0) {
            eqzj.b.l(remoteException0);
        }
    }

    @Override  // eqmj
    public final void e(VerificationInfo verificationInfo0) {
        try {
            this.c.g(verificationInfo0);
        }
        catch(RemoteException remoteException0) {
            eqzj.b.l(remoteException0);
        }
    }
}

