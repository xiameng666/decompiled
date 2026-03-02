import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;

public final class aimw implements glzn {
    public final aink a;
    public final RetrieveBytesRequest b;
    public final wvj c;

    public aimw(aink aink0, RetrieveBytesRequest retrieveBytesRequest0, wvj wvj0) {
        this.a = aink0;
        this.b = retrieveBytesRequest0;
        this.c = wvj0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Integer integer0 = (Integer)object0;
        aioc aioc0 = new aioc(null);
        aioc0.a = gfqx.a;
        wvj wvj0 = this.c;
        if(wvj0 == null) {
            throw new NullPointerException("Null accessEvaluationPerSnapshotDetails");
        }
        aioc0.b = wvj0;
        int v = this.a.f.a(this.a.d);
        return glzd.f(gmbt.h(this.a.h.g(this.a.d, this.a.e, this.b, v)), new ainb(aioc0), this.a.k);
    }
}

