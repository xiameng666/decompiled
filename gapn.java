import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class gapn extends wby implements gapo {
    final gamw a;
    gbkj b;
    private final gamy c;

    public gapn() {
        super("com.google.android.wallet.bender3.framework.actions.IActionExecutorService");
    }

    public gapn(gamy gamy0, Context context0) {
        super("com.google.android.wallet.bender3.framework.actions.IActionExecutorService");
        this.c = gamy0;
        this.a = new gamw();
        this.b = Bender3Database.m.a(context0, gblx.a).u();
    }

    @Override  // gapo
    public final Intent a(Intent intent0) {
        if(Binder.getCallingUid() == Process.myUid()) {
            gano gano0 = gapn.e(this.c, intent0);
            return this.c.a(gano0).a;
        }
        return ganp.e(3);
    }

    @Override  // gapo
    public final void b(Intent intent0, String s, gapl gapl0) {
        if(Binder.getCallingUid() == Process.myUid()) {
            gamy gamy0 = this.c;
            gano gano0 = gapn.e(gamy0, intent0);
            gamw gamw0 = this.a;
            int v = gano0.a();
            ibuq.f(s, "uniqueId");
            ibuq.f(gapl0, "callback");
            if(v == -1) {
                v = 300000;
            }
            gamw0.a.put(s, new gamv(gapl0, System.currentTimeMillis() + ((long)v)));
            ganp ganp0 = gamy0.a(gano0);
            try {
                this.f(ganp0, s, gano0.f());
            }
            catch(ExecutionException | InterruptedException unused_ex) {
                gapn.g(gapl0);
            }
            return;
        }
        gapn.g(gapl0);
    }

    @Override  // gapo
    public final void c(String s, String s1, gapl gapl0) {
        boolean z;
        Intent intent0;
        int v;
        if(Binder.getCallingUid() == Process.myUid()) {
            ibuq.f(s1, "uniqueId");
            ibuq.f(gapl0, "callback");
            gamv gamv0 = (gamv)this.a.a.get(s1);
            if(gamv0 == null) {
                v = 3;
            }
            else if(gamv0.a <= System.currentTimeMillis()) {
                v = 2;
            }
            else {
                ibuq.f(gapl0, "iActionCallback");
                synchronized(gamv0.b) {
                    z = gamv0.b.add(gapl0);
                }
                v = z ? 1 : 4;
            }
            ganp ganp0 = this.d(s, s1);
            if(ganp0 == null) {
                switch(v - 1) {
                    case 0: {
                        intent0 = null;
                        break;
                    }
                    case 1: {
                        intent0 = ganp.d(1);
                        break;
                    }
                    case 2: {
                        intent0 = ganp.d(2);
                        break;
                    }
                    default: {
                        intent0 = ganp.l(new IllegalStateException("BE_AESI_01: Fail to add the callback in the callback list.")).a;
                    }
                }
            }
            else {
                intent0 = ganp0.a;
            }
        }
        else {
            intent0 = ganp.d(2);
        }
        if(intent0 != null) {
            try {
                gapl0.a(intent0);
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    private final ganp d(String s, String s1) {
        synchronized(this) {
            if(gcvm.a(s)) {
                gbks gbks0 = (gbks)oqj.b(((gbkr)this.b).a, true, false, new gbkn(s, s1));
                if(gbks0 != null) {
                    Bundle bundle0 = gbfm.a(gbks0).d;
                    if(bundle0 != null) {
                        return ganp.g(bundle0);
                    }
                }
            }
        }
        return null;
    }

    private static gano e(gamy gamy0, Intent intent0) {
        intent0.setExtrasClassLoader(gamy0.getClass().getClassLoader());
        return new gano(intent0);
    }

    private final void f(ganp ganp0, String s, WidgetConfig widgetConfig0) {
        synchronized(this) {
            ibuq.f(s, "uniqueId");
            Intent intent0 = ganp0.a;
            ibuq.f(intent0, "actionResponseIntent");
            gamv gamv0 = (gamv)this.a.a.remove(s);
            List list0 = gamv0 == null ? null : gamv0.b;
            if(list0 == null) {
                list0 = ibps.a;
            }
            for(Object object0: list0) {
                gapl gapl0 = (gapl)object0;
                try {
                    gapl0.a(intent0);
                }
                catch(RemoteException unused_ex) {
                }
            }
            String s1 = widgetConfig0.A;
            gaxl.a();
            if(hzkv.c()) {
                gbkj gbkj0 = this.b;
                Bundle bundle0 = new Bundle();
                bundle0.putParcelable("extraActionResponseIntent", ganp0.a);
                byte[] arr_b = gcur.c(bundle0);
                icck icck0 = iccl.b(gblw.a);
                ibuq.f(gbkj0, "<this>");
                ibuq.f(s1, "sessionId");
                ibuq.f(s, "actionId");
                ibuq.f(arr_b, "actionResponse");
                ibom ibom0 = (ibom)icpu.e(icck0, new gbky(gbkj0, s1, s, arr_b, null)).get();
            }
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        gapl gapl0 = null;
        if(v != 1) {
            switch(v) {
                case 2: {
                    Intent intent0 = (Intent)wbz.a(parcel0, Intent.CREATOR);
                    String s = parcel0.readString();
                    IBinder iBinder0 = parcel0.readStrongBinder();
                    if(iBinder0 != null) {
                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.wallet.bender3.framework.actions.IActionCallbacks");
                        gapl0 = (iInterface0 instanceof gapl) ? ((gapl)iInterface0) : new gapj(iBinder0);
                    }
                    gapn.gr(parcel0);
                    this.b(intent0, s, gapl0);
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    String s1 = parcel0.readString();
                    String s2 = parcel0.readString();
                    IBinder iBinder1 = parcel0.readStrongBinder();
                    if(iBinder1 != null) {
                        IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.wallet.bender3.framework.actions.IActionCallbacks");
                        gapl0 = (iInterface1 instanceof gapl) ? ((gapl)iInterface1) : new gapj(iBinder1);
                    }
                    gapn.gr(parcel0);
                    this.c(s1, s2, gapl0);
                    parcel1.writeNoException();
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        Intent intent1 = (Intent)wbz.a(parcel0, Intent.CREATOR);
        gapn.gr(parcel0);
        Intent intent2 = this.a(intent1);
        parcel1.writeNoException();
        wbz.g(parcel1, intent2);
        return true;
    }

    private static void g(gapl gapl0) {
        Intent intent0 = ganp.e(3);
        try {
            gapl0.a(intent0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

