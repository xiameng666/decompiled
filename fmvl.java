import android.content.Context;

public final class fmvl implements fmrd {
    public final Context a;
    public final iv b;
    public CharSequence c;
    public boolean d;

    public fmvl(Context context0) {
        this.a = context0;
        this.b = new fyju(context0);
        this.c = this.a();
    }

    public final String a() {
        return "This will only delete your copy of the conversation, and you will no longer be able to view these messages.";
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    public final void b() {
        if(this.d) {
            ((fyju)this.b).N(0x7F150D18);  // string:delete_conversation_title_with_cloud "Permanently delete this conversation?"
            ((fyju)this.b).C(0x7F150D14);  // string:delete_conversation_description_with_cloud "It will be deleted from your 
                                           // device and any backup."
            return;
        }
        ((fyju)this.b).N(0x7F150D17);  // string:delete_conversation_title "Delete this conversation?"
        ((fyju)this.b).D(this.c);
    }
}

