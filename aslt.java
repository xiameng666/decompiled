import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

public final class aslt {
    public static final bboh a;
    public final icnj b;
    private final icck c;
    private final atoh d;

    static {
        aslt.a = bboh.b("BackupStatsUseCase", bbcu.dF);
    }

    public aslt(asms asms0, asgr asgr0, atoh atoh0, icck icck0) {
        ibuq.f(asms0, "deviceDataBackupStateUseCase");
        ibuq.f(asgr0, "backUpNowClient");
        ibuq.f(atoh0, "backupStatsServiceClientWrapper");
        ibuq.f(icck0, "coroutineScope");
        super();
        this.d = atoh0;
        this.c = icck0;
        icig icig0 = asgr0.d();
        aslq aslq0 = new aslq(this, null);
        this.b = iclp.b(new icjr(new icmj(asms0.f, icig0, aslq0), new aslr(null)), icck0, icmy.a(0L, 3), aqqe.a);
    }

    public final Object a(ibrl ibrl0) {
        Long long0;
        asls asls0;
        if((ibrl0 instanceof asls)) {
            asls0 = (asls)ibrl0;
            int v = asls0.c;
            if((v & 0x80000000) == 0) {
                asls0 = new asls(this, ibrl0);
            }
            else {
                asls0.c = v - 0x80000000;
            }
        }
        else {
            asls0 = new asls(this, ibrl0);
        }
        Object object0 = asls0.a;
        Object object1 = ibrx.a;
        int v1 = 1;
        switch(asls0.c) {
            case 0: {
                ibnx.b(object0);
                BackupStatsRequestConfig backupStatsRequestConfig0 = new BackupStatsRequestConfig(true, true);
                evqp evqp0 = new evqp();
                atog atog0 = new atog(this.d, evqp0, backupStatsRequestConfig0);
                this.d.b.execute(atog0);
                iccs iccs0 = ictn.c(evqp0.a);
                asls0.c = 1;
                object0 = iccs0.n(asls0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(((ApplicationBackupStats[])object0));
        long v2 = 0L;
        long v3 = 0L;
        for(int v4 = 0; v4 < ((ApplicationBackupStats[])object0).length; ++v4) {
            ApplicationBackupStats applicationBackupStats0 = ((ApplicationBackupStats[])object0)[v4];
            v3 += ((long)applicationBackupStats0.b) + applicationBackupStats0.e + ((long)applicationBackupStats0.c);
        }
        if(((ApplicationBackupStats[])object0).length == 0) {
            long0 = null;
            goto label_46;
        }
        else {
            long0 = new Long(((ApplicationBackupStats[])object0)[0].d);
            int v5 = ibpg.w(((ApplicationBackupStats[])object0));
            if(v5 > 0) {
                while(true) {
                    Long long1 = new Long(((ApplicationBackupStats[])object0)[v1].d);
                    if(long0.compareTo(long1) < 0) {
                        long0 = long1;
                    }
                    if(v1 == v5) {
                        goto label_46;
                    }
                    ++v1;
                }
            }
            else {
            label_46:
                if(long0 != null) {
                    v2 = (long)long0;
                }
            }
        }
        return new aqqf(new aslp(v3, v2));
    }
}

