import com.google.android.material.button.MaterialButton;

public final class bdcp implements ibts {
    public final MaterialButton a;

    public bdcp(MaterialButton materialButton0) {
        this.a = materialButton0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        ibuq.c(boolean0);
        this.a.setEnabled(boolean0.booleanValue());
        return ibom.a;
    }
}

