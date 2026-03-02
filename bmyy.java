import androidx.activity.result.ActivityResult;
import j..util.Objects;

final class bmyy implements acn {
    final bmza a;

    public bmyy(bmza bmza0) {
        Objects.requireNonNull(bmza0);
        this.a = bmza0;
        super();
    }

    @Override  // acn
    public final void jN(Object object0) {
        boolean z = this.a.ah != null && this.a.ah.isEnabled();
        this.a.b.k(z);
        ((ggtj)((ggtj)bmza.a.h()).ar(0x1095)).S("Received Acitity Result: %s with BT enabled: %s", ((ActivityResult)object0), z);
    }
}

