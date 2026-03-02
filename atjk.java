import android.os.RemoteException;
import com.google.android.gms.backup.extension.backup.CustomBackupResult;
import com.google.android.gms.backup.transport.mms.MmsBackupChimeraService;
import j..util.Objects;
import java.io.IOException;

public final class atjk implements Runnable {
    final arsq a;
    final arss b;

    public atjk(arss arss0, arsq arsq0) {
        this.a = arsq0;
        Objects.requireNonNull(arss0);
        this.b = arss0;
        super();
    }

    @Override
    public final void run() {
        boolean z;
        atji atji0 = new atji(this, this.a);
        atjj atjj0 = new atjj(this);
        MmsBackupChimeraService mmsBackupChimeraService0 = this.b.b;
        if(mmsBackupChimeraService0.g == null) {
            mmsBackupChimeraService0.g = new aqys(mmsBackupChimeraService0);
        }
        if(!mmsBackupChimeraService0.d()) {
            mmsBackupChimeraService0.g.j(3);
            if(hqje.u()) {
                mmsBackupChimeraService0.a();
            }
            MmsBackupChimeraService.a.h("Android Backup is not enabled, skip Mms backup", new Object[0]);
            z = false;
        }
        else if(!mmsBackupChimeraService0.e()) {
            mmsBackupChimeraService0.g.j(2);
            if(hqje.v()) {
                mmsBackupChimeraService0.a();
            }
            MmsBackupChimeraService.a.h("User has not enabled MMS Backup", new Object[0]);
            z = false;
        }
        else if(hqje.q()) {
        label_28:
            if(hqje.r()) {
            label_38:
                if(mmsBackupChimeraService0.f()) {
                    mmsBackupChimeraService0.g.j(21);
                    MmsBackupChimeraService.a.m("Account is work profile, skip Mms backup", new Object[0]);
                    z = false;
                }
                else {
                    z = new atjh(mmsBackupChimeraService0, atji0, atjj0, new bbll(1, 9)).d();
                }
            }
            else {
                try {
                    if(mmsBackupChimeraService0.c(MmsBackupChimeraService.c)) {
                        mmsBackupChimeraService0.g.j(7);
                        MmsBackupChimeraService.a.m("User is a unicorn account which is not supported", new Object[0]);
                        goto label_36;
                    }
                    else {
                        goto label_38;
                    }
                    goto label_44;
                }
                catch(acse | IOException exception1) {
                    mmsBackupChimeraService0.g.j(8);
                    MmsBackupChimeraService.a.n("Error retrieving account state", exception1, new Object[0]);
                }
            label_36:
                z = false;
            }
        }
        else {
            try {
                if(mmsBackupChimeraService0.c(MmsBackupChimeraService.d)) {
                    mmsBackupChimeraService0.g.j(6);
                    MmsBackupChimeraService.a.m("User is a dasher account which is not supported", new Object[0]);
                    goto label_36;
                }
                else {
                    goto label_28;
                }
            }
            catch(acse | IOException exception0) {
                mmsBackupChimeraService0.g.j(8);
                MmsBackupChimeraService.a.n("Error retrieving account state", exception0, new Object[0]);
                goto label_36;
            }
        }
    label_44:
        if(hqje.E()) {
            MmsBackupChimeraService.e = false;
        }
        try {
            if(z) {
                MmsBackupChimeraService.a.d("Mms backup complete.", new Object[0]);
                CustomBackupResult customBackupResult0 = new CustomBackupResult(true, "");
                this.a.a(customBackupResult0);
                return;
            }
            arss arss0 = this.b;
            if(arss0.a.get()) {
                MmsBackupChimeraService.a.d("Mms backup canceled.", new Object[0]);
                CustomBackupResult customBackupResult1 = new CustomBackupResult(false, "BACKUP_CANCELED");
                this.a.a(customBackupResult1);
                return;
            }
            if(hqje.a.m().O()) {
                MmsBackupChimeraService mmsBackupChimeraService1 = arss0.b;
                if(mmsBackupChimeraService1.d() && mmsBackupChimeraService1.e()) {
                    if(mmsBackupChimeraService1.f()) {
                        CustomBackupResult customBackupResult2 = new CustomBackupResult(false, "WORK_PROFILE");
                        this.a.a(customBackupResult2);
                        return;
                    }
                    CustomBackupResult customBackupResult3 = new CustomBackupResult(false, "GENERIC");
                    this.a.a(customBackupResult3);
                    return;
                }
                CustomBackupResult customBackupResult4 = new CustomBackupResult(false, "CLIENT_APP_BACKUP_DISABLED");
                this.a.a(customBackupResult4);
                return;
            }
            CustomBackupResult customBackupResult5 = new CustomBackupResult(false, "GENERIC");
            this.a.a(customBackupResult5);
        }
        catch(RemoteException remoteException0) {
            MmsBackupChimeraService.a.n("Error communicating backup completion state", remoteException0, new Object[0]);
        }
    }
}

