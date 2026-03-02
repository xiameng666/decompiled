import java.util.NoSuchElementException;

public final class scs implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((String)object0), "it");
        ibuq.f(((String)object0), "<this>");
        if(((String)object0).length() != 0) {
            return String.valueOf(((String)object0).charAt(0));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}

