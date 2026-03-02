import java.util.Map;

public final class azik extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public azik() {
        super(((ProtoLiteMessage)azil.a));
    }

    public final void a(Map map0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        azil azil0 = (azil)this.b_message;
        hfvh hfvh0 = azil0.b;
        if(!hfvh0.b) {
            azil0.b = hfvh0.a();
        }
        azil0.b.putAll(map0);
    }
}

