import com.google.android.gms.backup.extension.download.ui.CustomBackupDownloadChimeraActivity;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Map;

public final class aruo implements gmbg {
    final CustomBackupDownloadChimeraActivity a;

    public aruo(CustomBackupDownloadChimeraActivity customBackupDownloadChimeraActivity0) {
        Objects.requireNonNull(customBackupDownloadChimeraActivity0);
        this.a = customBackupDownloadChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        CustomBackupDownloadChimeraActivity customBackupDownloadChimeraActivity0 = this.a;
        if(customBackupDownloadChimeraActivity0.m) {
            CustomBackupDownloadChimeraActivity.j.f("Activity already destroyed.", new Object[0]);
            return;
        }
        CustomBackupDownloadChimeraActivity.j.f("Failed to receive data from service. Finishing activity", new Object[0]);
        customBackupDownloadChimeraActivity0.finish();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        CustomBackupDownloadChimeraActivity customBackupDownloadChimeraActivity0 = this.a;
        if(customBackupDownloadChimeraActivity0.m) {
            CustomBackupDownloadChimeraActivity.j.f("Activity already destroyed.", new Object[0]);
            return;
        }
        if(!((gfsx)object0).i()) {
            CustomBackupDownloadChimeraActivity.j.f("Didn\'t received meaningful data from service. Finishing activity", new Object[0]);
            customBackupDownloadChimeraActivity0.finish();
            return;
        }
        artk artk0 = (artk)((gfsx)object0).d();
        customBackupDownloadChimeraActivity0.l.e = artk0;
        Map map0 = DesugarCollections.unmodifiableMap(artk0.b);
        for(Object object1: map0.keySet()) {
            if(!((arti)map0.get(((String)object1))).e) {
                continue;
            }
            customBackupDownloadChimeraActivity0.n = new arvc();
            goto label_20;
        }
        if(!customBackupDownloadChimeraActivity0.o.b(customBackupDownloadChimeraActivity0.getApplicationContext())) {
            customBackupDownloadChimeraActivity0.k.a(artv.a);
        }
        customBackupDownloadChimeraActivity0.n = new arvl();
    label_20:
        ca ca0 = new ca(customBackupDownloadChimeraActivity0.getSupportFragmentManager());
        ca0.I(0x7F0100D4, 0x7F0100D5);  // anim:sud_slide_next_in
        ca0.z(0x7F0B1889, customBackupDownloadChimeraActivity0.n, customBackupDownloadChimeraActivity0.n.getClass().getName());  // id:main_container
        ca0.a();
    }
}

