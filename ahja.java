import com.google.android.gms.auth.api.identity.SavePasswordResult;
import java.util.concurrent.Callable;

public final class ahja implements Callable {
    public final gmcd a;
    public final gmcd b;

    public ahja(gmcd gmcd0, gmcd gmcd1) {
        this.a = gmcd0;
        this.b = gmcd1;
    }

    @Override
    public final Object call() {
        if(((Boolean)gmbu.r(this.a)).booleanValue()) {
            return null;
        }
        bxly bxly0 = new bxly();
        bxly0.a = 0x6F07;
        bxly0.d = ((SavePasswordResult)gmbu.r(this.b)).a;
        throw bxly0.a();
    }
}

