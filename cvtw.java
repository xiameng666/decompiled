import java.util.Comparator;

public final class cvtw implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        for(Object object2: hvog.bg().b) {
            if(((int)(((Integer)object2))) == ((gyxl)object0).o) {
                return -1;
            }
            if(((int)(((Integer)object2))) == ((gyxl)object1).o) {
                return 1;
            }
        }
        throw new IllegalStateException(String.format("Failed to find either %s or %s in the list of locally supported mediums despite  expecting to find both, when deciding which medium is preferred.", ((gyxl)object0).name(), ((gyxl)object1).name()));
    }
}

