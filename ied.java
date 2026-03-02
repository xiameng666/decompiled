import java.util.Objects;

final class ied extends ibur implements ibts {
    public static final ied a;

    static {
        ied.a = new ied();
    }

    public ied() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ify ify0 = (((ify)object0) instanceof ify) ? ((ify)object0) : null;
        if(ify0 != null && ify0.C) {
            Objects.toString(((ify)object0));
            throw new IllegalStateException("Apply is called on deactivated node " + ((ify)object0));
        }
        return ibom.a;
    }
}

