import android.os.Bundle;

public final class dcqg implements jqv {
    public final dcqh a;
    public final Bundle b;

    public dcqg(dcqh dcqh0, Bundle bundle0) {
        this.a = dcqh0;
        this.b = bundle0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        dcqh dcqh0 = this.a;
        if(dcqh0.b == null) {
            dcqh0.b = new bbvk(dcqh0.a);
        }
        evql evql0 = dcqh0.b.e(this.b);
        evql0.b(new dcqe(jqt0));
        evql0.A(new dcqf(jqt0));
        return "ConstellationClient.getFreshPhoneNumbers";
    }
}

