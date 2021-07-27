package qr.a.rooshen.hwkotlinlesson6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import qr.a.rooshen.hwkotlinlesson6.databinding.FragmentAuthorizationBinding
import kotlin.system.exitProcess


class AuthorizationFragment : Fragment() {

    private lateinit var binding: FragmentAuthorizationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthorizationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonBegin.setOnClickListener {
            (activity as? MainNavigation)?.openBasketFragment(binding.etPersonName.text.toString())
        }
    }
}