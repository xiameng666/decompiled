import java.util.Map;

public final class hntl extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public hntl() {
        super(((ProtoLiteMessage)hntq.a));
    }

    public final void a(Map map0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((hntq)this.b_message).b().putAll(map0);
    }
}

