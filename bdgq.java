import android.support.v7.widget.SwitchCompat;

final class bdgq extends ibuo implements ibts {
    public bdgq(Object object0) {
        super(1, object0, SwitchCompat.class, "setChecked", "setChecked(Z)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ((SwitchCompat)this.e).setChecked(((Boolean)object0).booleanValue());
        return ibom.a;
    }
}

