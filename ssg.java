public enum ssg {
    KEY_0(new ssy(0xDF70), 0),
    KEY_1(new ssy(0xDF71), 1),
    KEY_2(new ssy(0xDF72), 2),
    KEY_3(new ssy(0xDF73), 3),
    KEY_4(new ssy(0xDF74), 4),
    KEY_5(new ssy(0xDF75), 5),
    KEY_6(new ssy(0xDF76), 6),
    KEY_7(new ssy(0xDF77), 7),
    KEY_8(new ssy(0xDF78), 8),
    KEY_9(new ssy(0xDF79), 9),
    KEY_10(new ssy(0xDF7A), 10),
    KEY_11(new ssy(0xDF7B), 11),
    KEY_12(new ssy(0xDF7C), 12),
    KEY_13(new ssy(0xDF7D), 13),
    KEY_14(new ssy(0xDF7E), 14),
    KEY_15(new ssy(0xDF7F), 15),
    KEY_16(new ssy(0xDF30), 16),
    KEY_17(new ssy(0xDF31), 17),
    KEY_18(new ssy(0xDF32), 18),
    KEY_19(new ssy(0xDF33), 19),
    KEY_20(new ssy(0xDF34), 20),
    KEY_21(new ssy(0xDF35), 21),
    KEY_22(new ssy(0xDF36), 22),
    KEY_23(new ssy(0xDF37), 23),
    KEY_24(new ssy(0xDF38), 24),
    KEY_25(new ssy(0xDF39), 25),
    KEY_26(new ssy(0xDF3A), 26),
    KEY_27(new ssy(0xDF3B), 27),
    KEY_28(new ssy(0xDF3C), 28),
    KEY_29(new ssy(0xDF3D), 29),
    KEY_30(new ssy(0xDF3E), 30),
    KEY_31(new ssy(0xDF3F), 0x1F),
    KEY_GENESIS_AKE(new ssy(0xFF7F), 0xFF);

    public final ssy H;
    public final byte I;

    private ssg(ssy ssy0, int v1) {
        this.H = ssy0;
        this.I = (byte)v1;
    }

    public static ssg a(byte b) {
        int v = ssg.G.I;
        if(b != v) {
            v = b & 0x7F;
        }
        ssg[] arr_ssg = ssg.values();
        for(int v1 = 0; v1 < arr_ssg.length; ++v1) {
            ssg ssg0 = arr_ssg[v1];
            if(ssg0.I == v) {
                return ssg0;
            }
        }
        throw new EnumConstantNotPresentException(ssg.class, String.valueOf(b));
    }

    public static ssg b(ssy ssy0) {
        ssg[] arr_ssg = ssg.values();
        for(int v = 0; v < arr_ssg.length; ++v) {
            ssg ssg0 = arr_ssg[v];
            if(ssg0.H.a == ssy0.a) {
                return ssg0;
            }
        }
        throw new EnumConstantNotPresentException(ssg.class, String.valueOf(ssy0.a));
    }

    public static boolean c(byte b) {
        stp.a(b & 0x7F, 0, 0x1F, "keyRef");
        return (b & 0x80) != 0;
    }

    public static boolean d(ssy ssy0) {
        return (0xFF30 & ssy0.a) == 0xDF30 || ssy0.a == ssg.G.H.a;
    }
}

