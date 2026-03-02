import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import java.util.concurrent.ScheduledExecutorService;

public final class auca {
    private final Context a;
    private final ScheduledExecutorService b;
    private final atxp c;
    private final aulm d;
    private final bbng e;
    private final aveu f;
    private final auhn g;

    public auca(Context context0, ScheduledExecutorService scheduledExecutorService0, atxp atxp0, aulm aulm0, bbng bbng0, aveu aveu0, auhn auhn0) {
        this.a = context0;
        this.b = scheduledExecutorService0;
        this.c = atxp0;
        this.d = aulm0;
        this.e = bbng0;
        this.f = aveu0;
        this.g = auhn0;
    }

    public final aucd a(CastDevice castDevice0, auxc auxc0, String s, String s1, aubj aubj0) {
        aucd aucd0 = new aucd(this.a, this.b, castDevice0, auxc0, s, s1, aubj0, this.c, this.d, this.f, this.g);
        aucd0.Y = new aubu(aucd0);
        String s2 = aucd0.c;
        audm audm0 = new audm(aucd0, aucd0.m, aucd0.f, aucd0.e.d, aucd0.g, s2);
        Context context0 = aucd0.m;
        aucd0.p = audm0;
        aucd0.P(aucd0.p);
        aucd0.q = new aubv(aucd0, context0.getApplicationContext(), aucd0.o, s2, aucd0.e, aucd0.g);
        aucd0.P(aucd0.q);
        if(avij.e().w()) {
            aucd0.r = new aubw(aucd0, context0, s2, aucd0.e.d);
            aucd0.P(aucd0.r);
        }
        aucd0.A(false);
        return aucd0;
    }
}

