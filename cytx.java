import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.fastpair.internal.IsMusicMutedBySassParams;

public final class cytx extends cjtm {
    private final IsMusicMutedBySassParams a;
    private final String b;

    public cytx(IsMusicMutedBySassParams isMusicMutedBySassParams0, String s) {
        super(0x109, "IsMusicMutedBySass");
        this.a = isMusicMutedBySassParams0;
        this.b = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hvpp.al()) {
            throw new cjuh(40504, "Api is disabled");
        }
        if(!cygn.b(context0, this.b) && (!azql.c(context0).g(this.b) || !hvpg.a.aY().fl().b.contains(this.b))) {
            throw new cjuh(40500, "Only allow for 1P");
        }
        this.a.a.a(new Status(0), new cyrq(context0).a());
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a.a(status0, false);
    }
}

