import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import java.util.List;

public abstract class esqa implements espz {
    public final CardInfo a;
    public final InStoreCvmConfig b;
    public final String c;
    public final String d;

    public esqa(CardInfo cardInfo0, InStoreCvmConfig inStoreCvmConfig0, String s, String s1) {
        this.a = cardInfo0;
        this.b = inStoreCvmConfig0;
        this.c = s;
        this.d = s1;
    }

    @Override  // espz
    public final void b() {
    }

    @Override  // espz
    public final void c(byte[] arr_b) {
    }

    public final int e() {
        return this.d.equals(this.a.a) ? this.a.W : this.a.X;
    }

    public abstract int f();

    public int g() {
        return 0;
    }

    public abstract espy h();

    public abstract esqg i();

    public abstract List j();

    public abstract void k();

    public abstract void l();
}

