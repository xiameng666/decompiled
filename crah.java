import java.util.List;

public final class crah {
    public static qjb a(qjd qjd0) {
        if(qjd0.d == null || qjd0.d.a != 24L) {
            throw new qip("Expected the encoded CBOR tag");
        }
        qjf qjf0 = qjd0.c;
        if(qjf0 == qjf.c) {
            return (qjb)qjd0;
        }
        throw new qip(String.format("Expected a byte string, got %s", qjf0.name()));
    }

    public static qjd b(List list0) {
        if(list0.size() == 1) {
            return (qjd)list0.get(0);
        }
        throw new qip("Expected single data item");
    }

    public static qjg c(qjd qjd0) {
        qjf qjf0 = qjd0.c;
        if(qjf0 == qjf.f) {
            return (qjg)qjd0;
        }
        throw new qip(String.format("Expected a map, got %s", qjf0.name()));
    }

    public static qjn d(qjd qjd0) {
        qjf qjf0 = qjd0.c;
        if(qjf0 == qjf.d) {
            return (qjn)qjd0;
        }
        throw new qip(String.format("Expected a unicode string, got %s", qjf0.name()));
    }
}

