import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

public final class aiga {
    public final Context a;

    public aiga(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public final Object a(aifz aifz0) {
        Object object0;
        aigd aigd0;
        baro baro0;
        azox azox0;
        int v = 1;
        while(v <= 2) {
            long v1 = Binder.clearCallingIdentity();
            try {
                azox0 = new azox();
                baro0 = baro.b(this.a);
                if(!baro0.c("com.google.android.gms.auth.APP_CERT", azox0, "AppCertServiceClient")) {
                    throw new IOException("Could not bind to service with the given context.");
                }
            }
            catch(Throwable throwable0) {
                Binder.restoreCallingIdentity(v1);
                throw throwable0;
            }
            try {
                IBinder iBinder0 = azox0.a();
                if(iBinder0 == null) {
                    aigd0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.appcert.IAppCertService");
                    aigd0 = (iInterface0 instanceof aigd) ? ((aigd)iInterface0) : new aigb(iBinder0);
                }
                object0 = aifz0.a(aigd0);
                goto label_33;
            }
            catch(InterruptedException interruptedException0) {
            }
            catch(RemoteException remoteException0) {
                goto label_28;
            }
            catch(Throwable throwable1) {
                goto label_31;
            }
            if(v < 2) {
                try {
                    baro0.g("com.google.android.gms.auth.APP_CERT", azox0);
                }
                catch(Throwable throwable0) {
                    Binder.restoreCallingIdentity(v1);
                    throw throwable0;
                }
                Binder.restoreCallingIdentity(v1);
                ++v;
                continue;
            }
            try {
                Thread.currentThread().interrupt();
                Log.w("AppCertServiceClient", a.ab(interruptedException0, "Interrupted when getting service: "));
                throw new acse("Interrupted");
            label_28:
                Log.w("AppCertServiceClient", "RemoteException when executing call!", remoteException0);
                throw new IOException("remote exception");
            }
            catch(Throwable throwable1) {
                try {
                label_31:
                    baro0.g("com.google.android.gms.auth.APP_CERT", azox0);
                    throw throwable1;
                label_33:
                    baro0.g("com.google.android.gms.auth.APP_CERT", azox0);
                    goto label_38;
                }
                catch(Throwable throwable0) {
                }
            }
            Binder.restoreCallingIdentity(v1);
            throw throwable0;
        label_38:
            Binder.restoreCallingIdentity(v1);
            return object0;
        }
        throw new IOException("all retry attempts fail");
    }

    public final String b(String s) {
        batl.k("Calling this from your main thread can crash your app");
        batl.t(s, "Package name cannot be null!");
        aiga.c(this.a);
        return (String)this.a(new aify(this, s));
    }

    public static void c(Context context0) {
        try {
            azqk.k(context0);
        }
        catch(azqj azqj0) {
            throw new acse(azqj0);
        }
        catch(azqi azqi0) {
            throw new acse(azqi0);
        }
    }
}

