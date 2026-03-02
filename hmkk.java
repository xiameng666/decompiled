import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public final class hmkk {
    final hmkz a;
    final hmlb b;
    final hmld c;
    final hmlc d;

    public hmkk(hmlg hmlg0, hmqm hmqm0) {
        this.a = new hmkz(hmlg0, hmqm0);
        this.b = new hmlb(hmlg0, hmqm0);
        this.c = new hmld(hmlg0, hmqm0);
        this.d = new hmlc(hmlg0);
    }

    public final hmli a(String s, hmli hmli0, hmli hmli1) {
        hmkz hmkz4;
        hmkz hmkz3;
        hmkz hmkz2;
        hmkz hmkz1;
        hmkz hmkz0;
        boolean z = true;
        Boolean boolean0 = Boolean.valueOf(true);
        Boolean boolean1 = Boolean.valueOf(false);
        switch(s.hashCode()) {
            case 37: {
                if(s.equals("%")) {
                    try {
                        hmkz0 = this.a;
                        hmli hmli2 = hmlx.f(hmli1, hmli0);
                        if(hmli2 != null) {
                            hmli hmli3 = new hmli(hmli2.d);
                            hmli3.e = hmli2.e;
                            return hmli3;
                        }
                        hmkg hmkg0 = new hmkg(10);
                        hmkg hmkg1 = (hmkg)hmkz0.b.b(hmli1, hmkg0);
                        hmkg hmkg2 = new hmkg(10);
                        hmkg hmkg3 = (hmkg)hmkz0.b.b(hmli0, hmkg2);
                        new hmkg(hmkg1.a.remainder(hmkg3.a), 10);
                        return new hmli(new hmkg(hmkg1.a.remainder(hmkg3.a), 10));
                    }
                    catch(Exception exception0) {
                        hmkz0.a.a("Exception executing remainder method", exception0);
                        return new hmli(exception0.getMessage());
                    }
                }
                break;
            }
            case 38: {
                if(s.equals("&")) {
                    ArrayList arrayList0 = new ArrayList(Arrays.asList(new hmli[]{hmli1, hmli0}));
                    return this.b.a(arrayList0);
                }
                break;
            }
            case 42: {
                if(s.equals("*")) {
                    try {
                        hmkz1 = this.a;
                        hmli hmli4 = hmlx.f(hmli1, hmli0);
                        if(hmli4 != null) {
                            hmli hmli5 = new hmli(hmli4.d);
                            hmli5.e = hmli4.e;
                            return hmli5;
                        }
                        hmkg hmkg4 = new hmkg(10);
                        hmkg hmkg5 = (hmkg)hmkz1.b.b(hmli1, hmkg4);
                        hmkg hmkg6 = new hmkg(10);
                        hmkg hmkg7 = (hmkg)hmkz1.b.b(hmli0, hmkg6);
                        new hmkg(hmkg5.a.multiply(hmkg7.a), 10);
                        return new hmli(new hmkg(hmkg5.a.multiply(hmkg7.a), 10));
                    }
                    catch(Exception exception1) {
                        hmkz1.a.a("Exception executing multiply method", exception1);
                        return new hmli(exception1.getMessage());
                    }
                }
                break;
            }
            case 43: {
                if(s.equals("+")) {
                    try {
                        hmkz2 = this.a;
                        hmli hmli6 = hmlx.f(hmli1, hmli0);
                        if(hmli6 != null) {
                            return hmli6;
                        }
                        hmli hmli7 = (hmli1.a instanceof String) ? new hmli(hmkz2.b.c(((String)hmli1.a))) : hmli1;
                        hmli hmli8 = (hmli0.a instanceof String) ? new hmli(hmkz2.b.c(((String)hmli0.a))) : hmli0;
                        Object object0 = hmli7.a;
                        if((object0 instanceof String) && (hmli8.a instanceof String)) {
                            return new hmli(hmli7.a + hmli8.a);
                        }
                        if(hmlx.k(object0.toString()) && hmlx.k(hmli8.a.toString())) {
                            hmkg hmkg8 = new hmkg(10);
                            hmkg hmkg9 = (hmkg)hmkz2.b.b(hmli1, hmkg8);
                            hmkg hmkg10 = new hmkg(10);
                            hmkg hmkg11 = (hmkg)hmkz2.b.b(hmli0, hmkg10);
                            new hmkg(hmkg9.a.add(hmkg11.a), 10);
                            return new hmli(new hmkg(hmkg9.a.add(hmkg11.a), 10));
                        }
                        return new hmli(hmli7.a.toString() + hmli8.a.toString());
                    }
                    catch(Exception exception2) {
                        hmkz2.a.a("Exception executing plus method", exception2);
                        return new hmli(exception2.getMessage());
                    }
                }
                break;
            }
            case 45: {
                if(s.equals("-")) {
                    try {
                        hmkz3 = this.a;
                        hmli hmli9 = hmlx.f(hmli1, hmli0);
                        if(hmli9 != null) {
                            hmli hmli10 = new hmli(hmli9.d);
                            hmli10.e = hmli9.e;
                            return hmli10;
                        }
                        hmkg hmkg12 = new hmkg(10);
                        hmkg hmkg13 = (hmkg)hmkz3.b.b(hmli1, hmkg12);
                        hmkg hmkg14 = new hmkg(10);
                        hmkg hmkg15 = (hmkg)hmkz3.b.b(hmli0, hmkg14);
                        new hmkg(hmkg13.a.subtract(hmkg15.a), 10);
                        return new hmli(new hmkg(hmkg13.a.subtract(hmkg15.a), 10));
                    }
                    catch(Exception exception3) {
                        hmkz3.a.a("Exception executing minus method", exception3);
                        return new hmli(exception3.getMessage());
                    }
                }
                break;
            }
            case 0x2F: {
                if(s.equals("/")) {
                    try {
                        hmkz4 = this.a;
                        hmli hmli11 = hmlx.f(hmli1, hmli0);
                        if(hmli11 != null) {
                            hmli hmli12 = new hmli(hmli11.d);
                            hmli12.e = hmli11.e;
                            return hmli12;
                        }
                        hmkg hmkg16 = new hmkg(10);
                        hmkg hmkg17 = (hmkg)hmkz4.b.b(hmli1, hmkg16);
                        hmkg hmkg18 = new hmkg(10);
                        hmkg hmkg19 = (hmkg)hmkz4.b.b(hmli0, hmkg18);
                        new hmkg(hmkg17.a.divide(hmkg19.a), 10);
                        return new hmli(new hmkg(hmkg17.a.divide(hmkg19.a, 6, RoundingMode.UP), 10));
                    }
                    catch(Exception exception4) {
                        hmkz4.a.a("Exception executing divide method", exception4);
                        return new hmli(exception4.getMessage());
                    }
                }
                break;
            }
            case 60: {
                if(s.equals("<")) {
                    hmld hmld0 = this.c;
                    hmli hmli13 = hmld0.b.a(hmli1);
                    hmli hmli14 = hmld0.b.a(hmli0);
                    hmli hmli15 = hmld.a(hmli13, hmli14);
                    if(hmli15 == null) {
                        try {
                            hmli13.a(hmli14);
                            if(hmli13.a(hmli14) >= 0) {
                                z = false;
                            }
                            return new hmli(Boolean.valueOf(z));
                        }
                        catch(Exception exception5) {
                            hmld0.a.a("Exception comparing the input values", exception5);
                            return new hmli(exception5.getMessage());
                        }
                    }
                    return hmli15;
                }
                break;
            }
            case 62: {
                if(s.equals(">")) {
                    hmld hmld1 = this.c;
                    hmli hmli16 = hmld1.b.a(hmli1);
                    hmli hmli17 = hmld1.b.a(hmli0);
                    hmli hmli18 = hmld.a(hmli16, hmli17);
                    if(hmli18 == null) {
                        try {
                            hmli16.a(hmli17);
                            if(hmli16.a(hmli17) <= 0) {
                                z = false;
                            }
                            return new hmli(Boolean.valueOf(z));
                        }
                        catch(Exception exception6) {
                            hmld1.a.a("Exception comparing the input values", exception6);
                            return new hmli(exception6.getMessage());
                        }
                    }
                    return hmli18;
                }
                break;
            }
            case 94: {
                if(s.equals("^")) {
                    ArrayList arrayList1 = new ArrayList(Arrays.asList(new hmli[]{hmli1, hmli0}));
                    return this.b.e(arrayList1);
                }
                break;
            }
            case 0x7C: {
                if(s.equals("|")) {
                    ArrayList arrayList2 = new ArrayList(Arrays.asList(new hmli[]{hmli1, hmli0}));
                    return this.b.c(arrayList2);
                }
                break;
            }
            case 1084: {
                if(s.equals("!=")) {
                    hmld hmld2 = this.c;
                    hmli hmli19 = hmld2.b.a(hmli1);
                    hmli hmli20 = hmld2.b.a(hmli0);
                    hmli hmli21 = hmld.a(hmli19, hmli20);
                    if(hmli21 == null) {
                        try {
                            hmli19.a(hmli20);
                            if(hmli19.a(hmli20) == 0) {
                                z = false;
                            }
                            return new hmli(Boolean.valueOf(z));
                        }
                        catch(Exception exception7) {
                            hmld2.a.a("Exception comparing the input values", exception7);
                            return new hmli(exception7.getMessage());
                        }
                    }
                    return hmli21;
                }
                break;
            }
            case 0x7A0: {
                if(s.equals("==")) {
                    hmld hmld3 = this.c;
                    hmli hmli22 = hmld3.b.a(hmli1);
                    hmli hmli23 = hmld3.b.a(hmli0);
                    hmli hmli24 = hmld.a(hmli22, hmli23);
                    if(hmli24 == null) {
                        try {
                            hmli22.a(hmli23);
                            if(hmli22.a(hmli23) != 0) {
                                z = false;
                            }
                            return new hmli(Boolean.valueOf(z));
                        }
                        catch(Exception exception8) {
                            hmld3.a.a("Exception comparing the input values", exception8);
                            return new hmli(exception8.getMessage());
                        }
                    }
                    return hmli24;
                }
                break;
            }
            case 0xD87: {
                if(s.equals("ls")) {
                    ArrayList arrayList3 = new ArrayList(Arrays.asList(new hmli[]{hmli1, hmli0}));
                    return this.b.b(arrayList3);
                }
                break;
            }
            case 0xDE3: {
                if(s.equals("or")) {
                    hmli hmli25 = this.d.a.a(hmli1);
                    hmli hmli26 = this.d.a.a(hmli0);
                    if(hmlx.f(hmli25, hmli26) != null) {
                        Objects.toString(boolean1);
                        return new hmli(boolean1);
                    }
                    if((hmli25.a instanceof Boolean) && (hmli26.a instanceof Boolean) && hmli25.a.equals(Boolean.FALSE) && hmli26.a.equals(Boolean.FALSE)) {
                        Objects.toString(boolean1);
                        return new hmli(boolean1);
                    }
                    Objects.toString(boolean0);
                    return new hmli(boolean0);
                }
                break;
            }
            case 0xE41: {
                if(s.equals("rs")) {
                    ArrayList arrayList4 = new ArrayList(Arrays.asList(new hmli[]{hmli1, hmli0}));
                    return this.b.d(arrayList4);
                }
                break;
            }
            case 96727: {
                if(s.equals("and")) {
                    hmli hmli27 = this.d.a.a(hmli1);
                    hmli hmli28 = this.d.a.a(hmli0);
                    if(hmlx.f(hmli27, hmli28) != null) {
                        Objects.toString(boolean1);
                        return new hmli(boolean1);
                    }
                    if((hmli27.a instanceof Boolean) && hmli27.a.equals(Boolean.FALSE)) {
                        Objects.toString(boolean1);
                        return new hmli(boolean1);
                    }
                    if((hmli28.a instanceof Boolean) && hmli28.a.equals(Boolean.FALSE)) {
                        Objects.toString(boolean1);
                        return new hmli(boolean1);
                    }
                    Objects.toString(boolean0);
                    return new hmli(boolean0);
                }
                break;
            }
            case 0x364E1D: {
                if(s.equals("then")) {
                    hmli hmli29 = this.c.b.a(hmli1);
                    hmli hmli30 = this.c.b.a(hmli0);
                    if(hmli29.b) {
                        return hmli29;
                    }
                    return !(hmli29.a instanceof Boolean) || !hmli29.a.equals(boolean1) ? hmli30 : hmli29;
                }
                break;
            }
            default: {
                return hmli1;
            }
        }
        return hmli1;
    }
}

