import j..util.function.Function.-CC;
import java.util.function.Function;

public final class apvd implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = ((ando)object0).name();
        switch(((ando)object0).ordinal()) {
            case 6: {
                return object1 + "\n+1 650-253-0000";
            }
            case 7: {
                return object1 + "\n+1";
            }
            case 8: {
                return object1 + "\n650-253-0000";
            }
            case 11: {
                return object1 + "\nAlex Middle Smith";
            }
            case 12: {
                return object1 + "\nAlex";
            }
            case 13: {
                return object1 + "\nSmith";
            }
            case 14: {
                return object1 + "\nMiddle";
            }
            case 15: {
                return object1 + "\nM";
            }
            case 16: {
                return object1 + "\nMr, Ms";
            }
            case 17: {
                return object1 + "\nJr, Sr";
            }
            case 18: {
                return object1 + "\n1600 Amphitheatre Pkwy, Mountain View, CA 94043";
            }
            case 19: {
                return object1 + "\nUnited States";
            }
            case 20: {
                return object1 + "\n94043";
            }
            case 21: {
                return object1 + "\nCalifornia";
            }
            case 22: {
                return object1 + "\nMountain View";
            }
            case 23: {
                return object1 + "\n1600 Amphitheatre Pkwy";
            }
            case 24: {
                return object1 + "\nUnit 1234";
            }
            default: {
                return object1;
            }
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

