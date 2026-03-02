import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public final class quf implements fsat {
    private final fsbc a;
    private final quk b;
    private boolean c;
    private final JSONObject d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private final byte[] h;
    private byte[] i;
    private SecretKeySpec j;
    private ibod k;
    private final qug l;
    private int m;

    public quf(fsbc fsbc0, qug qug0, quk quk0, boolean z, JSONObject jSONObject0) {
        this.a = fsbc0;
        this.l = qug0;
        this.b = quk0;
        this.c = z;
        this.d = jSONObject0;
        this.e = new byte[16];
        this.f = new byte[16];
        this.g = new byte[16];
        this.h = new byte[16];
        this.i = new byte[16];
    }

    @Override  // fsat
    public final void a() {
        if(!this.c) {
            this.l.c(qum.g);
        }
    }

    @Override  // fsat
    public final byte[] b(byte[] arr_b) {
        ibod ibod11;
        byte[] arr_b49;
        ibod ibod10;
        ibod ibod9;
        ibob ibob11;
        byte[] arr_b47;
        byte[] arr_b44;
        quk quk1;
        ibod ibod7;
        int v14;
        byte[] arr_b41;
        int v13;
        SecretKeySpec secretKeySpec1;
        fsbc fsbc5;
        ibod ibod4;
        ibob ibob6;
        byte[] arr_b28;
        byte[] arr_b22;
        ibod ibod2;
        byte[] arr_b5;
        SecretKey secretKey0;
        Iterator iterator1;
        byte[] arr_b20;
        int v9;
        SecretKeySpec secretKeySpec0;
        fsbc fsbc4;
        Boolean boolean0;
        ibns ibns0;
        ibob ibob1;
        byte[] arr_b2;
        ibob ibob0;
        quj quj0;
        fsbc fsbc0;
        quf quf0 = this;
        ibuq.f(arr_b, "apdu");
        try {
            if(quf0.c) {
                quf0.a.b("Ignoring APDU processing request as a session state has already been sent in this session");
                return qus.b;
            }
            fsbc0 = quf0.a;
            qut.a(arr_b);
            ibuq.f(arr_b, "apduBytes");
        }
        catch(Exception exception0) {
            goto label_604;
        }
        try {
            if(qui.a(arr_b.length, 4) >= 0) {
                int v = arr_b[0];
                int v1 = arr_b[1];
                int v2 = arr_b[2];
                int v3 = arr_b[3];
                if(arr_b.length == 5) {
                    ibob1 = new ibob(arr_b[4]);
                    ibob0 = null;
                label_43:
                    arr_b2 = null;
                label_44:
                    ibob ibob2 = ibob1 == null ? null : new ibob(ibob1.a);
                    ibob ibob3 = ibob0 == null ? null : new ibob(ibob0.a);
                    quj0 = new quj(((byte)v), ((byte)v1), ((byte)v2), ((byte)v3), ibob3, arr_b2, ibob2);
                }
                else if(qui.a(arr_b.length, 5) > 0) {
                    int v4 = arr_b[4];
                    ibob0 = new ibob(((byte)v4));
                    if(qui.a(v4 & 0xFF, 0) > 0) {
                        if(qui.a(arr_b.length, (v4 & 0xFF) + 4) >= 0) {
                            int v5 = (v4 & 0xFF) + 5;
                            byte[] arr_b1 = ibpg.W(arr_b, ibwt.q(5, v5));
                            if(qui.a(arr_b.length, (v4 & 0xFF) + 7) < 0) {
                                if(arr_b.length == (v4 & 0xFF) + 6) {
                                    ibob1 = new ibob(arr_b[v5]);
                                    arr_b2 = arr_b1;
                                }
                                else {
                                    arr_b2 = arr_b1;
                                    ibob1 = null;
                                }
                                goto label_44;
                            }
                            else {
                                fsbc0.b("APDUBytes contained more command payload bytes than specified by the LC byte");
                                goto label_58;
                            }
                        }
                        else {
                            fsbc0.b("APDUBytes did not contain enough data to parse a command payload based on the provided LC byte");
                            goto label_58;
                        }
                    }
                    else if(qui.a(arr_b.length, 6) > 0) {
                        ibob1 = new ibob(arr_b[5]);
                        goto label_43;
                    }
                    else {
                        ibob1 = null;
                        goto label_43;
                    }
                }
                else {
                    ibob1 = null;
                    ibob0 = null;
                    goto label_43;
                }
            }
            else {
                fsbc0.b("CommandAPDU was provided with too few bytes to be considered a valid APDU command");
                goto label_58;
            }
            goto label_59;
        }
        catch(Exception exception1) {
            try {
                fsbc0.a("CommandAPDU encountered an unexpected exception while attempting to build an instance of itself", exception1);
            label_58:
                quj0 = null;
            label_59:
                if(quj0 == null) {
                    quf0.a.b("The APDU bytes provided to processAPDU could not be parsed into necessary data during processAPDU");
                    quf0.l.c(qum.a);
                    quf0.c = true;
                    return qus.b;
                }
                int v6 = quj0.b;
                if(v6 == -92) {
                    fsbc fsbc1 = quf0.a;
                    if(quj0.a != 0) {
                        fsbc1.b("Class byte did not match value expected for SELECT command");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                    else if(quj0.c != 4) {
                        fsbc1.b("P1 was not specifying the select by AID parameter for SELECT command");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                    else if(quj0.d == 0) {
                        byte[] arr_b3 = quj0.e;
                        if(arr_b3 == null) {
                            fsbc1.b("No command payload was provided to the SELECT command");
                            ibns0 = new ibns(qus.b, qum.a);
                        }
                        else if(arr_b3.length == 16) {
                            List list0 = ibpg.ao(arr_b3);
                            List list1 = ibpg.ao(qus.c);
                            if(list0.size() >= 5) {
                                List list2 = ibpo.au(list0, list1);
                                if(!list2.isEmpty()) {
                                    for(Object object0: list2) {
                                        if(((Number)((ibns)object0).a).byteValue() == ((Number)((ibns)object0).b).byteValue()) {
                                            continue;
                                        }
                                        fsbc1.b("An invalid RID was detected when processing a SELECT APDU command");
                                        ibns0 = new ibns(qus.b, qum.c);
                                        goto label_594;
                                    }
                                }
                                ibns0 = new ibns(qus.a, null);
                                goto label_594;
                            }
                            fsbc1.b("An invalid RID was detected when processing a SELECT APDU command");
                            ibns0 = new ibns(qus.b, qum.c);
                        }
                        else {
                            fsbc1.b("Command payload was not long enough to utilize during the SELECT command");
                            ibns0 = new ibns(qus.b, qum.a);
                        }
                    }
                    else {
                        fsbc1.b("P2 was specifying more than \"no special options\" for SELECT command");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                }
                else {
                    switch(v6) {
                        case 0xFFFFFF82: {
                            ibns0 = quf0.c(quj0);
                            goto label_594;
                        }
                        case 0xFFFFFF84: {
                            goto label_109;
                        }
                        case -54: {
                            goto label_227;
                        }
                        case -38: {
                            goto label_455;
                        }
                        case 0x20: {
                            goto label_593;
                        }
                    }
                    quf0.a.b("An unsupported instruction was requested when calling processApdu in ContactlessHCESessionImpl. Provided instruction was: " + ibob.a(((byte)v6)));
                    ibns0 = new ibns(qus.b, qum.a);
                    goto label_594;
                label_109:
                    fsbc fsbc2 = quf0.a;
                    if(quj0.a != 0) {
                        fsbc2.b("Class byte did not match value expected for GET_CHALLENGE command");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                    else if(quj0.c != 0) {
                        fsbc2.b("P1 was not the standard value for GET_CHALLENGE command");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                    else if(quj0.d == 0) {
                        byte[] arr_b4 = quj0.e;
                        if(arr_b4 == null) {
                            fsbc2.b("No command payload was provided to the GET_CHALLENGE command");
                            ibns0 = new ibns(qus.b, qum.a);
                        }
                        else {
                            if(arr_b4.length != 0) {
                                quf0.k = new ibod(((int)arr_b4[0]));
                            }
                            ibod ibod0 = quf0.k;
                            if(ibod0 == null || ibod0.a != 1) {
                                if(ibod0 == null || ibod0.a != 2) {
                                    fsbc2.b("The applications protocol version was not a supported protocol number");
                                    ibns0 = new ibns(qus.b, qum.b);
                                }
                                else if(arr_b4.length == 8) {
                                    ibpg.W(arr_b4, new ibwm(1, 3));
                                    int v7 = arr_b4[4] & 15;
                                    SecureRandom secureRandom0 = new SecureRandom();
                                    byte[] arr_b6 = quf0.g;
                                    secureRandom0.nextBytes(arr_b6);
                                    quk quk0 = quf0.b;
                                    SecretKey secretKey1 = quk0.e;
                                    if(secretKey1 == null) {
                                        fsbc2.b("The application had no access to a privacy key when one was necessary during GET_CHALLENGE v2");
                                        ibns0 = new ibns(qus.b, qum.i);
                                    }
                                    else {
                                        switch(v7) {
                                            case 0: {
                                                goto label_163;
                                            }
                                            case 1: {
                                                goto label_167;
                                            }
                                        }
                                        fsbc2.b("The application was provided with a request to use an invalid key during GET_CHALLENGE v2");
                                        ibns0 = new ibns(qus.b, qum.b);
                                        goto label_594;
                                    label_163:
                                        quf0.m = 1;
                                        secretKey0 = quk0.d;
                                        byte[] arr_b7 = quk0.c;
                                        goto label_178;
                                    label_167:
                                        quf0.m = 2;
                                        secretKey0 = quk0.g;
                                        if(secretKey0 == null) {
                                            fsbc2.b("The application had no instance of a no tour key when GET_CHALLENGE v2 requested its use");
                                            ibns0 = new ibns(qus.b, qum.b);
                                        }
                                        else {
                                            arr_b7 = quk0.f;
                                            if(arr_b7 == null) {
                                                fsbc2.b("The application had no instance of a no tour key input when GET_CHALLENGE v2 requested its use");
                                                ibns0 = new ibns(qus.b, qum.b);
                                            }
                                            else {
                                            label_178:
                                                if((arr_b4[4] & 16) == 16) {
                                                    qug qug0 = quf0.l;
                                                    fsax fsax0 = qug0.a;
                                                    if(fsax0 == null) {
                                                        fsbc fsbc3 = qug0.b;
                                                        if(fsbc3 != null) {
                                                            fsbc3.b("The application was unable to verify authentication due to no callback existing");
                                                        }
                                                        boolean0 = null;
                                                    }
                                                    else {
                                                        boolean0 = Boolean.valueOf(fsax0.a());
                                                    }
                                                    if(boolean0 == null) {
                                                        fsbc2.b("Ending session as no authentication was available when it was requested during GET_CHALLENGE");
                                                        ibns0 = new ibns(qus.b, qum.d);
                                                    }
                                                    else if(boolean0.booleanValue()) {
                                                        goto label_192;
                                                    }
                                                    else {
                                                        fsbc2.b("Ending session as the user was not authenticated when it was requested during GET_CHALLENGE");
                                                        ibns0 = new ibns(qus.b, qum.d);
                                                    }
                                                }
                                                else {
                                                label_192:
                                                    if(arr_b7 == null) {
                                                        ibuq.j("rawDiversifiedKeyInput");
                                                        arr_b7 = null;
                                                    }
                                                    arr_b5 = (byte[])quq.b(secretKey1, ibpg.k(arr_b6, arr_b7)).a;
                                                    if(arr_b5 == null) {
                                                        fsbc2.b("The application was unable to encrypt raw diversified key input during GET_CHALLENGE v2");
                                                        ibns0 = new ibns(qus.b, qum.b);
                                                        goto label_594;
                                                    label_227:
                                                        fsbc4 = quf0.a;
                                                        secretKeySpec0 = quf0.j;
                                                        if(secretKeySpec0 == null) {
                                                            fsbc4.b("Ending session due to a lack of a session key during GET_DATA v2");
                                                            ibns0 = new ibns(qus.b, qum.b);
                                                        }
                                                        else {
                                                            ibod ibod1 = quf0.k;
                                                            if(ibod1 == null || ibod1.a != 1) {
                                                                if(ibod1 == null || ibod1.a != 2) {
                                                                    fsbc4.b("Ending session due to an unsupported application protocol version being specified during GET_DATA");
                                                                    ibns0 = new ibns(qus.b, qum.i);
                                                                }
                                                                else if(quj0.a != 4) {
                                                                    fsbc4.b("Class byte did not match value expected for GET_DATA command");
                                                                    ibns0 = new ibns(qus.b, qum.a);
                                                                }
                                                                else if(quj0.c != 1) {
                                                                    fsbc4.b("P1 was not the standard value for GET_DATA command");
                                                                    ibns0 = new ibns(qus.b, qum.a);
                                                                }
                                                                else if(quj0.d == 0) {
                                                                    byte[] arr_b15 = quj0.e;
                                                                    if(arr_b15 == null) {
                                                                        fsbc4.b("No command payload was provided to the GET_DATA command");
                                                                        ibns0 = new ibns(qus.b, qum.a);
                                                                    }
                                                                    else if(arr_b15.length < 16) {
                                                                        fsbc4.b("The command payload provided to the GET_DATA command was too short to be processed during v2");
                                                                        ibns0 = new ibns(qus.b, qum.a);
                                                                    }
                                                                    else {
                                                                        int v8 = arr_b15.length - 16;
                                                                        byte[] arr_b16 = ibpg.W(arr_b15, ibwt.q(0, v8));
                                                                        byte[] arr_b17 = (byte[])qur.a(secretKeySpec0, arr_b16).a;
                                                                        if(arr_b17 == null) {
                                                                            fsbc4.b("Ending session due to error while attempting to verify CMAC integrity of incoming data during GET_DATA");
                                                                            ibns0 = new ibns(qus.b, qum.i);
                                                                        }
                                                                        else if(Arrays.equals(arr_b17, ibpg.W(arr_b15, ibwt.q(v8, arr_b15.length)))) {
                                                                            byte[] arr_b18 = (byte[])quq.a(secretKeySpec0, arr_b16).a;
                                                                            if(arr_b18 == null) {
                                                                                fsbc4.b("Ending session due to error while decrypting incoming command data during GET_DATA v2");
                                                                                ibns0 = new ibns(qus.b, qum.b);
                                                                            }
                                                                            else if(arr_b18.length < 8) {
                                                                                fsbc4.b("The command payload provided to the GET_DATA command was too short to be processed after decryption during v2");
                                                                                ibns0 = new ibns(qus.b, qum.a);
                                                                            }
                                                                            else {
                                                                                v9 = arr_b18[7];
                                                                                byte[] arr_b19 = ibpg.W(arr_b18, ibwt.q(8, arr_b18.length));
                                                                                ibuq.f(arr_b19, "tlvEncodedData");
                                                                                ArrayList arrayList0 = new ArrayList();
                                                                                for(int v10 = 0; v10 < arr_b19.length; v10 += qup0.c) {
                                                                                    qup qup0 = quv.a(ibpg.h(arr_b19, v10, arr_b19.length));
                                                                                    if(qup0 == null) {
                                                                                        break;
                                                                                    }
                                                                                    arrayList0.add(qup0);
                                                                                }
                                                                                if(arrayList0.isEmpty()) {
                                                                                    fsbc4.b("Ending session due to error while checking the encrypted payload during GET_DATA v2");
                                                                                    ibns0 = new ibns(qus.b, qum.i);
                                                                                }
                                                                                else {
                                                                                    arr_b20 = new byte[0];
                                                                                    iterator1 = arrayList0.iterator();
                                                                                    while(true) {
                                                                                    label_326:
                                                                                        boolean z = iterator1.hasNext();
                                                                                        goto label_327;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            fsbc4.b("Could not verify the integrity of incoming data during GET_DATA v2, payload may have been tampered with");
                                                                            ibns0 = new ibns(qus.b, qum.i);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    fsbc4.b("P2 was not the standard value for GET_DATA command");
                                                                    ibns0 = new ibns(qus.b, qum.a);
                                                                }
                                                            }
                                                            else if(quj0.c != -16) {
                                                                fsbc4.b("P1 was not the standard value for GET_DATA command");
                                                                ibns0 = new ibns(qus.b, qum.a);
                                                            }
                                                            else if(quj0.d != 15) {
                                                                fsbc4.b("P2 was not the standard value for GET_DATA command");
                                                                ibns0 = new ibns(qus.b, qum.a);
                                                            }
                                                            else if(quj0.a == 0) {
                                                                byte[] arr_b12 = (byte[])quq.b(secretKeySpec0, quf0.b.b).a;
                                                                if(arr_b12 == null) {
                                                                    fsbc4.b("Ending session due to error while encrypting the card payload during GET_DATA");
                                                                    ibns0 = new ibns(qus.b, qum.i);
                                                                }
                                                                else {
                                                                    byte[] arr_b13 = (byte[])qur.a(secretKeySpec0, arr_b12).a;
                                                                    if(arr_b13 == null) {
                                                                        fsbc4.b("Ending session due to error while CMAC signing the encrypted payload during GET_DATA");
                                                                        ibns0 = new ibns(qus.b, qum.i);
                                                                    }
                                                                    else {
                                                                        byte[] arr_b14 = ibpg.k(arr_b12, arr_b13);
                                                                        if(quj0.f != null && que.a(arr_b14.length, quj0.f.a & 0xFF) > 0) {
                                                                            fsbc4.b("Failing due to a response being larger than a provided LE byte during GET_DATA v1");
                                                                            ibns0 = new ibns(qus.b, qum.a);
                                                                        }
                                                                        else {
                                                                            ibns0 = new ibns(ibpg.k(arr_b14, qus.a), null);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                fsbc4.b("Class byte did not match value expected for GET_DATA command v1");
                                                                ibns0 = new ibns(qus.b, qum.a);
                                                            }
                                                        }
                                                    }
                                                    else {
                                                    label_197:
                                                        SecureRandom secureRandom1 = new SecureRandom();
                                                        byte[] arr_b8 = quf0.e;
                                                        secureRandom1.nextBytes(arr_b8);
                                                        SecureRandom secureRandom2 = new SecureRandom();
                                                        byte[] arr_b9 = quf0.h;
                                                        secureRandom2.nextBytes(arr_b9);
                                                        if(secretKey0 == null) {
                                                            ibuq.j("requestedKey");
                                                            secretKey0 = null;
                                                        }
                                                        byte[] arr_b10 = (byte[])quq.b(secretKey0, ibpg.k(arr_b8, arr_b9)).a;
                                                        if(arr_b10 == null) {
                                                            fsbc2.b("Ending session due to a failure to encrypt nonce1 and randomHCEAppletNumber during protocol version 2 of GET_CHALLENGE");
                                                            ibns0 = new ibns(qus.b, qum.i);
                                                        }
                                                        else {
                                                            if(arr_b5 == null) {
                                                                ibuq.j("responsePayloadDiversifiedKeyMaterial");
                                                                arr_b5 = null;
                                                            }
                                                            byte[] arr_b11 = ibpg.k(arr_b10, arr_b5);
                                                            if(quj0.f != null && que.a(arr_b11.length, quj0.f.a & 0xFF) > 0) {
                                                                fsbc2.b("GET_CHALLENGE response exceeded provided LE byte");
                                                                ibns0 = new ibns(qus.b, qum.a);
                                                            }
                                                            else {
                                                                ibns0 = new ibns(ibpg.k(arr_b11, qus.a), null);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else {
                                    fsbc2.b("The application was passed too small of a command payload during GET_CHALLENGE v2");
                                    ibns0 = new ibns(qus.b, qum.b);
                                }
                            }
                            else if(arr_b4.length == 4) {
                                ibpg.W(arr_b4, new ibwm(1, 3));
                                quf0.m = 1;
                                secretKey0 = quf0.b.d;
                                arr_b5 = quf0.b.c;
                                goto label_197;
                            }
                            else {
                                fsbc2.b("The application was passed too small of a command payload during GET_CHALLENGE v1");
                                ibns0 = new ibns(qus.b, qum.b);
                            }
                        }
                    }
                    else {
                        fsbc2.b("P2 was not the standard value for GET_CHALLENGE command");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                }
                goto label_594;
            }
            catch(Exception exception0) {
                goto label_604;
            }
        }
        try {
        label_327:
            if(!z) {
                ibob ibob4 = quj0.f;
                ibod2 = ibob4 == null ? null : new ibod(ibob4.a & 0xFF);
                goto label_333;
            }
            goto label_341;
        }
        catch(Exception exception0) {
            quf0 = this;
            goto label_604;
        }
    label_333:
        quf0 = this;
        try {
            byte[] arr_b21 = quf0.e(((byte)v9), secretKeySpec0, arr_b20, ibod2, "a successful preparation of response bytes during GET_DATA v2");
            if(arr_b21 == null) {
                fsbc4.b("Ending session due to a failure while concatenating response bytes during GET_DATA v2");
                ibns0 = new ibns(qus.b, qum.i);
                goto label_594;
            }
            ibns0 = new ibns(ibpg.k(arr_b21, qus.a), null);
            goto label_594;
        }
        catch(Exception exception0) {
            goto label_604;
        }
        try {
        label_341:
            Object object1 = iterator1.next();
            int v11 = (byte)((qup)object1).a;
            arr_b22 = ((qup)object1).b;
        }
        catch(Exception exception0) {
            quf0 = this;
            goto label_604;
        }
        try {
            switch(v11) {
                case -62: {
                    goto label_398;
                }
                case -60: {
                    goto label_409;
                }
                default: {
                    if(v11 == -58) {
                        if(quf0.m != 2) {
                            fsbc4.b("Ending session due to a requested key slot of an invalid name during a no tour sector request during GET_DATA v2");
                            byte[] arr_b23 = ibpg.k(arr_b20, quv.b(qun.d, quo.a, 10, new byte[]{0, 1}));
                            ibob ibob5 = quj0.f;
                            ibod ibod3 = ibob5 == null ? null : new ibod(ibob5.a & 0xFF);
                            byte[] arr_b24 = quf0.e(((byte)v9), secretKeySpec0, arr_b23, ibod3, "an invalid key request during a no tour sector request during GET_DATA v2");
                            if(arr_b24 == null) {
                                fsbc4.b("Ending session due to a failure while concatenating response bytes during GET_DATA v2");
                                ibns0 = new ibns(qus.b, qum.i);
                                break;
                            }
                            ibns0 = new ibns(ibpg.k(arr_b24, qus.a), null);
                            break;
                        }
                        goto label_361;
                    }
                    goto label_395;
                }
            }
        }
        catch(Exception exception0) {
            goto label_604;
        }
        goto label_594;
        try {
        label_361:
            byte[] arr_b25 = quf0.b.a;
            if(arr_b25 != null) {
                if(arr_b25.length >= 0x270) {
                    if(arr_b22.length > 1) {
                        fsbc4.b("Ending session due to a requested no tour sector data size exceeding a single byte during GET_DATA v2");
                        ibns0 = new ibns(qus.b, qum.i);
                        quf0 = this;
                        goto label_594;
                    }
                    byte b = arr_b22[0];
                    if(b <= 0 || b > 11) {
                        fsbc4.b("Ending session due to a requested no tour sector number exceeding possible bounds during GET_DATA v2");
                        ibns0 = new ibns(qus.b, qum.a);
                        quf0 = this;
                        goto label_594;
                    }
                    byte[] arr_b26 = ibpg.W(arr_b25, ibwt.q(b * 0x30, b * 0x30 + 0x30));
                    byte[] arr_b27 = ibpg.k(quv.b(qun.a, quo.a, 1, new byte[]{b}), quv.b(qun.a, quo.a, 2, arr_b26));
                    arr_b20 = ibpg.k(arr_b20, quv.b(qun.d, quo.b, 7, arr_b27));
                    quf0 = this;
                    goto label_326;
                }
                fsbc4.b("Ending session due to no tour data that was too short in length GET_DATA v2");
                ibns0 = new ibns(qus.b, qum.a);
                quf0 = this;
                goto label_594;
            }
            fsbc4.b("No tour data was unavailable when it was requested during a no tour sector request during GET_DATA v2");
            arr_b28 = ibpg.k(arr_b20, quv.b(qun.d, quo.a, 10, new byte[]{0, 0}));
            ibob6 = quj0.f;
        }
        catch(Exception exception0) {
            quf0 = this;
            goto label_604;
        }
        if(ibob6 == null) {
            ibod4 = null;
        }
        else {
            try {
                ibod4 = new ibod(ibob6.a & 0xFF);
            }
            catch(Exception exception0) {
                goto label_604;
            }
        }
        try {
            byte[] arr_b29 = quf0.e(((byte)v9), secretKeySpec0, arr_b28, ibod4, "an absence of no tour data during a no tour sector request during GET_DATA v2");
            if(arr_b29 == null) {
                fsbc4.b("Ending session due to a failure while concatenating response bytes during GET_DATA v2");
                ibns0 = new ibns(qus.b, qum.i);
                quf0 = this;
                goto label_594;
            }
            ibns0 = new ibns(ibpg.k(arr_b29, qus.a), null);
            quf0 = this;
            goto label_594;
        label_395:
            fsbc4.b("Ending session due to an unsupported data request being received during GET_DATA");
            ibns0 = new ibns(qus.b, qum.b);
        }
        catch(Exception exception0) {
            quf0 = this;
            goto label_604;
        }
        quf0 = this;
        goto label_594;
        try {
        label_398:
            if(arr_b22.length != 1) {
                fsbc4.b("Ending session due to a requested credential payload size differing from what was expected during GET_DATA v2");
                ibns0 = new ibns(qus.b, qum.i);
                goto label_594;
            }
            byte[] arr_b30 = quf0.b.b;
            if(arr_b22[0] != ((byte)arr_b30.length)) {
                fsbc4.b("Ending session due to a requested credential payload size differing from what was available during GET_DATA v2");
                ibns0 = new ibns(qus.b, qum.i);
                goto label_594;
            }
            arr_b20 = ibpg.k(arr_b20, quv.b(qun.d, quo.a, 3, arr_b30));
            goto label_326;
        label_409:
            if(quf0.m != 2) {
                fsbc4.b("A requested key not equal to NO_TOUR was previously requested during a no tour directory request during GET_DATA v2");
                byte[] arr_b31 = ibpg.k(arr_b20, quv.b(qun.d, quo.a, 10, new byte[]{0, 1}));
                ibob ibob7 = quj0.f;
                ibod ibod5 = ibob7 == null ? null : new ibod(ibob7.a & 0xFF);
                byte[] arr_b32 = quf0.e(((byte)v9), secretKeySpec0, arr_b31, ibod5, "an invalid requested key slot during a no tour directory request during GET_DATA v2");
                if(arr_b32 == null) {
                    fsbc4.b("Ending session due to a failure while concatenating response bytes during GET_DATA v2");
                    ibns0 = new ibns(qus.b, qum.i);
                    goto label_594;
                }
                ibns0 = new ibns(ibpg.k(arr_b32, qus.a), null);
                goto label_594;
            }
            byte[] arr_b33 = quf0.b.a;
            if(arr_b33 == null) {
                fsbc4.b("No tour data was unavailable when it was requested during a no tour directory request during GET_DATA v2");
                byte[] arr_b34 = ibpg.k(arr_b20, quv.b(qun.d, quo.a, 10, new byte[]{0, 0}));
                ibob ibob8 = quj0.f;
                ibod ibod6 = ibob8 == null ? null : new ibod(ibob8.a & 0xFF);
                byte[] arr_b35 = quf0.e(((byte)v9), secretKeySpec0, arr_b34, ibod6, "an absence of no tour data during a no tour directory request during GET_DATA v2");
                if(arr_b35 == null) {
                    fsbc4.b("Ending session due to a failure while concatenating response bytes during GET_DATA v2");
                    ibns0 = new ibns(qus.b, qum.i);
                    goto label_594;
                }
                ibns0 = new ibns(ibpg.k(arr_b35, qus.a), null);
                goto label_594;
            }
            if(arr_b33.length < 0x270) {
                fsbc4.b("Ending session due to no tour data that was too short in length GET_DATA v2");
                ibns0 = new ibns(qus.b, qum.a);
                goto label_594;
            }
            if(arr_b22.length == 0 || que.a(arr_b22[0] & 0xFF, 0x30) < 0) {
                fsbc4.b("Ending session due to a requested no tour data size differing from what was available or not having the required length during GET_DATA");
                ibns0 = new ibns(qus.b, qum.i);
                goto label_594;
            }
            byte[] arr_b36 = ibpg.W(arr_b33, ibwt.q(0, 0x30));
            if(arr_b22[0] != ((byte)arr_b36.length)) {
                fsbc4.b("Ending session due to a requested no tour data size differing from what was available during GET_DATA v2");
                ibns0 = new ibns(qus.b, qum.i);
                goto label_594;
            }
            arr_b20 = ibpg.k(arr_b20, quv.b(qun.d, quo.a, 5, arr_b36));
            goto label_326;
        label_455:
            fsbc5 = quf0.a;
            if(quj0.a != 4) {
                fsbc5.b("Class byte did not match value expected for a PUT_DATA command");
                ibns0 = new ibns(qus.b, qum.a);
            }
            else if(quj0.c != 0) {
                fsbc5.b("P1 was not the standard value for a PUT_DATA command");
                ibns0 = new ibns(qus.b, qum.a);
            }
            else if(quj0.d == 0) {
                byte[] arr_b37 = quj0.e;
                if(arr_b37 == null) {
                    fsbc5.b("No command payload was provided to a PUT_DATA command");
                    ibns0 = new ibns(qus.b, qum.a);
                }
                else {
                    secretKeySpec1 = quf0.j;
                    if(secretKeySpec1 == null) {
                        fsbc5.b("Ending session due to the absence of a session key from previous commands during PUT_DATA");
                        ibns0 = new ibns(qus.b, qum.i);
                    }
                    else if(arr_b37.length < 16) {
                        fsbc5.b("Ending session due to an encrypted command payload not containing enough data to process during PUT_DATA");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                    else {
                        int v12 = arr_b37.length - 16;
                        byte[] arr_b38 = ibpg.W(arr_b37, ibwt.q(0, v12));
                        byte[] arr_b39 = (byte[])qur.a(secretKeySpec1, arr_b38).a;
                        if(arr_b39 == null) {
                            fsbc5.b("Ending session due to error while attempting to verify CMAC integrity of incoming data during PUT_DATA");
                            ibns0 = new ibns(qus.b, qum.i);
                        }
                        else if(Arrays.equals(ibpg.W(arr_b37, ibwt.q(v12, arr_b37.length)), arr_b39)) {
                            byte[] arr_b40 = (byte[])quq.a(secretKeySpec1, arr_b38).a;
                            if(arr_b40 == null) {
                                fsbc5.b("Ending session due to error while attempting to decrypt incoming command payload during PUT_DATA");
                                ibns0 = new ibns(qus.b, qum.i);
                            }
                            else if(arr_b40.length < 8) {
                                fsbc5.b("Ending session due a decrypted command payload being too short to process during PUT_DATA");
                                ibns0 = new ibns(qus.b, qum.i);
                            }
                            else {
                                v13 = arr_b40[7];
                                qup qup1 = quv.a(ibpg.W(arr_b40, ibwt.q(8, arr_b40.length)));
                                if(qup1 == null) {
                                    fsbc5.b("Ending session due to error while checking the encrypted payload during PUT_DATA");
                                    ibns0 = new ibns(qus.b, qum.i);
                                }
                                else {
                                    arr_b41 = qup1.b;
                                    if(((byte)qup1.a) != -56) {
                                        goto label_574;
                                    }
                                    else if(quf0.m != 2) {
                                        fsbc5.b("Request key specified in previous APDU commands was not of the appropriate type during PUT_DATA");
                                        byte[] arr_b42 = quv.b(qun.d, quo.a, 9, new byte[]{0});
                                        ibob ibob9 = quj0.f;
                                        if(ibob9 == null) {
                                            v14 = v13;
                                            ibod7 = null;
                                        }
                                        else {
                                            v14 = v13;
                                            ibod7 = new ibod(ibob9.a & 0xFF);
                                        }
                                        byte[] arr_b43 = quf0.e(((byte)v14), secretKeySpec1, arr_b42, ibod7, "invalid key request type during a no tour directory request during PUT_DATA");
                                        if(arr_b43 == null) {
                                            fsbc5.b("Ending session due to a failure while concatenating response bytes during PUT_DATA");
                                            ibns0 = new ibns(qus.b, qum.i);
                                        }
                                        else {
                                            ibns0 = new ibns(ibpg.k(arr_b43, qus.a), null);
                                        }
                                    }
                                    else {
                                        goto label_527;
                                    }
                                }
                            }
                        }
                        else {
                            fsbc5.b("Could not verify the integrity of incoming data during PUT_DATA, payload may have been tampered with");
                            ibns0 = new ibns(qus.b, qum.i);
                        }
                    }
                }
            }
            else {
                fsbc5.b("P2 was not the standard value for a PUT_DATA command");
                ibns0 = new ibns(qus.b, qum.a);
            }
        }
        catch(Exception exception0) {
            goto label_604;
        }
        goto label_594;
        try {
        label_527:
            quk1 = quf0.b;
            arr_b44 = quk1.a;
        }
        catch(Exception exception0) {
            quf0 = this;
            goto label_604;
        }
        if(arr_b44 == null) {
            try {
                fsbc5.b("No Tour data was not present when attempting to update payloads during PUT_DATA");
                byte[] arr_b45 = quv.b(qun.d, quo.a, 9, new byte[]{0});
                ibob ibob10 = quj0.f;
                ibod ibod8 = ibob10 == null ? null : new ibod(ibob10.a & 0xFF);
                byte[] arr_b46 = quf0.e(((byte)v13), secretKeySpec1, arr_b45, ibod8, "a no tour directory request that was missing no tour data during PUT_DATA");
                if(arr_b46 == null) {
                    fsbc5.b("Ending session due to a failure while concatenating response bytes during PUT_DATA");
                    ibns0 = new ibns(qus.b, qum.i);
                }
                else {
                    ibns0 = new ibns(ibpg.k(arr_b46, qus.a), null);
                    goto label_594;
                label_544:
                    if(arr_b41.length == 0x30) {
                        int v15 = 0;
                        while(true) {
                            if(v15 >= 0x30) {
                                goto label_553;
                            }
                            arr_b44[v15] = arr_b41[v15];
                            ++v15;
                        }
                    }
                    else {
                        fsbc5.b("Ending session due to replacement no tour data being of an inappropriate size during PUT DATA");
                        ibns0 = new ibns(qus.b, qum.a);
                    }
                }
            }
            catch(Exception exception0) {
                goto label_604;
            }
        }
        else {
            goto label_544;
            try {
            label_553:
                quk1.a = arr_b44;
                String s = qut.a(arr_b44);
                JSONObject jSONObject0 = quf0.d.put("encryptedNoTourData", s);
                ibuq.e(jSONObject0, "put(...)");
                ibuq.f(jSONObject0, "cardPayload");
                quf0.l.c = jSONObject0;
                arr_b47 = quv.b(qun.d, quo.a, 9, new byte[]{1});
                ibob11 = quj0.f;
            }
            catch(Exception exception0) {
                quf0 = this;
                goto label_604;
            }
            if(ibob11 == null) {
                ibod10 = null;
            }
            else {
                try {
                    ibod9 = new ibod(ibob11.a & 0xFF);
                }
                catch(Exception exception0) {
                    goto label_604;
                }
                ibod10 = ibod9;
            }
            try {
                byte[] arr_b48 = quf0.e(((byte)v13), secretKeySpec1, arr_b47, ibod10, "successful no tour directory request during PUT_DATA");
                if(arr_b48 == null) {
                    fsbc5.b("Ending session due to a failure while concatenating response bytes during PUT_DATA");
                    ibns0 = new ibns(qus.b, qum.i);
                }
                else {
                    ibns0 = new ibns(ibpg.k(arr_b48, qus.a), null);
                }
                quf0 = this;
                goto label_594;
            label_574:
                fsbc5.b("Request type sent in with PUT_DATA was of an unrecognized type");
                arr_b49 = quv.b(qun.d, quo.a, 9, new byte[]{0});
                ibob ibob12 = quj0.f;
                ibod11 = ibob12 == null ? null : new ibod(ibob12.a & 0xFF);
                goto label_585;
            }
            catch(Exception exception0) {
                try {
                    quf0 = this;
                    goto label_604;
                label_585:
                    quf0 = this;
                    byte[] arr_b50 = quf0.e(((byte)v13), secretKeySpec1, arr_b49, ibod11, "invalid request type during PUT_DATA");
                    if(arr_b50 == null) {
                        fsbc5.b("Ending session due to a failure while concatenating response bytes during PUT_DATA");
                        ibns0 = new ibns(qus.b, qum.i);
                    }
                    else {
                        ibns0 = new ibns(ibpg.k(arr_b50, qus.b), qum.i);
                        goto label_594;
                    label_593:
                        ibns0 = quf0.d(quj0);
                    }
                label_594:
                    qum qum0 = (qum)ibns0.b;
                    if(qum0 != null) {
                        Objects.toString(qum0);
                        quf0.l.c(qum0);
                        quf0.c = true;
                    }
                    byte[] arr_b51 = (byte[])ibns0.a;
                    return arr_b51 == null ? qus.b : arr_b51;
                }
                catch(Exception exception0) {
                    goto label_604;
                }
            }
        }
        goto label_594;
    label_604:
        quf0.a.a("An Exception was encountered while attempting an operation", exception0);
        quf0.l.c(qum.i);
        quf0.c = true;
        return qus.b;
    }

    private final ibns c(quj quj0) {
        if(quj0.a == 0) {
            if(quj0.b == 0xFFFFFF82) {
                if(quj0.c == 0) {
                    if(quj0.d == 0) {
                        fsbc fsbc0 = this.a;
                        byte[] arr_b = quj0.e;
                        if(arr_b == null) {
                            fsbc0.b("No command payload was provided to the EXTERNAL_AUTH command");
                            return new ibns(qus.b, qum.a);
                        }
                        int v = this.m;
                        if(v == 0) {
                            fsbc0.b("Ending session due to an unknown requested key slot during EXTERNAL_AUTHENTICATE");
                            return new ibns(qus.b, qum.i);
                        }
                        SecretKey secretKey0 = v - 1 == 0 ? this.b.d : this.b.g;
                        if(secretKey0 == null) {
                            fsbc0.b("Ending session due to no key of the requested type existing during EXTERNAL_AUTHENTICATE");
                            return new ibns(qus.b, qum.i);
                        }
                        byte[] arr_b1 = (byte[])quq.a(secretKey0, arr_b).a;
                        if(arr_b1 == null) {
                            fsbc0.b("Decryption of command payload failed during EXTERNAL_AUTHENTICATE command processing");
                            return new ibns(qus.b, qum.a);
                        }
                        if(arr_b.length != arr_b1.length) {
                            fsbc0.b("Ending session due to nonce value being larger than provided command payload");
                            return new ibns(qus.b, qum.i);
                        }
                        byte[] arr_b2 = this.e;
                        byte[] arr_b3 = new byte[16];
                        for(int v1 = 0; v1 < 16; ++v1) {
                            arr_b3[v1] = (byte)(arr_b2[v1] ^ arr_b[v1]);
                        }
                        byte[] arr_b4 = ibpg.W(arr_b1, new ibwm(0, 15));
                        try {
                            if(MessageDigest.isEqual(arr_b4, arr_b2)) {
                                fsbc0.b("Ending session due to non unique nonce value passed in APDU command");
                                return new ibns(qus.b, qum.i);
                            }
                            if(MessageDigest.isEqual(ibpg.W(arr_b1, new ibwm(16, 0x1F)), arr_b3)) {
                                fsbc0.b("Ending session due to an invalid security check result");
                                return new ibns(qus.b, qum.i);
                            }
                            if(!MessageDigest.isEqual(ibpg.W(arr_b1, new ibwm(0x20, 0x2F)), this.h)) {
                                fsbc0.b("Ending session due to receiving a different random HCE Applet number than was sent in prior APDU steps");
                                return new ibns(qus.b, qum.i);
                            }
                            this.i = ibpg.W(arr_b1, new ibwm(16, 0x1F));
                        }
                        catch(Exception exception0) {
                            this.a.a("Slicing of command payload failed during EXTERNAL_AUTHENTICATE command processing", exception0);
                            return new ibns(qus.b, qum.i);
                        }
                        byte[] arr_b5 = ibpg.W(this.i, new ibwm(0, 3));
                        ibwm ibwm0 = new ibwm(4, 7);
                        byte[] arr_b6 = ibpg.k(ibpg.k(arr_b5, ibpg.W(this.h, ibwm0)), ibpg.W(this.i, new ibwm(8, 11)));
                        ibwm ibwm1 = new ibwm(12, 15);
                        this.j = new SecretKeySpec(ibpg.k(arr_b6, ibpg.W(this.h, ibwm1)), 0, 16, "AES");
                        new SecureRandom().nextBytes(this.f);
                        byte[] arr_b7 = (byte[])quq.b(secretKey0, ibpg.k(this.f, this.i)).a;
                        if(arr_b7 == null) {
                            this.a.b("Encryption of nonce and Allegion Reader Number failed during EXTERNAL_AUTHENTICATE command processing");
                            return new ibns(qus.b, qum.i);
                        }
                        if(quj0.f != null && que.a(arr_b7.length, quj0.f.a & 0xFF) > 0) {
                            this.a.b("Response generated during EXTERNAL_AUTHENTICATE exceeded maximum size indicated by LE byte");
                            return new ibns(qus.b, qum.a);
                        }
                        return new ibns(ibpg.k(arr_b7, qus.a), null);
                    }
                    this.a.b("P2 was not the standard value for EXTERNAL_AUTH command");
                    return new ibns(qus.b, qum.a);
                }
                this.a.b("P1 was not the standard value for EXTERNAL_AUTH command");
                return new ibns(qus.b, qum.a);
            }
            this.a.b("Instruction byte did not match value expected for EXTERNAL_AUTH command");
            return new ibns(qus.b, qum.a);
        }
        this.a.b("Class byte did not match value expected for EXTERNAL_AUTH command");
        return new ibns(qus.b, qum.a);
    }

    private final ibns d(quj quj0) {
        ibns ibns0;
        byte[] arr_b1;
        if(quj0.b == 0x20) {
            if(quj0.c == 0) {
                if(quj0.d == 0) {
                    fsbc fsbc0 = this.a;
                    byte[] arr_b = quj0.e;
                    if(arr_b == null) {
                        fsbc0.b("No command payload was provided to the VERIFY command");
                        return new ibns(qus.b, qum.a);
                    }
                    if(que.a(arr_b.length, 2) < 0) {
                        fsbc0.b("The command payload provided to the VERIFY command was not long enough for processing");
                        return new ibns(qus.b, qum.a);
                    }
                    SecretKeySpec secretKeySpec0 = this.j;
                    if(secretKeySpec0 == null) {
                        fsbc0.b("Ending session due to the absence of a session key from previous commands during VERIFY");
                        return new ibns(qus.b, qum.i);
                    }
                    ibod ibod0 = this.k;
                    if(ibod0 != null && ibod0.a == 1) {
                        if(quj0.a == 0) {
                            arr_b1 = arr_b;
                            goto label_40;
                        }
                        fsbc0.b("Class byte did not match value expected for VERIFY v1 command");
                        return new ibns(qus.b, qum.a);
                    }
                    if(ibod0 != null && ibod0.a == 2) {
                        if(quj0.a != 4) {
                            fsbc0.b("Class byte did not match value expected for VERIFY v2 command");
                            return new ibns(qus.b, qum.a);
                        }
                        int v = arr_b.length - 16;
                        byte[] arr_b2 = ibpg.W(arr_b, ibwt.q(0, v));
                        byte[] arr_b3 = (byte[])qur.a(secretKeySpec0, arr_b2).a;
                        if(arr_b3 == null) {
                            fsbc0.b("Ending session due to error while attempting to verify CMAC integrity of incoming data during VERIFY");
                            return new ibns(qus.b, qum.i);
                        }
                        if(!Arrays.equals(ibpg.W(arr_b, ibwt.q(v, arr_b.length)), arr_b3)) {
                            fsbc0.b("Could not verify the integrity of incoming data during VERIFY, payload may have been tampered with");
                            return new ibns(qus.b, qum.i);
                        }
                        byte[] arr_b4 = (byte[])quq.a(secretKeySpec0, arr_b2).a;
                        if(arr_b4 == null) {
                            fsbc0.b("Ending session due to error while attempting to decrypt incoming payload during VERIFY");
                            return new ibns(qus.b, qum.i);
                        }
                        arr_b1 = ibpg.W(arr_b4, ibwt.q(8, arr_b2.length));
                    label_40:
                        int v1 = arr_b1[0];
                        int v2 = arr_b1[1];
                        int v3 = 1;
                        while(v3 < v1) {
                            try {
                                ++v3;
                                ibuk ibuk0 = new ibuk(Integer.class);
                                if(ibuq.m(ibuk0, new ibuk(Byte.TYPE))) {
                                    ibns0 = new ibns(null, qul.t);
                                }
                                else if(ibuq.m(ibuk0, new ibuk(Integer.TYPE))) {
                                    Byte byte0 = ibpg.C(arr_b, v3);
                                    Integer integer0 = byte0 == null ? null : ((int)(((byte)byte0)));
                                    if(!(integer0 instanceof Integer)) {
                                        integer0 = null;
                                    }
                                    ibns0 = integer0 == null ? new ibns(null, qul.t) : new ibns(integer0, qul.a);
                                }
                                else if(ibuq.m(ibuk0, new ibuk(byte[].class))) {
                                    ibns0 = new ibns(null, qul.u);
                                }
                                else {
                                    ibns0 = new ibns(null, qul.s);
                                }
                            }
                            catch(IndexOutOfBoundsException unused_ex) {
                                ibns0 = new ibns(null, qul.t);
                            }
                            catch(Exception unused_ex) {
                                ibns0 = new ibns(null, qul.v);
                            }
                            Integer integer1 = (Integer)ibns0.a;
                            if(integer1 != null) {
                                v2 = v2 << 8 | ((int)integer1);
                                continue;
                            }
                            this.a.b("Ending session as a promised byte was not present in response code during VERIFY");
                            return new ibns(qus.b, qum.a);
                        }
                        switch(((byte)v2)) {
                            case 1: {
                                return new ibns(qus.a, qum.f);
                            }
                            case 4: {
                                this.a.b("Ending session due to failure response code during VERIFY");
                                ibod ibod1 = this.k;
                                if(ibod1 != null && ibod1.a == 1) {
                                    return new ibns(qus.b, qum.h);
                                }
                                return ibod1 == null || ibod1.a != 2 ? new ibns(qus.b, qum.h) : new ibns(qus.a, qum.h);
                            }
                            default: {
                                this.a.b("Ending session due to unknown response code during VERIFY");
                                return new ibns(qus.b, qum.i);
                            }
                        }
                    }
                    fsbc0.b("Ending session due to an unknown protocol version specification during VERIFY");
                    return new ibns(qus.b, qum.i);
                }
                this.a.b("P2 was not the standard value for a VERIFY command");
                return new ibns(qus.b, qum.a);
            }
            this.a.b("P1 was not the standard value for a VERIFY command");
            return new ibns(qus.b, qum.a);
        }
        this.a.b("Instruction byte did not match value expected for VERIFY command");
        return new ibns(qus.b, qum.a);
    }

    private final byte[] e(byte b, SecretKeySpec secretKeySpec0, byte[] arr_b, ibod ibod0, String s) {
        byte[] arr_b1 = new byte[7];
        new SecureRandom().nextBytes(arr_b1);
        byte[] arr_b2 = (byte[])quq.b(secretKeySpec0, ibpg.k(ibpg.k(arr_b1, new byte[]{((byte)(b + 1))}), arr_b)).a;
        if(arr_b2 == null) {
            this.a.b("Failed to encrypt a TLV response response during " + s);
            return null;
        }
        byte[] arr_b3 = (byte[])qur.a(secretKeySpec0, arr_b2).a;
        if(arr_b3 == null) {
            this.a.b("Failed while attempting to CMAC sign a response during " + s);
            return null;
        }
        byte[] arr_b4 = ibpg.k(arr_b2, arr_b3);
        if(ibod0 != null && que.a(arr_b4.length, ibod0.a) > 0) {
            this.a.b("Failing due to a response being larger than a provided LE byte during " + s);
            return null;
        }
        return arr_b4;
    }
}

