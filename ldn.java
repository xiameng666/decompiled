import java.io.InputStream;
import java.io.OutputStream;

public final class ldn implements ldr {
    private final MessageLite a;
    private final hftc b;

    public ldn(MessageLite hfvm0) {
        ibuq.f(hfvm0, "defaultValue");
        ibuq.f(hftc.a, "extensionRegistryLite");
        super();
        this.a = hfvm0;
        this.b = hftc.a;
    }

    @Override  // ldr
    public final Object a() {
        return this.a;
    }

    @Override  // ldr
    public final Object b(InputStream inputStream0) {
        try {
            Object object0 = this.a.getParserForType().o(inputStream0, this.b);
            ibuq.d(object0, "null cannot be cast to non-null type T of androidx.datastore.core.ProtoSerializer");
            return object0;
        }
        catch(hfur hfur0) {
            throw new laf("Cannot read proto.", hfur0);
        }
    }

    @Override  // ldr
    public final Object c(Object object0, OutputStream outputStream0) {
        ((MessageLite)object0).writeToStream(outputStream0);
        return ibom.a;
    }
}

