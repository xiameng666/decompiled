import java.util.Map;

public final class egqu extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public egqu() {
        super(((ProtoLiteMessage)egqw.a));
    }

    public final void a(Map map0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((egqw)this.b_message).b().putAll(map0);
    }
}

