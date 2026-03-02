import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import j..util.Objects;
import java.util.List;
import jeb.synthetic.TWR;

public final class eisz extends eiqt {
    private final eiqg a;
    private final eitb b;

    public eisz(eiqg eiqg0, String s, String s1, String s2, Flag[] arr_flag) {
        super("SetFlagOverridesOperationCall", hlse.R);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eitb(s1, s2, arr_flag, s, new eisy());
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.b.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final List d() {
        return this.b.b;
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        eioe eioe0;
        eiui eiui0;
        boolean z;
        String s5;
        eiok eiok0;
        int v4;
        String s4;
        String s3;
        eiol eiol0;
        Throwable throwable2;
        String s2;
        byte[] arr_b;
        Double double0;
        Long long1;
        Long long0;
        Flag flag1;
        eiop eiop1;
        eior eior1;
        String s1;
        int v1;
        eitb eitb0 = this.b;
        if(eitb0.a == null || eitb0.a.length() == 0) {
            throw new eipa(29500, "No package name");
        }
        String s = eitb0.d;
        if(s == null) {
            throw new eipa(29500, "No user");
        }
        if(!s.equals("*") && !s.equals("") && !eipt.a(s, context0)) {
            throw new eipa(29500, "User not on device");
        }
        Flag[] arr_flag = eitb0.e;
        if(arr_flag == null) {
            throw new eipa(29500, "No flags");
        }
        int v = 0;
        while(true) {
            v1 = arr_flag.length;
            if(v >= v1) {
                goto label_29;
            }
            Flag flag0 = arr_flag[v];
            if(flag0 == null) {
                throw new eipa(29500, "Null flag");
            }
            if(flag0.b == null || flag0.b.length() == 0) {
                break;
            }
            int v2 = flag0.h;
            if(v2 == 4) {
                flag0.d();
            }
            else if(v2 == 5) {
                flag0.g();
            }
            if(flag0.i == -1000) {
                if(!s.equals("*")) {
                    throw new eipa(29500, "Flag commit requires user *");
                }
                if(fhcd.g(context0)) {
                    throw new eipa(29500, "Cannot override flag during direct boot.");
                }
            }
            ++v;
        }
        throw new eipa(29500, "No flag name");
    label_29:
        eior eior0 = eiox0.a();
        eiop eiop0 = eior0.b();
        try {
            s1 = eitb0.f;
            eitb0.a = eipn.c(eitb0.a, s1);
            if(hxly.e().b.contains(s1)) {
                goto label_34;
            }
            goto label_39;
        }
        catch(Throwable throwable0) {
            goto label_84;
        }
        try {
        label_34:
            if(eiop0.f()) {
                if(!((eioh)eiop0).g("SELECT EXISTS(\n  SELECT NULL\n  FROM config_packages\n  INNER JOIN android_packages\n    USING (android_package_id)\n  WHERE\n    config_packages.name = ?1\n    AND android_packages.name = ?2\n);\n").h(new Object[]{eitb0.a, s1}).g()) {
                    throw new SecurityException(s1 + " is not authorized to operate on " + eitb0.a);
                }
            }
            else if(!((eioh)eiop0).g("SELECT EXISTS(SELECT NULL FROM Packages WHERE packageName = ? AND androidPackageName = ?)").h(new Object[]{eitb0.a, s1}).g()) {
                throw new SecurityException(eitb0.f + " is not authorized to operate on " + eitb0.a);
            }
        }
        catch(Throwable throwable1) {
            goto label_75;
        }
        try {
        label_39:
            if(eiop0.f()) {
                goto label_40;
            }
            else {
                goto label_44;
            }
            goto label_104;
        }
        catch(Throwable throwable0) {
            goto label_84;
        }
        try {
        label_40:
            eitb0.h = eitb.a(eiop0, eitb0.a, s, arr_flag, true);
            eior1 = eior0;
            eiop1 = eiop0;
            goto label_104;
        }
        catch(Throwable throwable1) {
            goto label_75;
        }
    label_44:
        int v3 = 0;
        while(true) {
            if(v3 >= v1) {
                goto label_101;
            }
            try {
                flag1 = arr_flag[v3];
                switch(flag1.h) {
                    case 1: {
                        goto label_49;
                    }
                    case 2: {
                        goto label_53;
                    }
                    case 3: {
                        goto label_57;
                    }
                    case 4: {
                        goto label_62;
                    }
                    case 5: {
                        goto label_68;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_84;
            }
            try {
                throw new eipa(29500, "Unrecognized flag type");
            }
            catch(Throwable throwable1) {
                goto label_75;
            }
            try {
            label_49:
                long0 = flag1.b();
                long1 = null;
                double0 = null;
            }
            catch(Throwable throwable0) {
                goto label_84;
            }
            goto label_60;
            try {
            label_53:
                long1 = (long)(flag1.f() ? 1L : 0L);
                long0 = null;
            }
            catch(Throwable throwable1) {
                goto label_75;
            }
            try {
                double0 = null;
            }
            catch(Throwable throwable0) {
                goto label_84;
            }
            goto label_60;
            try {
            label_57:
                double0 = flag1.a();
                long1 = null;
                long0 = null;
            }
            catch(Throwable throwable1) {
                goto label_75;
            }
            try {
            label_60:
                arr_b = null;
                goto label_72;
            }
            catch(Throwable throwable0) {
                goto label_84;
            }
            try {
            label_62:
                s2 = flag1.d();
                long1 = null;
                long0 = null;
                double0 = null;
                arr_b = null;
                goto label_78;
            label_68:
                arr_b = flag1.g();
                long1 = null;
                long0 = null;
                double0 = null;
            label_72:
                s2 = null;
            }
            catch(Throwable throwable1) {
            label_75:
                throwable2 = throwable1;
                eiop1 = eiop0;
                goto label_110;
            }
            try {
            label_78:
                eiol0 = eiop0.c("INSERT OR REPLACE INTO FlagOverrides (packageName, user, name, flagType, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, 0, ?, ?, ?, ?, ?)");
                s3 = eitb0.a;
                s4 = flag1.b;
                v4 = flag1.i;
            }
            catch(Throwable throwable0) {
            label_84:
                eiop1 = eiop0;
                break;
            }
            int v5 = v4 == -1000 ? 0 : v4;
            try {
                eiop1 = eiop0;
                eiol0.g(new Object[]{s3, s, s4, v5, long0, long1, double0, s2, arr_b}).d();
                if(v4 == -1000) {
                    eiop1.c("INSERT OR REPLACE INTO FlagOverrides (packageName, user, name, flagType, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, 0, 1, ?, ?, ?, ?, ?)").g(new Object[]{eitb0.a, s, s4, long0, long1, double0, s2, arr_b}).d();
                    eitb0.h = true;
                }
                eiop0 = eiop1;
                ++v3;
                v1 = v1;
                arr_flag = arr_flag;
                eior0 = eior0;
                continue;
            label_101:
                eior1 = eior0;
                eiop1 = eiop0;
                einw.b(eiop1, eitb0.a);
            label_104:
                if(hxln.d() && eitb0.h) {
                    eirf.a.b(eiox0, eiop1, eitb0.a);
                }
                eiop1.e();
                goto label_115;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        throwable2 = throwable0;
        try {
        label_110:
            eiop1.close();
        }
        catch(Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    label_115:
        eiop1.close();
        if(eitb0.h && !hxln.d()) {
            eirf.a.e();
        }
        eiog eiog0 = eior1.a();
        try {
            eiok0 = ((eioh)eiog0).g((eiog0.f() ? "SELECT android_packages.name\nFROM android_packages\nINNER JOIN config_packages\n  USING (android_package_id)\nWHERE config_packages.name = ?1;\n" : "SELECT androidPackageName FROM Packages WHERE packageName = ? LIMIT 1")).h(new Object[]{eitb0.a}).i();
        }
        catch(Throwable throwable4) {
            goto label_133;
        }
        if(eiok0 == null) {
            goto label_127;
        }
        else {
            try {
                s5 = eiok0.h(0);
                z = true;
            }
            catch(Throwable throwable5) {
                try {
                    TWR.safeClose$NT(eiok0, throwable5);
                    throw throwable5;
                label_127:
                    s5 = "";
                    z = false;
                label_129:
                    if(eiok0 != null) {
                        eiok0.close();
                    }
                    goto label_135;
                }
                catch(Throwable throwable4) {
                    goto label_133;
                }
            }
        }
        goto label_129;
    label_133:
        TWR.safeClose$NT(eiog0, throwable4);
        throw throwable4;
    label_135:
        eiog0.close();
        if(z) {
            int v6 = Objects.equals(eitb0.f, "com.google.android.apps.mobileutilities") ? 22 : 21;
            eiog eiog1 = eior1.a();
            try {
                eiui0 = new eiui(context0, 0L);
            }
            catch(Throwable throwable6) {
                goto label_174;
            }
            try {
                eioe0 = ((eioh)eiog1).g((eiog1.f() ? "SELECT name FROM accounts" : "SELECT user FROM RequestTags")).e(new String[]{"accounts", "RequestTags"}).f();
            }
            catch(Throwable throwable7) {
                goto label_169;
            }
            while(true) {
                try {
                    if(!eioe0.b()) {
                        goto label_165;
                    }
                    String s6 = eioe0.h(0);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)goab.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)goau.a).v_newBuilder();
                    String s7 = eitb0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    goau goau0 = (goau)hftp1.b_message;
                    s7.getClass();
                    goau0.b |= 1;
                    goau0.c = s7;
                    goau goau1 = (goau)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    goab goab0 = (goab)hftp0.b_message;
                    goau1.getClass();
                    goab0.c = goau1;
                    goab0.b |= 1;
                    eiui0.b(((goab)hftp0.N_build()), s5, s6, eiog1);
                }
                catch(Throwable throwable8) {
                    try {
                        TWR.safeClose$NT(eioe0, throwable8);
                        throw throwable8;
                    label_165:
                        eioe0.close();
                        eiui0.c();
                        goto label_171;
                    }
                    catch(Throwable throwable7) {
                    }
                    break;
                }
            }
            try {
            label_169:
                TWR.safeClose$NT(eiui0, throwable7);
                throw throwable7;
            label_171:
                eiui0.close();
            }
            catch(Throwable throwable6) {
            label_174:
                TWR.safeClose$NT(eiog1, throwable6);
                throw throwable6;
            }
            eiog1.close();
            eiot.c(eiox0, new ggoh(eitb0.a));
            eipp eipp0 = eipr.a(context0, eitb0.g, eitb0.a, s5, v6, true);
            hlri hlri0 = eipp0.a;
            if(hlri0 != null) {
                eitb0.b.add(hlri0);
            }
            hlrk hlrk0 = eipp0.b;
            if(hlrk0 != null) {
                eitb0.c.add(hlrk0);
            }
        }
        if(eitb0.h) {
            context0.getContentResolver().notifyChange(fpib.a(eitb0.a), null);
        }
        eipw.a(context0).b(eitb0.a);
        this.a.l(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.l(status0);
    }
}

