import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanSettings.Builder;
import android.content.Context;
import android.os.ParcelUuid;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ebej {
    public static final int a;
    private static final bboh b;
    private static final byte[] c;
    private final dqlm d;
    private final dlmn e;
    private final dqlo f;
    private final dmgi g;

    static {
        ebej.b = bboh.b("Pay", bbcu.cZ);
        byte[] arr_b = "aliroAttestationChallenge".getBytes(ibyo.a);
        ibuq.e(arr_b, "getBytes(...)");
        ebej.c = arr_b;
    }

    public ebej(dqlm dqlm0, dlmn dlmn0, dqlo dqlo0, dmgi dmgi0) {
        this.d = dqlm0;
        this.e = dlmn0;
        this.f = dqlo0;
        this.g = dmgi0;
    }

    public final fszd a(Context context0, fsyu fsyu0) {
        ibuq.f(context0, "context");
        ibuq.f(fsyu0, "request");
        if(!hwsu.c()) {
            ((ggtj)ebej.b.j()).x("Sideload closed loop cards operation not allowed");
            return fszg.a(((ProtoLiteMessage)fszd.a).v_newBuilder()).a();
        }
        JSONObject jSONObject0 = new JSONObject(fsyu0.b.toStringUtf8());
        long v = ibwc.a.g(1000000000L, 0x2540BE3FFL);
        fsyh fsyh0 = ebei.a(jSONObject0, v);
        dqlm dqlm0 = this.d;
        dqlm0.k(fsyh0);
        if((gtln.b(fsyh0.r) == null ? gtln.i : gtln.b(fsyh0.r)) == gtln.g) {
            String s = this.e.a(ebej.c);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            JSONArray jSONArray0 = jSONObject0.getJSONArray("aliroReaderConfigs");
            ibuq.e(jSONArray0, "getJSONArray(...)");
            int v1 = jSONArray0.length();
            for(int v2 = 0; v2 < v1; ++v2) {
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v2);
                String s1 = jSONObject1.getString("readerGroupIdBase64");
                ibuq.e(s1, "getString(...)");
                ebci ebci0 = new ebci(s1, "", "", "", "");
                if(jSONObject1.has("readerPubKeyBase64")) {
                    String s2 = jSONObject1.getString("readerPubKeyBase64");
                    ibuq.e(s2, "getString(...)");
                    ebci0 = ebci.a(ebci0, s2, null, null, null, 29);
                }
                ebci ebci1 = ebci0;
                if(jSONObject1.has("readerAccessDocBase64")) {
                    String s3 = jSONObject1.getString("readerAccessDocBase64");
                    ibuq.e(s3, "getString(...)");
                    ebci1 = ebci.a(ebci1, null, s3, null, null, 27);
                }
                ebci ebci2 = ebci1;
                if(jSONObject1.has("readerRevocationDocBase64")) {
                    String s4 = jSONObject1.getString("readerRevocationDocBase64");
                    ibuq.e(s4, "getString(...)");
                    ebci2 = ebci.a(ebci2, null, null, s4, null, 23);
                }
                ebci ebci3 = ebci2;
                if(jSONObject1.has("readerMailboxConfigBase64")) {
                    String s5 = jSONObject1.getString("readerMailboxConfigBase64");
                    ibuq.e(s5, "getString(...)");
                    ebci3 = ebci.a(ebci3, null, null, null, s5, 15);
                }
                linkedHashMap0.put(s1, ebci3);
            }
            if(s != null) {
                dqlm0.o(fsyh0.c, s);
                ByteString hfsf0 = (fsyh0.i == null ? fsyd.a : fsyh0.i).h;
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hkuw.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur0) {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv0;
                    throw hfur0;
                }
                catch(hfwr hfwr0) {
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur2 = new hfur(iOException0);
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                try {
                    hfsl0.z(0);
                }
                catch(hfur hfur3) {
                    hfur3.a = hftv0;
                    throw hfur3;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ibuq.e(((hkuw)hftv0), "parseFrom(...)");
                for(Object object0: (((hkuw)hftv0).b == 1 ? ((hkuo)((hkuw)hftv0).c) : hkuo.a).b) {
                    hkur hkur0 = (hkur)object0;
                    String s6 = hkur0.d;
                    ibuq.e(s6, "getReaderGroupId(...)");
                    if((hkur0.c & 1) != 0) {
                        String s7 = hkur0.d;
                        ibuq.e(s7, "getReaderGroupId(...)");
                        String s8 = (hkur0.e == null ? hkuu.a : hkur0.e).b;
                        ibuq.e(s8, "getPublicKey(...)");
                        EnumSet enumSet0 = EnumSet.of(dlnb.a);
                        ibuq.e(enumSet0, "of(...)");
                        this.e.b(s, s6, new dlna(s7, s8, enumSet0));
                    }
                    if(hwdu.a.b().b()) {
                        ibuq.f(s6, "readerGroupIdBase64");
                        ExecutorService executorService0 = Executors.newCachedThreadPool();
                        vnd vnd0 = new vnd(this.e.a.a, executorService0, this.e.a.c);
                        byte[] arr_b = dlmr.b(dlmr.a(s6));
                        dlmt.d(("AliroBle: addReaderServiceData: " + Arrays.toString(arr_b)));
                        ByteBuffer byteBuffer0 = ByteBuffer.allocate(24);
                        byteBuffer0.put(new byte[]{(byte)0x80, 0});
                        byteBuffer0.put(arr_b);
                        byteBuffer0.put(new byte[]{0, 0, 0, 0, 0, 0});
                        vro vro0 = vnd0.c;
                        byte[] arr_b1 = byteBuffer0.array();
                        if(vro0.f == null) {
                            vro0.f = new ArrayList();
                        }
                        vro0.f.add(arr_b1);
                        if(vro0.c) {
                            vrn vrn0 = new vrn(vro0);
                            vro0.b.execute(vrn0);
                            vro0.c = false;
                        }
                        vro0.e = ((BluetoothManager)vro0.a.getSystemService("bluetooth")).getAdapter().getBluetoothLeScanner();
                        ParcelUuid parcelUuid0 = new ParcelUuid(vrq.a.a);
                        ArrayList arrayList0 = new ArrayList();
                        byte[] arr_b2 = new byte[24];
                        arr_b2[0] = (byte)0x80;
                        for(int v3 = 0; v3 < 8; ++v3) {
                            arr_b2[v3 + 2] = -1;
                        }
                        for(Object object1: vro0.f) {
                            arrayList0.add(new ScanFilter.Builder().setServiceData(parcelUuid0, ((byte[])object1), arr_b2).build());
                        }
                        vrm vrm0 = new vrm(vro0, arrayList0, new ScanSettings.Builder().setLegacy(false).setScanMode(2).build());
                        vro0.b.execute(vrm0);
                        vro0.c = true;
                    }
                }
                for(Object object2: linkedHashMap0.keySet()) {
                    ebci ebci4 = (ebci)linkedHashMap0.get(((String)object2));
                    if(ebci4 != null) {
                        String s9 = ebci4.c;
                        if(s9.length() > 0) {
                            ibuq.f(s9, "accessDocumentBase64");
                            vop vop0 = new vop(((dlms)this.e).b.c(s));
                            byte[] arr_b3 = Base64.decode(s9, 0);
                            ((dlms)this.e).c.b(arr_b3, vop0.hashCode() + "-a.doc");
                        }
                        String s10 = ebci4.d;
                        if(s10.length() > 0) {
                            ibuq.f(s10, "revocationDocumentBase64");
                            vop vop1 = new vop(((dlms)this.e).b.c(s));
                            byte[] arr_b4 = Base64.decode(s10, 0);
                            ((dlms)this.e).c.b(arr_b4, vop1.hashCode() + "-r.doc");
                        }
                        String s11 = ebci4.b;
                        if(s11.length() > 0) {
                            ibuq.f(ebci4.a, "readerGroupIdBase64");
                            ibuq.f(s11, "readerPublicKeyBase64");
                            byte[] arr_b5 = dlmr.c(s11);
                            String s12 = dlmr.a(ebci4.a);
                            String s13 = vnh.b("endpoint", s);
                            if(!vni.a(((dlms)this.e).b.g(s, s12, s13, vnh.b(s13, vnh.b("reader", s12)), arr_b5, "storeReaderPublicKey"))) {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                        String s14 = ebci4.e;
                        if(s14.length() > 0) {
                            ibuq.f(s14, "mailboxDocumentBase64");
                            vop vop2 = new vop(((dlms)this.e).b.c(s));
                            byte[] arr_b6 = Base64.decode(s14, 0);
                            ((dlms)this.e).c.a(vop2, arr_b6);
                        }
                    }
                }
            }
        }
        bboh bboh0 = ebej.b;
        ((ggtj)bboh0.h()).x("Successfully inserted sideloaded card in ClosedLoopBundleDatastore");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtkg.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtkg)hftp0.b_message).f = v;
        String s15 = a.u(v, "CC: ");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtkg)hftp0.b_message).e = s15;
        gtqj gtqj0 = gtqj.b;
        ibuq.f(gtqj0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtkg gtkg0 = (gtkg)hftp0.b_message;
        gtkg0.g = gtqj0.a();
        String s16 = String.valueOf(v);
        ibuq.f(s16, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtkg gtkg1 = (gtkg)hftp0.b_message;
        s16.getClass();
        gtkg1.q = s16;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtkb.b).v_newBuilder();
        ibuq.f(hftp1, "builder");
        gtls gtls0 = gtls.d;
        ibuq.f(gtls0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtkb gtkb0 = (gtkb)hftp1.b_message;
        gtkb0.e = gtls0.a();
        gtlq gtlq0 = gtlq.c;
        ibuq.f(gtlq0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtkb gtkb1 = (gtkb)hftp1.b_message;
        gtkb1.c = gtlq0.a();
        new hfxu(new hfuh(((gtkb)hftp1.b_message).d, gtkb.a));
        gtka gtka0 = gtka.c;
        ibuq.f(gtka0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtkb gtkb2 = (gtkb)hftp1.b_message;
        gtka0.getClass();
        hfuf hfuf0 = gtkb2.d;
        if(!hfuf0.c()) {
            gtkb2.d = ProtoLiteMessage.C(hfuf0);
        }
        gtkb2.d.i(gtka0.a());
        int v4 = hwdo.d() ^ 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gtkb)hftp1.b_message).f = v4;
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gtkb)hftv1), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtkg gtkg2 = (gtkg)hftp0.b_message;
        ((gtkb)hftv1).getClass();
        gtkg2.v = (gtkb)hftv1;
        gtkg2.b |= 0x200;
        hjig hjig0 = hjif.a(((ProtoLiteMessage)hjie.a).v_newBuilder());
        hjig0.e(1.0f);
        hjig0.c(1.0f);
        hjig0.d(1.0f);
        hftm hftm0 = hftl.a(((ProtoLiteMessage)hftk.a).v_newBuilder());
        hftm0.b();
        hjig0.b(hftm0.a());
        hjie hjie0 = hjig0.a();
        hjig hjig1 = hjif.a(((ProtoLiteMessage)hjie.a).v_newBuilder());
        hftm hftm1 = hftl.a(((ProtoLiteMessage)hftk.a).v_newBuilder());
        hftm1.b();
        hjig1.b(hftm1.a());
        hjie hjie1 = hjig1.a();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gtkh.a).v_newBuilder();
        ibuq.f(hftp2, "builder");
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gtjv.a).v_newBuilder();
        ibuq.f(hftp3, "builder");
        gtkp gtkp0 = gtkp.a;
        gtml gtml0 = gtmk.a(((ProtoLiteMessage)gtkp0).v_newBuilder());
        gtml0.c(String.valueOf(v));
        gtkp gtkp1 = gtml0.a();
        ibuq.f(gtkp1, "value");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gtjv gtjv0 = (gtjv)hftp3.b_message;
        gtkp1.getClass();
        gtjv0.c = gtkp1;
        gtjv0.b |= 1;
        gtml gtml1 = gtmk.a(((ProtoLiteMessage)gtkp0).v_newBuilder());
        gtml1.b("Role");
        gtml1.c("Sideload Tester");
        gtkp gtkp2 = gtml1.a();
        ibuq.f(gtkp2, "value");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gtjv gtjv1 = (gtjv)hftp3.b_message;
        gtkp2.getClass();
        gtjv1.e = gtkp2;
        gtjv1.b |= 4;
        gtml gtml2 = gtmk.a(((ProtoLiteMessage)gtkp0).v_newBuilder());
        gtml2.b("ID");
        gtml2.c(String.valueOf(v));
        gtkp gtkp3 = gtml2.a();
        ibuq.f(gtkp3, "value");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gtjv gtjv2 = (gtjv)hftp3.b_message;
        gtkp3.getClass();
        gtjv2.d = gtkp3;
        gtjv2.b |= 2;
        ProtoLiteMessage hftv2 = hftp3.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((gtjv)hftv2), "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtkh gtkh0 = (gtkh)hftp2.b_message;
        ((gtjv)hftv2).getClass();
        gtkh0.c = (gtjv)hftv2;
        gtkh0.b |= 1;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gtju.a).v_newBuilder();
        ibuq.f(hftp4, "builder");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gtju gtju0 = (gtju)hftp4.b_message;
        gtju0.b |= 16;
        gtju0.g = 0xFFFFFFL;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gtko.a).v_newBuilder();
        ibuq.f(hftp5, "builder");
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((gtko)hftp5.b_message).b = "https://www.gstatic.com/commerce/wallet/20110109/jhfae70rio980yhbnsox6vkc9sjkdcuy223hnso08udmnnds8776vp6n5744ghopeewdx/promotions/uk_tap5_2017_q2/play-cardart-background.png";
        ProtoLiteMessage hftv3 = hftp5.N_build();
        ibuq.e(hftv3, "build(...)");
        ibuq.f(((gtko)hftv3), "value");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gtju gtju1 = (gtju)hftp4.b_message;
        ((gtko)hftv3).getClass();
        gtju1.c = (gtko)hftv3;
        gtju1.b |= 1;
        ProtoLiteMessage hftv4 = hftp4.N_build();
        ibuq.e(hftv4, "build(...)");
        ibuq.f(((gtju)hftv4), "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtkh gtkh1 = (gtkh)hftp2.b_message;
        ((gtju)hftv4).getClass();
        gtkh1.d = (gtju)hftv4;
        gtkh1.b |= 2;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gtjw.a).v_newBuilder();
        ibuq.f(hftp6, "builder");
        gtml gtml3 = gtmk.a(((ProtoLiteMessage)gtkp0).v_newBuilder());
        gtml3.c("Sideloaded Card");
        gtkp gtkp4 = gtml3.a();
        ibuq.f(gtkp4, "value");
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        gtjw gtjw0 = (gtjw)hftp6.b_message;
        gtkp4.getClass();
        gtjw0.g = gtkp4;
        gtjw0.b |= 0x20;
        ProtoLiteMessage hftv5 = hftp6.N_build();
        ibuq.e(hftv5, "build(...)");
        ibuq.f(((gtjw)hftv5), "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtkh gtkh2 = (gtkh)hftp2.b_message;
        ((gtjw)hftv5).getClass();
        gtkh2.e = (gtjw)hftv5;
        gtkh2.b |= 4;
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gtkk.a).v_newBuilder();
        ibuq.f(hftp7, "builder");
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp7.b_message;
        ((gtkk)hftv6).b = "Remove from Wallet?";
        if(!hftv6.isImmutable()) {
            hftp7.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp7.b_message;
        ((gtkk)hftv7).d = "You won\'t be able to use your phone as your digital ID once it\'s removed.";
        if(!hftv7.isImmutable()) {
            hftp7.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp7.b_message;
        ((gtkk)hftv8).f = "Remove";
        if(!hftv8.isImmutable()) {
            hftp7.ensureMutable();
        }
        ((gtkk)hftp7.b_message).g = "Cancel";
        ProtoLiteMessage hftv9 = hftp7.N_build();
        ibuq.e(hftv9, "build(...)");
        ibuq.f(((gtkk)hftv9), "value");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gtkh gtkh3 = (gtkh)hftp2.b_message;
        ((gtkk)hftv9).getClass();
        gtkh3.f = (gtkk)hftv9;
        gtkh3.b |= 8;
        ProtoLiteMessage hftv10 = hftp2.N_build();
        ibuq.e(hftv10, "build(...)");
        ibuq.f(((gtkh)hftv10), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtkg gtkg3 = (gtkg)hftp0.b_message;
        ((gtkh)hftv10).getClass();
        gtkg3.d = (gtkh)hftv10;
        gtkg3.c = 42;
        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)dmgq.a).v_newBuilder();
        ibuq.f(hftp8, "builder");
        if(!hftp8.b_message.isImmutable()) {
            hftp8.ensureMutable();
        }
        dmgq dmgq0 = (dmgq)hftp8.b_message;
        dmgq0.b |= 1;
        dmgq0.c = true;
        ProtoLiteMessage hftv11 = hftp8.N_build();
        ibuq.e(hftv11, "build(...)");
        ByteString hfsf1 = ((dmgq)hftv11).getDefaultInstanceForType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtkg)hftp0.b_message).L = hfsf1;
        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)gumi.a).v_newBuilder();
        ibuq.f(hftp9, "builder");
        gukz gukz0 = guky.a(((ProtoLiteMessage)gubi.a).v_newBuilder());
        gukz0.b(hjie0);
        gukz0.c(hjie1);
        gubi gubi0 = gukz0.a();
        ibuq.f(gubi0, "value");
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gumi gumi0 = (gumi)hftp9.b_message;
        gubi0.getClass();
        gumi0.c = gubi0;
        gumi0.b |= 1;
        ibuq.f(gubi0, "value");
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gumi gumi1 = (gumi)hftp9.b_message;
        gubi0.getClass();
        gumi1.d = gubi0;
        gumi1.b |= 2;
        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)gues.a).v_newBuilder();
        ibuq.f(hftp10, "builder");
        ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)guer.a).v_newBuilder();
        ibuq.f(hftp11, "builder");
        gunw gunw0 = gunw.a;
        guny guny0 = gunx.a(((ProtoLiteMessage)gunw0).v_newBuilder());
        guny0.c("ClosedLoop Card");
        gunw gunw1 = guny0.a();
        ibuq.f(gunw1, "value");
        if(!hftp11.b_message.isImmutable()) {
            hftp11.ensureMutable();
        }
        guer guer0 = (guer)hftp11.b_message;
        gunw1.getClass();
        guer0.c = gunw1;
        guer0.b |= 1;
        guny guny1 = gunx.a(((ProtoLiteMessage)gunw0).v_newBuilder());
        guny1.c(String.valueOf(v));
        gunw gunw2 = guny1.a();
        ibuq.f(gunw2, "value");
        if(!hftp11.b_message.isImmutable()) {
            hftp11.ensureMutable();
        }
        guer guer1 = (guer)hftp11.b_message;
        gunw2.getClass();
        guer1.d = gunw2;
        guer1.b |= 2;
        ProtoLiteMessage hftv12 = hftp11.N_build();
        ibuq.e(hftv12, "build(...)");
        ibuq.f(((guer)hftv12), "value");
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        gues gues0 = (gues)hftp10.b_message;
        ((guer)hftv12).getClass();
        gues0.d = (guer)hftv12;
        gues0.b |= 2;
        gubf gubf0 = gube.a(((ProtoLiteMessage)gtzc.a).v_newBuilder());
        gubf0.c(a.u(v, "https://pay.google.com/gp/t/viewcardcentriccard/"));
        gtzc gtzc0 = gubf0.a();
        ibuq.f(gtzc0, "value");
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        gues gues1 = (gues)hftp10.b_message;
        gtzc0.getClass();
        gues1.e = gtzc0;
        gues1.b |= 4;
        ProtoLiteMessage hftv13 = hftp10.N_build();
        ibuq.e(hftv13, "build(...)");
        ibuq.f(((gues)hftv13), "value");
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gumi gumi2 = (gumi)hftp9.b_message;
        ((gues)hftv13).getClass();
        gumi2.l = (gues)hftv13;
        gumi2.b |= 0x200;
        gulh gulh0 = gulg.a(((gucu)((ProtoLiteMessage)gucv.a).v_newBuilder()));
        gulh0.h();
        gulb gulb0 = gula.a(((ProtoLiteMessage)gucn.a).v_newBuilder());
        ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)gucl.a).v_newBuilder();
        ibuq.f(hftp12, "builder");
        ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)guag.a).v_newBuilder();
        ibuq.f(hftp13, "builder");
        guny guny2 = gunx.a(((ProtoLiteMessage)gunw0).v_newBuilder());
        guny2.c(a.u(v, "ClosedLoop Card: "));
        gunw gunw3 = guny2.a();
        ibuq.f(gunw3, "value");
        if(!hftp13.b_message.isImmutable()) {
            hftp13.ensureMutable();
        }
        guag guag0 = (guag)hftp13.b_message;
        gunw3.getClass();
        guag0.g = gunw3;
        guag0.b |= 16;
        ProtoLiteMessage hftv14 = hftp13.N_build();
        ibuq.e(hftv14, "build(...)");
        ibuq.f(((guag)hftv14), "value");
        if(!hftp12.b_message.isImmutable()) {
            hftp12.ensureMutable();
        }
        gucl gucl0 = (gucl)hftp12.b_message;
        ((guag)hftv14).getClass();
        gucl0.c = (guag)hftv14;
        gucl0.b |= 1;
        ProtoLiteMessage hftv15 = hftp12.N_build();
        ibuq.e(hftv15, "build(...)");
        ibuq.f(((gucl)hftv15), "value");
        ProtoLiteBuilder hftp14 = gulb0.a;
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        gucn gucn0 = (gucn)hftp14.b_message;
        ((gucl)hftv15).getClass();
        gucn0.c = (gucl)hftv15;
        gucn0.b = 1;
        gulh0.e(gulb0.a());
        gucv gucv0 = gulh0.a();
        ibuq.f(gucv0, "value");
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        gumi gumi3 = (gumi)hftp9.b_message;
        gucv0.getClass();
        gumi3.j = gucv0;
        gumi3.b |= 0x80;
        ProtoLiteMessage hftv16 = hftp9.N_build();
        ibuq.e(hftv16, "build(...)");
        ibuq.f(((gumi)hftv16), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtkg gtkg4 = (gtkg)hftp0.b_message;
        ((gumi)hftv16).getClass();
        gtkg4.i = (gumi)hftv16;
        gtkg4.b |= 2;
        ProtoLiteMessage hftv17 = hftp0.N_build();
        ibuq.e(hftv17, "build(...)");
        List list0 = this.f.a();
        list0.add(((gtkg)hftv17));
        this.f.c(list0);
        dpur.d(context0, hahn.c);
        ((ggtj)bboh0.h()).x("Successfully scheduled check for AID registration check");
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        haep haep0 = haeo.a(((ProtoLiteMessage)hagz.a).v_newBuilder());
        haep0.c(hagt.dn);
        hafk0.d(haep0.a());
        hapr hapr0 = hafk0.a();
        this.g.b(hapr0);
        return fszg.a(((ProtoLiteMessage)fszd.a).v_newBuilder()).a();
    }
}

