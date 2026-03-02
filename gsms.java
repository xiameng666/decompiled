public enum gsms implements hfub {
    ADDRESS_COMPONENT_TYPE_UNSPECIFIED(0),
    STREET_ADDRESS(1),
    ROUTE(2),
    INTERSECTION(3),
    POLITICAL(4),
    COUNTRY(5),
    ADMINISTRATIVE_AREA_LEVEL_1(6),
    ADMINISTRATIVE_AREA_LEVEL_2(7),
    ADMINISTRATIVE_AREA_LEVEL_3(8),
    ADMINISTRATIVE_AREA_LEVEL_4(9),
    ADMINISTRATIVE_AREA_LEVEL_5(10),
    COLLOQUIAL_AREA(11),
    LOCALITY(12),
    WARD(13),
    SUBLOCALITY(14),
    SUBLOCALITY_LEVEL_1(15),
    SUBLOCALITY_LEVEL_2(16),
    SUBLOCALITY_LEVEL_3(17),
    SUBLOCALITY_LEVEL_4(18),
    SUBLOCALITY_LEVEL_5(19),
    NEIGHBORHOOD(20),
    PREMISE(21),
    SUBPREMISE(22),
    POSTAL_CODE(23),
    NATURAL_FEATURE(24),
    AIRPORT(25),
    PARK(26),
    POINT_OF_INTEREST(27),
    FLOOR(28),
    ESTABLISHMENT(29),
    PARKING(30),
    POST_BOX(0x1F),
    POSTAL_TOWN(0x20),
    ROOM(33),
    STREET_NUMBER(34),
    BUS_STATION(35),
    TRAIN_STATION(36),
    TRANSIT_STATION(37);

    private final int N;

    private gsms(int v1) {
        this.N = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.N;
    }

    public static gsms b(int v) {
        switch(v) {
            case 0: {
                return gsms.a;
            }
            case 1: {
                return gsms.b;
            }
            case 2: {
                return gsms.c;
            }
            case 3: {
                return gsms.d;
            }
            case 4: {
                return gsms.e;
            }
            case 5: {
                return gsms.f;
            }
            case 6: {
                return gsms.g;
            }
            case 7: {
                return gsms.h;
            }
            case 8: {
                return gsms.i;
            }
            case 9: {
                return gsms.j;
            }
            case 10: {
                return gsms.k;
            }
            case 11: {
                return gsms.l;
            }
            case 12: {
                return gsms.m;
            }
            case 13: {
                return gsms.n;
            }
            case 14: {
                return gsms.o;
            }
            case 15: {
                return gsms.p;
            }
            case 16: {
                return gsms.q;
            }
            case 17: {
                return gsms.r;
            }
            case 18: {
                return gsms.s;
            }
            case 19: {
                return gsms.t;
            }
            case 20: {
                return gsms.u;
            }
            case 21: {
                return gsms.v;
            }
            case 22: {
                return gsms.w;
            }
            case 23: {
                return gsms.x;
            }
            case 24: {
                return gsms.y;
            }
            case 25: {
                return gsms.z;
            }
            case 26: {
                return gsms.A;
            }
            case 27: {
                return gsms.B;
            }
            case 28: {
                return gsms.C;
            }
            case 29: {
                return gsms.D;
            }
            case 30: {
                return gsms.E;
            }
            case 0x1F: {
                return gsms.F;
            }
            case 0x20: {
                return gsms.G;
            }
            case 33: {
                return gsms.H;
            }
            case 34: {
                return gsms.I;
            }
            case 35: {
                return gsms.J;
            }
            case 36: {
                return gsms.K;
            }
            case 37: {
                return gsms.L;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.N);
    }
}

