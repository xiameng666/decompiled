package j$.time.zone;

import j..time.DayOfWeek;
import j..time.LocalTime;
import j..time.Month;
import j..time.ZoneOffset;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class d implements Serializable {
    public final Month a;
    public final byte b;
    public final DayOfWeek c;
    public final LocalTime d;
    public final boolean e;
    public final c f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;
    private static final long serialVersionUID = 0x5F9ACF201199524BL;

    public d(Month month0, int v, DayOfWeek dayOfWeek0, LocalTime localTime0, boolean z, c c0, ZoneOffset zoneOffset0, ZoneOffset zoneOffset1, ZoneOffset zoneOffset2) {
        this.a = month0;
        this.b = (byte)v;
        this.c = dayOfWeek0;
        this.d = localTime0;
        this.e = z;
        this.f = c0;
        this.g = zoneOffset0;
        this.h = zoneOffset1;
        this.i = zoneOffset2;
    }

    public static d a(ObjectInput objectInput0) {
        int v = objectInput0.readInt();
        Month month0 = Month.K(v >>> 28);
        int v1 = ((0xFC00000 & v) >>> 22) - 0x20;
        int v2 = (0x380000 & v) >>> 19;
        DayOfWeek dayOfWeek0 = v2 == 0 ? null : DayOfWeek.H(v2);
        int v3 = (0x7C000 & v) >>> 14;
        c c0 = c.values()[(v & 0x3000) >>> 12];
        int v4 = (v & 0xFF0) >>> 4;
        int v5 = (v & 12) >>> 2;
        boolean z = false;
        LocalTime localTime0 = v3 == 0x1F ? LocalTime.ofSecondOfDay(objectInput0.readInt()) : LocalTime.L(v3 % 24, 0);
        ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((v4 == 0xFF ? objectInput0.readInt() : (v4 - 0x80) * 900));
        ZoneOffset zoneOffset1 = ZoneOffset.ofTotalSeconds((v5 == 3 ? objectInput0.readInt() : v5 * 1800 + zoneOffset0.b));
        ZoneOffset zoneOffset2 = (v & 3) == 3 ? ZoneOffset.ofTotalSeconds(objectInput0.readInt()) : ZoneOffset.ofTotalSeconds((v & 3) * 1800 + zoneOffset0.b);
        if(v3 == 24) {
            z = true;
        }
        Objects.requireNonNull(month0, "month");
        Objects.requireNonNull(localTime0, "time");
        Objects.requireNonNull(c0, "timeDefnition");
        Objects.requireNonNull(zoneOffset0, "standardOffset");
        Objects.requireNonNull(zoneOffset1, "offsetBefore");
        Objects.requireNonNull(zoneOffset2, "offsetAfter");
        if(v1 < -28 || v1 > 0x1F || v1 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if(localTime0.getNano() == 0) {
            return new d(month0, v1, dayOfWeek0, localTime0, z, c0, zoneOffset0, zoneOffset1, zoneOffset2);
        }
        throw new IllegalArgumentException("Time\'s nano-of-second must be zero");
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof d) && this.a == ((d)object0).a && this.b == ((d)object0).b && this.c == ((d)object0).c && this.f == ((d)object0).f && this.d.equals(((d)object0).d) && this.e == ((d)object0).e && this.g.equals(((d)object0).g) && this.h.equals(((d)object0).h) && this.i.equals(((d)object0).i);
    }

    @Override
    public final int hashCode() {
        int v = (this.d.U() + this.e << 15) + (this.a.ordinal() << 11) + (this.b + 0x20 << 5);
        return this.c == null ? this.g.b ^ this.f.ordinal() + (v + 28) ^ this.h.b ^ this.i.b : this.g.b ^ this.f.ordinal() + (v + (this.c.ordinal() << 2)) ^ this.h.b ^ this.i.b;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TransitionRule[");
        this.h.getClass();
        stringBuilder0.append((this.i.b - this.h.b <= 0 ? "Overlap " : "Gap "));
        stringBuilder0.append(this.h);
        stringBuilder0.append(" to ");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", ");
        Month month0 = this.a;
        int v = this.b;
        DayOfWeek dayOfWeek0 = this.c;
        if(dayOfWeek0 == null) {
            stringBuilder0.append(month0.name());
            stringBuilder0.append(' ');
            stringBuilder0.append(v);
        }
        else if(v == -1) {
            stringBuilder0.append(dayOfWeek0.name());
            stringBuilder0.append(" on or before last day of ");
            stringBuilder0.append(month0.name());
        }
        else if(v < 0) {
            stringBuilder0.append(dayOfWeek0.name());
            stringBuilder0.append(" on or before last day minus ");
            stringBuilder0.append(-v - 1);
            stringBuilder0.append(" of ");
            stringBuilder0.append(month0.name());
        }
        else {
            stringBuilder0.append(dayOfWeek0.name());
            stringBuilder0.append(" on or after ");
            stringBuilder0.append(month0.name());
            stringBuilder0.append(' ');
            stringBuilder0.append(v);
        }
        stringBuilder0.append(" at ");
        stringBuilder0.append((this.e ? "24:00" : this.d.toString()));
        stringBuilder0.append(" ");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", standard offset ");
        stringBuilder0.append(this.g);
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput0) {
        int v4;
        LocalTime localTime0 = this.d;
        boolean z = this.e;
        int v = z ? 86400 : localTime0.U();
        int v1 = this.g.b;
        ZoneOffset zoneOffset0 = this.h;
        int v2 = zoneOffset0.b - v1;
        ZoneOffset zoneOffset1 = this.i;
        int v3 = zoneOffset1.b - v1;
        if(v % 3600 != 0) {
            v4 = 0x1F;
        }
        else if(z) {
            v4 = 24;
        }
        else {
            v4 = localTime0.getHour();
        }
        int v5 = v1 % 900 == 0 ? v1 / 900 + 0x80 : 0xFF;
        int v6 = v2 == 0 || v2 == 1800 || v2 == 3600 ? v2 / 1800 : 3;
        int v7 = v3 == 0 || v3 == 1800 || v3 == 3600 ? v3 / 1800 : 3;
        objectOutput0.writeInt((this.a.getValue() << 28) + (this.b + 0x20 << 22) + ((this.c == null ? 0 : this.c.getValue()) << 19) + (v4 << 14) + (this.f.ordinal() << 12) + (v5 << 4) + (v6 << 2) + v7);
        if(v4 == 0x1F) {
            objectOutput0.writeInt(v);
        }
        if(v5 == 0xFF) {
            objectOutput0.writeInt(v1);
        }
        if(v6 == 3) {
            objectOutput0.writeInt(zoneOffset0.b);
        }
        if(v7 == 3) {
            objectOutput0.writeInt(zoneOffset1.b);
        }
    }

    private Object writeReplace() {
        return new a(3, this);
    }
}

