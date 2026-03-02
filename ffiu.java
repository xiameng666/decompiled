import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.internal.GetCompanionPackageForNodeResponse;
import j..util.Objects;

final class ffiu extends ffee {
    final fdiy c;
    final String d;
    final fflv e;

    public ffiu(fflv fflv0, fdiy fdiy0, String s) {
        this.c = fdiy0;
        this.d = s;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getCompanionPackageForNode");
    }

    @Override  // ffee
    public final void a() {
        String s1;
        if(ffgp.m()) {
            Log.e("WearableService", "getCompanionPackageForNode is not supported on watches");
            GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse0 = new GetCompanionPackageForNodeResponse(10, "");
            this.c.z(getCompanionPackageForNodeResponse0);
            return;
        }
        try {
            if(hzzm.a.c().g()) {
                felm felm0 = this.e.k;
                String s = this.d;
                if(TextUtils.isEmpty(s)) {
                    throw new fdwn("Empty nodeId");
                }
                if(s.equals("cloud")) {
                    throw new fdwn("No package associated with cloud");
                }
                fczq[] arr_fczq = felm0.v(null);
                int v = 0;
                while(v < arr_fczq.length) {
                    fczq fczq0 = arr_fczq[v];
                    if(s.equals(fczq0.j)) {
                        s1 = bbqr.c(fczq0.k);
                        goto label_23;
                    }
                    ++v;
                }
                throw new fdwn(a.a(s, "nodeId[", "] does not exist"));
            }
            else {
                s1 = "";
            }
        label_23:
            GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse1 = new GetCompanionPackageForNodeResponse(0, s1);
            this.c.z(getCompanionPackageForNodeResponse1);
        }
        catch(fdwn fdwn0) {
            Log.e("WearableService", "getCompanionPackageForNode: invalid nodeId " + this.d, fdwn0);
            GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse2 = new GetCompanionPackageForNodeResponse(10, "");
            this.c.z(getCompanionPackageForNodeResponse2);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getCompanionPackageForNode: exception during processing", exception0);
            GetCompanionPackageForNodeResponse getCompanionPackageForNodeResponse3 = new GetCompanionPackageForNodeResponse(8, "");
            this.c.z(getCompanionPackageForNodeResponse3);
        }
    }
}

