public final class gbdu {
    static int a(hdqc hdqc0, int v) {
        int v1 = v & 0x70;
        switch((hdqb.b(hdqc0.c) == null ? hdqb.a : hdqb.b(hdqc0.c)).ordinal()) {
            case 0: 
            case 1: {
            label_8:
                int v2 = v & 0x800007;
                switch((hdqb.b(hdqc0.d) == null ? hdqb.a : hdqb.b(hdqc0.d)).ordinal()) {
                    case 0: 
                    case 1: {
                        return v1 | v2;
                    }
                    case 2: {
                        v2 = 0x800003;
                        return v1 | v2;
                    }
                    case 3: {
                        return v1 | 0x800005;
                    }
                    case 4: {
                        return v1 | 1;
                    }
                    case 5: 
                    case 6: {
                        throw new IllegalArgumentException("Baseline alignment not supported by gravity");
                    }
                    case 7: {
                        throw new IllegalArgumentException("Stretch not yet supported");
                    }
                    default: {
                        return v1;
                    }
                }
            }
            case 2: {
                v1 = 0x30;
                goto label_8;
            }
            case 3: {
                v1 = 80;
                goto label_8;
            }
            case 4: {
                v1 = 16;
                goto label_8;
            }
            case 5: 
            case 6: {
                throw new IllegalArgumentException("Baseline alignment not supported by gravity");
            }
            case 7: {
                throw new IllegalArgumentException("Stretch not yet supported");
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }
}

