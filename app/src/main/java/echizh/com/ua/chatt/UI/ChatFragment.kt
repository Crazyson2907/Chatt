package echizh.com.ua.chatt.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.getstream.sdk.chat.viewmodel.messages.MessageListViewModel
import echizh.com.ua.chatt.R
import echizh.com.ua.chatt.databinding.FragmentChatBinding
import io.getstream.chat.android.ui.message.list.header.viewmodel.MessageListHeaderViewModel

class ChatFragment : Fragment() {
//    private val args: chatFragmentArgs by navArgs()

    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChatBinding.inflate(inflater, container, false)

        return binding.root
    }

//    private fun setupMessages(){
//        val factory = MessagesListViewModelFactory(cid= args.cchannelId)
//
//        val messageListHeaderViewModel: MessageListHeaderViewModel by viewModels { factory }
//        val messageListViewModel: MessageListViewModel by viewModels { factory }
//        val messageListViewModel: MessageListViewModel by viewModels { factory }
//    }

}