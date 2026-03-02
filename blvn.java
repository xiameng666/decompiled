import com.google.android.gms.auth.cryptauth.KeyHandleResult;

public final class blvn implements glzn {
    public final blwa a;
    public final String b;

    public blvn(blwa blwa0, String s) {
        this.a = blwa0;
        this.b = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((gfsx)object0).i()) {
            byte[] arr_b = ((KeyHandleResult)((gfsx)object0).d()).b;
            return this.a.b.d(this.b, arr_b);
        }
        return gmbu.i(gfqx.a);
    }
}

