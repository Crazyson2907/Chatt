package echizh.com.ua.chatt.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ChatUser (
    val firstName: String,
    val userName: String
) : Parcelable