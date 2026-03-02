import android.content.Intent;

public final class dnov implements ibth {
    public final dnph a;

    public dnov(dnph dnph0) {
        this.a = dnph0;
    }

    @Override  // ibth
    public final Object a() {
        Intent intent0 = dlnf.L(this.a.requireContext()).putExtra("intent_from_fop_list", true);
        ibuq.e(intent0, "putExtra(...)");
        this.a.startActivity(intent0);
        return ibom.a;
    }
}

