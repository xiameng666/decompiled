import android.content.Context;
import com.google.android.gms.credential.manager.credentialexchange.ExportCredentialsChimeraActivity;
import j..util.Objects;

final class bdoi implements acl {
    final bdoj a;

    public bdoi(bdoj bdoj0) {
        Objects.requireNonNull(bdoj0);
        this.a = bdoj0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        bdoj bdoj0 = this.a;
        if(!bdoj0.j) {
            bdoj0.j = true;
            bdkd bdkd0 = (bdkd)bdoj0.h();
            ExportCredentialsChimeraActivity exportCredentialsChimeraActivity0 = (ExportCredentialsChimeraActivity)bdoj0;
            bdkd0.f();
        }
    }
}

