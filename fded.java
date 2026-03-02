import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;

public final class fded {
    public static final baun a;
    public final fdco b;
    public final fczx c;
    public final fcfe d;
    final gful_cronetEngineProvider e;
    final gmcg f;
    public evql g;
    private final fdab h;

    static {
        fded.a = new baun("wearable.TOS", new String[0]);
    }

    public fded(fdab fdab0, fczx fczx0, gful_cronetEngineProvider gful0, fcfe fcfe0) {
        this.f = new bblp(1, 9);
        this.g = evrg.d(Collections.EMPTY_LIST);
        this.h = fdab0;
        this.c = fczx0;
        this.e = gful0;
        this.d = fcfe0;
        this.b = new fdco(EnumSet.copyOf(Arrays.asList(new fdcn[]{fdcn.b, fdcn.c, fdcn.a, fdcn.d})));
    }

    public final void a(Context context0, gged_interceptors gged0, fdco fdco0, String s, String s1, String s2) {
        String s3 = fdci.b() ? s2 : null;
        gqtz gqtz0 = gqtz.WK;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.kL;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grku)hftp0.b_message).c = gqub0.mk;
        ((grku)hftp0.b_message).b |= 1;
        grkv grkv0 = fdab.a(true);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grku grku0 = (grku)hftp0.b_message;
        grkv0.getClass();
        grku0.d = grkv0;
        grku0.b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
        grjx0.a(gged0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp1.b_message;
        grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy0.getClass();
        grnk0.j = grjy0;
        grnk0.b |= 0x200;
        fdab.f(context0, gged_interceptors.l(fdab.e(gqtz0, ((grnk)hftp1.N_build()), hftp0, s, s1, s3)));
        this.h.b(context0, gqtz0, gged0, fdco0, s, s1, s3);
    }

    public final boolean b(Context context0, fdan fdan0) {
        baun baun0 = fded.a;
        boolean z = false;
        baun0.d("[TOS] shouldShowBackupConsent", new Object[0]);
        String s = gfta.a(fdan0.e);
        String s1 = gfta.a(fdan0.d);
        boolean z1 = fdan0.f;
        if(z1 && s1 != null && !gfta.c(s)) {
            fddw fddw0 = new fddw(context0, s);
            gmcd gmcd0 = this.f.e(fddw0);
            fddx fddx0 = new fddx();
            Boolean boolean0 = (Boolean)gmbu.s(glyi.f(gmcd0, Throwable.class, fddx0, this.f));
            if(boolean0 != null && boolean0.booleanValue()) {
                z = true;
            }
        }
        baun0.h("[TOS] shouldShowBackupConsent(watchPeerId=%s, accountName=%s, showBackupConsent=%b): %b", new Object[]{s1, baun.q(s), Boolean.valueOf(z1), Boolean.valueOf(z)});
        return z;
    }
}

