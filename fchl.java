import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;

public final class fchl implements evqf {
    public final BackupOptInChimeraActivity a;
    public final fext b;

    public fchl(BackupOptInChimeraActivity backupOptInChimeraActivity0, fext fext0) {
        this.a = backupOptInChimeraActivity0;
        this.b = fext0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        BackupOptInChimeraActivity backupOptInChimeraActivity0 = this.a;
        backupOptInChimeraActivity0.r = ((fexs)object0).c;
        fext fext0 = this.b;
        if(fext0.c) {
            String s = (fext0.e == null ? fexr.a : fext0.e).c;
            String s1 = backupOptInChimeraActivity0.r;
            gftb.check(s1);
            if(gfqz.e(s, s1)) {
                BackupOptInChimeraActivity.j.j("User switched to the current backup account, finishing.", new Object[0]);
                backupOptInChimeraActivity0.finish();
                return;
            }
        }
        backupOptInChimeraActivity0.g(fext0);
    }
}

