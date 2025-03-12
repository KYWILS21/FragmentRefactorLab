package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class LabFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lab, container, false)
    }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                super.onViewCreated(view, savedInstanceState)
                val displayTextView = view.findViewById<TextView>(R.id.displayTextView)
                val nameEditText = view.findViewById<EditText>(R.id.nameEditText)
                val changeButton = view.findViewById<Button>(R.id.changeButton)

                changeButton.setOnClickListener {
                    val name = nameEditText.text

                    displayTextView.text = if (name.isNotBlank()) {
                        "Hello, $name!"
                    } else {
                        "Please enter your name"
                    }
                }
            }

        }
