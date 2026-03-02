import android.app.DownloadManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageInstaller.SessionParams;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.auth.managed.ui.ManagingAppInstallBroadcastReceiver;
import com.google.android.gms.chimera.modules.auth.managed.AppContextProvider;
import com.google.android.gms.common.api.Status;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public final class akna extends lvb {
    public Handler a;
    public Intent b;
    private final hlxd c;
    private final akqv d;
    private final ManagingAppInstallBroadcastReceiver e;
    private final String f;
    private final long g;
    private Integer h;
    private Integer i;
    private boolean j;

    public akna(Context context0, long v, String s, hlxd hlxd0) {
        akqv akqv0 = akqv.f();
        super(context0);
        this.f = s;
        this.g = v;
        this.c = hlxd0;
        this.e = new ManagingAppInstallBroadcastReceiver(AppContextProvider.b(), this, hlxd0);
        this.d = akqv0;
    }

    public final void a(Integer integer0) {
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] deliverResult : %s", integer0));
        if(hpwf.g()) {
            this.onReset();
        }
        this.i = integer0;
        super.deliverResult(integer0);
    }

    public final void b(Intent intent0) {
        intent0.addFlags(0x10000000);
        intent0.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        this.getContext().startActivity(intent0);
    }

    public final boolean c(boolean z) {
        Context context0 = this.getContext();
        if(this.d.a(context0, this.c) == 3) {
            this.a(Integer.valueOf(101));
            return true;
        }
        if(z) {
            this.a(Integer.valueOf(-1));
        }
        return false;
    }

    @Override  // lvb
    protected final void onReset() {
        this.i = null;
        if(this.j) {
            this.e.c();
            Integer integer0 = this.h;
            if(integer0 != null) {
                PackageInstaller packageInstaller0 = this.getContext().getPackageManager().getPackageInstaller();
                try {
                    packageInstaller0.abandonSession(integer0.intValue());
                }
                catch(SecurityException unused_ex) {
                }
                this.h = null;
            }
            this.a.removeCallbacksAndMessages(null);
            this.a = null;
            this.j = false;
        }
    }

    @Override  // lvb
    public final void onStartLoading() {
        Closeable closeable3;
        PackageInstaller.Session packageInstaller$Session1;
        PackageInstaller packageInstaller1;
        Closeable closeable2;
        ParcelFileDescriptor parcelFileDescriptor1;
        ParcelFileDescriptor parcelFileDescriptor0;
        PackageInstaller.Session packageInstaller$Session0;
        Throwable throwable2;
        PackageInstaller packageInstaller0;
        Status status0;
        Closeable closeable1;
        Closeable closeable0;
        int v1;
        InputStream inputStream0;
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] onStartLoading"));
        Integer integer0 = this.i;
        if(integer0 == null) {
            Intent intent0 = this.b;
            if(intent0 != null) {
                this.b(intent0);
                this.b = null;
            }
        }
        else {
            this.a(integer0);
        }
        if(this.j && hpwf.g()) {
            this.c(false);
        }
        if(!this.j) {
            this.j = true;
            this.a = new clht();
            this.e.b();
            akqv akqv0 = this.d;
            Context context0 = this.getContext();
            long v = this.g;
            String s = this.f;
            hlxd hlxd0 = this.c;
            if(hpwe.h()) {
                batl.s(s);
                batl.s(hlxd0);
                frbx frbx0 = new frbx(gged_interceptors.l(new ccsd(new frcc(new frcb(context0)))));
                try {
                    inputStream0 = (InputStream)frbx0.d(Uri.parse(s), new frfr());
                }
                catch(IOException unused_ex) {
                    v1 = -1;
                    closeable0 = null;
                    goto label_79;
                }
                catch(RuntimeException unused_ex) {
                    v1 = -1;
                    closeable1 = null;
                    goto label_86;
                }
                catch(Throwable throwable0) {
                    closeable0 = null;
                    bbpb.b(closeable0);
                    throw throwable0;
                }
                try {
                    status0 = Status.b;
                    PackageInstaller.SessionParams packageInstaller$SessionParams0 = new PackageInstaller.SessionParams(1);
                    packageInstaller$SessionParams0.setAppLabel(hlxd0.d);
                    packageInstaller$SessionParams0.setAppPackageName(hlxd0.c);
                    packageInstaller$SessionParams0.setSize(hlxd0.f);
                    packageInstaller0 = context0.getPackageManager().getPackageInstaller();
                    v1 = packageInstaller0.createSession(packageInstaller$SessionParams0);
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    v1 = -1;
                    closeable1 = null;
                    goto label_67;
                }
                try {
                    packageInstaller$Session0 = packageInstaller0.openSession(v1);
                    goto label_53;
                }
                catch(Throwable throwable3) {
                    throwable2 = throwable3;
                }
                closeable1 = null;
                goto label_67;
                try {
                label_53:
                    if(akqv0.o(akqv0.p(inputStream0, packageInstaller$Session0, hlxd0), hlxd0)) {
                        packageInstaller$Session0.commit(PendingIntent.getBroadcast(context0, 0, new Intent("com.google.android.gms.auth.DM_PACKAGE_INSTALLED").setPackage("com.google.android.gms"), 0xA000000).getIntentSender());
                    }
                    else {
                        status0 = new Status(0x540B, "Package signature mismatch.");
                        v1 = -1;
                    }
                    goto label_75;
                }
                catch(Throwable throwable4) {
                    throwable2 = throwable4;
                    closeable1 = packageInstaller$Session0;
                    goto label_67;
                }
                try {
                    status0 = new Status(0x540B, "Package signature mismatch.");
                    v1 = -1;
                    goto label_75;
                }
                catch(Throwable throwable5) {
                    throwable2 = throwable5;
                    closeable1 = packageInstaller$Session0;
                    v1 = -1;
                }
            label_67:
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                    }
                    catch(Throwable throwable6) {
                        try {
                            throwable2.addSuppressed(throwable6);
                            throw throwable2;
                        }
                        catch(IOException unused_ex) {
                            closeable0 = closeable1;
                            goto label_79;
                        }
                        catch(RuntimeException unused_ex) {
                            goto label_86;
                        }
                        catch(Throwable throwable0) {
                            closeable0 = closeable1;
                            bbpb.b(closeable0);
                            throw throwable0;
                        }
                    }
                }
                throw throwable2;
            label_75:
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                        goto label_97;
                    }
                    catch(IOException unused_ex) {
                        closeable0 = packageInstaller$Session0;
                        try {
                        label_79:
                            status0 = new Status(0x540C, "IOException during installation.");
                        }
                        catch(Throwable throwable0) {
                            bbpb.b(closeable0);
                            throw throwable0;
                        }
                        bbpb.b(closeable0);
                        goto label_183;
                    }
                    catch(RuntimeException unused_ex) {
                        closeable1 = packageInstaller$Session0;
                        try {
                        label_86:
                            status0 = new Status(0x5409, "Cannot find download file.");
                        }
                        catch(Throwable throwable0) {
                            closeable0 = closeable1;
                            bbpb.b(closeable0);
                            throw throwable0;
                        }
                        bbpb.b(closeable1);
                        goto label_183;
                    }
                    catch(Throwable throwable0) {
                        closeable0 = packageInstaller$Session0;
                    }
                    bbpb.b(closeable0);
                    throw throwable0;
                }
            label_97:
                bbpb.b(packageInstaller$Session0);
            }
            else {
                batl.s(hlxd0);
                DownloadManager downloadManager0 = (DownloadManager)context0.getSystemService("download");
                Status status1 = Status.b;
                try {
                    parcelFileDescriptor0 = downloadManager0.openDownloadedFile(v);
                }
                catch(FileNotFoundException unused_ex) {
                    v1 = -1;
                    parcelFileDescriptor0 = null;
                    closeable3 = null;
                    goto label_158;
                }
                catch(IOException unused_ex) {
                    v1 = -1;
                    parcelFileDescriptor1 = null;
                    closeable3 = null;
                    goto label_168;
                }
                catch(Throwable throwable7) {
                    parcelFileDescriptor1 = null;
                    closeable3 = null;
                    bbpb.a(parcelFileDescriptor1);
                    bbpb.b(closeable3);
                    throw throwable7;
                }
                if(parcelFileDescriptor0 == null) {
                    try {
                        status0 = new Status(0x5409, "Cannot find download file.");
                        v1 = -1;
                        closeable2 = null;
                        goto label_181;
                    label_118:
                        FileInputStream fileInputStream0 = new FileInputStream(parcelFileDescriptor0.getFileDescriptor());
                        PackageInstaller.SessionParams packageInstaller$SessionParams1 = new PackageInstaller.SessionParams(1);
                        packageInstaller$SessionParams1.setAppLabel(hlxd0.d);
                        packageInstaller$SessionParams1.setAppPackageName(hlxd0.c);
                        packageInstaller$SessionParams1.setSize(hlxd0.f);
                        packageInstaller1 = context0.getPackageManager().getPackageInstaller();
                        v1 = packageInstaller1.createSession(packageInstaller$SessionParams1);
                        packageInstaller$Session1 = packageInstaller1.openSession(v1);
                        goto label_142;
                    }
                    catch(FileNotFoundException unused_ex) {
                        v1 = -1;
                        closeable3 = null;
                        goto label_158;
                    }
                    catch(IOException unused_ex) {
                        parcelFileDescriptor1 = parcelFileDescriptor0;
                        v1 = -1;
                        closeable3 = null;
                        goto label_168;
                    }
                    catch(Throwable throwable7) {
                        goto label_139;
                    }
                }
                else {
                    goto label_118;
                    try {
                        packageInstaller$Session1 = packageInstaller1.openSession(v1);
                        goto label_142;
                    }
                    catch(FileNotFoundException unused_ex) {
                        closeable3 = null;
                        goto label_158;
                    }
                    catch(IOException unused_ex) {
                        parcelFileDescriptor1 = parcelFileDescriptor0;
                        closeable3 = null;
                        goto label_168;
                    }
                    catch(Throwable throwable7) {
                    label_139:
                        parcelFileDescriptor1 = parcelFileDescriptor0;
                    }
                    closeable3 = null;
                    bbpb.a(parcelFileDescriptor1);
                    bbpb.b(closeable3);
                    throw throwable7;
                    try {
                    label_142:
                        if(akqv0.o(akqv0.p(fileInputStream0, packageInstaller$Session1, hlxd0), hlxd0)) {
                            packageInstaller$Session1.commit(PendingIntent.getBroadcast(context0, 0, new Intent("com.google.android.gms.auth.DM_PACKAGE_INSTALLED").setPackage("com.google.android.gms"), 0xA000000).getIntentSender());
                            status0 = status1;
                            closeable2 = packageInstaller$Session1;
                        }
                        else {
                            status0 = new Status(0x540B, "Package signature mismatch.");
                            closeable2 = packageInstaller$Session1;
                            v1 = -1;
                        }
                        goto label_181;
                    }
                    catch(FileNotFoundException unused_ex) {
                        closeable3 = packageInstaller$Session1;
                        goto label_158;
                    }
                    catch(IOException unused_ex) {
                        parcelFileDescriptor1 = parcelFileDescriptor0;
                        closeable3 = packageInstaller$Session1;
                        goto label_168;
                        try {
                            status0 = new Status(0x540B, "Package signature mismatch.");
                            closeable2 = packageInstaller$Session1;
                            v1 = -1;
                            goto label_181;
                        }
                        catch(FileNotFoundException unused_ex) {
                        }
                        catch(IOException unused_ex) {
                            goto label_165;
                        }
                        catch(Throwable throwable7) {
                            goto label_176;
                        }
                        closeable3 = packageInstaller$Session1;
                        v1 = -1;
                        try {
                        label_158:
                            status0 = new Status(0x5409, "Cannot find download file.");
                        }
                        catch(Throwable throwable7) {
                            parcelFileDescriptor1 = parcelFileDescriptor0;
                            bbpb.a(parcelFileDescriptor1);
                            bbpb.b(closeable3);
                            throw throwable7;
                        }
                        bbpb.a(parcelFileDescriptor0);
                        bbpb.b(closeable3);
                        goto label_183;
                    label_165:
                        parcelFileDescriptor1 = parcelFileDescriptor0;
                        closeable3 = packageInstaller$Session1;
                        v1 = -1;
                        try {
                        label_168:
                            status0 = new Status(0x540C, "IOException during installation.");
                        }
                        catch(Throwable throwable7) {
                            bbpb.a(parcelFileDescriptor1);
                            bbpb.b(closeable3);
                            throw throwable7;
                        }
                        bbpb.a(parcelFileDescriptor1);
                        bbpb.b(closeable3);
                        goto label_183;
                    }
                    catch(Throwable throwable7) {
                    label_176:
                        parcelFileDescriptor1 = parcelFileDescriptor0;
                        closeable3 = packageInstaller$Session1;
                    }
                    bbpb.a(parcelFileDescriptor1);
                    bbpb.b(closeable3);
                    throw throwable7;
                }
            label_181:
                bbpb.a(parcelFileDescriptor0);
                bbpb.b(closeable2);
            }
        label_183:
            if(!Status.b.equals(status0)) {
                goto label_190;
            }
            this.h = v1;
            if(hpwf.g()) {
                long v2 = hpwf.a.b().c();
                long v3 = hpwf.a.b().b();
                this.a.postDelayed(new akmz(this, v3, v2), v2);
                return;
            label_190:
                this.a(Integer.valueOf(-1));
            }
        }
    }
}

