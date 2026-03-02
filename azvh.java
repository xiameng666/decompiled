import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

public abstract class azvh extends azxx implements DialogInterface.OnCancelListener {
    private final Handler a;
    public volatile boolean b;
    public final AtomicReference c;
    protected final azpm d;

    public azvh(azxy azxy0, azpm azpm0) {
        super(azxy0);
        this.c = new AtomicReference(null);
        this.a = new clht(Looper.getMainLooper());
        this.d = azpm0;
    }

    protected abstract void b(ConnectionResult arg1, int arg2);

    protected abstract void c();

    @Override  // azxx
    public void d() {
        this.b = true;
    }

    @Override  // azxx
    public void e() {
        this.b = false;
    }

    public final void f(ConnectionResult connectionResult0, int v) {
        azve azve0 = new azve(connectionResult0, v);
        do {
            AtomicReference atomicReference0 = this.c;
            if(atomicReference0.compareAndSet(null, azve0)) {
                azvg azvg0 = new azvg(this, azve0);
                this.a.post(azvg0);
                return;
            }
        }
        while(atomicReference0.get() == null);
    }

    public final void g(ConnectionResult connectionResult0, int v) {
        this.c.set(null);
        this.b(connectionResult0, v);
    }

    public final void h() {
        this.c.set(null);
        this.c();
    }

    @Override  // azxx
    public final void i(int v, int v1, Intent intent0) {
        int v2 = 13;
        azve azve0 = (azve)this.c.get();
    alab1:
        switch(v) {
            case 1: {
                switch(v1) {
                    case -1: {
                        this.h();
                        return;
                    }
                    case 0: {
                        if(azve0 != null) {
                            if(intent0 != null) {
                                v2 = intent0.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                            }
                            this.g(new ConnectionResult(v2, null, azve0.b.toString()), azvh.l(azve0));
                            return;
                        }
                        break alab1;
                    }
                    default: {
                        goto label_20;
                    }
                }
            }
            case 2: {
                Activity activity0 = this.o();
                int v3 = this.d.m(activity0);
                if(v3 == 0) {
                    this.h();
                    return;
                }
                if(azve0 == null || azve0.b.c == 18 && v3 == 18) {
                    return;
                }
            label_20:
                if(azve0 != null) {
                    this.g(azve0.b, azve0.a);
                }
                break;
            }
            default: {
                goto label_20;
            }
        }
    }

    @Override  // azxx
    public final void j(Bundle bundle0) {
        if(bundle0 != null) {
            azve azve0 = bundle0.getBoolean("resolving_error", false) ? new azve(new ConnectionResult(bundle0.getInt("failed_status"), ((PendingIntent)bundle0.getParcelable("failed_resolution"))), bundle0.getInt("failed_client_id", -1)) : null;
            this.c.set(azve0);
        }
    }

    @Override  // azxx
    public final void k(Bundle bundle0) {
        azve azve0 = (azve)this.c.get();
        if(azve0 == null) {
            return;
        }
        bundle0.putBoolean("resolving_error", true);
        bundle0.putInt("failed_client_id", azve0.a);
        bundle0.putInt("failed_status", azve0.b.c);
        bundle0.putParcelable("failed_resolution", azve0.b.d);
    }

    private static final int l(azve azve0) {
        return azve0 == null ? -1 : azve0.a;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.g(new ConnectionResult(13, null), azvh.l(((azve)this.c.get())));
    }
}

