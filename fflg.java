import android.util.Log;
import com.google.android.gms.wearable.internal.GetNodeIdResponse;
import j..util.Objects;

final class fflg extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public fflg(fflv fflv0, String s, fdiy fdiy0) {
        this.c = s;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getNodeId");
    }

    @Override  // ffee
    public final void a() {
        String s1;
        try {
            felm felm0 = this.e.k;
            String s = this.c;
            if(s == null) {
                s1 = null;
            }
            else {
                fczq fczq0 = felm0.c.d(s);
                if(fczq0 != null && fczq0.d != 4 && s.equals(fczq0.c)) {
                    s1 = fczq0.h;
                    if(s1 == null) {
                        s1 = fczq0.j;
                    }
                }
                else {
                    s1 = null;
                }
            }
            if(s1 != null) {
                GetNodeIdResponse getNodeIdResponse0 = new GetNodeIdResponse(0, s1);
                this.d.J(getNodeIdResponse0);
                return;
            }
            GetNodeIdResponse getNodeIdResponse1 = new GetNodeIdResponse(13, null);
            this.d.J(getNodeIdResponse1);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getNodeId: exception during processing", exception0);
            GetNodeIdResponse getNodeIdResponse2 = new GetNodeIdResponse(8, null);
            this.d.J(getNodeIdResponse2);
        }
    }
}

