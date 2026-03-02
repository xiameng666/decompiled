import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

public final class flcg implements azuk {
    public final flcj a;
    public final gmcu b;
    public final aztw c;

    public flcg(flcj flcj0, gmcu gmcu0, aztw aztw0) {
        this.a = flcj0;
        this.b = gmcu0;
        this.c = aztw0;
    }

    @Override  // azuk
    public final void a(azuj azuj0) {
        Status status0 = ((aids)azuj0).a;
        gmcu gmcu0 = this.b;
        flcj flcj0 = this.a;
        if(status0.e()) {
            String s = ((aids)azuj0).b;
            if(TextUtils.isEmpty(s)) {
                gmcu0.r(new Exception("Spatula header is empty"));
            }
            else {
                flcj0.b = s;
                flbj.a("ClntIntrcptrFctryV12", "Spatula header: " + flcj0.b);
                gmcu0.q(null);
            }
        }
        else {
            gmcu0.r(new Exception("Error generating spatula header: " + status0.toString()));
            flcj0.c = null;
        }
        this.c.g();
    }
}

