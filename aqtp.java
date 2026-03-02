import com.google.android.libraries.photos.backup.api.StatusResult.PermissionAskingState;
import com.google.android.libraries.photos.backup.api.StatusResult;
import j..util.Objects;

final class aqtp extends fptg {
    final aqtr a;

    public aqtp(aqtr aqtr0) {
        Objects.requireNonNull(aqtr0);
        this.a = aqtr0;
        super();
    }

    @Override  // fpth
    public final void a(StatusResult statusResult0) {
        fpue fpue0;
        aqtw aqtw0 = this.a.a;
        if(aqtw0 != null) {
            boolean z = statusResult0.c;
            int v = statusResult0.a;
            long v1 = statusResult0.b;
            StatusResult.PermissionAskingState statusResult$PermissionAskingState0 = statusResult0.d;
            if(statusResult$PermissionAskingState0 == null) {
                fpue0 = fpue.a;
            }
            else {
                switch(statusResult$PermissionAskingState0.ordinal()) {
                    case 0: {
                        fpue0 = fpue.a;
                        break;
                    }
                    case 1: {
                        fpue0 = fpue.b;
                        break;
                    }
                    case 2: {
                        fpue0 = fpue.c;
                        break;
                    }
                    case 3: {
                        fpue0 = fpue.d;
                        break;
                    }
                    default: {
                        throw new RuntimeException(null, null);
                    }
                }
            }
            aqtw0.a(new aqtx(z, v, v1, fpue0, null));
        }
    }
}

