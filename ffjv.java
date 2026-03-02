import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import j..util.Objects;

final class ffjv extends ffee {
    final AncsNotificationParcelable c;
    final fdiy d;
    final fflv e;

    public ffjv(fflv fflv0, AncsNotificationParcelable ancsNotificationParcelable0, fdiy fdiy0) {
        this.c = ancsNotificationParcelable0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("injectAncsNotificationForTesting");
    }

    @Override  // ffee
    public final void a() {
        fdpl fdpl1;
        fdpl fdpl0;
        try {
            fcfr fcfr0 = this.e.q;
            AncsNotificationParcelable ancsNotificationParcelable0 = this.c;
            if(Log.isLoggable("AncsService", 3)) {
                Log.d("AncsService", "onNotificationReceived " + ancsNotificationParcelable0);
            }
            fffw fffw0 = fcfr0.a;
            if(fffw0 != null) {
                if(Log.isLoggable("WearableService", 2)) {
                    Log.v("WearableService", "onNotificationReceived: " + ancsNotificationParcelable0);
                }
                String s = ancsNotificationParcelable0.k;
                if(s == null) {
                    fdpl0 = ffgm.c;
                    s = "com.google.android.wearable.app";
                }
                else {
                    try {
                        fdpl0 = null;
                        fdpl0 = fdpn.a(fffw0.a, s);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
                if(fdpl0 != null) {
                    ffgm ffgm0 = fffw0.a;
                    ffgm0.i(ancsNotificationParcelable0, s, fdpl0);
                    if(hzxr.a.c().d() && bbqa.c()) {
                        try {
                            fdpl1 = fdpn.a(ffgm0, "com.google.wear.services");
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            Log.w("WearableService", "Failed to create Wear Services app key. " + packageManager$NameNotFoundException0.getMessage());
                            goto label_28;
                        }
                        fffw0.a.i(ancsNotificationParcelable0, "com.google.wear.services", fdpl1);
                    }
                }
                else if(Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", dlbc.c(s, "Dropping ANCS event since ", " was not found"));
                }
            }
        label_28:
            Status status0 = new Status(0);
            this.d.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "injectAncsNotificationForTesting: exception during processing: " + this.c, exception0);
            Status status1 = new Status(8);
            this.d.a(status1);
        }
    }
}

