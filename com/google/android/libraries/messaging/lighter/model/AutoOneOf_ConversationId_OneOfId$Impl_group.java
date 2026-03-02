package com.google.android.libraries.messaging.lighter.model;

public final class AutoOneOf_ConversationId_OneOfId.Impl_group extends AutoOneOf_ConversationId_OneOfId.Parent_ {
    private final ConversationId.GroupId a;
    private static final long serialVersionUID;

    public AutoOneOf_ConversationId_OneOfId.Impl_group(ConversationId.GroupId conversationId$GroupId0) {
        this.a = conversationId$GroupId0;
    }

    @Override  // com.google.android.libraries.messaging.lighter.model.AutoOneOf_ConversationId_OneOfId$Parent_
    public final ConversationId.GroupId a() {
        return this.a;
    }

    @Override  // com.google.android.libraries.messaging.lighter.model.ConversationId$OneOfId
    public final ConversationId.IdType b() {
        return ConversationId.IdType.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof ConversationId.OneOfId)) {
            ConversationId.IdType conversationId$IdType0 = ((ConversationId.OneOfId)object0).b();
            if(ConversationId.IdType.b == conversationId$IdType0) {
                ConversationId.GroupId conversationId$GroupId0 = ((ConversationId.OneOfId)object0).a();
                return this.a.equals(conversationId$GroupId0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "OneOfId{group=" + this.a + "}";
    }
}

