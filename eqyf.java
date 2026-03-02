import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService;
import java.util.ArrayList;
import java.util.List;

public final class eqyf implements eqmj {
    public eqwi a;
    public final erav b;
    public final eraw c;
    private static final erqc d;
    private final eqyw e;

    static {
        eqyf.d = new erqc(new String[]{"SourceQuickStartConnectionCallbacks"});
    }

    public eqyf(eqwi eqwi0, eqyw eqyw0) {
        this.a = eqwi0;
        this.e = eqyw0;
        this.b = eqyw0.j;
        this.c = eraw.f();
    }

    @Override  // eqmj
    public final void a(epyj epyj0, TargetConnectionArgs targetConnectionArgs0) {
        this.b.e(gjkj.r);
        this.c.b(7);
        baun baun0 = eqyw.f;
        baun0.d("Connected to target device and received deviceMessageSender", new Object[0]);
        eqyw eqyw0 = this.e;
        eqyw0.i = epyj0;
        int v1 = eqyw0.B;
        if(v1 == 1000) {
            eqyw0.B = 1001;
        }
        else if(v1 == 1002) {
            eqyw0.B = 1003;
        }
        if(targetConnectionArgs0 != null && targetConnectionArgs0.g <= 0) {
            baun0.d("Determine UserVerificationMethod", new Object[0]);
            targetConnectionArgs0.d = eqyw0.p(targetConnectionArgs0.e, true);
            targetConnectionArgs0.a.add(Integer.valueOf(4));
        }
        try {
            eqyw0.h.c(targetConnectionArgs0);
        }
        catch(RemoteException remoteException0) {
            eqyw.f.l(remoteException0);
        }
        if(targetConnectionArgs0 != null) {
            eqyw0.F = targetConnectionArgs0.f;
            eqyw.f.d("Target device type is %d", new Object[]{((int)targetConnectionArgs0.f)});
        }
        if(eqyw0.F == 3) {
            eqyw0.m = eqyw0.l.c();
        }
        if(hyit.c() && eqyw0.B == 1001) {
            List list0 = eqyw0.o;
            list0.clear();
            ArrayList arrayList0 = eqyw.q(eqyw0.I);
            for(int v = 0; ((long)v) < Math.min(arrayList0.size(), hyit.a.b().b()); ++v) {
                String s = ((BootstrapAccount)arrayList0.get(v)).b;
                list0.add(eqyw0.l.g(s, 0x20));
            }
        }
    }

    @Override  // eqmj
    public final void b(byte[] arr_b) {
        this.e.f(arr_b);
    }

    @Override  // eqmj
    public final void c() {
        eqyw eqyw0 = this.e;
        baun baun0 = eqyw.f;
        baun0.d("OnDisconnected() at connection status: %d", new Object[]{((int)eqyw0.B)});
        eqyw0.j.e(gjkj.R);
        int v = eqyw0.B;
        boolean z = false;
        if(v == 1000) {
            SourceQuickStartChimeraService.e(eqyw0.g);
        }
        else {
            switch(v) {
                case 1001: {
                    if((eqyw0.L && eqyw0.F == 7 || eqyw0.F != 3 && eqyw0.F != 7) && eqyw0.p != null) {
                        eqyw0.c.sendEmptyMessage(4000);
                        z = true;
                    }
                    else {
                        eqyw0.c.sendEmptyMessage(4001);
                        SourceQuickStartChimeraService.e(eqyw0.g);
                    }
                    break;
                }
                case 1003: {
                    if(eqyw0.C.getAndSet(false)) {
                        eqsl eqsl0 = eqyw0.E;
                        if(eqsl0 != null) {
                            eqsl0.b();
                        }
                        eqyw0.w(eqyw0.q);
                    }
                    eqyw0.c.sendEmptyMessage(4001);
                    SourceQuickStartChimeraService.e(eqyw0.g);
                    break;
                }
                default: {
                    baun0.m("Unexpected onDisconnect connection status: %d", new Object[]{v});
                }
            }
        }
        try {
            eqyw0.h.d(z);
        }
        catch(RemoteException remoteException0) {
            eqyw.f.l(remoteException0);
        }
        this.c.b(8);
    }

    @Override  // eqmj
    public final void d(int v, eqoc eqoc0) {
        this.c.a(v, eqoc0);
        eqyw.f.h("Connection failed with %d", new Object[]{v});
        eqyw eqyw0 = this.e;
        eqyw0.j.g(v, eqoc0);
        if(eqyw0.B != 1003) {
            eqyw0.c.sendEmptyMessage(4001);
            SourceQuickStartChimeraService.e(eqyw0.g);
        }
        try {
            eqyw0.h.e(v);
        }
        catch(RemoteException remoteException0) {
            eqyw.f.l(remoteException0);
        }
    }

    @Override  // eqmj
    public final void e(VerificationInfo verificationInfo0) {
        try {
            this.a.g(verificationInfo0);
        }
        catch(RemoteException remoteException0) {
            eqyf.d.l(remoteException0);
        }
    }

    public final void f() {
        this.c.b(6);
    }
}

