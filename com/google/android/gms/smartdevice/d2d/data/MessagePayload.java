package com.google.android.gms.smartdevice.d2d.data;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bbgi;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakePayload;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import eqha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MessagePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR;
    public final Set a;
    public final int b;
    public int c;
    public BootstrapOptions d;
    public BootstrapConfigurations e;
    public DisplayText f;
    public AccountBootstrapPayload g;
    public ProgressEvent h;
    public boolean i;
    public ArrayList j;
    public AccountTransferPayload k;
    public DeviceStatus l;
    public WorkProfilePayload m;
    public ArrayList n;
    public BlockstorePayload o;
    public SecondDeviceAuthPayload p;
    public ArrayList q;
    public byte[] r;
    public StartServicePayload s;
    public QuickStartHandshakePayload t;
    public PostTransferAction u;
    private static final HashMap v;
    private int w;
    private boolean x;
    private boolean y;

    static {
        MessagePayload.CREATOR = new eqha();
        HashMap hashMap0 = new HashMap();
        MessagePayload.v = hashMap0;
        hashMap0.put("protocolVersion", new FastJsonResponse.Field(0, false, 0, false, "protocolVersion", 7, null));
        hashMap0.put("bootstrapState", new FastJsonResponse.Field(0, false, 0, false, "bootstrapState", 2, null));
        hashMap0.put("bootstrapOptions", new FastJsonResponse.Field(11, false, 11, false, "bootstrapOptions", 3, BootstrapOptions.class));
        hashMap0.put("bootstrapConfigurations", new FastJsonResponse.Field(11, false, 11, false, "bootstrapConfigurations", 4, BootstrapConfigurations.class));
        hashMap0.put("displayText", new FastJsonResponse.Field(11, false, 11, false, "displayText", 5, DisplayText.class));
        hashMap0.put("accountBootstrapPayload", new FastJsonResponse.Field(11, false, 11, false, "accountBootstrapPayload", 6, AccountBootstrapPayload.class));
        hashMap0.put("progressEvent", new FastJsonResponse.Field(11, false, 11, false, "progressEvent", 8, ProgressEvent.class));
        hashMap0.put("priorityMessage", new FastJsonResponse.Field(6, false, 6, false, "priorityMessage", 9, null));
        hashMap0.put("accountTransferResults", new FastJsonResponse.Field(11, true, 11, true, "accountTransferResults", 10, AccountTransferResult.class));
        hashMap0.put("accountTransferMsg", new FastJsonResponse.Field(11, false, 11, false, "accountTransferMsg", 11, AccountTransferPayload.class));
        hashMap0.put("deviceStatus", new FastJsonResponse.Field(11, false, 11, false, "deviceStatus", 12, DeviceStatus.class));
        hashMap0.put("workProfilePayload", new FastJsonResponse.Field(11, false, 11, false, "workProfilePayload", 13, WorkProfilePayload.class));
        hashMap0.put("esimActivationPayloads", new FastJsonResponse.Field(11, true, 11, true, "esimActivationPayloads", 14, EsimActivationPayload.class));
        hashMap0.put("blockstorePayload", new FastJsonResponse.Field(11, false, 11, false, "blockstorePayload", 15, BlockstorePayload.class));
        hashMap0.put("secondDeviceAuthPayload", new FastJsonResponse.Field(11, false, 11, false, "secondDeviceAuthPayload", 16, SecondDeviceAuthPayload.class));
        hashMap0.put("folsomDataPayload", new FastJsonResponse.Field(11, true, 11, true, "folsomDataPayload", 17, FolsomDataPayload.class));
        hashMap0.put("quickStartPayload", new FastJsonResponse.Field(8, false, 8, false, "quickStartPayload", 18, null));
        hashMap0.put("startServicePayload", new FastJsonResponse.Field(11, false, 11, false, "startServicePayload", 19, StartServicePayload.class));
        hashMap0.put("quickStartHandshakePayload", new FastJsonResponse.Field(11, false, 11, false, "quickStartHandshakePayload", 20, QuickStartHandshakePayload.class));
        hashMap0.put("PostTransferAction", new FastJsonResponse.Field(11, false, 11, false, "PostTransferAction", 21, PostTransferAction.class));
    }

    public MessagePayload() {
        this.c = 0;
        this.x = false;
        this.y = false;
        this.b = 3;
        HashSet hashSet0 = new HashSet();
        this.a = hashSet0;
        this.w = 3;
        hashSet0.add(Integer.valueOf(7));
    }

    public MessagePayload(Set set0, int v, int v1, int v2, BootstrapOptions bootstrapOptions0, BootstrapConfigurations bootstrapConfigurations0, DisplayText displayText0, AccountBootstrapPayload accountBootstrapPayload0, ProgressEvent progressEvent0, boolean z, ArrayList arrayList0, AccountTransferPayload accountTransferPayload0, DeviceStatus deviceStatus0, WorkProfilePayload workProfilePayload0, ArrayList arrayList1, BlockstorePayload blockstorePayload0, SecondDeviceAuthPayload secondDeviceAuthPayload0, ArrayList arrayList2, byte[] arr_b, StartServicePayload startServicePayload0, QuickStartHandshakePayload quickStartHandshakePayload0, PostTransferAction postTransferAction0) {
        this.x = false;
        this.y = false;
        this.a = set0;
        this.b = v;
        this.w = v1;
        this.c = v2;
        this.d = bootstrapOptions0;
        this.e = bootstrapConfigurations0;
        this.f = displayText0;
        this.g = accountBootstrapPayload0;
        this.h = progressEvent0;
        this.i = z;
        this.j = arrayList0;
        this.k = accountTransferPayload0;
        this.l = deviceStatus0;
        this.m = workProfilePayload0;
        this.n = arrayList1;
        this.o = blockstorePayload0;
        this.p = secondDeviceAuthPayload0;
        this.q = arrayList2;
        this.r = arr_b;
        this.s = startServicePayload0;
        this.t = quickStartHandshakePayload0;
        this.u = postTransferAction0;
    }

    @Override  // bbgi
    protected final Object a(FastJsonResponse.Field fastJsonResponse$Field0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 1: {
                return (int)this.b;
            }
            case 2: {
                return (int)this.c;
            }
            case 3: {
                return this.d;
            }
            case 4: {
                return this.e;
            }
            case 5: {
                return this.f;
            }
            case 6: {
                return this.g;
            }
            case 7: {
                return this.p();
            }
            case 8: {
                return this.h;
            }
            case 9: {
                return Boolean.valueOf(this.i);
            }
            case 10: {
                return this.j;
            }
            case 11: {
                return this.k;
            }
            case 12: {
                return this.l;
            }
            case 13: {
                return this.m;
            }
            case 14: {
                return this.n;
            }
            case 15: {
                return this.o;
            }
            case 16: {
                return this.p;
            }
            case 17: {
                return this.q;
            }
            case 18: {
                return this.r;
            }
            case 19: {
                return this.s;
            }
            case 20: {
                return this.t;
            }
            case 21: {
                return this.u;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + v);
            }
        }
    }

    public final void ai(String s) {
        this.f = new DisplayText(s);
        this.a.add(Integer.valueOf(5));
    }

    public final void aj(ArrayList arrayList0) {
        this.n = arrayList0;
        this.a.add(Integer.valueOf(14));
    }

    public final void ak(QuickStartHandshakePayload quickStartHandshakePayload0) {
        this.t = quickStartHandshakePayload0;
        this.a.add(Integer.valueOf(20));
    }

    public final void al(byte[] arr_b) {
        this.r = arr_b;
        this.a.add(Integer.valueOf(18));
    }

    public final void am(SecondDeviceAuthPayload secondDeviceAuthPayload0) {
        this.p = secondDeviceAuthPayload0;
        this.a.add(Integer.valueOf(16));
    }

    public final void an(StartServicePayload startServicePayload0) {
        this.s = startServicePayload0;
        this.a.add(Integer.valueOf(19));
    }

    public final void ao(WorkProfilePayload workProfilePayload0) {
        this.m = workProfilePayload0;
        this.a.add(Integer.valueOf(13));
    }

    public final void ap(ArrayList arrayList0) {
        this.q = arrayList0;
        this.a.add(Integer.valueOf(17));
    }

    @Override  // bbgi
    public final Map b() {
        return MessagePayload.v;
    }

    @Override  // bbgi
    protected final boolean e(FastJsonResponse.Field fastJsonResponse$Field0) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field0.g));
    }

    @Override  // bbgi
    public final void gE(FastJsonResponse.Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 10: {
                this.j = arrayList0;
                break;
            }
            case 14: {
                this.n = arrayList0;
                break;
            }
            case 17: {
                this.q = arrayList0;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", v, arrayList0.getClass().getCanonicalName()));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    public final void gF(FastJsonResponse.Field fastJsonResponse$Field0, String s, bbgi bbgi0) {
        this.x = true;
        int v = fastJsonResponse$Field0.g;
        switch(v) {
            case 3: {
                this.d = (BootstrapOptions)bbgi0;
                break;
            }
            case 4: {
                this.e = (BootstrapConfigurations)bbgi0;
                break;
            }
            case 5: {
                this.f = (DisplayText)bbgi0;
                break;
            }
            case 6: {
                this.g = (AccountBootstrapPayload)bbgi0;
                break;
            }
            case 8: {
                this.h = (ProgressEvent)bbgi0;
                break;
            }
            case 11: {
                this.k = (AccountTransferPayload)bbgi0;
                break;
            }
            case 12: {
                this.l = (DeviceStatus)bbgi0;
                break;
            }
            case 13: {
                this.m = (WorkProfilePayload)bbgi0;
                break;
            }
            case 15: {
                this.o = (BlockstorePayload)bbgi0;
                break;
            }
            case 16: {
                this.p = (SecondDeviceAuthPayload)bbgi0;
                break;
            }
            case 19: {
                this.s = (StartServicePayload)bbgi0;
                break;
            }
            case 20: {
                this.t = (QuickStartHandshakePayload)bbgi0;
                break;
            }
            case 21: {
                this.u = (PostTransferAction)bbgi0;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", v, bbgi0.getClass().getCanonicalName()));
            }
        }
        this.a.add(Integer.valueOf(v));
    }

    @Override  // bbgi
    protected final void gG(FastJsonResponse.Field fastJsonResponse$Field0, String s, int v) {
        this.x = true;
        int v1 = fastJsonResponse$Field0.g;
        switch(v1) {
            case 2: {
                this.c = v;
                break;
            }
            case 7: {
                this.w = v;
                this.y = true;
                break;
            }
            default: {
                throw new IllegalArgumentException(a.f(v1, "Field with id=", " is not known to be an int."));
            }
        }
        this.a.add(Integer.valueOf(v1));
    }

    @Override  // bbgi
    protected final void go(FastJsonResponse.Field fastJsonResponse$Field0, String s, byte[] arr_b) {
        int v = fastJsonResponse$Field0.g;
        if(v != 18) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a byte array"));
        }
        this.r = arr_b;
        this.a.add(Integer.valueOf(18));
    }

    @Override  // bbgi
    protected final void gp(FastJsonResponse.Field fastJsonResponse$Field0, String s, boolean z) {
        int v = fastJsonResponse$Field0.g;
        if(v != 9) {
            throw new IllegalArgumentException(a.f(v, "Field with id=", " is not known to be a boolean."));
        }
        this.i = z;
        this.a.add(Integer.valueOf(9));
    }

    public final int p() {
        return !this.x || this.y ? this.w : 0;
    }

    public final String q() {
        StringBuilder stringBuilder0 = new StringBuilder("MessagePayload[bootstrapState=");
        stringBuilder0.append(this.c);
        if(this.d != null) {
            stringBuilder0.append(" bootstrapOptions=ELIDED");
        }
        if(this.e != null) {
            stringBuilder0.append(" bootstrapConfigurations=ELIDED");
        }
        if(this.f != null) {
            stringBuilder0.append(" displayText=\"");
            stringBuilder0.append(this.f);
            stringBuilder0.append("\"");
        }
        if(this.g != null) {
            stringBuilder0.append(" accountBootstrapPayload=ELIDED");
        }
        if(this.h != null) {
            stringBuilder0.append(" progressEvent=");
            stringBuilder0.append(this.h);
        }
        if(this.k != null) {
            stringBuilder0.append(" accountTransferPayload=ELIDED");
        }
        if(this.j != null) {
            stringBuilder0.append(" accountTransferResults=ELIDED");
        }
        if(this.l != null) {
            stringBuilder0.append(" deviceStatus=");
            stringBuilder0.append(this.l);
        }
        if(this.m != null) {
            stringBuilder0.append(" workProfilePayload=ELIDED");
        }
        if(this.n != null) {
            stringBuilder0.append(" esimActivationPayloads=ELIDED");
        }
        if(this.o != null) {
            stringBuilder0.append(" blockstorePayload=ELIDED");
        }
        if(this.p != null) {
            stringBuilder0.append(" secondDeviceAuthPayload=ELIDED");
        }
        if(this.q != null) {
            stringBuilder0.append(" folsomDataPayload=ELIDED");
        }
        if(this.r != null) {
            stringBuilder0.append(" quickStartPayload=ELIDED");
        }
        if(this.s != null) {
            stringBuilder0.append(" startServicePayload=ELIDED");
        }
        if(this.t != null) {
            stringBuilder0.append(" quickStartHandShakePayload=ELIDED");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public final void r(AccountBootstrapPayload accountBootstrapPayload0) {
        this.g = accountBootstrapPayload0;
        this.a.add(Integer.valueOf(6));
    }

    public final void s(AccountTransferPayload accountTransferPayload0) {
        this.k = accountTransferPayload0;
        this.a.add(Integer.valueOf(11));
    }

    public final void t(ArrayList arrayList0) {
        this.j = arrayList0;
        this.a.add(Integer.valueOf(10));
    }

    public final void u(BlockstorePayload blockstorePayload0) {
        this.o = blockstorePayload0;
        this.a.add(Integer.valueOf(15));
    }

    public final void v(BootstrapConfigurations bootstrapConfigurations0) {
        this.e = bootstrapConfigurations0;
        this.a.add(Integer.valueOf(4));
    }

    public final void w(BootstrapOptions bootstrapOptions0) {
        this.d = bootstrapOptions0;
        this.a.add(Integer.valueOf(3));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Set set0 = this.a;
        int v1 = baub.a(parcel0);
        if(set0.contains(Integer.valueOf(1))) {
            baub.o(parcel0, 1, this.b);
        }
        if(set0.contains(Integer.valueOf(2))) {
            baub.o(parcel0, 2, this.c);
        }
        if(set0.contains(Integer.valueOf(3))) {
            baub.t(parcel0, 3, this.d, v, true);
        }
        if(set0.contains(Integer.valueOf(4))) {
            baub.t(parcel0, 4, this.e, v, true);
        }
        if(set0.contains(Integer.valueOf(5))) {
            baub.t(parcel0, 5, this.f, v, true);
        }
        if(set0.contains(Integer.valueOf(6))) {
            baub.t(parcel0, 6, this.g, v, true);
        }
        if(set0.contains(Integer.valueOf(7))) {
            baub.o(parcel0, 7, this.p());
        }
        if(set0.contains(Integer.valueOf(8))) {
            baub.t(parcel0, 8, this.h, v, true);
        }
        if(set0.contains(Integer.valueOf(9))) {
            baub.e(parcel0, 9, this.i);
        }
        if(set0.contains(Integer.valueOf(10))) {
            baub.y(parcel0, 10, this.j, true);
        }
        if(set0.contains(Integer.valueOf(11))) {
            baub.t(parcel0, 11, this.k, v, true);
        }
        if(set0.contains(Integer.valueOf(12))) {
            baub.t(parcel0, 12, this.l, v, true);
        }
        if(set0.contains(Integer.valueOf(13))) {
            baub.t(parcel0, 13, this.m, v, true);
        }
        if(set0.contains(Integer.valueOf(14))) {
            baub.y(parcel0, 14, this.n, true);
        }
        if(set0.contains(Integer.valueOf(15))) {
            baub.t(parcel0, 15, this.o, v, true);
        }
        if(set0.contains(Integer.valueOf(16))) {
            baub.t(parcel0, 16, this.p, v, true);
        }
        if(set0.contains(Integer.valueOf(17))) {
            baub.y(parcel0, 17, this.q, true);
        }
        if(set0.contains(Integer.valueOf(18))) {
            baub.i(parcel0, 18, this.r, true);
        }
        if(set0.contains(Integer.valueOf(19))) {
            baub.t(parcel0, 19, this.s, v, true);
        }
        if(set0.contains(Integer.valueOf(20))) {
            baub.t(parcel0, 20, this.t, v, true);
        }
        if(set0.contains(Integer.valueOf(21))) {
            baub.t(parcel0, 21, this.u, v, true);
        }
        baub.c(parcel0, v1);
    }

    public final void x(int v) {
        this.c = v;
        this.a.add(Integer.valueOf(2));
    }

    public final void y(DeviceStatus deviceStatus0) {
        this.l = deviceStatus0;
        this.a.add(Integer.valueOf(12));
    }
}

