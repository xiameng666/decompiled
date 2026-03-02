import android.content.Context;
import com.google.android.gms.leveldb.LevelDb.Iterator;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.UnsupportedEncodingException;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

final class egls {
    public static final boolean a(egqb egqb0, egma egma0, Context context0, eglu eglu0) {
        gfsx gfsx0;
        String s;
        int v = egqb0.b;
        int v1 = egpx.a(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 1) {
            case 1: {
                egqa egqa0 = egqb0.c == null ? egqa.a : egqb0.c;
                if(egqa0.c.size() != 0) {
                    int v4 = egqa0.b;
                    int v5 = egpz.a(v4) == 0 ? 1 : egpz.a(v4);
                    switch(v5 - 1) {
                        case 1: {
                            if(egqa0.c.size() == 1) {
                                return !egls.a(((egqb)egqa0.c.get(0)), egma0, context0, eglu0);
                            }
                            throw new eglw("Negate operation can only have 1 operand.");
                        }
                        case 2: {
                            for(Object object1: egqa0.c) {
                                if(!egls.a(((egqb)object1), egma0, context0, eglu0)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        default: {
                            if(v5 - 1 != 3) {
                                int v6 = egpz.a(v4);
                                if(v6 != 0) {
                                    v2 = v6;
                                }
                                throw new eglw(String.format("Unsupported operator: %s", ((int)(v2 - 1))));
                            }
                            for(Object object0: egqa0.c) {
                                if(egls.a(((egqb)object0), egma0, context0, eglu0)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
                throw new eglw("Operand in operation must be non-empty");
            }
            case 2: {
                egqg egqg0 = egqb0.d == null ? egqg.a : egqb0.d;
                int v7 = egqg0.b;
                if((egqd.b(v7) == null ? egqd.a : egqd.b(v7)) == egqd.b) {
                    return true;
                }
                if((egqd.b(v7) == null ? egqd.a : egqd.b(v7)) == egqd.c) {
                    return false;
                }
                int v8 = egqf.a(egqg0.c) == 0 ? 1 : egqf.a(egqg0.c);
                if(v8 - 1 != 0 && v8 - 1 != 1) {
                    egqs egqs0 = egqg0.d == null ? egqs.c : egqg0.d;
                    if(egqr.a(egqs0.e) != 2) {
                        s = egzf.d(egze.a);
                    }
                    else if(egqr.a(egqs0.g) != 2) {
                        s = egzf.e(egze.a, egma0.a);
                    }
                    else {
                        s = egzf.f(egze.a, egma0.a, egma0.b);
                    }
                    try {
                        egzd egzd0 = egzd.c(context0);
                        egmf egmf0 = new egmf(egma0.b, egqs0);
                        egmg egmg0 = new egmg(egqs0);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gioq.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gioq)hftp0.b_message).c = 5;
                        ((gioq)hftp0.b_message).b |= 1;
                        if(s == null) {
                            egig.b("FSA2_SuggestionStorage", "prefix cannot be null.");
                            if(hwxy.d()) {
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((gioq)hftp0.b_message).d = 2;
                                ((gioq)hftp0.b_message).b |= 2;
                                egzd.g(hftp0);
                            }
                            gfsx0 = gfqx.a;
                        }
                        else {
                            __monitor_enter(egzd0);
                            int v9 = FIN.finallyOpen$NT();
                            egyv egyv0 = new egyv(egzd0.c);
                            TWR.declareResource(egyv0);
                            TWR.useResource$NT(egyv0);
                            LevelDb.Iterator levelDb$Iterator0 = egyv0.a.iterator();
                            TWR.declareResource(levelDb$Iterator0);
                            TWR.useResource$NT(egyv0);
                            TWR.useResource$NT(levelDb$Iterator0);
                            levelDb$Iterator0.seek(egzd.f(s));
                            while(true) {
                                TWR.useResource$NT(egyv0);
                                TWR.useResource$NT(levelDb$Iterator0);
                                if(levelDb$Iterator0.isValid() && egzd.e(levelDb$Iterator0.key(), s) && egmf0.a(new String(levelDb$Iterator0.key(), "UTF-8"))) {
                                    TWR.useResource$NT(egyv0);
                                    TWR.useResource$NT(levelDb$Iterator0);
                                    gfsx gfsx1 = egzd.d(levelDb$Iterator0.value());
                                    if(gfsx1.i() && egmg0.a(gfsx1.d())) {
                                        TWR.useResource$NT(egyv0);
                                        TWR.useResource$NT(levelDb$Iterator0);
                                        if(hwxy.d()) {
                                            TWR.useResource$NT(egyv0);
                                            TWR.useResource$NT(levelDb$Iterator0);
                                            if(!hftp0.b_message.isImmutable()) {
                                                TWR.useResource$NT(egyv0);
                                                TWR.useResource$NT(levelDb$Iterator0);
                                                hftp0.ensureMutable();
                                            }
                                            TWR.useResource$NT(egyv0);
                                            TWR.useResource$NT(levelDb$Iterator0);
                                            ProtoLiteMessage hftv0 = hftp0.b_message;
                                            ((gioq)hftv0).d = 1;
                                            ((gioq)hftv0).b |= 2;
                                            if(!hftv0.isImmutable()) {
                                                TWR.useResource$NT(egyv0);
                                                TWR.useResource$NT(levelDb$Iterator0);
                                                hftp0.ensureMutable();
                                            }
                                            TWR.useResource$NT(egyv0);
                                            TWR.useResource$NT(levelDb$Iterator0);
                                            gioq gioq0 = (gioq)hftp0.b_message;
                                            gioq0.b |= 4;
                                            gioq0.e = 1;
                                            egzd.g(hftp0);
                                        }
                                        TWR.useResource$NT(egyv0);
                                        FIN.finallyCodeBegin$NT(v9);
                                        gfsx0 = gfsx1;
                                        break;
                                    }
                                    TWR.useResource$NT(egyv0);
                                    TWR.useResource$NT(levelDb$Iterator0);
                                    levelDb$Iterator0.next();
                                    continue;
                                }
                                TWR.useResource$NT(egyv0);
                                FIN.finallyExec$NT(v9);
                                if(hwxy.d()) {
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((gioq)hftp0.b_message).d = 1;
                                    ((gioq)hftp0.b_message).b |= 2;
                                    egzd.g(hftp0);
                                }
                                gfsx0 = gfqx.a;
                                break;
                            }
                        }
                        return gfsx0.i();
                    }
                    catch(LevelDbException | UnsupportedEncodingException | hfur exception0) {
                        egig.c("UserActionHistoryFeature", "Fail to access LevelDb", exception0);
                        throw new eglv("Fail to access LevelDb");
                    }
                }
                egqd egqd0 = egqd.b(egqg0.b) == null ? egqd.a : egqd.b(egqg0.b);
                ggeo ggeo0 = egly.a;
                if(ggeo0.containsKey(egqd0)) {
                    return ((eglx)ggeo0.get(egqd0)).a(context0, eglu0);
                }
                throw new eglv(String.format("Feature is not implemneted: %s", ((int)egqd0.x)));
            }
            default: {
                int v3 = egpx.a(v);
                if(v3 != 0) {
                    v2 = v3;
                }
                throw new eglw(String.format("Invalid evaluation type: %s", ((int)(v2 - 1))));
            }
        }
    }
}

