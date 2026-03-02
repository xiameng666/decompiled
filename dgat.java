import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.RawContacts;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import com.google.android.gms.nearby.presence.identity.BroadcastCredential;
import com.google.android.gms.nearby.presence.identity.DiscoveryCredential;
import com.google.android.gms.nearby.presence.identity.EncryptedIdentityMetadata;
import com.google.android.gms.nearby.presence.identity.IdentityToken;
import com.google.android.gms.nearby.presence.identity.IdentityTokenTag;
import com.google.android.nearby.presence.rust.NpAdv;
import com.google.android.nearby.presence.rust.credential.V0BroadcastCredential;
import com.google.android.nearby.presence.rust.credential.V1BroadcastCredential;
import j..time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jeb.synthetic.TWR;

public final class dgat implements dawy {
    private static final byte[] a;
    private static final byte[] b;
    private final Context c;
    private final dasx d;
    private final List e;
    private final Map f;

    static {
        dgat.a = new byte[14];
        dgat.b = new byte[16];
    }

    public dgat(Context context0, dfsk dfsk0, dasx dasx0) {
        ArrayList arrayList0 = new ArrayList();
        this.e = arrayList0;
        this.f = new HashMap();
        this.c = context0;
        this.d = dasx0;
        byte[] arr_b = dgat.a;
        Arrays.fill(arr_b, 1);
        byte[] arr_b1 = dgat.b;
        Arrays.fill(arr_b1, 2);
        byte[] arr_b2 = new byte[0x20];
        Account account0 = dfsk0.c();
        if(account0 != null) {
            byte[] arr_b3 = account0.name.getBytes();
            System.arraycopy(arr_b3, 0, arr_b2, 0, Math.min(0x20, arr_b3.length));
        }
        arrayList0.add(new BroadcastCredential(arr_b2, dgat.g(), new IdentityToken(arr_b, arr_b1), Instant.now().minusSeconds(120L).toEpochMilli(), Instant.now().plusSeconds(120L).toEpochMilli(), 2L));
        context0.getContentResolver().registerContentObserver(ContactsContract.RawContacts.CONTENT_URI, true, new dgar(this));
        this.f();
    }

    @Override  // dawy
    public final dawp a() {
        return new dgas();
    }

    @Override  // dawy
    public final String b() {
        return "com.google.gms.nearby.fakeidentityprovider";
    }

    @Override  // dawy
    public final List c() {
        return this.e;
    }

    @Override  // dawy
    public final List d() {
        return new ArrayList(this.f.values());
    }

    @Override  // dawy
    public final void e() {
    }

    public final void f() {
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = cclu.b(this.c.getContentResolver(), "content://com.android.contacts/data/emails", null, null, null, null);
        if(cursor0 != null) {
            try {
                for(boolean z = cursor0.moveToFirst(); z; z = cursor0.moveToNext()) {
                    int v = cursor0.getColumnIndex("data1");
                    if(v != -1) {
                        String s = cursor0.getString(v);
                        if(s != null) {
                            arrayList0.add(s);
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
        if(cursor0 != null) {
            cursor0.close();
        }
        for(Object object0: arrayList0) {
            String s1 = (String)object0;
            Map map0 = this.f;
            if(!map0.containsKey(s1)) {
                String s2 = s1.substring(0, s1.lastIndexOf(0x40));
                String s3 = s2.substring(s2.lastIndexOf(46) + 1);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)heap.a).v_newBuilder();
                ByteString hfsf0 = ByteString.copyFrom(ghjc.f.q("AABBCCDDEEFF"));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((heap)hftv0).e = hfsf0;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s3.getClass();
                ((heap)hftv1).d = s3;
                heaq heaq0 = heaq.b;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                heap heap0 = (heap)hftp0.b_message;
                heap0.c = heaq0.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((heap)hftp0.b_message).f = 1;
                ByteString hfsf1 = ByteString.A("device_id");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((heap)hftp0.b_message).g = hfsf1;
                byte[] arr_b = ((heap)hftp0.N_build()).toBytesArray();
                byte[] arr_b1 = new byte[0x20];
                System.arraycopy(s1.getBytes(), 0, arr_b1, 0, Math.min(0x20, s1.getBytes().length));
                byte[] arr_b2 = dbae.j(arr_b, dgat.a, arr_b1);
                NpAdv npAdv0 = new NpAdv(null);
                byte[] arr_b3 = V0BroadcastCredential.a(npAdv0, new V0BroadcastCredential(arr_b1, dgat.a), arr_b);
                byte[] arr_b4 = V1BroadcastCredential.a(npAdv0, new V1BroadcastCredential(arr_b1, dgat.b), arr_b);
                byte[] arr_b5 = dbae.g(arr_b1, dgat.a);
                byte[] arr_b6 = dbae.f(arr_b1, dgat.b);
                byte[] arr_b7 = dbae.e(arr_b1, dgat.b);
                map0.put(s1, new DiscoveryCredential(arr_b1, dgat.g(), new IdentityTokenTag(arr_b5, arr_b6, arr_b7), new EncryptedIdentityMetadata(arr_b2, arr_b4, arr_b3), Instant.now().minusSeconds(120L).toEpochMilli(), Instant.now().plusSeconds(120L).toEpochMilli(), 2L));
                this.d.g("com.google.gms.nearby.fakeidentityprovider");
            }
        }
    }

    private static PresenceIdentity g() {
        return new PresenceIdentity(1, "com.google.gms.nearby.fakeidentityprovider");
    }
}

