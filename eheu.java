import android.accounts.Account;
import android.content.Context;

public final class eheu {
    public static final String a;
    public final ehfx b;
    public final ehbg c;
    public final ehif d;
    public final ehab e;
    public final egzq f;
    public final ehft g;
    public int h;
    public int i;
    public final ehim j;
    public final ehga k;
    public final egzz l;
    public final egzo m;
    private final egzr n;

    static {
        eheu.a = "FSA2_eheu";
    }

    public eheu(Context context0, ehbg ehbg0, ehbp ehbp0, ehga ehga0, Account account0, ehim ehim0, egzp egzp0, ehif ehif0, egzr egzr0, egzq egzq0, egzz egzz0) {
        this.c = ehbg0;
        this.b = new ehfx(ehbp0, account0, egzp0, ehim0, ehbg0, egzr0);
        this.e = new ehab(account0, ehbp0, ehim0);
        this.f = egzq0;
        this.g = new ehft(context0, ehbp0, account0, egzp0);
        this.n = egzr0;
        this.d = ehif0;
        this.j = ehim0;
        this.k = ehga0;
        this.l = egzz0;
        this.m = egzo.a();
    }

    public final void a(ggfp ggfp0) {
        egzr egzr0 = this.n;
        if(egzr0.f(ggfp0)) {
            if(egzr0.c()) {
                this.e.f();
                return;
            }
            egig.b(eheu.a, "Failed to flush group contact orders to AppSearch");
            throw new ehfh(new ehfg(9, "Failed to flush group contact orders to AppSearch"));
        }
        egig.b(eheu.a, "Failed to upsert group contact orders");
        throw new ehfh(new ehfg(9, "Failed to upsert group contact orders into AppSearch"));
    }
}

