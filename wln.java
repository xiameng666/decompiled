import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class wln implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        cnrb cnrb0 = (cnrb)((ProtoLiteBuilder)object1).b_message;
        ((gvxw)object0).getClass();
        cnrb0.c = (gvxw)object0;
        cnrb0.b = 5;
    }

    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

