import android.app.Application;
import java.util.LinkedHashMap;

public final class cbgy implements ibth {
    public final cbhk a;

    public cbgy(cbhk cbhk0) {
        this.a = cbhk0;
    }

    @Override  // ibth
    public final Object a() {
        Application application0 = xoc.b(this.a).getApplication();
        String s = this.a.z();
        ibuq.f(cclw.d, "blockingContext");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ltz.b(new ibuk(cbij.class), new cbhq(application0, cclw.d, s, this.a.B()), linkedHashMap0);
        return ltz.a(linkedHashMap0);
    }
}

