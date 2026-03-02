import com.google.android.gms.wearable.backup.wear.WearBackupComposeDialogChimeraActivity;

final class fcsw implements ibtw {
    final WearBackupComposeDialogChimeraActivity a;

    public fcsw(WearBackupComposeDialogChimeraActivity wearBackupComposeDialogChimeraActivity0) {
        this.a = wearBackupComposeDialogChimeraActivity0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        WearBackupComposeDialogChimeraActivity wearBackupComposeDialogChimeraActivity0 = this.a;
        String s = wearBackupComposeDialogChimeraActivity0.getIntent().getStringExtra("dialog_label");
        if(s == null) {
            s = "";
        }
        plm.c(gzf.e(0xA6E64BD3, new fcsu(wearBackupComposeDialogChimeraActivity0), ((goz)object0)), gzf.e(0x70A8FEE9, new fcsv(s), ((goz)object0)), dls.v(hfc.e), null, null, null, null, ((goz)object0), 438, 0xF8);
        return ibom.a;
    }
}

