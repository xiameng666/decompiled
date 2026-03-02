import com.google.android.gms.wearable.backup.wear.WearBackupComposeDialogChimeraActivity;

final class fcst implements ibtx {
    final WearBackupComposeDialogChimeraActivity a;

    public fcst(WearBackupComposeDialogChimeraActivity wearBackupComposeDialogChimeraActivity0) {
        this.a = wearBackupComposeDialogChimeraActivity0;
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
        pqo.b(isr.c(0x7F08050A, ((goz)object1)), "Close", dls.v(hfc.e), 0L, ((goz)object1), 0x180);  // drawable:gs_check_wght600rond100_vd_theme_36
        return ibom.a;
    }
}

