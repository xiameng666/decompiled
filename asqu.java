import com.google.android.gms.backup.settings.notifications.BackupNotificationsTask;

public final class asqu extends ibsl implements ibtw {
    int a;
    final BackupNotificationsTask b;
    final cllr c;
    private Object d;

    public asqu(BackupNotificationsTask backupNotificationsTask0, cllr cllr0, ibrl ibrl0) {
        this.b = backupNotificationsTask0;
        this.c = cllr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asqu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new asqu(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck icck0 = (icck)this.d;
            try {
                this.a = 1;
                object0 = this.b.d(this);
                if(object0 == object1) {
                    return object1;
                }
                object2 = new Integer(((Number)object0).intValue());
                goto label_14;
            }
            catch(Throwable throwable0) {
            }
            goto label_13;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                goto label_13;
            }
        }
        object2 = new Integer(((Number)object0).intValue());
        goto label_14;
    label_13:
        object2 = ibnx.a(throwable0);
    label_14:
        Throwable throwable1 = ibnw.a(object2);
        if(throwable1 == null) {
            return object2;
        }
        a.ae(BackupNotificationsTask.a.i(), "Task run failed", throwable1);
        return new Integer(2);
    }
}

