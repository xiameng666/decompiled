import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class hmkj {
    final hmlg a;
    final hmqm b;
    final hmkw c;
    final hmkp d;
    final hmkl e;
    final hmku f;
    final hmkr g;
    final hmkn h;
    final hmlb i;

    public hmkj(hmlg hmlg0, hmqm hmqm0) {
        this.a = hmlg0;
        this.b = hmqm0;
        this.c = new hmkw(hmlg0, hmqm0);
        this.d = new hmkp(hmlg0, hmqm0);
        this.e = new hmkl(hmlg0, hmqm0);
        this.f = new hmku(hmlg0, hmqm0);
        this.g = new hmkr(hmlg0, hmqm0);
        this.h = new hmkn(hmlg0, hmqm0);
        this.i = new hmlb(hmlg0, hmqm0);
    }

    public final hmli a(hmlf hmlf0, String s, List list0) {
        hmli hmli124;
        hmli hmli116;
        hmli hmli108;
        hmli hmli102;
        hmli hmli88;
        hmli hmli70;
        hmli hmli62;
        hmli hmli58;
        hmli hmli55;
        hmli hmli46;
        hmli hmli34;
        hmli hmli23;
        hmli hmli19;
        hmli hmli15;
        hmli hmli9;
        boolean z = false;
        switch(s.hashCode()) {
            case -1960432984: {
                if(s.equals("applyByteEndianness")) {
                    try {
                        hmli hmli0 = this.c.b(list0);
                        this.b(hmli0);
                        return hmli0;
                    label_7:
                        if(s.equals("storeAs")) {
                            hmli hmli1 = this.e.a(list0);
                            this.b(hmli1);
                            return hmli1;
                        label_11:
                            if(s.equals("findInJsonArray")) {
                                hmli hmli2 = this.f.e(list0);
                                this.b(hmli2);
                                return hmli2;
                            label_15:
                                if(s.equals("bitLeftShift")) {
                                    hmli hmli3 = this.i.b(list0);
                                    this.b(hmli3);
                                    return hmli3;
                                label_19:
                                    if(s.equals("selectTag")) {
                                        hmli hmli4 = this.g.g(list0, false);
                                        this.b(hmli4);
                                        return hmli4;
                                    label_23:
                                        if(s.equals("bitAnd")) {
                                            hmli hmli5 = this.i.a(list0);
                                            this.b(hmli5);
                                            return hmli5;
                                        label_27:
                                            if(s.equals("bitXor")) {
                                                hmli hmli6 = this.i.e(list0);
                                                this.b(hmli6);
                                                return hmli6;
                                            label_31:
                                                if(s.equals("convertStringToBytes")) {
                                                    hmli hmli7 = this.d.c(list0);
                                                    this.b(hmli7);
                                                    return hmli7;
                                                label_35:
                                                    if(s.equals("executeMappedFunction")) {
                                                        list0.add(0, new hmli(hmlf0));
                                                        hmkw hmkw0 = this.c;
                                                        hmli hmli8 = hmlx.e(list0);
                                                        if(hmli8 == null) {
                                                            try {
                                                                switch(list0.size()) {
                                                                    case 2: {
                                                                        goto label_45;
                                                                    }
                                                                    case 3: {
                                                                        goto label_50;
                                                                    }
                                                                }
                                                                throw new IllegalArgumentException("Incorrect number of parameters");
                                                            label_45:
                                                                hmlf hmlf1 = (hmlf)((hmli)list0.get(0)).a;
                                                                hmli hmli10 = (hmli)list0.get(1);
                                                                String s1 = (String)hmkw0.a.b(hmli10, "");
                                                                hmkw0.c.k(hmlf1, null, s1);
                                                                hmli9 = new hmli(Boolean.valueOf(true));
                                                                this.b(hmli9);
                                                                return hmli9;
                                                            label_50:
                                                                if(!(((hmli)list0.get(1)).a instanceof String) || !((String)((hmli)list0.get(1)).a).startsWith("seq_ret_")) {
                                                                    throw new IllegalArgumentException("Incorrect number of parameters");
                                                                }
                                                                hmlf hmlf2 = (hmlf)((hmli)list0.get(0)).a;
                                                                hmli hmli11 = (hmli)list0.get(1);
                                                                String s2 = (String)hmkw0.a.b(hmli11, "");
                                                                hmli hmli12 = (hmli)list0.get(2);
                                                                String s3 = (String)hmkw0.a.b(hmli12, "");
                                                                hmkw0.c.k(hmlf2, s2, s3);
                                                                hmli9 = new hmli(Boolean.valueOf(true));
                                                            }
                                                            catch(Exception exception1) {
                                                                hmkw0.b.a("Exception executing executeMappedFunction method", exception1);
                                                                hmli9 = new hmli(exception1.getMessage());
                                                            }
                                                        }
                                                        else {
                                                            hmli9 = new hmli(hmli8.d);
                                                            hmli9.e = hmli8.e;
                                                        }
                                                        this.b(hmli9);
                                                        return hmli9;
                                                    label_65:
                                                        if(s.equals("validateTLV")) {
                                                            hmli hmli13 = this.g.h(list0, false);
                                                            this.b(hmli13);
                                                            return hmli13;
                                                        label_69:
                                                            if(s.equals("applyStringEncoding")) {
                                                                hmkw hmkw1 = this.c;
                                                                hmli hmli14 = hmlx.e(list0);
                                                                if(hmli14 == null) {
                                                                    try {
                                                                        switch(list0.size()) {
                                                                            case 1: {
                                                                                goto label_78;
                                                                            }
                                                                            case 2: {
                                                                                goto label_82;
                                                                            }
                                                                        }
                                                                        throw new IllegalArgumentException("Incorrect number of parameters");
                                                                    label_78:
                                                                        hmli hmli16 = (hmli)list0.get(0);
                                                                        String s4 = (String)hmkw1.a.b(hmli16, "");
                                                                        String s5 = hmkw1.c.e(null, s4);
                                                                        hmli15 = new hmli(s5);
                                                                        this.b(hmli15);
                                                                        return hmli15;
                                                                    label_82:
                                                                        hmli hmli17 = (hmli)list0.get(0);
                                                                        ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
                                                                        ByteBuffer byteBuffer1 = (ByteBuffer)hmkw1.a.b(hmli17, byteBuffer0);
                                                                        hmli hmli18 = (hmli)list0.get(1);
                                                                        String s6 = (String)hmkw1.a.b(hmli18, "");
                                                                        s5 = hmkw1.c.e(byteBuffer1, s6);
                                                                        hmli15 = new hmli(s5);
                                                                    }
                                                                    catch(Exception exception2) {
                                                                        hmkw1.b.a("Exception executing applyStringEncoding method", exception2);
                                                                        hmli15 = new hmli(exception2.getMessage());
                                                                    }
                                                                }
                                                                else {
                                                                    hmli15 = new hmli(hmli14.d);
                                                                    hmli15.e = hmli14.e;
                                                                }
                                                                this.b(hmli15);
                                                                return hmli15;
                                                            label_95:
                                                                if(s.equals("extract")) {
                                                                    hmkw hmkw2 = this.c;
                                                                    try {
                                                                        ByteBuffer byteBuffer2 = hmkw2.c.a.f.a().b();
                                                                        hmlx.g(byteBuffer2.array());
                                                                        hmli19 = new hmli(byteBuffer2);
                                                                    }
                                                                    catch(Exception exception3) {
                                                                        hmkw2.b.a("Exception executing extract method", exception3);
                                                                        hmli19 = new hmli(exception3.getMessage());
                                                                    }
                                                                    this.b(hmli19);
                                                                    return hmli19;
                                                                label_106:
                                                                    if(s.equals("jsonArray")) {
                                                                        hmli hmli20 = this.f.i(list0);
                                                                        this.b(hmli20);
                                                                        return hmli20;
                                                                    label_110:
                                                                        if(s.equals("breakChainOnCondition")) {
                                                                            hmkw hmkw3 = this.c;
                                                                            try {
                                                                                if(list0.size() != 1) {
                                                                                    throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                }
                                                                                hmli hmli21 = (hmli)list0.get(0);
                                                                                hmli hmli22 = hmkw3.a.a(hmli21);
                                                                                hmli23 = new hmli(Boolean.valueOf(true));
                                                                                if(hmli22.b || hmli22.c) {
                                                                                    hmli23.e();
                                                                                }
                                                                                else if((hmli22.a instanceof Boolean) && hmli22.a.equals(Boolean.TRUE)) {
                                                                                    hmli23.e();
                                                                                }
                                                                            }
                                                                            catch(Exception exception4) {
                                                                                hmkw3.b.a("Exception executing breakChainOnCondition method", exception4);
                                                                                hmli23 = new hmli(exception4.getMessage());
                                                                            }
                                                                            this.b(hmli23);
                                                                            return hmli23;
                                                                        label_128:
                                                                            if(s.equals("concatString")) {
                                                                                hmkw hmkw4 = this.c;
                                                                                hmli hmli24 = hmlx.e(list0);
                                                                                if(hmli24 == null) {
                                                                                    try {
                                                                                        switch(list0.size()) {
                                                                                            case 1: {
                                                                                                goto label_134;
                                                                                            }
                                                                                            case 2: {
                                                                                                goto label_138;
                                                                                            }
                                                                                        }
                                                                                        throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                    label_134:
                                                                                        hmli hmli25 = (hmli)list0.get(0);
                                                                                        hmli hmli26 = hmkw4.a.a(hmli25);
                                                                                        hmli hmli27 = hmkw4.c.b(null, hmli26);
                                                                                        hmli24 = new hmli(hmli27);
                                                                                        this.b(hmli24);
                                                                                        return hmli24;
                                                                                    label_138:
                                                                                        hmli hmli28 = (hmli)list0.get(0);
                                                                                        hmli hmli29 = hmkw4.a.a(hmli28);
                                                                                        hmli hmli30 = (hmli)list0.get(1);
                                                                                        hmli hmli31 = hmkw4.a.a(hmli30);
                                                                                        hmli27 = hmkw4.c.b(hmli29, hmli31);
                                                                                        hmli24 = new hmli(hmli27);
                                                                                    }
                                                                                    catch(Exception exception5) {
                                                                                        hmkw4.b.a("Exception executing Concat String method", exception5);
                                                                                        hmli24 = new hmli(exception5.getMessage());
                                                                                    }
                                                                                }
                                                                                this.b(hmli24);
                                                                                return hmli24;
                                                                            label_150:
                                                                                if(s.equals("select")) {
                                                                                    hmli hmli32 = this.g.e(list0);
                                                                                    this.b(hmli32);
                                                                                    return hmli32;
                                                                                label_154:
                                                                                    if(s.equals("isBitSet")) {
                                                                                        hmkw hmkw5 = this.c;
                                                                                        hmli hmli33 = hmlx.e(list0);
                                                                                        if(hmli33 == null) {
                                                                                            try {
                                                                                                switch(list0.size()) {
                                                                                                    case 1: {
                                                                                                        goto label_163;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        goto label_168;
                                                                                                    }
                                                                                                }
                                                                                                throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                            label_163:
                                                                                                hmli hmli35 = (hmli)list0.get(0);
                                                                                                hmkg hmkg0 = new hmkg(3);
                                                                                                int v = ((hmkg)hmkw5.a.b(hmli35, hmkg0)).a.intValue();
                                                                                                boolean z1 = hmkw5.c.i(null, v);
                                                                                                hmli34 = new hmli(Boolean.valueOf(z1));
                                                                                                this.b(hmli34);
                                                                                                return hmli34;
                                                                                            label_168:
                                                                                                hmli hmli36 = (hmli)list0.get(0);
                                                                                                ByteBuffer byteBuffer3 = ByteBuffer.allocate(1);
                                                                                                ByteBuffer byteBuffer4 = (ByteBuffer)hmkw5.a.b(hmli36, byteBuffer3);
                                                                                                hmli hmli37 = (hmli)list0.get(1);
                                                                                                hmkg hmkg1 = new hmkg(3);
                                                                                                int v1 = ((hmkg)hmkw5.a.b(hmli37, hmkg1)).a.intValue();
                                                                                                z1 = hmkw5.c.i(byteBuffer4, v1);
                                                                                                hmli34 = new hmli(Boolean.valueOf(z1));
                                                                                            }
                                                                                            catch(Exception exception6) {
                                                                                                hmkw5.b.a("Exception executing isBitSet method", exception6);
                                                                                                hmli34 = new hmli(exception6.getMessage());
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            hmli34 = new hmli(hmli33.d);
                                                                                            hmli34.e = hmli33.e;
                                                                                        }
                                                                                        this.b(hmli34);
                                                                                        return hmli34;
                                                                                    label_182:
                                                                                        if(s.equals("foreach")) {
                                                                                            hmli hmli38 = this.g.a(hmlf0, list0);
                                                                                            this.b(hmli38);
                                                                                            return hmli38;
                                                                                        label_186:
                                                                                            if(s.equals("jsonObjectRemove")) {
                                                                                                hmli hmli39 = this.f.l(list0);
                                                                                                this.b(hmli39);
                                                                                                return hmli39;
                                                                                            label_190:
                                                                                                if(s.equals("convertTo")) {
                                                                                                    hmli hmli40 = this.d.d(list0);
                                                                                                    this.b(hmli40);
                                                                                                    return hmli40;
                                                                                                label_194:
                                                                                                    if(s.equals("validateTLVBER")) {
                                                                                                        hmli hmli41 = this.g.h(list0, true);
                                                                                                        this.b(hmli41);
                                                                                                        return hmli41;
                                                                                                    label_198:
                                                                                                        if(s.equals("chainingMode")) {
                                                                                                            hmli hmli42 = this.h.a(list0);
                                                                                                            this.b(hmli42);
                                                                                                            return hmli42;
                                                                                                        label_202:
                                                                                                            if(s.equals("convertBytesToString")) {
                                                                                                                hmli hmli43 = this.d.b(list0);
                                                                                                                this.b(hmli43);
                                                                                                                return hmli43;
                                                                                                            label_206:
                                                                                                                if(s.equals("jsonArrayRemove")) {
                                                                                                                    hmli hmli44 = this.f.j(list0);
                                                                                                                    this.b(hmli44);
                                                                                                                    return hmli44;
                                                                                                                label_210:
                                                                                                                    if(s.equals("isTruthy")) {
                                                                                                                        hmkw hmkw6 = this.c;
                                                                                                                        try {
                                                                                                                            if(list0.size() != 1) {
                                                                                                                                throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                            }
                                                                                                                            hmli hmli45 = (hmli)list0.get(0);
                                                                                                                            hmli46 = new hmli(Boolean.valueOf(hmkx.m(hmkw6.a.a(hmli45))));
                                                                                                                        }
                                                                                                                        catch(Exception exception7) {
                                                                                                                            hmkw6.b.a("Exception executing isTruthy method", exception7);
                                                                                                                            hmli46 = new hmli(exception7.getMessage());
                                                                                                                        }
                                                                                                                        this.b(hmli46);
                                                                                                                        return hmli46;
                                                                                                                    label_222:
                                                                                                                        if(s.equals("mergeJsonObject")) {
                                                                                                                            hmli hmli47 = this.f.n(list0);
                                                                                                                            this.b(hmli47);
                                                                                                                            return hmli47;
                                                                                                                        label_226:
                                                                                                                            if(s.equals("addOrUpdate")) {
                                                                                                                                hmli hmli48 = this.f.a(list0);
                                                                                                                                this.b(hmli48);
                                                                                                                                return hmli48;
                                                                                                                            label_230:
                                                                                                                                if(s.equals("if")) {
                                                                                                                                    list0.add(0, new hmli(hmlf0));
                                                                                                                                    hmkw hmkw7 = this.c;
                                                                                                                                    try {
                                                                                                                                        if(list0.size() != 4) {
                                                                                                                                            throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                        }
                                                                                                                                        hmkx hmkx0 = hmkw7.c;
                                                                                                                                        hmlf hmlf3 = (hmlf)((hmli)list0.get(0)).a;
                                                                                                                                        hmli hmli49 = (hmli)list0.get(1);
                                                                                                                                        hmli hmli50 = hmkw7.a.a(hmli49);
                                                                                                                                        hmli hmli51 = (hmli)list0.get(2);
                                                                                                                                        hmli hmli52 = hmkw7.a.a(hmli51);
                                                                                                                                        hmli hmli53 = (hmli)list0.get(3);
                                                                                                                                        hmli hmli54 = hmkw7.a.a(hmli53);
                                                                                                                                        Object object0 = hmli50.a;
                                                                                                                                        if(!(object0 instanceof Boolean)) {
                                                                                                                                            hmli55 = hmli50.b ? hmkx0.c(hmlf3, hmli54) : hmkx0.c(hmlf3, hmli52);
                                                                                                                                        }
                                                                                                                                        else if(object0 == Boolean.TRUE) {
                                                                                                                                            hmli55 = hmkx0.c(hmlf3, hmli52);
                                                                                                                                        }
                                                                                                                                        else {
                                                                                                                                            hmli55 = hmkx0.c(hmlf3, hmli54);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    catch(Exception exception8) {
                                                                                                                                        hmkw7.b.a("Exception executing if method", exception8);
                                                                                                                                        hmli55 = new hmli(exception8.getMessage());
                                                                                                                                    }
                                                                                                                                    this.b(hmli55);
                                                                                                                                    return hmli55;
                                                                                                                                label_260:
                                                                                                                                    if(s.equals("data")) {
                                                                                                                                        hmli hmli56 = this.h.b(list0);
                                                                                                                                        this.b(hmli56);
                                                                                                                                        return hmli56;
                                                                                                                                    label_264:
                                                                                                                                        if(s.equals("test")) {
                                                                                                                                            hmkw hmkw8 = this.c;
                                                                                                                                            hmli hmli57 = hmlx.e(list0);
                                                                                                                                            if(hmli57 == null) {
                                                                                                                                                try {
                                                                                                                                                    ArrayList arrayList0 = new ArrayList();
                                                                                                                                                    for(Object object1: list0) {
                                                                                                                                                        arrayList0.add(((String)hmkw8.a.b(((hmli)object1), "")));
                                                                                                                                                    }
                                                                                                                                                    double f = 0.0;
                                                                                                                                                    for(Object object2: arrayList0) {
                                                                                                                                                        f += Double.parseDouble(((String)object2));
                                                                                                                                                    }
                                                                                                                                                    Double.valueOf(f).getClass();
                                                                                                                                                    hmli58 = new hmli(new hmkg(new BigDecimal(f), 5));
                                                                                                                                                }
                                                                                                                                                catch(Exception exception9) {
                                                                                                                                                    hmkw8.b.a("Exception executing test method", exception9);
                                                                                                                                                    hmli58 = new hmli(exception9.getMessage());
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            else {
                                                                                                                                                hmli58 = new hmli(hmli57.d);
                                                                                                                                                hmli58.e = hmli57.e;
                                                                                                                                            }
                                                                                                                                            this.b(hmli58);
                                                                                                                                            return hmli58;
                                                                                                                                        label_291:
                                                                                                                                            if(s.equals("convertToBCDDate")) {
                                                                                                                                                hmli hmli59 = this.d.e(list0);
                                                                                                                                                this.b(hmli59);
                                                                                                                                                return hmli59;
                                                                                                                                            label_295:
                                                                                                                                                if(s.equals("isJsonEmpty")) {
                                                                                                                                                    hmli hmli60 = this.f.h(list0);
                                                                                                                                                    this.b(hmli60);
                                                                                                                                                    return hmli60;
                                                                                                                                                label_299:
                                                                                                                                                    if(s.equals("executeSequential")) {
                                                                                                                                                        hmkw hmkw9 = this.c;
                                                                                                                                                        try {
                                                                                                                                                            if((((hmli)list0.get(0)).a instanceof String) && ((String)((hmli)list0.get(0)).a).startsWith("seq_ret_")) {
                                                                                                                                                                hmli hmli61 = new hmli(((String)((hmli)list0.get(0)).a).split("seq_ret_")[1].trim());
                                                                                                                                                                hmkg hmkg2 = new hmkg(3);
                                                                                                                                                                hmli62 = hmkx.l(((hmkg)hmkw9.a.b(hmli61, hmkg2)).a.intValue(), list0.subList(1, list0.size()));
                                                                                                                                                            }
                                                                                                                                                            else {
                                                                                                                                                                hmli62 = hmkx.l(-1, list0);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        catch(Exception exception10) {
                                                                                                                                                            hmkw9.b.a("Exception executing executeSequential method", exception10);
                                                                                                                                                            hmli62 = new hmli(exception10.getMessage());
                                                                                                                                                        }
                                                                                                                                                        this.b(hmli62);
                                                                                                                                                        return hmli62;
                                                                                                                                                    label_313:
                                                                                                                                                        if(s.equals("bitOr")) {
                                                                                                                                                            hmli hmli63 = this.i.c(list0);
                                                                                                                                                            this.b(hmli63);
                                                                                                                                                            return hmli63;
                                                                                                                                                        label_317:
                                                                                                                                                            if(s.equals("clone")) {
                                                                                                                                                                hmkw hmkw10 = this.c;
                                                                                                                                                                hmli hmli64 = hmlx.e(list0);
                                                                                                                                                                if(hmli64 == null) {
                                                                                                                                                                    try {
                                                                                                                                                                        if(list0.size() != 1) {
                                                                                                                                                                            throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                        }
                                                                                                                                                                        hmli hmli65 = (hmli)list0.get(0);
                                                                                                                                                                        hmli64 = new hmli(hmli.c(hmkw10.a.a(hmli65)));
                                                                                                                                                                    }
                                                                                                                                                                    catch(Exception exception11) {
                                                                                                                                                                        hmkw10.b.a("Exception executing clone method", exception11);
                                                                                                                                                                        hmli64 = new hmli(exception11.getMessage());
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                this.b(hmli64);
                                                                                                                                                                return hmli64;
                                                                                                                                                            label_331:
                                                                                                                                                                if(s.equals("union")) {
                                                                                                                                                                    hmli hmli66 = this.f.o(list0);
                                                                                                                                                                    this.b(hmli66);
                                                                                                                                                                    return hmli66;
                                                                                                                                                                label_335:
                                                                                                                                                                    if(s.equals("bitRightShift")) {
                                                                                                                                                                        hmli hmli67 = this.i.d(list0);
                                                                                                                                                                        this.b(hmli67);
                                                                                                                                                                        return hmli67;
                                                                                                                                                                    label_339:
                                                                                                                                                                        if(s.equals("jsonObject")) {
                                                                                                                                                                            hmli hmli68 = this.f.k(list0);
                                                                                                                                                                            this.b(hmli68);
                                                                                                                                                                            return hmli68;
                                                                                                                                                                        label_343:
                                                                                                                                                                            if(s.equals("formatDate")) {
                                                                                                                                                                                hmkw hmkw11 = this.c;
                                                                                                                                                                                hmli hmli69 = hmlx.e(list0);
                                                                                                                                                                                if(hmli69 == null) {
                                                                                                                                                                                    try {
                                                                                                                                                                                        switch(list0.size()) {
                                                                                                                                                                                            case 2: {
                                                                                                                                                                                                goto label_352;
                                                                                                                                                                                            }
                                                                                                                                                                                            case 3: {
                                                                                                                                                                                                goto label_358;
                                                                                                                                                                                            }
                                                                                                                                                                                            case 4: {
                                                                                                                                                                                                goto label_366;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                    label_352:
                                                                                                                                                                                        hmli hmli71 = (hmli)list0.get(0);
                                                                                                                                                                                        String s7 = (String)hmkw11.a.b(hmli71, "");
                                                                                                                                                                                        hmli hmli72 = (hmli)list0.get(1);
                                                                                                                                                                                        String s8 = (String)hmkw11.a.b(hmli72, "");
                                                                                                                                                                                        String s9 = hmkw11.c.f(null, s7, s8, null);
                                                                                                                                                                                        hmli70 = new hmli(s9);
                                                                                                                                                                                        this.b(hmli70);
                                                                                                                                                                                        return hmli70;
                                                                                                                                                                                    label_358:
                                                                                                                                                                                        hmli hmli73 = (hmli)list0.get(0);
                                                                                                                                                                                        String s10 = (String)hmkw11.a.b(hmli73, "");
                                                                                                                                                                                        hmli hmli74 = (hmli)list0.get(1);
                                                                                                                                                                                        String s11 = (String)hmkw11.a.b(hmli74, "");
                                                                                                                                                                                        hmli hmli75 = (hmli)list0.get(2);
                                                                                                                                                                                        String s12 = (String)hmkw11.a.b(hmli75, "");
                                                                                                                                                                                        s9 = hmkw11.c.f(null, s10, s11, s12);
                                                                                                                                                                                        hmli70 = new hmli(s9);
                                                                                                                                                                                        this.b(hmli70);
                                                                                                                                                                                        return hmli70;
                                                                                                                                                                                    label_366:
                                                                                                                                                                                        hmli hmli76 = (hmli)list0.get(0);
                                                                                                                                                                                        hmkf hmkf0 = new hmkf(1L);
                                                                                                                                                                                        hmkf hmkf1 = (hmkf)hmkw11.a.b(hmli76, hmkf0);
                                                                                                                                                                                        hmli hmli77 = (hmli)list0.get(1);
                                                                                                                                                                                        String s13 = (String)hmkw11.a.b(hmli77, "");
                                                                                                                                                                                        hmli hmli78 = (hmli)list0.get(2);
                                                                                                                                                                                        String s14 = (String)hmkw11.a.b(hmli78, "");
                                                                                                                                                                                        hmli hmli79 = (hmli)list0.get(3);
                                                                                                                                                                                        String s15 = (String)hmkw11.a.b(hmli79, "");
                                                                                                                                                                                        s9 = hmkw11.c.f(hmkf1, s13, s14, s15);
                                                                                                                                                                                        hmli70 = new hmli(s9);
                                                                                                                                                                                    }
                                                                                                                                                                                    catch(Exception exception12) {
                                                                                                                                                                                        hmkw11.b.a("Exception executing formatDate method", exception12);
                                                                                                                                                                                        hmli70 = new hmli(exception12.getMessage());
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                else {
                                                                                                                                                                                    hmli70 = new hmli(hmli69.d);
                                                                                                                                                                                    hmli70.e = hmli69.e;
                                                                                                                                                                                }
                                                                                                                                                                                this.b(hmli70);
                                                                                                                                                                                return hmli70;
                                                                                                                                                                            label_383:
                                                                                                                                                                                if(s.equals("addTransactionField")) {
                                                                                                                                                                                    hmli hmli80 = this.f.c(list0);
                                                                                                                                                                                    this.b(hmli80);
                                                                                                                                                                                    return hmli80;
                                                                                                                                                                                label_387:
                                                                                                                                                                                    if(s.equals("getMapped")) {
                                                                                                                                                                                        hmkw hmkw12 = this.c;
                                                                                                                                                                                        hmli hmli81 = hmlx.e(list0);
                                                                                                                                                                                        if(hmli81 == null) {
                                                                                                                                                                                            try {
                                                                                                                                                                                                if(list0.size() != 2) {
                                                                                                                                                                                                    throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                }
                                                                                                                                                                                                hmli hmli82 = (hmli)list0.get(0);
                                                                                                                                                                                                JSONObject jSONObject0 = new JSONObject();
                                                                                                                                                                                                JSONObject jSONObject1 = (JSONObject)hmkw12.a.b(hmli82, jSONObject0);
                                                                                                                                                                                                hmli hmli83 = (hmli)list0.get(1);
                                                                                                                                                                                                String s16 = (String)hmkw12.a.b(hmli83, "");
                                                                                                                                                                                                hmli81 = hmli.c(hmkw12.c.d(jSONObject1, s16));
                                                                                                                                                                                            }
                                                                                                                                                                                            catch(Exception exception13) {
                                                                                                                                                                                                hmkw12.b.a("Exception executing getMapped method", exception13);
                                                                                                                                                                                                hmli81 = new hmli(exception13.getMessage());
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        this.b(hmli81);
                                                                                                                                                                                        return hmli81;
                                                                                                                                                                                    label_405:
                                                                                                                                                                                        if(s.equals("convertBases")) {
                                                                                                                                                                                            hmli hmli84 = this.d.a(list0);
                                                                                                                                                                                            this.b(hmli84);
                                                                                                                                                                                            return hmli84;
                                                                                                                                                                                        label_409:
                                                                                                                                                                                            if(s.equals("mergeJsonArray")) {
                                                                                                                                                                                                hmli hmli85 = this.f.m(list0);
                                                                                                                                                                                                this.b(hmli85);
                                                                                                                                                                                                return hmli85;
                                                                                                                                                                                            label_413:
                                                                                                                                                                                                if(s.equals("hasKeyInJson")) {
                                                                                                                                                                                                    hmli hmli86 = this.f.g(list0);
                                                                                                                                                                                                    this.b(hmli86);
                                                                                                                                                                                                    return hmli86;
                                                                                                                                                                                                label_417:
                                                                                                                                                                                                    if(s.equals("compare")) {
                                                                                                                                                                                                        hmkw hmkw13 = this.c;
                                                                                                                                                                                                        hmli hmli87 = hmlx.e(list0);
                                                                                                                                                                                                        if(hmli87 == null) {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                switch(list0.size()) {
                                                                                                                                                                                                                    case 1: {
                                                                                                                                                                                                                        goto label_426;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    case 2: {
                                                                                                                                                                                                                        goto label_430;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                            label_426:
                                                                                                                                                                                                                hmli hmli89 = (hmli)list0.get(0);
                                                                                                                                                                                                                hmli hmli90 = hmkw13.a.a(hmli89);
                                                                                                                                                                                                                int v2 = hmkw13.c.a(null, hmli90);
                                                                                                                                                                                                                hmli88 = new hmli(new hmkg(new BigDecimal(v2), 3));
                                                                                                                                                                                                                this.b(hmli88);
                                                                                                                                                                                                                return hmli88;
                                                                                                                                                                                                            label_430:
                                                                                                                                                                                                                hmli hmli91 = (hmli)list0.get(0);
                                                                                                                                                                                                                hmli hmli92 = hmkw13.a.a(hmli91);
                                                                                                                                                                                                                hmli hmli93 = (hmli)list0.get(1);
                                                                                                                                                                                                                hmli hmli94 = hmkw13.a.a(hmli93);
                                                                                                                                                                                                                v2 = hmkw13.c.a(hmli92, hmli94);
                                                                                                                                                                                                                hmli88 = new hmli(new hmkg(new BigDecimal(v2), 3));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch(Exception exception14) {
                                                                                                                                                                                                                hmkw13.b.a("Exception executing compare method", exception14);
                                                                                                                                                                                                                hmli88 = new hmli(exception14.getMessage());
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        else {
                                                                                                                                                                                                            hmli88 = new hmli(hmli87.d);
                                                                                                                                                                                                            hmli88.e = hmli87.e;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.b(hmli88);
                                                                                                                                                                                                        return hmli88;
                                                                                                                                                                                                    label_442:
                                                                                                                                                                                                        if(s.equals("resolve")) {
                                                                                                                                                                                                            hmku hmku0 = this.f;
                                                                                                                                                                                                            hmli hmli95 = hmlx.e(list0);
                                                                                                                                                                                                            if(hmli95 == null) {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    if(list0.size() != 1) {
                                                                                                                                                                                                                        throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    hmli hmli96 = (hmli)list0.get(0);
                                                                                                                                                                                                                    hmli95 = hmku0.b.a(hmli96);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch(Exception exception15) {
                                                                                                                                                                                                                    hmku0.a.a("Exception executing resolve method", exception15);
                                                                                                                                                                                                                    hmli95 = new hmli(exception15.getMessage());
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.b(hmli95);
                                                                                                                                                                                                            return hmli95;
                                                                                                                                                                                                        label_456:
                                                                                                                                                                                                            if(s.equals("selectIn")) {
                                                                                                                                                                                                                hmli hmli97 = this.g.f(list0);
                                                                                                                                                                                                                this.b(hmli97);
                                                                                                                                                                                                                return hmli97;
                                                                                                                                                                                                            label_460:
                                                                                                                                                                                                                if(s.equals("applyByteDecoding")) {
                                                                                                                                                                                                                    hmli hmli98 = this.c.a(list0);
                                                                                                                                                                                                                    this.b(hmli98);
                                                                                                                                                                                                                    return hmli98;
                                                                                                                                                                                                                label_464:
                                                                                                                                                                                                                    if(s.equals("findAllInJsonArray")) {
                                                                                                                                                                                                                        hmli hmli99 = this.f.d(list0);
                                                                                                                                                                                                                        this.b(hmli99);
                                                                                                                                                                                                                        return hmli99;
                                                                                                                                                                                                                    label_468:
                                                                                                                                                                                                                        if(s.equals("addToJSONIf")) {
                                                                                                                                                                                                                            hmli hmli100 = this.f.b(list0);
                                                                                                                                                                                                                            this.b(hmli100);
                                                                                                                                                                                                                            return hmli100;
                                                                                                                                                                                                                        label_472:
                                                                                                                                                                                                                            if(s.equals("isVariablePresent")) {
                                                                                                                                                                                                                                hmkw hmkw14 = this.c;
                                                                                                                                                                                                                                hmli hmli101 = hmlx.e(list0);
                                                                                                                                                                                                                                if(hmli101 == null) {
                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                        if(list0.size() != 1) {
                                                                                                                                                                                                                                            throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if((((hmli)list0.get(0)).a instanceof String)) {
                                                                                                                                                                                                                                            String s17 = (String)((hmli)list0.get(0)).a;
                                                                                                                                                                                                                                            hmlg hmlg0 = hmkw14.c.a;
                                                                                                                                                                                                                                            if(hmlg0.f.b(s17) != null) {
                                                                                                                                                                                                                                                z = true;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            else if(hmlg0.c.a(s17) != null) {
                                                                                                                                                                                                                                                z = true;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        hmli102 = new hmli(Boolean.valueOf(z));
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    catch(Exception exception16) {
                                                                                                                                                                                                                                        hmkw14.b.a("Exception executing isVariablePresent method", exception16);
                                                                                                                                                                                                                                        hmli102 = new hmli(exception16.getMessage());
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                else {
                                                                                                                                                                                                                                    hmli102 = new hmli(hmli101.d);
                                                                                                                                                                                                                                    hmli102.e = hmli101.e;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                this.b(hmli102);
                                                                                                                                                                                                                                return hmli102;
                                                                                                                                                                                                                            label_496:
                                                                                                                                                                                                                                if(s.equals("foreachIn")) {
                                                                                                                                                                                                                                    hmli hmli103 = this.g.b(hmlf0, list0);
                                                                                                                                                                                                                                    this.b(hmli103);
                                                                                                                                                                                                                                    return hmli103;
                                                                                                                                                                                                                                label_500:
                                                                                                                                                                                                                                    if(s.equals("foreachInJson")) {
                                                                                                                                                                                                                                        hmli hmli104 = this.f.f(hmlf0, list0);
                                                                                                                                                                                                                                        this.b(hmli104);
                                                                                                                                                                                                                                        return hmli104;
                                                                                                                                                                                                                                    label_504:
                                                                                                                                                                                                                                        if(s.equals("foreachTag")) {
                                                                                                                                                                                                                                            hmli hmli105 = this.g.d(list0, false);
                                                                                                                                                                                                                                            this.b(hmli105);
                                                                                                                                                                                                                                            return hmli105;
                                                                                                                                                                                                                                        label_508:
                                                                                                                                                                                                                                            if(s.equals("extractBits")) {
                                                                                                                                                                                                                                                hmkw hmkw15 = this.c;
                                                                                                                                                                                                                                                try {
                                                                                                                                                                                                                                                    if(list0.size() != 2) {
                                                                                                                                                                                                                                                        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                                                                        hmkw15.b.a("Invalid params to invoke extractBits method", illegalArgumentException0);
                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    hmli hmli106 = (hmli)list0.get(0);
                                                                                                                                                                                                                                                    hmkg hmkg3 = new hmkg(3);
                                                                                                                                                                                                                                                    int v3 = ((hmkg)hmkw15.a.b(hmli106, hmkg3)).a.intValue();
                                                                                                                                                                                                                                                    hmli hmli107 = (hmli)list0.get(1);
                                                                                                                                                                                                                                                    hmkg hmkg4 = new hmkg(3);
                                                                                                                                                                                                                                                    int v4 = ((hmkg)hmkw15.a.b(hmli107, hmkg4)).a.intValue();
                                                                                                                                                                                                                                                    hmle hmle0 = hmkw15.c.a.f.a();
                                                                                                                                                                                                                                                    Integer.valueOf(v3).getClass();
                                                                                                                                                                                                                                                    Integer.valueOf(v4).getClass();
                                                                                                                                                                                                                                                    ByteBuffer byteBuffer5 = ByteBuffer.wrap(hmle.f(hmle0.b().array(), v3, v4));
                                                                                                                                                                                                                                                    hmlx.g(byteBuffer5.array());
                                                                                                                                                                                                                                                    hmli108 = new hmli(byteBuffer5);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                catch(Exception exception17) {
                                                                                                                                                                                                                                                    hmkw15.b.a("Exception executing extractBits method", exception17);
                                                                                                                                                                                                                                                    hmli108 = new hmli(exception17.getMessage());
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                this.b(hmli108);
                                                                                                                                                                                                                                                return hmli108;
                                                                                                                                                                                                                                            label_532:
                                                                                                                                                                                                                                                if(s.equals("convertToDate")) {
                                                                                                                                                                                                                                                    hmli hmli109 = this.d.f(list0);
                                                                                                                                                                                                                                                    this.b(hmli109);
                                                                                                                                                                                                                                                    return hmli109;
                                                                                                                                                                                                                                                label_536:
                                                                                                                                                                                                                                                    if(s.equals("foreachRecord")) {
                                                                                                                                                                                                                                                        hmli hmli110 = this.g.c(list0);
                                                                                                                                                                                                                                                        this.b(hmli110);
                                                                                                                                                                                                                                                        return hmli110;
                                                                                                                                                                                                                                                    label_540:
                                                                                                                                                                                                                                                        if(s.equals("foreachTagBER")) {
                                                                                                                                                                                                                                                            hmli hmli111 = this.g.d(list0, true);
                                                                                                                                                                                                                                                            this.b(hmli111);
                                                                                                                                                                                                                                                            return hmli111;
                                                                                                                                                                                                                                                        label_544:
                                                                                                                                                                                                                                                            if(s.equals("sizeOfJson")) {
                                                                                                                                                                                                                                                                hmku hmku1 = this.f;
                                                                                                                                                                                                                                                                hmli hmli112 = hmlx.e(list0);
                                                                                                                                                                                                                                                                if(hmli112 == null) {
                                                                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                                                                        if(list0.size() != 1) {
                                                                                                                                                                                                                                                                            throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        hmli hmli113 = (hmli)list0.get(0);
                                                                                                                                                                                                                                                                        Object object3 = hmku1.b.a(hmli113).a;
                                                                                                                                                                                                                                                                        if((object3 instanceof JSONObject)) {
                                                                                                                                                                                                                                                                            z = ((JSONObject)object3).length();
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        else if((object3 instanceof JSONArray)) {
                                                                                                                                                                                                                                                                            z = ((JSONArray)object3).length();
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        hmli112 = new hmli(((int)z));
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    catch(Exception exception18) {
                                                                                                                                                                                                                                                                        hmku1.a.a("Exception executing size of json method", exception18);
                                                                                                                                                                                                                                                                        hmli112 = new hmli(exception18.getMessage());
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                this.b(hmli112);
                                                                                                                                                                                                                                                                return hmli112;
                                                                                                                                                                                                                                                            label_564:
                                                                                                                                                                                                                                                                if(s.equals("selectTagBER")) {
                                                                                                                                                                                                                                                                    hmli hmli114 = this.g.g(list0, true);
                                                                                                                                                                                                                                                                    this.b(hmli114);
                                                                                                                                                                                                                                                                    return hmli114;
                                                                                                                                                                                                                                                                label_568:
                                                                                                                                                                                                                                                                    if(s.equals("isEqual")) {
                                                                                                                                                                                                                                                                        hmkw hmkw16 = this.c;
                                                                                                                                                                                                                                                                        hmli hmli115 = hmlx.e(list0);
                                                                                                                                                                                                                                                                        if(hmli115 == null) {
                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                switch(list0.size()) {
                                                                                                                                                                                                                                                                                    case 1: {
                                                                                                                                                                                                                                                                                        goto label_577;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    case 2: {
                                                                                                                                                                                                                                                                                        goto label_581;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                                                                                            label_577:
                                                                                                                                                                                                                                                                                hmli hmli117 = (hmli)list0.get(0);
                                                                                                                                                                                                                                                                                hmli hmli118 = hmkw16.a.a(hmli117);
                                                                                                                                                                                                                                                                                boolean z2 = hmkw16.c.j(null, hmli118);
                                                                                                                                                                                                                                                                                hmli116 = new hmli(Boolean.valueOf(z2));
                                                                                                                                                                                                                                                                                this.b(hmli116);
                                                                                                                                                                                                                                                                                return hmli116;
                                                                                                                                                                                                                                                                            label_581:
                                                                                                                                                                                                                                                                                hmli hmli119 = (hmli)list0.get(0);
                                                                                                                                                                                                                                                                                hmli hmli120 = hmkw16.a.a(hmli119);
                                                                                                                                                                                                                                                                                hmli hmli121 = (hmli)list0.get(1);
                                                                                                                                                                                                                                                                                hmli hmli122 = hmkw16.a.a(hmli121);
                                                                                                                                                                                                                                                                                z2 = hmkw16.c.j(hmli120, hmli122);
                                                                                                                                                                                                                                                                                hmli116 = new hmli(Boolean.valueOf(z2));
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            catch(Exception exception19) {
                                                                                                                                                                                                                                                                                hmkw16.b.a("Exception executing isEqual method", exception19);
                                                                                                                                                                                                                                                                                hmli116 = new hmli(exception19.getMessage());
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        else {
                                                                                                                                                                                                                                                                            hmli116 = new hmli(hmli115.d);
                                                                                                                                                                                                                                                                            hmli116.e = hmli115.e;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        this.b(hmli116);
                                                                                                                                                                                                                                                                        return hmli116;
                                                                                                                                                                                                                                                                    label_593:
                                                                                                                                                                                                                                                                        if(s.equals("isFalse")) {
                                                                                                                                                                                                                                                                            hmkw hmkw17 = this.c;
                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                if(list0.size() != 1) {
                                                                                                                                                                                                                                                                                    throw new IllegalArgumentException("Incorrect number of parameters");
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                hmli hmli123 = (hmli)list0.get(0);
                                                                                                                                                                                                                                                                                hmli124 = new hmli(Boolean.valueOf(((boolean)(hmkx.m(hmkw17.a.a(hmli123)) ^ 1))));
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            catch(Exception exception20) {
                                                                                                                                                                                                                                                                                hmkw17.b.a("Exception executing isFalsy method", exception20);
                                                                                                                                                                                                                                                                                hmli124 = new hmli(exception20.getMessage());
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            this.b(hmli124);
                                                                                                                                                                                                                                                                            return hmli124;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    catch(Exception exception0) {
                        return new hmli(exception0.getMessage());
                    }
                }
                break;
            }
            case 0x8FB04CF3: {
                goto label_7;
            }
            case -1860401357: {
                goto label_11;
            }
            case -1817327058: {
                goto label_15;
            }
            case 0x99B820FE: {
                goto label_19;
            }
            case -1388819062: {
                goto label_23;
            }
            case 0xAD38A40E: {
                goto label_27;
            }
            case 0xAEF4F66C: {
                goto label_31;
            }
            case 0xAF24C600: {
                goto label_35;
            }
            case 0xAF7F8C08: {
                goto label_65;
            }
            case 0xB0130792: {
                goto label_69;
            }
            case 0xB232DC81: {
                goto label_95;
            }
            case 0xBDCF6651: {
                goto label_106;
            }
            case -1094178918: {
                goto label_110;
            }
            case -1077861307: {
                goto label_128;
            }
            case 0xC9FF34FC: {
                goto label_150;
            }
            case -714767905: {
                goto label_154;
            }
            case 0xD79B624A: {
                goto label_182;
            }
            case 0xEA4C01AB: {
                goto label_186;
            }
            case -349730930: {
                goto label_190;
            }
            case -339110041: {
                goto label_194;
            }
            case 0xED35C2C4: {
                goto label_198;
            }
            case 0xEE3B0904: {
                goto label_202;
            }
            case 0xF0B38A35: {
                goto label_206;
            }
            case -191069896: {
                goto label_210;
            }
            case -169359201: {
                goto label_222;
            }
            case 0xF67BA84D: {
                goto label_226;
            }
            case 0xD1D: {
                goto label_230;
            }
            case 3076010: {
                goto label_260;
            }
            case 0x364492: {
                goto label_264;
            }
            case 0x2181723: {
                goto label_291;
            }
            case 0x442BB3B: {
                goto label_295;
            }
            case 90252884: {
                goto label_299;
            }
            case 0x59677D0: {
                goto label_313;
            }
            case 0x5A5DD5D: {
                goto label_317;
            }
            case 0x6A456CF: {
                goto label_331;
            }
            case 0x1113D8B3: {
                goto label_335;
            }
            case 320613959: {
                goto label_339;
            }
            case 0x13458845: {
                goto label_343;
            }
            case 0x239C537D: {
                goto label_383;
            }
            case 0x24A2E129: {
                goto label_387;
            }
            case 0x2C155DCF: {
                goto label_405;
            }
            case 0x307B20F9: {
                goto label_409;
            }
            case 927544690: {
                goto label_413;
            }
            case 950484197: {
                goto label_417;
            }
            case 1097368044: {
                goto label_442;
            }
            case 0x4705EF41: {
                goto label_456;
            }
            case 1203260129: {
                goto label_460;
            }
            case 1203686500: {
                goto label_464;
            }
            case 0x4AC70621: {
                goto label_468;
            }
            case 1424108565: {
                goto label_472;
            }
            case 0x5E4C010F: {
                goto label_496;
            }
            case 0x675A4297: {
                goto label_500;
            }
            case 0x6B3448F0: {
                goto label_504;
            }
            case 0x6C9E4D27: {
                goto label_508;
            }
            case 0x75FD745C: {
                goto label_532;
            }
            case 1984060219: {
                goto label_536;
            }
            case 0x7974D17F: {
                goto label_540;
            }
            case 0x79C3B2C0: {
                goto label_544;
            }
            case 2051561137: {
                goto label_564;
            }
            case 2058163242: {
                goto label_568;
            }
            case 2058602009: {
                goto label_593;
            }
            default: {
                return new hmli("Not Supported function invocation");
            }
        }
        return new hmli("Not Supported function invocation");
    }

    private final void b(hmli hmli0) {
        this.a.f.a().e = hmli0;
        this.a.f.a().f.add(hmli0);
    }
}

