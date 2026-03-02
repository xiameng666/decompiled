import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class wna implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        gvte gvte0 = (gvte)((ProtoLiteBuilder)object1).b_message;
        ((gvtu)object0).getClass();
        gvte0.c = (gvtu)object0;
        gvte0.b = 0x81;
    }

    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

