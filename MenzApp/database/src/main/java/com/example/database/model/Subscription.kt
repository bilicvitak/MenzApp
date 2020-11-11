package com.example.database.model

import java.sql.Timestamp

data class Subscription (
    var subscriptionId: String = "",
    var subscriberId: String = "",
    var subscribedToUser: String = "",
    var timestamp: Timestamp
)