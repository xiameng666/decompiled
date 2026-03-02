import com.google.android.gms.common.ConnectionResult;

public final class flcf implements aztv {
    public final flcj a;
    public final gmcu b;
    public final aztw c;

    public flcf(flcj flcj0, gmcu gmcu0, aztw aztw0) {
        this.a = flcj0;
        this.b = gmcu0;
        this.c = aztw0;
    }

    @Override  // azyj
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        flbj.c("ClntIntrcptrFctryV12", "Error connecting GoogleApiClient: " + connectionResult0);
        this.a.c = null;
        this.b.r(new Exception("Error calling GMS Core API: " + connectionResult0.e));
        this.c.g();
    }
}

