import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class bqqd {
    static {
        brrv.a();
    }

    public static Object a(Context context0, bqqc bqqc0) {
        Object object0;
        bbhc bbhc0;
        azox azox0 = new azox();
        Intent intent0 = bbmq.i("com.google.android.gms.common.service.START_ACCOUNT_SERVICE");
        bbic.a().d(context0, intent0, azox0, 1);
        try {
            IBinder iBinder0 = azox0.a();
            if(iBinder0 == null) {
                bbhc0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.service.IAccountService");
                bbhc0 = (iInterface0 instanceof bbhc) ? ((bbhc)iInterface0) : new bbha(iBinder0);
            }
            object0 = bqqc0.a(bbhc0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new bqqh(interruptedException0);
        }
        catch(RemoteException remoteException0) {
            throw new bqqh(remoteException0);
        }
        finally {
            bbic.a().b(context0, azox0);
        }
        return object0;
    }
}

