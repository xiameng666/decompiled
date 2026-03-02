import android.content.Intent;
import com.google.android.gms.nearby.sharing.migration.MigrationNoticeChimeraActivity;

public final class dfqx implements ibth {
    public final MigrationNoticeChimeraActivity a;

    public dfqx(MigrationNoticeChimeraActivity migrationNoticeChimeraActivity0) {
        this.a = migrationNoticeChimeraActivity0;
    }

    @Override  // ibth
    public final Object a() {
        Intent intent0 = Intent.parseUri(hvqz.d(), 1);
        this.a.startActivity(intent0);
        this.a.finish();
        return ibom.a;
    }
}

