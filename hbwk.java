import com.google.mlkit.vision.text.aidls.TextParcel;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class hbwk {
    private final List a;

    public hbwk(TextParcel textParcel0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        hbwe hbwe0 = new hbwe();
        arrayList0.addAll(ggia.h(textParcel0.b, hbwe0));
    }

    public hbwk(List list0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        arrayList0.addAll(list0);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.a);
    }
}

