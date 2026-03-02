import j..util.Optional;

final class cqpb {
    public final gged_interceptors a;
    public final Optional b;
    public final int c;

    public cqpb() {
        throw null;
    }

    public cqpb(int v, gged_interceptors gged0, Optional optional0) {
        this.c = v;
        if(gged0 == null) {
            throw new NullPointerException("Null phoneNumbers");
        }
        this.a = gged0;
        if(optional0 == null) {
            throw new NullPointerException("Null constellationErrorDetails");
        }
        this.b = optional0;
    }

    public static cqpb a() {
        return new cqpb(4, ggna.a, Optional.empty());
    }

    public static cqpb b(aztb aztb0) {
        gged_interceptors gged0 = ggna.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzc.a).v_newBuilder();
        int v = aztb0.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzc hgzc0 = (hgzc)hftp0.b_message;
        hgzc0.b = 1;
        hgzc0.c = v;
        return new cqpb(4, gged0, Optional.of(((hgzc)hftp0.N_build())));
    }

    public static cqpb c(gged_interceptors gged0) {
        return new cqpb(7, gged0, Optional.empty());
    }

    final Optional d() {
        switch(this.c - 1) {
            case 0: {
                return Optional.of(cqpc.c);
            }
            case 3: {
                return Optional.of(cqpc.g);
            }
            case 4: {
                return Optional.of(cqpc.e);
            }
            case 5: {
                return Optional.of(cqpc.f);
            }
            default: {
                return Optional.empty();
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof cqpb) && this.c == ((cqpb)object0).c && ggia.i(this.a, ((cqpb)object0).a) && this.b.equals(((cqpb)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ ((this.c ^ 1000003) * 1000003 ^ this.a.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        switch(this.c) {
            case 1: {
                return "PhoneNumberState{status=MISSING_PHONE_NUMBER, phoneNumbers=" + this.a.toString() + ", constellationErrorDetails=" + this.b.toString() + "}";
            }
            case 2: {
                return "PhoneNumberState{status=UNKNOWN, phoneNumbers=" + this.a.toString() + ", constellationErrorDetails=" + this.b.toString() + "}";
            }
            case 3: {
                return "PhoneNumberState{status=PENDING_RESULT, phoneNumbers=" + this.a.toString() + ", constellationErrorDetails=" + this.b.toString() + "}";
            }
            case 4: {
                return "PhoneNumberState{status=ERROR, phoneNumbers=" + this.a.toString() + ", constellationErrorDetails=" + this.b.toString() + "}";
            }
            case 5: {
                return "PhoneNumberState{status=MISSING_CONSENT, phoneNumbers=" + this.a.toString() + ", constellationErrorDetails=" + this.b.toString() + "}";
            }
            case 6: {
                return "PhoneNumberState{status=NOT_VERIFIED, phoneNumbers=" + this.a.toString() + ", constellationErrorDetails=" + this.b.toString() + "}";
            }
            default: {
                return "PhoneNumberState{status=VERIFIED, phoneNumbers=" + this.a.toString() + ", constellationErrorDetails=" + this.b.toString() + "}";
            }
        }
    }
}

