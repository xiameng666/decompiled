package com.google.android.libraries.messaging.lighter.model;

public final class AutoOneOf_Notification_OneOfType.Impl_messageReceived extends AutoOneOf_Notification_OneOfType.Parent_ {
    private final MessageReceivedNotification a;

    public AutoOneOf_Notification_OneOfType.Impl_messageReceived(MessageReceivedNotification messageReceivedNotification0) {
        this.a = messageReceivedNotification0;
    }

    @Override  // com.google.android.libraries.messaging.lighter.model.AutoOneOf_Notification_OneOfType$Parent_
    public final MessageReceivedNotification a() {
        return this.a;
    }

    @Override  // com.google.android.libraries.messaging.lighter.model.Notification$OneOfType
    public final Notification.NotificationType b() {
        return Notification.NotificationType.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof Notification.OneOfType)) {
            Notification.NotificationType notification$NotificationType0 = ((Notification.OneOfType)object0).b();
            if(Notification.NotificationType.a == notification$NotificationType0) {
                MessageReceivedNotification messageReceivedNotification0 = ((Notification.OneOfType)object0).a();
                return this.a.equals(messageReceivedNotification0);
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
        return "OneOfType{messageReceived=" + this.a + "}";
    }
}

