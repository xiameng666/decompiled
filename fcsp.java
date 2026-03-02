import com.google.android.gms.wearable.backup.wear.WearBackupComposeConfirmationChimeraActivity;

final class fcsp implements ibtx {
    final WearBackupComposeConfirmationChimeraActivity a;

    public fcsp(WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0) {
        this.a = wearBackupComposeConfirmationChimeraActivity0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((pit)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        long v1 = pqq.a(((goz)object1)).a;
        pvn pvn0 = pvo.a(pqq.a(((goz)object1))).a(v1, hll.i, hll.h, hll.i);
        hfc hfc0 = dls.v(hfc.e);
        ((goz)object1).M(5004770);
        WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0 = this.a;
        boolean z = ((goz)object1).Z(wearBackupComposeConfirmationChimeraActivity0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new fcsn(wearBackupComposeConfirmationChimeraActivity0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        pvs.a(((ibth)object3), hfc0, false, null, pvn0, null, gzf.e(0xFFFDBC06, new fcso(wearBackupComposeConfirmationChimeraActivity0), ((goz)object1)), ((goz)object1), 0x30000030, 444);
        return ibom.a;
    }
}

