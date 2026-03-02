import com.google.android.gms.wearable.backup.wear.WearBackupComposeConfirmationChimeraActivity;

final class fcsk implements ibtx {
    final WearBackupComposeConfirmationChimeraActivity a;

    public fcsk(WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0) {
        this.a = wearBackupComposeConfirmationChimeraActivity0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$AlertDialog");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        pma pma0 = pmb.a(pqq.a(((goz)object1)).q, ((goz)object1));
        hfc hfc0 = dls.v(hfc.e);
        ((goz)object1).M(5004770);
        WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0 = this.a;
        boolean z = ((goz)object1).Z(wearBackupComposeConfirmationChimeraActivity0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new fcsi(wearBackupComposeConfirmationChimeraActivity0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        pps.a(((ibth)object3), hfc0, false, pma0, gzf.e(0xB0416F3B, new fcsj(wearBackupComposeConfirmationChimeraActivity0), ((goz)object1)), ((goz)object1), 0xC00030);
        return ibom.a;
    }
}

