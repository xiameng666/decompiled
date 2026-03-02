import java.util.ListIterator;

public interface ibmw extends ibme, ListIterator {
    @Deprecated
    Long b();

    void c(long arg1);

    @Deprecated
    void d(Long arg1);

    void e(long arg1);

    @Deprecated
    void f(Long arg1);

    @Override  // ibmr
    @Deprecated
    Long next();

    @Override
    void remove();
}

