import com.google.android.gms.mdocstore.DocumentRequest;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ebia implements Function {
    public final DocumentRequest a;

    public ebia(DocumentRequest documentRequest0) {
        this.a = documentRequest0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gtxr gtxr0 = ebib.a(this.a);
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gtxo gtxo0 = (gtxo)((ProtoLiteBuilder)object0).b_message;
        gtxr0.getClass();
        gtxo0.d = gtxr0;
        gtxo0.c = 4;
        return (ProtoLiteBuilder)object0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

