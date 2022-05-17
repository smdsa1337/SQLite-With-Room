package com.smdsa.sqlitewithroom.fragments

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.room.Room
import com.google.android.material.snackbar.Snackbar
import com.smdsa.sqlitewithroom.adapters.RecycleViewAdapter
import com.smdsa.sqlitewithroom.databinding.FragmentReadDataBinding
import com.smdsa.sqlitewithroom.sql.AppDatabase
import com.smdsa.sqlitewithroom.sql.User

class ReadDataFragment : Fragment() {

    private lateinit var binding: FragmentReadDataBinding
    private lateinit var adapter: RecycleViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReadDataBinding.inflate(inflater)
        adapter = RecycleViewAdapter()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = Room.databaseBuilder(
            requireContext(),
            AppDatabase::class.java,
            "user_table"
        ).allowMainThreadQueries().build()
        db.userDao().readAllData().observe(viewLifecycleOwner, Observer {
            adapter.setData(it)
            adapter.setOnRecycleViewClick(object : RecycleViewAdapter.OnRecycleViewListener{
                override fun onRecycleViewClick(position: Int) {
                    AlertDialog.Builder(requireContext())
                        .setTitle("Внимание")
                        .setMessage("Вы хотите удалить эту информацию?")
                        .setPositiveButton("Да"){ _,_ ->
                        db.userDao().delete(it[position])
                    }.show()
                }
            })
        })
        binding.recycleView.adapter = adapter
    }
}