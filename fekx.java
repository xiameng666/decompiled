import java.util.function.Supplier;

public final class fekx implements Supplier {
    public final String a;

    public fekx(String s) {
        this.a = s;
    }

    @Override
    public final Object get() {
        return new fehz("Cannot find main config for " + this.a);
    }
}

