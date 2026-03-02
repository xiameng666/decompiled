import java.io.Serializable;
import java.util.TreeSet;

public final class eiex implements Serializable {
    public final String a;
    public final Integer b;
    public final Long c;
    public final Integer d;
    public final Long e;
    public final TreeSet f;
    public final Long g;
    public final Integer h;
    public final gwog i;
    public final String j;

    public eiex() {
        throw null;
    }

    public eiex(String s, Integer integer0, Long long0, Integer integer1, Long long1, TreeSet treeSet0, Long long2, Integer integer2, gwog gwog0, String s1) {
        this.a = s;
        this.b = integer0;
        this.c = long0;
        this.d = integer1;
        this.e = long1;
        this.f = treeSet0;
        this.g = long2;
        this.h = integer2;
        this.i = gwog0;
        this.j = s1;
    }

    public static eiev a() {
        eiev eiev0 = new eiev();
        eiev0.g(new TreeSet(new eiew()));
        return eiev0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof eiex) && this.a.equals(((eiex)object0).a)) {
            Integer integer0 = this.b;
            if(integer0 != null) {
                if(integer0.equals(((eiex)object0).b)) {
                label_8:
                    Long long0 = this.c;
                    if(long0 != null) {
                        if(long0.equals(((eiex)object0).c)) {
                        label_13:
                            Integer integer1 = this.d;
                            if(integer1 != null) {
                                if(integer1.equals(((eiex)object0).d)) {
                                label_18:
                                    Long long1 = this.e;
                                    if(long1 != null) {
                                        if(long1.equals(((eiex)object0).e)) {
                                        label_23:
                                            if(this.f.equals(((eiex)object0).f)) {
                                                Long long2 = this.g;
                                                if(long2 != null) {
                                                    if(long2.equals(((eiex)object0).g)) {
                                                    label_29:
                                                        Integer integer2 = this.h;
                                                        if(integer2 != null) {
                                                            if(integer2.equals(((eiex)object0).h)) {
                                                            label_34:
                                                                gwog gwog0 = this.i;
                                                                if(gwog0 == null) {
                                                                    if(((eiex)object0).i == null) {
                                                                        return this.j == null ? ((eiex)object0).j == null : this.j.equals(((eiex)object0).j);
                                                                    }
                                                                }
                                                                else if(gwog0.equals(((eiex)object0).i)) {
                                                                    return this.j == null ? ((eiex)object0).j == null : this.j.equals(((eiex)object0).j);
                                                                }
                                                            }
                                                        }
                                                        else if(((eiex)object0).h == null) {
                                                            goto label_34;
                                                        }
                                                    }
                                                }
                                                else if(((eiex)object0).g == null) {
                                                    goto label_29;
                                                }
                                            }
                                        }
                                    }
                                    else if(((eiex)object0).e == null) {
                                        goto label_23;
                                    }
                                }
                            }
                            else if(((eiex)object0).d == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((eiex)object0).c == null) {
                        goto label_13;
                    }
                }
            }
            else if(((eiex)object0).b == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ (this.b == null ? 0 : this.b.hashCode())) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003 ^ (this.e == null ? 0 : this.e.hashCode())) * 1000003 ^ this.f.hashCode()) * 1000003;
        int v2 = this.g == null ? 0 : this.g.hashCode();
        int v3 = this.h == null ? 0 : this.h.hashCode();
        int v4 = this.i == null ? 0 : this.i.hashCode();
        String s = this.j;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "TagRingingInfo{macAddress=" + this.a + ", deviceType=" + this.b + ", lastSeenEpochMillis=" + this.c + ", lastConnectionStatus=" + this.d + ", ringingAttemptEpochMillis=" + this.e + ", ringingOperations=" + this.f + ", preRingingScanEpochMillis=" + this.g + ", rssi=" + this.h + ", preRingingScanResult=" + this.i + ", finderRingKey=" + this.j + "}";
    }
}

