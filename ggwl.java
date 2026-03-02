import java.util.Calendar;
import java.util.Date;

public final class ggwl extends ggwm {
    private final ggwk c;

    public ggwl(ggtr ggtr0, int v, ggwk ggwk0) {
        super(ggtr0, v);
        this.c = ggwk0;
        StringBuilder stringBuilder0 = new StringBuilder("%");
        ggtr0.f(stringBuilder0);
        stringBuilder0.append(((char)(ggtr0.d() ? 84 : 0x74)));
        stringBuilder0.append(ggwk0.G);
    }

    @Override  // ggwm
    public final void a(ggwq ggwq0, Object object0) {
        ggwk ggwk0 = this.c;
        if(!(object0 instanceof Date) && !(object0 instanceof Calendar) && !(object0 instanceof Long)) {
            ggwq.d(ggwq0.d, object0, "%t" + ggwk0.G);
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder("%");
        this.b.f(stringBuilder0);
        stringBuilder0.append(((char)(this.b.d() ? 84 : 0x74)));
        stringBuilder0.append(ggwk0.G);
        ggwq0.d.append(String.format(ggtz.a, stringBuilder0.toString(), object0));
    }
}

