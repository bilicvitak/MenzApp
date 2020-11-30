package hr.foi.air2003.menzapp.ui

import androidx.lifecycle.ViewModel
import hr.foi.air2003.menzapp.core.Repository
import hr.foi.air2003.menzapp.core.livedata.*
import hr.foi.air2003.menzapp.core.model.User

class VisitedProfileViewModel : ViewModel() {
    private val repository = Repository()

    fun getUser(authorId: String) : UserLiveData{
        return repository.getUser(authorId)
    }

    fun getPosts(authorId: String) : PostQueryLiveData{
        return repository.getPostsByAuthor(authorId)
    }

    fun getFeedbacks(recipientId: String) : FeedbackQueryLiveData{
        return repository.getFeedbacksByRecipient(recipientId)
    }

    fun updateUser(user: User){
        repository.updateUser(user)
    }
}