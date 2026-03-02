import com.google.android.gms.wearable.internal.GetRestoreSupportedResponse;

public final class ffhk implements fflt {
    public final fflv a;
    public final fdiy b;

    public ffhk(fflv fflv0, fdiy fdiy0) {
        this.a = fflv0;
        this.b = fdiy0;
    }

    @Override  // fflt
    public final void a() {
        batl.s(this.a.E);
        boolean z = hzyp.g();
        fcmj.a.d("restoreSupported=%b", new Object[]{Boolean.valueOf(z)});
        GetRestoreSupportedResponse getRestoreSupportedResponse0 = new GetRestoreSupportedResponse(0, z);
        this.b.L(getRestoreSupportedResponse0);
    }
}

