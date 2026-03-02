package j$.time.format;

import j..time.temporal.WeekFields;
import j..time.temporal.n;
import java.util.Locale;

public final class s extends j {
    public final char g;
    public final int h;

    public s(char c, int v, int v1, int v2, int v3) {
        super(null, v1, v2, d0.NOT_NEGATIVE, v3);
        this.g = c;
        this.h = v;
    }

    @Override  // j$.time.format.j
    public final j d() {
        return this.e == -1 ? this : new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override  // j$.time.format.j
    public final j e(int v) {
        return new s(this.g, this.h, this.b, this.c, this.e + v);
    }

    public final j f(Locale locale0) {
        WeekFields weekFields0 = WeekFields.of(locale0);
        switch(this.g) {
            case 87: {
                return new j(weekFields0.d, this.b, this.c, d0.NOT_NEGATIVE, this.e);
            }
            case 89: {
                n n0 = weekFields0.f;
                int v = this.h;
                if(v == 2) {
                    return new p(n0, 2, 2, p.h, this.e);
                }
                return v >= 4 ? new j(n0, v, 19, d0.EXCEEDS_PAD, this.e) : new j(n0, v, 19, d0.NORMAL, this.e);
            }
            case 99: 
            case 101: {
                return new j(weekFields0.c, this.b, this.c, d0.NOT_NEGATIVE, this.e);
            }
            case 0x77: {
                return new j(weekFields0.e, this.b, this.c, d0.NOT_NEGATIVE, this.e);
            }
            default: {
                throw new IllegalStateException("unreachable");
            }
        }
    }

    @Override  // j$.time.format.j
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        return this.f(x0.b.b).g(x0, stringBuilder0);
    }

    @Override  // j$.time.format.j
    public final int i(v v0, CharSequence charSequence0, int v1) {
        return this.f(v0.a.b).i(v0, charSequence0, v1);
    }

    @Override  // j$.time.format.j
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(30);
        stringBuilder0.append("Localized(");
        int v = this.h;
        int v1 = this.g;
        if(v1 == 89) {
            switch(v) {
                case 1: {
                    stringBuilder0.append("WeekBasedYear");
                    break;
                }
                case 2: {
                    stringBuilder0.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                    break;
                }
                default: {
                    stringBuilder0.append("WeekBasedYear,");
                    stringBuilder0.append(v);
                    stringBuilder0.append(",19,");
                    stringBuilder0.append((v >= 4 ? d0.EXCEEDS_PAD : d0.NORMAL));
                }
            }
        }
        else {
            switch(v1) {
                case 87: {
                    stringBuilder0.append("WeekOfMonth");
                    break;
                }
                case 99: 
                case 101: {
                    stringBuilder0.append("DayOfWeek");
                    break;
                }
                case 0x77: {
                    stringBuilder0.append("WeekOfWeekBasedYear");
                }
            }
            stringBuilder0.append(",");
            stringBuilder0.append(v);
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

