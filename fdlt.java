import android.content.Context;
import com.google.android.gms.common.Feature;

public final class fdlt extends fcfl {
    public static final Feature a;
    public static final Feature b;

    static {
        fdlt.a = new Feature("wear_backup_restore", 4L);
        fdlt.b = new Feature("wear_backup_restore", 8L);
    }

    public fdlt(Context context0, aztr_settings aztr0) {
        super(context0, aztr0);
    }

    @Override  // fcfl
    public final evql e(String s, String s1) {
        azzc azzc0 = new azzc();
        azzc0.a = new fdlp(this, s, s1);
        azzc0.d = 0x5DF7;
        azzc0.c = new Feature[]{fdlt.b};
        return this.iG(azzc0.a());
    }

    @Override  // fcfl
    public final evql f(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new fdll(this, s);
        azzc0.c = new Feature[]{fdlt.a};
        return this.iG(azzc0.a());
    }

    @Override  // fcfl
    public final evql g(String s, int v, byte[] arr_b) {
        azzc azzc0 = fdlt.i(new fdlo(s, v, arr_b));
        azzc0.c = new Feature[]{fdlt.a};
        return this.iG(azzc0.a());
    }

    @Override  // fcfl
    public final evql h(String s) {
        azzc azzc0 = fdlt.i(new fdlm(s));
        azzc0.c = new Feature[]{fdlt.a};
        return this.iG(azzc0.a());
    }

    private static azzc i(azys azys0) {
        azzc azzc0 = new azzc();
        azzc0.a = new fdln(azys0);
        return azzc0;
    }
}

