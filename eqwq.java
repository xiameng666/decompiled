import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.quickstart.OsMigrationResult;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;
import j..util.Objects;

public final class eqwq extends wby implements eqwr {
    public final TargetQuickStartChimeraActivity a;

    public eqwq() {
        super("com.google.android.gms.smartdevice.quickstart.ITargetOsMigrationCallbacks");
    }

    public eqwq(TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0) {
        Objects.requireNonNull(targetQuickStartChimeraActivity0);
        this.a = targetQuickStartChimeraActivity0;
        super("com.google.android.gms.smartdevice.quickstart.ITargetOsMigrationCallbacks");
    }

    @Override  // eqwr
    public final void a() {
        TargetQuickStartChimeraActivity.i.d("onBandwidthChangedHigh", new Object[0]);
        if(hyis.x()) {
            this.a.w();
        }
    }

    @Override  // eqwr
    public final void b(Status status0) {
        TargetQuickStartChimeraActivity.i.d("onConnectionResult: %s", new Object[]{status0});
    }

    @Override  // eqwr
    public final void c(String s) {
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a;
        targetQuickStartChimeraActivity0.m = s;
        du du0 = targetQuickStartChimeraActivity0.m();
        if((du0 instanceof ermb)) {
            if(targetQuickStartChimeraActivity0.m != null) {
                targetQuickStartChimeraActivity0.runOnUiThread(new erdf(this, ((ermb)du0)));
            }
        }
        else if((du0 instanceof eree) && targetQuickStartChimeraActivity0.m != null) {
            targetQuickStartChimeraActivity0.runOnUiThread(new erdg(this, ((eree)du0)));
        }
    }

    @Override  // eqwr
    public final void d(String s, String s1, int v) {
        TargetQuickStartChimeraActivity.i.d("onInternetConnectionChanged: %s", new Object[]{v});
        if(!hyis.x() && v == 1) {
            this.a.w();
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                eqwq.gr(parcel0);
                this.c(s);
                break;
            }
            case 2: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                int v1 = parcel0.readInt();
                eqwq.gr(parcel0);
                this.d(s1, s2, v1);
                break;
            }
            case 3: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqwq.gr(parcel0);
                this.b(status0);
                break;
            }
            case 4: {
                this.a();
                break;
            }
            case 5: {
                parcel0.readInt();
                OsMigrationResult osMigrationResult0 = (OsMigrationResult)wbz.a(parcel0, OsMigrationResult.CREATOR);
                eqwq.gr(parcel0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

