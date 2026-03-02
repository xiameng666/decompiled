import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class aso {
    public final Object a;
    public volatile boolean b;
    public volatile bmb c;

    public aso(atk atk0, List list0) {
        this.a = new Object();
        boolean z = false;
        this.b = false;
        int v = atk0.h;
        int v1 = atk0.h;
        Objects.toString(ati.a(v1));
        String s = ati.a(v1);
        if(v == 8) {
            z = true;
        }
        kay.b(z, "CaptureSession state must be OPENED. Current state:" + s);
        DesugarCollections.unmodifiableList(new ArrayList(list0));
    }
}

