import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class bmzw implements bmzv {
    protected final int a;
    private static final ggeo b;
    private static final bboh c;
    private static ModuleManager d;

    static {
        ggfp.M("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.chrome.canary");
        ggek ggek0 = new ggek();
        ggek0.i(bnfl.b, Integer.valueOf(1));
        ggek0.i(bnfl.c, Integer.valueOf(2));
        ggek0.i(bnfl.d, Integer.valueOf(3));
        ggek0.i(bnfl.e, Integer.valueOf(4));
        ggek0.i(bnfl.h, Integer.valueOf(0xFA));
        ggek0.i(bnfl.i, Integer.valueOf(0xFB));
        ggek0.i(bnfl.a, Integer.valueOf(200));
        ggek0.i(bnfl.f, Integer.valueOf(150));
        bmzw.b = ggek0.b();
        bmzw.c = bnaa.d("EventLogger");
    }

    protected bmzw(Context context0) {
        gfsx gfsx0;
        if(bmzw.d == null) {
            bmzw.d = ModuleManager.get(context0);
        }
        try {
            Collection collection0 = bmzw.d.getAllModules();
            if(!bbnh.k(collection0)) {
                for(Object object0: collection0) {
                    ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object0;
                    if(moduleManager$ModuleInfo0 == null || !moduleManager$ModuleInfo0.moduleId.equals("com.google.android.gms.fido")) {
                        continue;
                    }
                    gfsx0 = gfsx.m(Integer.valueOf(moduleManager$ModuleInfo0.moduleVersion));
                    goto label_18;
                }
            }
        }
        catch(InvalidConfigException invalidConfigException0) {
            a.ae(bmzw.c.i(), "Module version could not be fetched", invalidConfigException0);
        }
        gfsx0 = gfqx.a;
    label_18:
        new aytt(context0, "FIDO").a();
        faih.a(context0);
        super();
        this.a = (int)(((Integer)gfsx0.f(Integer.valueOf(0))));
    }

    @Override  // bmzv
    public final void c(bnae bnae0, ViewOptions viewOptions0) {
        gftb.check(viewOptions0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)blhv.a).v_newBuilder();
        String s = viewOptions0.e().toString();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        blhv blhv0 = (blhv)hftp0.b_message;
        s.getClass();
        blhv0.b |= 2;
        blhv0.d = s;
        if(viewOptions0.d().equals(bnfl.g)) {
            return;
        }
        bnfl bnfl0 = viewOptions0.d();
        Integer integer0 = (Integer)bmzw.b.get(bnfl0);
        if(integer0 != null) {
            int v = blhu.a(integer0.intValue());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            blhv blhv1 = (blhv)hftp0.b_message;
            if(v == 0) {
                throw null;
            }
            blhv1.c = v - 1;
            blhv1.b |= 1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)blgo.a).v_newBuilder();
        int v1 = bnae0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((blgo)hftv0).b |= 1;
        ((blgo)hftv0).c = v1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((blgo)hftv1).d = 4;
        ((blgo)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        blgo blgo0 = (blgo)hftp1.b_message;
        blhv blhv2 = (blhv)hftp0.N_build();
        blhv2.getClass();
        blgo0.h = blhv2;
        blgo0.b |= 0x20;
        bmzw.d(((blgo)hftp1.N_build()));
    }

    protected static final void d(blgo blgo0) {
        if(hsvd.a.b().e()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v = blgn.b(blgo0.d) == 0 ? 1 : blgn.b(blgo0.d);
            String s = "null";
            switch(v - 1) {
                case 4: {
                    blhv blhv0 = blgo0.h == null ? blhv.a : blgo0.h;
                    stringBuilder0.append("event_type: ");
                    stringBuilder0.append("U2F_VIEW_SELECTED");
                    stringBuilder0.append("\nu2f_view: ");
                    int v3 = blhu.a(blhv0.c);
                    if(v3 == 0) {
                        s = "VIEW_UNKNOWN_DO_NOT_USE";
                    }
                    else {
                        switch(v3) {
                            case 1: {
                                s = "VIEW_UNKNOWN_DO_NOT_USE";
                                break;
                            }
                            case 2: {
                                s = "VIEW_NFC_INSTRUCTIONS";
                                break;
                            }
                            case 3: {
                                s = "VIEW_NFC_ENABLE";
                                break;
                            }
                            case 4: {
                                s = "VIEW_NFC_KEY_DISCOVERED";
                                break;
                            }
                            case 5: {
                                s = "VIEW_NFC_REMOVE_KEY";
                                break;
                            }
                            case 101: {
                                s = "VIEW_BLE_INSTRUCTIONS";
                                break;
                            }
                            case 102: {
                                s = "VIEW_BLE_PAIR_DEVICE";
                                break;
                            }
                            case 103: {
                                s = "VIEW_BLE_PROCESSING";
                                break;
                            }
                            case 104: {
                                s = "VIEW_BLE_SELECT_DEVICE";
                                break;
                            }
                            case 105: {
                                s = "VIEW_BLE_ENABLE";
                                break;
                            }
                            case 0x97: {
                                s = "VIEW_USB_INSTRUCTIONS";
                                break;
                            }
                            case 201: {
                                s = "VIEW_MULTI_TRANSPORT";
                                break;
                            }
                            case 0xFB: {
                                s = "VIEW_PIN_CREATE";
                                break;
                            }
                            case 0xFC: {
                                s = "VIEW_PIN_CONFIRM";
                            }
                        }
                    }
                    stringBuilder0.append(s);
                    stringBuilder0.append("\nu2f_view_options: ");
                    stringBuilder0.append(blhv0.d);
                    break;
                }
                case 101: {
                    stringBuilder0.append("event_type: ");
                    blgu blgu0 = blgo0.t == null ? blgu.a : blgo0.t;
                    blgt blgt0 = blgt.a;
                    if((blgt.b(blgu0.c) == null ? blgt.a : blgt.b(blgu0.c)) == blgt0) {
                        blgu blgu1 = blgo0.l == null ? blgu.a : blgo0.l;
                        if((blgt.b(blgu1.c) == null ? blgt0 : blgt.b(blgu1.c)) != blgt0) {
                            stringBuilder0.append("U2fGenericEvent::");
                            blgt blgt2 = blgt.b((blgo0.l == null ? blgu.a : blgo0.l).c);
                            if(blgt2 != null) {
                                blgt0 = blgt2;
                            }
                            stringBuilder0.append(blgt0.name());
                        }
                    }
                    else {
                        stringBuilder0.append("FidoGenericEvent::");
                        blgt blgt1 = blgt.b((blgo0.t == null ? blgu.a : blgo0.t).c);
                        if(blgt1 != null) {
                            blgt0 = blgt1;
                        }
                        stringBuilder0.append(blgt0.name());
                    }
                    break;
                }
                case 400: {
                    stringBuilder0.append("event_type: ");
                    stringBuilder0.append("ESK_EVENT");
                    stringBuilder0.append("\nkey_type: ");
                    blgd blgd0 = blgo0.y == null ? blgd.a : blgo0.y;
                    stringBuilder0.append((blgc.b(blgd0.d) == null ? blgc.a : blgc.b(blgd0.d)).name());
                    break;
                }
                case 600: {
                    stringBuilder0.append("event_type: PasskeyEvent::");
                    blhg blhg0 = blgo0.z == null ? blhg.a : blgo0.z;
                    stringBuilder0.append((blhf.b(blhg0.c) == null ? blhf.a : blhf.b(blhg0.c)).name());
                    break;
                }
                case 900: {
                    stringBuilder0.append("\nevent_type: HybridEvent::");
                    blha blha0 = blgo0.C == null ? blha.a : blgo0.C;
                    stringBuilder0.append((blgz.b(blha0.c) == null ? blgz.a : blgz.b(blha0.c)).name());
                    break;
                }
                default: {
                    String s1 = "UNDEFINED_DO_NOT_USE";
                    switch(v - 1) {
                        case 150: {
                            blgj blgj0 = blgo0.q == null ? blgj.a : blgo0.q;
                            stringBuilder0.append("event_type: ");
                            stringBuilder0.append("FIDO2_SIGN_REQUEST");
                            stringBuilder0.append("\nrp_id: ");
                            stringBuilder0.append(blgj0.g);
                            stringBuilder0.append("\ncalling_package: ");
                            stringBuilder0.append(blgj0.c);
                            stringBuilder0.append("\nallowlist_size: ");
                            stringBuilder0.append(blgj0.j);
                            break;
                        }
                        case 0x97: {
                            blgj blgj1 = blgo0.q == null ? blgj.a : blgo0.q;
                            stringBuilder0.append("event_type: ");
                            stringBuilder0.append("FIDO2_REGISTER_REQUEST");
                            stringBuilder0.append("\nrequire_resident_key: ");
                            stringBuilder0.append(blgj1.h);
                            stringBuilder0.append("\nresident_key_requirement: ");
                            int v1 = blgh.a(blgj1.i);
                            if(v1 != 0) {
                                switch(v1) {
                                    case 1: {
                                        break;
                                    }
                                    case 2: {
                                        s1 = "DISCOURAGED";
                                        break;
                                    }
                                    case 3: {
                                        s1 = "PREFERRED";
                                        break;
                                    }
                                    default: {
                                        s1 = "REQUIRED";
                                    }
                                }
                            }
                            stringBuilder0.append(s1);
                            break;
                        }
                        case 0x98: {
                            stringBuilder0.append("event_type: ");
                            stringBuilder0.append("FIDO2_RESPONSE_SUCCESS");
                            stringBuilder0.append("\nplatform_authenticator_type: ");
                            int v2 = blhi.a((blgo0.r == null ? blgl.a : blgo0.r).d);
                            if(v2 == 0) {
                                s = "UNDEFINED_DO_NOT_USE";
                            }
                            else {
                                switch(v2) {
                                    case 1: {
                                        s = "UNDEFINED_DO_NOT_USE";
                                        break;
                                    }
                                    case 2: {
                                        s = "FINGERPRINT";
                                        break;
                                    }
                                    default: {
                                        if(v2 == 51) {
                                            s = "SCREEN_LOCK";
                                        }
                                    }
                                }
                            }
                            stringBuilder0.append(s);
                            break;
                        }
                        case 0x99: {
                            blgk blgk0 = blgo0.s == null ? blgk.a : blgo0.s;
                            stringBuilder0.append("event_type: ");
                            stringBuilder0.append("FIDO2_RESPONSE_ERROR");
                            stringBuilder0.append("\nerror_code: ");
                            stringBuilder0.append(blgk0.c);
                            stringBuilder0.append("\nerror_message: ");
                            stringBuilder0.append(blgk0.d);
                            blho blho0 = blho.a;
                            if((blho.b(blgk0.f) == null ? blho.a : blho.b(blgk0.f)) != blho0) {
                                stringBuilder0.append("\ntransport: ");
                                blho blho1 = blho.b(blgk0.f);
                                if(blho1 != null) {
                                    blho0 = blho1;
                                }
                                stringBuilder0.append(blho0.name());
                            }
                            break;
                        }
                        default: {
                            stringBuilder0.append("\nevent_type: ");
                            stringBuilder0.append(blgn.a(v));
                        }
                    }
                }
            }
            stringBuilder0.append("\nrequest_id: ");
            stringBuilder0.append(blgo0.c);
            ((ggtj)bnaa.b("FidoEventLogger").j()).B("Clearcut Event: %s", stringBuilder0);
        }
        ceva.v().j(((ProtoLiteMessage)blgo0));
    }

    protected static final byte[] e(byte[] arr_b) {
        return blzb.a().digest(arr_b);
    }

    protected static final blho f(Transport transport0) {
        gftb.check(transport0);
        switch(transport0.ordinal()) {
            case 0: 
            case 1: {
                return blho.d;
            }
            case 2: {
                return blho.c;
            }
            case 3: {
                return blho.b;
            }
            case 4: {
                return blho.f;
            }
            case 5: 
            case 6: {
                return blho.e;
            }
            default: {
                throw new IllegalArgumentException("Unexpected transport: " + transport0);
            }
        }
    }

    protected static final List g(Collection collection0) {
        if(collection0 == null) {
            return new ArrayList();
        }
        List list0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            ((ArrayList)list0).add(bmzw.f(((Transport)object0)));
        }
        return list0;
    }

    public static final void h(bnae bnae0, Throwable throwable0, int v) {
        String s = gnuk.a(throwable0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)blgr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((blgr)hftv0).b |= 1;
        ((blgr)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v1 = blgq.a(v);
        blgr blgr0 = (blgr)hftp0.b_message;
        if(v1 == 0) {
            throw null;
        }
        blgr0.d = v1 - 1;
        blgr0.b |= 2;
        blgr blgr1 = (blgr)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)blgo.a).v_newBuilder();
        if(bnae0 == null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            blgo blgo1 = (blgo)hftp1.b_message;
            blgo1.b |= 1;
            blgo1.c = 0;
        }
        else {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            blgo blgo0 = (blgo)hftp1.b_message;
            blgo0.b |= 1;
            blgo0.c = bnae0.a;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((blgo)hftv1).d = 100;
        ((blgo)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        blgo blgo2 = (blgo)hftp1.b_message;
        blgr1.getClass();
        blgo2.k = blgr1;
        blgo2.b |= 0x100;
        bmzw.d(((blgo)hftp1.N_build()));
    }
}

