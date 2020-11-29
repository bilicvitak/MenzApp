package hr.foi.air2003.menzapp.core.model

import com.google.firebase.firestore.DocumentId
import hr.foi.air2003.menzapp.core.other.QueryItem

data class Feedback(
        @DocumentId
        var feedbackId: String = "",
        var authorId: String = "",
        var recipientId: String = "",
        var mark: Int = 0,
        var feedback: String = ""
) : QueryItem<Feedback> {
        override val item: Feedback
                get() = this
        override val id: String
                get() = feedbackId
}