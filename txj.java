import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

public final class txj extends ContextWrapper {
    static final tyc a;
    public final upj b;
    public final List c;
    public final Map d;
    public final udm e;
    public final txl f;
    public final int g;
    public final ues h;
    private final uqi i;
    private uoy j;

    static {
        txj.a = new txb();
    }

    public txj(Context context0, ues ues0, uqi uqi0, upj upj0, Map map0, List list0, udm udm0, txl txl0) {
        super(context0.getApplicationContext());
        this.h = ues0;
        this.b = upj0;
        this.c = list0;
        this.d = map0;
        this.e = udm0;
        this.f = txl0;
        this.g = 4;
        this.i = new uqh(uqi0);
    }

    public final txt a() {
        return (txt)this.i.a();
    }

    public final uoy b() {
        synchronized(this) {
            if(this.j == null) {
                uoy uoy0 = new uoy();
                uoy0.U();
                this.j = uoy0;
            }
        }
        return this.j;
    }
}

