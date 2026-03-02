import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;
import java.util.Iterator;

public final class zif {
    public static grxr a(grxr grxr0) {
        gsae gsae3;
        boolean z;
        gsae gsae1;
        grul grul0;
        if(grxr0.c == 3) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grxr0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)grxr0));
            grxr grxr1 = (grxr)hftp0.b_message;
            gryc gryc0 = grxr1.c == 3 ? ((gryc)grxr1.d) : gryc.a;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gryc0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gryc0));
            if(!((gryb)hftp1).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gryb)hftp1))).ensureMutable();
            }
            ((gryc)((gryb)hftp1).b_message).b = hfvv.a;
            grxr grxr2 = (grxr)hftp0.b_message;
            Iterator iterator0 = (grxr2.c == 3 ? ((gryc)grxr2.d) : gryc.a).b.iterator();
        alab1:
            while(true) {
                int v = 1;
                if(!iterator0.hasNext()) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grul.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grwu.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    grwu grwu0 = (grwu)hftp3.b_message;
                    "Something went wrong".getClass();
                    grwu0.b |= 1;
                    grwu0.c = "Something went wrong";
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    grul grul1 = (grul)hftp2.b_message;
                    grwu grwu1 = (grwu)hftp3.N_build();
                    grwu1.getClass();
                    grul1.e = grwu1;
                    grul1.b |= 8;
                    grul0 = (grul)hftp2.N_build();
                    break;
                }
                Object object0 = iterator0.next();
                grul0 = (grul)object0;
                if((grul0.b & 4) != 0) {
                    gruz gruz0 = grul0.d == null ? gruz.a : grul0.d;
                    String s = gruz0.c;
                    if((gruz0.b & 2) == 0) {
                        gsae1 = null;
                    }
                    else {
                        gsae gsae0 = gruz0.d;
                        gsae1 = gsae0 == null ? gsae.a : gsae0;
                    }
                    if(bbqr.d(ccht.b(s, gsae1))) {
                        goto label_28;
                    }
                    break;
                }
            label_28:
                if((grul0.b & 8) != 0 && !bbqr.d((grul0.e == null ? grwu.a : grul0.e).c)) {
                    break;
                }
                if((grul0.b & 2) != 0) {
                    switch((grul0.c == null ? grwv.a : grul0.c).c) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            v = 2;
                            break;
                        }
                        case 2: {
                            v = 3;
                            break;
                        }
                        case 4: {
                            v = 5;
                            break;
                        }
                        case 5: {
                            v = 6;
                            break;
                        }
                        case 6: {
                            v = 7;
                            break;
                        }
                        case 7: {
                            v = 8;
                            break;
                        }
                        case 8: {
                            v = 9;
                            break;
                        }
                        case 9: {
                            v = 10;
                            break;
                        }
                        case 10: {
                            v = 11;
                            break;
                        }
                        case 17: {
                            v = 18;
                            break;
                        }
                        case 19: {
                            v = 20;
                            break;
                        }
                        case 21: {
                            v = 22;
                            break;
                        }
                        case 22: {
                            v = 23;
                            break;
                        }
                        case 23: {
                            v = 24;
                            break;
                        }
                        default: {
                            v = 0;
                        }
                    }
                    if(v != 0) {
                        switch(v - 1) {
                            case 2: {
                                z = aaei.g(aaei.d("account_name"));
                                goto label_78;
                            }
                            case 4: {
                                try {
                                    String s1 = bbmq.y(AppContextProvider.a(), "com.google.android.apps.maps");
                                    if(!bbqr.d(s1)) {
                                        gftb.check(s1);
                                        String[] arr_s = s1.split("\\.");
                                        if(arr_s.length >= 2) {
                                            int v1 = Integer.parseInt(arr_s[0]);
                                            if(v1 != 9) {
                                                goto label_74;
                                            }
                                            else if(Integer.parseInt(arr_s[1]) >= 20) {
                                                goto label_75;
                                            }
                                        }
                                    }
                                }
                                catch(PackageManager.NameNotFoundException | NumberFormatException unused_ex) {
                                }
                                break;
                            label_74:
                                if(v1 > 9) {
                                label_75:
                                    if(aaei.g(aaei.b("account_name"))) {
                                        break alab1;
                                    }
                                }
                                break;
                            }
                            case 5: {
                                z = aaei.g(aaei.c("account_name"));
                            label_78:
                                if(!z) {
                                    break;
                                }
                                break alab1;
                            }
                            case 7: 
                            case 10: 
                            case 19: {
                                break alab1;
                            }
                        }
                    }
                }
                if((grul0.b & 16) != 0) {
                    gsai gsai0 = grul0.f == null ? gsai.a : grul0.f;
                    if(hojn.n()) {
                        String s2 = gsai0.c;
                        if((gsai0.b & 2) == 0) {
                            gsae3 = null;
                        }
                        else {
                            gsae gsae2 = gsai0.d;
                            gsae3 = gsae2 == null ? gsae.a : gsae2;
                        }
                        if(bbqr.d(ccht.b(s2, gsae3))) {
                            goto label_92;
                        }
                        break;
                    }
                }
            label_92:
                int v2 = grul0.b;
                if((v2 & 0x20) != 0 || (v2 & 0x80) != 0) {
                    break;
                }
                if((v2 & 0x100) != 0) {
                    Intent intent0 = aadx.b((grul0.i == null ? grup.a : grul0.i));
                    if(intent0 == null || !bbmq.ae(AppContextProvider.a(), intent0)) {
                        goto label_97;
                    }
                    break;
                }
            label_97:
                if((grul0.b & 0x800) != 0) {
                    break;
                }
            }
            ((gryb)hftp1).a(grul0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grxr grxr3 = (grxr)hftp0.b_message;
            gryc gryc1 = (gryc)((ProtoLiteBuilder)(((gryb)hftp1))).N_build();
            gryc1.getClass();
            grxr3.d = gryc1;
            grxr3.c = 3;
            return (grxr)hftp0.N_build();
        }
        return grxr0;
    }
}

