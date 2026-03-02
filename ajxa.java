public enum ajxa implements hfub {
    KEY_PAIR_TYPE_UNSPECIFIED(0),
    PHYSICAL_DEVICE(1),
    LOCKSCREEN_KNOWLEDGE_FACTOR(2),
    LOCALLY_ENCRYPTED_PHYSICAL_DEVICE(3),
    LOCALLY_ENCRYPTED_LOCKSCREEN_KNOWLEDGE_FACTOR(4),
    MEMBER_TYPE_GOOGLE_PASSWORD_MANAGER_PIN(5),
    PRF_MEMBER(6),
    PROVIDER_KEYPAIR(7),
    MEMBER_TYPE_RECOVERY_CONTACT(8),
    UNRECOGNIZED(-1);

    private final int l;

    private ajxa(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ajxa.j) {
            return this.l;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static ajxa b(int v) {
        switch(v) {
            case 0: {
                return ajxa.a;
            }
            case 1: {
                return ajxa.b;
            }
            case 2: {
                return ajxa.c;
            }
            case 3: {
                return ajxa.d;
            }
            case 4: {
                return ajxa.e;
            }
            case 5: {
                return ajxa.f;
            }
            case 6: {
                return ajxa.g;
            }
            case 7: {
                return ajxa.h;
            }
            case 8: {
                return ajxa.i;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

