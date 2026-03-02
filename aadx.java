import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;
import j..util.DesugarCollections;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aadx extends aadr {
    private static final baun c;
    private static final Pattern d;
    private final grup e;
    private final du f;

    static {
        aadx.c = new baun("AccountSettings", new String[]{"IntentLauncher"});
        aadx.d = Pattern.compile("^((\\d+\\.)*\\d+).*");
    }

    public aadx(grup grup0, du du0, aahq aahq0, aaej aaej0) {
        super(aahq0, aaej0);
        this.e = grup0;
        this.f = du0;
    }

    @Override  // aady
    public final void a() {
        Intent intent0 = aadx.b(this.e);
        if(intent0 != null) {
            this.d(intent0);
        }
    }

    // This method was un-flattened
    public static Intent b(grup grup0) {
        int v4;
        Throwable throwable0 = null;
        if(grup0 != null && (grup0.b & 1) != 0) {
            if(!bbqr.d((grup0.d == null ? gruo.a : grup0.d).b)) {
                if(bbqr.d((grup0.d == null ? gruo.a : grup0.d).c) && bbqr.d((grup0.d == null ? gruo.a : grup0.d).d)) {
                    return null;
                }
                if(!(grup0.d == null ? gruo.a : grup0.d).i && !azql.c(AppContextProvider.a()).g((grup0.d == null ? gruo.a : grup0.d).b)) {
                    aadx.c.f("Signature check failed for %s", new Object[]{(grup0.d == null ? gruo.a : grup0.d).b});
                    return null;
                }
                int v = grup0.c.size();
                for(Object object0: grup0.c) {
                    grur grur0 = (grur)object0;
                    if(grur0 == null) {
                        continue;
                    }
                    if(bbqr.d(grur0.b)) {
                        goto label_40;
                    }
                    try {
                        if(!bbmq.U(AppContextProvider.a(), grur0.b)) {
                            continue;
                        }
                        if(grur0.e.size() > 0 || grur0.f.size() > 0) {
                            String s = bbmq.y(AppContextProvider.a(), grur0.b);
                            try {
                                if(bbqr.d(s)) {
                                    continue;
                                }
                                gftb.check(s);
                                Matcher matcher0 = aadx.d.matcher(s);
                                if(!matcher0.matches()) {
                                    continue;
                                }
                                ggdy ggdy0 = new ggdy();
                                gfud gfud0 = gfud.e('.');
                                String s1 = matcher0.group(1);
                                gftb.check(s1);
                                for(Object object1: gfud0.n(s1)) {
                                    ggdy0.i(Integer.valueOf(((String)object1)));
                                }
                                gged_interceptors gged0 = ggdy0.h();
                                if((grur0.e.size() == 0 || aadx.c(gged0, grur0.e) >= 0) && (grur0.f.size() == 0 || aadx.c(gged0, grur0.f) < 0)) {
                                    goto label_33;
                                }
                            }
                            catch(NumberFormatException unused_ex) {
                            }
                            continue;
                        }
                    label_33:
                        if(grur0.c > 0 || grur0.d > 0) {
                            int v1 = bbms.b(AppContextProvider.a(), grur0.b);
                            if(v1 >= grur0.c) {
                                goto label_36;
                            }
                            else {
                                continue;
                            }
                        }
                        goto label_40;
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        continue;
                    }
                label_36:
                    if(grur0.d != 0 && v1 > grur0.d) {
                        continue;
                    }
                    goto label_40;
                }
                if(v != 0) {
                    return null;
                }
            label_40:
                Intent intent0 = new Intent();
                intent0.setPackage((grup0.d == null ? gruo.a : grup0.d).b);
                if(!bbqr.d((grup0.d == null ? gruo.a : grup0.d).c)) {
                    gruo gruo0 = grup0.d;
                    String s2 = (gruo0 == null ? gruo.a : gruo0).b;
                    if(gruo0 == null) {
                        gruo0 = gruo.a;
                    }
                    intent0.setClassName(s2, gruo0.c);
                }
                for(Object object2: DesugarCollections.unmodifiableMap((grup0.d == null ? gruo.a : grup0.d).g).entrySet()) {
                    String s3 = (String)((Map.Entry)object2).getKey();
                    grvs grvs0 = (grvs)((Map.Entry)object2).getValue();
                    int v2 = grvs0.b;
                    int v3 = 0;
                    switch(v2) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            v4 = 1;
                            break;
                        }
                        case 2: {
                            v4 = 2;
                            break;
                        }
                        case 3: {
                            v4 = 3;
                            break;
                        }
                        case 4: {
                            v4 = 4;
                            break;
                        }
                        case 5: {
                            v4 = 5;
                            break;
                        }
                        case 6: {
                            v4 = 6;
                            break;
                        }
                        case 7: {
                            v4 = 7;
                            break;
                        }
                        case 8: {
                            v4 = 8;
                            break;
                        }
                        case 9: {
                            v4 = 9;
                            break;
                        }
                        case 10: {
                            v4 = 10;
                            break;
                        }
                        case 11: {
                            v4 = 11;
                            break;
                        }
                        case 12: {
                            v4 = 12;
                            break;
                        }
                        case 13: {
                            v4 = 13;
                            break;
                        }
                        case 14: {
                            v4 = 14;
                            break;
                        }
                        case 15: {
                            v4 = 15;
                            break;
                        }
                        case 16: {
                            v4 = 16;
                            break;
                        }
                        case 17: {
                            v4 = 17;
                            break;
                        }
                        case 18: {
                            v4 = 18;
                            break;
                        }
                        default: {
                            throw throwable0;
                        }
                    }
                    switch(v4 - 1) {
                        case 0: {
                            intent0.putExtra(s3, (v2 == 1 ? ((String)grvs0.c) : ""));
                            throwable0 = throwable0;
                            break;
                        }
                        case 1: {
                            intent0.putExtra(s3, ((String[])(v2 == 2 ? ((grzp)grvs0.c) : grzp.a).b.toArray(new String[0])));
                            throwable0 = throwable0;
                            break;
                        }
                        case 2: {
                            if(v2 == 3) {
                                v3 = ((Boolean)grvs0.c).booleanValue();
                            }
                            intent0.putExtra(s3, ((boolean)v3));
                            throwable0 = throwable0;
                            break;
                        }
                        case 3: {
                            intent0.putExtra(s3, glwj.b((v2 == 4 ? ((grux)grvs0.c) : grux.a).b));
                            throwable0 = throwable0;
                            break;
                        }
                        case 4: {
                            if(v2 == 5) {
                                v3 = (int)(((Integer)grvs0.c));
                            }
                            intent0.putExtra(s3, ((char)v3));
                            throwable0 = throwable0;
                            break;
                        }
                        case 5: {
                            int[] arr_v = glwy.n((v2 == 6 ? ((grvj)grvs0.c) : grvj.a).b);
                            char[] arr_c = new char[arr_v.length];
                            while(v3 < arr_v.length) {
                                arr_c[v3] = (char)arr_v[v3];
                                ++v3;
                            }
                            intent0.putExtra(s3, arr_c);
                            throwable0 = throwable0;
                            break;
                        }
                        case 6: {
                            if(v2 == 7) {
                                v3 = (int)(((Integer)grvs0.c));
                            }
                            intent0.putExtra(s3, ((byte)v3));
                            throwable0 = throwable0;
                            break;
                        }
                        case 7: {
                            intent0.putExtra(s3, glwl.e((v2 == 8 ? ((grva)grvs0.c) : grva.a).b));
                            throwable0 = throwable0;
                            break;
                        }
                        case 8: {
                            if(v2 == 9) {
                                v3 = (int)(((Integer)grvs0.c));
                            }
                            intent0.putExtra(s3, ((short)v3));
                            throwable0 = throwable0;
                            break;
                        }
                        case 9: {
                            intent0.putExtra(s3, glxf.e((v2 == 10 ? ((gryx)grvs0.c) : gryx.a).b));
                            throwable0 = throwable0;
                            break;
                        }
                        case 10: {
                            if(v2 == 11) {
                                v3 = (int)(((Integer)grvs0.c));
                            }
                            intent0.putExtra(s3, v3);
                            throwable0 = throwable0;
                            break;
                        }
                        case 11: {
                            intent0.putExtra(s3, glwy.n((v2 == 12 ? ((grwi)grvs0.c) : grwi.a).b));
                            throwable0 = throwable0;
                            break;
                        }
                        case 12: {
                            intent0.putExtra(s3, (v2 == 13 ? ((double)(((Double)grvs0.c))) : 0.0));
                            throwable0 = throwable0;
                            break;
                        }
                        case 13: {
                            intent0.putExtra(s3, glwp.d((v2 == 14 ? ((grvq)grvs0.c) : grvq.a).b));
                            throwable0 = throwable0;
                            break;
                        }
                        case 14: {
                            intent0.putExtra(s3, (v2 == 15 ? ((float)(((Float)grvs0.c))) : 0.0f));
                            throwable0 = throwable0;
                            break;
                        }
                        case 15: {
                            intent0.putExtra(s3, glws.d((v2 == 16 ? ((grvw)grvs0.c) : grvw.a).b));
                            throwable0 = throwable0;
                            break;
                        }
                        case 16: {
                            intent0.putExtra(s3, (v2 == 17 ? ((long)(((Long)grvs0.c))) : 0L));
                            throwable0 = throwable0;
                            break;
                        }
                        case 17: {
                            intent0.putExtra(s3, glxd.j((v2 == 18 ? ((grwt)grvs0.c) : grwt.a).b));
                            throwable0 = throwable0;
                            break;
                        }
                        default: {
                            throwable0 = throwable0;
                        }
                    }
                }
                for(Object object3: (grup0.d == null ? gruo.a : grup0.d).h) {
                    intent0.addCategory(((String)object3));
                }
                if(!bbqr.d((grup0.d == null ? gruo.a : grup0.d).d)) {
                    intent0.setAction((grup0.d == null ? gruo.a : grup0.d).d);
                }
                if(!bbqr.d((grup0.d == null ? gruo.a : grup0.d).e)) {
                    intent0.setData(Uri.parse((grup0.d == null ? gruo.a : grup0.d).e));
                }
                if(!bbqr.d((grup0.d == null ? gruo.a : grup0.d).f)) {
                    intent0.setType((grup0.d == null ? gruo.a : grup0.d).f);
                }
                if(hoju.n() && (grup0.d == null ? gruo.a : grup0.d).j) {
                    intent0.addFlags(0x10000000);
                }
                return intent0;
            }
            return null;
        }
        return null;
    }

    private static int c(List list0, List list1) {
        int v = ((ggna)list0).c;
        int v1 = Math.max(v, list1.size());
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = v2 >= v ? 0 : ((int)(((Integer)list0.get(v2))));
            int v4 = v2 >= list1.size() ? 0 : ((int)(((Integer)list1.get(v2))));
            if(v3 > v4) {
                return 1;
            }
            if(v3 < v4) {
                return -1;
            }
        }
        return 0;
    }

    private final void d(Intent intent0) {
        try {
            this.f.startActivityForResult(intent0, 12);
            this.b.a(true);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            this.a.a(activityNotFoundException0);
        }
    }
}

