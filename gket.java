public enum gket implements hfub {
    ERROR_UNKNOWN(0),
    ERROR_PEER_DISCONNECTED(1),
    ERROR_IO(2),
    ERROR_SSL(3),
    ERROR_TIMEOUT(4),
    ERROR_RELAY(5),
    ERROR_DEVICE_AUTH(6),
    ERROR_DEVICE_AUTH_ERROR_RECEIVED(7),
    ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_MALFORMED(8),
    ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_X509(9),
    ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_TRUSTED(10),
    ERROR_DEVICE_AUTH_SSL_CERT_NOT_TRUSTED(11),
    ERROR_DEVICE_AUTH_RESPONSE_MALFORMED(12),
    ERROR_CANCELED(13),
    ERROR_CAST_NEARBY_INVALID_REQUEST(14),
    ERROR_CANCELLED(15),
    ERROR_CRL_INVALID(16),
    ERROR_EMPTY_CRL_INVALID(46),
    ERROR_CRL_TIME_INVALID(0x30),
    ERROR_CRL_REVOCATION_CHECK_FAILED(17),
    ERROR_DOWNLOADED_CRL_REVOCATION_CHECK_FAILED(0x2F),
    ERROR_DEVICE_AUTH_TIMEOUT(18),
    ERROR_DEVICE_AUTH_PARSE_FAILURE(19),
    ERROR_DEVICE_AUTH_CHALLENGE_RECEIVED(20),
    ERROR_RELAY_CASTING_DISABLED(21),
    ERROR_RELAY_CASTING_NO_ACCOUNT_CONFIGURED(22),
    ERROR_RELAY_CASTING_DEVICE_NOT_FOUND_ON_LOCAL_NETWORK(23),
    ERROR_RELAY_CASTING_GRPC_SERVER_ERROR(24),
    ERROR_RELAY_CASTING_INVALID_SERVER_RESPONSE(25),
    ERROR_RELAY_CASTING_SOCKET_CONNECT_EXCEPTION(26),
    ERROR_RELAY_CASTING_RAT_MISSING(27),
    ERROR_RELAY_CASTING_RAT_INVALID(28),
    ERROR_RELAY_CASTING_SERVER_RESPONSE_HAS_NO_SESSION(29),
    ERROR_RELAY_CASTING_INVALID_SERVER_ADDRESS(30),
    ERROR_RELAY_CASTING_DEVICE_NOT_LINKED_TO_USER(0x1F),
    ERROR_RELAY_CASTING_DEVICE_NOT_SUPPORTED(0x20),
    ERROR_RELAY_CASTING_DEVICE_CERTIFICATE_ABSENT(33),
    ERROR_RELAY_CASTING_FAILED_TO_COMMUNICATE_DEVICE(34),
    ERROR_RELAY_CASTING_RAT_REJECTED_BY_SERVER(35),
    ERROR_RELAY_CASTING_CLOUD_DEVICE_ID_NOT_FOUND(36),
    ERROR_RELAY_CASTING_SERVER_ERROR_UNKNOWN(37),
    ERROR_RELAY_CASTING_DEVICE_AUTHENTICATION_FAILURE(38),
    ERROR_RELAY_CASTING_PEER_PK_HASH_ABSENT(39),
    ERROR_HASH_SIG_ALGORITHM_STRING_GENERATION_ERROR(40),
    ERROR_RELAY_CASTING_DEVICE_PUBLISHED_AS_LOCAL(41),
    ERROR_RELAY_CASTING_DEVICE_PUBLISHED_AS_CLOUD(42),
    ERROR_RELAY_CASTING_DISABLED_BY_OWNER(43),
    ERROR_RELAY_CASTING_NO_ACCOUNT_LINKED(44),
    ERROR_RELAY_CASTING_TARGET_DEVICE_NOT_ELIGIBLE_FOR_REMOTE_CASTING(45),
    ERROR_OTHER(99);

    public final int Y;

    private gket(int v1) {
        this.Y = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.Y;
    }

    public static gket b(int v) {
        if(v != 99) {
            switch(v) {
                case 0: {
                    return gket.a;
                }
                case 1: {
                    return gket.b;
                }
                case 2: {
                    return gket.c;
                }
                case 3: {
                    return gket.d;
                }
                case 4: {
                    return gket.e;
                }
                case 5: {
                    return gket.f;
                }
                case 6: {
                    return gket.g;
                }
                case 7: {
                    return gket.h;
                }
                case 8: {
                    return gket.i;
                }
                case 9: {
                    return gket.j;
                }
                case 10: {
                    return gket.k;
                }
                case 11: {
                    return gket.l;
                }
                case 12: {
                    return gket.m;
                }
                case 13: {
                    return gket.n;
                }
                case 14: {
                    return gket.o;
                }
                case 15: {
                    return gket.p;
                }
                case 16: {
                    return gket.q;
                }
                case 17: {
                    return gket.t;
                }
                case 18: {
                    return gket.v;
                }
                case 19: {
                    return gket.w;
                }
                case 20: {
                    return gket.x;
                }
                case 21: {
                    return gket.y;
                }
                case 22: {
                    return gket.z;
                }
                case 23: {
                    return gket.A;
                }
                case 24: {
                    return gket.B;
                }
                case 25: {
                    return gket.C;
                }
                case 26: {
                    return gket.D;
                }
                case 27: {
                    return gket.E;
                }
                case 28: {
                    return gket.F;
                }
                case 29: {
                    return gket.G;
                }
                case 30: {
                    return gket.H;
                }
                case 0x1F: {
                    return gket.I;
                }
                case 0x20: {
                    return gket.J;
                }
                case 33: {
                    return gket.K;
                }
                case 34: {
                    return gket.L;
                }
                case 35: {
                    return gket.M;
                }
                case 36: {
                    return gket.N;
                }
                case 37: {
                    return gket.O;
                }
                case 38: {
                    return gket.P;
                }
                case 39: {
                    return gket.Q;
                }
                case 40: {
                    return gket.R;
                }
                case 41: {
                    return gket.S;
                }
                case 42: {
                    return gket.T;
                }
                case 43: {
                    return gket.U;
                }
                case 44: {
                    return gket.V;
                }
                case 45: {
                    return gket.W;
                }
                case 46: {
                    return gket.r;
                }
                case 0x2F: {
                    return gket.u;
                }
                case 0x30: {
                    return gket.s;
                }
                default: {
                    return null;
                }
            }
        }
        return gket.X;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.Y);
    }
}

