import android.content.Context;
import android.net.Uri;
import j..time.Duration;
import j..time.Instant;
import j..util.Collection.-EL;
import j..util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class bgqs implements bgqg {
    public static final Duration a;
    public final bbng b;
    private final Executor c;
    private final frli d;

    static {
        bgqs.a = Duration.ofDays(1L);
    }

    public bgqs(Context context0, bbng bbng0) {
        bblp bblp0 = new bblp(1, 9);
        super();
        this.b = bbng0;
        this.c = bblp0;
        frce frce0 = new frce(context0);
        frce0.d("crisisalerts");
        frce0.e("hndl.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.h(frhj.a);
        frie0.e(((MessageLite)gxoh.a));
        frif frif0 = frie0.a();
        this.d = cjtb.a.a(frif0);
    }

    @Override  // bgqg
    public final gmcd a() {
        return glzd.f(this.d.a(), new bgqn(this), this.c);
    }

    @Override  // bgqg
    public final gmcd b(gxog gxog0) {
        bgqh bgqh0 = new bgqh(this, gxog0);
        return this.d.b(bgqh0, this.c);
    }

    @Override  // bgqg
    public final gmcd c(gxoi gxoi0) {
        bgqo bgqo0 = new bgqo(this, gxoi0);
        return this.d.b(bgqo0, this.c);
    }

    @Override  // bgqg
    public final Optional d(hgtu hgtu0) {
        try {
            return Collection.-EL.stream(((gxoh)this.d.a().get(1000L, TimeUnit.MILLISECONDS)).c).filter(new bgqj(hgtu0)).findFirst();
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return Optional.empty();
        }
    }

    @Override  // bgqg
    public final Optional e(String s) {
        try {
            return Collection.-EL.stream(((gxoh)this.d.a().get(1000L, TimeUnit.MILLISECONDS)).c).filter(new bgqr(s)).findFirst();
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return Optional.empty();
        }
    }

    @Override  // bgqg
    public final Optional f(hgtu hgtu0) {
        try {
            return Collection.-EL.stream(((gxoh)this.d.a().get(1000L, TimeUnit.MILLISECONDS)).b).filter(new bgqq(hgtu0)).findFirst();
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return Optional.empty();
        }
    }

    @Override  // bgqg
    public final void g(hgtu hgtu0) {
        this.d(hgtu0).ifPresent(new bgqk(this));
    }

    public final gxoh h() {
        try {
            return (gxoh)this.d.a().get(1000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return null;
        }
    }

    public final boolean i(gxog gxog0) {
        Instant instant0 = hfyg.d((gxog0.d == null ? hfwn.a : gxog0.d));
        hguc hguc0 = gxog0.c == null ? hguc.a : gxog0.c;
        hgtw hgtw0 = hguc0.h == null ? hgtw.a : hguc0.h;
        return instant0.plus(hfyg.c((hgtw0.c == null ? hfst.a : hgtw0.c))).isBefore(Instant.ofEpochMilli(this.b.a()));
    }
}

