package com.chatgptlite.wanted.models

import java.util.*

data class ConversationModel(
    var id: String = Date().time.toString(),
    var title: String = "",
    var deviceId: String = "",
    var createdAt: Date = Date(),
)