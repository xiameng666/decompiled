import com.google.android.gms.wearable.backup.wear.WearBackupComposeConfirmationChimeraActivity;

final class fcsq implements ibtw {
    final WearBackupComposeConfirmationChimeraActivity a;

    public fcsq(WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0) {
        this.a = wearBackupComposeConfirmationChimeraActivity0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0 = this.a;
        String s = wearBackupComposeConfirmationChimeraActivity0.getIntent().getStringExtra("confirmation_title");
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = wearBackupComposeConfirmationChimeraActivity0.getIntent().getStringExtra("confirmation_content");
        if(s2 != null) {
            s1 = s2;
        }
        hfc hfc0 = dls.v(hfc.e);
        ((goz)object0).M(5004770);
        boolean z = ((goz)object0).Z(wearBackupComposeConfirmationChimeraActivity0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new fcsg(wearBackupComposeConfirmationChimeraActivity0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        gze gze0 = gzf.e(0xE9F5EBE6, new fcsk(wearBackupComposeConfirmationChimeraActivity0), ((goz)object0));
        gze gze1 = gzf.e(0x8275B690, new fcsl(s), ((goz)object0));
        gze gze2 = gzf.e(-2087023469, new fcsm(s1), ((goz)object0));
        ((goz)object0).M(5004770);
        boolean z1 = ((goz)object0).Z(wearBackupComposeConfirmationChimeraActivity0);
        Object object3 = ((goz)object0).k();
        if(z1 || object3 == gop.a) {
            object3 = new fcsh(wearBackupComposeConfirmationChimeraActivity0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        plm.d(((ibth)object2), gze0, gze1, hfc0, gze2, null, null, null, ((ibts)object3), ((goz)object0), 1600902, 0);
        return ibom.a;
    }
}

