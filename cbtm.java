import android.os.Bundle;

public final class cbtm implements ibth {
    public final cbuo a;

    public cbtm(cbuo cbuo0) {
        this.a = cbuo0;
    }

    @Override  // ibth
    public final Object a() {
        String s = this.a.y().k();
        this.a.requireContext();
        Bundle bundle0 = this.a.getArguments();
        return bundle0 == null ? new cbir(s, gvkw.b(gvkw.a.aa), this.a.M(), 4) : new cbir(s, gvkw.b(bundle0.getInt("flow_type")), this.a.M(), 4);
    }
}

