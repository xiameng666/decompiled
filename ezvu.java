import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.IOException;
import java.util.ArrayList;

public final class ezvu extends ezui implements cjug {
    private static final baun a;
    private final String b;
    private final String c;
    private final ezxs d;
    private final cjts e;
    private final ezxi f;
    private final Context g;
    private final ezyg h;

    static {
        ezvu.a = fabk.a("SystemUpdateApiStub");
    }

    public ezvu(Context context0, cjts cjts0, String s, String s1) {
        this.b = s;
        this.c = s1;
        this.d = (ezxs)ezxs.l.b();
        this.f = (ezxi)ezxi.b.b();
        this.h = (ezyg)ezyg.a.b();
        this.g = context0;
        this.e = cjts0;
    }

    @Override  // ezuj
    public final long a(ApiMetadata apiMetadata0) {
        long v1;
        avss avss0;
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("getLastConfigUpdateTime()", new Object[0]);
        if(hvxz.c()) {
            return (long)(((Long)this.f.c.b(ezxi.a)));
        }
        try {
            Context context0 = this.g;
            batl.k("Calling this from your main thread can lead to deadlock.");
            azox azox0 = avqz.a(context0);
            try {
                IBinder iBinder0 = azox0.a();
                if(iBinder0 == null) {
                    avss0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.checkin.internal.ICheckinService");
                    avss0 = (iInterface0 instanceof avss) ? ((avss)iInterface0) : new avsq(iBinder0);
                }
                v1 = avss0.a();
            }
            catch(RemoteException remoteException0) {
                Log.i("CheckinServiceClient", "GMS remote exception: ", remoteException0);
                throw new IOException("Remote exception.");
            }
            catch(InterruptedException unused_ex) {
                throw new IOException("Interrupted exception.");
            }
            finally {
                try {
                    bbic.a().b(context0, azox0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.i("CheckinServiceClient", "unbind failed: ", illegalArgumentException0);
                }
            }
            return v1;
        }
        catch(IOException | azqi | azqj exception0) {
            ezvu.a.g("Error when getting last successful checkin time.", exception0, new Object[0]);
            return -1L;
        }
    }

    @Override  // ezuj
    public final SystemUpdateStatus b(ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("getSystemUpdateStatus()", new Object[0]);
        return this.d.b();
    }

    @Override  // ezuj
    public final void c(DownloadOptions downloadOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("approveDownload(%s)", new Object[]{downloadOptions0});
        this.d.d(downloadOptions0);
    }

    @Override  // ezuj
    public final void d(InstallationOptions installationOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("approveReboot(%s)", new Object[]{installationOptions0});
        this.d.e(installationOptions0);
    }

    @Override  // ezuj
    public final void e(InstallationOptions installationOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("autoApproveReboot(%s)", new Object[]{installationOptions0});
        ArrayList arrayList0 = new ArrayList();
        Long long0 = ((ezxl)ezxl.h.b()).b();
        arrayList0.add(new fagh(ezxs.d, long0));
        arrayList0.add(new fagh(ezxs.e, Boolean.valueOf(false)));
        arrayList0.addAll(this.d.c(installationOptions0));
        this.d.n.d(arrayList0);
        this.d.o.a(105);
    }

    @Override  // ezuj
    public final void f(azxs azxs0, ConfigUpdateOptions configUpdateOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("checkForConfigUpdate(%s)", new Object[]{configUpdateOptions0});
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.b);
        azuf0.e(bbdp.dN);
        azuf0.g(bbdq.p);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ezvv ezvv0 = new ezvv(azxs0, configUpdateOptions0, azuf0.a());
        this.e.b(ezvv0);
    }

    @Override  // ezuj
    public final void g(ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("pauseAbInstallation()", new Object[0]);
        this.d.l();
    }

    @Override  // ezuj
    public final void h(ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("pauseDownload()", new Object[0]);
        this.d.m();
    }

    @Override  // ezuj
    public final void i(ezup ezup0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("registerSystemUpdateCallback()", new Object[0]);
        synchronized(this.h.c) {
            IBinder iBinder0 = ezup0.asBinder();
            this.h.d.put(iBinder0, ezup0);
        }
    }

    @Override  // ezuj
    public final void j(ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("resetStatus()", new Object[0]);
        this.d.n();
    }

    @Override  // ezuj
    public final void k(InstallationOptions installationOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("resumeAbInstallation(%s)", new Object[]{installationOptions0});
        this.d.q(installationOptions0);
    }

    @Override  // ezuj
    public final void l(DownloadOptions downloadOptions0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("resumeDownload(%s)", new Object[]{downloadOptions0});
        this.d.s(downloadOptions0);
    }

    @Override  // ezuj
    public final void m(ActivityStatus activityStatus0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nT);
        ezvu.a.j("setActivityStatus(%s)", new Object[]{activityStatus0});
        this.d.t(activityStatus0);
    }

    @Override  // ezuj
    public final void n(ezup ezup0, ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("unregisterUpdateStatusCallback()", new Object[0]);
        synchronized(this.h.c) {
            IBinder iBinder0 = ezup0.asBinder();
            this.h.d.remove(iBinder0);
        }
    }

    @Override  // ezuj
    public final boolean o(ApiMetadata apiMetadata0) {
        ccmq.a().a(bbdg.nS);
        ezvu.a.j("approveRebootTonight()", new Object[0]);
        try {
            this.d.g(true);
            return true;
        }
        catch(IOException iOException0) {
            ezvu.a.g("approveRebootTonight() failed.", iOException0, new Object[0]);
            return false;
        }
    }

    @Override  // ezuj
    public final void p() {
        ezvu.a.j("checkForUpdate()", new Object[0]);
        this.d.f();
    }
}

