import java.util.UUID;

public final class buer implements buea {
    public final omn a;
    public final oko b;
    public final okn c;

    public buer(omn omn0) {
        this.a = omn0;
        this.b = new buep(this);
        this.c = new bueq(this);
    }

    @Override  // buea
    public final Object a(String s, budu budu0, buds buds0, ibrl ibrl0) {
        bued bued0 = new bued(this, s, budu0, buds0);
        return oqj.c(this.a, bued0, ibrl0);
    }

    @Override  // buea
    public final Object b(UUID uUID0, ibrl ibrl0) {
        buen buen0 = new buen(uUID0);
        return oqj.d(this.a, true, false, buen0, ibrl0);
    }

    @Override  // buea
    public final Object c(buew buew0, ibrl ibrl0) {
        bueb bueb0 = new bueb(this, buew0);
        return oqj.d(this.a, false, true, bueb0, ibrl0);
    }

    @Override  // buea
    public final Object d(buew buew0, ibrl ibrl0) {
        buee buee0 = new buee(this, buew0);
        return oqj.d(this.a, false, true, buee0, ibrl0);
    }

    @Override  // buea
    public final Object e(String s, budu budu0, buds buds0, ibrl ibrl0) {
        buej buej0 = new buej(this, s, budu0, buds0);
        return oqj.c(this.a, buej0, ibrl0);
    }

    public static final String f(buds buds0) {
        switch(buds0.ordinal()) {
            case 0: {
                return "PercentSafe";
            }
            case 1: {
                return "Percent80";
            }
            case 2: {
                return "Percent85";
            }
            case 3: {
                return "Percent90";
            }
            case 4: {
                return "Percent95";
            }
            case 5: {
                return "Percent98";
            }
            case 6: {
                return "Percent99";
            }
            case 7: {
                return "Percent100";
            }
            default: {
                throw new IllegalArgumentException("Can\'t convert enum to string, unknown enum value: " + buds0);
            }
        }
    }

    public static final buds g(String s) {
        switch(s) {
            case "Percent100": {
                return buds.h;
            }
            case "Percent80": {
                return buds.b;
            }
            case "Percent85": {
                return buds.c;
            }
            case "Percent90": {
                return buds.d;
            }
            case "Percent95": {
                return buds.e;
            }
            case "Percent98": {
                return buds.f;
            }
            case "Percent99": {
                return buds.g;
            }
            case "PercentSafe": {
                return buds.a;
            }
            default: {
                throw new IllegalArgumentException("Can\'t convert value to enum, unknown value: " + s);
            }
        }
    }

    public static final String h(budu budu0) {
        switch(budu0.ordinal()) {
            case 0: {
                return "None";
            }
            case 1: {
                return "GB30";
            }
            case 2: {
                return "GB100";
            }
            case 3: {
                return "GB200";
            }
            case 4: {
                return "TB2";
            }
            case 5: {
                return "UNSUPPORTED";
            }
            default: {
                throw new IllegalArgumentException("Can\'t convert enum to string, unknown enum value: " + budu0);
            }
        }
    }

    public static final budu i(String s) {
        switch(s) {
            case "GB100": {
                return budu.c;
            }
            case "GB200": {
                return budu.d;
            }
            case "GB30": {
                return budu.b;
            }
            case "None": {
                return budu.a;
            }
            case "TB2": {
                return budu.e;
            }
            case "UNSUPPORTED": {
                return budu.f;
            }
            default: {
                throw new IllegalArgumentException("Can\'t convert value to enum, unknown value: " + s);
            }
        }
    }
}

