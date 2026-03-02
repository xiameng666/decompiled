import com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask;

public final class asrt extends ibsl implements ibtw {
    int a;
    final PhotosBackupMissingPermissionNotificationTask b;
    final cllr c;

    public asrt(PhotosBackupMissingPermissionNotificationTask photosBackupMissingPermissionNotificationTask0, cllr cllr0, ibrl ibrl0) {
        this.b = photosBackupMissingPermissionNotificationTask0;
        this.c = cllr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asrt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asrt(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.f(this);
        return object2 == object1 ? object1 : object2;
    }
}

