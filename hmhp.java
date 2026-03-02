public enum hmhp {
    CDCVM_INFO_NOT_SUPPORTED(0),
    NO_CDCVM_PERFORMED(1),
    NO_CDCVM_INFO_AVAILABLE(2),
    KNOWLEDGE(3),
    INHERENCE(4),
    PIN(5),
    PATTERN(6),
    PASSWORD(7),
    FINGERPRINT(8),
    FACIAL_BIOMETRIC(9),
    IRIS_BIOMETRIC(10),
    VOICE_BIOMETRIC(11),
    VEIN_RECOGNITION(12),
    HAND_GEOMETRY(13);

    public final short o;

    private hmhp(short v1) {
        this.o = v1;
    }
}

