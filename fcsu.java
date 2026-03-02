import com.google.android.gms.wearable.backup.wear.WearBackupComposeDialogChimeraActivity;

final class fcsu implements ibtx {
    final WearBackupComposeDialogChimeraActivity a;

    public fcsu(WearBackupComposeDialogChimeraActivity wearBackupComposeDialogChimeraActivity0) {
        this.a = wearBackupComposeDialogChimeraActivity0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$AlertDialogContent");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dib)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        pma pma0 = pmb.a(pqq.a(((goz)object1)).a, ((goz)object1));
        hfc hfc0 = ((dib)object0).a(hfc.e, hei.h);
        ((goz)object1).M(5004770);
        WearBackupComposeDialogChimeraActivity wearBackupComposeDialogChimeraActivity0 = this.a;
        boolean z = ((goz)object1).Z(wearBackupComposeDialogChimeraActivity0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new fcss(wearBackupComposeDialogChimeraActivity0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        pps.a(((ibth)object3), hfc0, false, pma0, gzf.e(74532702, new fcst(wearBackupComposeDialogChimeraActivity0), ((goz)object1)), ((goz)object1), 0xC00000);
        return ibom.a;
    }
}

