public enum hfut {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(ByteString.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    private hfut(Class class0) {
        this.k = class0;
    }
}

