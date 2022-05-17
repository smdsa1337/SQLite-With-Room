package com.smdsa.sqlitewithroom.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.smdsa.sqlitewithroom.R
import com.smdsa.sqlitewithroom.databinding.FragmentWriteDataBinding
import com.smdsa.sqlitewithroom.sql.AppDatabase
import com.smdsa.sqlitewithroom.sql.User
import com.smdsa.sqlitewithroom.sql.UserDao

class WriteDataFragment : Fragment() {

    private lateinit var binding: FragmentWriteDataBinding
    private lateinit var userDao: UserDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWriteDataBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonWrite.setOnClickListener {
            if(binding.firstName.text.isNotEmpty() && binding.secondName.text.isNotEmpty()){
                val user = User(0,
                    binding.firstName.text.toString(),
                    binding.secondName.text.toString())
                val db = Room.databaseBuilder(
                    requireContext(),
                    AppDatabase::class.java,
                    "user_table"
                ).allowMainThreadQueries().build()
                db.userDao().addUser(user)
                Toast.makeText(activity, "Успешное добавление", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_writeDataFragment_to_menuFragment)
            }
            else{
                Toast.makeText(activity, "Какое-то поле пустое", Toast.LENGTH_SHORT).show()
            }
        }
    }
}