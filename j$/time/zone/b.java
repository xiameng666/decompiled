package j$.time.zone;

import j..time.LocalDateTime;
import j..time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class b implements Serializable, Comparable {
    public final long a;
    public final LocalDateTime b;
    public final ZoneOffset c;
    public final ZoneOffset d;
    private static final long serialVersionUID = 0x9F9AB17D4C397C9EL;

    public b(long v, ZoneOffset zoneOffset0, ZoneOffset zoneOffset1) {
        this.a = v;
        this.b = LocalDateTime.I(v, 0, zoneOffset0);
        this.c = zoneOffset0;
        this.d = zoneOffset1;
    }

    public b(LocalDateTime localDateTime0, ZoneOffset zoneOffset0, ZoneOffset zoneOffset1) {
        this.a = localDateTime0.toEpochSecond(zoneOffset0);
        this.b = localDateTime0;
        this.c = zoneOffset0;
        this.d = zoneOffset1;
    }

    @Override
    public final int compareTo(Object object0) {
        return Long.compare(this.a, ((b)object0).a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof b) && this.a == ((b)object0).a && this.c.equals(((b)object0).c) && this.d.equals(((b)object0).d);
    }

    public final boolean g() {
        return this.d.b > this.c.b;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.b ^ Integer.rotateLeft(this.d.b, 16);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        return "Transition[" + (this.g() ? "Gap" : "Overlap") + " at " + this.b + this.c + " to " + this.d + ']';
    }

    private Object writeReplace() {
        return new a(2, this);
    }
}

