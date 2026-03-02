import com.google.android.gms.wearable.backup.wear.WearBackupComposeConfirmationChimeraActivity;

final class fcsj implements ibtx {
    final WearBackupComposeConfirmationChimeraActivity a;

    public fcsj(WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0) {
        this.a = wearBackupComposeConfirmationChimeraActivity0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$EdgeButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        jbn jbn0 = pqq.d(((goz)object1)).j;
        pwb.b("Cancel", null, pqq.a(((goz)object1)).s, 0L, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0xFFFA);
        return ibom.a;
    }
}

