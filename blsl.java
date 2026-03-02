import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class blsl implements Callable {
    public final List a;
    public final byte[] b;

    public blsl(List list0, byte[] arr_b) {
        this.a = list0;
        this.b = arr_b;
    }

    @Override
    public final Object call() {
        blze blze0;
        for(Object object0: this.a) {
            gmcd gmcd0 = (gmcd)object0;
            try {
                blze0 = (blze)gmbu.r(gmcd0);
            }
            catch(ExecutionException executionException0) {
                a.ae(blsm.a.j(), "Error using v2 credentials.", executionException0);
                blze0 = null;
            }
            if(blze0 != null && MessageDigest.isEqual(blze0.a, this.b)) {
                ((ggtj)blsm.a.h()).B("Matched clientEid for account: %s", blze0.b);
                return gfsx.m(blze0);
            }
        }
        return gfqx.a;
    }
}

