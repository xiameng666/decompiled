import java.util.ArrayDeque;

public final class dcwh extends ArrayDeque {
    private final int a;

    public dcwh(int v) {
        this.a = v;
    }

    @Override
    public final boolean add(Object object0) {
        while(this.size() == this.a) {
            super.remove();
        }
        super.add(object0);
        return true;
    }
}

