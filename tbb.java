import java.util.LinkedList;

public class tbb extends tak {
    public static final tdb c;
    public final LinkedList d;

    static {
        tbb.c = tdb.c;
    }

    public tbb(byte[] arr_b, tcz tcz0) {
        super(arr_b, true, tcz0);
        this.d = new LinkedList();
    }

    @Override  // tak
    public final void d(byte[] arr_b) {
        if((arr_b.length & 3) == 0) {
            return;
        }
        throw new IllegalArgumentException("AFL must be a multiple of 4");
    }
}

