public enum hfti {
    DOUBLE(0, 1, hfut.e),
    FLOAT(1, 1, hfut.d),
    INT64(2, 1, hfut.c),
    UINT64(3, 1, hfut.c),
    INT32(4, 1, hfut.b),
    FIXED64(5, 1, hfut.c),
    FIXED32(6, 1, hfut.b),
    BOOL(7, 1, hfut.f),
    STRING(8, 1, hfut.g),
    MESSAGE(9, 1, hfut.j),
    BYTES(10, 1, hfut.h),
    UINT32(11, 1, hfut.b),
    ENUM(12, 1, hfut.i),
    SFIXED32(13, 1, hfut.b),
    SFIXED64(14, 1, hfut.c),
    SINT32(15, 1, hfut.b),
    SINT64(16, 1, hfut.c),
    GROUP(17, 1, hfut.j),
    DOUBLE_LIST(18, 2, hfut.e),
    FLOAT_LIST(19, 2, hfut.d),
    INT64_LIST(20, 2, hfut.c),
    UINT64_LIST(21, 2, hfut.c),
    INT32_LIST(22, 2, hfut.b),
    FIXED64_LIST(23, 2, hfut.c),
    FIXED32_LIST(24, 2, hfut.b),
    BOOL_LIST(25, 2, hfut.f),
    STRING_LIST(26, 2, hfut.g),
    MESSAGE_LIST(27, 2, hfut.j),
    BYTES_LIST(28, 2, hfut.h),
    UINT32_LIST(29, 2, hfut.b),
    ENUM_LIST(30, 2, hfut.i),
    SFIXED32_LIST(0x1F, 2, hfut.b),
    SFIXED64_LIST(0x20, 2, hfut.c),
    SINT32_LIST(33, 2, hfut.b),
    SINT64_LIST(34, 2, hfut.c),
    DOUBLE_LIST_PACKED(35, 3, hfut.e),
    FLOAT_LIST_PACKED(36, 3, hfut.d),
    INT64_LIST_PACKED(37, 3, hfut.c),
    UINT64_LIST_PACKED(38, 3, hfut.c),
    INT32_LIST_PACKED(39, 3, hfut.b),
    FIXED64_LIST_PACKED(40, 3, hfut.c),
    FIXED32_LIST_PACKED(41, 3, hfut.b),
    BOOL_LIST_PACKED(42, 3, hfut.f),
    UINT32_LIST_PACKED(43, 3, hfut.b),
    ENUM_LIST_PACKED(44, 3, hfut.i),
    SFIXED32_LIST_PACKED(45, 3, hfut.b),
    SFIXED64_LIST_PACKED(46, 3, hfut.c),
    SINT32_LIST_PACKED(0x2F, 3, hfut.b),
    SINT64_LIST_PACKED(0x30, 3, hfut.c),
    GROUP_LIST(49, 2, hfut.j),
    MAP(50, 4, hfut.a);

    public final int Z;
    private static final hfti[] aa;

    static {
        hfti[] arr_hfti = hfti.values();
        hfti.aa = new hfti[arr_hfti.length];
        for(int v = 0; v < arr_hfti.length; ++v) {
            hfti hfti0 = arr_hfti[v];
            hfti.aa[hfti0.Z] = hfti0;
        }
    }

    private hfti(int v1, int v2, hfut hfut0) {
        this.Z = v1;
    }
}

