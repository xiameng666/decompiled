import android.content.Context;
import android.content.Intent;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

final class aihf {
    public static final baun a;
    private final aild b;
    private final aztw c;
    private final Context d;

    static {
        aihf.a = new baun(new String[]{"AuthZenGcmEventHandler"});
    }

    public aihf(Context context0, aild aild0) {
        aikq.a();
        aztt aztt0 = new aztt(context0);
        aztt0.c(fcfo.a);
        aztw aztw0 = aztt0.a();
        super();
        this.d = context0;
        this.b = aild0;
        this.c = aztw0;
    }

    public final void a(Intent intent0) {
        String s3;
        hhtr hhtr0;
        hhqt hhqt0;
        hhqx hhqx0;
        aihj aihj0;
        Context context0 = this.d;
        aiju aiju0 = new aiju(context0);
        try {
            byte[] arr_b = aiii.b(intent0.getStringExtra("P"));
            byte[] arr_b1 = aiii.c(arr_b);
            baun baun0 = aihf.a;
            baun0.d("Decrypting payload using Cryptauth", new Object[0]);
            try {
                aihj0 = aihk.d(context0, arr_b, arr_b1);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                aihf.a.g("Failed to verifyDecrypt payload", exception0, new Object[0]);
                return;
            }
            Intent intent1 = null;
            hhts hhts0 = aihj0.a;
            String s = aihj0.b;
            Long long0 = new BigInteger(arr_b1).longValue();
            baun0.h("Handling payload by type %s for account %s using key with handle %s", new Object[]{hhts0.a, baun.q(s), long0});
            switch(hhts0.a.ordinal()) {
                case 2: {
                    aild aild0 = this.b;
                    Context context1 = this.d;
                    aztw aztw0 = this.c;
                    try {
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), hhts0.b, 0, hhts0.b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        hhqx0 = (hhqx)hftv0;
                    }
                    catch(hfur unused_ex) {
                        aild.d.f("Unable to parse a received TxRequest", new Object[0]);
                        aiju aiju1 = new aiju(context1);
                        aiju1.d = 15;
                        aiju1.a();
                        return;
                    }
                    if((hhqx0.b & 0x1000) != 0) {
                        aild.d.h("Transaction has FIDO data. Calling the FIDO2 0p API to start a silent caBLEauthenticator session.", new Object[0]);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gquy.a).v_newBuilder();
                        ByteString hfsf0 = hhqx0.c;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        hfsf0.getClass();
                        ((gquy)hftv1).b = hfsf0;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gquy gquy0 = (gquy)hftp0.b_message;
                        s.getClass();
                        gquy0.c = s;
                        gquy gquy1 = (gquy)hftp0.N_build();
                        bmfn bmfn0 = new bmfn(context1);
                        byte[] arr_b2 = gquy1.toBytesArray();
                        byte[] arr_b3 = hhqx0.j.toByteArray();
                        bmfu bmfu0 = new bmfu();
                        azzc azzc0 = new azzc();
                        azzc0.a = new bmez(bmfn0, arr_b2, arr_b3, bmfu0);
                        azzc0.d = 5420;
                        bmfn0.iG(azzc0.a());
                    }
                    aiif.a().b(hhqx0.c.toByteArray());
                    StringBuilder stringBuilder0 = new StringBuilder("{\n");
                    stringBuilder0.append(String.format("  id: %s\n", bboy.c(hhqx0.c.toByteArray())));
                    baun baun1 = aild.d;
                    stringBuilder0.append(String.format("  tx_creation_time_millis: %s\n", ((long)hhqx0.d)));
                    stringBuilder0.append(String.format("  min_required_version: %d\n", ((int)hhqx0.k)));
                    stringBuilder0.append(String.format("  user_agent: %s\n", hhqx0.f));
                    hhqw hhqw0 = hhqx0.e == null ? hhqw.b : hhqx0.e;
                    stringBuilder0.append("  params: {\n");
                    stringBuilder0.append(String.format("    type: %s\n", hhqe.b((hhqe.a(hhqw0.e) == 0 ? 1 : hhqe.a(hhqw0.e)))));
                    stringBuilder0.append(String.format("    sender: %s\n", hhqw0.f));
                    stringBuilder0.append(String.format("    interaction: %s\n", (hhpy.b(hhqw0.h) == null ? hhpy.a : hhpy.b(hhqw0.h))));
                    stringBuilder0.append(String.format("    interaction_after_trigger: %s\n", (hhpy.b(hhqw0.i) == null ? hhpy.a : hhpy.b(hhqw0.i))));
                    int v = hhqh.a(hhqw0.j) == 0 ? -1 : hhqh.a(hhqw0.j);
                    stringBuilder0.append(String.format("    risk_level: %s\n", (v == 0 ? "null" : Integer.toString(v))));
                    stringBuilder0.append(String.format("    force_unlock_millis: %s\n", ((long)hhqw0.k)));
                    stringBuilder0.append(String.format("    triggers: %s\n", new hfuh(hhqw0.l, hhqw.a)));
                    if(hhqe.a(hhqw0.e) == 2) {
                        hhpv hhpv0 = hhqw0.m == null ? hhpv.a : hhqw0.m;
                        stringBuilder0.append("    prompt: {\n");
                        stringBuilder0.append(String.format("      workflow_hint: %s\n", Integer.toString((hhrg.a(hhpv0.d) == 0 ? 1 : hhrg.a(hhpv0.d)) - 1)));
                        stringBuilder0.append(String.format("      min_required_version: %d\n", ((int)hhpv0.e)));
                        stringBuilder0.append("    }\n");
                    }
                    stringBuilder0.append("  }\n}");
                    baun1.h("Processing TxRequest: %s\n", new Object[]{stringBuilder0.toString()});
                    aild.c(context1, hhqx0, s, arr_b1, hhra.a, null);
                    aild0.g(context1, hhqx0, s, arr_b1, false);
                    hhqw hhqw1 = hhqx0.e;
                    if(((hhqw1 == null ? hhqw.b : hhqw1).c & 0x800) != 0) {
                        if(hhqw1 == null) {
                            hhqw1 = hhqw.b;
                        }
                        if(!(hhqw1.n == null ? hhqb.a : hhqw1.n).i) {
                            aikr aikr0 = new aikr(context1, s, null);
                            ailc ailc0 = new ailc(aild0, aztw0, context1, hhqx0, arr_b1, s);
                            aikr0.a = 2;
                            aikr0.a(ailc0);
                            return;
                        }
                    }
                    return;
                }
                case 8: {
                    aild aild1 = this.b;
                    Context context2 = this.d;
                    aztw aztw1 = this.c;
                    try {
                        ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqt.a), hhts0.b, 0, hhts0.b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv2);
                        hhqt0 = (hhqt)hftv2;
                    }
                    catch(hfur unused_ex) {
                        aild.d.f("Unable to parse a received TxCancelRequest", new Object[0]);
                        aiju aiju2 = new aiju(context2);
                        aiju2.d = 15;
                        aiju2.a();
                        return;
                    }
                    aila aila0 = ailb.b(context2).a(hhqt0.b.toByteArray());
                    if(aila0 == null) {
                        aild.d.f("No cached entry found", new Object[0]);
                        return;
                    }
                    Intent intent2 = aild.e(context2, aila0.a, s, arr_b1);
                    String s1 = ailf.d(aila0.a);
                    intent2.addCategory(s1);
                    Intent intent3 = new Intent("AUTHZEN_CLOSE_ACTIVITY");
                    intent3.setPackage("com.google.android.gms");
                    intent3.putExtra("transaction_id", aila0.a.c.toByteArray());
                    aild1.b.a.sendBroadcast(intent3);
                    aild1.b.g(intent2, s1);
                    aild1.c.b = aztw1;
                    String s2 = "/tx-cancel/" + aila0.a.c.toStringUtf8();
                    aild1.c.a(s2).a();
                    return;
                }
                case 14: {
                    try {
                        ProtoLiteMessage hftv3 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhtr.a), hhts0.b, 0, hhts0.b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv3);
                        hhtr0 = (hhtr)hftv3;
                    }
                    catch(hfur hfur1) {
                        aihf.a.g("Unable to decode the proto.", hfur1, new Object[0]);
                        goto label_156;
                    }
                    if((hhtr0.b & 1) == 0) {
                        baun0.f("Missing Bluetooth address in DeviceProximityCallback.", new Object[0]);
                    }
                    else {
                        intent1 = new Intent("com.google.android.gms.auth.authzen.GCM_DEVICE_PROXIMITY").setPackage("com.google.android.gms");
                        intent1.putExtra("account_name", s);
                        intent1.putExtra("bluetooth_mac_address", hhtr0.c);
                        if((hhtr0.b & 4) != 0) {
                            intent1.putExtra("protocol_version", hhtr0.e);
                        }
                        if((hhtr0.b & 2) != 0) {
                            int v1 = hhtn.a(hhtr0.d);
                            if(v1 == 0) {
                                s3 = "UNKNOWN";
                            }
                            else {
                                switch(v1) {
                                    case 1: {
                                        s3 = "UNKNOWN";
                                        break;
                                    }
                                    case 2: {
                                        s3 = "ANDROID";
                                        break;
                                    }
                                    case 3: {
                                        s3 = "CHROME";
                                        break;
                                    }
                                    case 4: {
                                        s3 = "IOS";
                                        break;
                                    }
                                    default: {
                                        s3 = v1 == 5 ? "BROWSER" : "OSX";
                                    }
                                }
                            }
                            intent1.putExtra("source_device_type", s3);
                        }
                    }
                label_156:
                    if(intent1 != null) {
                        this.d.sendBroadcast(intent1, "com.google.android.gms.auth.authzen.permission.GCM_DEVICE_PROXIMITY");
                        return;
                    }
                    aihf.a.f("Could not create CryptauthGcmProximity broadcast intent fromserver payload.", new Object[0]);
                    return;
                }
                default: {
                    baun0.f("Unexpected payload type: " + hhts0.a.name(), new Object[0]);
                    aiju0.d = 14;
                    aiju0.a();
                }
            }
        }
        catch(hfur hfur0) {
            aihf.a.g("Couldn\'t parse SecureMessage proto", hfur0, new Object[0]);
            aiju0.d = 10;
            aiju0.a();
        }
        catch(aiih aiih0) {
            aihf.a.g("Error during decoding", aiih0, new Object[0]);
            aiju0.d = aiih0.a;
            aiju0.a();
        }
    }
}

