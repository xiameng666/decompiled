import android.os.Environment;
import android.os.StatFs;
import java.util.List;

public final class arqc implements Runnable {
    public final arqd a;
    public final List b;

    public arqc(arqd arqd0, List list0) {
        this.a = arqd0;
        this.b = list0;
    }

    @Override
    public final void run() {
        baun baun0 = arqd.a;
        baun0.h("Backup thread started", new Object[0]);
        arfn.a.b.clear();
        arqd arqd0 = this.a;
        arfk arfk0 = arqd0.b;
        arfk0.c();
        baun0.h("Starting backups async", new Object[0]);
        for(Object object0: this.b) {
            String s = (String)object0;
            if(arqd0.e.get()) {
                baun0.h("BackupPreparer is shutdown, skipping backup for %s", new Object[]{s});
            }
            else {
                StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
                if(statFs0.getBlockSizeLong() * statFs0.getAvailableBlocksLong() < hqhq.a.j().d()) {
                    baun0.h("Not enough disk space to backup %s early. Another attempt will be made during transfer.", new Object[]{s});
                }
                else {
                    baun0.h("Starting backup for %s on backup thread", new Object[]{s});
                    arfk0.h(s);
                }
            }
        }
        baun0.h("Finished backups", new Object[0]);
    }
}

