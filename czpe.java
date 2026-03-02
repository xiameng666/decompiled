import java.util.concurrent.Callable;

public final class czpe implements Callable {
    public final czpf a;

    public czpe(czpf czpf0) {
        this.a = czpf0;
    }

    @Override
    public final Object call() {
        czpf czpf0 = this.a;
        ++czpf0.f;
        Object object0 = czpf0.c();
        if(object0 != null) {
            return object0;
        }
        throw new RuntimeException(String.format("Failed to create client Bluetooth socket to %s.", czpf0.c));
    }
}

