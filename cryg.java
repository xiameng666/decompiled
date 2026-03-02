import j..util.function.Function.-CC;
import java.util.function.Function;

public final class cryg implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        switch(((gsod)object0).ordinal()) {
            case 1: {
                return (int)1;
            }
            case 2: {
                return (int)2;
            }
            case 3: {
                return (int)3;
            }
            case 4: {
                return (int)4;
            }
            case 5: {
                return (int)5;
            }
            case 6: {
                return (int)6;
            }
            case 7: {
                return (int)7;
            }
            default: {
                return (int)0;
            }
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

