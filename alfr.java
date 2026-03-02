import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class alfr extends cjtm {
    private static final bboh a;
    private static final long b;
    private final alid c;
    private final String d;
    private final ajes e;
    private final boolean f;

    static {
        alfr.a = alis.a("GetMySyncedMetadata");
        alfr.b = TimeUnit.SECONDS.toMillis(5L);
    }

    public alfr(alid alid0, String s, boolean z, azug azug0) {
        ajes ajes0 = new ajes(AppContextProvider.a());
        super(0x8E, "GetMySyncedMetadata", azug0);
        this.c = alid0;
        this.d = s;
        this.e = ajes0;
        this.f = z;
    }

    public static SyncedCryptauthDevice b(Context context0, String s) {
        return alfr.c(context0, s, false);
    }

    public static SyncedCryptauthDevice c(Context context0, String s, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        alfr alfr0 = new alfr(new alfq(arrayList0), s, z, null);
        try {
            alfr0.f(context0);
            return arrayList0.isEmpty() ? null : ((SyncedCryptauthDevice)arrayList0.get(0));
        }
        catch(cjuh | RemoteException exception0) {
            a.ae(alfr.a.j(), "Failed to fetch synced metadata.", exception0);
            return null;
        }
    }

    private final SyncedCryptauthDevice d(Context context0) {
        try(alvp alvp0 = alvq.a(context0)) {
            String s = this.d;
            Account account0 = new Account(s, "com.google");
            if(alvp0.e(account0)) {
                alhh alhh0 = alvp0.a(account0);
                if(alhh0 != null) {
                    new aliu().A(0);
                    return akwd.b(alhh0, s);
                }
                new aliu().A(1);
                throw new cjuh(8, "No metadata for account");
            }
            new aliu().A(6);
            throw new cjuh(13, "Initial sync not done");
        }
    }

    private final void e(Context context0) {
        aliu aliu0 = new aliu();
        Account account0 = new Account(this.d, "com.google");
        try {
            ajdo ajdo0 = new ajdo(this.e, account0);
            evql evql0 = this.e.iG(ajdo0);
            evrg.o(evql0, alfr.b, TimeUnit.MILLISECONDS);
            List list0 = (List)evql0.j();
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            if((exception0 instanceof ExecutionException)) {
                aliu0.A(8);
            }
            else if((exception0 instanceof InterruptedException)) {
                aliu0.A(9);
            }
            else {
                aliu0.A(10);
            }
            throw new cjuh(8, exception0.getMessage());
        }
        aliu0.A(7);
        if(list0 != null) {
            for(Object object0: list0) {
                DeviceMetadata deviceMetadata0 = (DeviceMetadata)object0;
                String s = bzoe.h(context0).b();
                if(deviceMetadata0.b.equals(s)) {
                    aliu0.z(0);
                    SyncedCryptauthDevice syncedCryptauthDevice0 = akwd.a(deviceMetadata0);
                    this.c.a(Status.b, syncedCryptauthDevice0);
                    return;
                }
            }
        }
        if(!hpyz.e()) {
            this.c.a(Status.b, null);
            return;
        }
        aliu0.z(1);
        SyncedCryptauthDevice syncedCryptauthDevice1 = this.d(context0);
        this.c.a(Status.b, syncedCryptauthDevice1);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(hpyz.i() && !this.f) {
            this.e(context0);
            return;
        }
        gftb.checkTrue(((boolean)(hpyz.g() ^ 1)));
        SyncedCryptauthDevice syncedCryptauthDevice0 = this.d(context0);
        this.c.a(Status.b, syncedCryptauthDevice0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null);
    }
}

