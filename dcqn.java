import com.google.android.gms.nearby.sharing.AppInstallMetadata;
import j..util.Objects;

public final class dcqn {
    final dcqp a;

    public dcqn(dcqq dcqq0, dcqp dcqp0) {
        this.a = dcqp0;
        Objects.requireNonNull(dcqq0);
        super();
    }

    public final void a(soc soc0) {
        switch(soc0.b) {
            case 3: {
                AppInstallMetadata appInstallMetadata2 = dbvj.a(2);
                this.a.a(appInstallMetadata2);
                return;
            }
            case 0: 
            case 4: {
                AppInstallMetadata appInstallMetadata1 = dbvj.a(1);
                this.a.a(appInstallMetadata1);
                return;
            }
            default: {
                AppInstallMetadata appInstallMetadata0 = dbvj.a(3);
                this.a.a(appInstallMetadata0);
            }
        }
    }
}

