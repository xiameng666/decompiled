import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import java.util.List;

final class deui extends ibuo implements ibtw {
    public static final deui a;

    static {
        deui.a = new deui();
    }

    public deui() {
        super(2, depr.class, "homeReducer", "homeReducer(Lcom/google/android/gms/nearby/sharing/main/home/HomeState;Lcom/google/android/gms/nearby/sharing/main/home/HomeEvent;)Lcom/google/android/gms/nearby/sharing/main/home/HomeState;", 1);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        cusz cusz0;
        ibuq.f(((devp)object0), "p0");
        ibuq.f(((denx)object1), "p1");
        ibuq.f(((devp)object0), "state");
        ibuq.f(((denx)object1), "event");
        if((((denx)object1) instanceof denk)) {
            ShareTarget shareTarget0 = ((denk)(((denx)object1))).a;
            return shareTarget0.n ? dewk.j(((devp)object0), new depa(shareTarget0)) : dewk.b(((devp)object0), new depk(shareTarget0));
        }
        if((((denx)object1) instanceof denl)) {
            return dewk.h(((devp)object0), new deph(((denl)(((denx)object1))).a));
        }
        if((((denx)object1) instanceof denm)) {
            return dewk.h(((devp)object0), new depc(((denm)(((denx)object1))).a));
        }
        if((((denx)object1) instanceof deno)) {
            return dewk.a(((devp)object0), new depj(((deno)(((denx)object1))).a));
        }
        if((((denx)object1) instanceof denn)) {
            return dewk.a(((devp)object0), new depl(((denn)(((denx)object1))).a));
        }
        if((((denx)object1) instanceof denw)) {
            return dewk.j(dewk.a(((devp)object0), new depf()), new depg());
        }
        boolean z = false;
        dffm dffm0 = null;
        if((((denx)object1) instanceof denu)) {
            ShareTarget shareTarget1 = ((denu)(((denx)object1))).a;
            TransferMetadata transferMetadata0 = ((denu)(((denx)object1))).b;
            List list0 = ((denu)(((denx)object1))).c;
            switch(transferMetadata0.a) {
                case 1001: {
                    dffm0 = dffm.a;
                    break;
                }
                case 1002: {
                    String s = transferMetadata0.c;
                    if(s != null && !ibzk.D(s)) {
                        dffm0 = s;
                    }
                    dffm0 = new dffs(((String)dffm0));
                    break;
                }
                case 1005: {
                    float f = transferMetadata0.b / 100.0f;
                    if(transferMetadata0.o == 9) {
                        z = true;
                    }
                    dffm0 = new dffr(f, z, transferMetadata0.s);
                    break;
                }
                case 1006: {
                    dffm0 = new dffl(list0);
                    break;
                }
                case 0x3F4: {
                    dffm0 = dffo.a;
                    break;
                }
                case 1004: 
                case 1007: 
                case 1010: 
                case 0x3F3: 
                case 0x3F5: {
                    dffm0 = dffp.a;
                    break;
                }
                case 0x3F6: {
                    dffm0 = hvrc.h() ? dffv.a : dffp.a;
                    break;
                }
                case 1003: 
                case 0x3F8: {
                    String s1 = transferMetadata0.c;
                    if(s1 != null && !ibzk.D(s1)) {
                        dffm0 = s1;
                    }
                    dffm0 = new dfft(((String)dffm0));
                    break;
                }
                case 0x3F9: {
                    dffm0 = dffy.a;
                    break;
                }
                case 1009: 
                case 0x3FA: 
                case 0x3FD: {
                    dffm0 = dffk.a;
                    break;
                }
                case 0x400: {
                    dffm0 = new dffx(transferMetadata0.b / 100.0f);
                    break;
                }
                case 0x401: {
                    dffm0 = dffw.a;
                    break;
                }
                case 0x3FF: 
                case 0x402: {
                    dffm0 = dffu.a;
                    break;
                }
                case 0x3F0: 
                case 0x403: {
                    dffm0 = dffn.a;
                }
            }
            if(dffm0 == null) {
                return (devp)object0;
            }
            return shareTarget1.f ? dewk.g(((devp)object0), new deoy(shareTarget1, dffm0, transferMetadata0)) : dewk.a(((devp)object0), new deoz(shareTarget1, dffm0));
        }
        if((((denx)object1) instanceof dems)) {
            dffg dffg0 = ((dems)(((denx)object1))).a;
            if(dffg0.f) {
                return dewk.g(((devp)object0), new depm(dffg0));
            }
            return dffg0.e ? dewk.j(((devp)object0), new depn(dffg0)) : dewk.b(((devp)object0), new depo(dffg0));
        }
        if((((denx)object1) instanceof demo)) {
            return dewk.g(((devp)object0), new depp());
        }
        if((((denx)object1) instanceof denh)) {
            if(((denh)(((denx)object1))).c) {
                return devp.a(((devp)object0), null, new deys(cusz.a), null, null, null, null, 0x7D);
            }
            if(hvrc.y() && ((denh)(((denx)object1))).f) {
                return devp.a(((devp)object0), null, new deys(cusz.d), null, null, null, null, 0x7D);
            }
            if(((denh)(((denx)object1))).b) {
                if(!((denh)(((denx)object1))).a) {
                    cusz0 = cusz.b;
                    goto label_84;
                }
                return devp.a(((devp)object0), null, deym.a, null, null, null, null, 0x7D);
            }
            else {
                cusz0 = cusz.c;
            }
        label_84:
            if(((denh)(((denx)object1))).e) {
                return devp.a(((devp)object0), null, new deyp(cusz0), null, null, null, null, 0x7D);
            }
            if(((denh)(((denx)object1))).d) {
                return cusz0.ordinal() == 2 ? devp.a(((devp)object0), null, new deyp(cusz.c), null, null, null, null, 0x7D) : devp.a(((devp)object0), null, new deys(cusz0), null, null, null, null, 0x7D);
            }
            return ((denh)(((denx)object1))).a ? devp.a(((devp)object0), null, new deyn(cusz0), null, null, null, null, 0x7D) : devp.a(((devp)object0), null, new deys(cusz.b), null, null, null, null, 0x7D);
        }
        if((((denx)object1) instanceof deni)) {
            deoo deoo0 = new deoo(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new devt(deoo0));
        }
        if((((denx)object1) instanceof demy)) {
            deoq deoq0 = new deoq(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new devs(deoq0));
        }
        if((((denx)object1) instanceof demv)) {
            deor deor0 = new deor(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new devr(deor0));
        }
        if((((denx)object1) instanceof dend)) {
            deos deos0 = new deos(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new dewj(deos0));
        }
        if((((denx)object1) instanceof denc)) {
            deot deot0 = new deot(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new devu(deot0));
        }
        if((((denx)object1) instanceof denj)) {
            deou deou0 = new deou(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new devy(deou0));
        }
        if((((denx)object1) instanceof demz)) {
            deov deov0 = new deov(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new dewg(deov0));
        }
        if((((denx)object1) instanceof denb)) {
            deow deow0 = new deow(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new dewd(deow0));
        }
        if((((denx)object1) instanceof dena)) {
            deox deox0 = new deox(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.i(((devp)object0), new devz(deox0));
        }
        if((((denx)object1) instanceof demw)) {
            return devp.a(((devp)object0), null, null, null, null, null, ((demw)(((denx)object1))).a, 0x3F);
        }
        if((((denx)object1) instanceof dent)) {
            return devp.a(((devp)object0), null, deyt.a, null, null, null, null, 0x7D);
        }
        if((((denx)object1) instanceof denv)) {
            return devp.a(((devp)object0), null, deyu.a, null, null, null, null, 0x7D);
        }
        if((((denx)object1) instanceof demu)) {
            return devp.a(((devp)object0), null, deyr.a, null, null, null, null, 0x7D);
        }
        if((((denx)object1) instanceof demt)) {
            return devp.a(((devp)object0), null, new deyq(((demt)(((denx)object1))).a), null, null, null, null, 0x7D);
        }
        if((((denx)object1) instanceof dens)) {
            if(((devp)object0).c.ordinal() != 1) {
                return (devp)object0;
            }
            deyv deyv0 = ((devp)object0).b;
            if((deyv0 instanceof deyt)) {
                deyv0 = deym.a;
            }
            dfgj dfgj0 = new dfgj(null);
            return devp.a(((devp)object0), null, deyv0, deco.a, dfgj0, null, null, 0x71);
        }
        if((((denx)object1) instanceof denr)) {
            if(((devp)object0).c.ordinal() != 0) {
                return (devp)object0;
            }
            deyv deyv1 = ((devp)object0).b;
            if((deyv1 instanceof deyt)) {
                deyv1 = deym.a;
            }
            dfgh dfgh0 = new dfgh(null, false, 15);
            return devp.a(((devp)object0), null, deyv1, deco.b, null, dfgh0, null, 105);
        }
        if((((denx)object1) instanceof denp)) {
            return dewk.c(((devp)object0), new depq());
        }
        if((((denx)object1) instanceof demp)) {
            return dewk.c(((devp)object0), new deof());
        }
        if((((denx)object1) instanceof denq)) {
            return dewk.d(((devp)object0), new deog());
        }
        if((((denx)object1) instanceof demq)) {
            return dewk.d(((devp)object0), new deoh());
        }
        if((((denx)object1) instanceof dene)) {
            switch(((devp)object0).c.ordinal()) {
                case 0: {
                    return dewk.e(((devp)object0), new deoi(((denx)object1)));
                }
                case 1: {
                    deoj deoj0 = new deoj(((denx)object1));
                    ibuq.f(((devp)object0), "<this>");
                    return dewk.f(((devp)object0), new dewf(deoj0));
                }
                case 2: {
                    return dewk.e(((devp)object0), new deok(((denx)object1)));
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        if((((denx)object1) instanceof demn)) {
            if(((devp)object0).c.ordinal() != 1) {
                return (devp)object0;
            }
            deol deol0 = new deol(((denx)object1));
            ibuq.f(((devp)object0), "<this>");
            return dewk.f(((devp)object0), new devx(deol0));
        }
        if((((denx)object1) instanceof demx)) {
            if(((devp)object0).c.ordinal() == 1) {
                deom deom0 = new deom(((denx)object1));
                ibuq.f(((devp)object0), "<this>");
                return dewk.f(((devp)object0), new dewh(deom0));
            }
            return (devp)object0;
        }
        if((((denx)object1) instanceof demr)) {
            return ((devp)object0).c.ordinal() == 0 ? dewk.a(((devp)object0), new deon()) : ((devp)object0);
        }
        if((((denx)object1) instanceof denf)) {
            return devp.a(((devp)object0), null, deym.a, null, null, null, null, 0x7D);
        }
        throw new ibnq();
    }
}

